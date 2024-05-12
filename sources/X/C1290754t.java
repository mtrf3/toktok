package X;

import kotlin.jvm.internal.o;

/* renamed from: X.54t, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1290754t extends F9E {
    public final String LJLIL;
    public final int LJLILLLLZI;
    public final int LJLJI;
    public final boolean LJLJJI;

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{this.LJLIL, Integer.valueOf(this.LJLILLLLZI), Integer.valueOf(this.LJLJI), Boolean.valueOf(this.LJLJJI)};
    }

    public C1290754t(String path, int i, int i2, boolean z) {
        o.LJIIIZ(path, "path");
        this.LJLIL = path;
        this.LJLILLLLZI = i;
        this.LJLJI = i2;
        this.LJLJJI = z;
    }
}
