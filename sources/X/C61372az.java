package X;

import kotlin.jvm.internal.o;

/* renamed from: X.2az, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C61372az extends AbstractC65781Prl implements InterfaceC88472Yns<String, Boolean> {
    public static final C61372az LJLIL = new C61372az();

    public C61372az() {
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
