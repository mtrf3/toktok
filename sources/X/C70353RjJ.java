package X;

import android.os.SystemClock;
import com.ss.android.ugc.aweme.ecommerce.core.da.HeaderBannerDaInfo;
import com.ss.android.ugc.aweme.ecommerce.slark.api.data.LaneParams;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.util.HashMap;
import kotlin.jvm.internal.o;

/* renamed from: X.RjJ, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C70353RjJ extends AbstractC65781Prl implements InterfaceC88472Yns<LaneParams, C76800UCe> {
    public final /* synthetic */ C70691Rol LJLIL;
    public final /* synthetic */ boolean LJLILLLLZI;
    public final /* synthetic */ String LJLJI;
    public final /* synthetic */ Integer LJLJJI;
    public final /* synthetic */ Integer LJLJJL;
    public final /* synthetic */ boolean LJLJJLL = true;
    public final /* synthetic */ long LJLJL;
    public final /* synthetic */ Integer LJLJLJ;
    public final /* synthetic */ C70354RjK LJLJLLL;
    public final /* synthetic */ C70357RjN LJLL;
    public final /* synthetic */ Integer LJLLI;
    public final /* synthetic */ String LJLLILLLL;
    public final /* synthetic */ HeaderBannerDaInfo LJLLJ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C70353RjJ(C70691Rol c70691Rol, boolean z, String str, Integer num, Integer num2, long j, Integer num3, C70354RjK c70354RjK, C70357RjN c70357RjN, Integer num4, String str2, HeaderBannerDaInfo headerBannerDaInfo) {
        super(1);
        this.LJLIL = c70691Rol;
        this.LJLILLLLZI = z;
        this.LJLJI = str;
        this.LJLJJI = num;
        this.LJLJJL = num2;
        this.LJLJL = j;
        this.LJLJLJ = num3;
        this.LJLJLLL = c70354RjK;
        this.LJLL = c70357RjN;
        this.LJLLI = num4;
        this.LJLLILLLL = str2;
        this.LJLLJ = headerBannerDaInfo;
    }

    @Override // X.InterfaceC88472Yns
    public final C76800UCe invoke(LaneParams laneParams) {
        String str;
        String str2;
        HashMap<String, Object> LJII;
        String str3;
        LaneParams logNode = laneParams;
        o.LJIIIZ(logNode, "$this$logNode");
        int i = C70691Rol.LJIJJLI;
        if (i == 1) {
            this.LJLIL.getClass();
            C70691Rol.LIZLLL(logNode);
        } else if (i == 2) {
            logNode.plusAssign("page_name", "shop_review");
            logNode.plusAssign("review_cnt", Integer.valueOf(C70691Rol.LJIILLIIL));
            logNode.plusAssign("shop_review_cnt", Integer.valueOf(C70691Rol.LJIIZILJ));
        }
        if (this.LJLILLLLZI) {
            str = "1";
        } else {
            str = CardStruct.IStatusCode.DEFAULT;
        }
        logNode.plusAssign("is_buy_with_coupon", str);
        String str4 = this.LJLJI;
        if (str4 != null) {
            logNode.plusAssign("sku_id", str4);
        }
        Integer num = this.LJLJJI;
        if (num != null) {
            logNode.plusAssign("quantity", Integer.valueOf(num.intValue()));
        }
        Integer num2 = this.LJLJJL;
        if (num2 != null) {
            logNode.plusAssign("product_type", Integer.valueOf(num2.intValue()));
        }
        if (this.LJLJJLL) {
            str2 = "full_screen";
        } else {
            str2 = "half_screen";
        }
        logNode.plusAssign("page_show_type", str2);
        C1EW.LIZIZ(SystemClock.elapsedRealtime(), this.LJLJL, logNode, "start_click_to_now");
        Integer num3 = this.LJLJLJ;
        if (num3 != null) {
            C70691Rol c70691Rol = this.LJLIL;
            int intValue = num3.intValue();
            c70691Rol.getClass();
            if (intValue <= 6) {
                str3 = "no_greater_than_6";
            } else {
                str3 = "greater_than_6";
            }
            logNode.plusAssign("sku_show_type", str3);
        }
        C70354RjK c70354RjK = this.LJLJLLL;
        if (c70354RjK != null) {
            String str5 = c70354RjK.LIZIZ;
            if (str5 != null) {
                logNode.plusAssign("original_price", str5);
            }
            Float f = c70354RjK.LIZ;
            if (f != null) {
                logNode.plusAssign("original_price_value", Float.valueOf(f.floatValue()));
            }
            String str6 = c70354RjK.LIZLLL;
            if (str6 != null) {
                logNode.plusAssign("sale_price", str6);
            }
            Float f2 = c70354RjK.LIZJ;
            if (f2 != null) {
                logNode.plusAssign("sale_price_value", Float.valueOf(f2.floatValue()));
            }
            String str7 = c70354RjK.LJ;
            if (str7 != null) {
                logNode.plusAssign("currency", str7);
            }
        }
        C70357RjN c70357RjN = this.LJLL;
        if (c70357RjN != null) {
            Float f3 = c70357RjN.LIZIZ;
            if (f3 != null) {
                logNode.plusAssign("shipping_price", Float.valueOf(f3.floatValue()));
            }
            Float f4 = c70357RjN.LIZJ;
            if (f4 != null) {
                logNode.plusAssign("shipping_price_after_coupon", Float.valueOf(f4.floatValue()));
            }
            String str8 = c70357RjN.LIZ;
            if (str8 != null) {
                logNode.plusAssign("delivery_info", str8);
            }
        }
        Integer num4 = this.LJLLI;
        if (num4 != null) {
            logNode.plusAssign("preorder_shipdays", Integer.valueOf(num4.intValue()));
        }
        String str9 = this.LJLLILLLL;
        if (str9 != null && (LJII = C27739Aud.LJII(str9)) != null) {
            logNode.putAll(LJII);
        }
        HeaderBannerDaInfo headerBannerDaInfo = this.LJLLJ;
        if (headerBannerDaInfo != null) {
            logNode.plusAssign("rights_cnt", Integer.valueOf(headerBannerDaInfo.rightsCnt));
            logNode.plusAssign("rights_content", headerBannerDaInfo.rightsContent);
        }
        return C76800UCe.LIZ;
    }
}
