package X;

import kotlin.jvm.internal.o;

/* renamed from: X.a6h, reason: case insensitive filesystem */
/* loaded from: classes20.dex */
public final class C92187a6h implements InterfaceC91946a2o<String> {
    public static final C92187a6h LIZ = new C92187a6h();

    @Override // X.InterfaceC91946a2o
    public final C92223a7H LIZ(String str) {
        int length;
        boolean LIZ2;
        String it = str;
        o.LJIIIZ(it, "it");
        if (it.length() < 11 || (12 <= (length = it.length()) && length < 14)) {
            return C91945a2n.LIZ("pipo_cashier_form_error_CPF_CNPJ_length");
        }
        if (it.length() <= 11) {
            LIZ2 = C91955a2x.LIZ(it);
        } else {
            LIZ2 = C91953a2v.LIZ(it);
        }
        if (LIZ2) {
            return C91945a2n.LIZIZ();
        }
        return C91945a2n.LIZ("pipo_rule_common_invalid");
    }
}
