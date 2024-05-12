package com.lynx.tasm.behavior;

import com.lynx.react.bridge.ReadableArray;
import com.lynx.react.bridge.ReadableMap;

/* loaded from: classes15.dex */
public abstract class LayoutContext {
    public long LIZ;
    public boolean LIZIZ;

    private native void nativeTriggerLayout(long j);

    public abstract int createNode(int i, String str, ReadableMap readableMap, long j, ReadableArray readableArray, boolean z);

    public abstract void destroyNodes(int[] iArr);

    public abstract void dispatchOnLayout(int i, int i2, int i3, int i4, int i5);

    public abstract void dispatchOnLayoutBefore(int i);

    public abstract void dispatchOnLayoutFinish();

    public abstract Object getExtraBundle(int i);

    public abstract void insertNode(int i, int i2, int i3);

    public abstract void moveNode(int i, int i2, int i3, int i4);

    public abstract void removeNode(int i, int i2, int i3);

    public abstract void scheduleLayout();

    public abstract void setFontFaces(ReadableMap readableMap);

    public abstract void updateDataWithoutChange();

    public abstract void updateProps(int i, ReadableMap readableMap, ReadableArray readableArray);

    public final void LIZ() {
        long j = this.LIZ;
        if (j != 0) {
            nativeTriggerLayout(j);
        }
    }

    public void detachNativePtr() {
        this.LIZ = 0L;
    }

    public void attachNativePtr(long j) {
        this.LIZ = j;
    }
}
