package X;

import com.ss.android.ugc.playerkit.radar.SimRadar;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Stack;

/* renamed from: X.Ifl, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C47201Ifl implements IZ0, InterfaceC47234IgI {
    public C46539IOh LIZJ;
    public IWH LIZLLL;
    public List<IZ0> LIZ = new ArrayList();
    public List<InterfaceC47234IgI> LIZIZ = new ArrayList();
    public final Stack<String> LJI = new Stack<>();
    public C67942QlW LJFF = new C67942QlW(5);
    public C47209Ift LJ = new C47209Ift();

    @Override // X.IZ0
    public final /* synthetic */ InterfaceC46540IOi LJII() {
        return null;
    }

    @Override // X.IZ0
    public final void pause() {
        List<IZ0> list = this.LIZ;
        if (list == null) {
            return;
        }
        Iterator<IZ0> it = list.iterator();
        while (it.hasNext()) {
            it.next().pause();
        }
    }

    @Override // X.IZ0
    public final void release() {
        C47209Ift c47209Ift = this.LJ;
        if (c47209Ift != null) {
            c47209Ift.LIZJ = null;
            c47209Ift.LIZIZ.clear();
        }
        List<IZ0> list = this.LIZ;
        if (list == null) {
            return;
        }
        for (IZ0 iz0 : list) {
            iz0.release();
            if (iz0.LJII() != null) {
                this.LIZJ.LIZJ(iz0.LJII());
            }
        }
        this.LIZ.clear();
        this.LIZIZ.clear();
        this.LIZIZ = null;
        this.LIZ = null;
        this.LIZJ = null;
        this.LIZLLL = null;
        this.LJ = null;
        this.LJFF = null;
    }

    @Override // X.IZ0
    public final void resume() {
        List<IZ0> list = this.LIZ;
        if (list == null) {
            return;
        }
        Iterator it = ((ArrayList) list).iterator();
        while (it.hasNext()) {
            ((IZ0) it.next()).resume();
        }
    }

    @Override // X.IZ0
    public final void stop() {
        C46539IOh c46539IOh;
        List<IZ0> list = this.LIZ;
        if (list == null) {
            return;
        }
        for (IZ0 iz0 : list) {
            iz0.stop();
            if (iz0.LJII() != null && (c46539IOh = this.LIZJ) != null) {
                c46539IOh.LIZJ(iz0.LJII());
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x003a, code lost:
    
        if (r2 <= r0) goto L21;
     */
    @Override // X.IZ0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZ(X.InterfaceC46811IYt r7) {
        /*
            r6 = this;
            X.Ift r5 = r6.LJ
            if (r5 == 0) goto Lc
            java.util.List<X.IYt> r0 = r5.LIZIZ
            int r0 = r0.size()
            if (r0 != 0) goto L11
        Lc:
            java.util.List<X.IZ0> r0 = r6.LIZ
            if (r0 != 0) goto L49
            return
        L11:
            r4 = -1
            r3 = 0
            if (r7 == 0) goto L47
            r2 = 0
        L16:
            java.util.List<X.IYt> r0 = r5.LIZIZ
            int r0 = r0.size()
            if (r2 >= r0) goto L47
            java.util.List<X.IYt> r0 = r5.LIZIZ
            java.lang.Object r0 = com.bytedance.mt.protector.impl.collections.ListProtector.get(r0, r2)
            X.IYt r0 = (X.InterfaceC46811IYt) r0
            java.lang.String r1 = r0.getKey()
            java.lang.String r0 = r7.getKey()
            boolean r0 = android.text.TextUtils.equals(r1, r0)
            if (r0 == 0) goto L44
            if (r2 == r4) goto L3c
            int r0 = r5.LIZ
            if (r0 == r4) goto L3c
            if (r2 <= r0) goto L3d
        L3c:
            r3 = 1
        L3d:
            r5.LIZLLL = r3
            r5.LIZ = r2
            r5.LIZJ = r7
            goto Lc
        L44:
            int r2 = r2 + 1
            goto L16
        L47:
            r2 = -1
            goto L3c
        L49:
            java.util.ArrayList r0 = (java.util.ArrayList) r0
            java.util.Iterator r3 = r0.iterator()
        L4f:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L70
            java.lang.Object r2 = r3.next()
            X.IZ0 r2 = (X.IZ0) r2
            r2.LIZ(r7)
            X.IOi r0 = r2.LJII()
            if (r0 == 0) goto L4f
            X.IOh r1 = r6.LIZJ
            if (r1 == 0) goto L4f
            X.IOi r0 = r2.LJII()
            r1.LIZ(r0)
            goto L4f
        L70:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C47201Ifl.LIZ(X.IYt):void");
    }

    @Override // X.IZ0
    public final void LIZIZ(IZ2 iz2) {
        List<IZ0> list = this.LIZ;
        if (list == null) {
            return;
        }
        Iterator it = ((ArrayList) list).iterator();
        while (it.hasNext()) {
            ((IZ0) it.next()).LIZIZ(iz2);
        }
    }

    public final void LIZJ(AbstractC47210Ifu abstractC47210Ifu) {
        if (abstractC47210Ifu.LJIIJJI() && !((ArrayList) this.LIZ).contains(abstractC47210Ifu)) {
            SimRadar.keyScan("StrategyManager", "registerStrategy", C16880lQ.LJLLJ(abstractC47210Ifu.getClass()));
            abstractC47210Ifu.LJIIIIZZ(this.LIZLLL);
            abstractC47210Ifu.LIZLLL(this.LIZJ);
            C67942QlW c67942QlW = this.LJFF;
            abstractC47210Ifu.LIZIZ = c67942QlW;
            if (!((List) c67942QlW.LJLIL).contains(abstractC47210Ifu)) {
                ((List) c67942QlW.LJLIL).add(abstractC47210Ifu);
            }
            abstractC47210Ifu.LIZLLL = this.LJI;
            abstractC47210Ifu.LIZ = this.LJ;
            if (abstractC47210Ifu.LJIIJ() != null && !((ArrayList) this.LIZIZ).contains(abstractC47210Ifu.LJIIJ())) {
                ((ArrayList) this.LIZIZ).add(abstractC47210Ifu.LJIIJ());
            }
            ((ArrayList) this.LIZ).add(abstractC47210Ifu);
        }
    }

    @Override // X.IZ0
    public final void LJ(InterfaceC197787pW interfaceC197787pW) {
        List<IZ0> list = this.LIZ;
        if (list == null) {
            return;
        }
        Iterator it = ((ArrayList) list).iterator();
        while (it.hasNext()) {
            ((IZ0) it.next()).LJ(interfaceC197787pW);
        }
    }

    @Override // X.IZ0
    public final void LJFF(String str) {
        C47209Ift c47209Ift = this.LJ;
        if (c47209Ift != null) {
            if (str == null) {
                c47209Ift.getClass();
            } else {
                c47209Ift.LIZIZ.clear();
            }
        }
        List<IZ0> list = this.LIZ;
        if (list == null) {
            return;
        }
        Iterator it = ((ArrayList) list).iterator();
        while (it.hasNext()) {
            ((IZ0) it.next()).LJFF(str);
        }
    }

    @Override // X.IZ0
    public final void LJI(String str, List<InterfaceC46811IYt> list) {
        C47209Ift c47209Ift = this.LJ;
        if (c47209Ift != null && str != null && list.size() != 0) {
            c47209Ift.LIZ = -1;
            c47209Ift.LIZIZ.clear();
            c47209Ift.LIZIZ.addAll(list);
        }
        List<IZ0> list2 = this.LIZ;
        if (list2 == null) {
            return;
        }
        Iterator it = ((ArrayList) list2).iterator();
        while (it.hasNext()) {
            ((IZ0) it.next()).LJI(str, list);
        }
    }

    public C47201Ifl(IZ1 iz1, IWH iwh, C46539IOh c46539IOh) {
        this.LIZJ = c46539IOh;
        this.LIZLLL = iwh;
        LIZJ(new C46817IYz());
        LIZJ(new C47214Ify(c46539IOh));
        LIZJ(new C47198Ifi(iz1));
        LIZJ(new C47205Ifp(iz1));
        LIZJ(new C46815IYx());
        LIZJ(new C47203Ifn());
    }
}
