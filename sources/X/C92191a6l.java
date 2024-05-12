package X;

import kotlin.jvm.internal.o;

/* renamed from: X.a6l, reason: case insensitive filesystem */
/* loaded from: classes20.dex */
public final class C92191a6l implements InterfaceC91946a2o<String> {
    public static final C92191a6l LIZ = new C92191a6l();

    @Override // X.InterfaceC91946a2o
    public final C92223a7H LIZ(String str) {
        String it = str;
        o.LJIIIZ(it, "it");
        int length = it.length();
        if (9 <= length && length < 13) {
            return C91945a2n.LIZIZ();
        }
        return new C92223a7H(false, "pipo_rule_length_range", C92054a4Y.LJFF(C92054a4Y.LIZ("pipo_rule_length_range", new String[0]), "9", "12"));
    }
}
