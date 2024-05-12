package X;

import kotlin.jvm.internal.o;

/* renamed from: X.5J9, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C5J9 extends F9E {
    public final C5JH LJLIL;
    public final C5JF LJLILLLLZI;
    public final C5JF LJLJI;

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{this.LJLIL, this.LJLILLLLZI, this.LJLJI};
    }

    public C5J9() {
        C5JH color = C5JG.LIZJ;
        C5JF shadow = C5JG.LIZIZ;
        o.LJIIIZ(color, "color");
        o.LJIIIZ(shadow, "intensity");
        o.LJIIIZ(shadow, "shadow");
        this.LJLIL = color;
        this.LJLILLLLZI = shadow;
        this.LJLJI = shadow;
    }
}
