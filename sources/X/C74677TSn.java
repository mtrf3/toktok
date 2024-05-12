package X;

import kotlin.jvm.internal.o;

/* renamed from: X.TSn, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C74677TSn extends F9E {
    public final String LJLIL;
    public final boolean LJLILLLLZI;

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{this.LJLIL, Boolean.valueOf(this.LJLILLLLZI)};
    }

    public C74677TSn(String interactId, boolean z) {
        o.LJIIIZ(interactId, "interactId");
        this.LJLIL = interactId;
        this.LJLILLLLZI = z;
    }
}
