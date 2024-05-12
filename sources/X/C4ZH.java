package X;

import com.bytedance.keva.Keva;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;
import kotlin.jvm.internal.o;

/* renamed from: X.4ZH, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C4ZH implements C4K3 {
    public static final C4ZH LJLIL = new C4ZH();
    public static final C62822Ol8 LJLILLLLZI = C221108m2.LIZIZ(C4ZJ.LJLIL);

    public static boolean LIZIZ() {
        C4ZL.LIZ();
        if (C78685UuP.LJJJZ(C4ZG.LLLLZLLIL()) || C78685UuP.LJJJZ(C4ZI.LIZ())) {
            return true;
        }
        return false;
    }

    public final String LIZ() {
        C4ZL.LIZ();
        if (!C80763Ey.LIZLLL()) {
            C4ZL.LIZJ();
            C114834f1.LIZ.i("TokenManager", "getToken not login");
            return "";
        }
        C4ZL.LIZ();
        if (AV1.LJIILLIIL()) {
            C4ZL.LIZJ();
            C114834f1.LIZ.i("TokenManager", "doFetchTask forbid by ftc");
            return "";
        }
        C4ZL.LIZ();
        String LIZ = C4ZI.LIZ();
        C4ZL.LIZ();
        String LLLLZLLIL = C4ZG.LLLLZLLIL();
        if (LLLLZLLIL == null || LLLLZLLIL.length() == 0) {
            return LIZ;
        }
        LIZJ(LLLLZLLIL, LIZ);
        C4ZL.LIZJ();
        C114834f1 c114834f1 = C114834f1.LIZ;
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("getToken: Using TikTok-Token: ");
        LIZ2.append(LLLLZLLIL);
        c114834f1.i("TokenManager", X1D.LIZIZ(LIZ2));
        return LLLLZLLIL;
    }

    public static final void LIZJ(String str, String str2) {
        String str3;
        if (!o.LJ(str, str2)) {
            Keva repo = Keva.getRepo("ies_im_core");
            if (str == null) {
                str3 = "";
            } else {
                str3 = str;
            }
            repo.storeString("token", str3);
            Iterator it = ((CopyOnWriteArraySet) LJLILLLLZI.getValue()).iterator();
            while (it.hasNext()) {
                ((C4ZO) it.next()).LJ(str2, str);
            }
        }
        C4ZL.LIZJ();
        C114834f1.LIZ.i("TokenManager", C0ON.LIZJ("updateLocalToken: ", str2, ", ", str));
    }

    @Override // X.C4K3
    public final void LJFF(C4ZA type, C4ZM c4zm) {
        String str;
        o.LJIIIZ(type, "type");
        C4ZL.LIZJ();
        C114834f1 c114834f1 = C114834f1.LIZ;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("onAccountChange: ");
        LIZ.append(type);
        LIZ.append(", ");
        if (c4zm != null) {
            str = c4zm.LIZ;
        } else {
            str = null;
        }
        LIZ.append(str);
        c114834f1.i("TokenManager", X1D.LIZIZ(LIZ));
        String str2 = "";
        if (type == C4ZA.SWITCH) {
            Keva.getRepo("ies_im_core").storeString("token", "");
            str2 = LIZ();
        }
        LIZJ(str2, C4ZI.LIZ());
    }
}
