package X;

import kotlin.jvm.internal.o;

/* renamed from: X.2b2, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C61402b2 extends AbstractC65781Prl implements InterfaceC88472Yns<String, Boolean> {
    public static final C61402b2 LJLIL = new C61402b2();

    public C61402b2() {
        super(1);
    }

    @Override // X.InterfaceC88472Yns
    public final Boolean invoke(String param) {
        boolean z;
        o.LJIIIZ(param, "param");
        if (o.LJ(param, "1") || o.LJ(param, "true")) {
            z = true;
        } else {
            z = false;
        }
        return Boolean.valueOf(z);
    }
}
