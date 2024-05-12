package X;

import kotlin.jvm.internal.o;

/* renamed from: X.2b1, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C61392b1 extends AbstractC65781Prl implements InterfaceC88472Yns<String, Boolean> {
    public static final C61392b1 LJLIL = new C61392b1();

    public C61392b1() {
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
