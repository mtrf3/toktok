package X;

import Y.ARunnableS37S0100000_1;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AqS145S0200000_14;
import kotlin.jvm.internal.o;

/* renamed from: X.Vz7, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C81525Vz7 implements InterfaceC81531VzD {
    public static final /* synthetic */ int LJII = 0;
    public InterfaceC81526Vz8 LIZIZ;
    public EnumC79770VSk LIZJ;
    public HashMap<String, HashMap<String, Object>> LIZLLL;
    public C45440HsS LJ;
    public final List<InterfaceC81526Vz8> LIZ = new ArrayList();
    public final C81524Vz6 LJFF = new C81524Vz6();
    public final List<InterfaceC88472Yns<Boolean, C76800UCe>> LJI = new ArrayList();

    @Override // X.InterfaceC81531VzD
    public final synchronized void LIZ() {
        LIZJ();
    }

    public final synchronized void LIZJ() {
        try {
            C81524Vz6 c81524Vz6 = this.LJFF;
            List<InterfaceC88472Yns<Boolean, C76800UCe>> showTopNoticeBarUnits = this.LJI;
            c81524Vz6.getClass();
            o.LJIIIZ(showTopNoticeBarUnits, "showTopNoticeBarUnits");
            try {
                c81524Vz6.LIZIZ.set(false);
                C1DH.LJJIJIIJI(new ARunnableS37S0100000_1(showTopNoticeBarUnits, 83));
                C3C5.m7constructorimpl(C76800UCe.LIZ);
            } catch (Throwable th) {
                C3C5.m7constructorimpl(C141335gf.LIZ(th));
            }
            C3C5.m7constructorimpl(C76800UCe.LIZ);
        } catch (Throwable th2) {
            C3C5.m7constructorimpl(C141335gf.LIZ(th2));
        }
        try {
            this.LIZIZ = null;
            this.LIZLLL = null;
            this.LIZJ = null;
            C45440HsS c45440HsS = this.LJ;
            if (c45440HsS != null) {
                c45440HsS.LIZ();
            }
            this.LJ = null;
            Iterator it = ((ArrayList) this.LIZ).iterator();
            while (it.hasNext()) {
                ((InterfaceC81526Vz8) it.next()).destroy();
            }
            ((ArrayList) this.LIZ).clear();
            C3C5.m7constructorimpl(C76800UCe.LIZ);
        } catch (Throwable th3) {
            C3C5.m7constructorimpl(C141335gf.LIZ(th3));
        }
    }

    public final synchronized void LIZLLL() {
        C76800UCe c76800UCe;
        try {
        } finally {
        }
        if (!C1DH.LJIL()) {
            return;
        }
        if (!this.LJFF.LIZ(true)) {
            return;
        }
        if (!LXW.LIZ() && !LXW.LIZIZ()) {
            return;
        }
        EnumC79770VSk enumC79770VSk = this.LIZJ;
        if (enumC79770VSk != null) {
            int i = C79771VSl.LIZ[enumC79770VSk.ordinal()];
            if (i != 1 && i != 2) {
                if (i == 3 && this.LJFF.LIZIZ(this.LIZJ, this.LIZLLL)) {
                    LJ();
                }
            } else {
                this.LJFF.LIZIZ(this.LIZJ, this.LIZLLL);
            }
            c76800UCe = C76800UCe.LIZ;
        } else {
            c76800UCe = null;
        }
        C3C5.m7constructorimpl(c76800UCe);
    }

    public final synchronized void LJ() {
        Integer num;
        if (!C1DH.LJIL()) {
            return;
        }
        if (this.LJ != null) {
            return;
        }
        if (this.LIZJ == null) {
            return;
        }
        InterfaceC81526Vz8 interfaceC81526Vz8 = this.LIZIZ;
        if (interfaceC81526Vz8 != null) {
            num = Integer.valueOf(interfaceC81526Vz8.hashCode());
        } else {
            num = null;
        }
        C45440HsS c45440HsS = new C45440HsS();
        c45440HsS.LIZIZ(DU8.LIZ, new AqS145S0200000_14(this, num, 32));
        this.LJ = c45440HsS;
    }

    @Override // X.InterfaceC81531VzD
    public final synchronized void LIZIZ(AbstractC81528VzA requestDetectInterceptor, EnumC79770VSk networkState, HashMap detailMap) {
        o.LJIIIZ(requestDetectInterceptor, "requestDetectInterceptor");
        o.LJIIIZ(networkState, "networkState");
        o.LJIIIZ(detailMap, "detailMap");
        if (!C1DH.LJIL()) {
            return;
        }
        if (o.LJ(this.LIZIZ, requestDetectInterceptor) && this.LIZJ == null) {
            this.LIZJ = networkState;
            this.LIZLLL = detailMap;
            if (LXW.LIZIZ() || LXW.LIZ()) {
                LIZLLL();
            }
        }
    }
}
