package com.ss.android.ugc.aweme.utils;

import X.ASQ;
import X.ASX;
import X.C61503OBv;
import X.C61928OSe;
import X.C76542zS;
import X.ED2;
import X.EnumC61504OBw;
import X.EnumC61929OSf;
import X.OLH;
import X.OLI;
import X.OLL;
import X.OLO;
import X.TAT;
import android.view.View;
import com.ss.android.ugc.aweme.ecommerce.base.pdpv2.PdpV2Fragment;
import com.ss.android.ugc.aweme.ecommerce.ug.vsa.repository.bean.VSAProductCardsResponse;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.o;

/* loaded from: classes11.dex */
public class Au2S19S0100000_10 extends TAT {
    public final int $t;
    public Object l0;

    @Override // X.TAT
    public final void LIZ(View view) {
        switch (this.$t) {
            case 0:
                LIZ$0(this, view);
                return;
            case 1:
                LIZ$1(this, view);
                return;
            case 2:
                LIZ$2(this, view);
                return;
            case 3:
                LIZ$3(this, view);
                return;
            default:
                super.LIZ(view);
                return;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Au2S19S0100000_10(Object obj, int i) {
        super(700L);
        this.$t = i;
        this.l0 = obj;
    }

    public static final void LIZ$0(Au2S19S0100000_10 au2S19S0100000_10, View view) {
        if (view != null) {
            PdpV2Fragment pdpV2Fragment = (PdpV2Fragment) au2S19S0100000_10.l0;
            pdpV2Fragment.LJLJJLL = true;
            C61928OSe c61928OSe = new C61928OSe(pdpV2Fragment.LJLL.LIZIZ());
            c61928OSe.LJIILIIL(EnumC61929OSf.RETURN);
            c61928OSe.LJIIL(pdpV2Fragment.getStayDuration());
            c61928OSe.LJIIJ();
            ASQ.LJ((PdpV2Fragment) au2S19S0100000_10.l0, ASX.LIZ);
        }
    }

    public static final void LIZ$1(Au2S19S0100000_10 au2S19S0100000_10, View view) {
        OLL oll;
        VSAProductCardsResponse.ProductDetail productDetail;
        if (view != null && (productDetail = (oll = (OLL) au2S19S0100000_10.l0).LJLJJL) != null) {
            oll.LIZJ(oll.LJLJJI, productDetail);
        }
    }

    public static final void LIZ$2(Au2S19S0100000_10 au2S19S0100000_10, View view) {
        OLL oll;
        VSAProductCardsResponse.ProductDetail productDetail;
        if (view != null && (productDetail = (oll = (OLL) au2S19S0100000_10.l0).LJLJJL) != null) {
            oll.LIZJ(oll.LJLJJI, productDetail);
        }
    }

    public static final void LIZ$3(Au2S19S0100000_10 au2S19S0100000_10, View view) {
        OLL oll;
        VSAProductCardsResponse.ProductDetail productDetail;
        if (view != null && (productDetail = (oll = (OLL) au2S19S0100000_10.l0).LJLJJL) != null) {
            int i = oll.LJLJJI;
            OLO olo = oll.LJLIL;
            if (olo != null) {
                olo.LJ(productDetail);
            }
            OLI cardType = oll.LJLJI;
            Map<String, String> trackParams = oll.LJLILLLLZI;
            o.LJIIIZ(cardType, "cardType");
            o.LJIIIZ(trackParams, "trackParams");
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            OLH.LIZ(linkedHashMap);
            linkedHashMap.put("button_name", "close");
            linkedHashMap.put("entrance_form", cardType.getValue());
            String LIZ = ED2.LIZ(productDetail.getProductId());
            LinkedHashMap linkedHashMap2 = (LinkedHashMap) trackParams;
            linkedHashMap.put("group_id", ED2.LIZ(linkedHashMap2.get("group_id")));
            linkedHashMap.put("ad_id", ED2.LIZ(linkedHashMap2.get("ad_id")));
            linkedHashMap.put("creative_id", ED2.LIZ(linkedHashMap2.get("creative_id")));
            String LIZ2 = ED2.LIZ(linkedHashMap2.get("log_id"));
            linkedHashMap.put("request_id", LIZ2);
            linkedHashMap.put("track_id", OLH.LIZIZ(i, LIZ2, LIZ));
            C76542zS.LIZ("tiktokec_button_click", linkedHashMap);
            C61503OBv.LIZ(EnumC61504OBw.CARD_CLOSE_CLICK);
        }
    }
}
