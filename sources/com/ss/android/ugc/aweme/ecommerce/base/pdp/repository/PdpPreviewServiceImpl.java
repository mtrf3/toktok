package com.ss.android.ugc.aweme.ecommerce.base.pdp.repository;

import X.C39468FeK;
import X.C47135Ieh;
import X.C48658J7u;
import X.C58096Mr6;
import X.C69995RdX;
import X.C70019Rdv;
import X.C70020Rdw;
import X.C70100RfE;
import X.C73338SqM;
import X.C73969T1h;
import X.EnumC63755P0l;
import X.InterfaceC64592gB;
import X.R30;
import X.T16;
import X.WM7;
import X.X1D;
import Y.AfS64S0100000_12;
import android.os.SystemClock;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.ProductPackStruct;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.starter.IPdpStarter;
import com.ss.android.ugc.aweme.ecommerce.service.IPdpPreviewService;
import com.ss.android.ugc.aweme.ecommercebase.pagesource.PageSource;
import com.ss.android.ugc.aweme.ecommercebase.pagesource.PageSourceInfo;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* loaded from: classes13.dex */
public final class PdpPreviewServiceImpl implements IPdpPreviewService {
    public C70100RfE LIZ;

    public static IPdpPreviewService LIZJ() {
        Object LIZ = C58096Mr6.LIZ(IPdpPreviewService.class, false);
        if (LIZ != null) {
            return (IPdpPreviewService) LIZ;
        }
        if (C58096Mr6.M == null) {
            synchronized (IPdpPreviewService.class) {
                if (C58096Mr6.M == null) {
                    C58096Mr6.M = new PdpPreviewServiceImpl();
                }
            }
        }
        return C58096Mr6.M;
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.service.IPdpPreviewService
    public final ProductPackStruct LIZIZ(String productId) {
        o.LJIIIZ(productId, "productId");
        C70100RfE c70100RfE = this.LIZ;
        if (c70100RfE != null) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("preview_pdp_");
            LIZ.append(productId);
            return c70100RfE.LIZIZ(X1D.LIZIZ(LIZ));
        }
        return null;
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.service.IPdpPreviewService
    public final void LIZ(String str, String str2, List products, List list) {
        String str3;
        o.LJIIIZ(products, "products");
        IPdpStarter.PdpEnterParam pdpEnterParam = new IPdpStarter.PdpEnterParam(null, null, null, null, false, null, 0.0f, null, false, false, false, null, null, null, null, null, null, null, 262143, null);
        ArrayList arrayList = new ArrayList();
        Iterator it = products.iterator();
        while (it.hasNext()) {
            String str4 = (String) it.next();
            if (LIZIZ(str4) == null) {
                arrayList.add(str4);
            }
        }
        if (arrayList.isEmpty()) {
            return;
        }
        String str5 = "tt_anchor_prefetch";
        JSONObject LJ = C47135Ieh.LJ(WM7.SCENE_SERVICE, "tt_anchor_prefetch", "step", "request");
        if (str2 == null) {
            str3 = "";
        } else {
            str3 = str2;
        }
        LJ.put("source_page_type", str3);
        C48658J7u.LIZIZ("rd_ec_pdp_prefetch", LJ);
        long elapsedRealtime = SystemClock.elapsedRealtime();
        HashMap<String, Object> requestParams = pdpEnterParam.getRequestParams();
        if (str != null) {
            str5 = str;
        }
        requestParams.put("template", str5);
        pdpEnterParam.getRequestParams().put("product_id", arrayList);
        if (list != null && (!list.isEmpty())) {
            pdpEnterParam.getRequestParams().put("traffic_source_list", list);
        }
        PageSourceInfo LJ2 = C39468FeK.LJ(new PageSource(EnumC63755P0l.PDP_PAGE.getPageCode(), null, 2, null));
        if (LJ2 != null) {
            pdpEnterParam.getRequestParams().put("page_source_info", LJ2);
        }
        C69995RdX.LJLILLLLZI.getClass();
        new C73338SqM(((R30) C69995RdX.LJLJJL.getValue()).LIZ(pdpEnterParam).LJJL(T16.LIZ()).LJJJJJ(1L).LJJIJL(new C70019Rdv(str2, elapsedRealtime)).LJIJJ(new C70020Rdw(str2)).LJIL(new InterfaceC64592gB() { // from class: X.9Ek
            @Override // X.InterfaceC64592gB
            public final /* bridge */ /* synthetic */ void accept(Object obj) {
            }
        }).LJJJJIZL()).LJJJ(C73969T1h.LIZIZ()).LJJJJZI(new AfS64S0100000_12(this, 131));
    }
}
