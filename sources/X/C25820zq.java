package X;

import android.os.Trace;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.IDqS416S0100000;
import kotlin.jvm.internal.o;

/* renamed from: X.0zq, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C25820zq {
    public static final void LIZIZ(InterfaceC07790Sh interfaceC07790Sh, InterfaceC88471Ynr interfaceC88471Ynr, InterfaceC24520xk interfaceC24520xk, int i, int i2) {
        int i3;
        int i4;
        int i5;
        C35931b3 LJIL = interfaceC24520xk.LJIL(-1177876616);
        int i6 = i2 & 1;
        if (i6 != 0) {
            i3 = i | 6;
        } else if ((i & 14) == 0) {
            if (LJIL.LJIJJ(interfaceC07790Sh)) {
                i4 = 4;
            } else {
                i4 = 2;
            }
            i3 = i4 | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 112) == 0) {
            if (LJIL.LJIJJ(interfaceC88471Ynr)) {
                i5 = 32;
            } else {
                i5 = 16;
            }
            i3 |= i5;
        }
        if ((i3 & 91) != 18 || !LJIL.LIZ()) {
            if (i6 != 0) {
                interfaceC07790Sh = InterfaceC07790Sh.LJJJI;
            }
            C36481bw c36481bw = new InterfaceC273215k() { // from class: X.1bw
                @Override // X.InterfaceC273215k
                public final /* synthetic */ int LIZ(AbstractC538029g abstractC538029g, List list, int i7) {
                    return C79061V1d.LIZIZ(this, abstractC538029g, list, i7);
                }

                @Override // X.InterfaceC273215k
                public final /* synthetic */ int LIZIZ(AbstractC538029g abstractC538029g, List list, int i7) {
                    return C79061V1d.LIZLLL(this, abstractC538029g, list, i7);
                }

                @Override // X.InterfaceC273215k
                public final /* synthetic */ int LIZLLL(AbstractC538029g abstractC538029g, List list, int i7) {
                    return C79061V1d.LIZ(this, abstractC538029g, list, i7);
                }

                @Override // X.InterfaceC273215k
                public final /* synthetic */ int LJ(AbstractC538029g abstractC538029g, List list, int i7) {
                    return C79061V1d.LIZJ(this, abstractC538029g, list, i7);
                }

                @Override // X.InterfaceC273215k
                public final InterfaceC273515n LIZJ(InterfaceC44861pS Layout, List<? extends InterfaceC39071g7> measurables, long j) {
                    Object obj;
                    int LJIIIZ;
                    int LJIIIIZZ;
                    InterfaceC273515n LJJLIL;
                    o.LJIIIZ(Layout, "$this$Layout");
                    o.LJIIIZ(measurables, "measurables");
                    ArrayList arrayList = new ArrayList(measurables.size());
                    int size = measurables.size();
                    for (int i7 = 0; i7 < size; i7++) {
                        arrayList.add(((InterfaceC39071g7) ListProtector.get(measurables, i7)).LJJJIL(j));
                    }
                    int i8 = 1;
                    Object obj2 = null;
                    if (arrayList.isEmpty()) {
                        obj = null;
                    } else {
                        obj = ListProtector.get(arrayList, 0);
                        int i9 = ((AbstractC39201gK) obj).LJLIL;
                        int LJJI = C47261Igj.LJJI(arrayList);
                        if (1 <= LJJI) {
                            int i10 = 1;
                            while (true) {
                                Object obj3 = ListProtector.get(arrayList, i10);
                                int i11 = ((AbstractC39201gK) obj3).LJLIL;
                                if (i9 < i11) {
                                    obj = obj3;
                                    i9 = i11;
                                }
                                if (i10 == LJJI) {
                                    break;
                                }
                                i10++;
                            }
                        }
                    }
                    AbstractC39201gK abstractC39201gK = (AbstractC39201gK) obj;
                    if (abstractC39201gK != null) {
                        LJIIIZ = abstractC39201gK.LJLIL;
                    } else {
                        LJIIIZ = C23360vs.LJIIIZ(j);
                    }
                    if (!arrayList.isEmpty()) {
                        obj2 = ListProtector.get(arrayList, 0);
                        int i12 = ((AbstractC39201gK) obj2).LJLILLLLZI;
                        int LJJI2 = C47261Igj.LJJI(arrayList);
                        if (1 <= LJJI2) {
                            while (true) {
                                Object obj4 = ListProtector.get(arrayList, i8);
                                int i13 = ((AbstractC39201gK) obj4).LJLILLLLZI;
                                if (i12 < i13) {
                                    obj2 = obj4;
                                    i12 = i13;
                                }
                                if (i8 == LJJI2) {
                                    break;
                                }
                                i8++;
                            }
                        }
                    }
                    AbstractC39201gK abstractC39201gK2 = (AbstractC39201gK) obj2;
                    if (abstractC39201gK2 != null) {
                        LJIIIIZZ = abstractC39201gK2.LJLILLLLZI;
                    } else {
                        LJIIIIZZ = C23360vs.LJIIIIZZ(j);
                    }
                    LJJLIL = Layout.LJJLIL(LJIIIZ, LJIIIIZZ, C113554cx.LJJJLIIL(), new IDqS416S0100000((List) arrayList, (List<? extends AbstractC39201gK>) 325));
                    return LJJLIL;
                }
            };
            int i7 = ((i3 << 3) & 112) | ((i3 >> 3) & 14);
            LJIL.LJJIIJ(-1323940314);
            Trace.beginSection("Layout:layout");
            try {
                InterfaceC23370vt interfaceC23370vt = (InterfaceC23370vt) LJIL.LJIILLIIL(AnonymousClass057.LJ);
                EnumC23500w6 enumC23500w6 = (EnumC23500w6) LJIL.LJIILLIIL(AnonymousClass057.LJIIJ);
                InterfaceC015404g interfaceC015404g = (InterfaceC015404g) LJIL.LJIILLIIL(AnonymousClass057.LJIILJJIL);
                InterfaceC03730Cr.LJ.getClass();
                C46041rM c46041rM = C03720Cq.LIZIZ;
                C40431iJ LJIIL = C56509MFt.LJIIL(interfaceC07790Sh);
                int i8 = ((i7 << 9) & 7168) | 6;
                if (LJIL.LIZIZ instanceof InterfaceC24420xa) {
                    LJIL.LJIJI();
                    if (LJIL.LJJIL) {
                        LJIL.LJJI(c46041rM);
                    } else {
                        LJIL.LIZIZ();
                    }
                    LJIL.LJJI = false;
                    C24830yF.LIZ(LJIL, c36481bw, C03720Cq.LJ);
                    C24830yF.LIZ(LJIL, interfaceC23370vt, C03720Cq.LIZLLL);
                    C24830yF.LIZ(LJIL, enumC23500w6, C03720Cq.LJFF);
                    C24830yF.LIZ(LJIL, interfaceC015404g, C03720Cq.LJI);
                    LJIL.LJIIIIZZ();
                    LJIIL.invoke(new C24440xc(LJIL), LJIL, Integer.valueOf((i8 >> 3) & 112));
                    LJIL.LJJIIJ(2058660585);
                    interfaceC88471Ynr.invoke(LJIL, Integer.valueOf((i8 >> 9) & 14));
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
        LJJJJLI.LIZLLL = new C27H(interfaceC07790Sh, interfaceC88471Ynr, i, i2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:36:0x00a7, code lost:
    
        if (r15 == X.C24500xi.LIZIZ) goto L31;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void LIZ(X.InterfaceC65784Pro<X.C76800UCe> r15, X.C25860zu r16, X.InterfaceC88471Ynr<? super X.InterfaceC24520xk, ? super java.lang.Integer, X.C76800UCe> r17, X.InterfaceC24520xk r18, int r19, int r20) {
        /*
            Method dump skipped, instructions count: 331
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C25820zq.LIZ(X.Pro, X.0zu, X.Ynr, X.0xk, int, int):void");
    }
}
