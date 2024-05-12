package X;

import android.os.Trace;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import kotlin.jvm.internal.IDqS11S0101000;
import kotlin.jvm.internal.IDqS16S0101000;
import kotlin.jvm.internal.IDqS180S0200000;
import kotlin.jvm.internal.IDqS189S0200000;
import kotlin.jvm.internal.IDqS35S0300000;
import kotlin.jvm.internal.IDqS425S0100000;
import kotlin.jvm.internal.IDqS4S0201000;
import kotlin.jvm.internal.o;

/* renamed from: X.1b3, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C35931b3 implements InterfaceC24520xk {
    public final InterfaceC24420xa<?> LIZIZ;
    public final AbstractC24810yD LIZJ;
    public final C35871ax LIZLLL;
    public final java.util.Set<InterfaceC24390xX> LJ;
    public List<InterfaceC88473Ynt<InterfaceC24420xa<?>, C24570xp, InterfaceC24350xT, C76800UCe>> LJFF;
    public final List<InterfaceC88473Ynt<InterfaceC24420xa<?>, C24570xp, InterfaceC24350xT, C76800UCe>> LJI;
    public final InterfaceC35841au LJII;
    public final C24740y6 LJIIIIZZ;
    public C24530xl LJIIIZ;
    public int LJIIJ;
    public final C24660xy LJIIJJI;
    public int LJIIL;
    public final C24660xy LJIILIIL;
    public int[] LJIILJJIL;
    public HashMap<Integer, Integer> LJIILL;
    public boolean LJIILLIIL;
    public boolean LJIIZILJ;
    public final List<C24670xz> LJIJ;
    public final C24660xy LJIJI;
    public InterfaceC37431dT<AbstractC24370xV<Object>, ? extends InterfaceC24760y8<? extends Object>> LJIJJ;
    public final HashMap<Integer, InterfaceC37431dT<AbstractC24370xV<Object>, InterfaceC24760y8<Object>>> LJIJJLI;
    public boolean LJIL;
    public final C24660xy LJJ;
    public boolean LJJI;
    public int LJJIFFI;
    public int LJJII;
    public int LJJIII;
    public final C24740y6 LJJIIJ;
    public boolean LJJIIJZLJL;
    public C24450xd LJJIIZ;
    public C35871ax LJJIIZI;
    public C24570xp LJJIJ;
    public boolean LJJIJIIJI;
    public InterfaceC37431dT<AbstractC24370xV<Object>, ? extends InterfaceC24760y8<? extends Object>> LJJIJIIJIL;
    public List<InterfaceC88473Ynt<InterfaceC24420xa<?>, C24570xp, InterfaceC24350xT, C76800UCe>> LJJIJIL;
    public C24400xY LJJIJL;
    public final List<InterfaceC88473Ynt<InterfaceC24420xa<?>, C24570xp, InterfaceC24350xT, C76800UCe>> LJJIJLIJ;
    public boolean LJJIL;
    public int LJJIZ;
    public int LJJJ;
    public final C24740y6 LJJJI;
    public int LJJJIL;
    public boolean LJJJJ;
    public boolean LJJJJI;
    public final C24660xy LJJJJIZL;
    public final C24740y6 LJJJJJ;
    public int LJJJJJL;
    public int LJJJJL;
    public int LJJJJLI;
    public int LJJJJLL;

    @Override // X.InterfaceC24520xk
    public final void LJIIL() {
        this.LJIILLIIL = true;
    }

    @Override // X.InterfaceC24520xk
    public final void LJJIIZI() {
        this.LJJI = false;
    }

    @Override // X.InterfaceC24520xk
    public final void LJJIJIIJI() {
        LJJJJJ(false);
    }

    @Override // X.InterfaceC24520xk
    public final void LJJIJIIJIL() {
        LJJJJJ(false);
    }

    public final void LJJIZ() {
        this.LJIIIZ = null;
        this.LJIIJ = 0;
        this.LJIIL = 0;
        this.LJJJIL = 0;
        this.LJJIZ = 0;
        this.LJIIZILJ = false;
        this.LJJJJ = false;
        this.LJJJJIZL.LIZIZ = 0;
        ((ArrayList) this.LJJIIJ.LIZ).clear();
        this.LJIILJJIL = null;
        this.LJIILL = null;
    }

    public final void LJJJJJL() {
        LJJJJJ(false);
        C35991b9 LJJJJZI = LJJJJZI();
        if (LJJJJZI != null) {
            int i = LJJJJZI.LIZ;
            if ((i & 1) != 0) {
                LJJJJZI.LIZ = i | 2;
            }
        }
    }

    public final void LJJJJL() {
        LJJJJJ(false);
        LJJJJJ(false);
        this.LJIL = this.LJJ.LIZ() != 0;
        this.LJJIJIIJIL = null;
    }

    public final void LJJJJLL() {
        LJJJJJ(false);
        this.LIZJ.LIZLLL();
        LJJJJJ(false);
        if (this.LJJJJ) {
            LJJLIIJ(false, C24780yA.LIZJ);
            this.LJJJJ = false;
        }
        LJJLIIIJ();
        if (((ArrayList) this.LJIIIIZZ.LIZ).isEmpty()) {
            if (this.LJJJJIZL.LIZIZ == 0) {
                LJJIZ();
                this.LJJIIZ.LIZJ();
                return;
            } else {
                "Missed recording an endGroup()".toString();
                C24780yA.LIZJ("Missed recording an endGroup()");
                throw null;
            }
        }
        "Start/end imbalance".toString();
        C24780yA.LIZJ("Start/end imbalance");
        throw null;
    }

    public final void LJJZZIII() {
        LJJZZI(-127, null, null, false);
    }

    @Override // X.InterfaceC24520xk
    public final boolean LIZ() {
        C35991b9 LJJJJZI;
        if (this.LJJIL || this.LJJI || this.LJIL || (LJJJJZI = LJJJJZI()) == null || (LJJJJZI.LIZ & 8) != 0) {
            return false;
        }
        return true;
    }

    @Override // X.InterfaceC24520xk
    public final void LIZIZ() {
        Trace.beginSection("composer:useNode");
        try {
            if (this.LJIIZILJ) {
                this.LJIIZILJ = false;
                if (!this.LJJIL) {
                    C24450xd c24450xd = this.LJJIIZ;
                    this.LJJJI.LJFF(c24450xd.LJIIIZ(c24450xd.LJIIIIZZ));
                    return;
                } else {
                    "useNode() called while inserting".toString();
                    C24780yA.LIZJ("useNode() called while inserting");
                    throw null;
                }
            }
            "A call to createNode(), emitNode() or useNode() expected was not expected".toString();
            C24780yA.LIZJ("A call to createNode(), emitNode() or useNode() expected was not expected");
            throw null;
        } finally {
            Trace.endSection();
        }
    }

    @Override // X.InterfaceC24520xk
    public final void LIZLLL() {
        if (this.LJIIL == 0) {
            C35991b9 LJJJJZI = LJJJJZI();
            if (LJJJJZI != null) {
                LJJJJZI.LIZ |= 16;
            }
            if (((ArrayList) this.LJIJ).isEmpty()) {
                LJJZ();
                return;
            } else {
                LJJLIIIJJIZ();
                return;
            }
        }
        "No nodes can be emitted before calling skipAndEndGroup".toString();
        C24780yA.LIZJ("No nodes can be emitted before calling skipAndEndGroup");
        throw null;
    }

    @Override // X.InterfaceC24520xk
    public final C35911b1 LJFF() {
        C35901b0 c35901b0;
        LJL(206, C24780yA.LJIIJ);
        if (this.LJJIL) {
            C24570xp.LJIJJ(this.LJJIJ);
        }
        Object LJJJZ = LJJJZ();
        if (!(LJJJZ instanceof C35901b0) || (c35901b0 = (C35901b0) LJJJZ) == null) {
            c35901b0 = new C35901b0(new C35911b1(this, this.LJJIZ, this.LJIILLIIL));
            LJLJLLL(c35901b0);
        }
        C35911b1 c35911b1 = c35901b0.LJLIL;
        InterfaceC37431dT<AbstractC24370xV<Object>, InterfaceC24760y8<Object>> scope = LJJJIL(null);
        c35911b1.getClass();
        o.LJIIIZ(scope, "scope");
        c35911b1.LJ.setValue(scope);
        LJJJJJ(false);
        return c35901b0.LJLIL;
    }

    @Override // X.InterfaceC24520xk
    public final void LJIIIIZZ() {
        boolean z;
        if (this.LJJIFFI >= 0) {
            z = true;
        } else {
            z = false;
        }
        this.LJJI = z;
    }

    @Override // X.InterfaceC24520xk
    public final void LJIILJJIL() {
        if (this.LJJI && this.LJJIIZ.LJIIIIZZ == this.LJJIFFI) {
            this.LJJIFFI = -1;
            this.LJJI = false;
        }
        LJJJJJ(false);
    }

    @Override // X.InterfaceC24520xk
    public final void LJIJ() {
        Trace.beginSection("composer:endNode");
        try {
            LJJJJJ(true);
        } finally {
            Trace.endSection();
        }
    }

    @Override // X.InterfaceC24520xk
    public final void LJIJI() {
        LJJZZI(125, null, null, true);
        this.LJIIZILJ = true;
    }

    @Override // X.InterfaceC24520xk
    public final MBA LJJIFFI() {
        return this.LIZJ.LJII();
    }

    public final void LJJJJ() {
        Trace.beginSection("Compose:Composer.dispose");
        try {
            this.LIZJ.LJIILJJIL(this);
            ((ArrayList) this.LJJIIJ.LIZ).clear();
            ((ArrayList) this.LJIJ).clear();
            this.LJFF.clear();
            this.LJIJJLI.clear();
            this.LIZIZ.clear();
        } finally {
            Trace.endSection();
        }
    }

    public final C35991b9 LJJJJLI() {
        C35991b9 c35991b9;
        C24400xY LIZ;
        C35991b9 c35991b92 = null;
        if (!((ArrayList) this.LJJIIJ.LIZ).isEmpty()) {
            c35991b9 = (C35991b9) this.LJJIIJ.LJ();
            if (c35991b9 != null) {
                c35991b9.LIZ &= -9;
            }
        } else {
            c35991b9 = null;
        }
        if (c35991b9 != null) {
            int i = this.LJJIII;
            C25680zc c25680zc = c35991b9.LJFF;
            if (c25680zc != null && (c35991b9.LIZ & 16) == 0) {
                int i2 = c25680zc.LIZ;
                int i3 = 0;
                while (true) {
                    if (i3 >= i2) {
                        break;
                    }
                    o.LJII(c25680zc.LIZIZ[i3], "null cannot be cast to non-null type kotlin.Any");
                    if (c25680zc.LIZJ[i3] != i) {
                        LJJLIIIJL(new IDqS180S0200000(new IDqS4S0201000(c35991b9, i, c25680zc, 4), this, 13));
                        break;
                    }
                    i3++;
                }
            }
            int i4 = c35991b9.LIZ;
            if ((i4 & 16) == 0 && ((i4 & 1) != 0 || this.LJIILLIIL)) {
                if (c35991b9.LIZJ == null) {
                    if (this.LJJIL) {
                        C24570xp c24570xp = this.LJJIJ;
                        LIZ = c24570xp.LIZIZ(c24570xp.LJIJ);
                    } else {
                        C24450xd c24450xd = this.LJJIIZ;
                        LIZ = c24450xd.LIZ(c24450xd.LJIIIIZZ);
                    }
                    c35991b9.LIZJ = LIZ;
                }
                c35991b9.LIZ &= -5;
                c35991b92 = c35991b9;
            }
        }
        LJJJJJ(false);
        return c35991b92;
    }

    public final C35991b9 LJJJJZI() {
        C24740y6 c24740y6 = this.LJJIIJ;
        if (this.LJJII == 0 && (!((ArrayList) c24740y6.LIZ).isEmpty())) {
            return (C35991b9) ListProtector.get((ArrayList) c24740y6.LIZ, ((ArrayList) r0).size() - 1);
        }
        return null;
    }

    public final boolean LJJJLIIL() {
        if (this.LJIL) {
            return true;
        }
        C35991b9 LJJJJZI = LJJJJZI();
        if (LJJJJZI != null && (LJJJJZI.LIZ & 4) != 0) {
            return true;
        }
        return false;
    }

    public final Object LJJJZ() {
        Object obj;
        int i;
        if (this.LJJIL) {
            if (!this.LJIIZILJ) {
                InterfaceC24520xk.LIZ.getClass();
                return C24500xi.LIZIZ;
            }
            "A call to createNode(), emitNode() or useNode() expected".toString();
            C24780yA.LIZJ("A call to createNode(), emitNode() or useNode() expected");
            throw null;
        }
        C24450xd c24450xd = this.LJJIIZ;
        if (c24450xd.LJIIIZ > 0 || (i = c24450xd.LJIIJ) >= c24450xd.LJIIJJI) {
            InterfaceC24520xk.LIZ.getClass();
            obj = C24500xi.LIZIZ;
        } else {
            Object[] objArr = c24450xd.LIZLLL;
            c24450xd.LJIIJ = i + 1;
            obj = objArr[i];
        }
        if (!this.LJJI) {
            return obj;
        }
        InterfaceC24520xk.LIZ.getClass();
        return C24500xi.LIZIZ;
    }

    public final void LJJL() {
        if (!((ArrayList) this.LJJJI.LIZ).isEmpty()) {
            C24740y6 c24740y6 = this.LJJJI;
            int size = ((ArrayList) c24740y6.LIZ).size();
            Object[] objArr = new Object[size];
            for (int i = 0; i < size; i++) {
                objArr[i] = ListProtector.get((ArrayList) c24740y6.LIZ, i);
            }
            LJJLIIIJL(new IDqS425S0100000(objArr, 15));
            ((ArrayList) this.LJJJI.LIZ).clear();
        }
    }

    public final void LJJLI() {
        int i = this.LJJJJLL;
        this.LJJJJLL = 0;
        if (i > 0) {
            int i2 = this.LJJJJJL;
            if (i2 >= 0) {
                this.LJJJJJL = -1;
                C530226g c530226g = new C530226g(i2, i);
                LJJLIIIJ();
                LJJL();
                LJJLIIIJL(c530226g);
                return;
            }
            int i3 = this.LJJJJL;
            this.LJJJJL = -1;
            int i4 = this.LJJJJLI;
            this.LJJJJLI = -1;
            C530326h c530326h = new C530326h(i3, i4, i);
            LJJLIIIJ();
            LJJL();
            LJJLIIIJL(c530326h);
        }
    }

    public final void LJJLIIIJ() {
        int i = this.LJJJ;
        if (i > 0) {
            this.LJJJ = 0;
            LJJLIIIJL(new C530526j(i));
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:103:0x01ba, code lost:
    
        if (r16 == false) goto L86;
     */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x01bc, code lost:
    
        LJJLJ(r2, r9, r9);
        r17.LJJIIZ.LJIILL();
        r0 = LJLL(r9);
        r17.LJIIJ = r8 + r0;
        r17.LJIIL = r6 + r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:10:0x003d, code lost:
    
        r12 = r3.LIZIZ;
        r1 = r17.LJIJ;
        r0 = X.C24780yA.LIZLLL(r12, r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0045, code lost:
    
        if (r0 < 0) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0047, code lost:
    
        com.bytedance.mt.protector.impl.collections.ListProtector.remove(r1, r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x004a, code lost:
    
        r0 = r3.LIZ;
        r1 = r3.LIZJ;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x004e, code lost:
    
        if (r1 != null) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0050, code lost:
    
        r0.getClass();
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0053, code lost:
    
        r17.LJJIIZ.LJIILIIL(r12);
        r5 = r17.LJJIIZ.LJI;
        LJJLJ(r2, r5, r9);
        r14 = r17.LJJIIZ.LJIIL(r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0065, code lost:
    
        if (r14 == r9) goto L100;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x006d, code lost:
    
        if (r17.LJJIIZ.LJIIIIZZ(r14) != false) goto L101;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x006f, code lost:
    
        r14 = r17.LJJIIZ.LJIIL(r14);
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x00f0, code lost:
    
        if (r17.LJJIIZ.LJIIIIZZ(r14) == false) goto L78;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x00f2, code lost:
    
        r4 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x00f3, code lost:
    
        if (r14 != r5) goto L70;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00f5, code lost:
    
        r17.LJIIJ = r4;
        r17.LJJIZ = LJJJI(r17.LJJIIZ.LJIIL(r5), r9, r7);
        r17.LJJIJIIJIL = null;
        r0 = r3.LIZ;
        r0.getClass();
        r1 = r0.LIZLLL;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x010e, code lost:
    
        if (r1 == null) goto L93;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0110, code lost:
    
        r1.invoke(r17, 1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0119, code lost:
    
        if (X.C76800UCe.LIZ == null) goto L94;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x011b, code lost:
    
        r17.LJJIJIIJIL = null;
        r1 = r17.LJJIIZ;
        r0 = X.C78847Ux1.LIZLLL(r9, r1.LIZIZ) + r9;
        r2 = r1.LJI;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0128, code lost:
    
        if (r2 < r9) goto L95;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x012a, code lost:
    
        if (r2 > r0) goto L96;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x012c, code lost:
    
        r1.LJIIIIZZ = r9;
        r1.LJII = r0;
        r1.LJIIJ = 0;
        r1.LJIIJJI = 0;
        r2 = r5;
        r16 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0138, code lost:
    
        r3 = r17.LJIJ;
        r1 = X.C24780yA.LIZLLL(r17.LJJIIZ.LJI, r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0142, code lost:
    
        if (r1 >= 0) goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0144, code lost:
    
        r1 = -(r1 + 1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x014e, code lost:
    
        if (r1 >= ((java.util.ArrayList) r3).size()) goto L97;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0150, code lost:
    
        r3 = (X.C24670xz) com.bytedance.mt.protector.impl.collections.ListProtector.get(r3, r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0158, code lost:
    
        if (r3.LIZIZ >= r13) goto L98;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x018b, code lost:
    
        r1 = X.X1D.LIZ();
        r1.append("Index ");
        r1.append(r9);
        r1.append(" is not a parent of ");
        r1.append(r2);
        r0 = X.X1D.LIZIZ(r1);
        r0.toString();
        X.C24780yA.LIZJ(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x01aa, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x01ab, code lost:
    
        "Invalid restart scope".toString();
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x01b5, code lost:
    
        throw new java.lang.IllegalStateException("Invalid restart scope");
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x015c, code lost:
    
        r2 = (LJLL(r14) - r17.LJJIIZ.LJIIJ(r5)) + r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0168, code lost:
    
        if (r4 >= r2) goto L102;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x016a, code lost:
    
        if (r14 == r12) goto L103;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x016c, code lost:
    
        r14 = r14 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x016e, code lost:
    
        if (r14 >= r12) goto L104;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x0170, code lost:
    
        r1 = r17.LJJIIZ.LJII(r14) + r14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x0177, code lost:
    
        if (r12 < r1) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0179, code lost:
    
        r4 = r4 + LJLL(r14);
        r14 = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x0180, code lost:
    
        r4 = r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x0076, code lost:
    
        r14 = r0.LJI;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x0078, code lost:
    
        if (r14 != null) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x007d, code lost:
    
        if (r1.LJLIL <= 0) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x0083, code lost:
    
        if (r1.isEmpty() == false) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x0085, code lost:
    
        r17.LJJIIJ.LJFF(r3.LIZ);
        r3 = r3.LIZ;
        r14 = r3.LIZIZ;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x0090, code lost:
    
        if (r14 == null) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x0092, code lost:
    
        r12 = r3.LJFF;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x0094, code lost:
    
        if (r12 == null) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x0096, code lost:
    
        r3.LIZ |= 32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x00ca, code lost:
    
        r5 = r12.LIZ;
        r4 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x00cd, code lost:
    
        if (r4 >= r5) goto L106;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x00cf, code lost:
    
        r1 = r12.LIZIZ[r4];
        kotlin.jvm.internal.o.LJII(r1, "null cannot be cast to non-null type kotlin.Any");
        r14.LJI(r1);
        r4 = r4 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x0183, code lost:
    
        r1 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x0184, code lost:
    
        r3.LIZ &= -33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x018a, code lost:
    
        throw r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x00e4, code lost:
    
        r17.LJJIIJ.LJ();
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x009d, code lost:
    
        r5 = new Y.IDObjectS0S0101000(r1, 3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x00a7, code lost:
    
        if (r5.hasNext() == false) goto L108;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x00a9, code lost:
    
        r15 = r5.next();
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x00af, code lost:
    
        if ((r15 instanceof X.InterfaceC35921b2) == false) goto L109;
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x00b1, code lost:
    
        r15 = (X.InterfaceC35921b2) r15;
        r4 = r15.LIZ();
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x00b7, code lost:
    
        if (r4 != null) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x00b9, code lost:
    
        r4 = X.C36041bE.LIZ;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x00c7, code lost:
    
        if (r4.LIZIZ(r15.LIZIZ(), r14.LIZIZ(r15)) == false) goto L107;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x003b, code lost:
    
        if (r3 != null) goto L11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJJLIIIJJIZ() {
        /*
            Method dump skipped, instructions count: 467
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C35931b3.LJJLIIIJJIZ():void");
    }

    public final void LJJLIIIJLLLLLLLZ() {
        int i;
        C24450xd c24450xd = this.LJJIIZ;
        if (c24450xd.LIZJ > 0) {
            int i2 = c24450xd.LJIIIIZZ;
            C24660xy c24660xy = this.LJJJJIZL;
            int i3 = c24660xy.LIZIZ;
            if (i3 > 0) {
                i = c24660xy.LIZ[i3 - 1];
            } else {
                i = -2;
            }
            if (i != i2) {
                if (!this.LJJJJ && this.LJJJJI) {
                    LJJLIIJ(false, C24780yA.LIZLLL);
                    this.LJJJJ = true;
                }
                if (i2 > 0) {
                    C24400xY LIZ = c24450xd.LIZ(i2);
                    this.LJJJJIZL.LIZIZ(i2);
                    LJJLIIJ(false, new IDqS425S0100000(LIZ, 13));
                }
            }
        }
    }

    public final void LJJLIL() {
        if (!((ArrayList) this.LJJJI.LIZ).isEmpty()) {
            this.LJJJI.LJ();
        } else {
            this.LJJJ++;
        }
    }

    public final void LJJZ() {
        int i;
        C24450xd c24450xd = this.LJJIIZ;
        int i2 = c24450xd.LJIIIIZZ;
        if (i2 >= 0) {
            i = C78847Ux1.LJII(i2, c24450xd.LIZIZ);
        } else {
            i = 0;
        }
        this.LJIIL = i;
        this.LJJIIZ.LJIILL();
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0028, code lost:
    
        if (r3.LJJIIZ.LJFF() == 126) goto L13;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJLI() {
        /*
            r3 = this;
            java.lang.String r0 = "ComposeNode:start"
            android.os.Trace.beginSection(r0)
            boolean r0 = r3.LJJIL     // Catch: java.lang.Throwable -> L31
            r2 = 125(0x7d, float:1.75E-43)
            if (r0 == 0) goto L13
        Lb:
            r1 = 0
            r0 = 1
            r3.LJJZZI(r2, r1, r1, r0)     // Catch: java.lang.Throwable -> L31
            r3.LJIIZILJ = r0     // Catch: java.lang.Throwable -> L31
            goto L2d
        L13:
            boolean r0 = r3.LJJI     // Catch: java.lang.Throwable -> L31
            r1 = 126(0x7e, float:1.77E-43)
            if (r0 == 0) goto L22
            X.0xd r0 = r3.LJJIIZ     // Catch: java.lang.Throwable -> L31
            int r0 = r0.LJFF()     // Catch: java.lang.Throwable -> L31
            if (r0 != r2) goto Lb
            goto L2a
        L22:
            X.0xd r0 = r3.LJJIIZ     // Catch: java.lang.Throwable -> L31
            int r0 = r0.LJFF()     // Catch: java.lang.Throwable -> L31
            if (r0 != r1) goto Lb
        L2a:
            r2 = 126(0x7e, float:1.77E-43)
            goto Lb
        L2d:
            android.os.Trace.endSection()
            return
        L31:
            r0 = move-exception
            android.os.Trace.endSection()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C35931b3.LJLI():void");
    }

    public final void LJLIL() {
        Object value;
        this.LJJIIZ = this.LIZLLL.LJIIIZ();
        LJJZZI(100, null, null, false);
        this.LIZJ.LJIILIIL();
        this.LJIJJ = this.LIZJ.LJFF();
        this.LJJ.LIZIZ(this.LJIL ? 1 : 0);
        this.LJIL = LJIJJ(this.LJIJJ);
        this.LJJIJIIJIL = null;
        if (!this.LJIILLIIL) {
            this.LJIILLIIL = this.LIZJ.LJ();
        }
        C44031o7 key = C0QJ.LIZ;
        InterfaceC37431dT<AbstractC24370xV<Object>, ? extends InterfaceC24760y8<? extends Object>> interfaceC37431dT = this.LJIJJ;
        o.LJIIIZ(interfaceC37431dT, "<this>");
        o.LJIIIZ(key, "key");
        if (interfaceC37431dT.containsKey(key)) {
            InterfaceC24760y8<? extends Object> interfaceC24760y8 = interfaceC37431dT.get(key);
            if (interfaceC24760y8 != null) {
                value = interfaceC24760y8.getValue();
            } else {
                value = null;
            }
        } else {
            value = key.LIZ.getValue();
        }
        java.util.Set<Object> set = (java.util.Set) value;
        if (set != null) {
            set.add(this.LIZLLL);
            this.LIZJ.LJIIJJI(set);
        }
        LJJZZI(this.LIZJ.LJI(), null, null, false);
    }

    @Override // X.InterfaceC24520xk
    public final C35991b9 LJIILIIL() {
        return LJJJJZI();
    }

    @Override // X.InterfaceC24520xk
    public final Object LJIILL() {
        return LJJJZ();
    }

    public final void LJJIJIL() {
        LJJIZ();
        ((ArrayList) this.LJIIIIZZ.LIZ).clear();
        this.LJIIJJI.LIZIZ = 0;
        this.LJIILIIL.LIZIZ = 0;
        this.LJIJI.LIZIZ = 0;
        this.LJJ.LIZIZ = 0;
        this.LJIJJLI.clear();
        C24450xd c24450xd = this.LJJIIZ;
        if (!c24450xd.LJFF) {
            c24450xd.LIZJ();
        }
        C24570xp c24570xp = this.LJJIJ;
        if (!c24570xp.LJIJI) {
            c24570xp.LJFF();
        }
        C24780yA.LJFF(this.LJJIJ.LJIJI);
        C35871ax c35871ax = new C35871ax();
        this.LJJIIZI = c35871ax;
        C24570xp LJIILJJIL = c35871ax.LJIILJJIL();
        LJIILJJIL.LJFF();
        this.LJJIJ = LJIILJJIL;
        this.LJJIZ = 0;
        this.LJJII = 0;
        this.LJIIZILJ = false;
        this.LJJIL = false;
        this.LJJI = false;
        this.LJJIIJZLJL = false;
    }

    @Override // X.InterfaceC24520xk
    public final boolean LJIJJLI() {
        return this.LJJIL;
    }

    @Override // X.InterfaceC24520xk
    public final InterfaceC24420xa<?> LJJ() {
        return this.LIZIZ;
    }

    @Override // X.InterfaceC24520xk
    public final C35871ax LJJIIJZLJL() {
        return this.LIZLLL;
    }

    @Override // X.InterfaceC24520xk
    public final int LJJIJ() {
        return this.LJJIZ;
    }

    @Override // X.InterfaceC24520xk
    public final void LIZJ(Object obj) {
        if (this.LJJIIZ.LJFF() == 207 && !o.LJ(this.LJJIIZ.LJ(), obj) && this.LJJIFFI < 0) {
            this.LJJIFFI = this.LJJIIZ.LJI;
            this.LJJI = true;
        }
        LJJZZI(207, null, obj, false);
    }

    @Override // X.InterfaceC24520xk
    public final void LJ(InterfaceC24650xx interfaceC24650xx) {
        C35991b9 c35991b9;
        if (!(interfaceC24650xx instanceof C35991b9) || (c35991b9 = (C35991b9) interfaceC24650xx) == null) {
            return;
        }
        c35991b9.LIZ |= 1;
    }

    @Override // X.InterfaceC24520xk
    public final boolean LJI(boolean z) {
        Object LJJJZ = LJJJZ();
        if ((LJJJZ instanceof Boolean) && z == ((Boolean) LJJJZ).booleanValue()) {
            return false;
        }
        LJLJLLL(Boolean.valueOf(z));
        return true;
    }

    @Override // X.InterfaceC24520xk
    public final boolean LJII(float f) {
        Object LJJJZ = LJJJZ();
        if ((LJJJZ instanceof Float) && f == ((Number) LJJJZ).floatValue()) {
            return false;
        }
        LJLJLLL(Float.valueOf(f));
        return true;
    }

    @Override // X.InterfaceC24520xk
    public final boolean LJIIIZ(int i) {
        Object LJJJZ = LJJJZ();
        if ((LJJJZ instanceof Integer) && i == ((Number) LJJJZ).intValue()) {
            return false;
        }
        LJLJLLL(Integer.valueOf(i));
        return true;
    }

    @Override // X.InterfaceC24520xk
    public final boolean LJIIJ(long j) {
        Object LJJJZ = LJJJZ();
        if ((LJJJZ instanceof Long) && j == ((Number) LJJJZ).longValue()) {
            return false;
        }
        LJLJLLL(Long.valueOf(j));
        return true;
    }

    @Override // X.InterfaceC24520xk
    public final void LJIIJJI(InterfaceC65784Pro<C76800UCe> effect) {
        o.LJIIIZ(effect, "effect");
        LJJLIIIJL(new IDqS425S0100000(effect, (InterfaceC65784Pro<C76800UCe>) 12));
    }

    @Override // X.InterfaceC24520xk
    public final Object LJIILLIIL(AbstractC35971b7 key) {
        o.LJIIIZ(key, "key");
        InterfaceC37431dT<AbstractC24370xV<Object>, InterfaceC24760y8<Object>> LJJJIL = LJJJIL(null);
        o.LJIIIZ(LJJJIL, "<this>");
        if (LJJJIL.containsKey(key)) {
            InterfaceC24760y8<Object> interfaceC24760y8 = LJJJIL.get(key);
            if (interfaceC24760y8 == null) {
                return null;
            }
            return interfaceC24760y8.getValue();
        }
        return key.LIZ.getValue();
    }

    @Override // X.InterfaceC24520xk
    public final void LJIIZILJ(boolean z) {
        int i;
        if (this.LJIIL == 0) {
            if (!this.LJJIL) {
                if (!z) {
                    LJJZ();
                    return;
                }
                C24450xd c24450xd = this.LJJIIZ;
                int i2 = c24450xd.LJI;
                int i3 = c24450xd.LJII;
                int i4 = i2;
                while (i4 < i3) {
                    C24450xd c24450xd2 = this.LJJIIZ;
                    IDqS11S0101000 iDqS11S0101000 = new IDqS11S0101000(this, i4, 12);
                    c24450xd2.getClass();
                    int LJIIIIZZ = C78847Ux1.LJIIIIZZ(i4, c24450xd2.LIZIZ);
                    i4++;
                    C35871ax c35871ax = c24450xd2.LIZ;
                    if (i4 < c35871ax.LJLILLLLZI) {
                        i = c35871ax.LJLIL[(i4 * 5) + 4];
                    } else {
                        i = c35871ax.LJLJJI;
                    }
                    for (int i5 = LJIIIIZZ; i5 < i; i5++) {
                        iDqS11S0101000.invoke(Integer.valueOf(i5 - LJIIIIZZ), c24450xd2.LIZLLL[i5]);
                    }
                }
                C24780yA.LIZ(i2, i3, this.LJIJ);
                this.LJJIIZ.LJIILIIL(i2);
                this.LJJIIZ.LJIILL();
                return;
            }
            return;
        }
        "No nodes can be emitted before calling dactivateToEndGroup".toString();
        C24780yA.LIZJ("No nodes can be emitted before calling dactivateToEndGroup");
        throw null;
    }

    @Override // X.InterfaceC24520xk
    public final boolean LJIJJ(Object obj) {
        if (!o.LJ(LJJJZ(), obj)) {
            LJLJLLL(obj);
            return true;
        }
        return false;
    }

    @Override // X.InterfaceC24520xk
    public final C35931b3 LJIL(int i) {
        Object obj;
        C35991b9 c35991b9;
        int i2;
        Object obj2 = null;
        LJJZZI(i, null, null, false);
        if (this.LJJIL) {
            InterfaceC35841au interfaceC35841au = this.LJII;
            o.LJII(interfaceC35841au, "null cannot be cast to non-null type androidx.compose.runtime.CompositionImpl");
            C35991b9 c35991b92 = new C35991b9((C43991o3) interfaceC35841au);
            this.LJJIIJ.LJFF(c35991b92);
            LJLJLLL(c35991b92);
            c35991b92.LJ = this.LJJIII;
            c35991b92.LIZ &= -17;
        } else {
            List<C24670xz> list = this.LJIJ;
            int LIZLLL = C24780yA.LIZLLL(this.LJJIIZ.LJIIIIZZ, list);
            if (LIZLLL >= 0) {
                obj2 = ListProtector.remove(list, LIZLLL);
            }
            C24450xd c24450xd = this.LJJIIZ;
            if (c24450xd.LJIIIZ > 0 || (i2 = c24450xd.LJIIJ) >= c24450xd.LJIIJJI) {
                InterfaceC24520xk.LIZ.getClass();
                obj = C24500xi.LIZIZ;
            } else {
                Object[] objArr = c24450xd.LIZLLL;
                c24450xd.LJIIJ = i2 + 1;
                obj = objArr[i2];
            }
            InterfaceC24520xk.LIZ.getClass();
            if (o.LJ(obj, C24500xi.LIZIZ)) {
                InterfaceC35841au interfaceC35841au2 = this.LJII;
                o.LJII(interfaceC35841au2, "null cannot be cast to non-null type androidx.compose.runtime.CompositionImpl");
                c35991b9 = new C35991b9((C43991o3) interfaceC35841au2);
                LJLJLLL(c35991b9);
            } else {
                o.LJII(obj, "null cannot be cast to non-null type androidx.compose.runtime.RecomposeScopeImpl");
                c35991b9 = (C35991b9) obj;
            }
            if (obj2 != null) {
                c35991b9.LIZ |= 8;
            } else {
                c35991b9.LIZ &= -9;
            }
            this.LJJIIJ.LJFF(c35991b9);
            c35991b9.LJ = this.LJJIII;
            c35991b9.LIZ &= -17;
        }
        return this;
    }

    @Override // X.InterfaceC24520xk
    public final <T> void LJJI(InterfaceC65784Pro<? extends T> factory) {
        o.LJIIIZ(factory, "factory");
        Trace.beginSection("composer:createNode:all");
        try {
            if (this.LJIIZILJ) {
                this.LJIIZILJ = false;
                if (this.LJJIL) {
                    int i = this.LJIIJJI.LIZ[r0.LIZIZ - 1];
                    C24570xp c24570xp = this.LJJIJ;
                    C24400xY LIZIZ = c24570xp.LIZIZ(c24570xp.LJIJ);
                    this.LJIIL++;
                    ((ArrayList) this.LJJIJLIJ).add(new C530026e(factory, LIZIZ, i));
                    this.LJJJJJ.LJFF(new IDqS16S0101000(i, LIZIZ, 2));
                    return;
                }
                "createNode() can only be called when inserting".toString();
                C24780yA.LIZJ("createNode() can only be called when inserting");
                throw null;
            }
            "A call to createNode(), emitNode() or useNode() expected was not expected".toString();
            C24780yA.LIZJ("A call to createNode(), emitNode() or useNode() expected was not expected");
            throw null;
        } finally {
            Trace.endSection();
        }
    }

    @Override // X.InterfaceC24520xk
    public final void LJJIII(Object obj) {
        LJLJLLL(obj);
    }

    @Override // X.InterfaceC24520xk
    public final void LJJIIJ(int i) {
        LJJZZI(i, null, null, false);
    }

    public final InterfaceC37431dT<AbstractC24370xV<Object>, InterfaceC24760y8<Object>> LJJJIL(Integer num) {
        int i;
        Object obj;
        InterfaceC37431dT interfaceC37431dT;
        if (num == null && (interfaceC37431dT = this.LJJIJIIJIL) != null) {
            return interfaceC37431dT;
        }
        if (this.LJJIL && this.LJJIJIIJI) {
            int i2 = this.LJJIJ.LJIJ;
            while (i2 > 0) {
                C24570xp c24570xp = this.LJJIJ;
                if (c24570xp.LIZIZ[c24570xp.LJIILJJIL(i2) * 5] == 202) {
                    C24570xp c24570xp2 = this.LJJIJ;
                    int LJIILJJIL = c24570xp2.LJIILJJIL(i2);
                    int[] iArr = c24570xp2.LIZIZ;
                    int i3 = LJIILJJIL * 5;
                    int i4 = iArr[i3 + 1];
                    if ((536870912 & i4) != 0) {
                        obj = c24570xp2.LIZJ[C78847Ux1.LJIJI(i4 >> 30) + iArr[i3 + 4]];
                    } else {
                        obj = null;
                    }
                    if (o.LJ(obj, C24780yA.LJII)) {
                        Object LJIILIIL = this.LJJIJ.LJIILIIL(i2);
                        o.LJII(LJIILIIL, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentMap<androidx.compose.runtime.CompositionLocal<kotlin.Any?>, androidx.compose.runtime.State<kotlin.Any?>>{ androidx.compose.runtime.ComposerKt.CompositionLocalMap }");
                        InterfaceC37431dT<AbstractC24370xV<Object>, InterfaceC24760y8<Object>> interfaceC37431dT2 = (InterfaceC37431dT) LJIILIIL;
                        this.LJJIJIIJIL = interfaceC37431dT2;
                        return interfaceC37431dT2;
                    }
                }
                i2 = this.LJJIJ.LJJIIJ(i2);
            }
        }
        C24450xd c24450xd = this.LJJIIZ;
        if (c24450xd.LIZJ > 0) {
            if (num != null) {
                i = num.intValue();
            } else {
                i = c24450xd.LJIIIIZZ;
            }
            while (i > 0) {
                C24450xd c24450xd2 = this.LJJIIZ;
                int[] iArr2 = c24450xd2.LIZIZ;
                if (iArr2[i * 5] == 202 && o.LJ(c24450xd2.LJIIJJI(i, iArr2), C24780yA.LJII)) {
                    InterfaceC37431dT<AbstractC24370xV<Object>, InterfaceC24760y8<Object>> interfaceC37431dT3 = this.LJIJJLI.get(Integer.valueOf(i));
                    if (interfaceC37431dT3 == null) {
                        C24450xd c24450xd3 = this.LJJIIZ;
                        Object LIZIZ = c24450xd3.LIZIZ(i, c24450xd3.LIZIZ);
                        o.LJII(LIZIZ, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentMap<androidx.compose.runtime.CompositionLocal<kotlin.Any?>, androidx.compose.runtime.State<kotlin.Any?>>{ androidx.compose.runtime.ComposerKt.CompositionLocalMap }");
                        interfaceC37431dT3 = (InterfaceC37431dT) LIZIZ;
                    }
                    this.LJJIJIIJIL = interfaceC37431dT3;
                    return interfaceC37431dT3;
                }
                i = this.LJJIIZ.LJIIL(i);
            }
        }
        InterfaceC37431dT interfaceC37431dT4 = this.LJIJJ;
        this.LJJIJIIJIL = interfaceC37431dT4;
        return interfaceC37431dT4;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r2v5, types: [int, boolean] */
    /* JADX WARN: Type inference failed for: r2v7 */
    public final void LJJJJJ(boolean z) {
        int i;
        ?? r2;
        int i2;
        int i3;
        Object obj;
        int i4 = 0;
        if (this.LJJIL) {
            C24570xp c24570xp = this.LJJIJ;
            int i5 = c24570xp.LJIJ;
            int i6 = c24570xp.LIZIZ[c24570xp.LJIILJJIL(i5) * 5];
            C24570xp c24570xp2 = this.LJJIJ;
            int LJIILJJIL = c24570xp2.LJIILJJIL(i5);
            int[] iArr = c24570xp2.LIZIZ;
            int i7 = LJIILJJIL * 5;
            int i8 = iArr[i7 + 1];
            if ((536870912 & i8) != 0) {
                obj = c24570xp2.LIZJ[C78847Ux1.LJIJI(i8 >> 30) + iArr[i7 + 4]];
            } else {
                obj = null;
            }
            LJLJJI(i6, obj, this.LJJIJ.LJIILIIL(i5));
        } else {
            C24450xd c24450xd = this.LJJIIZ;
            int i9 = c24450xd.LJIIIIZZ;
            int[] iArr2 = c24450xd.LIZIZ;
            int i10 = iArr2[i9 * 5];
            Object LJIIJJI = c24450xd.LJIIJJI(i9, iArr2);
            C24450xd c24450xd2 = this.LJJIIZ;
            LJLJJI(i10, LJIIJJI, c24450xd2.LIZIZ(i9, c24450xd2.LIZIZ));
        }
        int i11 = this.LJIIL;
        C24530xl c24530xl = this.LJIIIZ;
        if (c24530xl != null && c24530xl.LIZ.size() > 0) {
            List<C24750y7> list = c24530xl.LIZ;
            List<C24750y7> list2 = c24530xl.LIZLLL;
            o.LJIIIZ(list2, "<this>");
            ArrayList arrayList = (ArrayList) list2;
            HashSet hashSet = new HashSet(arrayList.size());
            int size = arrayList.size();
            for (int i12 = 0; i12 < size; i12++) {
                hashSet.add(ListProtector.get(list2, i12));
            }
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            int size2 = arrayList.size();
            int size3 = list.size();
            int i13 = 0;
            int i14 = 0;
            int i15 = 0;
            while (i13 < size3) {
                C24750y7 c24750y7 = (C24750y7) ListProtector.get(list, i13);
                if (!hashSet.contains(c24750y7)) {
                    LJJLIIIJLJLI(c24530xl.LIZ(c24750y7) + c24530xl.LIZIZ, c24750y7.LIZLLL);
                    c24530xl.LIZIZ(c24750y7.LIZJ, i4);
                    int i16 = c24750y7.LIZJ;
                    C24450xd c24450xd3 = this.LJJIIZ;
                    this.LJJJIL = i16 - (c24450xd3.LJI - this.LJJJIL);
                    c24450xd3.LJIILIIL(i16);
                    LJJLJLI(this.LJJIIZ.LJI);
                    C531226q c531226q = C24780yA.LIZ;
                    LJJLIIIIJ(false);
                    LJJLIIIJLLLLLLLZ();
                    LJJLIIIJL(c531226q);
                    int i17 = this.LJJJIL;
                    C24450xd c24450xd4 = this.LJJIIZ;
                    this.LJJJIL = C78847Ux1.LIZLLL(c24450xd4.LJI, c24450xd4.LIZIZ) + i17;
                    this.LJJIIZ.LJIILJJIL();
                    List<C24670xz> list3 = this.LJIJ;
                    int i18 = c24750y7.LIZJ;
                    C24780yA.LIZ(i18, this.LJJIIZ.LJII(i18) + i18, list3);
                } else if (!linkedHashSet.contains(c24750y7)) {
                    if (i14 < size2) {
                        C24750y7 keyInfo = (C24750y7) ListProtector.get(list2, i14);
                        if (keyInfo != c24750y7) {
                            int LIZ = c24530xl.LIZ(keyInfo);
                            linkedHashSet.add(keyInfo);
                            if (LIZ != i15) {
                                C24640xw c24640xw = c24530xl.LJ.get(Integer.valueOf(keyInfo.LIZJ));
                                if (c24640xw != null) {
                                    i3 = c24640xw.LIZJ;
                                } else {
                                    i3 = keyInfo.LIZLLL;
                                }
                                int i19 = c24530xl.LIZIZ;
                                int i20 = LIZ + i19;
                                int i21 = i19 + i15;
                                if (i3 > 0) {
                                    int i22 = this.LJJJJLL;
                                    if (i22 > 0 && this.LJJJJL == i20 - i22 && this.LJJJJLI == i21 - i22) {
                                        this.LJJJJLL = i22 + i3;
                                    } else {
                                        LJJLI();
                                        this.LJJJJL = i20;
                                        this.LJJJJLI = i21;
                                        this.LJJJJLL = i3;
                                    }
                                }
                                if (LIZ > i15) {
                                    Iterator LJ = C06540Nm.LJ(c24530xl.LJ, "groupInfos.values");
                                    while (LJ.hasNext()) {
                                        C24640xw c24640xw2 = (C24640xw) LJ.next();
                                        int i23 = c24640xw2.LIZIZ;
                                        if (LIZ <= i23 && i23 < LIZ + i3) {
                                            c24640xw2.LIZIZ = (i23 - LIZ) + i15;
                                        } else if (i15 <= i23 && i23 < LIZ) {
                                            c24640xw2.LIZIZ = i23 + i3;
                                        }
                                    }
                                } else if (i15 > LIZ) {
                                    Iterator LJ2 = C06540Nm.LJ(c24530xl.LJ, "groupInfos.values");
                                    while (LJ2.hasNext()) {
                                        C24640xw c24640xw3 = (C24640xw) LJ2.next();
                                        int i24 = c24640xw3.LIZIZ;
                                        if (LIZ <= i24 && i24 < LIZ + i3) {
                                            c24640xw3.LIZIZ = (i24 - LIZ) + i15;
                                        } else if (LIZ + 1 <= i24 && i24 < i15) {
                                            c24640xw3.LIZIZ = i24 - i3;
                                        }
                                    }
                                }
                            }
                        } else {
                            i13++;
                        }
                        i14++;
                        o.LJIIIZ(keyInfo, "keyInfo");
                        C24640xw c24640xw4 = c24530xl.LJ.get(Integer.valueOf(keyInfo.LIZJ));
                        if (c24640xw4 != null) {
                            i2 = c24640xw4.LIZJ;
                        } else {
                            i2 = keyInfo.LIZLLL;
                        }
                        i15 += i2;
                    }
                    i4 = 0;
                }
                i13++;
                i4 = 0;
            }
            LJJLI();
            if (list.size() > 0) {
                C24450xd c24450xd5 = this.LJJIIZ;
                this.LJJJIL = c24450xd5.LJII - (c24450xd5.LJI - this.LJJJIL);
                c24450xd5.LJIILL();
            }
        }
        int i25 = this.LJIIJ;
        while (true) {
            C24450xd c24450xd6 = this.LJJIIZ;
            if (c24450xd6.LJIIIZ <= 0 && c24450xd6.LJI != c24450xd6.LJII) {
                int i26 = c24450xd6.LJI;
                LJJLJLI(i26);
                C531226q c531226q2 = C24780yA.LIZ;
                LJJLIIIIJ(false);
                LJJLIIIJLLLLLLLZ();
                LJJLIIIJL(c531226q2);
                int i27 = this.LJJJIL;
                C24450xd c24450xd7 = this.LJJIIZ;
                this.LJJJIL = C78847Ux1.LIZLLL(c24450xd7.LJI, c24450xd7.LIZIZ) + i27;
                LJJLIIIJLJLI(i25, this.LJJIIZ.LJIILJJIL());
                C24780yA.LIZ(i26, this.LJJIIZ.LJI, this.LJIJ);
            }
        }
        boolean z2 = this.LJJIL;
        int i28 = -1;
        if (z2) {
            if (z) {
                ((ArrayList) this.LJJIJLIJ).add(this.LJJJJJ.LJ());
                i11 = 1;
            }
            C24450xd c24450xd8 = this.LJJIIZ;
            int i29 = c24450xd8.LJIIIZ;
            if (i29 > 0) {
                c24450xd8.LJIIIZ = i29 - 1;
                C24570xp c24570xp3 = this.LJJIJ;
                int i30 = c24570xp3.LJIJ;
                c24570xp3.LJIIIIZZ();
                if (this.LJJIIZ.LJIIIZ <= 0) {
                    int i31 = (-2) - i30;
                    this.LJJIJ.LJIIIZ();
                    this.LJJIJ.LJFF();
                    C24400xY c24400xY = this.LJJIJL;
                    if (((ArrayList) this.LJJIJLIJ).isEmpty()) {
                        IDqS180S0200000 iDqS180S0200000 = new IDqS180S0200000(this.LJJIIZI, c24400xY, 14);
                        r2 = 0;
                        LJJLIIIIJ(false);
                        LJJLIIIJLLLLLLLZ();
                        LJJLIIIJL(iDqS180S0200000);
                    } else {
                        List LLJILJILJ = ORZ.LLJILJILJ(this.LJJIJLIJ);
                        ((ArrayList) this.LJJIJLIJ).clear();
                        LJJLIIIJ();
                        LJJL();
                        IDqS35S0300000 iDqS35S0300000 = new IDqS35S0300000(this.LJJIIZI, (C35871ax) LLJILJILJ, (List<InterfaceC88473Ynt<InterfaceC24420xa<?>, C24570xp, InterfaceC24350xT, C76800UCe>>) c24400xY, (C24400xY) 0);
                        r2 = 0;
                        LJJLIIIIJ(false);
                        LJJLIIIJLLLLLLLZ();
                        LJJLIIIJL(iDqS35S0300000);
                    }
                    this.LJJIL = r2;
                    if (this.LIZLLL.LJLILLLLZI != 0) {
                        LJLJJLL(i31, r2);
                        LJLJL(i31, i11);
                    }
                }
            } else {
                "Unbalanced begin/end empty".toString();
                throw new IllegalArgumentException("Unbalanced begin/end empty");
            }
        } else {
            if (z) {
                LJJLIL();
            }
            int i32 = this.LJJIIZ.LJIIIIZZ;
            C24660xy c24660xy = this.LJJJJIZL;
            int i33 = c24660xy.LIZIZ;
            if (i33 > 0) {
                i = c24660xy.LIZ[i33 - 1];
            } else {
                i = -1;
            }
            if (i <= i32) {
                if (i33 > 0) {
                    i28 = c24660xy.LIZ[i33 - 1];
                }
                if (i28 == i32) {
                    c24660xy.LIZ();
                    LJJLIIJ(false, C24780yA.LIZJ);
                }
                int i34 = this.LJJIIZ.LJIIIIZZ;
                if (i11 != LJLL(i34)) {
                    LJLJL(i34, i11);
                }
                if (z) {
                    i11 = 1;
                }
                this.LJJIIZ.LIZLLL();
                LJJLI();
            } else {
                "Missed recording an endGroup".toString();
                C24780yA.LIZJ("Missed recording an endGroup");
                throw null;
            }
        }
        C24530xl c24530xl2 = (C24530xl) this.LJIIIIZZ.LJ();
        if (c24530xl2 != null && !z2) {
            c24530xl2.LIZJ++;
        }
        this.LJIIIZ = c24530xl2;
        this.LJIIJ = this.LJIIJJI.LIZ() + i11;
        this.LJIIL = this.LJIILIIL.LIZ() + i11;
    }

    /* JADX WARN: Code restructure failed: missing block: B:73:0x00af, code lost:
    
        if (r13 != null) goto L20;
     */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00d8 A[Catch: all -> 0x019b, TryCatch #5 {all -> 0x019b, blocks: (B:3:0x0008, B:5:0x0018, B:7:0x0046, B:9:0x0050, B:10:0x0067, B:15:0x0169, B:17:0x016c, B:20:0x0176, B:21:0x0179, B:23:0x00a1, B:25:0x00a9, B:27:0x00b1, B:29:0x00b5, B:30:0x00b9, B:33:0x00cd, B:35:0x00d8, B:37:0x00ec, B:38:0x00fe, B:51:0x0165, B:65:0x0187, B:66:0x018a, B:69:0x018c, B:70:0x018f, B:71:0x00c3, B:72:0x00ad, B:75:0x0190, B:12:0x006d, B:14:0x0095, B:40:0x0110, B:50:0x0161, B:61:0x0181, B:62:0x0185, B:42:0x0117, B:47:0x014d, B:49:0x0157, B:55:0x017d, B:56:0x017f, B:32:0x00c6), top: B:2:0x0008, inners: #1, #2, #4 }] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0157 A[Catch: all -> 0x0180, TRY_LEAVE, TryCatch #0 {all -> 0x0180, blocks: (B:42:0x0117, B:47:0x014d, B:49:0x0157, B:55:0x017d, B:56:0x017f), top: B:41:0x0117, outer: #2 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJJJLL(java.util.List<X.OSZ<X.C24380xW, X.C24380xW>> r23) {
        /*
            Method dump skipped, instructions count: 415
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C35931b3.LJJJLL(java.util.List):void");
    }

    public final void LJJLIIIIJ(boolean z) {
        int i;
        if (z) {
            i = this.LJJIIZ.LJIIIIZZ;
        } else {
            i = this.LJJIIZ.LJI;
        }
        int i2 = i - this.LJJJIL;
        if (i2 >= 0) {
            if (i2 > 0) {
                LJJLIIIJL(new C530426i(i2));
                this.LJJJIL = i;
                return;
            }
            return;
        }
        "Tried to seek backward".toString();
        C24780yA.LIZJ("Tried to seek backward");
        throw null;
    }

    public final boolean LJJLIIIJILLIZJL(C25690zd<C35991b9, C36441bs<Object>> invalidationsRequested) {
        o.LJIIIZ(invalidationsRequested, "invalidationsRequested");
        if (this.LJFF.isEmpty()) {
            if (invalidationsRequested.LIZJ <= 0 && !(!((ArrayList) this.LJIJ).isEmpty())) {
                return false;
            }
            LJJJJI(invalidationsRequested, null);
            return !this.LJFF.isEmpty();
        }
        "Expected applyChanges() to have been called".toString();
        C24780yA.LIZJ("Expected applyChanges() to have been called");
        throw null;
    }

    public final void LJJLIIIJL(InterfaceC88473Ynt<? super InterfaceC24420xa<?>, ? super C24570xp, ? super InterfaceC24350xT, C76800UCe> interfaceC88473Ynt) {
        this.LJFF.add(interfaceC88473Ynt);
    }

    public final void LJJLJLI(int i) {
        LJJLL(this, i, false, 0);
        LJJLI();
    }

    public final void LJLIIIL(C24620xu<?>[] values) {
        InterfaceC37431dT<AbstractC24370xV<Object>, InterfaceC24760y8<Object>> LJLJLJ;
        boolean LJ;
        o.LJIIIZ(values, "values");
        InterfaceC37431dT<AbstractC24370xV<Object>, InterfaceC24760y8<Object>> LJJJIL = LJJJIL(null);
        LJL(201, C24780yA.LJI);
        LJL(203, C24780yA.LJIIIIZZ);
        IDqS189S0200000 iDqS189S0200000 = new IDqS189S0200000((C24620xu[]) values, (C24620xu<?>[]) LJJJIL, (InterfaceC37431dT<AbstractC24370xV<Object>, ? extends InterfaceC24760y8<? extends Object>>) 9);
        C65777Prh.LJ(2, iDqS189S0200000);
        InterfaceC37431dT<AbstractC24370xV<Object>, ? extends InterfaceC24760y8<? extends Object>> interfaceC37431dT = (InterfaceC37431dT) iDqS189S0200000.invoke(this, 1);
        LJJJJJ(false);
        if (this.LJJIL) {
            LJLJLJ = LJLJLJ(LJJJIL, interfaceC37431dT);
            this.LJJIJIIJI = true;
        } else {
            C24450xd c24450xd = this.LJJIIZ;
            Object LJI = c24450xd.LJI(c24450xd.LJI, 0);
            o.LJII(LJI, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentMap<androidx.compose.runtime.CompositionLocal<kotlin.Any?>, androidx.compose.runtime.State<kotlin.Any?>>{ androidx.compose.runtime.ComposerKt.CompositionLocalMap }");
            InterfaceC37431dT<AbstractC24370xV<Object>, InterfaceC24760y8<Object>> interfaceC37431dT2 = (InterfaceC37431dT) LJI;
            C24450xd c24450xd2 = this.LJJIIZ;
            Object LJI2 = c24450xd2.LJI(c24450xd2.LJI, 1);
            o.LJII(LJI2, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentMap<androidx.compose.runtime.CompositionLocal<kotlin.Any?>, androidx.compose.runtime.State<kotlin.Any?>>{ androidx.compose.runtime.ComposerKt.CompositionLocalMap }");
            if (!LIZ() || !o.LJ(LJI2, interfaceC37431dT)) {
                LJLJLJ = LJLJLJ(LJJJIL, interfaceC37431dT);
                LJ = true ^ o.LJ(LJLJLJ, interfaceC37431dT2);
                if (LJ && !this.LJJIL) {
                    this.LJIJJLI.put(Integer.valueOf(this.LJJIIZ.LJI), LJLJLJ);
                }
                this.LJJ.LIZIZ(this.LJIL ? 1 : 0);
                this.LJIL = LJ;
                this.LJJIJIIJIL = LJLJLJ;
                LJJZZI(202, C24780yA.LJII, LJLJLJ, false);
            }
            this.LJIIL = this.LJJIIZ.LJIILJJIL() + this.LJIIL;
            LJLJLJ = interfaceC37431dT2;
        }
        LJ = false;
        this.LJJ.LIZIZ(this.LJIL ? 1 : 0);
        this.LJIL = LJ;
        this.LJJIJIIJIL = LJLJLJ;
        LJJZZI(202, C24780yA.LJII, LJLJLJ, false);
    }

    public final void LJLJJL(C22Z c22z) {
        Trace.beginSection("composer:updateNode");
        try {
            c22z.invoke(new C24830yF<>(this));
        } finally {
            Trace.endSection();
        }
    }

    public final void LJLJLLL(Object obj) {
        if (this.LJJIL) {
            this.LJJIJ.LJJJIL(obj);
            if (obj instanceof InterfaceC24390xX) {
                LJJLIIIJL(new IDqS425S0100000(obj, 14));
                this.LJ.add(obj);
                return;
            }
            return;
        }
        C24450xd c24450xd = this.LJJIIZ;
        int LJIIIIZZ = (c24450xd.LJIIJ - C78847Ux1.LJIIIIZZ(c24450xd.LJIIIIZZ, c24450xd.LIZIZ)) - 1;
        if (obj instanceof InterfaceC24390xX) {
            this.LJ.add(obj);
        }
        LJJLIIJ(true, new IDqS16S0101000(LJIIIIZZ, obj, 3));
    }

    public final int LJLL(int i) {
        int i2;
        Integer num;
        if (i < 0) {
            HashMap<Integer, Integer> hashMap = this.LJIILL;
            if (hashMap != null && (num = hashMap.get(Integer.valueOf(i))) != null) {
                return num.intValue();
            }
            return 0;
        }
        int[] iArr = this.LJIILJJIL;
        if (iArr != null && (i2 = iArr[i]) >= 0) {
            return i2;
        }
        return this.LJJIIZ.LJIIJ(i);
    }

    @Override // X.InterfaceC24520xk
    public final <V, T> void LJJII(V v, InterfaceC88471Ynr<? super T, ? super V, C76800UCe> block) {
        o.LJIIIZ(block, "block");
        IDqS180S0200000 iDqS180S0200000 = new IDqS180S0200000(v, block, 7);
        if (this.LJJIL) {
            ((ArrayList) this.LJJIJLIJ).add(iDqS180S0200000);
            return;
        }
        LJJLIIIJ();
        LJJL();
        LJJLIIIJL(iDqS180S0200000);
    }

    @Override // X.InterfaceC24520xk
    public final void LJJIIZ(int i, Object obj) {
        LJJZZI(i, obj, null, false);
    }

    public final void LJJJ(C25690zd invalidationsRequested, C40431iJ c40431iJ) {
        o.LJIIIZ(invalidationsRequested, "invalidationsRequested");
        if (this.LJFF.isEmpty()) {
            LJJJJI(invalidationsRequested, c40431iJ);
        } else {
            "Expected applyChanges() to have been called".toString();
            C24780yA.LIZJ("Expected applyChanges() to have been called");
            throw null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0094, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0047, code lost:
    
        r2 = (java.util.ArrayList) r9.LJIJ;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x004f, code lost:
    
        if (r2.size() <= 1) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0051, code lost:
    
        X.C40675Fxn.LJJLIIIJ(r2, new Y.IDComparatorS28S0000000(16));
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x005b, code lost:
    
        r9.LJIIJ = 0;
        r9.LJJIIJZLJL = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x005f, code lost:
    
        LJLIL();
        r4 = LJJJZ();
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0066, code lost:
    
        if (r4 == r11) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0068, code lost:
    
        if (r11 == null) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x006a, code lost:
    
        LJLJLLL(r11);
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x006d, code lost:
    
        X.C78966Uyw.LJJJJ(new kotlin.jvm.internal.IDqS32S0300000(r11, r9, r4, 11), new kotlin.jvm.internal.IDqS416S0100000(r9, 308), new kotlin.jvm.internal.IDqS416S0100000(r9, 309));
        LJJJJLL();
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0088, code lost:
    
        r9.LJJIIJZLJL = false;
        ((java.util.ArrayList) r9.LJIJ).clear();
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0095, code lost:
    
        r1 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0096, code lost:
    
        r9.LJJIIJZLJL = false;
        ((java.util.ArrayList) r9.LJIJ).clear();
        LJJIJIL();
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00a2, code lost:
    
        throw r1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJJJJI(X.C25690zd r10, X.C40431iJ r11) {
        /*
            r9 = this;
            boolean r0 = r9.LJJIIJZLJL
            r4 = 1
            r0 = r0 ^ 1
            if (r0 == 0) goto La8
            java.lang.String r0 = "Compose:recompose"
            android.os.Trace.beginSection(r0)
            X.0OA r0 = X.C0OF.LJIIIIZZ()     // Catch: java.lang.Throwable -> La3
            int r0 = r0.LIZLLL()     // Catch: java.lang.Throwable -> La3
            r9.LJJIII = r0     // Catch: java.lang.Throwable -> La3
            java.util.HashMap<java.lang.Integer, X.1dT<X.0xV<java.lang.Object>, X.0y8<java.lang.Object>>> r0 = r9.LJIJJLI     // Catch: java.lang.Throwable -> La3
            r0.clear()     // Catch: java.lang.Throwable -> La3
            int r8 = r10.LIZJ     // Catch: java.lang.Throwable -> La3
            r5 = 0
            r7 = 0
        L1f:
            if (r7 >= r8) goto L47
            java.lang.Object[] r0 = r10.LIZ     // Catch: java.lang.Throwable -> La3
            r6 = r0[r7]     // Catch: java.lang.Throwable -> La3
            java.lang.String r0 = "null cannot be cast to non-null type Key of androidx.compose.runtime.collection.IdentityArrayMap"
            kotlin.jvm.internal.o.LJII(r6, r0)     // Catch: java.lang.Throwable -> La3
            java.lang.Object[] r0 = r10.LIZIZ     // Catch: java.lang.Throwable -> La3
            r3 = r0[r7]     // Catch: java.lang.Throwable -> La3
            X.1bs r3 = (X.C36441bs) r3     // Catch: java.lang.Throwable -> La3
            X.1b9 r6 = (X.C35991b9) r6     // Catch: java.lang.Throwable -> La3
            X.0xY r0 = r6.LIZJ     // Catch: java.lang.Throwable -> La3
            if (r0 == 0) goto L91
            int r2 = r0.LIZ     // Catch: java.lang.Throwable -> La3
            java.util.List<X.0xz> r1 = r9.LJIJ     // Catch: java.lang.Throwable -> La3
            X.0xz r0 = new X.0xz     // Catch: java.lang.Throwable -> La3
            r0.<init>(r6, r2, r3)     // Catch: java.lang.Throwable -> La3
            java.util.ArrayList r1 = (java.util.ArrayList) r1     // Catch: java.lang.Throwable -> La3
            r1.add(r0)     // Catch: java.lang.Throwable -> La3
            int r7 = r7 + 1
            goto L1f
        L47:
            java.util.List<X.0xz> r2 = r9.LJIJ     // Catch: java.lang.Throwable -> La3
            java.util.ArrayList r2 = (java.util.ArrayList) r2     // Catch: java.lang.Throwable -> La3
            int r0 = r2.size()     // Catch: java.lang.Throwable -> La3
            if (r0 <= r4) goto L5b
            Y.IDComparatorS28S0000000 r1 = new Y.IDComparatorS28S0000000     // Catch: java.lang.Throwable -> La3
            r0 = 16
            r1.<init>(r0)     // Catch: java.lang.Throwable -> La3
            X.C40675Fxn.LJJLIIIJ(r2, r1)     // Catch: java.lang.Throwable -> La3
        L5b:
            r9.LJIIJ = r5     // Catch: java.lang.Throwable -> La3
            r9.LJJIIJZLJL = r4     // Catch: java.lang.Throwable -> La3
            r9.LJLIL()     // Catch: java.lang.Throwable -> L95
            java.lang.Object r4 = r9.LJJJZ()     // Catch: java.lang.Throwable -> L95
            if (r4 == r11) goto L6d
            if (r11 == 0) goto L6d
            r9.LJLJLLL(r11)     // Catch: java.lang.Throwable -> L95
        L6d:
            kotlin.jvm.internal.IDqS416S0100000 r3 = new kotlin.jvm.internal.IDqS416S0100000     // Catch: java.lang.Throwable -> L95
            r0 = 308(0x134, float:4.32E-43)
            r3.<init>(r9, r0)     // Catch: java.lang.Throwable -> L95
            kotlin.jvm.internal.IDqS416S0100000 r2 = new kotlin.jvm.internal.IDqS416S0100000     // Catch: java.lang.Throwable -> L95
            r0 = 309(0x135, float:4.33E-43)
            r2.<init>(r9, r0)     // Catch: java.lang.Throwable -> L95
            kotlin.jvm.internal.IDqS32S0300000 r1 = new kotlin.jvm.internal.IDqS32S0300000     // Catch: java.lang.Throwable -> L95
            r0 = 11
            r1.<init>(r11, r9, r4, r0)     // Catch: java.lang.Throwable -> L95
            X.C78966Uyw.LJJJJ(r1, r3, r2)     // Catch: java.lang.Throwable -> L95
            r9.LJJJJLL()     // Catch: java.lang.Throwable -> L95
            r9.LJJIIJZLJL = r5     // Catch: java.lang.Throwable -> La3
            java.util.List<X.0xz> r0 = r9.LJIJ     // Catch: java.lang.Throwable -> La3
            java.util.ArrayList r0 = (java.util.ArrayList) r0     // Catch: java.lang.Throwable -> La3
            r0.clear()     // Catch: java.lang.Throwable -> La3
        L91:
            android.os.Trace.endSection()
            return
        L95:
            r1 = move-exception
            r9.LJJIIJZLJL = r5     // Catch: java.lang.Throwable -> La3
            java.util.List<X.0xz> r0 = r9.LJIJ     // Catch: java.lang.Throwable -> La3
            java.util.ArrayList r0 = (java.util.ArrayList) r0     // Catch: java.lang.Throwable -> La3
            r0.clear()     // Catch: java.lang.Throwable -> La3
            r9.LJJIJIL()     // Catch: java.lang.Throwable -> La3
            throw r1     // Catch: java.lang.Throwable -> La3
        La3:
            r0 = move-exception
            android.os.Trace.endSection()
            throw r0
        La8:
            java.lang.String r0 = "Reentrant composition is not supported"
            r0.toString()
            X.C24780yA.LIZJ(r0)
            r0 = 0
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C35931b3.LJJJJI(X.0zd, X.1iJ):void");
    }

    public final void LJJJJIZL(int i, int i2) {
        if (i > 0 && i != i2) {
            LJJJJIZL(this.LJJIIZ.LJIIL(i), i2);
            if (this.LJJIIZ.LJIIIIZZ(i)) {
                this.LJJJI.LJFF(this.LJJIIZ.LJIIIZ(i));
            }
        }
    }

    public final void LJJJJZ(boolean z, C24530xl c24530xl) {
        this.LJIIIIZZ.LJFF(this.LJIIIZ);
        this.LJIIIZ = c24530xl;
        this.LJIIJJI.LIZIZ(this.LJIIJ);
        if (z) {
            this.LJIIJ = 0;
        }
        this.LJIILIIL.LIZIZ(this.LJIIL);
        this.LJIIL = 0;
    }

    public final void LJJLIIIJLJLI(int i, int i2) {
        if (i2 > 0) {
            if (i >= 0) {
                if (this.LJJJJJL == i) {
                    this.LJJJJLL += i2;
                    return;
                }
                LJJLI();
                this.LJJJJJL = i;
                this.LJJJJLL = i2;
                return;
            }
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("Invalid remove index ");
            LIZ.append(i);
            String LIZIZ = X1D.LIZIZ(LIZ);
            LIZIZ.toString();
            C24780yA.LIZJ(LIZIZ);
            throw null;
        }
    }

    public final void LJJLIIJ(boolean z, InterfaceC88473Ynt<? super InterfaceC24420xa<?>, ? super C24570xp, ? super InterfaceC24350xT, C76800UCe> interfaceC88473Ynt) {
        LJJLIIIIJ(z);
        LJJLIIIJL(interfaceC88473Ynt);
    }

    public final void LJL(int i, C35861aw c35861aw) {
        LJJZZI(i, c35861aw, null, false);
    }

    public final void LJLIIL(Object obj, boolean z) {
        if (z) {
            C24450xd c24450xd = this.LJJIIZ;
            if (c24450xd.LJIIIZ <= 0) {
                if (C78847Ux1.LJFF(c24450xd.LJI, c24450xd.LIZIZ)) {
                    c24450xd.LJIILLIIL();
                    return;
                } else {
                    "Expected a node group".toString();
                    throw new IllegalArgumentException("Expected a node group");
                }
            }
            return;
        }
        if (obj != null && this.LJJIIZ.LJ() != obj) {
            LJJLIIJ(false, new IDqS425S0100000(obj, 16));
        }
        this.LJJIIZ.LJIILLIIL();
    }

    public final boolean LJLILLLLZI(C35991b9 scope, Object obj) {
        o.LJIIIZ(scope, "scope");
        C24400xY c24400xY = scope.LIZJ;
        if (c24400xY == null) {
            return false;
        }
        C35871ax slots = this.LIZLLL;
        o.LJIIIZ(slots, "slots");
        int LJII = slots.LJII(c24400xY);
        if (!this.LJJIIJZLJL || LJII < this.LJJIIZ.LJI) {
            return false;
        }
        List<C24670xz> list = this.LJIJ;
        int LIZLLL = C24780yA.LIZLLL(LJII, list);
        C36441bs c36441bs = null;
        if (LIZLLL < 0) {
            int i = -(LIZLLL + 1);
            if (obj != null) {
                c36441bs = new C36441bs();
                c36441bs.add(obj);
            }
            ListProtector.add(list, i, new C24670xz(scope, LJII, c36441bs));
        } else if (obj == null) {
            ((C24670xz) ListProtector.get(list, LIZLLL)).LIZJ = null;
        } else {
            C36441bs<Object> c36441bs2 = ((C24670xz) ListProtector.get(list, LIZLLL)).LIZJ;
            if (c36441bs2 != null) {
                c36441bs2.add(obj);
            }
        }
        return true;
    }

    public final void LJLJJLL(int i, int i2) {
        if (LJLL(i) != i2) {
            if (i < 0) {
                HashMap<Integer, Integer> hashMap = this.LJIILL;
                if (hashMap == null) {
                    hashMap = new HashMap<>();
                    this.LJIILL = hashMap;
                }
                hashMap.put(Integer.valueOf(i), Integer.valueOf(i2));
                return;
            }
            int[] iArr = this.LJIILJJIL;
            if (iArr == null) {
                iArr = new int[this.LJJIIZ.LIZJ];
                C61898ORa.LJJI(iArr, -1);
                this.LJIILJJIL = iArr;
            }
            iArr[i] = i2;
        }
    }

    public final void LJLJL(int i, int i2) {
        int LJLL = LJLL(i);
        if (LJLL != i2) {
            int i3 = i2 - LJLL;
            int size = ((ArrayList) this.LJIIIIZZ.LIZ).size() - 1;
            while (i != -1) {
                int LJLL2 = LJLL(i) + i3;
                LJLJJLL(i, LJLL2);
                int i4 = size;
                while (true) {
                    if (-1 < i4) {
                        C24530xl c24530xl = (C24530xl) ListProtector.get((ArrayList) this.LJIIIIZZ.LIZ, i4);
                        if (c24530xl != null && c24530xl.LIZIZ(i, LJLL2)) {
                            size = i4 - 1;
                            break;
                        }
                        i4--;
                    } else {
                        break;
                    }
                }
                if (i < 0) {
                    i = this.LJJIIZ.LJIIIIZZ;
                } else if (!this.LJJIIZ.LJIIIIZZ(i)) {
                    i = this.LJJIIZ.LJIIL(i);
                } else {
                    return;
                }
            }
        }
    }

    public final InterfaceC37431dT<AbstractC24370xV<Object>, InterfaceC24760y8<Object>> LJLJLJ(InterfaceC37431dT<AbstractC24370xV<Object>, ? extends InterfaceC24760y8<? extends Object>> interfaceC37431dT, InterfaceC37431dT<AbstractC24370xV<Object>, ? extends InterfaceC24760y8<? extends Object>> interfaceC37431dT2) {
        C44551ox builder = interfaceC37431dT.builder();
        builder.putAll(interfaceC37431dT2);
        C44541ow LIZ = builder.LIZ();
        LJL(204, C24780yA.LJIIIZ);
        LJIJJ(LIZ);
        LJIJJ(interfaceC37431dT2);
        LJJJJJ(false);
        return LIZ;
    }

    public static final int LJJIJL(C24570xp c24570xp, C24400xY c24400xY, InterfaceC24420xa interfaceC24420xa) {
        boolean z;
        int i;
        int LJII;
        int LIZJ = c24570xp.LIZJ(c24400xY);
        boolean z2 = false;
        if (c24570xp.LJIIZILJ < LIZJ) {
            z = true;
        } else {
            z = false;
        }
        C24780yA.LJFF(z);
        LJJJLZIJ(c24570xp, interfaceC24420xa, LIZJ);
        int i2 = c24570xp.LJIIZILJ;
        int i3 = c24570xp.LJIJ;
        while (i3 >= 0 && !c24570xp.LJIJI(i3)) {
            i3 = c24570xp.LJJIIJ(i3);
        }
        int i4 = i3 + 1;
        int i5 = 0;
        while (i4 < i2) {
            if (c24570xp.LJIILLIIL(i2, i4)) {
                if (c24570xp.LJIJI(i4)) {
                    i5 = 0;
                }
                i4++;
            } else {
                if (c24570xp.LJIJI(i4)) {
                    LJII = 1;
                } else {
                    LJII = C78847Ux1.LJII(c24570xp.LJIILJJIL(i4), c24570xp.LIZIZ);
                }
                i5 += LJII;
                i4 += c24570xp.LJIILL(i4);
            }
        }
        while (true) {
            i = c24570xp.LJIIZILJ;
            if (i >= LIZJ) {
                break;
            }
            if (c24570xp.LJIILLIIL(LIZJ, i)) {
                int i6 = c24570xp.LJIIZILJ;
                if (i6 < c24570xp.LJI) {
                    if (C78847Ux1.LJFF(c24570xp.LJIILJJIL(i6), c24570xp.LIZIZ)) {
                        interfaceC24420xa.LIZLLL(c24570xp.LJJIII(c24570xp.LJIIZILJ));
                        i5 = 0;
                    }
                }
                c24570xp.LJJJ();
            } else {
                i5 += c24570xp.LJJIJL();
            }
        }
        if (i == LIZJ) {
            z2 = true;
        }
        C24780yA.LJFF(z2);
        return i5;
    }

    public static final void LJJIL(C35931b3 c35931b3, C24380xW c24380xW, C24570xp c24570xp) {
        c35931b3.getClass();
        C35871ax c35871ax = new C35871ax();
        C24570xp LJIILJJIL = c35871ax.LJIILJJIL();
        try {
            LJIILJJIL.LJ();
            C24320xQ<Object> c24320xQ = c24380xW.LIZ;
            InterfaceC24520xk.LIZ.getClass();
            LJIILJJIL.LJJJI(126665345, c24320xQ, C24500xi.LIZIZ, false);
            C24570xp.LJIJJ(LJIILJJIL);
            LJIILJJIL.LJJJIL(c24380xW.LIZIZ);
            c24570xp.LJJII(c24380xW.LJ, LJIILJJIL);
            LJIILJJIL.LJJIJL();
            LJIILJJIL.LJIIIIZZ();
            LJIILJJIL.LJIIIZ();
            LJIILJJIL.LJFF();
            c35931b3.LIZJ.LJIIIZ(c24380xW, new C24340xS(c35871ax));
        } catch (Throwable th) {
            LJIILJJIL.LJFF();
            throw th;
        }
    }

    public static final void LJJJLZIJ(C24570xp c24570xp, InterfaceC24420xa<Object> interfaceC24420xa, int i) {
        while (true) {
            int i2 = c24570xp.LJIJ;
            if (i <= i2 || i >= c24570xp.LJI) {
                if (i2 == 0 && i == 0) {
                    return;
                }
                c24570xp.LJJIJLIJ();
                if (c24570xp.LJIJI(c24570xp.LJIJ)) {
                    interfaceC24420xa.LJIIIIZZ();
                }
                c24570xp.LJIIIIZZ();
            } else {
                return;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0029, code lost:
    
        if (r3 != 126665345) goto L26;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int LJJJI(int r8, int r9, int r10) {
        /*
            r7 = this;
            if (r8 != r9) goto L3
        L2:
            return r10
        L3:
            X.0xd r6 = r7.LJJIIZ
            int[] r5 = r6.LIZIZ
            int r4 = r8 * 5
            int r0 = r4 + 1
            r1 = r5[r0]
            r0 = 536870912(0x20000000, float:1.0842022E-19)
            r1 = r1 & r0
            r3 = 0
            if (r1 == 0) goto L68
            r0 = 1
        L14:
            r2 = 126665345(0x78cc281, float:2.1179178E-34)
            if (r0 == 0) goto L39
            java.lang.Object r1 = r6.LJIIJJI(r8, r5)
            if (r1 == 0) goto L52
            boolean r0 = r1 instanceof java.lang.Enum
            if (r0 == 0) goto L2f
            java.lang.Enum r1 = (java.lang.Enum) r1
            int r3 = r1.ordinal()
        L29:
            if (r3 != r2) goto L52
        L2b:
            r10 = 126665345(0x78cc281, float:2.1179178E-34)
            goto L2
        L2f:
            boolean r0 = r1 instanceof X.C24320xQ
            if (r0 == 0) goto L34
            goto L2b
        L34:
            int r3 = r1.hashCode()
            goto L29
        L39:
            r3 = r5[r4]
            r0 = 207(0xcf, float:2.9E-43)
            if (r3 != r0) goto L29
            java.lang.Object r1 = r6.LIZIZ(r8, r5)
            if (r1 == 0) goto L52
            X.0xi r0 = X.InterfaceC24520xk.LIZ
            r0.getClass()
            X.0xh r0 = X.C24500xi.LIZIZ
            boolean r0 = kotlin.jvm.internal.o.LJ(r1, r0)
            if (r0 == 0) goto L63
        L52:
            X.0xd r0 = r7.LJJIIZ
            int r0 = r0.LJIIL(r8)
            int r1 = r7.LJJJI(r0, r9, r10)
            r0 = 3
            int r10 = java.lang.Integer.rotateLeft(r1, r0)
            r10 = r10 ^ r3
            goto L2
        L63:
            int r3 = r1.hashCode()
            goto L29
        L68:
            r0 = 0
            goto L14
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C35931b3.LJJJI(int, int, int):int");
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0012 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x000f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJJLJ(int r7, int r8, int r9) {
        /*
            r6 = this;
            X.0xd r5 = r6.LJJIIZ
            if (r7 != r8) goto L17
        L4:
            r9 = r7
        L5:
            if (r7 <= 0) goto L78
            if (r7 == r9) goto L78
            boolean r0 = r5.LJIIIIZZ(r7)
            if (r0 == 0) goto L12
            r6.LJJLIL()
        L12:
            int r7 = r5.LJIIL(r7)
            goto L5
        L17:
            if (r7 == r9) goto L5
            if (r8 != r9) goto L1c
            goto L5
        L1c:
            int r0 = r5.LJIIL(r7)
            if (r0 != r8) goto L24
            r9 = r8
            goto L5
        L24:
            int r0 = r5.LJIIL(r8)
            if (r0 != r7) goto L2b
            goto L4
        L2b:
            int r1 = r5.LJIIL(r7)
            int r0 = r5.LJIIL(r8)
            if (r1 != r0) goto L3a
            int r9 = r5.LJIIL(r7)
            goto L5
        L3a:
            r4 = 0
            r0 = r7
            r3 = 0
        L3d:
            if (r0 <= 0) goto L48
            if (r0 == r9) goto L48
            int r0 = r5.LJIIL(r0)
            int r3 = r3 + 1
            goto L3d
        L48:
            r0 = r8
            r2 = 0
        L4a:
            if (r0 <= 0) goto L55
            if (r0 == r9) goto L55
            int r0 = r5.LJIIL(r0)
            int r2 = r2 + 1
            goto L4a
        L55:
            int r1 = r3 - r2
            r9 = r7
            r0 = 0
        L59:
            if (r0 >= r1) goto L62
            int r9 = r5.LJIIL(r9)
            int r0 = r0 + 1
            goto L59
        L62:
            int r2 = r2 - r3
            r0 = r8
        L64:
            if (r4 >= r2) goto L6d
            int r0 = r5.LJIIL(r0)
            int r4 = r4 + 1
            goto L64
        L6d:
            if (r9 == r0) goto L5
            int r9 = r5.LJIIL(r9)
            int r0 = r5.LJIIL(r0)
            goto L6d
        L78:
            r6.LJJJJIZL(r8, r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C35931b3.LJJLJ(int, int, int):void");
    }

    public final void LJLJI(int i, Object obj, Object obj2) {
        if (obj == null) {
            if (obj2 != null && i == 207) {
                InterfaceC24520xk.LIZ.getClass();
                if (!o.LJ(obj2, C24500xi.LIZIZ)) {
                    this.LJJIZ = obj2.hashCode() ^ Integer.rotateLeft(this.LJJIZ, 3);
                    return;
                }
            }
            this.LJJIZ = i ^ Integer.rotateLeft(this.LJJIZ, 3);
            return;
        }
        if (obj instanceof Enum) {
            this.LJJIZ = ((Enum) obj).ordinal() ^ Integer.rotateLeft(this.LJJIZ, 3);
        } else {
            this.LJJIZ = obj.hashCode() ^ Integer.rotateLeft(this.LJJIZ, 3);
        }
    }

    public final void LJLJJI(int i, Object obj, Object obj2) {
        if (obj == null) {
            if (obj2 != null && i == 207) {
                InterfaceC24520xk.LIZ.getClass();
                if (!o.LJ(obj2, C24500xi.LIZIZ)) {
                    this.LJJIZ = Integer.rotateRight(obj2.hashCode() ^ this.LJJIZ, 3);
                    return;
                }
            }
            this.LJJIZ = Integer.rotateRight(i ^ this.LJJIZ, 3);
            return;
        }
        if (obj instanceof Enum) {
            this.LJJIZ = Integer.rotateRight(((Enum) obj).ordinal() ^ this.LJJIZ, 3);
        } else {
            this.LJJIZ = Integer.rotateRight(obj.hashCode() ^ this.LJJIZ, 3);
        }
    }

    public static final void LJJIJLIJ(C35931b3 c35931b3, C24320xQ c24320xQ, InterfaceC37431dT interfaceC37431dT, Object obj) {
        boolean z;
        c35931b3.LJJIIZ(126665345, c24320xQ);
        c35931b3.LJIJJ(obj);
        int i = c35931b3.LJJIZ;
        try {
            c35931b3.LJJIZ = 126665345;
            if (c35931b3.LJJIL) {
                C24570xp.LJIJJ(c35931b3.LJJIJ);
            }
            if (!c35931b3.LJJIL && !o.LJ(c35931b3.LJJIIZ.LJ(), interfaceC37431dT)) {
                z = true;
                c35931b3.LJIJJLI.put(Integer.valueOf(c35931b3.LJJIIZ.LJI), interfaceC37431dT);
                c35931b3.LJJZZI(202, C24780yA.LJII, interfaceC37431dT, false);
                boolean z2 = c35931b3.LJIL;
                c35931b3.LJIL = z;
                C40431iJ LJFF = C1DJ.LJFF(new IDqS189S0200000(c24320xQ, (C24320xQ<Object>) obj, (Object) 10), 694380496, true);
                C65777Prh.LJ(2, LJFF);
                LJFF.invoke(c35931b3, 1);
                c35931b3.LJIL = z2;
            }
            z = false;
            c35931b3.LJJZZI(202, C24780yA.LJII, interfaceC37431dT, false);
            boolean z22 = c35931b3.LJIL;
            c35931b3.LJIL = z;
            C40431iJ LJFF2 = C1DJ.LJFF(new IDqS189S0200000(c24320xQ, (C24320xQ<Object>) obj, (Object) 10), 694380496, true);
            C65777Prh.LJ(2, LJFF2);
            LJFF2.invoke(c35931b3, 1);
            c35931b3.LJIL = z22;
        } finally {
            c35931b3.LJJJJJ(false);
            c35931b3.LJJIZ = i;
            c35931b3.LJJJJJ(false);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:91:0x0189  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x018f A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final int LJJLL(X.C35931b3 r17, int r18, boolean r19, int r20) {
        /*
            Method dump skipped, instructions count: 428
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C35931b3.LJJLL(X.1b3, int, boolean, int):int");
    }

    public final void LJJZZI(int i, Object obj, Object obj2, boolean z) {
        Object valueOf;
        Object obj3;
        int i2;
        int LJII;
        Object obj4;
        C24530xl c24530xl = null;
        if (!this.LJIIZILJ) {
            LJLJI(i, obj, obj2);
            int i3 = 0;
            if (this.LJJIL) {
                this.LJJIIZ.LJIIIZ++;
                C24570xp c24570xp = this.LJJIJ;
                int i4 = c24570xp.LJIIZILJ;
                if (z) {
                    C24500xi c24500xi = InterfaceC24520xk.LIZ;
                    c24500xi.getClass();
                    C24490xh c24490xh = C24500xi.LIZIZ;
                    c24500xi.getClass();
                    c24570xp.LJJJI(125, c24490xh, c24490xh, true);
                } else if (obj2 != null) {
                    if (obj == null) {
                        InterfaceC24520xk.LIZ.getClass();
                        obj = C24500xi.LIZIZ;
                    }
                    c24570xp.LJJJI(i, obj, obj2, false);
                } else {
                    if (obj == null) {
                        InterfaceC24520xk.LIZ.getClass();
                        obj = C24500xi.LIZIZ;
                    }
                    InterfaceC24520xk.LIZ.getClass();
                    c24570xp.LJJJI(i, obj, C24500xi.LIZIZ, false);
                }
                C24530xl c24530xl2 = this.LJIIIZ;
                if (c24530xl2 != null) {
                    int i5 = (-2) - i4;
                    C24750y7 c24750y7 = new C24750y7(i, i5, -1, -1);
                    c24530xl2.LJ.put(Integer.valueOf(i5), new C24640xw(-1, this.LJIIJ - c24530xl2.LIZIZ, 0));
                    ((ArrayList) c24530xl2.LIZLLL).add(c24750y7);
                }
                LJJJJZ(z, null);
                return;
            }
            if (this.LJIIIZ == null) {
                if (this.LJJIIZ.LJFF() == i) {
                    C24450xd c24450xd = this.LJJIIZ;
                    int i6 = c24450xd.LJI;
                    if (i6 < c24450xd.LJII) {
                        obj4 = c24450xd.LJIIJJI(i6, c24450xd.LIZIZ);
                    } else {
                        obj4 = null;
                    }
                    if (o.LJ(obj, obj4)) {
                        LJLIIL(obj2, z);
                    }
                }
                C24450xd c24450xd2 = this.LJJIIZ;
                c24450xd2.getClass();
                ArrayList arrayList = new ArrayList();
                if (c24450xd2.LJIIIZ <= 0) {
                    for (int i7 = c24450xd2.LJI; i7 < c24450xd2.LJII; i7 += C78847Ux1.LIZLLL(i7, c24450xd2.LIZIZ)) {
                        int[] iArr = c24450xd2.LIZIZ;
                        int i8 = iArr[i7 * 5];
                        Object LJIIJJI = c24450xd2.LJIIJJI(i7, iArr);
                        if (C78847Ux1.LJFF(i7, c24450xd2.LIZIZ)) {
                            LJII = 1;
                        } else {
                            LJII = C78847Ux1.LJII(i7, c24450xd2.LIZIZ);
                        }
                        arrayList.add(new C24750y7(i8, i7, LJII, LJIIJJI));
                    }
                }
                this.LJIIIZ = new C24530xl(arrayList, this.LJIIJ);
            }
            C24530xl c24530xl3 = this.LJIIIZ;
            if (c24530xl3 != null) {
                if (obj != null) {
                    valueOf = new C36011bB(Integer.valueOf(i), obj);
                } else {
                    valueOf = Integer.valueOf(i);
                }
                HashMap hashMap = (HashMap) c24530xl3.LJFF.getValue();
                LinkedHashSet linkedHashSet = (LinkedHashSet) hashMap.get(valueOf);
                if (linkedHashSet != null && (obj3 = ORZ.LJLLL(linkedHashSet)) != null) {
                    HashSet hashSet = (HashSet) hashMap.get(valueOf);
                    if (hashSet != null) {
                        hashSet.remove(obj3);
                        if (hashSet.isEmpty()) {
                            hashMap.remove(valueOf);
                        }
                    }
                } else {
                    obj3 = null;
                }
                C24750y7 c24750y72 = (C24750y7) obj3;
                if (c24750y72 != null) {
                    ((ArrayList) c24530xl3.LIZLLL).add(c24750y72);
                    int i9 = c24750y72.LIZJ;
                    this.LJIIJ = c24530xl3.LIZ(c24750y72) + c24530xl3.LIZIZ;
                    C24640xw c24640xw = c24530xl3.LJ.get(Integer.valueOf(c24750y72.LIZJ));
                    if (c24640xw != null) {
                        i2 = c24640xw.LIZ;
                    } else {
                        i2 = -1;
                    }
                    int i10 = c24530xl3.LIZJ;
                    int i11 = i2 - i10;
                    if (i2 > i10) {
                        Iterator LJ = C06540Nm.LJ(c24530xl3.LJ, "groupInfos.values");
                        while (LJ.hasNext()) {
                            C24640xw c24640xw2 = (C24640xw) LJ.next();
                            int i12 = c24640xw2.LIZ;
                            if (i12 == i2) {
                                c24640xw2.LIZ = i10;
                            } else if (i10 <= i12 && i12 < i2) {
                                c24640xw2.LIZ = i12 + 1;
                            }
                        }
                    } else if (i10 > i2) {
                        Iterator LJ2 = C06540Nm.LJ(c24530xl3.LJ, "groupInfos.values");
                        while (LJ2.hasNext()) {
                            C24640xw c24640xw3 = (C24640xw) LJ2.next();
                            int i13 = c24640xw3.LIZ;
                            if (i13 == i2) {
                                c24640xw3.LIZ = i10;
                            } else if (i2 + 1 <= i13 && i13 < i10) {
                                c24640xw3.LIZ = i13 - 1;
                            }
                        }
                    }
                    C24450xd c24450xd3 = this.LJJIIZ;
                    this.LJJJIL = i9 - (c24450xd3.LJI - this.LJJJIL);
                    c24450xd3.LJIILIIL(i9);
                    if (i11 > 0) {
                        C531026o c531026o = new C531026o(i11);
                        LJJLIIIIJ(false);
                        LJJLIIIJLLLLLLLZ();
                        LJJLIIIJL(c531026o);
                    }
                    LJLIIL(obj2, z);
                } else {
                    this.LJJIIZ.LJIIIZ++;
                    this.LJJIL = true;
                    this.LJJIJIIJIL = null;
                    if (this.LJJIJ.LJIJI) {
                        C24570xp LJIILJJIL = this.LJJIIZI.LJIILJJIL();
                        this.LJJIJ = LJIILJJIL;
                        LJIILJJIL.LJJIJLIJ();
                        this.LJJIJIIJI = false;
                        this.LJJIJIIJIL = null;
                    }
                    this.LJJIJ.LJ();
                    C24570xp c24570xp2 = this.LJJIJ;
                    int i14 = c24570xp2.LJIIZILJ;
                    if (z) {
                        C24500xi c24500xi2 = InterfaceC24520xk.LIZ;
                        c24500xi2.getClass();
                        C24490xh c24490xh2 = C24500xi.LIZIZ;
                        c24500xi2.getClass();
                        c24570xp2.LJJJI(125, c24490xh2, c24490xh2, true);
                    } else if (obj2 != null) {
                        if (obj == null) {
                            InterfaceC24520xk.LIZ.getClass();
                            obj = C24500xi.LIZIZ;
                        }
                        c24570xp2.LJJJI(i, obj, obj2, false);
                    } else {
                        if (obj == null) {
                            InterfaceC24520xk.LIZ.getClass();
                            obj = C24500xi.LIZIZ;
                        }
                        InterfaceC24520xk.LIZ.getClass();
                        c24570xp2.LJJJI(i, obj, C24500xi.LIZIZ, false);
                    }
                    this.LJJIJL = this.LJJIJ.LIZIZ(i14);
                    int i15 = (-2) - i14;
                    C24750y7 c24750y73 = new C24750y7(i, i15, -1, -1);
                    c24530xl3.LJ.put(Integer.valueOf(i15), new C24640xw(-1, this.LJIIJ - c24530xl3.LIZIZ, 0));
                    ((ArrayList) c24530xl3.LIZLLL).add(c24750y73);
                    ArrayList arrayList2 = new ArrayList();
                    if (!z) {
                        i3 = this.LJIIJ;
                    }
                    c24530xl = new C24530xl(arrayList2, i3);
                }
            }
            LJJJJZ(z, c24530xl);
            return;
        }
        "A call to createNode(), emitNode() or useNode() expected".toString();
        C24780yA.LIZJ("A call to createNode(), emitNode() or useNode() expected");
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x004e, code lost:
    
        if (r0 == null) goto L19;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final <R> R LJJLIIIJJI(X.InterfaceC35841au r11, X.InterfaceC35841au r12, java.lang.Integer r13, java.util.List<X.OSZ<X.C35991b9, X.C36441bs<java.lang.Object>>> r14, X.InterfaceC65784Pro<? extends R> r15) {
        /*
            r10 = this;
            boolean r5 = r10.LJJJJI
            boolean r4 = r10.LJJIIJZLJL
            int r3 = r10.LJIIJ
            r1 = 0
            r10.LJJJJI = r1     // Catch: java.lang.Throwable -> L5b
            r0 = 1
            r10.LJJIIJZLJL = r0     // Catch: java.lang.Throwable -> L5b
            r10.LJIIJ = r1     // Catch: java.lang.Throwable -> L5b
            int r8 = r14.size()     // Catch: java.lang.Throwable -> L5b
            r7 = 0
        L13:
            if (r7 >= r8) goto L3f
            java.lang.Object r0 = r14.get(r7)     // Catch: java.lang.Throwable -> L5b
            X.OSZ r0 = (X.OSZ) r0     // Catch: java.lang.Throwable -> L5b
            java.lang.Object r6 = r0.getFirst()     // Catch: java.lang.Throwable -> L5b
            X.1b9 r6 = (X.C35991b9) r6     // Catch: java.lang.Throwable -> L5b
            java.lang.Object r9 = r0.getSecond()     // Catch: java.lang.Throwable -> L5b
            X.1bs r9 = (X.C36441bs) r9     // Catch: java.lang.Throwable -> L5b
            if (r9 == 0) goto L38
            int r2 = r9.LJLIL     // Catch: java.lang.Throwable -> L5b
            r1 = 0
        L2c:
            if (r1 >= r2) goto L3c
            java.lang.Object r0 = r9.get(r1)     // Catch: java.lang.Throwable -> L5b
            r10.LJLILLLLZI(r6, r0)     // Catch: java.lang.Throwable -> L5b
            int r1 = r1 + 1
            goto L2c
        L38:
            r0 = 0
            r10.LJLILLLLZI(r6, r0)     // Catch: java.lang.Throwable -> L5b
        L3c:
            int r7 = r7 + 1
            goto L13
        L3f:
            if (r11 == 0) goto L50
            if (r13 == 0) goto L44
            goto L46
        L44:
            r0 = -1
            goto L4a
        L46:
            int r0 = r13.intValue()     // Catch: java.lang.Throwable -> L5b
        L4a:
            java.lang.Object r0 = r11.LIZ(r12, r0, r15)     // Catch: java.lang.Throwable -> L5b
            if (r0 != 0) goto L54
        L50:
            java.lang.Object r0 = r15.invoke()     // Catch: java.lang.Throwable -> L5b
        L54:
            r10.LJJJJI = r5
            r10.LJJIIJZLJL = r4
            r10.LJIIJ = r3
            return r0
        L5b:
            r0 = move-exception
            r10.LJJJJI = r5
            r10.LJJIIJZLJL = r4
            r10.LJIIJ = r3
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C35931b3.LJJLIIIJJI(X.1au, X.1au, java.lang.Integer, java.util.List, X.Pro):java.lang.Object");
    }

    public C35931b3(AbstractC35801aq abstractC35801aq, AbstractC24810yD parentContext, C35871ax c35871ax, java.util.Set set, List list, List list2, InterfaceC35841au composition) {
        o.LJIIIZ(parentContext, "parentContext");
        o.LJIIIZ(composition, "composition");
        this.LIZIZ = abstractC35801aq;
        this.LIZJ = parentContext;
        this.LIZLLL = c35871ax;
        this.LJ = set;
        this.LJFF = list;
        this.LJI = list2;
        this.LJII = composition;
        this.LJIIIIZZ = new C24740y6(0);
        this.LJIIJJI = new C24660xy();
        this.LJIILIIL = new C24660xy();
        this.LJIJ = new ArrayList();
        this.LJIJI = new C24660xy();
        this.LJIJJ = C78880UxY.LJJLJLI();
        this.LJIJJLI = new HashMap<>();
        this.LJJ = new C24660xy();
        this.LJJIFFI = -1;
        C0OF.LJIIIIZZ();
        this.LJJIIJ = new C24740y6(0);
        C24450xd LJIIIZ = c35871ax.LJIIIZ();
        LJIIIZ.LIZJ();
        this.LJJIIZ = LJIIIZ;
        C35871ax c35871ax2 = new C35871ax();
        this.LJJIIZI = c35871ax2;
        C24570xp LJIILJJIL = c35871ax2.LJIILJJIL();
        LJIILJJIL.LJFF();
        this.LJJIJ = LJIILJJIL;
        C24450xd LJIIIZ2 = this.LJJIIZI.LJIIIZ();
        try {
            C24400xY LIZ = LJIIIZ2.LIZ(0);
            LJIIIZ2.LIZJ();
            this.LJJIJL = LIZ;
            this.LJJIJLIJ = new ArrayList();
            this.LJJJI = new C24740y6(0);
            this.LJJJJI = true;
            this.LJJJJIZL = new C24660xy();
            this.LJJJJJ = new C24740y6(0);
            this.LJJJJJL = -1;
            this.LJJJJL = -1;
            this.LJJJJLI = -1;
        } catch (Throwable th) {
            LJIIIZ2.LIZJ();
            throw th;
        }
    }
}
