package X;

import android.os.Trace;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.IDqS416S0100000;
import kotlin.jvm.internal.o;

/* renamed from: X.0qz, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C20330qz {
    public static final void LIZ(InterfaceC07790Sh interfaceC07790Sh, InterfaceC88471Ynr<? super InterfaceC24520xk, ? super Integer, C76800UCe> content, InterfaceC24520xk interfaceC24520xk, int i, int i2) {
        int i3;
        int i4;
        int i5;
        o.LJIIIZ(content, "content");
        C35931b3 LJIL = interfaceC24520xk.LJIL(-2105228848);
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
            if (LJIL.LJIJJ(content)) {
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
            C1YV c1yv = new InterfaceC273215k() { // from class: X.1YV
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
                    InterfaceC273515n LJJLIL;
                    o.LJIIIZ(Layout, "$this$Layout");
                    o.LJIIIZ(measurables, "measurables");
                    ArrayList arrayList = new ArrayList(measurables.size());
                    int size = measurables.size();
                    Integer num = 0;
                    for (int i7 = 0; i7 < size; i7++) {
                        arrayList.add(((InterfaceC39071g7) ListProtector.get(measurables, i7)).LJJJIL(j));
                    }
                    int size2 = arrayList.size();
                    Integer num2 = num;
                    for (int i8 = 0; i8 < size2; i8++) {
                        num2 = Integer.valueOf(Math.max(num2.intValue(), ((AbstractC39201gK) ListProtector.get(arrayList, i8)).LJLIL));
                    }
                    int intValue = num2.intValue();
                    int size3 = arrayList.size();
                    for (int i9 = 0; i9 < size3; i9++) {
                        num = Integer.valueOf(Math.max(num.intValue(), ((AbstractC39201gK) ListProtector.get(arrayList, i9)).LJLILLLLZI));
                    }
                    LJJLIL = Layout.LJJLIL(intValue, num.intValue(), C113554cx.LJJJLIIL(), new IDqS416S0100000((List) arrayList, (List<? extends AbstractC39201gK>) 277));
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
                    C24830yF.LIZ(LJIL, c1yv, C03720Cq.LJ);
                    C24830yF.LIZ(LJIL, interfaceC23370vt, C03720Cq.LIZLLL);
                    C24830yF.LIZ(LJIL, enumC23500w6, C03720Cq.LJFF);
                    C24830yF.LIZ(LJIL, interfaceC015404g, C03720Cq.LJI);
                    LJIL.LJIIIIZZ();
                    LJIIL.invoke(new C24440xc(LJIL), LJIL, Integer.valueOf((i8 >> 3) & 112));
                    LJIL.LJJIIJ(2058660585);
                    content.invoke(LJIL, Integer.valueOf((i8 >> 9) & 14));
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
        LJJJJLI.LIZLLL = new C24D(interfaceC07790Sh, content, i, i2);
    }
}
