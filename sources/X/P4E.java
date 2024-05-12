package X;

import com.bytedance.android.livesdk.livesetting.linkmic.LivesdkLinkmicFloatWindowOptimizeSetting;
import com.ss.android.vesdk.VEAudioCapture;
import com.ss.android.vesdk.audio.VEAudioSample;

/* loaded from: classes12.dex */
public final class P4E implements InterfaceC63840P3s {
    public final /* synthetic */ VEAudioCapture LIZ;

    public P4E(VEAudioCapture vEAudioCapture) {
        this.LIZ = vEAudioCapture;
    }

    @Override // X.InterfaceC63840P3s
    public final void onReceive(VEAudioSample vEAudioSample) {
        for (P4F p4f : this.LIZ.mCaptureListeners.LIZJ()) {
            if (p4f == null) {
                P4Q.LIZJ("VEAudioCapture", "onReceive error listener is null");
            } else {
                p4f.onReceive(vEAudioSample);
            }
        }
    }

    @Override // X.InterfaceC63840P3s
    public final void LIZ(int i, int i2, Object obj) {
        for (P4F p4f : this.LIZ.mCaptureListeners.LIZJ()) {
            if (p4f == null) {
                P4Q.LIZJ("VEAudioCapture", "onInfo error listener is null");
            } else {
                p4f.onInfo(i, i2, LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX, obj);
            }
        }
    }

    @Override // X.InterfaceC63840P3s
    public final void onError(int i, int i2, String str) {
        for (P4F p4f : this.LIZ.mCaptureListeners.LIZJ()) {
            if (p4f == null) {
                P4Q.LIZJ("VEAudioCapture", "onError error listener is null");
            } else {
                p4f.onError(i, i2, str);
            }
        }
    }
}
