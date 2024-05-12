package X;

import java.util.LinkedHashMap;
import kotlin.jvm.internal.o;

/* renamed from: X.Ak2, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C27082Ak2 extends AbstractC65781Prl implements InterfaceC88472Yns<String, C76800UCe> {
    public static final C27082Ak2 LJLIL = new C27082Ak2();

    public C27082Ak2() {
        super(1);
    }

    @Override // X.InterfaceC88472Yns
    public final C76800UCe invoke(String it) {
        o.LJIIIZ(it, "it");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.putAll(C28112B1o.LIZIZ);
        linkedHashMap.put("module_name", "user_trust");
        linkedHashMap.put("click_area", it);
        C76542zS.LIZ("tiktokec_module_click", linkedHashMap);
        return C76800UCe.LIZ;
    }
}
