package X;

import kotlin.jvm.internal.o;

/* renamed from: X.2ay, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C61362ay extends AbstractC65781Prl implements InterfaceC88472Yns<String, Boolean> {
    public static final C61362ay LJLIL = new C61362ay();

    public C61362ay() {
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
