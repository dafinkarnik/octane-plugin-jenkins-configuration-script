# octane-plugin-jenkins-configuration
Post-initialization script for Jenkins to configure ALM Octane plugin integration used in DevOps use cases.
The HP Application Automation Tools plugin used by Jenkins should have Location, user name and email fields set.
 
Location: http://<ALM Octane hostname / IP address> {:<port number>}/ui/?p=<shared space ID>
Client ID: ALM Octane user name
Client secret: ALM Octane user password
Jenkins user: Jenkins user that ALM Octane will use to execute jobs on the server