package X;

import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.a6g, reason: case insensitive filesystem */
/* loaded from: classes20.dex */
public final class C92186a6g implements InterfaceC91946a2o<String> {
    public final /* synthetic */ List<Integer> LIZ;

    public C92186a6g(List<Integer> list) {
        this.LIZ = list;
    }

    @Override // X.InterfaceC91946a2o
    public final C92223a7H LIZ(String str) {
        String it = str;
        o.LJIIIZ(it, "it");
        if (this.LIZ.contains(Integer.valueOf(it.length()))) {
            return C91945a2n.LIZIZ();
        }
        return C91945a2n.LIZ("pipo_rule_common_invalid");
    }
}
