package X;

import androidx.compose.runtime.ParcelableSnapshotMutableState;
import androidx.compose.ui.platform.g1;
import kotlin.jvm.internal.IDqS416S0100000;
import kotlin.jvm.internal.IDqS420S0100000;
import kotlin.jvm.internal.IDqS425S0100000;
import kotlin.jvm.internal.o;

/* renamed from: X.1x2, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C49561x2 implements InterfaceC14670hr, InterfaceC44921pY, InterfaceC44911pX {
    public final InterfaceC70422pa LJLIL;
    public final C0UT LJLILLLLZI;
    public final C0UK LJLJI;
    public final boolean LJLJJI;
    public InterfaceC274415w LJLJJL;
    public InterfaceC274415w LJLJJLL;
    public C23490w5 LJLJL;
    public InterfaceC274415w LJLJLJ;
    public final ParcelableSnapshotMutableState LJLJLLL;
    public InterfaceC79150V4o LJLL;
    public final InterfaceC07790Sh LJLLI;

    @Override // X.InterfaceC07790Sh
    public final /* synthetic */ boolean I(InterfaceC88472Yns interfaceC88472Yns) {
        return C48263Iwt.LIZ(this, interfaceC88472Yns);
    }

    @Override // X.InterfaceC07790Sh
    public final /* synthetic */ InterfaceC07790Sh LLLIIIL(InterfaceC07790Sh interfaceC07790Sh) {
        return C07780Sg.LIZ(this, interfaceC07790Sh);
    }

    @Override // X.InterfaceC14670hr
    public final C10390ax LIZIZ(C10390ax localRect) {
        o.LJIIIZ(localRect, "localRect");
        C23490w5 c23490w5 = this.LJLJL;
        if (c23490w5 != null) {
            return LIZJ(c23490w5.LIZ, localRect);
        }
        "Expected BringIntoViewRequester to not be used before parents are placed.".toString();
        throw new IllegalStateException("Expected BringIntoViewRequester to not be used before parents are placed.");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC44921pY
    public final void LJJIJIIJIL(long j) {
        C10390ax c10390ax;
        InterfaceC274415w interfaceC274415w = this.LJLJJLL;
        C23490w5 c23490w5 = this.LJLJL;
        if (c23490w5 != null && !C23490w5.LIZ(c23490w5.LIZ, j) && interfaceC274415w != null && interfaceC274415w.LIZLLL()) {
            long j2 = c23490w5.LIZ;
            if (this.LJLILLLLZI != C0UT.Horizontal ? C23490w5.LIZIZ(interfaceC274415w.LIZ()) < C23490w5.LIZIZ(j2) : ((int) (interfaceC274415w.LIZ() >> 32)) < ((int) (j2 >> 32))) {
                InterfaceC274415w interfaceC274415w2 = this.LJLJJL;
                if (interfaceC274415w2 != null && interfaceC274415w2.LIZLLL()) {
                    C10390ax LJIIJ = interfaceC274415w.LJIIJ(interfaceC274415w2, false);
                    if (interfaceC274415w2 == this.LJLJLJ) {
                        c10390ax = (C10390ax) this.LJLJLLL.getValue();
                        if (c10390ax == null) {
                            "Required value was null.".toString();
                            throw new IllegalStateException("Required value was null.");
                        }
                    } else {
                        c10390ax = LJIIJ;
                    }
                    if (C78929UyL.LIZ(C10370av.LIZIZ, C78996UzQ.LJJJJIZL(j2)).LIZIZ(c10390ax)) {
                        C10390ax LIZJ = LIZJ(interfaceC274415w.LIZ(), c10390ax);
                        if (!o.LJ(LIZJ, c10390ax)) {
                            this.LJLJLJ = interfaceC274415w2;
                            this.LJLJLLL.setValue(LIZJ);
                            XKX.LIZLLL(this.LJLIL, C77432UaC.LJLIL, null, new C54652Cn(this, LJIIJ, LIZJ, null), 2);
                        }
                    }
                }
            }
        }
        this.LJLJL = new C23490w5(j);
    }

    @Override // X.InterfaceC44911pX
    public final void LJJIZ(AbstractC538029g coordinates) {
        o.LJIIIZ(coordinates, "coordinates");
        this.LJLJJLL = coordinates;
    }

    @Override // X.InterfaceC14670hr
    public final Object LIZ(IDqS420S0100000 iDqS420S0100000, InterfaceC67352kd interfaceC67352kd) {
        C10390ax c10390ax = (C10390ax) iDqS420S0100000.l0;
        if (c10390ax == null) {
            return C76800UCe.LIZ;
        }
        Object LIZLLL = LIZLLL(c10390ax, LIZIZ(c10390ax), interfaceC67352kd);
        if (LIZLLL == EnumC58928NAu.COROUTINE_SUSPENDED) {
            return LIZLLL;
        }
        return C76800UCe.LIZ;
    }

    public final C10390ax LIZJ(long j, C10390ax c10390ax) {
        long LJJJJIZL = C78996UzQ.LJJJJIZL(j);
        int i = C0UJ.LIZ[this.LJLILLLLZI.ordinal()];
        if (i != 1) {
            if (i == 2) {
                return c10390ax.LIZJ(-LJ(c10390ax.LIZ, c10390ax.LIZJ, C10430b1.LIZLLL(LJJJJIZL)), 0.0f);
            }
            throw new C162476Zf();
        }
        return c10390ax.LIZJ(0.0f, -LJ(c10390ax.LIZIZ, c10390ax.LIZLLL, C10430b1.LIZIZ(LJJJJIZL)));
    }

    @Override // X.InterfaceC07790Sh
    public final Object LLLZLZ(Object obj, InterfaceC88471Ynr operation) {
        o.LJIIIZ(operation, "operation");
        return operation.invoke(obj, this);
    }

    public static float LJ(float f, float f2, float f3) {
        if ((f >= 0.0f && f2 <= f3) || (f < 0.0f && f2 > f3)) {
            return 0.0f;
        }
        float f4 = f2 - f3;
        if (Math.abs(f) < Math.abs(f4)) {
            return f;
        }
        return f4;
    }

    public final Object LIZLLL(C10390ax c10390ax, C10390ax c10390ax2, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        float f;
        float f2;
        Object LIZ;
        int i = C0UJ.LIZ[this.LJLILLLLZI.ordinal()];
        if (i != 1) {
            if (i == 2) {
                f = c10390ax2.LIZ;
                f2 = c10390ax.LIZ;
            } else {
                throw new C162476Zf();
            }
        } else {
            f = c10390ax2.LIZIZ;
            f2 = c10390ax.LIZIZ;
        }
        float f3 = f - f2;
        if (this.LJLJJI) {
            f3 = -f3;
        }
        LIZ = C0UW.LIZ(this.LJLJI, f3, C1JI.LJJIJIIJI(0.0f, 0.0f, null, 7), interfaceC67352kd);
        if (LIZ == EnumC58928NAu.COROUTINE_SUSPENDED) {
            return LIZ;
        }
        return C76800UCe.LIZ;
    }

    public C49561x2(InterfaceC70422pa scope, C0UT orientation, C0UK scrollableState, boolean z) {
        o.LJIIIZ(scope, "scope");
        o.LJIIIZ(orientation, "orientation");
        o.LJIIIZ(scrollableState, "scrollableState");
        this.LJLIL = scope;
        this.LJLILLLLZI = orientation;
        this.LJLJI = scrollableState;
        this.LJLJJI = z;
        this.LJLJLLL = C78966Uyw.LJJJIL(null);
        IDqS416S0100000 iDqS416S0100000 = new IDqS416S0100000(this, 170);
        C45301qA c45301qA = g1.LIZ;
        InterfaceC07790Sh LIZ = C07770Sf.LIZ(this, c45301qA, new IDqS425S0100000(iDqS416S0100000, 2));
        o.LJIIIZ(LIZ, "<this>");
        this.LJLLI = C07770Sf.LIZ(LIZ, c45301qA, new IDqS425S0100000((InterfaceC14670hr) this, 8));
    }
}
