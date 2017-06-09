# MVP

App based on Material Design + MVP + Rxjava + Retrofit + Okhttp + Glide

The project is based on the idea of simplicity, make development more simple, extract the core library, can be directly introduced to fast development. Project is still in improvement, if you have good suggestions or find any problems welcome[issue],  If it help you welcome star, fork. This project only do study and communication

## Points
* Use Rxjava Retrofit2 okhttp to do network requests and caching
* RxUtil is used to encapsulate thread handling and network request result processing
* Use the RxManager to manage the subscription lifecycle
* Use RxBus to do intercomponent communication
* Use RxPermissions for android6.0 permission application
* Use Material Design controls and animations
* Use the MVP architecture throughout the project, and extract the core as a library, import core can save 50% of the code development
* Use Glide for image processing and loading
* Use Fragmentation to simplify the operation of Fragment and lazy loading
* Day and night mode switching
* Add image selector(High imitation WeChat) and expression keyboard (support dynamic expression and emoji expressions, etc.)
* Encapsulates recyclerview and recyclerviewpager to implement pull-down refresh, pull-up loading and pagerview functionality（Just a few simple code to achieve a variety of lists, no adapter required, no need to design paging load）
* Use x5WebView to do the reading page
* The head of the daily home page can scroll in circles（Using the rxjava round robin and recyclerviewpager）

## Method of use

### Import the core library
```
dependencies {
    compile 'com.hpw.mvpframe:core:1.0.0'
}
```  

## TODO
1. Add aop
2. Continue to optimize
3. There are many to do。。。

