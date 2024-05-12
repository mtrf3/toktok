package com.ss.ugc.android.davinciresource.jni;

/* loaded from: classes16.dex */
public class DAVCreator {
    public transient boolean swigCMemOwn;
    public transient long swigCPtr;

    public synchronized void delete() {
        long j = this.swigCPtr;
        if (j != 0) {
            if (this.swigCMemOwn) {
                this.swigCMemOwn = false;
                DavinciResourceJniJNI.delete_DAVCreator(j);
            }
            this.swigCPtr = 0L;
        }
    }

    public DAVCreator() {
        this(DavinciResourceJniJNI.new_DAVCreator(), true);
    }

    public static DAVResourceManager createDefaultResourceManager() {
        long DAVCreator_createDefaultResourceManager = DavinciResourceJniJNI.DAVCreator_createDefaultResourceManager();
        if (DAVCreator_createDefaultResourceManager == 0) {
            return null;
        }
        return new DAVResourceManager(DAVCreator_createDefaultResourceManager, true);
    }

    public static DAVResourceTaskManager createDefaultTaskManager() {
        long DAVCreator_createDefaultTaskManager = DavinciResourceJniJNI.DAVCreator_createDefaultTaskManager();
        if (DAVCreator_createDefaultTaskManager == 0) {
            return null;
        }
        return new DAVResourceTaskManager(DAVCreator_createDefaultTaskManager, true);
    }

    public void finalize() {
        delete();
    }

    public static long getCPtr(DAVCreator dAVCreator) {
        if (dAVCreator == null) {
            return 0L;
        }
        return dAVCreator.swigCPtr;
    }

    public DAVCreator(long j, boolean z) {
        this.swigCMemOwn = z;
        this.swigCPtr = j;
    }
}
