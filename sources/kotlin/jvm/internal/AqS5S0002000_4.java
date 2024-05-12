package kotlin.jvm.internal;

import X.AbstractC65781Prl;
import X.C248269ok;
import X.C76800UCe;
import X.InterfaceC88472Yns;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.compliance.business.hideaccount.HiddenItem;
import com.ss.android.ugc.aweme.ecommerce.slark.api.data.LaneParams;
import java.util.ArrayList;

/* loaded from: classes5.dex */
public class AqS5S0002000_4 extends AbstractC65781Prl implements InterfaceC88472Yns {
    public final int $t;
    public int i0;
    public int i1;

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

    public static final Object invoke$0(AqS5S0002000_4 aqS5S0002000_4, Object obj) {
        LaneParams logView = (LaneParams) obj;
        o.LJIIIZ(logView, "$this$logView");
        logView.plusAssign("item_num", Integer.valueOf(aqS5S0002000_4.i0));
        logView.plusAssign("rank", Integer.valueOf(aqS5S0002000_4.i1));
        logView.plusAssign("action_type", "click");
        return C76800UCe.LIZ;
    }

    public static final Object invoke$1(AqS5S0002000_4 aqS5S0002000_4, Object obj) {
        C248269ok setState = (C248269ok) obj;
        o.LJIIIZ(setState, "$this$setState");
        ArrayList arrayList = new ArrayList(setState.LJLIL);
        int i = aqS5S0002000_4.i0;
        Object obj2 = ListProtector.get(arrayList, i);
        o.LJIIIIZZ(obj2, "newList[position]");
        ListProtector.set(arrayList, i, HiddenItem.copy$default((HiddenItem) obj2, null, aqS5S0002000_4.i1, 1, null));
        return C248269ok.LIZ(setState, arrayList, null, null, null, 14);
    }

    public static final Object invoke$2(AqS5S0002000_4 aqS5S0002000_4, Object obj) {
        LaneParams logNode = (LaneParams) obj;
        o.LJIIIZ(logNode, "$this$logNode");
        logNode.plusAssign("drop_down_list_name", "address");
        logNode.plusAssign("item_num", Integer.valueOf(aqS5S0002000_4.i0));
        logNode.plusAssign("action_type", "click");
        logNode.plusAssign("rank", Integer.valueOf(aqS5S0002000_4.i1));
        return C76800UCe.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS5S0002000_4(int i, int i2, int i3) {
        super(1);
        this.$t = i3;
        this.i0 = i;
        this.i1 = i2;
    }
}
