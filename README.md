# Atlassian Plugin Test Console Enabler

Allows the Atlassian plugin test console to be used in Jira 6 and later, with QuickReload enabled and FastDev Console disabled.

## Overview

Thanks to [Christophe Merlotti](https://community.atlassian.com/t5/user/viewprofilepage/user-id/645660) for [this idea](https://community.atlassian.com/t5/Questions/Atlassian-Plugin-Test-Console-and-QuickReload/qaq-p/371152).

Jira 7 no longer supports the FastDev console - but you can still access it
if you know where to look. There's just one problem: when you try to invoke
any of the tests, the console tries to access a deleted REST API to reload
the tests plugin.

This little plugin replaces the deleted REST API with one that does nothing
(the invoked operation isn't needed because the Quick Reload feature will
have reloaded the plugin and its tests already). The console will then
execute the tests as requested.

To open the console, start the server with `atlas-debug` and point your 
browser at [http://localhost:2990/jira/plugins/servlet/it-test-console](http://localhost:2990/jira/plugins/servlet/it-test-console).

## Atlassian Plugin Information

Here are the SDK commands that can be used in this plugin's home folder:

* atlas-run   -- installs this plugin into the product and starts it on localhost
* atlas-debug -- same as atlas-run, but allows a debugger to attach at port 5005
* atlas-cli   -- after atlas-run or atlas-debug, opens a Maven command line window:
                 - 'pi' reinstalls the plugin into the running product instance
* atlas-help  -- prints description for all commands in the SDK

Full documentation is always available at:

https://developer.atlassian.com/display/DOCS/Introduction+to+the+Atlassian+Plugin+SDK
