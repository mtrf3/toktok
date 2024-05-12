package com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.bullet;

import X.C020506f;
import X.C118234kV;
import X.C141335gf;
import X.C221108m2;
import X.C32I;
import X.C3C5;
import X.C40517FvF;
import X.C47261Igj;
import X.C49667JeR;
import X.C49669JeT;
import X.C49671JeV;
import X.C49823Jgx;
import X.C50345JpN;
import X.C50653JuL;
import X.C50654JuM;
import X.C50699Jv5;
import X.C55457Lpd;
import X.C62822Ol8;
import X.C78842Uww;
import X.C78983UzD;
import X.EnumC38014Evy;
import X.F3T;
import X.InterfaceC37146Ehy;
import X.InterfaceC49672JeW;
import X.InterfaceC60761Nsz;
import X.ORZ;
import X.QD3;
import X.X1D;
import X.Z9N;
import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.mt.protector.impl.JSONObjectProtectorUtils;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.ss.android.ugc.aweme.awemeservice.AwemeService;
import com.ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod;
import com.ss.android.ugc.aweme.ecommerce.ab.ECommerceArchServiceImpl;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.search.ecommerce.EcomSearchServiceImpl;
import com.ss.android.ugc.aweme.search.ecommerce.IEcomSearchService;
import com.ss.android.ugc.aweme.utils.GsonHolder;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.AqS158S0100000_8;
import kotlin.jvm.internal.o;
import org.greenrobot.eventbus.EventBus;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes9.dex */
public final class OpenShortVideoMethod extends BaseBridgeMethod {
    public final Map<String, String> LJLIL;
    public final String LJLILLLLZI;
    public EnumC38014Evy LJLJI;
    public String LJLJJI;
    public final C62822Ol8 LJLJJL;
    public final C50345JpN LJLJJLL;

    @Override // com.ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    @Override // X.AbstractC37121EhZ, X.InterfaceC37788EsK
    public final void release() {
        EventBus.LIZJ().LJIJ(this);
    }

    @Override // X.AbstractC37121EhZ, X.InterfaceC38217EzF
    public final EnumC38014Evy getAccess() {
        return this.LJLJI;
    }

    @Override // X.InterfaceC38217EzF
    public final String getName() {
        return this.LJLILLLLZI;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OpenShortVideoMethod(F3T contextProviderFactory) {
        super(contextProviderFactory);
        o.LJIIIZ(contextProviderFactory, "contextProviderFactory");
        this.LJLIL = new LinkedHashMap();
        this.LJLILLLLZI = "open_short_video";
        this.LJLJI = EnumC38014Evy.PRIVATE;
        this.LJLJJI = "";
        this.LJLJJL = C221108m2.LIZIZ(new AqS158S0100000_8(contextProviderFactory, 175));
        EventBus.LIZJ().LJIILJJIL(this);
        this.LJLJJLL = new C50345JpN(contextProviderFactory, "open_short_video");
    }

    public final Map<String, String> LIZJ(JSONObject jSONObject) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator<String> keys = jSONObject.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            o.LJIIIIZZ(next, "next");
            String string = JSONObjectProtectorUtils.getString(jSONObject, next);
            o.LJIIIIZZ(string, "jsonObject.getString(next)");
            linkedHashMap.put(next, string);
        }
        return linkedHashMap;
    }

    @QD3
    public final void onEvent(C49671JeV event) {
        o.LJIIIZ(event, "event");
        if (TextUtils.equals(event.LJLIL, this.LJLJJI)) {
            JSONObject jSONObject = new JSONObject();
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("play_state", event.LJLILLLLZI);
            long j = event.LJLJI;
            if (j < 0) {
                j = 0;
            }
            jSONObject2.put("current_time", Float.valueOf(((float) j) / 1000.0f));
            jSONObject2.put("current_item_id", event.LJLJJI);
            jSONObject2.put("react_id", this.LJLJJI);
            jSONObject.put("data", jSONObject2);
            jSONObject.put("eventName", "video_state_change");
            sendEvent("notification", jSONObject);
        }
    }

    @Override // X.AbstractC37121EhZ
    public final void setAccess(EnumC38014Evy enumC38014Evy) {
        o.LJIIIZ(enumC38014Evy, "<set-?>");
        this.LJLJI = enumC38014Evy;
    }

    @Override // com.ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod
    public final void handle(JSONObject params, InterfaceC37146Ehy iReturn) {
        InterfaceC49672JeW interfaceC49672JeW;
        boolean z;
        Object LIZ;
        Bundle bundle;
        Boolean bool;
        Context context;
        View LIZJ;
        View view;
        Map<String, String> map;
        o.LJIIIZ(params, "params");
        o.LJIIIZ(iReturn, "iReturn");
        if (this.LJLJJLL.LIZ(params, iReturn)) {
            return;
        }
        if (ECommerceArchServiceImpl.LIZIZ().LIZ()) {
            InterfaceC60761Nsz interfaceC60761Nsz = (InterfaceC60761Nsz) this.contextProviderFactory.LIZJ(InterfaceC60761Nsz.class);
            if (interfaceC60761Nsz != null) {
                view = interfaceC60761Nsz.LIZJ();
            } else {
                view = null;
            }
            JSONObject optJSONObject = params.optJSONObject("page_data");
            if (optJSONObject != null) {
                map = LIZJ(optJSONObject);
            } else {
                map = null;
            }
            if (view != null && map != null) {
                IEcomSearchService LJJJJZI = EcomSearchServiceImpl.LJJJJZI();
                o.LJIIIIZZ(LJJJJZI, "get().getService(IEcomSearchService::class.java)");
                LJJJJZI.LJIIL(view, "c0", "d0", map, null);
            }
        }
        boolean LIZ2 = C49667JeR.LIZ();
        if ((params.has("current_item_id") && params.has("item_ids") && params.has("react_id")) || ((interfaceC49672JeW = (InterfaceC49672JeW) this.LJLJJL.getValue()) != null && interfaceC49672JeW.LIZJ(params))) {
            z = true;
        } else {
            z = false;
            if (LIZ2) {
                iReturn.LIZ(0, "Failure to navigate to schema with params");
                return;
            }
        }
        if (!z) {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("code", 1);
            iReturn.LIZIZ(jSONObject);
            return;
        }
        this.LJLJJI = params.optString("react_id");
        String optString = params.optString("current_item_id");
        JSONArray optJSONArray = params.optJSONArray("item_ids");
        JSONArray optJSONArray2 = params.optJSONArray("task_status_list");
        String optString2 = params.optString("last_client_page");
        JSONArray optJSONArray3 = params.optJSONArray("live_academy_video_source_params");
        String optString3 = params.optString("enter_from");
        String optString4 = params.optString("video_from");
        JSONObject optJSONObject2 = params.optJSONObject("aweme_struct");
        Bundle bundle2 = new Bundle();
        if (o.LJ(params.optString("from_card_type"), "user_video_card")) {
            new C50699Jv5(getContext()).LJI();
        }
        bundle2.putString("id", optString);
        bundle2.putString("react_session_id", this.LJLJJI);
        int length = optJSONArray.length();
        if (length > 0) {
            C40517FvF LJJ = C78842Uww.LJJ(0, length);
            ArrayList arrayList = new ArrayList(C32I.LJJL(LJJ, 10));
            C118234kV it = LJJ.iterator();
            while (it.LJLJI) {
                arrayList.add(optJSONArray.get(it.nextInt()));
            }
            bundle2.putString("ids", ORZ.LLD(arrayList, ",", null, null, null, 62));
        }
        if (optJSONArray2 != null && optJSONArray2.length() > 0) {
            C40517FvF LJJ2 = C78842Uww.LJJ(0, optJSONArray2.length());
            ArrayList arrayList2 = new ArrayList(C32I.LJJL(LJJ2, 10));
            C118234kV it2 = LJJ2.iterator();
            while (it2.LJLJI) {
                arrayList2.add(optJSONArray2.get(it2.nextInt()));
            }
            bundle2.putString("task_status_list", ORZ.LLD(arrayList2, ",", null, null, null, 62));
        }
        if (!optString2.equals("")) {
            bundle2.putString("last_client_page", optString2);
        }
        if (optJSONArray3 != null && optJSONArray3.length() > 0) {
            C40517FvF LJJ3 = C78842Uww.LJJ(0, optJSONArray3.length());
            ArrayList arrayList3 = new ArrayList(C32I.LJJL(LJJ3, 10));
            C118234kV it3 = LJJ3.iterator();
            while (it3.LJLJI) {
                arrayList3.add(optJSONArray3.get(it3.nextInt()));
            }
            bundle2.putString("live_academy_video_source_params", ORZ.LLD(arrayList3, ",", null, null, null, 62));
        }
        if (params.has("current_time")) {
            bundle2.putString("video_current_position", String.valueOf(params.optDouble("current_time") * 1000.0f));
        }
        bundle2.putString("enter_from", optString3);
        if (params.has("tracker_data")) {
            bundle2.putString("tracker_data", params.optString("tracker_data"));
            try {
                this.LJLIL.putAll(LIZJ(new JSONObject(params.optString("tracker_data"))));
            } catch (JSONException e) {
                if (LIZ2) {
                    StringBuilder LIZ3 = X1D.LIZ();
                    LIZ3.append("transform tracker_data field to map with exception: ");
                    LIZ3.append(e.getStackTrace());
                    C78983UzD.LJIJ(e, X1D.LIZIZ(LIZ3));
                }
            }
        }
        if (params.has("current_task_id")) {
            bundle2.putString("current_task_id", params.optString("current_task_id"));
        }
        if (params.has("course_theme_id")) {
            bundle2.putString("course_theme_id", params.optString("course_theme_id"));
        }
        if (params.has("show_video_survey")) {
            bundle2.putBoolean("show_video_survey", params.optBoolean("show_video_survey"));
        }
        if (params.has("completed_task_cnt")) {
            bundle2.putInt("completed_task_cnt", params.optInt("completed_task_cnt"));
        }
        if (params.has("total_task_cnt")) {
            bundle2.putInt("total_task_cnt", params.optInt("total_task_cnt"));
        }
        if (Z9N.LIZIZ.LJJIJLIJ(optString3)) {
            this.LJLIL.put("is_search_scene", "1");
        }
        if (ujb.o.LJJJJJL(optString4)) {
            optString4 = "general_search";
        }
        bundle2.putString("video_from", optString4);
        if (optJSONObject2 != null) {
            try {
                LIZ = (Aweme) GsonHolder.LIZLLL().LIZ().LJI(optJSONObject2.toString(), Aweme.class);
                C3C5.m7constructorimpl(LIZ);
            } catch (Throwable th) {
                LIZ = C141335gf.LIZ(th);
                C3C5.m7constructorimpl(LIZ);
            }
            if (C3C5.m10exceptionOrNullimpl(LIZ) != null) {
                LIZ = null;
            }
            Aweme aweme = (Aweme) LIZ;
            if (aweme != null && o.LJ(aweme.getAid(), optString)) {
                bundle2.putString("video_from", "from_search_ad_no_request");
                C49823Jgx c49823Jgx = new C49823Jgx();
                c49823Jgx.LJIJJ(C47261Igj.LJJIJ(aweme));
                C55457Lpd.LJLJJLL = c49823Jgx;
                AwemeService.LIZ().R1(aweme);
            }
        }
        bundle2.putString("from_group_id", params.optString("from_group_id"));
        bundle2.putString("carrier_type", params.optString("carrier_type"));
        bundle2.putString("refer_commodity_id", params.optString("refer_commodity_id"));
        bundle2.putString("data_type", params.optString("data_type"));
        bundle2.putString("previous_page", params.optString("previous_page"));
        bundle2.putString("enter_method", params.optString("enter_method"));
        bundle2.putString("enter_method", params.optString("enter_method"));
        bundle2.putString("auto_route_schema", params.optString("auto_route_schema"));
        JSONObject optJSONObject3 = params.optJSONObject("log");
        if (optJSONObject3 != null) {
            bundle2.putString("search_result_id", optJSONObject3.optString("search_result_id"));
            bundle2.putString("impr_id", optJSONObject3.optString("impr_id"));
            bundle2.putString("playlist_search_id", optJSONObject3.optString("search_id"));
            bundle2.putInt("is_from_video", optJSONObject3.optInt("is_from_video"));
            bundle2.putString("key_search_type", optJSONObject3.optString("search_type"));
            bundle2.putInt("item_size", length);
            if (optJSONObject3.has("token_type")) {
                HashMap hashMap = new HashMap();
                String optString5 = optJSONObject3.optString("token_type");
                o.LJIIIIZZ(optString5, "params.optString(tokenType)");
                hashMap.put("token_type", optString5);
                bundle2.putSerializable("feed_param_extra", hashMap);
            }
            try {
                this.LJLIL.putAll(LIZJ(optJSONObject3));
            } catch (JSONException e2) {
                if (LIZ2) {
                    C78983UzD.LJIJ(e2, "transform log field to map with exception: " + e2.getStackTrace());
                }
                e2.getStackTrace();
            }
        }
        JSONObject optJSONObject4 = params.optJSONObject("ec_live_extra");
        if (optJSONObject4 != null) {
            try {
                bundle2.putString("ec_live_extra", optJSONObject4.toString());
            } catch (JSONException e3) {
                e3.getStackTrace();
            }
        }
        InterfaceC60761Nsz interfaceC60761Nsz2 = (InterfaceC60761Nsz) this.contextProviderFactory.LIZJ(InterfaceC60761Nsz.class);
        if (interfaceC60761Nsz2 != null && (LIZJ = interfaceC60761Nsz2.LIZJ()) != null) {
            bundle = C020506f.LIZIZ(LIZJ, LIZJ.getWidth() / 2, LIZJ.getHeight() / 2).LIZLLL();
        } else {
            bundle = null;
        }
        InterfaceC49672JeW interfaceC49672JeW2 = (InterfaceC49672JeW) this.LJLJJL.getValue();
        if (interfaceC49672JeW2 != null) {
            bool = Boolean.valueOf(interfaceC49672JeW2.LIZ(params, bundle2, bundle));
        } else {
            bool = null;
        }
        if (LIZ2) {
            C50654JuM c50654JuM = C50653JuL.LJLILLLLZI;
            Map<String, String> map2 = this.LJLIL;
            c50654JuM.getClass();
            C50654JuM.LIZJ(map2, false);
            if (o.LJ(bool, Boolean.TRUE)) {
                iReturn.onSuccess(new JSONObject());
                return;
            }
            Context context2 = getContext();
            if (context2 == null) {
                iReturn.LIZ(0, "failure to navigate due to invalid context");
                return;
            }
            SmartRoute buildRoute = SmartRouter.buildRoute(context2, "aweme://aweme/detaillist/" + optString);
            buildRoute.withParam(bundle2);
            buildRoute.withCallback(new C49669JeT(iReturn));
            buildRoute.open();
            return;
        }
        if (!o.LJ(bool, Boolean.TRUE) && (context = getContext()) != null) {
            SmartRoute buildRoute2 = SmartRouter.buildRoute(context, "aweme://aweme/detaillist/" + optString);
            buildRoute2.withParam(bundle2);
            buildRoute2.open();
        }
        C50654JuM c50654JuM2 = C50653JuL.LJLILLLLZI;
        Map<String, String> map3 = this.LJLIL;
        c50654JuM2.getClass();
        C50654JuM.LIZJ(map3, false);
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("code", 1);
        iReturn.LIZIZ(jSONObject2);
    }
}
