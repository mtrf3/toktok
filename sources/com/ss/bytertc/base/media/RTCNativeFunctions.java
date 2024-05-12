package com.ss.bytertc.base.media;

/* loaded from: classes33.dex */
public final class RTCNativeFunctions {
    public static native void nativeNotifyChoreographerDoFrame(long j, Object obj, String str);

    public static native void nativeNotifySurfaceAvailable(long j, Object obj, String str, boolean z, boolean z2);

    public static native void nativeNotifySurfaceDestroyed(long j, Object obj, String str, boolean z, boolean z2);

    public static native void nativeNotifySurfaceSizeChanged(long j, String str, boolean z);

    public static native void nativeNotifyVSyncDoFrame(long j, String str);
}
