package X;

import kotlin.jvm.internal.o;

/* renamed from: X.a6e, reason: case insensitive filesystem */
/* loaded from: classes20.dex */
public final class C92184a6e implements InterfaceC91946a2o<String> {
    public static final C92184a6e LIZ = new C92184a6e();

    @Override // X.InterfaceC91946a2o
    public final C92223a7H LIZ(String str) {
        String it = str;
        o.LJIIIZ(it, "it");
        if (!new OJD("^[^0-9`~!@#$%^&*()_+=<>?:\\\"\"{}|,\\\\/;\\\\[\\\\]·~！@#¥%……&*（）——+={}|《》？：“”【】、；‘，。、]*$").matches(it)) {
            return C91945a2n.LIZ("pipo_rule_common_invalid");
        }
        return C91945a2n.LIZIZ();
    }
}
