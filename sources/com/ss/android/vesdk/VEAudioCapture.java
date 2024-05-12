package com.ss.android.vesdk;

import X.C03880Dg;
import X.C169706lK;
import X.C39519Ff9;
import X.C65300Pk0;
import X.IC8;
import X.InterfaceC63842P3u;
import X.P43;
import X.P4E;
import X.P4F;
import X.P4G;
import X.P4Q;
import com.bytedance.bpea.basics.Cert;
import com.ss.android.vesdk.VEAudioCaptureSettings;

/* loaded from: classes12.dex */
public class VEAudioCapture implements InterfaceC63842P3u {
    public P43 audioRecord;
    public C169706lK<P4F> mCaptureListeners = new C169706lK<>();
    public P4G mAudioDeviceListener = null;

    public static int com_ss_android_vesdk_VEAudioCapture_com_ss_android_vesdk_VEAudioCapture_start(VEAudioCapture vEAudioCapture, Cert cert) {
        C39519Ff9 LIZJ = new C03880Dg(2).LIZJ(100850, "com/ss/android/vesdk/VEAudioCapture", "start", vEAudioCapture, new Object[]{cert}, "int", new C65300Pk0(false, "(Lcom/bytedance/bpea/basics/Cert;)I", "4423339528947245732"));
        return LIZJ.LIZ ? ((Integer) LIZJ.LIZIZ).intValue() : vEAudioCapture.start(cert);
    }

    public static boolean isSupportEarBack(IC8 ic8) {
        return false;
    }

    public void release() {
        release(null);
    }

    public int start() {
        return com_ss_android_vesdk_VEAudioCapture_com_ss_android_vesdk_VEAudioCapture_start(this, null);
    }

    public int stop() {
        return stop(null);
    }

    public void clean() {
        this.mCaptureListeners.LIZIZ();
    }

    public int getMicState() {
        return this.audioRecord.LIZ;
    }

    public void onBackGround() {
        this.audioRecord.LIZIZ = true;
    }

    public void onForeGround() {
        this.audioRecord.LIZIZ = false;
    }

    public VEAudioCapture() {
        P43 p43 = new P43();
        this.audioRecord = p43;
        p43.LJ = new P4E(this);
    }

    public boolean addCaptureListener(P4F p4f) {
        if (p4f == null) {
            P4Q.LIZJ("VEAudioCapture", "addCaptureListener error listener is null!!!");
            return false;
        }
        return this.mCaptureListeners.LIZ(p4f);
    }

    @Override // X.InterfaceC63842P3u
    public int init(VEAudioCaptureSettings vEAudioCaptureSettings) {
        VEAudioCaptureSettings.Builder builder = new VEAudioCaptureSettings.Builder(vEAudioCaptureSettings);
        builder.setAudioSource(VEConfigCenter.getInstance().getValue("ve_audio_source_type", 1));
        this.audioRecord.init(builder.build());
        return 0;
    }

    @Override // X.InterfaceC63842P3u
    public void release(Cert cert) {
        this.audioRecord.release(cert);
    }

    public boolean removeCaptureListener(P4F p4f) {
        return this.mCaptureListeners.LJ(p4f);
    }

    public void setAudioDevice(IC8 ic8) {
        if (ic8 == null) {
            return;
        }
        this.audioRecord.LJIILJJIL = ic8;
        P4G p4g = this.mAudioDeviceListener;
        if (p4g != null) {
            p4g.LIZ(ic8.LIZ);
        }
    }

    public void setAudioDeviceChangeListener(P4G p4g) {
        this.mAudioDeviceListener = p4g;
    }

    @Override // X.InterfaceC63842P3u
    public int start(Cert cert) {
        return this.audioRecord.start(cert);
    }

    @Override // X.InterfaceC63842P3u
    public int stop(Cert cert) {
        return this.audioRecord.stop(cert);
    }
}
