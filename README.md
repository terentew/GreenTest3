# Project in Allure TestOps with manual & automated tests
<a target="_blank" href="https://jenkins.autotests.cloud/job/09-terentew-GreenTest1/allure/#">(https://jenkins.autotests.cloud/job/09-terentew-GreenTest1/allure/)</a> 

# Jenkins job
<a target="_blank" href="https://jenkins.autotests.cloud/job/09-terentew-GreenTest1">https://jenkins.autotests.cloud/job/09-terentew-GreenTest1</a>

# USAGE examples

### For run remote tests need fill remote.properties or to pass value:

* browser (default chrome)
* browserVersion (default 99.0)
* browserSize (default 1920x1080)
* browserMobileView (mobile device name, for example iPhone X)
* remoteDriverUrl (url address from selenoid or grid)
* videoStorage (url address where you should get video)
* threads (number of threads)


Run tests with filled remote.properties:
```bash
gradle clean test
```

Run tests with not filled remote.properties:
```bash
gradle clean -DremoteDriverUrl=https://%s:%s@selenoid.autotests.cloud/wd/hub/ -DvideoStorage=https://selenoid.autotests.cloud/video/ -Dthreads=1 test
```

Serve report:
```bash
allure serve build/allure-results
```



