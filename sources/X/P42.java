package X;

import com.ss.android.vesdk.VEInfo;
import com.ss.android.vesdk.audio.VEAudioSample;

/* loaded from: classes12.dex */
public final class P42 implements InterfaceC63840P3s {
    public final /* synthetic */ P43 LIZ;

    public P42(P43 p43) {
        this.LIZ = p43;
    }

    @Override // X.InterfaceC63840P3s
    public final void onReceive(VEAudioSample vEAudioSample) {
        P4E p4e = this.LIZ.LJ;
        if (p4e != null) {
            p4e.onReceive(vEAudioSample);
        }
    }

    @Override // X.InterfaceC63840P3s
    public final void LIZ(int i, int i2, Object obj) {
        if (i == VEInfo.TE_INFO_RECORD_AUDIO_CAPTURE_INIT && i2 != 0 && this.LIZ.LJIIIZ > 0) {
            return;
        }
        P4E p4e = this.LIZ.LJ;
        if (p4e != null) {
            p4e.LIZ(i, i2, obj);
        }
        if (i == VEInfo.TE_ERROR_RECORD_AUDIO_CAPTURE) {
            C63868P4u.LJ(0, i2, "te_record_audio_mic_running_err");
        }
    }

    @Override // X.InterfaceC63840P3s
    public final void onError(int i, int i2, String str) {
        P4E p4e = this.LIZ.LJ;
        if (p4e != null) {
            p4e.onError(i, i2, "");
        }
    }
}
