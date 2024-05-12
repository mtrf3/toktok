package com.ss.android.medialib;

import com.ss.android.ttve.nativePort.TENativeLibsLoader;

/* loaded from: classes7.dex */
public class FFMpegInvoker {
    public native int addFastReverseVideo(String str, String str2);

    public native int stopReverseVideo();

    static {
        TENativeLibsLoader.loadRecorder();
    }
}
