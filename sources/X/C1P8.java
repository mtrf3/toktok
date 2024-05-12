package X;

import kotlin.jvm.internal.o;

/* renamed from: X.1P8, reason: invalid class name */
/* loaded from: classes.dex */
public final class C1P8 extends F9E {
    public final int LJLIL;
    public final int LJLILLLLZI;
    public final int LJLJI;
    public final int LJLJJI;

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{Integer.valueOf(this.LJLIL), Integer.valueOf(this.LJLILLLLZI), Integer.valueOf(this.LJLJI), Integer.valueOf(this.LJLJJI)};
    }

    public final long L(EnumC09360Yi orientation) {
        o.LJIIIZ(orientation, "orientation");
        if (orientation == EnumC09360Yi.Horizontal) {
            return C78555UsJ.LIZJ(this.LJLIL, this.LJLILLLLZI, this.LJLJI, this.LJLJJI);
        }
        return C78555UsJ.LIZJ(this.LJLJI, this.LJLJJI, this.LJLIL, this.LJLILLLLZI);
    }

    public C1P8(int i, int i2, int i3, int i4) {
        this.LJLIL = i;
        this.LJLILLLLZI = i2;
        this.LJLJI = i3;
        this.LJLJJI = i4;
    }
}
