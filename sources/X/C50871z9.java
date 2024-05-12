package X;

import androidx.compose.ui.platform.g1;
import kotlin.jvm.internal.IDqS416S0100000;
import kotlin.jvm.internal.o;

/* renamed from: X.1z9, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C50871z9 extends AbstractC014804a implements InterfaceC44951pb {
    public final float LJLILLLLZI;
    public final float LJLJI;

    public C50871z9() {
        throw null;
    }

    @Override // X.InterfaceC07790Sh
    public final /* synthetic */ boolean I(InterfaceC88472Yns interfaceC88472Yns) {
        return C48263Iwt.LIZ(this, interfaceC88472Yns);
    }

    @Override // X.InterfaceC07790Sh
    public final /* synthetic */ InterfaceC07790Sh LLLIIIL(InterfaceC07790Sh interfaceC07790Sh) {
        return C07780Sg.LIZ(this, interfaceC07790Sh);
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.LJLJI) + (Float.floatToIntBits(this.LJLILLLLZI) * 31);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C50871z9)) {
            return false;
        }
        C50871z9 c50871z9 = (C50871z9) obj;
        if (!C23390vv.LIZJ(this.LJLILLLLZI, c50871z9.LJLILLLLZI) || !C23390vv.LIZJ(this.LJLJI, c50871z9.LJLJI)) {
            return false;
        }
        return true;
    }

    public C50871z9(float f, float f2) {
        super(g1.LIZ);
        this.LJLILLLLZI = f;
        this.LJLJI = f2;
    }

    @Override // X.InterfaceC07790Sh
    public final Object LLLZLZ(Object obj, InterfaceC88471Ynr operation) {
        o.LJIIIZ(operation, "operation");
        return operation.invoke(obj, this);
    }

    @Override // X.InterfaceC44951pb
    public final int LJI(InterfaceC39181gI interfaceC39181gI, InterfaceC274115t interfaceC274115t, int i) {
        int i2;
        o.LJIIIZ(interfaceC39181gI, "<this>");
        int LJJLJLI = interfaceC274115t.LJJLJLI(i);
        if (!C23390vv.LIZJ(this.LJLILLLLZI, Float.NaN)) {
            i2 = interfaceC39181gI.LJJIJ(this.LJLILLLLZI);
        } else {
            i2 = 0;
        }
        if (LJJLJLI < i2) {
            return i2;
        }
        return LJJLJLI;
    }

    @Override // X.InterfaceC44951pb
    public final int LJIIJJI(InterfaceC39181gI interfaceC39181gI, InterfaceC274115t interfaceC274115t, int i) {
        int i2;
        o.LJIIIZ(interfaceC39181gI, "<this>");
        int LJJJI = interfaceC274115t.LJJJI(i);
        if (!C23390vv.LIZJ(this.LJLILLLLZI, Float.NaN)) {
            i2 = interfaceC39181gI.LJJIJ(this.LJLILLLLZI);
        } else {
            i2 = 0;
        }
        if (LJJJI < i2) {
            return i2;
        }
        return LJJJI;
    }

    @Override // X.InterfaceC44951pb
    public final InterfaceC273515n LJIILL(InterfaceC44861pS measure, InterfaceC39071g7 interfaceC39071g7, long j) {
        int LJIIIZ;
        InterfaceC273515n LJJLIL;
        o.LJIIIZ(measure, "$this$measure");
        int i = 0;
        if (!C23390vv.LIZJ(this.LJLILLLLZI, Float.NaN) && C23360vs.LJIIIZ(j) == 0) {
            LJIIIZ = measure.LJJIJ(this.LJLILLLLZI);
            int LJII = C23360vs.LJII(j);
            if (LJIIIZ > LJII) {
                LJIIIZ = LJII;
            }
            if (LJIIIZ < 0) {
                LJIIIZ = 0;
            }
        } else {
            LJIIIZ = C23360vs.LJIIIZ(j);
        }
        int LJII2 = C23360vs.LJII(j);
        if (!C23390vv.LIZJ(this.LJLJI, Float.NaN) && C23360vs.LJIIIIZZ(j) == 0) {
            int LJJIJ = measure.LJJIJ(this.LJLJI);
            int LJI = C23360vs.LJI(j);
            if (LJJIJ > LJI) {
                LJJIJ = LJI;
            }
            if (LJJIJ >= 0) {
                i = LJJIJ;
            }
        } else {
            i = C23360vs.LJIIIIZZ(j);
        }
        AbstractC39201gK LJJJIL = interfaceC39071g7.LJJJIL(C78555UsJ.LIZJ(LJIIIZ, LJII2, i, C23360vs.LJI(j)));
        LJJLIL = measure.LJJLIL(LJJJIL.LJLIL, LJJJIL.LJLILLLLZI, C113554cx.LJJJLIIL(), new IDqS416S0100000(LJJJIL, 187));
        return LJJLIL;
    }

    @Override // X.InterfaceC44951pb
    public final int LJJJI(InterfaceC39181gI interfaceC39181gI, InterfaceC274115t interfaceC274115t, int i) {
        int i2;
        o.LJIIIZ(interfaceC39181gI, "<this>");
        int LJJLIIIJILLIZJL = interfaceC274115t.LJJLIIIJILLIZJL(i);
        if (!C23390vv.LIZJ(this.LJLJI, Float.NaN)) {
            i2 = interfaceC39181gI.LJJIJ(this.LJLJI);
        } else {
            i2 = 0;
        }
        if (LJJLIIIJILLIZJL < i2) {
            return i2;
        }
        return LJJLIIIJILLIZJL;
    }

    @Override // X.InterfaceC44951pb
    public final int LJJJIL(InterfaceC39181gI interfaceC39181gI, InterfaceC274115t interfaceC274115t, int i) {
        int i2;
        o.LJIIIZ(interfaceC39181gI, "<this>");
        int LJJLIIIJLLLLLLLZ = interfaceC274115t.LJJLIIIJLLLLLLLZ(i);
        if (!C23390vv.LIZJ(this.LJLJI, Float.NaN)) {
            i2 = interfaceC39181gI.LJJIJ(this.LJLJI);
        } else {
            i2 = 0;
        }
        if (LJJLIIIJLLLLLLLZ < i2) {
            return i2;
        }
        return LJJLIIIJLLLLLLLZ;
    }
}
