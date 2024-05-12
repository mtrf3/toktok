package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.List;
import kotlin.jvm.internal.IDqS0S0600000;
import kotlin.jvm.internal.o;

/* renamed from: X.1Oy, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C32401Oy implements InterfaceC273215k {
    public final /* synthetic */ boolean LIZ;
    public final /* synthetic */ InterfaceC07760Se LIZIZ;

    public C32401Oy(InterfaceC07760Se interfaceC07760Se, boolean z) {
        this.LIZ = z;
        this.LIZIZ = interfaceC07760Se;
    }

    @Override // X.InterfaceC273215k
    public final /* synthetic */ int LIZ(AbstractC538029g abstractC538029g, List list, int i) {
        return C79061V1d.LIZIZ(this, abstractC538029g, list, i);
    }

    @Override // X.InterfaceC273215k
    public final /* synthetic */ int LIZIZ(AbstractC538029g abstractC538029g, List list, int i) {
        return C79061V1d.LIZLLL(this, abstractC538029g, list, i);
    }

    @Override // X.InterfaceC273215k
    public final /* synthetic */ int LIZLLL(AbstractC538029g abstractC538029g, List list, int i) {
        return C79061V1d.LIZ(this, abstractC538029g, list, i);
    }

    @Override // X.InterfaceC273215k
    public final /* synthetic */ int LJ(AbstractC538029g abstractC538029g, List list, int i) {
        return C79061V1d.LIZJ(this, abstractC538029g, list, i);
    }

    @Override // X.InterfaceC273215k
    public final InterfaceC273515n LIZJ(InterfaceC44861pS MeasurePolicy, List<? extends InterfaceC39071g7> measurables, long j) {
        long LIZ;
        InterfaceC273515n LJJLIL;
        int i;
        int i2;
        C50681yq c50681yq;
        C50681yq c50681yq2;
        AbstractC39201gK LJJJIL;
        int max;
        int max2;
        InterfaceC273515n LJJLIL2;
        C50681yq c50681yq3;
        InterfaceC273515n LJJLIL3;
        o.LJIIIZ(MeasurePolicy, "$this$MeasurePolicy");
        o.LJIIIZ(measurables, "measurables");
        if (!measurables.isEmpty()) {
            if (this.LIZ) {
                LIZ = j;
            } else {
                LIZ = C23360vs.LIZ(j, 0, 0, 0, 0, 10);
            }
            if (measurables.size() == 1) {
                InterfaceC39071g7 interfaceC39071g7 = (InterfaceC39071g7) ListProtector.get(measurables, 0);
                Object LJIIJJI = interfaceC39071g7.LJIIJJI();
                if (!(LJIIJJI instanceof C50681yq) || (c50681yq3 = (C50681yq) LJIIJJI) == null || !c50681yq3.LJLJI) {
                    LJJJIL = interfaceC39071g7.LJJJIL(LIZ);
                    max = Math.max(C23360vs.LJIIIZ(j), LJJJIL.LJLIL);
                    max2 = Math.max(C23360vs.LJIIIIZZ(j), LJJJIL.LJLILLLLZI);
                } else {
                    max = C23360vs.LJIIIZ(j);
                    max2 = C23360vs.LJIIIIZZ(j);
                    int LJIIIZ = C23360vs.LJIIIZ(j);
                    int LJIIIIZZ = C23360vs.LJIIIIZZ(j);
                    if (LJIIIZ >= 0 && LJIIIIZZ >= 0) {
                        LJJJIL = interfaceC39071g7.LJJJIL(C23350vr.LIZIZ(LJIIIZ, LJIIIZ, LJIIIIZZ, LJIIIIZZ));
                    } else {
                        String LJIIJJI2 = C48690J9a.LJIIJJI("width(", LJIIIZ, ") and height(", LJIIIIZZ, ") must be >= 0");
                        LJIIJJI2.toString();
                        throw new IllegalArgumentException(LJIIJJI2);
                    }
                }
                LJJLIL2 = MeasurePolicy.LJJLIL(max, max2, C113554cx.LJJJLIIL(), new C50721yu(LJJJIL, interfaceC39071g7, MeasurePolicy, max, max2, this.LIZIZ));
                return LJJLIL2;
            }
            AbstractC39201gK[] abstractC39201gKArr = new AbstractC39201gK[measurables.size()];
            C76732zl c76732zl = new C76732zl();
            c76732zl.element = C23360vs.LJIIIZ(j);
            C76732zl c76732zl2 = new C76732zl();
            c76732zl2.element = C23360vs.LJIIIIZZ(j);
            int size = measurables.size();
            boolean z = false;
            for (int i3 = 0; i3 < size; i3++) {
                InterfaceC39071g7 interfaceC39071g72 = (InterfaceC39071g7) ListProtector.get(measurables, i3);
                Object LJIIJJI3 = interfaceC39071g72.LJIIJJI();
                if (!(LJIIJJI3 instanceof C50681yq) || (c50681yq2 = (C50681yq) LJIIJJI3) == null || !c50681yq2.LJLJI) {
                    AbstractC39201gK LJJJIL2 = interfaceC39071g72.LJJJIL(LIZ);
                    abstractC39201gKArr[i3] = LJJJIL2;
                    c76732zl.element = Math.max(c76732zl.element, LJJJIL2.LJLIL);
                    c76732zl2.element = Math.max(c76732zl2.element, LJJJIL2.LJLILLLLZI);
                } else {
                    z = true;
                }
            }
            if (z) {
                int i4 = c76732zl.element;
                if (i4 != Integer.MAX_VALUE) {
                    i = i4;
                } else {
                    i = 0;
                }
                int i5 = c76732zl2.element;
                if (i5 != Integer.MAX_VALUE) {
                    i2 = i5;
                } else {
                    i2 = 0;
                }
                long LIZJ = C78555UsJ.LIZJ(i, i4, i2, i5);
                int size2 = measurables.size();
                for (int i6 = 0; i6 < size2; i6++) {
                    InterfaceC39071g7 interfaceC39071g73 = (InterfaceC39071g7) ListProtector.get(measurables, i6);
                    Object LJIIJJI4 = interfaceC39071g73.LJIIJJI();
                    if ((LJIIJJI4 instanceof C50681yq) && (c50681yq = (C50681yq) LJIIJJI4) != null && c50681yq.LJLJI) {
                        abstractC39201gKArr[i6] = interfaceC39071g73.LJJJIL(LIZJ);
                    }
                }
            }
            LJJLIL = MeasurePolicy.LJJLIL(c76732zl.element, c76732zl2.element, C113554cx.LJJJLIIL(), new IDqS0S0600000(abstractC39201gKArr, (AbstractC39201gK[]) measurables, (List<? extends InterfaceC39071g7>) MeasurePolicy, (InterfaceC44861pS) c76732zl, c76732zl2, (C76732zl) this.LIZIZ, (InterfaceC07760Se) 2));
            return LJJLIL;
        }
        LJJLIL3 = MeasurePolicy.LJJLIL(C23360vs.LJIIIZ(j), C23360vs.LJIIIIZZ(j), C113554cx.LJJJLIIL(), C50711yt.LJLIL);
        return LJJLIL3;
    }
}
