package kotlin.jvm.internal;

import X.AbstractC65781Prl;
import X.C34K;
import X.C48658J7u;
import X.C50865Jxl;
import X.C76800UCe;
import X.InterfaceC65784Pro;
import X.KAK;
import X.KFY;
import X.WM7;
import com.ss.android.ugc.aweme.ecommerce.search.result.vertical.assem.ShopVerticalAssem;
import com.ss.android.ugc.aweme.result.common.core.ui.fragment.DynamicSearchShopFragment;
import org.json.JSONObject;

/* loaded from: classes9.dex */
public class AqS1S1200300_8 extends AbstractC65781Prl implements InterfaceC65784Pro {
    public final int $t;
    public long j3;
    public long j4;
    public long j5;
    public Object l1;
    public Object l2;
    public String s0;

    @Override // X.InterfaceC65784Pro
    public final Object invoke() {
        switch (this.$t) {
            case 0:
                return invoke$0(this);
            case 1:
                return invoke$1(this);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AqS1S1200300_8 aqS1S1200300_8) {
        C34K c34k = (C34K) aqS1S1200300_8.l1;
        if (!c34k.element) {
            c34k.element = true;
            long currentTimeMillis = System.currentTimeMillis();
            JSONObject jSONObject = new JSONObject();
            long j = aqS1S1200300_8.j3;
            long j2 = aqS1S1200300_8.j4;
            long j3 = aqS1S1200300_8.j5;
            ShopVerticalAssem shopVerticalAssem = (ShopVerticalAssem) aqS1S1200300_8.l2;
            jSONObject.put("date2JsonTime", j - j2);
            jSONObject.put("jsonToModelTime", j3 - j);
            jSONObject.put("dataProcessEnd", currentTimeMillis - j3);
            jSONObject.put("enter_from", shopVerticalAssem.LJLJLJ);
            jSONObject.put(WM7.SCENE_SERVICE, "chunk_time");
            jSONObject.put("tab_name", KAK.SHOP.getTabName());
            C48658J7u.LIZIZ("rd_ec_search_request_trace", jSONObject);
        }
        C50865Jxl c50865Jxl = ((ShopVerticalAssem) aqS1S1200300_8.l2).LJLLLLLL;
        if (c50865Jxl != null) {
            String dataList = aqS1S1200300_8.s0;
            o.LJIIIIZZ(dataList, "dataList");
            c50865Jxl.LIZJ(dataList);
        }
        ((ShopVerticalAssem) aqS1S1200300_8.l2).getClass();
        return C76800UCe.LIZ;
    }

    public static final Object invoke$1(AqS1S1200300_8 aqS1S1200300_8) {
        C34K c34k = (C34K) aqS1S1200300_8.l1;
        if (!c34k.element) {
            c34k.element = true;
            long currentTimeMillis = System.currentTimeMillis();
            JSONObject jSONObject = new JSONObject();
            long j = aqS1S1200300_8.j3;
            long j2 = aqS1S1200300_8.j4;
            long j3 = aqS1S1200300_8.j5;
            DynamicSearchShopFragment dynamicSearchShopFragment = (DynamicSearchShopFragment) aqS1S1200300_8.l2;
            jSONObject.put("date2JsonTime", j - j2);
            jSONObject.put("jsonToModelTime", j3 - j);
            jSONObject.put("dataProcessEnd", currentTimeMillis - j3);
            jSONObject.put("enter_method", dynamicSearchShopFragment.LJZ);
            jSONObject.put("enter_from", dynamicSearchShopFragment.LLILLJJLI);
            jSONObject.put(WM7.SCENE_SERVICE, "chunk_time");
            jSONObject.put("tab_name", KAK.SHOP.getTabName());
            C48658J7u.LIZIZ("rd_ec_search_request_trace", jSONObject);
            ((DynamicSearchShopFragment) aqS1S1200300_8.l2).LLJIJIL.put("request_end", Long.valueOf(System.currentTimeMillis()));
        }
        KFY Ol = ((DynamicSearchShopFragment) aqS1S1200300_8.l2).Ol();
        String dataList = aqS1S1200300_8.s0;
        o.LJIIIIZZ(dataList, "dataList");
        Ol.LIZJ(dataList);
        ((DynamicSearchShopFragment) aqS1S1200300_8.l2).LJIJ();
        ((DynamicSearchShopFragment) aqS1S1200300_8.l2).Sl();
        return C76800UCe.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS1S1200300_8(C34K c34k, ShopVerticalAssem shopVerticalAssem, String str, long j, long j2, long j3, int i) {
        super(0);
        this.$t = i;
        this.l1 = c34k;
        this.l2 = shopVerticalAssem;
        this.s0 = str;
        this.j3 = j;
        this.j4 = j2;
        this.j5 = j3;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS1S1200300_8(C34K c34k, DynamicSearchShopFragment dynamicSearchShopFragment, String str, long j, long j2, long j3, int i) {
        super(0);
        this.$t = i;
        this.l1 = c34k;
        this.l2 = dynamicSearchShopFragment;
        this.s0 = str;
        this.j3 = j;
        this.j4 = j2;
        this.j5 = j3;
    }
}
