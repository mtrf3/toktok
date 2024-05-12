package X;

import com.bytedance.android.livesdk.livesetting.pullstream.LiveNetAdaptiveHurryTimeSetting;
import java.util.Objects;

/* renamed from: X.WYb, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C82465WYb implements InterfaceC63875P5b {
    public int LIZ;
    public final /* synthetic */ C82494WZe LIZIZ;

    public C82465WYb(C82494WZe c82494WZe) {
        this.LIZIZ = c82494WZe;
    }

    @Override // X.InterfaceC63875P5b
    public final void LIZ(int i) {
    }

    @Override // X.InterfaceC63875P5b
    public final void LIZIZ(int i, byte[] bArr) {
        int i2 = this.LIZ;
        this.LIZ = i2 + 1;
        int i3 = 20;
        if (i2 % 20 == 0) {
            C61897OQz c61897OQz = new C61897OQz(bArr);
            if (c61897OQz.LIZJ() <= 20) {
                i3 = c61897OQz.LIZJ() - 1;
            }
            Objects.toString(c61897OQz.subList(0, i3));
        }
        C82494WZe c82494WZe = this.LIZIZ;
        if (!c82494WZe.LJLJJI) {
            return;
        }
        c82494WZe.LJLJJL.invoke(bArr);
    }

    @Override // X.InterfaceC63875P5b
    public final void onError(int i, int i2, String str) {
        C145995oB LIZIZ = GFJ.LIZIZ(2, "calling_event_index");
        LIZIZ.LJI("error_code", String.valueOf(i2 + LiveNetAdaptiveHurryTimeSetting.DEFAULT));
        LIZIZ.LJI("error_msg", "mic_failed");
        StringBuilder LIZ = X1D.LIZ();
        C1EU.LIZJ(LIZ, "errType=", i, ", ret=", i2);
        LIZ.append(", msg=");
        LIZ.append(str);
        LIZIZ.LJI("net_error_msg", X1D.LIZIZ(LIZ));
        LIZIZ.LJI("debug_vc_scene", "preview_record");
        FMX.LJIIL("audio_vc_stream_event", LIZIZ.LIZ);
    }
}
