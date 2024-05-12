package com.bef.effectsdk.algorithm;

import android.graphics.Bitmap;
import com.bef.effectsdk.ResourceFinder;

/* loaded from: classes.dex */
public class RectDocDet {
    public ResourceFinder mFinder;
    public long mFinderHandle;
    public long mNativeHandle;

    private native long nativeCreate();

    private native int nativeDestroy(long j);

    private native int nativeInit(long j, long j2, int i);

    private native int nativeInitWithPath(long j, String str, int i);

    private native RectDocDetResult nativeProcess(long j, Bitmap bitmap, int i);

    private native int nativeSetParamF(long j, int i, float f);

    private boolean isFinderHandleValid() {
        if (0 != this.mFinderHandle) {
            return true;
        }
        return false;
    }

    private boolean isNativeHandleValid() {
        if (0 != this.mNativeHandle) {
            return true;
        }
        return false;
    }

    public boolean create() {
        this.mNativeHandle = nativeCreate();
        return isNativeHandleValid();
    }

    public void destroy() {
        if (isNativeHandleValid()) {
            nativeDestroy(this.mNativeHandle);
            this.mNativeHandle = 0L;
        }
        if (this.mFinder != null && isFinderHandleValid()) {
            this.mFinder.release(this.mFinderHandle);
            this.mFinderHandle = 0L;
        }
    }

    public boolean init(ResourceFinder resourceFinder, int i) {
        if (resourceFinder == null || !isNativeHandleValid()) {
            return false;
        }
        this.mFinder = resourceFinder;
        this.mFinderHandle = resourceFinder.createNativeResourceFinder(this.mNativeHandle);
        if (!isFinderHandleValid()) {
            destroy();
            return false;
        }
        if (nativeInit(this.mNativeHandle, this.mFinderHandle, i) != 0) {
            return false;
        }
        return true;
    }

    public boolean initWithPath(String str, int i) {
        if (str == null || str.length() == 0 || !isNativeHandleValid() || nativeInitWithPath(this.mNativeHandle, str, i) != 0) {
            return false;
        }
        return true;
    }

    public RectDocDetResult process(Bitmap bitmap, int i) {
        if (!isNativeHandleValid() || bitmap == null) {
            return new RectDocDetResult();
        }
        return nativeProcess(this.mNativeHandle, bitmap, i);
    }

    public boolean setParamF(int i, float f) {
        if (!isNativeHandleValid() || nativeSetParamF(this.mNativeHandle, i, f) != 0) {
            return false;
        }
        return true;
    }
}
