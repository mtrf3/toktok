package X;

import java.util.LinkedHashMap;
import kotlin.jvm.internal.o;

/* renamed from: X.342, reason: invalid class name */
/* loaded from: classes2.dex */
public final class AnonymousClass342 extends AbstractC65781Prl implements InterfaceC88472Yns<ARN, C76800UCe> {
    public static final AnonymousClass342 LJLIL = new AnonymousClass342();

    public AnonymousClass342() {
        super(1);
    }

    @Override // X.InterfaceC88472Yns
    public final C76800UCe invoke(ARN it) {
        o.LJIIIZ(it, "it");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("enter_from", "settings_page");
        linkedHashMap.put("status", "cancel");
        FMX.LJIIL("floating_window_system_authorization_propup_result", linkedHashMap);
        return C76800UCe.LIZ;
    }
}
