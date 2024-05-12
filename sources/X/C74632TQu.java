package X;

import kotlin.jvm.internal.o;

/* renamed from: X.TQu, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C74632TQu extends F9E {
    public final boolean LJLIL;
    public final String LJLILLLLZI;

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{Boolean.valueOf(this.LJLIL), this.LJLILLLLZI};
    }

    public C74632TQu(boolean z, String source) {
        o.LJIIIZ(source, "source");
        this.LJLIL = z;
        this.LJLILLLLZI = source;
    }
}
