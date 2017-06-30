import jenkins.model.*
import hudson.model.*
import com.hp.application.automation.tools.model.OctaneServerSettingsModel
import com.hp.application.automation.tools.settings.OctaneServerSettingsBuilder

def secret = hudson.util.Secret.fromString("[ALM Octane Client secret]")
def model = new OctaneServerSettingsModel("[Location]", "[ALM Octane Client ID]", secret, "[impersonated Jenkins user]")
Hudson.getInstance().getDescriptorByType(OctaneServerSettingsBuilder.OctaneDescriptorImpl.class).setModel(model)
