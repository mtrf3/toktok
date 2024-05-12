package X;

import com.ss.android.ugc.aweme.profile.model.User;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArraySet;
import kotlin.jvm.internal.o;

/* renamed from: X.4ZG, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C4ZG extends QXX implements LEA {
    public static final C4ZG LJLIL;
    public static final C62822Ol8 LJLILLLLZI;

    public C4ZG() {
        super((Object) null);
    }

    static {
        C4ZG c4zg = new C4ZG();
        LJLIL = c4zg;
        LJLILLLLZI = C221108m2.LIZIZ(C4ZK.LJLIL);
        HG3.LJIIL();
        HG3.LJLJL.LJIILJJIL(c4zg);
    }

    public static final String LLLLZLLIL() {
        if (C66952QPk.LIZ) {
            C66953QPl c66953QPl = C66953QPl.LJZL;
            if (C66953QPl.LLD) {
                return c66953QPl.LJLJJI;
            }
            return c66953QPl.LJZI.LIZIZ("X-Tt-Token");
        }
        return null;
    }

    public static final C4ZM LLLLZIL() {
        User LIZJ = C80763Ey.LIZJ();
        if (LIZJ != null) {
            C4ZM c4zm = new C4ZM();
            c4zm.LIZ = LIZJ.getUid();
            c4zm.LIZIZ = LIZJ.getSecUid();
            return c4zm;
        }
        return null;
    }

    @Override // X.QXX
    public final String LLJILLL() {
        return C80763Ey.LIZIZ();
    }

    public static final void LLLLZ(C4K3 c4k3) {
        ((CopyOnWriteArraySet) LJLILLLLZI.getValue()).add(c4k3);
    }

    @Override // X.LEA
    public final void onAccountResult(int i, boolean z, int i2, User user) {
        String str;
        String str2;
        C4ZA c4za;
        C4ZM c4zm;
        C114834f1 c114834f1 = C114834f1.LIZ;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("onAccountResult: ");
        LIZ.append(i);
        LIZ.append(", ");
        LIZ.append(z);
        LIZ.append(", ");
        LIZ.append(0);
        LIZ.append(", ");
        if (user != null) {
            str = user.getUid();
        } else {
            str = null;
        }
        LIZ.append(str);
        LIZ.append(", ");
        if (user != null) {
            str2 = user.getSecUid();
        } else {
            str2 = null;
        }
        LIZ.append(str2);
        c114834f1.i("AccountDependService", X1D.LIZIZ(LIZ));
        if (!z) {
            return;
        }
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    c4za = C4ZA.UNKNOWN;
                } else {
                    c4za = C4ZA.LOGOUT;
                }
            } else {
                c4za = C4ZA.SWITCH;
            }
        } else {
            c4za = C4ZA.LOGIN;
        }
        if (user == null) {
            user = C80763Ey.LIZJ();
        }
        Iterator it = ((CopyOnWriteArraySet) LJLILLLLZI.getValue()).iterator();
        while (it.hasNext()) {
            C4K3 c4k3 = (C4K3) it.next();
            if (user != null) {
                c4zm = new C4ZM();
                c4zm.LIZ = user.getUid();
                c4zm.LIZIZ = user.getSecUid();
            } else {
                c4zm = null;
            }
            c4k3.LJFF(c4za, c4zm);
        }
        if (C115204fc.LIZ() && c4za == C4ZA.LOGIN) {
            C34B.LIZIZ("GlobalActionExecutor", "invokeOnLoginActions");
            C3Y2 c3y2 = new C3Y2("on_login");
            C3VM c3vm = C115114fT.LJI;
            if (c3vm != null) {
                c3vm.LIZIZ(c3y2, false);
            }
            List LIZJ = ((C169706lK) C115114fT.LIZLLL.getValue()).LIZJ();
            o.LJIIIIZZ(LIZJ, "onLoginActionList.immutableList");
            Iterator it2 = LIZJ.iterator();
            while (it2.hasNext()) {
                ((C3VL) it2.next()).LJLIL.invoke();
            }
            C3VM c3vm2 = C115114fT.LJI;
            if (c3vm2 != null) {
                c3vm2.LIZ(c3y2, C46B.LIZLLL);
            }
        }
    }
}
