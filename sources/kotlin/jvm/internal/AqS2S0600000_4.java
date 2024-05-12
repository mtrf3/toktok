package kotlin.jvm.internal;

import X.ARI;
import X.AbstractC65781Prl;
import X.C107794Kx;
import X.C70414RkI;
import X.C76732zl;
import X.C76800UCe;
import X.InterfaceC65784Pro;
import X.InterfaceC88472Yns;
import X.X1D;
import android.content.Context;
import com.ss.android.ugc.aweme.commercialize.ba.impl.service.BAAnchorServiceImpl;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.vm.PdpViewModel;
import com.ss.android.ugc.aweme.ecommerce.slark.api.data.LaneParams;
import com.ss.android.ugc.aweme.services.BaseUserService;
import java.util.LinkedHashMap;
import java.util.List;

/* loaded from: classes5.dex */
public class AqS2S0600000_4 extends AbstractC65781Prl implements InterfaceC88472Yns {
    public final int $t;
    public Object l0;
    public Object l1;
    public Object l2;
    public Object l3;
    public Object l4;
    public Object l5;

    @Override // X.InterfaceC88472Yns
    public final Object invoke(Object obj) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj);
            case 1:
                return invoke$1(this, obj);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AqS2S0600000_4 aqS2S0600000_4, Object obj) {
        String str;
        String LIZIZ;
        LaneParams logNode = (LaneParams) obj;
        o.LJIIIZ(logNode, "$this$logNode");
        logNode.withParamsGroup(((C70414RkI) aqS2S0600000_4.l0).LIZIZ);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        C70414RkI c70414RkI = (C70414RkI) aqS2S0600000_4.l0;
        int aw0 = ((PdpViewModel) aqS2S0600000_4.l1).aw0();
        c70414RkI.getClass();
        if (aw0 != 1) {
            if (aw0 != 2) {
                str = "product_detail";
            } else {
                str = "shop_review";
            }
        } else {
            str = "product_review";
        }
        linkedHashMap.put("page_name", str);
        linkedHashMap.put("previous_page", "product_detail");
        linkedHashMap.put("chat_type", ((List) aqS2S0600000_4.l2).toString());
        String currentUserID = BaseUserService.createIUserServicebyMonsterPlugin(false).getCurrentUserID();
        o.LJIIIIZZ(currentUserID, "spi<IUserService>().currentUserID");
        linkedHashMap.put("from_user_id", currentUserID);
        linkedHashMap.put("to_user_id", ((List) aqS2S0600000_4.l3).toString());
        linkedHashMap.put("conversation_id", ((List) aqS2S0600000_4.l4).toString());
        linkedHashMap.put("tips_type", "share_product_card");
        C70414RkI c70414RkI2 = (C70414RkI) aqS2S0600000_4.l0;
        C107794Kx c107794Kx = (C107794Kx) aqS2S0600000_4.l5;
        c70414RkI2.getClass();
        if (c107794Kx.LJLJI) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("Sent to ");
            LIZ.append(c107794Kx.LJLIL.getDisplayName());
            LIZ.append(" and other users");
            LIZIZ = X1D.LIZIZ(LIZ);
        } else if (c107794Kx.LJLJLJ) {
            LIZIZ = "Group message sent";
        } else {
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("Sent to ");
            LIZ2.append(c107794Kx.LJLIL.getDisplayName());
            LIZIZ = X1D.LIZIZ(LIZ2);
        }
        linkedHashMap.put("tips_title", LIZIZ);
        logNode.compareTo(logNode, linkedHashMap);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$1(AqS2S0600000_4 aqS2S0600000_4, Object obj) {
        ARI actionGroup = (ARI) obj;
        o.LJIIIZ(actionGroup, "$this$actionGroup");
        actionGroup.LJI(((C76732zl) aqS2S0600000_4.l0).element, new AqS50S0400000_4((C76732zl) aqS2S0600000_4.l2, (C76732zl) aqS2S0600000_4.l3, (BAAnchorServiceImpl) aqS2S0600000_4.l4, (Context) aqS2S0600000_4.l5, (InterfaceC65784Pro<C76800UCe>) 13));
        actionGroup.LJIIIIZZ(((C76732zl) aqS2S0600000_4.l1).element, new AqS170S0100000_4((C76732zl) aqS2S0600000_4.l2, 1560));
        return C76800UCe.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS2S0600000_4(C76732zl c76732zl, C76732zl c76732zl2, C76732zl c76732zl3, BAAnchorServiceImpl bAAnchorServiceImpl, Context context, AqS157S0100000_7 aqS157S0100000_7, int i) {
        super(1);
        this.$t = i;
        this.l0 = c76732zl;
        this.l1 = c76732zl2;
        this.l2 = c76732zl3;
        this.l3 = bAAnchorServiceImpl;
        this.l4 = context;
        this.l5 = aqS157S0100000_7;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AqS2S0600000_4(C70414RkI c70414RkI, C70414RkI c70414RkI2, PdpViewModel pdpViewModel, List<String> list, List<String> list2, List<String> list3, C107794Kx c107794Kx) {
        super(1);
        this.$t = c107794Kx;
        this.l0 = c70414RkI;
        this.l1 = c70414RkI2;
        this.l2 = pdpViewModel;
        this.l3 = list;
        this.l4 = list2;
        this.l5 = list3;
    }
}
