package X;

import kotlin.jvm.internal.o;

/* renamed from: X.a6f, reason: case insensitive filesystem */
/* loaded from: classes20.dex */
public final class C92185a6f implements InterfaceC91946a2o<String> {
    public static final C92185a6f LIZ = new C92185a6f();

    @Override // X.InterfaceC91946a2o
    public final C92223a7H LIZ(String str) {
        String it = str;
        o.LJIIIZ(it, "it");
        if (it.length() < 14) {
            return new C92223a7H(false, "pipo_rule_length_fixed1", C92054a4Y.LJFF(C92054a4Y.LIZ("pipo_rule_length_fixed1", new String[0]), "14"));
        }
        if (C91953a2v.LIZ(it)) {
            return C91945a2n.LIZIZ();
        }
        return C91945a2n.LIZ("pipo_rule_common_invalid");
    }
}
