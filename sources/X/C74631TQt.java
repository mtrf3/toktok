package X;

import kotlin.jvm.internal.o;

/* renamed from: X.TQt, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C74631TQt extends F9E {
    public final boolean LJLIL;
    public final String LJLILLLLZI;

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{Boolean.valueOf(this.LJLIL), this.LJLILLLLZI};
    }

    public /* synthetic */ C74631TQt(boolean z) {
        this(z, "business_unknown");
    }

    public C74631TQt(boolean z, String source) {
        o.LJIIIZ(source, "source");
        this.LJLIL = z;
        this.LJLILLLLZI = source;
    }
}
