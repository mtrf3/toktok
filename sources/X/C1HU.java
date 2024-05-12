package X;

import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.internal.IDqS1S0301000;
import kotlin.jvm.internal.IDqS28S0300000;
import kotlin.jvm.internal.o;

/* renamed from: X.1HU, reason: invalid class name */
/* loaded from: classes.dex */
public final class C1HU implements C0MC {
    public static final C1HY LIZLLL = C0MJ.LIZ(C47701u2.LJLIL, C47691u1.LJLIL);
    public final java.util.Map<Object, java.util.Map<String, List<Object>>> LIZ;
    public final java.util.Map<Object, C0ME> LIZIZ;
    public C0MG LIZJ;

    public C1HU() {
        this(0);
    }

    public C1HU(java.util.Map<Object, java.util.Map<String, List<Object>>> savedStates) {
        o.LJIIIZ(savedStates, "savedStates");
        this.LIZ = savedStates;
        this.LIZIZ = new LinkedHashMap();
    }

    @Override // X.C0MC
    public final void LJ(Object key) {
        o.LJIIIZ(key, "key");
        C0ME c0me = (C0ME) ((LinkedHashMap) this.LIZIZ).get(key);
        if (c0me != null) {
            c0me.LIZIZ = false;
        } else {
            this.LIZ.remove(key);
        }
    }

    public /* synthetic */ C1HU(int i) {
        this(new LinkedHashMap());
    }

    @Override // X.C0MC
    public final void LIZIZ(Object key, InterfaceC88471Ynr<? super InterfaceC24520xk, ? super Integer, C76800UCe> content, InterfaceC24520xk interfaceC24520xk, int i) {
        o.LJIIIZ(key, "key");
        o.LJIIIZ(content, "content");
        C35931b3 LJIL = interfaceC24520xk.LJIL(-1198538093);
        LJIL.LJJIIJ(444418301);
        LJIL.LIZJ(key);
        LJIL.LJJIIJ(-642722479);
        LJIL.LJJIIJ(-492369756);
        Object LJJJZ = LJIL.LJJJZ();
        InterfaceC24520xk.LIZ.getClass();
        if (LJJJZ == C24500xi.LIZIZ) {
            C0MG c0mg = this.LIZJ;
            if (c0mg == null || c0mg.LIZ(key)) {
                LJJJZ = new C0ME(this, key);
                LJIL.LJLJLLL(LJJJZ);
            } else {
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("Type of the key ");
                LIZ.append(key);
                LIZ.append(" is not supported. On Android you can only use types which can be stored inside the Bundle.");
                String LIZIZ = X1D.LIZIZ(LIZ);
                LIZIZ.toString();
                throw new IllegalArgumentException(LIZIZ);
            }
        }
        LJIL.LJJJJJ(false);
        C0ME c0me = (C0ME) LJJJZ;
        C24410xZ.LIZ(new C24620xu[]{C0MH.LIZ.LIZIZ(c0me.LIZJ)}, content, LJIL, (i & 112) | 8);
        C24610xt.LIZIZ(C76800UCe.LIZ, new IDqS28S0300000(c0me, this, key, 8), LJIL);
        LJIL.LJJJJJ(false);
        LJIL.LJIILJJIL();
        LJIL.LJJJJJ(false);
        C35991b9 LJJJJLI = LJIL.LJJJJLI();
        if (LJJJJLI == null) {
            return;
        }
        LJJJJLI.LIZLLL = new IDqS1S0301000(this, (C1HU) key, (Object) content, (InterfaceC88471Ynr<? super InterfaceC24520xk, ? super Integer, C76800UCe>) i, 3);
    }
}
