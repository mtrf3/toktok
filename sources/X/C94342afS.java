package X;

import kotlin.jvm.internal.o;

/* renamed from: X.afS, reason: case insensitive filesystem */
/* loaded from: classes34.dex */
public final class C94342afS extends F9E {
    public final String LJLIL;
    public final int LJLILLLLZI;
    public final int LJLJI;
    public final String LJLJJI;

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{this.LJLIL, Integer.valueOf(this.LJLILLLLZI), Integer.valueOf(this.LJLJI), this.LJLJJI};
    }

    public C94342afS(String path, int i, int i2, String scaleFactor) {
        o.LJIIIZ(path, "path");
        o.LJIIIZ(scaleFactor, "scaleFactor");
        this.LJLIL = path;
        this.LJLILLLLZI = i;
        this.LJLJI = i2;
        this.LJLJJI = scaleFactor;
    }
}
