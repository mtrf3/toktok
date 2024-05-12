package X;

import kotlin.jvm.internal.o;

/* renamed from: X.5Do, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C131365Do extends F9E {
    public final String LJLIL;
    public final int LJLILLLLZI;

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{this.LJLIL, Integer.valueOf(this.LJLILLLLZI)};
    }

    public C131365Do(String path, int i) {
        o.LJIIIZ(path, "path");
        this.LJLIL = path;
        this.LJLILLLLZI = i;
    }
}
