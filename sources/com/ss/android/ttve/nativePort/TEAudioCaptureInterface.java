package com.ss.android.ttve.nativePort;

import X.EnumC63837P3p;
import X.IC8;
import X.InterfaceC63840P3s;
import X.InterfaceC63841P3t;
import android.os.Handler;
import com.bytedance.bpea.basics.Cert;
import com.ss.android.vesdk.VEAudioCaptureSettings;
import com.ss.android.vesdk.VEInfo;

/* loaded from: classes12.dex */
public class TEAudioCaptureInterface implements InterfaceC63841P3t {
    public InterfaceC63840P3s mCallback;
    public long mHandle;

    private native long nativeCreate(boolean z, boolean z2);

    private native int nativeDestroy(long j);

    private native int nativeInit(long j, int i, int i2, int i3, int i4);

    private native int nativeStart(long j);

    private native int nativeStop(long j);

    public void release() {
        release(null);
    }

    public void setAudioDevice(IC8 ic8) {
    }

    @Override // X.InterfaceC63841P3t
    public void setHandler(Handler handler) {
    }

    public int start() {
        return start(null);
    }

    public int stop() {
        return stop(null);
    }

    static {
        TENativeLibsLoader.loadRecorder();
    }

    @Override // X.InterfaceC63842P3u
    public int init(VEAudioCaptureSettings vEAudioCaptureSettings) {
        boolean z;
        if (TESystemUtils.getOutputAudioDeviceType() == EnumC63837P3p.WIRED.ordinal()) {
            z = true;
        } else {
            z = false;
        }
        long nativeCreate = nativeCreate(vEAudioCaptureSettings.isEnableSysKaraoke(), z);
        this.mHandle = nativeCreate;
        int nativeInit = nativeInit(nativeCreate, vEAudioCaptureSettings.getSampleRate(), vEAudioCaptureSettings.getChannel(), vEAudioCaptureSettings.getBitSamples(), vEAudioCaptureSettings.getFramesPerBuffer());
        InterfaceC63840P3s interfaceC63840P3s = this.mCallback;
        if (interfaceC63840P3s != null) {
            interfaceC63840P3s.LIZ(VEInfo.TE_INFO_RECORD_AUDIO_CAPTURE_INIT, nativeInit, vEAudioCaptureSettings);
        }
        return nativeInit;
    }

    @Override // X.InterfaceC63842P3u
    public void release(Cert cert) {
        nativeDestroy(this.mHandle);
        this.mHandle = 0L;
    }

    @Override // X.InterfaceC63841P3t
    public void setAudioCallback(InterfaceC63840P3s interfaceC63840P3s) {
        this.mCallback = interfaceC63840P3s;
    }

    @Override // X.InterfaceC63842P3u
    public int start(Cert cert) {
        int nativeStart = nativeStart(this.mHandle);
        InterfaceC63840P3s interfaceC63840P3s = this.mCallback;
        if (interfaceC63840P3s != null) {
            interfaceC63840P3s.LIZ(VEInfo.TE_INFO_RECORD_AUDIO_CAPTURE_START, nativeStart, "");
        }
        return nativeStart;
    }

    @Override // X.InterfaceC63842P3u
    public int stop(Cert cert) {
        return nativeStop(this.mHandle);
    }

    public void onNativeExtCallback(int i, int i2) {
        InterfaceC63840P3s interfaceC63840P3s = this.mCallback;
        if (interfaceC63840P3s != null) {
            int i3 = VEInfo.TE_ERROR_RECORD_AUDIO_CAPTURE;
            if (i == i3) {
                interfaceC63840P3s.onError(i3, i2, "");
            } else {
                interfaceC63840P3s.LIZ(i, i2, "");
            }
        }
    }
}
