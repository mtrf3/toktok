package X;

import android.view.View;
import com.bytedance.bpea.cert.token.TokenCert;
import kotlin.jvm.internal.o;

/* loaded from: classes15.dex */
public final class WJJ implements InterfaceC81972WFc {
    public final /* synthetic */ WID LIZ;

    @Override // X.InterfaceC81972WFc
    public final void LIZ(C81975WFf c81975WFf) {
    }

    @Override // X.InterfaceC81972WFc
    public final void LIZIZ(C81975WFf c81975WFf) {
    }

    @Override // X.InterfaceC81972WFc
    public final boolean LIZJ(C81975WFf c81975WFf) {
        return false;
    }

    public WJJ(WID wid) {
        this.LIZ = wid;
    }

    @Override // X.InterfaceC81972WFc
    public final void LIZLLL(View view, C81975WFf c81975WFf) {
        int i;
        o.LJIIIZ(view, "view");
        if (c81975WFf.LJLJJLL) {
            if (!C78605Ut7.LJFF("android.permission.RECORD_AUDIO")) {
                if (C53210KuU.LIZ()) {
                    WID wid = this.LIZ;
                    OHI ohi = OHI.LIZ;
                    ActivityC45651qj LIZ = wid.LIZ();
                    ohi.getClass();
                    C61099NyR.LIZIZ.LIZIZ(wid.LIZ(), TokenCert.Companion.with("bpea-request_audio_by_click_mic")).LIZ("android.permission.RECORD_AUDIO").LIZJ(new WJL(OHI.LJI(LIZ, "android.permission.RECORD_AUDIO"), wid));
                    return;
                }
                return;
            }
            if (V16.LJJJIL(this.LIZ.LJIILIIL())) {
                if (this.LIZ.LJIILIIL().cameraComponentModel.isMuted) {
                    C82098WJy.LIZ(this.LIZ.LJIILIIL(), "on");
                } else {
                    C82098WJy.LIZ(this.LIZ.LJIILIIL(), "off");
                }
            }
            if (this.LIZ.LJIILIIL().cameraComponentModel.isMuted) {
                i = 1;
            } else {
                i = 2;
            }
            C05L.LIZJ(i, this.LIZ.LIZJ());
        }
    }
}
