package X;

import com.bytedance.keva.Keva;
import kotlin.jvm.internal.o;

/* renamed from: X.3Fy, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C81023Fy implements C4K3 {
    public static final C81023Fy LJLIL = new C81023Fy();
    public static Keva LJLILLLLZI;

    public final synchronized Keva LIZ() {
        Keva keva;
        keva = LJLILLLLZI;
        if (keva == null) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("share_status_repo");
            LIZ.append(((RBX) HG3.LJIILL()).getCurUserId());
            keva = Keva.getRepo(X1D.LIZIZ(LIZ));
            LJLILLLLZI = keva;
            o.LJIIIIZZ(keva, "getRepo(KEVA_REPO + curUid()).also { repo = it }");
        }
        return keva;
    }

    public final synchronized void LIZIZ(int i, String str) {
        LIZ().storeInt(str, i);
    }

    @Override // X.C4K3
    public final void LJFF(C4ZA type, C4ZM c4zm) {
        o.LJIIIZ(type, "type");
        if (type == C4ZA.SWITCH) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("share_status_repo");
            LIZ.append(((RBX) HG3.LJIILL()).getCurUserId());
            LJLILLLLZI = Keva.getRepo(X1D.LIZIZ(LIZ));
        }
    }
}
