package X;

import com.ss.android.ugc.aweme.bnpl.biz.verify.pin.model.PinRule;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.a8Q, reason: case insensitive filesystem */
/* loaded from: classes20.dex */
public final class C92294a8Q extends F9E implements InterfaceC87283bg {
    public final EnumC92072a4q LJLIL;
    public final List<PinRule> LJLILLLLZI;
    public final String LJLJI;

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{this.LJLIL, this.LJLILLLLZI, this.LJLJI};
    }

    public C92294a8Q(EnumC92072a4q pinSetMode, List<PinRule> pinRuleList, String previousPageId) {
        o.LJIIIZ(pinSetMode, "pinSetMode");
        o.LJIIIZ(pinRuleList, "pinRuleList");
        o.LJIIIZ(previousPageId, "previousPageId");
        this.LJLIL = pinSetMode;
        this.LJLILLLLZI = pinRuleList;
        this.LJLJI = previousPageId;
    }
}
