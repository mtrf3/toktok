package kotlin.jvm.internal;

import X.AbstractC65781Prl;
import X.C38350F3i;
import X.C76800UCe;
import X.InterfaceC88472Yns;
import X.SY4;
import X.V1M;
import com.ss.android.ugc.aweme.ecommerce.base.common.model.Price;
import com.ss.android.ugc.aweme.ecommerce.base.delivery.repo.dto.LeadMessage;
import com.ss.android.ugc.aweme.ecommerce.base.delivery.repo.dto.LogisticDTO;
import com.ss.android.ugc.aweme.ecommerce.base.delivery.repo.dto.LogisticTextDTO;
import com.ss.android.ugc.aweme.ecommerce.slark.api.data.LaneParams;
import com.ss.android.ugc.aweme.feed.prompt.panel.PromptCheckerFragment;
import com.zhiliaoapp.musically.R;
import java.util.Map;

/* loaded from: classes5.dex */
public class AqS6S0111000_4 extends AbstractC65781Prl implements InterfaceC88472Yns {
    public final int $t;
    public int i2;
    public Object l0;
    public boolean z1;

    @Override // X.InterfaceC88472Yns
    public final Object invoke(Object obj) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj);
            case 1:
                return invoke$1(this, obj);
            case 2:
                return invoke$2(this, obj);
            case 3:
                return invoke$3(this, obj);
            case 4:
                return invoke$4(this, obj);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AqS6S0111000_4 aqS6S0111000_4, Object obj) {
        SY4 it = (SY4) obj;
        o.LJIIIZ(it, "it");
        it.setButtonSize(3);
        it.setText(((PromptCheckerFragment) aqS6S0111000_4.l0).getString(aqS6S0111000_4.i2));
        if (!aqS6S0111000_4.z1) {
            it.setButtonStartIcon(Integer.valueOf(R.raw.icon_arrow_clockwise));
        } else {
            it.setButtonStartIcon(null);
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$1(AqS6S0111000_4 aqS6S0111000_4, Object obj) {
        String str;
        String str2;
        LeadMessage leadMessage;
        String str3;
        String str4;
        String str5;
        String str6;
        String currency;
        String priceVal;
        Float LJJIJLIJ;
        LaneParams logView = (LaneParams) obj;
        o.LJIIIZ(logView, "$this$logView");
        Price price = ((LogisticDTO) aqS6S0111000_4.l0).shippingFee;
        if (price != null && (priceVal = price.getPriceVal()) != null && (LJJIJLIJ = C38350F3i.LJJIJLIJ(priceVal)) != null) {
            logView.plusAssign("shipping_price", Float.valueOf(LJJIJLIJ.floatValue()));
        }
        Price price2 = ((LogisticDTO) aqS6S0111000_4.l0).shippingFee;
        if (price2 != null && (currency = price2.getCurrency()) != null) {
            logView.plusAssign("shipping_currency", currency);
        }
        Map<String, String> map = ((LogisticDTO) aqS6S0111000_4.l0).eventTrackInfo;
        if (map != null && (str6 = map.get("shipping_type")) != null) {
            logView.plusAssign("option_name", str6);
        }
        Map<String, String> map2 = ((LogisticDTO) aqS6S0111000_4.l0).eventTrackInfo;
        if (map2 != null && (str5 = map2.get("est_delivery_day_max")) != null) {
            logView.plusAssign("est_delivery_day_max", str5);
        }
        Map<String, String> map3 = ((LogisticDTO) aqS6S0111000_4.l0).eventTrackInfo;
        if (map3 != null && (str4 = map3.get("est_delivery_day_min")) != null) {
            logView.plusAssign("est_delivery_day_min", str4);
        }
        logView.plusAssign("is_default", V1M.LJJJJZ(aqS6S0111000_4.z1));
        logView.plusAssign("rank", Integer.valueOf(aqS6S0111000_4.i2));
        LogisticTextDTO logisticTextDTO = ((LogisticDTO) aqS6S0111000_4.l0).logisticText;
        if (logisticTextDTO == null || (leadMessage = logisticTextDTO.leadMessage) == null || (str3 = leadMessage.fromOverseas) == null || str3.length() == 0) {
            str = "local";
        } else {
            str = "overseas";
        }
        logView.plusAssign("ship_from", str);
        logView.plusAssign("option_type", "shipping_type");
        Map<String, String> map4 = ((LogisticDTO) aqS6S0111000_4.l0).eventTrackInfo;
        if (map4 != null && (str2 = map4.get("is_next_day_delivery")) != null) {
            logView.plusAssign("is_next_day_delivery", str2);
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$2(AqS6S0111000_4 aqS6S0111000_4, Object obj) {
        String str;
        String str2;
        LeadMessage leadMessage;
        String str3;
        String str4;
        String str5;
        String str6;
        String currency;
        String priceVal;
        Float LJJIJLIJ;
        LaneParams logView = (LaneParams) obj;
        o.LJIIIZ(logView, "$this$logView");
        Price price = ((LogisticDTO) aqS6S0111000_4.l0).shippingFee;
        if (price != null && (priceVal = price.getPriceVal()) != null && (LJJIJLIJ = C38350F3i.LJJIJLIJ(priceVal)) != null) {
            logView.plusAssign("shipping_price", Float.valueOf(LJJIJLIJ.floatValue()));
        }
        Price price2 = ((LogisticDTO) aqS6S0111000_4.l0).shippingFee;
        if (price2 != null && (currency = price2.getCurrency()) != null) {
            logView.plusAssign("shipping_currency", currency);
        }
        Map<String, String> map = ((LogisticDTO) aqS6S0111000_4.l0).eventTrackInfo;
        if (map != null && (str6 = map.get("shipping_type")) != null) {
            logView.plusAssign("option_name", str6);
        }
        Map<String, String> map2 = ((LogisticDTO) aqS6S0111000_4.l0).eventTrackInfo;
        if (map2 != null && (str5 = map2.get("est_delivery_day_max")) != null) {
            logView.plusAssign("est_delivery_day_max", str5);
        }
        Map<String, String> map3 = ((LogisticDTO) aqS6S0111000_4.l0).eventTrackInfo;
        if (map3 != null && (str4 = map3.get("est_delivery_day_min")) != null) {
            logView.plusAssign("est_delivery_day_min", str4);
        }
        logView.plusAssign("is_default", Boolean.valueOf(aqS6S0111000_4.z1));
        logView.plusAssign("rank", Integer.valueOf(aqS6S0111000_4.i2));
        LogisticTextDTO logisticTextDTO = ((LogisticDTO) aqS6S0111000_4.l0).logisticText;
        if (logisticTextDTO == null || (leadMessage = logisticTextDTO.leadMessage) == null || (str3 = leadMessage.fromOverseas) == null || str3.length() == 0) {
            str = "local";
        } else {
            str = "overseas";
        }
        logView.plusAssign("ship_from", str);
        logView.plusAssign("option_type", "shipping_type");
        Map<String, String> map4 = ((LogisticDTO) aqS6S0111000_4.l0).eventTrackInfo;
        if (map4 != null && (str2 = map4.get("is_next_day_delivery")) != null) {
            logView.plusAssign("is_next_day_delivery", str2);
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$3(AqS6S0111000_4 aqS6S0111000_4, Object obj) {
        String str;
        String str2;
        LeadMessage leadMessage;
        String str3;
        String str4;
        String str5;
        String str6;
        String currency;
        String priceVal;
        Float LJJIJLIJ;
        LaneParams logView = (LaneParams) obj;
        o.LJIIIZ(logView, "$this$logView");
        Price price = ((LogisticDTO) aqS6S0111000_4.l0).shippingFee;
        if (price != null && (priceVal = price.getPriceVal()) != null && (LJJIJLIJ = C38350F3i.LJJIJLIJ(priceVal)) != null) {
            logView.plusAssign("shipping_price", Float.valueOf(LJJIJLIJ.floatValue()));
        }
        Price price2 = ((LogisticDTO) aqS6S0111000_4.l0).shippingFee;
        if (price2 != null && (currency = price2.getCurrency()) != null) {
            logView.plusAssign("shipping_currency", currency);
        }
        Map<String, String> map = ((LogisticDTO) aqS6S0111000_4.l0).eventTrackInfo;
        if (map != null && (str6 = map.get("shipping_type")) != null) {
            logView.plusAssign("option_name", str6);
        }
        Map<String, String> map2 = ((LogisticDTO) aqS6S0111000_4.l0).eventTrackInfo;
        if (map2 != null && (str5 = map2.get("est_delivery_day_max")) != null) {
            logView.plusAssign("est_delivery_day_max", str5);
        }
        Map<String, String> map3 = ((LogisticDTO) aqS6S0111000_4.l0).eventTrackInfo;
        if (map3 != null && (str4 = map3.get("est_delivery_day_min")) != null) {
            logView.plusAssign("est_delivery_day_min", str4);
        }
        logView.plusAssign("is_default", V1M.LJJJJZ(aqS6S0111000_4.z1));
        logView.plusAssign("rank", Integer.valueOf(aqS6S0111000_4.i2));
        LogisticTextDTO logisticTextDTO = ((LogisticDTO) aqS6S0111000_4.l0).logisticText;
        if (logisticTextDTO == null || (leadMessage = logisticTextDTO.leadMessage) == null || (str3 = leadMessage.fromOverseas) == null || str3.length() == 0) {
            str = "local";
        } else {
            str = "overseas";
        }
        logView.plusAssign("ship_from", str);
        logView.plusAssign("option_type", "shipping_type");
        Map<String, String> map4 = ((LogisticDTO) aqS6S0111000_4.l0).eventTrackInfo;
        if (map4 != null && (str2 = map4.get("is_next_day_delivery")) != null) {
            logView.plusAssign("is_next_day_delivery", str2);
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$4(AqS6S0111000_4 aqS6S0111000_4, Object obj) {
        String str;
        String str2;
        LeadMessage leadMessage;
        String str3;
        String str4;
        String str5;
        String str6;
        String currency;
        String priceVal;
        Float LJJIJLIJ;
        LaneParams logView = (LaneParams) obj;
        o.LJIIIZ(logView, "$this$logView");
        Price price = ((LogisticDTO) aqS6S0111000_4.l0).shippingFee;
        if (price != null && (priceVal = price.getPriceVal()) != null && (LJJIJLIJ = C38350F3i.LJJIJLIJ(priceVal)) != null) {
            logView.plusAssign("shipping_price", Float.valueOf(LJJIJLIJ.floatValue()));
        }
        Price price2 = ((LogisticDTO) aqS6S0111000_4.l0).shippingFee;
        if (price2 != null && (currency = price2.getCurrency()) != null) {
            logView.plusAssign("shipping_currency", currency);
        }
        Map<String, String> map = ((LogisticDTO) aqS6S0111000_4.l0).eventTrackInfo;
        if (map != null && (str6 = map.get("shipping_type")) != null) {
            logView.plusAssign("option_name", str6);
        }
        Map<String, String> map2 = ((LogisticDTO) aqS6S0111000_4.l0).eventTrackInfo;
        if (map2 != null && (str5 = map2.get("est_delivery_day_max")) != null) {
            logView.plusAssign("est_delivery_day_max", str5);
        }
        Map<String, String> map3 = ((LogisticDTO) aqS6S0111000_4.l0).eventTrackInfo;
        if (map3 != null && (str4 = map3.get("est_delivery_day_min")) != null) {
            logView.plusAssign("est_delivery_day_min", str4);
        }
        logView.plusAssign("is_default", Integer.valueOf(aqS6S0111000_4.z1 ? 1 : 0));
        logView.plusAssign("rank", Integer.valueOf(aqS6S0111000_4.i2));
        LogisticTextDTO logisticTextDTO = ((LogisticDTO) aqS6S0111000_4.l0).logisticText;
        if (logisticTextDTO == null || (leadMessage = logisticTextDTO.leadMessage) == null || (str3 = leadMessage.fromOverseas) == null || str3.length() == 0) {
            str = "local";
        } else {
            str = "overseas";
        }
        logView.plusAssign("ship_from", str);
        logView.plusAssign("option_type", "shipping_type");
        Map<String, String> map4 = ((LogisticDTO) aqS6S0111000_4.l0).eventTrackInfo;
        if (map4 != null && (str2 = map4.get("is_next_day_delivery")) != null) {
            logView.plusAssign("is_next_day_delivery", str2);
        }
        return C76800UCe.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS6S0111000_4(LogisticDTO logisticDTO, boolean z, int i, int i2) {
        super(1);
        this.$t = i2;
        this.l0 = logisticDTO;
        this.z1 = z;
        this.i2 = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS6S0111000_4(PromptCheckerFragment promptCheckerFragment, int i, boolean z, int i2) {
        super(1);
        this.$t = i2;
        this.l0 = promptCheckerFragment;
        this.i2 = i;
        this.z1 = z;
    }
}
