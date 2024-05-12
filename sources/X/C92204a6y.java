package X;

import com.bytedance.pipo.checkout.api.network.model.response.BankCardRules;
import com.bytedance.pipo.checkout.api.network.model.response.MethodExtra;
import com.bytedance.pipo.checkout.api.network.model.response.Methods;
import com.bytedance.pipo.checkout.api.network.model.response.StoredMethods;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.a6y, reason: case insensitive filesystem */
/* loaded from: classes20.dex */
public final class C92204a6y extends F9E {
    public final List<StoredMethods> LJLIL;
    public final List<Methods> LJLILLLLZI;
    public final List<BankCardRules> LJLJI;
    public final MethodExtra LJLJJI;
    public final List<InterfaceC91961a33> LJLJJL;
    public final List<InterfaceC91961a33> LJLJJLL;
    public final List<StoredMethods> LJLJL;

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{this.LJLIL, this.LJLILLLLZI, this.LJLJI, this.LJLJJI, this.LJLJJL, this.LJLJJLL, this.LJLJL};
    }

    public C92204a6y(List storedMethods, List paymentMethods, List rules, MethodExtra methodExtra, List methods, List unavailableMethods, List unavailableStoredMethods, int i) {
        storedMethods = (i & 1) != 0 ? new ArrayList() : storedMethods;
        paymentMethods = (i & 2) != 0 ? C61878OQg.INSTANCE : paymentMethods;
        rules = (i & 4) != 0 ? C61878OQg.INSTANCE : rules;
        methodExtra = (i & 8) != 0 ? new MethodExtra(null, null, 3, null) : methodExtra;
        methods = (i & 16) != 0 ? new ArrayList() : methods;
        unavailableMethods = (i & 32) != 0 ? new ArrayList() : unavailableMethods;
        unavailableStoredMethods = (i & 64) != 0 ? C61878OQg.INSTANCE : unavailableStoredMethods;
        o.LJIIIZ(storedMethods, "storedMethods");
        o.LJIIIZ(paymentMethods, "paymentMethods");
        o.LJIIIZ(rules, "rules");
        o.LJIIIZ(methodExtra, "methodExtra");
        o.LJIIIZ(methods, "methods");
        o.LJIIIZ(unavailableMethods, "unavailableMethods");
        o.LJIIIZ(unavailableStoredMethods, "unavailableStoredMethods");
        this.LJLIL = storedMethods;
        this.LJLILLLLZI = paymentMethods;
        this.LJLJI = rules;
        this.LJLJJI = methodExtra;
        this.LJLJJL = methods;
        this.LJLJJLL = unavailableMethods;
        this.LJLJL = unavailableStoredMethods;
    }
}
