package X;

import android.os.Trace;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import com.ss.android.ugc.effectmanager.common.utils.FileUtils;
import java.util.List;
import java.util.UUID;
import kotlin.jvm.internal.IDqS172S0200000;
import kotlin.jvm.internal.IDqS189S0200000;
import kotlin.jvm.internal.IDqS416S0100000;
import kotlin.jvm.internal.o;

/* renamed from: X.0zr, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C25830zr {
    public static final C44021o6 LIZ = C24410xZ.LIZJ(C27I.LJLIL);

    public static final boolean LIZJ(View view) {
        WindowManager.LayoutParams layoutParams;
        o.LJIIIZ(view, "<this>");
        ViewGroup.LayoutParams layoutParams2 = view.getRootView().getLayoutParams();
        if (layoutParams2 instanceof WindowManager.LayoutParams) {
            layoutParams = (WindowManager.LayoutParams) layoutParams2;
        } else {
            layoutParams = null;
        }
        if (layoutParams == null || (layoutParams.flags & FileUtils.BUFFER_SIZE) == 0) {
            return false;
        }
        return true;
    }

    public static final void LIZ(AnonymousClass101 popupPositionProvider, InterfaceC65784Pro<C76800UCe> interfaceC65784Pro, C25780zm c25780zm, InterfaceC88471Ynr<? super InterfaceC24520xk, ? super Integer, C76800UCe> content, InterfaceC24520xk interfaceC24520xk, int i, int i2) {
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        C25780zm c25780zm2 = c25780zm;
        InterfaceC65784Pro<C76800UCe> interfaceC65784Pro2 = interfaceC65784Pro;
        o.LJIIIZ(popupPositionProvider, "popupPositionProvider");
        o.LJIIIZ(content, "content");
        C35931b3 LJIL = interfaceC24520xk.LJIL(-830247068);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 14) == 0) {
            if (LJIL.LJIJJ(popupPositionProvider)) {
                i4 = 4;
            } else {
                i4 = 2;
            }
            i3 = i4 | i;
        } else {
            i3 = i;
        }
        int i8 = i2 & 2;
        if (i8 != 0) {
            i3 |= 48;
        } else if ((i & 112) == 0) {
            if (LJIL.LJIJJ(interfaceC65784Pro2)) {
                i5 = 32;
            } else {
                i5 = 16;
            }
            i3 |= i5;
        }
        if ((i & 896) == 0) {
            if ((i2 & 4) == 0 && LJIL.LJIJJ(c25780zm2)) {
                i7 = 256;
            } else {
                i7 = 128;
            }
            i3 |= i7;
        }
        if ((i2 & 8) != 0) {
            i3 |= 3072;
        } else if ((i & 7168) == 0) {
            if (LJIL.LJIJJ(content)) {
                i6 = 2048;
            } else {
                i6 = 1024;
            }
            i3 |= i6;
        }
        if ((i3 & 5851) != 1170 || !LJIL.LIZ()) {
            LJIL.LJJZZIII();
            if ((i & 1) == 0 || LJIL.LJJJLIIL()) {
                if (i8 != 0) {
                    interfaceC65784Pro2 = null;
                }
                if ((i2 & 4) != 0) {
                    c25780zm2 = new C25780zm(false, 63);
                }
            } else {
                LJIL.LIZLLL();
            }
            LJIL.LJJJJJL();
            View view = (View) LJIL.LJIILLIIL(C04Q.LJI);
            C44031o7 c44031o7 = AnonymousClass057.LJ;
            InterfaceC23370vt interfaceC23370vt = (InterfaceC23370vt) LJIL.LJIILLIIL(c44031o7);
            String str = (String) LJIL.LJIILLIIL(LIZ);
            C44031o7 c44031o72 = AnonymousClass057.LJIIJ;
            final EnumC23500w6 enumC23500w6 = (EnumC23500w6) LJIL.LJIILLIIL(c44031o72);
            AbstractC24810yD LJJ = C78929UyL.LJJ(LJIL);
            InterfaceC35811ar LJJJJIZL = C78966Uyw.LJJJJIZL(content, LJIL);
            UUID popupId = (UUID) C73975T1n.LJIIIIZZ(new Object[0], null, C27P.LJLIL, LJIL, 6);
            LJIL.LJJIIJ(-492369756);
            Object LJJJZ = LJIL.LJJJZ();
            InterfaceC24520xk.LIZ.getClass();
            Object obj = LJJJZ;
            if (LJJJZ == C24500xi.LIZIZ) {
                o.LJIIIIZZ(popupId, "popupId");
                C36541c2 c36541c2 = r17;
                C36541c2 c36541c22 = new C36541c2(interfaceC65784Pro2, c25780zm2, str, view, interfaceC23370vt, popupPositionProvider, popupId);
                c36541c2.LJIIJ(LJJ, C1DJ.LJFF(new IDqS189S0200000(c36541c2, LJJJJIZL, 11), 1302892335, true));
                LJIL.LJLJLLL(c36541c2);
                obj = c36541c2;
            }
            LJIL.LJJJJJ(false);
            final C36541c2 c36541c23 = (C36541c2) obj;
            C24610xt.LIZIZ(c36541c23, new C27K(c36541c23, interfaceC65784Pro2, c25780zm2, str, enumC23500w6), LJIL);
            C24610xt.LJI(new C27L(c36541c23, interfaceC65784Pro2, c25780zm2, str, enumC23500w6), LJIL);
            C24610xt.LIZIZ(popupPositionProvider, new IDqS172S0200000(c36541c23, popupPositionProvider, 92), LJIL);
            C24610xt.LJ(c36541c23, new C55622Gg(c36541c23, null), LJIL);
            InterfaceC07790Sh LJJIIJZLJL = V0N.LJJIIJZLJL(InterfaceC07790Sh.LJJJI, new IDqS416S0100000(c36541c23, 326));
            InterfaceC273215k interfaceC273215k = new InterfaceC273215k() { // from class: X.1bx
                @Override // X.InterfaceC273215k
                public final /* synthetic */ int LIZ(AbstractC538029g abstractC538029g, List list, int i9) {
                    return C79061V1d.LIZIZ(this, abstractC538029g, list, i9);
                }

                @Override // X.InterfaceC273215k
                public final /* synthetic */ int LIZIZ(AbstractC538029g abstractC538029g, List list, int i9) {
                    return C79061V1d.LIZLLL(this, abstractC538029g, list, i9);
                }

                @Override // X.InterfaceC273215k
                public final /* synthetic */ int LIZLLL(AbstractC538029g abstractC538029g, List list, int i9) {
                    return C79061V1d.LIZ(this, abstractC538029g, list, i9);
                }

                @Override // X.InterfaceC273215k
                public final /* synthetic */ int LJ(AbstractC538029g abstractC538029g, List list, int i9) {
                    return C79061V1d.LIZJ(this, abstractC538029g, list, i9);
                }

                @Override // X.InterfaceC273215k
                public final InterfaceC273515n LIZJ(InterfaceC44861pS Layout, List<? extends InterfaceC39071g7> list, long j) {
                    InterfaceC273515n LJJLIL;
                    o.LJIIIZ(Layout, "$this$Layout");
                    o.LJIIIZ(list, "<anonymous parameter 0>");
                    C36541c2.this.setParentLayoutDirection(enumC23500w6);
                    LJJLIL = Layout.LJJLIL(0, 0, C113554cx.LJJJLIIL(), C27N.LJLIL);
                    return LJJLIL;
                }
            };
            LJIL.LJJIIJ(-1323940314);
            Trace.beginSection("Layout:layout");
            try {
                InterfaceC23370vt interfaceC23370vt2 = (InterfaceC23370vt) LJIL.LJIILLIIL(c44031o7);
                EnumC23500w6 enumC23500w62 = (EnumC23500w6) LJIL.LJIILLIIL(c44031o72);
                InterfaceC015404g interfaceC015404g = (InterfaceC015404g) LJIL.LJIILLIIL(AnonymousClass057.LJIILJJIL);
                InterfaceC03730Cr.LJ.getClass();
                C46041rM c46041rM = C03720Cq.LIZIZ;
                C40431iJ LJIIL = C56509MFt.LJIIL(LJJIIJZLJL);
                if (LJIL.LIZIZ instanceof InterfaceC24420xa) {
                    LJIL.LJIJI();
                    if (LJIL.LJJIL) {
                        LJIL.LJJI(c46041rM);
                    } else {
                        LJIL.LIZIZ();
                    }
                    LJIL.LJJI = false;
                    C24830yF.LIZ(LJIL, interfaceC273215k, C03720Cq.LJ);
                    C24830yF.LIZ(LJIL, interfaceC23370vt2, C03720Cq.LIZLLL);
                    C24830yF.LIZ(LJIL, enumC23500w62, C03720Cq.LJFF);
                    C24830yF.LIZ(LJIL, interfaceC015404g, C03720Cq.LJI);
                    LJIL.LJIIIIZZ();
                    LJIIL.invoke(new C24440xc(LJIL), LJIL, 0);
                    LJIL.LJJIIJ(2058660585);
                    LJIL.LJJIIJ(2085825549);
                    LJIL.LJJJJJ(false);
                    LJIL.LJJJJJ(false);
                    LJIL.LJIJ();
                    Trace.endSection();
                    LJIL.LJJJJJ(false);
                } else {
                    C78929UyL.LJIILJJIL();
                    throw null;
                }
            } catch (Throwable th) {
                Trace.endSection();
                throw th;
            }
        } else {
            LJIL.LIZLLL();
        }
        C35991b9 LJJJJLI = LJIL.LJJJJLI();
        if (LJJJJLI == null) {
            return;
        }
        LJJJJLI.LIZLLL = new C27O(popupPositionProvider, interfaceC65784Pro2, c25780zm2, content, i, i2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:42:0x00a2, code lost:
    
        if (r15 == X.C24500xi.LIZIZ) goto L43;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void LIZIZ(X.InterfaceC07760Se r13, long r14, X.InterfaceC65784Pro<X.C76800UCe> r16, X.C25780zm r17, X.InterfaceC88471Ynr<? super X.InterfaceC24520xk, ? super java.lang.Integer, X.C76800UCe> r18, X.InterfaceC24520xk r19, int r20, int r21) {
        /*
            Method dump skipped, instructions count: 310
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C25830zr.LIZIZ(X.0Se, long, X.Pro, X.0zm, X.Ynr, X.0xk, int, int):void");
    }
}
