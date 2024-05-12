package com.ss.android.ttve.nativePort;

import com.ss.android.vesdk.VEMixAudioListener;

/* loaded from: classes8.dex */
public class TEAudioUtilsCallback {
    public VEMixAudioListener listener;

    public void onProgressChanged(double d) {
        VEMixAudioListener vEMixAudioListener = this.listener;
        if (vEMixAudioListener != null) {
            vEMixAudioListener.onProgressChanged(d);
        }
    }

    public void setListener(Object obj) {
        this.listener = (VEMixAudioListener) obj;
    }
}
