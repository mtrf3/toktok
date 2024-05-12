package X;

import kotlin.jvm.internal.o;

/* renamed from: X.85f, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C2056385f extends AbstractC2056085c {
    public final String LJIIIZ;

    @Override // X.AbstractC2056085c, X.InterfaceC2057785t
    public final String LIZ() {
        return AnonymousClass861.LIZ(this.LJIIIZ);
    }

    @Override // X.AnonymousClass852
    public final String LIZJ() {
        return "";
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C2056385f(CharSequence initialCharacters) {
        this(0, 0, initialCharacters);
        o.LJIIIZ(initialCharacters, "initialCharacters");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2056385f(int i, int i2, CharSequence initialCharacters) {
        super(i, i2);
        o.LJIIIZ(initialCharacters, "initialCharacters");
        this.LJIIIZ = initialCharacters.toString();
    }
}
