package X;

import com.ss.android.ugc.aweme.ecommerce.base.delivery.repo.dto.WarehouseTag;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.ProductPackStruct;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.PromotionEntrance;
import com.ss.android.ugc.aweme.ecommerce.base.sku.model.dto.SaleProp;
import com.ss.android.ugc.aweme.ecommerce.core.da.HeaderBannerDaInfo;
import com.ss.android.ugc.aweme.ecommerce.slark.api.data.LaneParams;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.RjI, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C70352RjI extends AbstractC65781Prl implements InterfaceC88472Yns<LaneParams, C76800UCe> {
    public final /* synthetic */ C70414RkI LJLIL;
    public final /* synthetic */ String LJLILLLLZI;
    public final /* synthetic */ Integer LJLJI;
    public final /* synthetic */ boolean LJLJJI;
    public final /* synthetic */ long LJLJJL;
    public final /* synthetic */ long LJLJJLL;
    public final /* synthetic */ String LJLJL;
    public final /* synthetic */ Boolean LJLJLJ;
    public final /* synthetic */ String LJLJLLL;
    public final /* synthetic */ String LJLL;
    public final /* synthetic */ String LJLLI;
    public final /* synthetic */ String LJLLILLLL;
    public final /* synthetic */ Integer LJLLJ;
    public final /* synthetic */ Integer LJLLL;
    public final /* synthetic */ C70354RjK LJLLLL;
    public final /* synthetic */ C70357RjN LJLLLLLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C70352RjI(C70414RkI c70414RkI, String str, Integer num, boolean z, long j, long j2, String str2, Boolean bool, String str3, String str4, String str5, String str6, Integer num2, Integer num3, C70354RjK c70354RjK, C70357RjN c70357RjN) {
        super(1);
        this.LJLIL = c70414RkI;
        this.LJLILLLLZI = str;
        this.LJLJI = num;
        this.LJLJJI = z;
        this.LJLJJL = j;
        this.LJLJJLL = j2;
        this.LJLJL = str2;
        this.LJLJLJ = bool;
        this.LJLJLLL = str3;
        this.LJLL = str4;
        this.LJLLI = str5;
        this.LJLLILLLL = str6;
        this.LJLLJ = num2;
        this.LJLLL = num3;
        this.LJLLLL = c70354RjK;
        this.LJLLLLLL = c70357RjN;
    }

    @Override // X.InterfaceC88472Yns
    public final C76800UCe invoke(LaneParams laneParams) {
        int i;
        String str;
        String str2;
        WarehouseTag warehouseTag;
        PromotionEntrance promotionEntrance;
        String str3;
        WarehouseTag warehouseTag2;
        List<SaleProp> list;
        Integer num;
        LaneParams logNode = laneParams;
        o.LJIIIZ(logNode, "$this$logNode");
        logNode.withParamsGroup(this.LJLIL.LIZIZ);
        this.LJLIL.LJII(logNode);
        String str4 = this.LJLILLLLZI;
        if (str4 != null) {
            logNode.plusAssign("sku_id", str4);
        }
        Integer num2 = this.LJLJI;
        if (num2 != null) {
            logNode.plusAssign("quantity", Integer.valueOf(num2.intValue()));
        }
        ProductPackStruct productPackStruct = this.LJLIL.LJIIJJI;
        if (productPackStruct != null && (num = productPackStruct.status) != null) {
            i = num.intValue();
        } else {
            i = 1;
        }
        logNode.plusAssign("product_type", String.valueOf(i));
        if (this.LJLJJI) {
            str = "full_screen";
        } else {
            str = "half_screen";
        }
        logNode.plusAssign("page_show_type", str);
        C1EW.LIZIZ(this.LJLJJL, this.LJLJJLL, logNode, "start_click_to_now");
        ProductPackStruct productPackStruct2 = this.LJLIL.LJIIJJI;
        if (productPackStruct2 == null || (list = productPackStruct2.saleProps) == null || list.size() <= 6) {
            str2 = "no_greater_than_6";
        } else {
            str2 = "greater_than_6";
        }
        logNode.plusAssign("sku_show_type", str2);
        logNode.withNotCheckParam("traceparent", this.LJLJL);
        Boolean bool = this.LJLJLJ;
        if (bool != null) {
            logNode.plusAssign("is_buy_with_coupon", Integer.valueOf(bool.booleanValue() ? 1 : 0));
        }
        logNode.plusAssign("pdp_image_cache", Integer.valueOf(this.LJLIL.LJIL));
        String str5 = this.LJLJLLL;
        if (str5 != null) {
            logNode.plusAssign("jump_button_name", str5);
        }
        String str6 = this.LJLL;
        if (str6 != null) {
            logNode.plusAssign("coupon_id", str6);
        }
        String str7 = this.LJLLI;
        if (str7 != null) {
            logNode.plusAssign("coupon_type_id", str7);
        }
        String str8 = this.LJLLILLLL;
        if (str8 != null) {
            logNode.plusAssign("coupon_type_info", str8);
        }
        Integer num3 = this.LJLLJ;
        if (num3 != null) {
            logNode.plusAssign("is_coupon_tips_shown", Integer.valueOf(num3.intValue()));
        }
        ProductPackStruct productPackStruct3 = this.LJLIL.LJIIJJI;
        if (productPackStruct3 != null) {
            warehouseTag = productPackStruct3.warehouseTag;
        } else {
            warehouseTag = null;
        }
        if (warehouseTag != null) {
            if (productPackStruct3 == null || (warehouseTag2 = productPackStruct3.warehouseTag) == null || (str3 = warehouseTag2.fulfilledBy) == null) {
                str3 = "";
            }
            logNode.plusAssign("fulfilled_by", str3);
        } else {
            logNode.plusAssign("fulfilled_by", "no_label");
        }
        Integer num4 = this.LJLLL;
        if (num4 != null) {
            logNode.plusAssign("preorder_shipdays", Integer.valueOf(num4.intValue()));
        }
        C70354RjK c70354RjK = this.LJLLLL;
        if (c70354RjK != null) {
            String str9 = c70354RjK.LIZIZ;
            if (str9 != null) {
                logNode.put("original_price", str9);
            }
            Float f = c70354RjK.LIZ;
            if (f != null) {
                logNode.put("original_price_value", Float.valueOf(f.floatValue()));
            }
            String str10 = c70354RjK.LIZLLL;
            if (str10 != null) {
                logNode.put("sale_price", str10);
            }
            Float f2 = c70354RjK.LIZJ;
            if (f2 != null) {
                logNode.put("sale_price_value", Float.valueOf(f2.floatValue()));
            }
            String str11 = c70354RjK.LJ;
            if (str11 != null) {
                logNode.put("currency", str11);
            }
        }
        C70357RjN c70357RjN = this.LJLLLLLL;
        if (c70357RjN != null) {
            Float f3 = c70357RjN.LIZIZ;
            if (f3 != null) {
                logNode.put("shipping_price", Float.valueOf(f3.floatValue()));
            }
            Float f4 = c70357RjN.LIZJ;
            if (f4 != null) {
                logNode.put("shipping_price_after_coupon", Float.valueOf(f4.floatValue()));
            }
            String str12 = c70357RjN.LIZ;
            if (str12 != null) {
                logNode.put("delivery_info", str12);
            }
        }
        this.LJLIL.LJIIJJI(logNode);
        HeaderBannerDaInfo LJJII = C77117UOj.LJJII(this.LJLIL.LJIIJJI);
        logNode.plusAssign("rights_cnt", Integer.valueOf(LJJII.rightsCnt));
        logNode.plusAssign("rights_content", LJJII.rightsContent);
        ProductPackStruct productPackStruct4 = this.LJLIL.LJIIJJI;
        if (productPackStruct4 != null && (promotionEntrance = productPackStruct4.promotionEntrance) != null) {
            C70414RkI.LJIIIZ(logNode, promotionEntrance);
        }
        C1DF.LIZLLL(this.LJLIL.LIZIZ, logNode);
        return C76800UCe.LIZ;
    }
}
