package kotlin.jvm.internal;

import X.AbstractC65781Prl;
import X.C27303Anb;
import X.C27356AoS;
import X.C38350F3i;
import X.C61878OQg;
import X.C76800UCe;
import X.C78685UuP;
import X.InterfaceC88472Yns;
import X.ORZ;
import android.os.SystemClock;
import com.ss.android.ugc.aweme.ecommerce.base.address.AddressPageStarter;
import com.ss.android.ugc.aweme.ecommerce.base.address.edit.AddressEditViewModel;
import com.ss.android.ugc.aweme.ecommerce.base.address.widget.ZipCodePickerDialogFragment;
import com.ss.android.ugc.aweme.ecommerce.base.common.model.Price;
import com.ss.android.ugc.aweme.ecommerce.base.delivery.repo.dto.LogisticDTO;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.module.shipping.DeliveryBySellerInfoFragment;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.PdpRecommendPreloadResponse;
import com.ss.android.ugc.aweme.ecommerce.base.pdpv2.vh.desc.ProductDescVideoBrickVH;
import com.ss.android.ugc.aweme.ecommerce.base.widget.regionpicker.fragment.DistrictFragment;
import com.ss.android.ugc.aweme.ecommerce.base.widget.regionpicker.model.District;
import com.ss.android.ugc.aweme.ecommerce.slark.api.data.LaneParams;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.util.HashMap;
import java.util.List;

/* loaded from: classes5.dex */
public class AqS29S0100100_4 extends AbstractC65781Prl implements InterfaceC88472Yns {
    public final int $t;
    public long j1;
    public Object l0;

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
            case 5:
                return invoke$5(this, obj);
            case 6:
                return invoke$6(this, obj);
            case 7:
                return invoke$7(this, obj);
            case 8:
                return invoke$8(this, obj);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AqS29S0100100_4 aqS29S0100100_4, Object obj) {
        int i;
        LaneParams logNode = (LaneParams) obj;
        o.LJIIIZ(logNode, "$this$logNode");
        long j = aqS29S0100100_4.j1;
        PdpRecommendPreloadResponse pdpRecommendPreloadResponse = (PdpRecommendPreloadResponse) aqS29S0100100_4.l0;
        logNode.plusAssign("duration", Long.valueOf(SystemClock.elapsedRealtime() - j));
        Integer num = pdpRecommendPreloadResponse.code;
        if (num == null || num.intValue() != 0 || !C78685UuP.LJJJZ(pdpRecommendPreloadResponse.data)) {
            i = 0;
        } else {
            i = 1;
        }
        logNode.plusAssign("is_success", Integer.valueOf(i));
        logNode.plusAssign("err_msg", pdpRecommendPreloadResponse.message);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$1(AqS29S0100100_4 aqS29S0100100_4, Object obj) {
        LaneParams logNode = (LaneParams) obj;
        o.LJIIIZ(logNode, "$this$logNode");
        logNode.plusAssign("stay_time", Long.valueOf(aqS29S0100100_4.j1));
        logNode.plusAssign("quit_type", ((ZipCodePickerDialogFragment) aqS29S0100100_4.l0).LJLJI);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$2(AqS29S0100100_4 aqS29S0100100_4, Object obj) {
        LaneParams logNode = (LaneParams) obj;
        o.LJIIIZ(logNode, "$this$logNode");
        logNode.plusAssign("stay_time", Long.valueOf(aqS29S0100100_4.j1));
        logNode.plusAssign("quit_type", ((DeliveryBySellerInfoFragment) aqS29S0100100_4.l0).LJLILLLLZI);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$3(AqS29S0100100_4 aqS29S0100100_4, Object obj) {
        String str;
        LaneParams logNode = (LaneParams) obj;
        o.LJIIIZ(logNode, "$this$logNode");
        Aweme aweme = ((ProductDescVideoBrickVH) aqS29S0100100_4.l0).LJLL;
        if (aweme != null) {
            str = aweme.getAid();
        } else {
            str = null;
        }
        logNode.plusAssign("video_id", str);
        logNode.plusAssign("duration", Long.valueOf(aqS29S0100100_4.j1));
        return C76800UCe.LIZ;
    }

    public static final Object invoke$4(AqS29S0100100_4 aqS29S0100100_4, Object obj) {
        String str;
        LaneParams logNode = (LaneParams) obj;
        o.LJIIIZ(logNode, "$this$logNode");
        Aweme aweme = ((ProductDescVideoBrickVH) aqS29S0100100_4.l0).LJLL;
        if (aweme != null) {
            str = aweme.getAid();
        } else {
            str = null;
        }
        logNode.plusAssign("video_id", str);
        logNode.plusAssign("duration", Long.valueOf(aqS29S0100100_4.j1));
        return C76800UCe.LIZ;
    }

    public static final Object invoke$5(AqS29S0100100_4 aqS29S0100100_4, Object obj) {
        int i;
        District district;
        List<District> list;
        LaneParams logView = (LaneParams) obj;
        o.LJIIIZ(logView, "$this$logView");
        logView.plusAssign("item_num", Integer.valueOf(logView.size()));
        logView.plusAssign("stay_time", Long.valueOf(aqS29S0100100_4.j1));
        logView.plusAssign("drop_down_list_area", ((DistrictFragment) aqS29S0100100_4.l0).Al().LJLLLL);
        C27356AoS<District> c27356AoS = ((DistrictFragment) aqS29S0100100_4.l0).LLF;
        if (c27356AoS != null && (district = c27356AoS.LIZ) != null && (list = district.parRegions) != null) {
            i = list.size() + 1;
        } else {
            i = 0;
        }
        logView.plusAssign("max_region_level", Integer.valueOf(i));
        return C76800UCe.LIZ;
    }

    public static final Object invoke$6(AqS29S0100100_4 aqS29S0100100_4, Object obj) {
        Float f;
        String priceVal;
        LaneParams logView = (LaneParams) obj;
        o.LJIIIZ(logView, "$this$logView");
        logView.plusAssign("actionsheet_name", "next_day_delivery");
        Price price = ((LogisticDTO) aqS29S0100100_4.l0).shippingFee;
        String str = null;
        if (price != null && (priceVal = price.getPriceVal()) != null) {
            f = C38350F3i.LJJIJLIJ(priceVal);
        } else {
            f = null;
        }
        logView.plusAssign("shipping_price", f);
        Price price2 = ((LogisticDTO) aqS29S0100100_4.l0).shippingFee;
        if (price2 != null) {
            str = price2.getCurrency();
        }
        logView.plusAssign("shipping_currency", str);
        logView.plusAssign("stay_time", Long.valueOf(aqS29S0100100_4.j1));
        return C76800UCe.LIZ;
    }

    public static final Object invoke$7(AqS29S0100100_4 aqS29S0100100_4, Object obj) {
        Object obj2;
        LaneParams logNode = (LaneParams) obj;
        o.LJIIIZ(logNode, "$this$logNode");
        logNode.plusAssign("is_success", 1);
        String str = null;
        logNode.plusAssign("fail_reason", ORZ.LLD(C61878OQg.INSTANCE, ",", null, null, C27303Anb.LJLIL, 30));
        String str2 = "1";
        if (((AddressEditViewModel) aqS29S0100100_4.l0).LLILIL) {
            obj2 = "1";
        } else {
            obj2 = CardStruct.IStatusCode.DEFAULT;
        }
        logNode.plusAssign("is_with_tip", obj2);
        AddressPageStarter.AddressEditEnterParams addressEditEnterParams = ((AddressEditViewModel) aqS29S0100100_4.l0).LJZ;
        Object obj3 = null;
        if (addressEditEnterParams != null) {
            str = addressEditEnterParams.pdpFrom;
        }
        logNode.plusAssign("pdp_from", str);
        logNode.plusAssign("update_address_format_select", ((AddressEditViewModel) aqS29S0100100_4.l0).LLIZ);
        logNode.plusAssign("duration", Long.valueOf(aqS29S0100100_4.j1));
        logNode.plusAssign("address_result", ((AddressEditViewModel) aqS29S0100100_4.l0).LLIIIILZ);
        logNode.plusAssign("is_all_filled", Integer.valueOf(((AddressEditViewModel) aqS29S0100100_4.l0).Vv0()));
        HashMap<String, Object> hashMap = ((AddressEditViewModel) aqS29S0100100_4.l0).LJLLLL;
        if (hashMap != null) {
            obj3 = hashMap.get("previous_page");
        }
        logNode.plusAssign("previous_page", obj3);
        if (!((AddressEditViewModel) aqS29S0100100_4.l0).LLJILJILJ) {
            str2 = CardStruct.IStatusCode.DEFAULT;
        }
        logNode.plusAssign("is_fullscreen", str2);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$8(AqS29S0100100_4 aqS29S0100100_4, Object obj) {
        Float f;
        String priceVal;
        LaneParams logView = (LaneParams) obj;
        o.LJIIIZ(logView, "$this$logView");
        logView.plusAssign("actionsheet_name", "next_day_delivery");
        Price price = ((LogisticDTO) aqS29S0100100_4.l0).shippingFee;
        String str = null;
        if (price != null && (priceVal = price.getPriceVal()) != null) {
            f = C38350F3i.LJJIJLIJ(priceVal);
        } else {
            f = null;
        }
        logView.plusAssign("shipping_price", f);
        Price price2 = ((LogisticDTO) aqS29S0100100_4.l0).shippingFee;
        if (price2 != null) {
            str = price2.getCurrency();
        }
        logView.plusAssign("shipping_currency", str);
        logView.plusAssign("stay_time", Long.valueOf(aqS29S0100100_4.j1));
        return C76800UCe.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS29S0100100_4(long j, AddressEditViewModel addressEditViewModel, int i) {
        super(1);
        this.$t = i;
        this.l0 = addressEditViewModel;
        this.j1 = j;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS29S0100100_4(long j, ZipCodePickerDialogFragment zipCodePickerDialogFragment, int i) {
        super(1);
        this.$t = i;
        this.j1 = j;
        this.l0 = zipCodePickerDialogFragment;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS29S0100100_4(long j, DeliveryBySellerInfoFragment deliveryBySellerInfoFragment, int i) {
        super(1);
        this.$t = i;
        this.j1 = j;
        this.l0 = deliveryBySellerInfoFragment;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS29S0100100_4(long j, PdpRecommendPreloadResponse pdpRecommendPreloadResponse, int i) {
        super(1);
        this.$t = i;
        this.j1 = j;
        this.l0 = pdpRecommendPreloadResponse;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS29S0100100_4(long j, DistrictFragment districtFragment, int i) {
        super(1);
        this.$t = i;
        this.j1 = j;
        this.l0 = districtFragment;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS29S0100100_4(LogisticDTO logisticDTO, long j, int i) {
        super(1);
        this.$t = i;
        this.l0 = logisticDTO;
        this.j1 = j;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS29S0100100_4(ProductDescVideoBrickVH productDescVideoBrickVH, long j, int i) {
        super(1);
        this.$t = i;
        this.l0 = productDescVideoBrickVH;
        this.j1 = j;
    }
}
