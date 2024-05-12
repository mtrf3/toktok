package X;

import kotlin.jvm.internal.o;

/* renamed from: X.a6n, reason: case insensitive filesystem */
/* loaded from: classes20.dex */
public final class C92193a6n implements InterfaceC91946a2o<String> {
    public static final C92193a6n LIZ = new C92193a6n();

    @Override // X.InterfaceC91946a2o
    public final C92223a7H LIZ(String str) {
        String it = str;
        o.LJIIIZ(it, "it");
        if (new OJD("8[0-9]{8,11}").matches(it)) {
            return C91945a2n.LIZIZ();
        }
        return new C92223a7H(false, "pipo_common_phone_start_with", C92054a4Y.LIZ("pipo_common_phone_start_with", "8"));
    }
}
