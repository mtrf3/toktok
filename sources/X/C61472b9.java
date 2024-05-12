package X;

import defpackage.e1;
import kotlin.jvm.internal.o;

/* renamed from: X.2b9, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C61472b9 extends AbstractC65781Prl implements InterfaceC88472Yns<String, EnumC61752bb> {
    public static final C61472b9 LJLIL = new C61472b9();

    public C61472b9() {
        super(1);
    }

    @Override // X.InterfaceC88472Yns
    public final EnumC61752bb invoke(String it) {
        o.LJIIIZ(it, "it");
        if (e1.LIZ(31744, "disable_sug_from_fashion", true, false)) {
            return EnumC61752bb.DISABLE_REQUEST;
        }
        return EnumC61752bb.NO_DISABLE;
    }
}
