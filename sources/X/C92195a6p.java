package X;

import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.a6p, reason: case insensitive filesystem */
/* loaded from: classes20.dex */
public final class C92195a6p implements InterfaceC91946a2o<String> {
    public final /* synthetic */ List<Integer> LIZ;

    public C92195a6p(List<Integer> list) {
        this.LIZ = list;
    }

    @Override // X.InterfaceC91946a2o
    public final C92223a7H LIZ(String str) {
        C92223a7H LIZIZ;
        String it = str;
        o.LJIIIZ(it, "it");
        try {
            if (!this.LIZ.contains(Integer.valueOf(it.length()))) {
                LIZIZ = C91945a2n.LIZ("pipo_cashier_form_error_card_length_invalid");
            } else {
                LIZIZ = C91945a2n.LIZIZ();
            }
            return LIZIZ;
        } catch (Throwable unused) {
            return C91945a2n.LIZ("");
        }
    }
}
