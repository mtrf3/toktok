package X;

import kotlin.jvm.internal.o;

/* renamed from: X.1Lz, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C31631Lz extends F9E implements InterfaceC07760Se {
    public final float LJLIL;
    public final float LJLILLLLZI;

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{Float.valueOf(this.LJLIL), Float.valueOf(this.LJLILLLLZI)};
    }

    public C31631Lz(float f, float f2) {
        this.LJLIL = f;
        this.LJLILLLLZI = f2;
    }

    @Override // X.InterfaceC07760Se
    public final long q(long j, long j2, EnumC23500w6 layoutDirection) {
        float f;
        o.LJIIIZ(layoutDirection, "layoutDirection");
        float f2 = (((int) (j2 >> 32)) - ((int) (j >> 32))) / 2.0f;
        float LIZIZ = (C23490w5.LIZIZ(j2) - C23490w5.LIZIZ(j)) / 2.0f;
        if (layoutDirection == EnumC23500w6.Ltr) {
            f = this.LJLIL;
        } else {
            f = (-1) * this.LJLIL;
        }
        float f3 = 1;
        return C78939UyV.LIZ(O6R.LJJIIZ((f + f3) * f2), O6R.LJJIIZ((f3 + this.LJLILLLLZI) * LIZIZ));
    }
}
