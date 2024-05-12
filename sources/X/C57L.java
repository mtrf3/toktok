package X;

import kotlin.jvm.internal.o;

/* renamed from: X.57L, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C57L extends F9E {
    public final String LJLIL;
    public final long LJLILLLLZI;
    public final float LJLJI;
    public final int LJLJJI;
    public final int LJLJJL;

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{this.LJLIL, Long.valueOf(this.LJLILLLLZI), Float.valueOf(this.LJLJI), Integer.valueOf(this.LJLJJI), Integer.valueOf(this.LJLJJL)};
    }

    public C57L(String path, long j, float f, int i, int i2) {
        o.LJIIIZ(path, "path");
        this.LJLIL = path;
        this.LJLILLLLZI = j;
        this.LJLJI = f;
        this.LJLJJI = i;
        this.LJLJJL = i2;
    }
}
