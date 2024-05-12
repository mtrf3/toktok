package X;

import kotlin.jvm.internal.o;

/* renamed from: X.2Mf, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C57172Mf extends AbstractC65781Prl implements InterfaceC88472Yns<String, Boolean> {
    public static final C57172Mf LJLIL = new C57172Mf();

    public C57172Mf() {
        super(1);
    }

    @Override // X.InterfaceC88472Yns
    public final Boolean invoke(String str) {
        boolean z;
        String it = str;
        o.LJIIIIZZ(it, "it");
        if (it.length() > 0) {
            z = true;
        } else {
            z = false;
        }
        return Boolean.valueOf(z);
    }
}
