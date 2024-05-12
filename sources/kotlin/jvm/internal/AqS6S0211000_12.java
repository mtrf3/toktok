package kotlin.jvm.internal;

import X.AbstractC65781Prl;
import X.C27943Axv;
import X.C71360RzY;
import X.C76800UCe;
import X.InterfaceC88472Yns;
import com.ss.android.ugc.aweme.ecommerce.model.CommonVideoAnchorModel;
import com.ss.android.ugc.aweme.ecommerce.model.ShopWindowAnchorModel;
import java.util.Map;

/* loaded from: classes13.dex */
public class AqS6S0211000_12 extends AbstractC65781Prl implements InterfaceC88472Yns {
    public final int $t;
    public int i3;
    public Object l0;
    public Object l1;
    public boolean z2;

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

    public static final Object invoke$0(AqS6S0211000_12 aqS6S0211000_12, Object obj) {
        String str;
        String str2;
        String authorUid;
        C27943Axv sendLog = (C27943Axv) obj;
        o.LJIIIZ(sendLog, "$this$sendLog");
        sendLog.LIZLLL("EVENT_ORIGIN_FEATURE", "TEMAI");
        CommonVideoAnchorModel commonVideoAnchorModel = (CommonVideoAnchorModel) aqS6S0211000_12.l0;
        String str3 = "";
        if (commonVideoAnchorModel == null || (str = commonVideoAnchorModel.getEventType()) == null) {
            str = "";
        }
        sendLog.LIZLLL("enter_from", str);
        CommonVideoAnchorModel commonVideoAnchorModel2 = (CommonVideoAnchorModel) aqS6S0211000_12.l0;
        if (commonVideoAnchorModel2 != null && (authorUid = commonVideoAnchorModel2.getAuthorUid()) != null) {
            str3 = authorUid;
        }
        sendLog.LIZLLL("author_id", str3);
        sendLog.LIZLLL("item_order", String.valueOf(aqS6S0211000_12.i3 + 1));
        sendLog.LIZLLL("is_success", Integer.valueOf(aqS6S0211000_12.z2 ? 1 : 0));
        sendLog.LIZLLL("is_from_comment", "1");
        Long l = (Long) aqS6S0211000_12.l1;
        if (l == null || (str2 = l.toString()) == null) {
            str2 = "-1";
        }
        sendLog.LIZLLL("click_to_show_duration", str2);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$1(AqS6S0211000_12 aqS6S0211000_12, Object obj) {
        String str;
        C27943Axv sendLog = (C27943Axv) obj;
        o.LJIIIZ(sendLog, "$this$sendLog");
        sendLog.LIZLLL("button_name", "add_to_cart");
        if (aqS6S0211000_12.z2) {
            str = "able_to_cart";
        } else {
            str = "unable_to_cart";
        }
        sendLog.LIZLLL("button_type", str);
        Map<String, ? extends Object> map = ((ShopWindowAnchorModel) aqS6S0211000_12.l0).LIZ.promotionLogExtraInfo;
        if (map != null) {
            sendLog.LJ(map);
        }
        C71360RzY.LIZ(Integer.valueOf(aqS6S0211000_12.i3), null, null, (ShopWindowAnchorModel) aqS6S0211000_12.l0, (CommonVideoAnchorModel) aqS6S0211000_12.l1, sendLog);
        return C76800UCe.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS6S0211000_12(int i, CommonVideoAnchorModel commonVideoAnchorModel, ShopWindowAnchorModel shopWindowAnchorModel, boolean z, int i2) {
        super(1);
        this.$t = i2;
        this.z2 = z;
        this.l0 = shopWindowAnchorModel;
        this.i3 = i;
        this.l1 = commonVideoAnchorModel;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS6S0211000_12(int i, CommonVideoAnchorModel commonVideoAnchorModel, Long l, boolean z, int i2) {
        super(1);
        this.$t = i2;
        this.l0 = commonVideoAnchorModel;
        this.i3 = i;
        this.z2 = z;
        this.l1 = l;
    }
}
