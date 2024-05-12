package com.ss.ttlivestreamer.core.utils;

/* loaded from: classes12.dex */
public class ExceptionTracer extends Throwable {
    public static void onJniException(Object obj) {
        if (obj != null && (obj instanceof Throwable)) {
            Throwable th = (Throwable) obj;
            AVLog.logKibana(7, "Exception", "Jni Exception", th);
            AVLog.ioe("Exception", "Jni Exception", th);
        }
    }
}
