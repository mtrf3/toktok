package X;

import com.ss.android.ugc.aweme.ecommerce.base.delivery.repo.dto.WarehouseTag;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.Amount;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.InstallmentPlan;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.BnplInfo;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.PdpPaymentModule;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.ProductPackStruct;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.PromotionEntrance;
import com.ss.android.ugc.aweme.ecommerce.base.sku.model.dto.SaleProp;
import com.ss.android.ugc.aweme.ecommerce.core.da.HeaderBannerDaInfo;
import java.util.List;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* renamed from: X.RjH, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C70351RjH extends AbstractC65781Prl implements InterfaceC88472Yns<C27943Axv, C76800UCe> {
    public final /* synthetic */ C70414RkI LJLIL;
    public final /* synthetic */ java.util.Map<String, Object> LJLILLLLZI;
    public final /* synthetic */ String LJLJI;
    public final /* synthetic */ Integer LJLJJI;
    public final /* synthetic */ boolean LJLJJL;
    public final /* synthetic */ long LJLJJLL;
    public final /* synthetic */ long LJLJL;
    public final /* synthetic */ String LJLJLJ;
    public final /* synthetic */ Boolean LJLJLLL;
    public final /* synthetic */ String LJLL;
    public final /* synthetic */ String LJLLI;
    public final /* synthetic */ String LJLLILLLL;
    public final /* synthetic */ String LJLLJ;
    public final /* synthetic */ Integer LJLLL;
    public final /* synthetic */ Integer LJLLLL;
    public final /* synthetic */ C70354RjK LJLLLLLL;
    public final /* synthetic */ C70357RjN LJLZ;
    public final /* synthetic */ InstallmentPlan LJZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C70351RjH(C70414RkI c70414RkI, java.util.Map<String, ? extends Object> map, String str, Integer num, boolean z, long j, long j2, String str2, Boolean bool, String str3, String str4, String str5, String str6, Integer num2, Integer num3, C70354RjK c70354RjK, C70357RjN c70357RjN, InstallmentPlan installmentPlan) {
        super(1);
        this.LJLIL = c70414RkI;
        this.LJLILLLLZI = map;
        this.LJLJI = str;
        this.LJLJJI = num;
        this.LJLJJL = z;
        this.LJLJJLL = j;
        this.LJLJL = j2;
        this.LJLJLJ = str2;
        this.LJLJLLL = bool;
        this.LJLL = str3;
        this.LJLLI = str4;
        this.LJLLILLLL = str5;
        this.LJLLJ = str6;
        this.LJLLL = num2;
        this.LJLLLL = num3;
        this.LJLLLLLL = c70354RjK;
        this.LJLZ = c70357RjN;
        this.LJZ = installmentPlan;
    }

    @Override // X.InterfaceC88472Yns
    public final C76800UCe invoke(C27943Axv c27943Axv) {
        int i;
        Object obj;
        Object obj2;
        WarehouseTag warehouseTag;
        PdpPaymentModule pdpPaymentModule;
        BnplInfo bnplInfo;
        List<InstallmentPlan> list;
        PromotionEntrance promotionEntrance;
        Object obj3;
        WarehouseTag warehouseTag2;
        List<SaleProp> list2;
        Integer num;
        C27943Axv sendLogReturnParams = c27943Axv;
        o.LJIIIZ(sendLogReturnParams, "$this$sendLogReturnParams");
        C27943Axv.LIZ(sendLogReturnParams, this.LJLIL.LIZIZ);
        this.LJLIL.LJIIIIZZ(sendLogReturnParams);
        java.util.Map<String, ? extends Object> map = this.LJLILLLLZI;
        if (map != null) {
            sendLogReturnParams.LJ(map);
        }
        Object obj4 = this.LJLJI;
        if (obj4 != null) {
            sendLogReturnParams.LIZJ("sku_id", obj4);
        }
        Integer num2 = this.LJLJJI;
        if (num2 != null) {
            sendLogReturnParams.LIZJ("quantity", Integer.valueOf(num2.intValue()));
        }
        ProductPackStruct productPackStruct = this.LJLIL.LJIIJJI;
        if (productPackStruct != null && (num = productPackStruct.status) != null) {
            i = num.intValue();
        } else {
            i = 1;
        }
        sendLogReturnParams.LIZJ("product_type", String.valueOf(i));
        if (this.LJLJJL) {
            obj = "full_screen";
        } else {
            obj = "half_screen";
        }
        sendLogReturnParams.LIZJ("page_show_type", obj);
        sendLogReturnParams.LIZJ("start_click_to_now", Long.valueOf(this.LJLJJLL - this.LJLJL));
        ProductPackStruct productPackStruct2 = this.LJLIL.LJIIJJI;
        if (productPackStruct2 == null || (list2 = productPackStruct2.saleProps) == null || list2.size() <= 6) {
            obj2 = "no_greater_than_6";
        } else {
            obj2 = "greater_than_6";
        }
        sendLogReturnParams.LIZJ("sku_show_type", obj2);
        sendLogReturnParams.LIZLLL("traceparent", this.LJLJLJ);
        Boolean bool = this.LJLJLLL;
        if (bool != null) {
            sendLogReturnParams.LIZJ("is_buy_with_coupon", Integer.valueOf(bool.booleanValue() ? 1 : 0));
        }
        sendLogReturnParams.LIZJ("pdp_image_cache", Integer.valueOf(this.LJLIL.LJIL));
        Object obj5 = this.LJLL;
        if (obj5 != null) {
            sendLogReturnParams.LIZJ("jump_button_name", obj5);
        }
        Object obj6 = this.LJLLI;
        if (obj6 != null) {
            sendLogReturnParams.LIZJ("coupon_id", obj6);
        }
        Object obj7 = this.LJLLILLLL;
        if (obj7 != null) {
            sendLogReturnParams.LIZJ("coupon_type_id", obj7);
        }
        Object obj8 = this.LJLLJ;
        if (obj8 != null) {
            sendLogReturnParams.LIZJ("coupon_type_info", obj8);
        }
        Integer num3 = this.LJLLL;
        if (num3 != null) {
            sendLogReturnParams.LIZJ("is_coupon_tips_shown", Integer.valueOf(num3.intValue()));
        }
        ProductPackStruct productPackStruct3 = this.LJLIL.LJIIJJI;
        String str = null;
        if (productPackStruct3 != null) {
            warehouseTag = productPackStruct3.warehouseTag;
        } else {
            warehouseTag = null;
        }
        if (warehouseTag != null) {
            if (productPackStruct3 == null || (warehouseTag2 = productPackStruct3.warehouseTag) == null || (obj3 = warehouseTag2.fulfilledBy) == null) {
                obj3 = "";
            }
            sendLogReturnParams.LIZJ("fulfilled_by", obj3);
        } else {
            sendLogReturnParams.LIZJ("fulfilled_by", "no_label");
        }
        Integer num4 = this.LJLLLL;
        if (num4 != null) {
            sendLogReturnParams.LIZJ("preorder_shipdays", Integer.valueOf(num4.intValue()));
        }
        C70354RjK c70354RjK = this.LJLLLLLL;
        if (c70354RjK != null) {
            C70355RjL.LIZLLL(c70354RjK, sendLogReturnParams);
        }
        C70357RjN c70357RjN = this.LJLZ;
        if (c70357RjN != null) {
            Float f = c70357RjN.LIZIZ;
            if (f != null) {
                sendLogReturnParams.LIZLLL("shipping_price", Float.valueOf(f.floatValue()));
            }
            Float f2 = c70357RjN.LIZJ;
            if (f2 != null) {
                sendLogReturnParams.LIZLLL("shipping_price_after_coupon", Float.valueOf(f2.floatValue()));
            }
            Object obj9 = c70357RjN.LIZ;
            if (obj9 != null) {
                sendLogReturnParams.LIZLLL("delivery_info", obj9);
            }
        }
        this.LJLIL.LJIIL(sendLogReturnParams);
        HeaderBannerDaInfo LJJII = C77117UOj.LJJII(this.LJLIL.LJIIJJI);
        sendLogReturnParams.LIZJ("rights_cnt", Integer.valueOf(LJJII.rightsCnt));
        sendLogReturnParams.LIZJ("rights_content", LJJII.rightsContent);
        C70414RkI c70414RkI = this.LJLIL;
        ProductPackStruct productPackStruct4 = c70414RkI.LJIIJJI;
        if (productPackStruct4 != null && (promotionEntrance = productPackStruct4.promotionEntrance) != null) {
            c70414RkI.LJIIJ(sendLogReturnParams, promotionEntrance);
        }
        C1DF.LIZJ(this.LJLIL.LIZIZ, false, sendLogReturnParams, false, null);
        ProductPackStruct productPackStruct5 = this.LJLIL.LJIIJJI;
        if (productPackStruct5 != null && (pdpPaymentModule = productPackStruct5.pdpPaymentModule) != null && (bnplInfo = pdpPaymentModule.bnplInfo) != null && (list = bnplInfo.installmentPlans) != null) {
            InstallmentPlan installmentPlan = this.LJZ;
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("installment_cnt", list.size());
            if (installmentPlan != null) {
                Amount amount = installmentPlan.totalRepayment;
                if (amount != null) {
                    str = amount.amount;
                }
                jSONObject.put("total_payment", str);
                jSONObject.put("service_fee", installmentPlan.totalFeeText);
            }
            sendLogReturnParams.LIZJ("tiktok_paylater_info", jSONObject);
        }
        return C76800UCe.LIZ;
    }
}
