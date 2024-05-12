package X;

import kotlin.jvm.internal.o;

/* renamed from: X.6P9, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C6P9 extends F9E {
    public final String LJLIL;
    public final boolean LJLILLLLZI;

    public C6P9() {
        this("", false);
    }

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{this.LJLIL, Boolean.valueOf(this.LJLILLLLZI)};
    }

    public C6P9(String path, boolean z) {
        o.LJIIIZ(path, "path");
        this.LJLIL = path;
        this.LJLILLLLZI = z;
    }
}
