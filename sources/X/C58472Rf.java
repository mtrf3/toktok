package X;

import kotlin.jvm.internal.o;

/* renamed from: X.2Rf, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C58472Rf extends AbstractC65781Prl implements InterfaceC88472Yns<CharSequence, CharSequence> {
    public static final C58472Rf LJLIL = new C58472Rf();

    public C58472Rf() {
        super(1);
    }

    @Override // X.InterfaceC88472Yns
    public final CharSequence invoke(CharSequence it) {
        o.LJIIIZ(it, "it");
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append('[');
        LIZ.append((Object) it);
        LIZ.append(']');
        return X1D.LIZIZ(LIZ);
    }
}
