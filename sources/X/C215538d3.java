package X;

import kotlin.jvm.internal.o;

/* renamed from: X.8d3, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C215538d3 extends AbstractC65781Prl implements InterfaceC88472Yns<String, CharSequence> {
    public static final C215538d3 LJLIL = new C215538d3();

    public C215538d3() {
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
