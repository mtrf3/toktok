package X;

import java.util.LinkedHashMap;
import kotlin.jvm.internal.o;

/* renamed from: X.343, reason: invalid class name */
/* loaded from: classes2.dex */
public final class AnonymousClass343 extends AbstractC65781Prl implements InterfaceC88472Yns<C26231ARf, C76800UCe> {
    public static final AnonymousClass343 LJLIL = new AnonymousClass343();

    public AnonymousClass343() {
        super(1);
    }

    @Override // X.InterfaceC88472Yns
    public final C76800UCe invoke(C26231ARf c26231ARf) {
        C26231ARf it = c26231ARf;
        o.LJIIIZ(it, "it");
        if (it.LJLJL == null) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            linkedHashMap.put("enter_from", "settings_page");
            linkedHashMap.put("status", "cancel");
            FMX.LJIIL("floating_window_system_authorization_propup_result", linkedHashMap);
        }
        return C76800UCe.LIZ;
    }
}
