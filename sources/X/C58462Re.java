package X;

import kotlin.jvm.internal.o;

/* renamed from: X.2Re, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C58462Re extends AbstractC65781Prl implements InterfaceC88472Yns<String, CharSequence> {
    public static final C58462Re LJLIL = new C58462Re();

    public C58462Re() {
        super(1);
    }

    @Override // X.InterfaceC88472Yns
    public final CharSequence invoke(String str) {
        String it = str;
        o.LJIIIZ(it, "it");
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append('\"');
        LIZ.append(it);
        LIZ.append('\"');
        return X1D.LIZIZ(LIZ);
    }
}
