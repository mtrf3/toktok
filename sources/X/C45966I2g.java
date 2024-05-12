package X;

import kotlin.jvm.internal.o;

/* renamed from: X.I2g, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C45966I2g extends F9E {
    public final boolean LJLIL;
    public final boolean LJLILLLLZI;
    public final I2E LJLJI;

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{Boolean.valueOf(this.LJLIL), Boolean.valueOf(this.LJLILLLLZI), this.LJLJI};
    }

    public C45966I2g(boolean z, boolean z2, I2E durationTip) {
        o.LJIIIZ(durationTip, "durationTip");
        this.LJLIL = z;
        this.LJLILLLLZI = z2;
        this.LJLJI = durationTip;
    }
}
