# RxViperReflectionBug
Demonstrates unit tests crash using RxViper Android library. 

Just clone the project and run any unit test in `SpaceMapPresenterTest`.
Test crashes on access to any method of view or router.

``` Java
Caused by: java.lang.IllegalAccessException: Class com.dzaitsev.rxviper.NullObject can not access a member of class com.osemenov.rxviperreflectionbug.SpaceMapRouter with modifiers "public abstract"
	at sun.reflect.Reflection.ensureMemberAccess(Reflection.java:102)
	at java.lang.reflect.AccessibleObject.slowCheckMemberAccess(AccessibleObject.java:296)
	at java.lang.reflect.AccessibleObject.checkAccess(AccessibleObject.java:288)
	at java.lang.reflect.Method.invoke(Method.java:491)
	at com.dzaitsev.rxviper.NullObject.invoke(NullObject.java:39)
	... 31 more
  ```
