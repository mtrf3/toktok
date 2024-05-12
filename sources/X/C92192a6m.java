package X;

import kotlin.jvm.internal.o;

/* renamed from: X.a6m, reason: case insensitive filesystem */
/* loaded from: classes20.dex */
public final class C92192a6m implements InterfaceC91946a2o<String> {
    public static final C92192a6m LIZ = new C92192a6m();

    @Override // X.InterfaceC91946a2o
    public final C92223a7H LIZ(String str) {
        String it = str;
        o.LJIIIZ(it, "it");
        int length = it.length();
        if (9 <= length && length < 13) {
            return C91945a2n.LIZIZ();
        }
        return new C92223a7H(false, "pipo_rule_length_range", C92054a4Y.LIZ("pipo_rule_length_range", "9", "12"));
    }
}
