package X;

import kotlin.jvm.internal.o;

/* renamed from: X.a6d, reason: case insensitive filesystem */
/* loaded from: classes20.dex */
public final class C92183a6d implements InterfaceC91946a2o<String> {
    public static final C92183a6d LIZ = new C92183a6d();

    @Override // X.InterfaceC91946a2o
    public final C92223a7H LIZ(String str) {
        String it = str;
        o.LJIIIZ(it, "it");
        if (new OJD("^(([^<>()\\[\\]\\\\.,;:\\s@\"]+(\\.[^<>()\\[\\]\\\\.,;:\\s@\"]+)*)|(\".+\"))@((\\[[0-9]{1,3}\\.[0-9]{1,3}\\.[0-9]{1,3}\\.[0-9]{1,3}])|(([a-zA-Z\\-0-9]+\\.)+[a-zA-Z]{2,}))$").matches(it)) {
            return C91945a2n.LIZIZ();
        }
        return C91945a2n.LIZ("pipo_rule_common_invalid");
    }
}
