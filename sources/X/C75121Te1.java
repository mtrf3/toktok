package X;

import kotlin.jvm.internal.o;

/* renamed from: X.Te1, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C75121Te1 extends F9E {
    public final int LJLIL;
    public final String LJLILLLLZI;

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{Integer.valueOf(this.LJLIL), this.LJLILLLLZI};
    }

    public C75121Te1(int i, String interactId) {
        o.LJIIIZ(interactId, "interactId");
        this.LJLIL = i;
        this.LJLILLLLZI = interactId;
    }
}
