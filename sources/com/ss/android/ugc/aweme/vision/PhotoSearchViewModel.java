package com.ss.android.ugc.aweme.vision;

import X.AbstractC73745Swv;
import X.C00F;
import X.C1A7;
import X.C221108m2;
import X.C48658J7u;
import X.C50321Joz;
import X.C50863Jxj;
import X.C62822Ol8;
import X.C73969T1h;
import X.C78857UxB;
import X.EnumC51280KAq;
import X.EnumC51288KAy;
import X.InterfaceC67352kd;
import X.InterfaceC81599W0t;
import X.KHC;
import X.KHD;
import X.KHG;
import X.KHH;
import X.KHP;
import X.KHV;
import X.T16;
import X.T2R;
import X.WM7;
import X.XKX;
import Y.AfS60S0100000_8;
import android.content.Context;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import com.bytedance.retrofit2.mime.TypedByteArray;
import com.google.gson.m;
import com.ss.android.ugc.aweme.vision.model.PhotoSearchBusinessEnterParams;
import com.ss.android.ugc.aweme.vision.model.PhotoSearchEnterParams;
import com.ss.android.ugc.aweme.vision.model.PhotoSearchToolsEnterParams;
import com.ss.android.ugc.aweme.vision.repo.PhotoSearchApi;
import com.ss.android.ugc.aweme.vision.repo.PhotoSearchResponse;
import com.ss.android.ugc.effectmanager.common.utils.JsonExtKt;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes9.dex */
public final class PhotoSearchViewModel extends ViewModel {
    public static final /* synthetic */ int LJZI = 0;
    public PhotoSearchEnterParams LJLILLLLZI;
    public PhotoSearchResponse LJLJJI;
    public C50863Jxj LJLJJLL;
    public JSONObject LJLJL;
    public String LJLJLJ;
    public List<String> LJLJLLL;
    public RDPhotoSearchTraceTime LJLL;
    public String LJLLILLLL;
    public boolean LJLLJ;
    public boolean LJLLL;
    public int LJLLLL;
    public String LJLLLLLL;
    public String LJLZ;
    public final MutableLiveData<KHV<PhotoSearchResponse>> LJLIL = new MutableLiveData<>();
    public final MutableLiveData<InterfaceC81599W0t> LJLJI = new MutableLiveData<>();
    public KHC LJLJJL = new KHC(null, null, null, 1048575);
    public final C50321Joz LJLLI = new C50321Joz(0, null, null, null, null, null, null, null, false, null, null, false, null, 8191, null);
    public final C62822Ol8 LJZ = C221108m2.LIZIZ(KHG.LJLIL);

    public final String hv0() {
        Integer num;
        PhotoSearchBusinessEnterParams businessParams;
        PhotoSearchEnterParams photoSearchEnterParams = this.LJLILLLLZI;
        if (photoSearchEnterParams != null && (businessParams = photoSearchEnterParams.getBusinessParams()) != null) {
            num = Integer.valueOf(businessParams.getRootEnterFromType());
        } else {
            num = null;
        }
        int value = EnumC51280KAq.MALL.getValue();
        if (num == null || num.intValue() != value) {
            int value2 = EnumC51280KAq.PDP_FIND_SIMILAR.getValue();
            if (num == null || num.intValue() != value2) {
                return EnumC51288KAy.SOURCE_MALL.getValue();
            }
            return EnumC51288KAy.SOURCE_PDP.getValue();
        }
        return EnumC51288KAy.SOURCE_MALL.getValue();
    }

    public final void jv0() {
        HashMap hashMap = new HashMap();
        JSONObject jSONObject = this.LJLJL;
        if (jSONObject != null) {
            hashMap.put("searchInitParams", jSONObject);
        }
        C50863Jxj c50863Jxj = this.LJLJJLL;
        if (c50863Jxj != null) {
            c50863Jxj.LJIIIIZZ.add(AbstractC73745Swv.LJFF(hashMap).LJI(C1A7.LJLJL).LJIILJJIL(T16.LIZIZ).LJII(C73969T1h.LIZIZ()).LJIIIZ(new AfS60S0100000_8(c50863Jxj, 22)));
        }
    }

    public final Object gv0(KHC khc, InterfaceC67352kd<? super m> interfaceC67352kd) {
        String str;
        String str2;
        String str3;
        PhotoSearchApi photoSearchApi = (PhotoSearchApi) this.LJZ.getValue();
        KHH khh = khc.LJIILL;
        TypedByteArray typedByteArray = null;
        if (khh != null) {
            typedByteArray = khh.LIZ;
            str = khh.LIZIZ;
            str2 = khh.LIZJ;
            str3 = khh.LIZLLL;
        } else {
            str = null;
            str2 = null;
            str3 = null;
        }
        return photoSearchApi.photoSearchRequest(typedByteArray, str, str2, str3, khc.LJIIJJI, khc.LJII, khc.LIZ, khc.LJIIIZ, khc.LJIIIIZZ, khc.LIZLLL, khc.LJFF, khc.LJI, khc.LIZJ, khc.LIZIZ, khc.LJ, null, null, null, null, khc.LJIIJ, null, null, null, null, khc.LJIIL, khc.LJIILIIL, khc.LJIJI, khc.LJIJ, khc.LJIILLIIL, khc.LJIIZILJ, interfaceC67352kd);
    }

    public final MutableLiveData iv0(Context context, KHC khc) {
        String str;
        String str2;
        String str3;
        List<Object> list;
        String str4;
        String str5;
        String str6;
        String str7;
        String str8;
        Integer num;
        String str9;
        String str10;
        String str11;
        String str12;
        PhotoSearchBusinessEnterParams businessParams;
        long j;
        PhotoSearchToolsEnterParams toolsParams;
        Long searchTime;
        PhotoSearchToolsEnterParams toolsParams2;
        Long searchTime2;
        PhotoSearchBusinessEnterParams businessParams2;
        PhotoSearchBusinessEnterParams businessParams3;
        PhotoSearchBusinessEnterParams businessParams4;
        PhotoSearchBusinessEnterParams businessParams5;
        PhotoSearchBusinessEnterParams businessParams6;
        PhotoSearchBusinessEnterParams businessParams7;
        PhotoSearchBusinessEnterParams businessParams8;
        PhotoSearchBusinessEnterParams businessParams9;
        PhotoSearchBusinessEnterParams businessParams10;
        PhotoSearchBusinessEnterParams businessParams11;
        PhotoSearchBusinessEnterParams businessParams12;
        PhotoSearchToolsEnterParams toolsParams3;
        PhotoSearchEnterParams photoSearchEnterParams = this.LJLILLLLZI;
        if (photoSearchEnterParams != null && (toolsParams3 = photoSearchEnterParams.getToolsParams()) != null) {
            toolsParams3.setSearchSource(khc.LIZIZ);
        }
        PhotoSearchEnterParams photoSearchEnterParams2 = this.LJLILLLLZI;
        if (photoSearchEnterParams2 != null && (businessParams12 = photoSearchEnterParams2.getBusinessParams()) != null) {
            businessParams12.setEnterMethod(khc.LIZIZ);
        }
        long j2 = 0;
        khc.LJII = 0L;
        khc.LJIIIIZZ = 12;
        PhotoSearchEnterParams photoSearchEnterParams3 = this.LJLILLLLZI;
        String str13 = "";
        if (photoSearchEnterParams3 == null || (businessParams11 = photoSearchEnterParams3.getBusinessParams()) == null || (str = businessParams11.getEnterFrom()) == null) {
            str = "";
        }
        khc.LJIIIZ = str;
        khc.LIZJ = hv0();
        PhotoSearchEnterParams photoSearchEnterParams4 = this.LJLILLLLZI;
        if (photoSearchEnterParams4 == null || (businessParams10 = photoSearchEnterParams4.getBusinessParams()) == null || (str2 = businessParams10.getSearchChannel()) == null) {
            str2 = "";
        }
        khc.LJIIJJI = str2;
        PhotoSearchEnterParams photoSearchEnterParams5 = this.LJLILLLLZI;
        if (photoSearchEnterParams5 == null || (businessParams9 = photoSearchEnterParams5.getBusinessParams()) == null || (str3 = businessParams9.getTrafficSourceList()) == null) {
            str3 = "";
        }
        JSONArray LJJII = T2R.LJJII(str3);
        if (LJJII != null) {
            list = JsonExtKt.toList(LJJII);
        } else {
            list = null;
        }
        int i = 0;
        if (list == null) {
            str4 = "";
        } else {
            Iterator<Object> it = list.iterator();
            str4 = "";
            while (it.hasNext()) {
                String obj = it.next().toString();
                if (str4.length() == 0) {
                    str4 = obj;
                } else {
                    str4 = C00F.LIZIZ(str4, ',', obj);
                }
            }
        }
        khc.LJIILIIL = str4;
        String str14 = this.LJLLILLLL;
        if (str14 != null) {
            str13 = str14;
        }
        khc.LIZ = str13;
        khc.LJ = 1;
        khc.LIZLLL = 0;
        PhotoSearchEnterParams photoSearchEnterParams6 = this.LJLILLLLZI;
        if (photoSearchEnterParams6 != null && (businessParams8 = photoSearchEnterParams6.getBusinessParams()) != null) {
            str5 = businessParams8.getLatestSearchId();
        } else {
            str5 = null;
        }
        khc.LJI = str5;
        PhotoSearchEnterParams photoSearchEnterParams7 = this.LJLILLLLZI;
        if (photoSearchEnterParams7 != null && (businessParams7 = photoSearchEnterParams7.getBusinessParams()) != null) {
            str6 = businessParams7.getSearchContext();
        } else {
            str6 = null;
        }
        khc.LJIIJ = str6;
        PhotoSearchEnterParams photoSearchEnterParams8 = this.LJLILLLLZI;
        if (photoSearchEnterParams8 != null && (businessParams6 = photoSearchEnterParams8.getBusinessParams()) != null) {
            str7 = businessParams6.getAttachProducts();
        } else {
            str7 = null;
        }
        khc.LJIIL = str7;
        PhotoSearchEnterParams photoSearchEnterParams9 = this.LJLILLLLZI;
        if (photoSearchEnterParams9 != null && (businessParams5 = photoSearchEnterParams9.getBusinessParams()) != null) {
            str8 = businessParams5.getSearchChannel();
        } else {
            str8 = null;
        }
        khc.LJIIJJI = str8;
        PhotoSearchEnterParams photoSearchEnterParams10 = this.LJLILLLLZI;
        if (photoSearchEnterParams10 != null && (businessParams4 = photoSearchEnterParams10.getBusinessParams()) != null) {
            num = businessParams4.getRecallShield();
        } else {
            num = null;
        }
        khc.LJIIZILJ = num;
        PhotoSearchEnterParams photoSearchEnterParams11 = this.LJLILLLLZI;
        if (photoSearchEnterParams11 != null && (businessParams3 = photoSearchEnterParams11.getBusinessParams()) != null) {
            str9 = businessParams3.getSearchSessionId();
        } else {
            str9 = null;
        }
        khc.LJIJ = str9;
        PhotoSearchEnterParams photoSearchEnterParams12 = this.LJLILLLLZI;
        if (photoSearchEnterParams12 != null && (businessParams2 = photoSearchEnterParams12.getBusinessParams()) != null) {
            str10 = businessParams2.getEcSearchSessionId();
        } else {
            str10 = null;
        }
        khc.LJIJI = str10;
        this.LJLJJL = khc;
        this.LJLIL.setValue(new KHV<>(null, KHP.START));
        this.LJLJJI = null;
        this.LJLIL.setValue(new KHV<>(null, KHP.LOADING));
        long currentTimeMillis = System.currentTimeMillis();
        RDPhotoSearchTraceTime rDPhotoSearchTraceTime = this.LJLL;
        if (rDPhotoSearchTraceTime != null) {
            rDPhotoSearchTraceTime.setNetRequest(Long.valueOf(currentTimeMillis));
        }
        if (this.LJLLLL > 0) {
            this.LJLLL = true;
        }
        if (!this.LJLLL) {
            long currentTimeMillis2 = System.currentTimeMillis();
            PhotoSearchEnterParams photoSearchEnterParams13 = this.LJLILLLLZI;
            if (photoSearchEnterParams13 != null && (toolsParams2 = photoSearchEnterParams13.getToolsParams()) != null && (searchTime2 = toolsParams2.getSearchTime()) != null) {
                j = searchTime2.longValue();
            } else {
                j = 0;
            }
            C78857UxB.LJJJJIZL("api_request", "search_result", Long.valueOf(currentTimeMillis2 - j), null, 248);
            long currentTimeMillis3 = System.currentTimeMillis();
            PhotoSearchEnterParams photoSearchEnterParams14 = this.LJLILLLLZI;
            if (photoSearchEnterParams14 != null && (toolsParams = photoSearchEnterParams14.getToolsParams()) != null && (searchTime = toolsParams.getSearchTime()) != null) {
                j2 = searchTime.longValue();
            }
            String.valueOf(currentTimeMillis3 - j2);
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("request_type", this.LJLLL ? 1 : 0);
        jSONObject.put("params", 0);
        jSONObject.put("api_path", "/aweme/v1/search/photo/ecom/");
        jSONObject.put("rd_page_type", "native");
        jSONObject.put("page_name", "photo_search_result");
        PhotoSearchEnterParams photoSearchEnterParams15 = this.LJLILLLLZI;
        if (photoSearchEnterParams15 != null && (businessParams = photoSearchEnterParams15.getBusinessParams()) != null) {
            str11 = businessParams.getEnterMethod();
        } else {
            str11 = null;
        }
        jSONObject.put("enter_method", str11);
        KHH khh = khc.LJIILL;
        if (khh != null && khh.LIZ != null) {
            i = 1;
        }
        jSONObject.put("has_request_image", i);
        KHH khh2 = khc.LJIILL;
        if (khh2 != null) {
            str12 = khh2.LIZLLL;
        } else {
            str12 = null;
        }
        jSONObject.put("request_detection_index", str12);
        jSONObject.put(WM7.SCENE_SERVICE, "request");
        C48658J7u.LIZIZ("rd_ec_photo_search_request", jSONObject);
        this.LJLLLL++;
        XKX.LIZLLL(ViewModelKt.getViewModelScope(this), null, null, new KHD(this, khc, context, null), 3);
        return this.LJLIL;
    }
}
