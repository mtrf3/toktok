package X;

import java.util.concurrent.atomic.AtomicReference;
import kotlin.jvm.internal.IDqS1S0301000;
import kotlin.jvm.internal.IDqS416S0100000;
import kotlin.jvm.internal.o;

/* renamed from: X.0oR, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C18750oR {
    public static final void LJ(C18810oX c18810oX) {
        C14760i0 c14760i0 = c18810oX.LIZLLL;
        if (c14760i0 != null) {
            C14780i2 editProcessor = c18810oX.LIZJ;
            IDqS416S0100000 onValueChange = c18810oX.LJIIZILJ;
            o.LJIIIZ(editProcessor, "editProcessor");
            o.LJIIIZ(onValueChange, "onValueChange");
            onValueChange.invoke(C15010iP.LIZ(editProcessor.LIZ, null, 0L, 3));
            C15020iQ c15020iQ = c14760i0.LIZ;
            c15020iQ.getClass();
            AtomicReference<C14760i0> atomicReference = c15020iQ.LIZIZ;
            while (true) {
                if (atomicReference.compareAndSet(c14760i0, null)) {
                    c15020iQ.LIZ.LIZ();
                    break;
                } else if (atomicReference.get() != c14760i0) {
                    break;
                }
            }
        }
        c18810oX.LIZLLL = null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x00b8, code lost:
    
        if (r1 == X.C24500xi.LIZIZ) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0037, code lost:
    
        if (r2 == X.C24500xi.LIZIZ) goto L10;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void LIZJ(final X.C20140qg r12, X.InterfaceC24520xk r13, int r14) {
        /*
            java.lang.String r0 = "manager"
            kotlin.jvm.internal.o.LJIIIZ(r12, r0)
            r0 = -1436003720(0xffffffffaa685278, float:-2.0634351E-13)
            X.1b3 r10 = r13.LJIL(r0)
            X.0oX r0 = r12.LIZLLL
            r3 = 0
            if (r0 == 0) goto Ld1
            androidx.compose.runtime.ParcelableSnapshotMutableState r0 = r0.LJIILIIL
            java.lang.Object r0 = r0.getValue()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r1 = r0.booleanValue()
            r0 = 1
            if (r1 != r0) goto Ld1
            r4 = 1157296644(0x44faf204, float:2007.563)
            r10.LJJIIJ(r4)
            boolean r0 = r10.LJIJJ(r12)
            java.lang.Object r2 = r10.LJJJZ()
            if (r0 != 0) goto L39
            X.0xi r0 = X.InterfaceC24520xk.LIZ
            r0.getClass()
            X.0xh r0 = X.C24500xi.LIZIZ
            if (r2 != r0) goto L41
        L39:
            X.1YX r2 = new X.1YX
            r2.<init>()
            r10.LJLJLLL(r2)
        L41:
            r10.LJJJJJ(r3)
            X.0oF r2 = (X.InterfaceC18630oF) r2
            X.1o7 r0 = X.AnonymousClass057.LJ
            java.lang.Object r8 = r10.LJIILLIIL(r0)
            X.0vt r8 = (X.InterfaceC23370vt) r8
            java.lang.String r0 = "density"
            kotlin.jvm.internal.o.LJIIIZ(r8, r0)
            X.0iJ r6 = r12.LIZIZ
            X.0iP r0 = r12.LJIIIZ()
            long r0 = r0.LIZIZ
            r5 = 32
            long r0 = r0 >> r5
            int r5 = (int) r0
            int r6 = r6.LIZIZ(r5)
            X.0oX r0 = r12.LIZLLL
            r5 = 0
            if (r0 == 0) goto Le2
            X.0oZ r0 = r0.LIZJ()
        L6d:
            kotlin.jvm.internal.o.LJI(r0)
            X.0VG r1 = r0.LIZ
            X.0VF r0 = r1.LIZ
            X.0Uu r0 = r0.LIZ
            int r0 = r0.length()
            int r0 = X.C78842Uww.LJIIL(r6, r3, r0)
            X.0ax r7 = r1.LIZJ(r0)
            float r6 = r7.LIZ
            float r0 = X.C18740oQ.LIZIZ
            float r1 = r8.LJJJJIZL(r0)
            r0 = 2
            float r0 = (float) r0
            float r1 = r1 / r0
            float r1 = r1 + r6
            float r0 = r7.LIZLLL
            long r6 = X.C78923UyF.LIZ(r1, r0)
            X.1M1 r1 = X.InterfaceC07790Sh.LJJJI
            X.2FP r0 = new X.2FP
            r0.<init>(r2, r5)
            X.0Sh r2 = X.C11F.LIZIZ(r1, r2, r0)
            X.0av r0 = new X.0av
            r0.<init>(r6)
            r10.LJJIIJ(r4)
            boolean r0 = r10.LJIJJ(r0)
            java.lang.Object r1 = r10.LJJJZ()
            if (r0 != 0) goto Lba
            X.0xi r0 = X.InterfaceC24520xk.LIZ
            r0.getClass()
            X.0xh r0 = X.C24500xi.LIZIZ
            if (r1 != r0) goto Lc2
        Lba:
            X.23d r1 = new X.23d
            r1.<init>(r6)
            r10.LJLJLLL(r1)
        Lc2:
            r10.LJJJJJ(r3)
            X.Yns r1 = (X.InterfaceC88472Yns) r1
            X.0Sh r8 = com.google.gson.internal.b.LJJII(r2, r3, r1)
            r9 = 0
            r11 = 384(0x180, float:5.38E-43)
            X.C18490o1.LIZ(r6, r8, r9, r10, r11)
        Ld1:
            X.1b9 r2 = r10.LJJJJLI()
            if (r2 != 0) goto Ld8
        Ld7:
            return
        Ld8:
            kotlin.jvm.internal.IDqS11S0101000 r1 = new kotlin.jvm.internal.IDqS11S0101000
            r0 = 8
            r1.<init>(r12, r14, r0)
            r2.LIZLLL = r1
            goto Ld7
        Le2:
            r0 = r5
            goto L6d
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C18750oR.LIZJ(X.0qg, X.0xk, int):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void LIZLLL(C20140qg c20140qg, boolean z, InterfaceC24520xk interfaceC24520xk, int i) {
        C18830oZ LIZJ;
        C0VG c0vg;
        C18810oX c18810oX;
        boolean z2;
        C35931b3 LJIL = interfaceC24520xk.LJIL(626339208);
        if (z) {
            C18810oX c18810oX2 = c20140qg.LIZLLL;
            if (c18810oX2 != null && (LIZJ = c18810oX2.LIZJ()) != null && (c0vg = LIZJ.LIZ) != null && (c18810oX = c20140qg.LIZLLL) != null && (!c18810oX.LJIILJJIL)) {
                if (!C08350Ul.LIZIZ(c20140qg.LJIIIZ().LIZIZ)) {
                    int LIZIZ = c20140qg.LIZIZ.LIZIZ((int) (c20140qg.LJIIIZ().LIZIZ >> 32));
                    int LIZIZ2 = c20140qg.LIZIZ.LIZIZ(C08350Ul.LIZJ(c20140qg.LJIIIZ().LIZIZ));
                    EnumC22040tk LIZ = c0vg.LIZ(LIZIZ);
                    EnumC22040tk LIZ2 = c0vg.LIZ(Math.max(LIZIZ2 - 1, 0));
                    LJIL.LJJIIJ(-498393098);
                    C18810oX c18810oX3 = c20140qg.LIZLLL;
                    if (c18810oX3 != null && ((Boolean) c18810oX3.LJIIJJI.getValue()).booleanValue()) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    if (z2) {
                        C20160qi.LIZ(true, LIZ, c20140qg, LJIL, 518);
                    }
                    LJIL.LJJJJJ(false);
                    C18810oX c18810oX4 = c20140qg.LIZLLL;
                    if (c18810oX4 != null && ((Boolean) c18810oX4.LJIIL.getValue()).booleanValue()) {
                        C20160qi.LIZ(false, LIZ2, c20140qg, LJIL, 518);
                    }
                }
                C18810oX c18810oX5 = c20140qg.LIZLLL;
                if (c18810oX5 != null) {
                    if (true ^ o.LJ(c20140qg.LJIILL.LIZ.LJLIL, c20140qg.LJIIIZ().LIZ.LJLIL)) {
                        c18810oX5.LJIIJ = false;
                    }
                    if (c18810oX5.LIZIZ()) {
                        if (c18810oX5.LJIIJ) {
                            c20140qg.LJIILIIL();
                        } else {
                            c20140qg.LJIIJ();
                        }
                    }
                }
            }
        } else {
            c20140qg.LJIIJ();
        }
        C35991b9 LJJJJLI = LJIL.LJJJJLI();
        if (LJJJJLI == null) {
            return;
        }
        LJJJJLI.LIZLLL = new C23G(c20140qg, z, i);
    }

    public static final void LIZIZ(InterfaceC07790Sh interfaceC07790Sh, C20140qg c20140qg, InterfaceC88471Ynr<? super InterfaceC24520xk, ? super Integer, C76800UCe> interfaceC88471Ynr, InterfaceC24520xk interfaceC24520xk, int i) {
        C35931b3 LJIL = interfaceC24520xk.LJIL(-20551815);
        int i2 = (i & 14) | 384;
        LJIL.LJJIIJ(733328855);
        InterfaceC07760Se.LJJJ.getClass();
        InterfaceC273215k LIZJ = C0YZ.LIZJ(C07730Sb.LIZIZ, true, LJIL);
        LJIL.LJJIIJ(-1323940314);
        Object LJIILLIIL = LJIL.LJIILLIIL(AnonymousClass057.LJ);
        Object LJIILLIIL2 = LJIL.LJIILLIIL(AnonymousClass057.LJIIJ);
        InterfaceC015404g interfaceC015404g = (InterfaceC015404g) LJIL.LJIILLIIL(AnonymousClass057.LJIILJJIL);
        InterfaceC03730Cr.LJ.getClass();
        C46041rM c46041rM = C03720Cq.LIZIZ;
        C40431iJ LJIIL = C56509MFt.LJIIL(interfaceC07790Sh);
        int i3 = ((((i2 << 3) & 112) << 9) & 7168) | 6;
        if (LJIL.LIZIZ instanceof InterfaceC24420xa) {
            LJIL.LJIJI();
            if (LJIL.LJJIL) {
                LJIL.LJJI(c46041rM);
            } else {
                LJIL.LIZIZ();
            }
            LJIL.LJJI = false;
            C24830yF.LIZ(LJIL, LIZJ, C03720Cq.LJ);
            C24830yF.LIZ(LJIL, LJIILLIIL, C03720Cq.LIZLLL);
            C24830yF.LIZ(LJIL, LJIILLIIL2, C03720Cq.LJFF);
            LJIIL.invoke(V10.LIZLLL(LJIL, interfaceC015404g, C03720Cq.LJI, LJIL), LJIL, Integer.valueOf((i3 >> 3) & 112));
            LJIL.LJJIIJ(2058660585);
            LJIL.LJJIIJ(-2137368960);
            if (((i3 >> 9) & 14 & 11) != 2 || !LJIL.LIZ()) {
                LJIL.LJJIIJ(1524757375);
                if (((((i2 >> 6) & 112) | 6) & 81) != 16 || !LJIL.LIZ()) {
                    C18730oP.LIZ(c20140qg, interfaceC88471Ynr, LJIL, ((i >> 3) & 112) | 8);
                } else {
                    LJIL.LIZLLL();
                }
                LJIL.LJJJJJ(false);
            } else {
                LJIL.LIZLLL();
            }
            LJIL.LJJJJJ(false);
            LJIL.LJJJJJ(false);
            LJIL.LJIJ();
            LJIL.LJJJJJ(false);
            LJIL.LJJJJJ(false);
            C35991b9 LJJJJLI = LJIL.LJJJJLI();
            if (LJJJJLI == null) {
                return;
            }
            LJJJJLI.LIZLLL = new IDqS1S0301000(interfaceC07790Sh, (InterfaceC07790Sh) c20140qg, (C20140qg) interfaceC88471Ynr, (InterfaceC88471Ynr<? super InterfaceC24520xk, ? super Integer, C76800UCe>) i, 7);
            return;
        }
        C78929UyL.LJIILJJIL();
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:127:0x038f, code lost:
    
        if (r32 > (r13 + 5000)) goto L152;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x018f, code lost:
    
        if (r4 == X.C24500xi.LIZIZ) goto L109;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x01ca, code lost:
    
        if (r7 == X.C24500xi.LIZIZ) goto L114;
     */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0327  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0368  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0381  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x03a6  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x0417  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x043c  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x04aa  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x04c7  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x051d  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x0669  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x066c  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x0673  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x0676  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x067e  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x0684  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void LIZ(X.C15010iP r47, X.InterfaceC88472Yns<? super X.C15010iP, X.C76800UCe> r48, X.InterfaceC07790Sh r49, X.C08370Un r50, X.InterfaceC14810i5 r51, X.InterfaceC88472Yns<? super X.C0VG, X.C76800UCe> r52, X.C1OH r53, X.AbstractC11740d8 r54, boolean r55, int r56, X.C14870iB r57, X.C18850ob r58, boolean r59, boolean r60, X.InterfaceC88473Ynt<? super X.InterfaceC88471Ynr<? super X.InterfaceC24520xk, ? super java.lang.Integer, X.C76800UCe>, ? super X.InterfaceC24520xk, ? super java.lang.Integer, X.C76800UCe> r61, X.InterfaceC24520xk r62, int r63, int r64, int r65) {
        /*
            Method dump skipped, instructions count: 2063
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C18750oR.LIZ(X.0iP, X.Yns, X.0Sh, X.0Un, X.0i5, X.Yns, X.1OH, X.0d8, boolean, int, X.0iB, X.0ob, boolean, boolean, X.Ynt, X.0xk, int, int, int):void");
    }
}
