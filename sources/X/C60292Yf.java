package X;

import kotlin.jvm.internal.o;

/* renamed from: X.2Yf, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C60292Yf extends AbstractC65781Prl implements InterfaceC88472Yns<String, Boolean> {
    public static final C60292Yf LJLIL = new C60292Yf();

    public C60292Yf() {
        super(1);
    }

    @Override // X.InterfaceC88472Yns
    public final Boolean invoke(String str) {
        String path = str;
        o.LJIIIZ(path, "path");
        return Boolean.valueOf(!ujb.o.LJJJJJL(path));
    }
}
