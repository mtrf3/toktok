package kotlin.jvm.internal;

import X.AbstractC65781Prl;
import X.C75814TpC;
import X.InterfaceC88472Yns;
import X.UXT;
import com.bytedance.android.livesdk.comp.api.linkcore.model.LinkUser;
import tikcast.linkmic.common.LayoutState;

/* loaded from: classes14.dex */
public class AqS36S1000000_13 extends AbstractC65781Prl implements InterfaceC88472Yns {
    public final int $t;
    public String s0;

    @Override // X.InterfaceC88472Yns
    public final Object invoke(Object obj) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj);
            case 1:
                return invoke$1(this, obj);
            case 2:
                return invoke$2(this, obj);
            default:
                return null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS36S1000000_13(String str, int i) {
        super(1);
        this.$t = i;
        this.s0 = str;
    }

    public static final Object invoke$0(AqS36S1000000_13 aqS36S1000000_13, Object obj) {
        LinkUser it = (LinkUser) obj;
        o.LJIIIZ(it, "it");
        return Boolean.valueOf(o.LJ(it.getLinkMicId(), aqS36S1000000_13.s0));
    }

    public static final Object invoke$1(AqS36S1000000_13 aqS36S1000000_13, Object obj) {
        C75814TpC callOnStateUpdate = (C75814TpC) obj;
        o.LJIIIZ(callOnStateUpdate, "$this$callOnStateUpdate");
        LayoutState layoutState = new LayoutState();
        layoutState.layoutId = aqS36S1000000_13.s0;
        return C75814TpC.LIZ(callOnStateUpdate, 0L, layoutState, null, null, null, 29);
    }

    public static final Object invoke$2(AqS36S1000000_13 aqS36S1000000_13, Object obj) {
        boolean z;
        boolean z2;
        UXT it = (UXT) obj;
        o.LJIIIZ(it, "it");
        if (!it.LJLJI.LJLJJI) {
            return Boolean.TRUE;
        }
        boolean z3 = true;
        int i = it.LJLIL - 1;
        int i2 = it.LJLILLLLZI + 1;
        if (i == -1 || aqS36S1000000_13.s0.charAt(i) == ' ') {
            z = true;
        } else {
            z = false;
        }
        if (i2 == aqS36S1000000_13.s0.length() || aqS36S1000000_13.s0.charAt(i2) == ' ') {
            z2 = true;
        } else {
            z2 = false;
        }
        if (!z || !z2) {
            z3 = false;
        }
        return Boolean.valueOf(z3);
    }
}
