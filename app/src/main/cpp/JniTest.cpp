#include <jni.h>
#include <string>
#include <android/log.h>

extern "C" JNIEXPORT jstring JNICALL
Java_com_nanguiyu_jnitest_JniTest_stringFromJNI(
        JNIEnv *env,
        jobject /* this */) {

    jstring jstr;
    std::string hello = "Hello from C++";
    for(int i = 0;i<100000;i++) {
        jstr = env->NewStringUTF("Hello from C++");
        __android_log_print(ANDROID_LOG_DEBUG,"Test","%d",i);
        env->DeleteLocalRef(jstr);
    }
    return env->NewStringUTF(hello.c_str());
}
