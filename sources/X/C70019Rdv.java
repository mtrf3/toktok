package X;

import android.os.SystemClock;
import com.ss.android.ugc.aweme.ecommerce.api.model.Response;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.ProductInfoPackData;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.ProductPackStruct;
import java.util.List;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* renamed from: X.Rdv, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C70019Rdv<T, R> implements InterfaceC48038ItG {
    public final /* synthetic */ String LJLIL;
    public final /* synthetic */ long LJLILLLLZI;

    public C70019Rdv(String str, long j) {
        this.LJLIL = str;
        this.LJLILLLLZI = j;
    }

    @Override // X.InterfaceC48038ItG
    public final Object apply(Object obj) {
        List<ProductPackStruct> list;
        Response it = (Response) obj;
        o.LJIIIZ(it, "it");
        ProductInfoPackData productInfoPackData = (ProductInfoPackData) it.data;
        if (productInfoPackData != null) {
            list = productInfoPackData.productionInfoPack;
        } else {
            list = null;
        }
        C69995RdX.LJLILLLLZI.getClass();
        C69995RdX.LLLZL(productInfoPackData);
        String str = "";
        if (!it.isCodeOK() || list == null || list.isEmpty()) {
            JSONObject jSONObject = new JSONObject();
            String str2 = this.LJLIL;
            jSONObject.put(WM7.SCENE_SERVICE, "tt_anchor_prefetch");
            jSONObject.put("step", "response");
            if (str2 != null) {
                str = str2;
            }
            jSONObject.put("source_page_type", str);
            jSONObject.put("is_success", 0);
            C48658J7u.LIZIZ("rd_ec_pdp_prefetch", jSONObject);
        } else {
            JSONObject jSONObject2 = new JSONObject();
            String str3 = this.LJLIL;
            long j = this.LJLILLLLZI;
            jSONObject2.put(WM7.SCENE_SERVICE, "tt_anchor_prefetch");
            if (str3 != null) {
                str = str3;
            }
            jSONObject2.put("source_page_type", str);
            jSONObject2.put("is_success", 1);
            jSONObject2.put("step", "response");
            jSONObject2.put("duration", SystemClock.elapsedRealtime() - j);
            C48658J7u.LIZIZ("rd_ec_pdp_prefetch", jSONObject2);
        }
        return it;
    }
}
