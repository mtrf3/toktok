package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import kotlin.jvm.internal.o;

/* renamed from: X.J7o, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C48652J7o implements InterfaceC84737XNl {
    public IDP LJLIL;

    public final IDP LIZ() {
        IDP idp = this.LJLIL;
        if (idp != null) {
            return idp;
        }
        o.LJIJI("playerController");
        throw null;
    }

    @Override // X.InterfaceC84737XNl
    public final void LJIIL(C48651J7n c48651J7n) {
        String str;
        Aweme LJJIIZI = LIZ().LJJIIZI();
        Aweme LJJLIIJ = LIZ().LJJLIIJ();
        IDR LJJJ = LIZ().LJJJ();
        if (LJJJ != null) {
            str = LJJJ.getEnterFrom(true);
        } else {
            str = null;
        }
        if (LJJIIZI != null && LJJLIIJ != null && str != null) {
            C47541IlF.LJI(LJJIIZI, LJJLIIJ, str, "click_audio_next");
        }
        C47541IlF.LIZIZ = true;
        XKX.LIZLLL(C48841JEv.LIZ(C36636EZk.LIZ), null, null, new C48793JCz(this, null), 3);
    }

    @Override // X.InterfaceC84737XNl
    public final void LJJ(C48651J7n c48651J7n) {
        String str;
        LIZ();
        Aweme LJLLI = LIZ().LJLLI();
        Aweme LJJIIZI = LIZ().LJJIIZI();
        IDR LJJJ = LIZ().LJJJ();
        if (LJJJ != null) {
            str = LJJJ.getEnterFrom(true);
        } else {
            str = null;
        }
        if (LJLLI != null && LJJIIZI != null && str != null) {
            C47541IlF.LJI(LJLLI, LJJIIZI, str, "click_audio_previous");
        }
        C47541IlF.LIZIZ = true;
        LIZ();
        XKX.LIZLLL(C48841JEv.LIZ(C36636EZk.LIZ), null, null, new C48792JCy(this, null), 3);
    }
}
