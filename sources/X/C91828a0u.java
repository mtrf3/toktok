package X;

import com.bytedance.pipo.checkout.api.network.model.response.BankCardRules;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.a0u, reason: case insensitive filesystem */
/* loaded from: classes20.dex */
public final class C91828a0u {
    public final boolean LIZ;
    public final List<BankCardRules> LIZIZ;
    public final List<String> LIZJ;
    public BankCardRules LIZLLL;

    public C91828a0u(boolean z, List<BankCardRules> rules, List<String> list) {
        o.LJIIIZ(rules, "rules");
        this.LIZ = z;
        this.LIZIZ = rules;
        this.LIZJ = list;
    }
}
