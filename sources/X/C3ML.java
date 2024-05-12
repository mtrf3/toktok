package X;

import kotlin.jvm.internal.o;

/* renamed from: X.3ML, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C3ML extends F9E {
    public final int LJLIL;
    public final long LJLILLLLZI;
    public final int LJLJI;
    public final boolean LJLJJI;
    public final Object LJLJJL;

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{Integer.valueOf(this.LJLIL), Long.valueOf(this.LJLILLLLZI), Integer.valueOf(this.LJLJI), Boolean.valueOf(this.LJLJJI), this.LJLJJL};
    }

    public C3ML(int i, long j, int i2, boolean z, Object original) {
        o.LJIIIZ(original, "original");
        this.LJLIL = i;
        this.LJLILLLLZI = j;
        this.LJLJI = i2;
        this.LJLJJI = z;
        this.LJLJJL = original;
    }
}
