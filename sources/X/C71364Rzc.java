package X;

import com.bytedance.mt.protector.impl.JSONArrayProtectorUtils;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.google.gson.s;
import com.ss.android.ugc.aweme.commerce.service.ICommerceService;
import com.ss.android.ugc.aweme.ecommerce.model.ShopWindowAnchorModel;
import com.ss.android.ugc.aweme.ecommerce.model.ShopWindowExtraModel;
import com.ss.android.ugc.aweme.feed.model.AnchorCommonStruct;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.internal.AqS178S0100000_12;
import kotlin.jvm.internal.o;
import org.greenrobot.eventbus.EventBus;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: X.Rzc, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C71364Rzc extends HSS {
    public String LJLJLJ;
    public C188727au LJLJLLL;
    public final List<ShopWindowAnchorModel> LJLL = new ArrayList();

    @Override // X.HSS
    public final boolean LJJIJ() {
        return true;
    }

    @Override // X.HSS
    public final String LJJIJIL() {
        return "webview";
    }

    @Override // X.S1E
    public final S1E clone() {
        return new C71364Rzc();
    }

    @Override // X.HSS, X.S1E
    public final int type() {
        return EnumC42934Gt8.ANCHOR_SHOP_LINK.getTYPE();
    }

    @Override // X.HSS, X.S1E
    public final void LJ(C188727au eventMapBuilder) {
        String str;
        o.LJIIIZ(eventMapBuilder, "eventMapBuilder");
        super.LJ(eventMapBuilder);
        ICommerceService LIZ = C71396S0i.LIZ();
        C71367Rzf c71367Rzf = new C71367Rzf();
        String LJJIIZI = LJJIIZI();
        if (LJJIIZI == null) {
            LJJIIZI = "";
        }
        c71367Rzf.LIZIZ = LJJIIZI;
        c71367Rzf.LIZLLL = LJJII().getAuthorUid();
        c71367Rzf.LIZJ = LJJII().getAid();
        c71367Rzf.LJIIIIZZ = this.LJLJLJ;
        c71367Rzf.LJIIJJI = "video";
        c71367Rzf.LJIIL = "video_cart_tag";
        c71367Rzf.LJJIII = S0V.LIZ(LJJII());
        if (LJIIIZ().LJJLJ()) {
            str = "video_single_anchor";
        } else {
            str = "video_multi_anchor";
        }
        c71367Rzf.LJJIFFI = str;
        c71367Rzf.LJJII = "video";
        LIZ.logCommerceEvents("product_anchor_show", c71367Rzf);
        if (LJJII().isAd()) {
            C58655N0h LIZLLL = C58704N2e.LIZLLL("draw_ad", "othershow", LJJII().getAwemeRawAd());
            LIZLLL.LIZJ("shop_anchor", "refer");
            LIZLLL.LJI();
        }
    }

    @Override // X.HSS, X.S1E
    public final EnumC26289ATl LJFF(List<AnchorCommonStruct> list) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = (ArrayList) list;
        Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            if (((AnchorCommonStruct) next).getType() == type()) {
                arrayList.add(next);
            }
        }
        if (arrayList.size() == 0) {
            return EnumC26289ATl.NOT_FOUND;
        }
        if (LJJII().isPhotoMode() && !C42921Gsv.LIZ()) {
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                arrayList2.remove(it2.next());
            }
            return EnumC26289ATl.NOT_FOUND;
        }
        AnchorCommonStruct anchorCommonStruct = (AnchorCommonStruct) ListProtector.get(arrayList, 0);
        arrayList2.remove(anchorCommonStruct);
        LJJIJL(anchorCommonStruct);
        LJJ(anchorCommonStruct);
        this.LJLJJL = anchorCommonStruct;
        if (arrayList.size() == 1) {
            return EnumC26289ATl.DONE;
        }
        return EnumC26289ATl.PROCEED;
    }

    /* JADX WARN: Removed duplicated region for block: B:49:0x0128  */
    /* JADX WARN: Removed duplicated region for block: B:58:? A[RETURN, SYNTHETIC] */
    @Override // X.HSS, X.S1E
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJI(X.C188727au r7) {
        /*
            Method dump skipped, instructions count: 387
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C71364Rzc.LJI(X.7au):void");
    }

    @Override // X.S1E
    public final void LJIIIIZZ(C188727au eventMapBuilder) {
        o.LJIIIZ(eventMapBuilder, "eventMapBuilder");
        this.LJLJLLL = eventMapBuilder;
        HSS.LJJIZ(this, eventMapBuilder, 6);
        LJJJJIZL(new AqS178S0100000_12(this, 234));
    }

    @Override // X.HSS
    public final void LJJIJL(AnchorCommonStruct anchor) {
        o.LJIIIZ(anchor, "anchor");
        LJJJJIZL(new AqS178S0100000_12(this, 233));
        if (!((ArrayList) this.LJLL).isEmpty()) {
            return;
        }
        String extra = anchor.getExtra();
        try {
            JSONArray jSONArray = new JSONArray(extra);
            int length = jSONArray.length();
            for (int i = 0; i < length; i++) {
                JSONObject jSONObject = JSONArrayProtectorUtils.getJSONObject(jSONArray, i);
                String extra2 = jSONObject.optString("extra");
                ShopWindowExtraModel shopWindowExtraModel = null;
                try {
                    Object LJII = C27739Aud.LJFF().LJII(extra2, C65330PkU.LIZJ(C65352Pkq.LIZLLL(ShopWindowExtraModel.class)));
                    if (!(LJII instanceof ShopWindowExtraModel)) {
                        LJII = null;
                    }
                    shopWindowExtraModel = (ShopWindowExtraModel) LJII;
                } catch (s unused) {
                }
                if (shopWindowExtraModel == null) {
                    shopWindowExtraModel = new ShopWindowExtraModel(null, null, null, null, 0, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -1, 1, null);
                }
                List<ShopWindowAnchorModel> list = this.LJLL;
                o.LJIIIIZZ(extra2, "extra");
                String optString = jSONObject.optString("keyword");
                o.LJIIIIZZ(optString, "obj.optString(\"keyword\")");
                String optString2 = jSONObject.optString("id");
                o.LJIIIIZZ(optString2, "obj.optString(\"id\")");
                Integer valueOf = Integer.valueOf(jSONObject.optInt("type"));
                Integer valueOf2 = Integer.valueOf(jSONObject.optInt("platform"));
                String optString3 = jSONObject.optString("log_extra");
                o.LJIIIIZZ(optString3, "obj.optString(\"log_extra\")");
                String optString4 = jSONObject.optString("schema");
                o.LJIIIIZZ(optString4, "obj.optString(\"schema\")");
                ((ArrayList) list).add(new ShopWindowAnchorModel(extra2, shopWindowExtraModel, optString, optString2, valueOf, valueOf2, optString3, optString4));
            }
        } catch (Exception e) {
            C188727au c188727au = new C188727au();
            c188727au.LJIIIZ("e_stack_trace", C36747EbX.LIZIZ(e));
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("anchor.extra : ");
            LIZ.append(extra);
            c188727au.LJIIIZ("extra_data", X1D.LIZIZ(LIZ));
            c188727au.LJIIIZ("where", "ShopLinkAnchorMaker");
            FMX.LJIIL("rd_tiktokec_shop_anchor_exception", c188727au.LIZ);
            C36922EeM.LIZ(e);
        }
    }

    @QD3
    public final void onEvent(C59592Na8 event) {
        String str;
        o.LJIIIZ(event, "event");
        ICommerceService LIZ = C71396S0i.LIZ();
        C71367Rzf c71367Rzf = new C71367Rzf();
        String LJJIIZI = LJJIIZI();
        if (LJJIIZI == null) {
            LJJIIZI = "";
        }
        c71367Rzf.LIZIZ = LJJIIZI;
        c71367Rzf.LIZLLL = LJJII().getAuthorUid();
        c71367Rzf.LIZJ = LJJII().getAid();
        c71367Rzf.LJIIIIZZ = this.LJLJLJ;
        c71367Rzf.LJIIIZ = String.valueOf(event.LJLIL);
        c71367Rzf.LJIIJJI = "video";
        c71367Rzf.LJIIL = "video_cart_tag";
        c71367Rzf.LJJIII = S0V.LIZ(LJJII());
        if (LJIIIZ().LJJLJ()) {
            str = "video_single_anchor";
        } else {
            str = "video_multi_anchor";
        }
        c71367Rzf.LJJIFFI = str;
        c71367Rzf.LJJII = "video";
        LIZ.logCommerceEvents("product_stay_time", c71367Rzf);
        C188727au c188727au = this.LJLJLLL;
        if (c188727au != null) {
            c188727au.LJIIIZ("author_id", LJJII().getAuthorUid());
            c188727au.LJIIIZ("duration", String.valueOf(event.LJLIL));
            c188727au.LJIIIZ("group_id", LJJII().getAid());
            Long LJIIJ = C227768wm.LJIIJ(LJJII());
            o.LJIIIIZZ(LJIIJ, "getMusicId(aweme())");
            c188727au.LJ(LJIIJ.longValue(), "music_id");
            c188727au.LJIIIZ("enter_from", LJJIIZI());
            FMX.LJIIL("anchor_stay_time", c188727au.LIZ);
        }
        EventBus.LIZJ().LJIJ(this);
    }

    @Override // X.HSW, X.S1E
    public final void LJIIL(C188727au c188727au, boolean z) {
        Integer num;
        String str;
        Long l;
        int i;
        int i2;
        java.util.Map LJJJLIIL;
        ShopWindowExtraModel shopWindowExtraModel;
        ShopWindowExtraModel shopWindowExtraModel2;
        ShopWindowExtraModel shopWindowExtraModel3;
        ShopWindowExtraModel shopWindowExtraModel4;
        Integer num2;
        ShopWindowExtraModel shopWindowExtraModel5;
        ShopWindowExtraModel shopWindowExtraModel6;
        String str2 = "video_single_anchor";
        String str3 = "yes";
        String str4 = "";
        String str5 = null;
        if (!z) {
            ICommerceService LIZ = C71396S0i.LIZ();
            C71367Rzf c71367Rzf = new C71367Rzf();
            c71367Rzf.LJIJJ = "TEMAI";
            String LJJIIZI = LJJIIZI();
            if (LJJIIZI != null) {
                str4 = LJJIIZI;
            }
            c71367Rzf.LIZIZ = str4;
            c71367Rzf.LJIIL = "video_cart_tag";
            ShopWindowAnchorModel shopWindowAnchorModel = (ShopWindowAnchorModel) ORZ.LJLLLL(this.LJLL);
            if (shopWindowAnchorModel != null && (shopWindowExtraModel6 = shopWindowAnchorModel.LIZ) != null) {
                num2 = shopWindowExtraModel6.platform;
            } else {
                num2 = null;
            }
            c71367Rzf.LJIILL = String.valueOf(num2);
            ShopWindowAnchorModel shopWindowAnchorModel2 = (ShopWindowAnchorModel) ORZ.LJLLLL(this.LJLL);
            if (shopWindowAnchorModel2 != null && (shopWindowExtraModel5 = shopWindowAnchorModel2.LIZ) != null) {
                str5 = shopWindowExtraModel5.source;
            }
            c71367Rzf.LJIILIIL = str5;
            if (!LJIIIZ().LJJLJ()) {
                str3 = "no";
            }
            c71367Rzf.LJIJI = str3;
            if (!LJIIIZ().LJJLJ()) {
                str2 = "video_multi_anchor";
            }
            c71367Rzf.LJJIFFI = str2;
            c71367Rzf.LJJII = "video";
            c71367Rzf.LJLZ = "maker-window-fail";
            LIZ.logCommerceEvents("rd_tiktok_video_anchor_show", c71367Rzf);
            return;
        }
        ICommerceService LIZ2 = C71396S0i.LIZ();
        C71367Rzf c71367Rzf2 = new C71367Rzf();
        c71367Rzf2.LJIJJ = "TEMAI";
        c71367Rzf2.LIZJ = LJJII().getAid();
        c71367Rzf2.LIZLLL = LJJII().getAuthorUid();
        c71367Rzf2.LJ = LJJII().getRequestId();
        String LJJIIZI2 = LJJIIZI();
        if (LJJIIZI2 != null) {
            str4 = LJJIIZI2;
        }
        c71367Rzf2.LIZIZ = str4;
        c71367Rzf2.LJIIL = "video_cart_tag";
        ShopWindowAnchorModel shopWindowAnchorModel3 = (ShopWindowAnchorModel) ORZ.LJLLLL(this.LJLL);
        if (shopWindowAnchorModel3 != null && (shopWindowExtraModel4 = shopWindowAnchorModel3.LIZ) != null) {
            num = shopWindowExtraModel4.platform;
        } else {
            num = null;
        }
        c71367Rzf2.LJIILL = String.valueOf(num);
        ShopWindowAnchorModel shopWindowAnchorModel4 = (ShopWindowAnchorModel) ORZ.LJLLLL(this.LJLL);
        if (shopWindowAnchorModel4 != null && (shopWindowExtraModel3 = shopWindowAnchorModel4.LIZ) != null) {
            str = shopWindowExtraModel3.source;
        } else {
            str = null;
        }
        c71367Rzf2.LJIILIIL = str;
        ShopWindowAnchorModel shopWindowAnchorModel5 = (ShopWindowAnchorModel) ORZ.LJLLLL(this.LJLL);
        if (shopWindowAnchorModel5 != null && (shopWindowExtraModel2 = shopWindowAnchorModel5.LIZ) != null) {
            l = shopWindowExtraModel2.productId;
        } else {
            l = null;
        }
        c71367Rzf2.LJIIZILJ = String.valueOf(l);
        if (C025908h.LJFF(false, LJJII().getAuthorUid())) {
            i = 1;
        } else {
            i = 0;
        }
        c71367Rzf2.LJIJ = i;
        if (!LJIIIZ().LJJLJ()) {
            str3 = "no";
        }
        c71367Rzf2.LJIJI = str3;
        if (LJJII().isAd()) {
            i2 = 1;
        } else {
            i2 = 0;
        }
        c71367Rzf2.LJIL = i2;
        if (LJJII().isAd()) {
            str5 = LJJII().getAwemeRawAdIdStr();
        }
        c71367Rzf2.LJJ = str5;
        c71367Rzf2.LJJIII = S0V.LIZ(LJJII());
        if (!LJIIIZ().LJJLJ()) {
            str2 = "video_multi_anchor";
        }
        c71367Rzf2.LJJIFFI = str2;
        c71367Rzf2.LJJII = "video";
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Aweme LJJII = LJJII();
        if (LJJII == null || (LJJJLIIL = LJJII.getMobParams()) == null) {
            LJJJLIIL = C113554cx.LJJJLIIL();
        }
        linkedHashMap.putAll(LJJJLIIL);
        c71367Rzf2.LIZ = linkedHashMap;
        c71367Rzf2.LJLZ = "maker-link";
        ShopWindowAnchorModel shopWindowAnchorModel6 = (ShopWindowAnchorModel) ORZ.LJLLLL(this.LJLL);
        if (shopWindowAnchorModel6 != null && (shopWindowExtraModel = shopWindowAnchorModel6.LIZ) != null) {
            Integer num3 = shopWindowExtraModel.productStatus;
            int value = EnumC71103RvP.PRODUCT_STATUS_DOWN.getValue();
            if (num3 != null && num3.intValue() == value) {
                c71367Rzf2.LJJJI = S0G.PRODUCT_NOT_AVAILABLE.getValue();
                LIZ2.logCommerceEvents("tiktok_video_anchor_view", c71367Rzf2);
            }
        }
        c71367Rzf2.LJJJI = S0G.PRODUCT_AVAILABLE.getValue();
        LIZ2.logCommerceEvents("tiktok_video_anchor_view", c71367Rzf2);
    }

    @Override // X.HSW, X.S1E
    public final void LJIIZILJ(C7F9 chain, String str, boolean z) {
        boolean z2;
        String sb;
        String str2;
        String str3;
        String str4;
        o.LJIIIZ(chain, "chain");
        List<ShopWindowAnchorModel> list = this.LJLL;
        ICommerceService LIZ = C71396S0i.LIZ();
        C71367Rzf c71367Rzf = new C71367Rzf();
        c71367Rzf.LJIJJ = "TEMAI";
        c71367Rzf.LJJII = "video";
        c71367Rzf.LIZIZ = LJJIIZI();
        c71367Rzf.LIZLLL = LJJII().getAuthorUid();
        c71367Rzf.LIZJ = LJJII().getAid();
        if (list == null || ((ArrayList) list).isEmpty()) {
            z2 = true;
        } else {
            z2 = false;
        }
        String str5 = null;
        if (z2) {
            sb = null;
        } else {
            StringBuilder sb2 = new StringBuilder();
            ArrayList arrayList = (ArrayList) list;
            int size = arrayList.size() - 1;
            for (int i = 0; i < size; i++) {
                sb2.append(((ShopWindowAnchorModel) ListProtector.get(arrayList, i)).type);
                sb2.append(",");
            }
            sb2.append(((ShopWindowAnchorModel) ORZ.LLFF(arrayList)).type);
            sb = sb2.toString();
        }
        c71367Rzf.LJJIJIL = sb;
        ArrayList arrayList2 = (ArrayList) list;
        c71367Rzf.LJJIJL = Integer.valueOf(arrayList2.size());
        c71367Rzf.LJ = LJJII().getRequestId();
        if (LJIIIZ().LJJLJ()) {
            str2 = "video_single_anchor";
        } else {
            str2 = "video_multi_anchor";
        }
        c71367Rzf.LJJIFFI = str2;
        if (LJIIIZ().LJJLJ()) {
            str3 = "yes";
        } else {
            str3 = "no";
        }
        c71367Rzf.LJIJI = str3;
        if (z) {
            str4 = "custom-link";
        } else {
            str4 = "maker-link";
        }
        c71367Rzf.LJLZ = str4;
        ArrayList arrayList3 = new ArrayList(C32I.LJJL(arrayList2, 10));
        Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            arrayList3.add(String.valueOf(((ShopWindowAnchorModel) it.next()).LIZ.productId));
        }
        if (!arrayList3.isEmpty()) {
            StringBuilder sb3 = new StringBuilder();
            int size2 = arrayList3.size() - 1;
            for (int i2 = 0; i2 < size2; i2 = C0EH.LIZIZ(sb3, (String) ListProtector.get(arrayList3, i2), ",", i2, 1)) {
            }
            sb3.append((String) ORZ.LLFF(arrayList3));
            str5 = sb3.toString();
        }
        c71367Rzf.LJJIL = str5;
        LIZ.logCommerceEvents("rd_tiktokec_video_anchor_data_get", c71367Rzf);
    }
}
