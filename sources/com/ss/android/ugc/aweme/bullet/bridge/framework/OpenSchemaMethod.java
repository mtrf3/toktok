package com.ss.android.ugc.aweme.bullet.bridge.framework;

import X.C141335gf;
import X.C3C5;
import X.C57422MgE;
import X.C61200O0e;
import X.C84763XOl;
import X.EnumC38014Evy;
import X.F28;
import X.F3T;
import X.InterfaceC37146Ehy;
import X.InterfaceC60761Nsz;
import X.VNU;
import X.Z9N;
import android.app.Activity;
import android.content.ComponentCallbacks2;
import android.content.Context;
import android.net.Uri;
import android.view.View;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.mt.protector.impl.JSONObjectProtectorUtils;
import com.bytedance.mt.protector.impl.UriProtector;
import com.ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod;
import com.ss.android.ugc.aweme.ecommerce.ab.ECommerceArchServiceImpl;
import com.ss.android.ugc.aweme.live.LiveOuterService;
import com.ss.android.ugc.aweme.search.ecommerce.EcomSearchServiceImpl;
import com.ss.android.ugc.aweme.search.ecommerce.IEcomSearchService;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* loaded from: classes7.dex */
public final class OpenSchemaMethod extends BaseBridgeMethod {
    public final String LJLIL;
    public EnumC38014Evy LJLILLLLZI;

    @Override // com.ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    @Override // X.AbstractC37121EhZ, X.InterfaceC38217EzF
    public final EnumC38014Evy getAccess() {
        return this.LJLILLLLZI;
    }

    @Override // X.InterfaceC38217EzF
    public final String getName() {
        return this.LJLIL;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OpenSchemaMethod(F3T contextProviderFactory) {
        super(contextProviderFactory);
        o.LJIIIZ(contextProviderFactory, "contextProviderFactory");
        this.LJLIL = "openSchema";
        this.LJLILLLLZI = EnumC38014Evy.PROTECT;
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

    public final void LIZLLL(String str) {
        String str2;
        Context context = getContext();
        if (context instanceof VNU) {
            context = ((VNU) context).LIZ();
        }
        if (context instanceof Activity) {
            Boolean liveHandled = LiveOuterService.LJJJLL().LJJIIJ().LIZIZ(context, str);
            o.LJIIIIZZ(liveHandled, "liveHandled");
            if (!liveHandled.booleanValue() && !C61200O0e.LIZLLL().LJI((Activity) context, str)) {
                if (str != null) {
                    str2 = ujb.o.LJJJJZ(str, "aweme", "sslocal", false);
                } else {
                    str2 = null;
                }
                C57422MgE.LIZIZ(context, str2, null, false);
                return;
            }
            return;
        }
        C61200O0e.LIZLLL().LJII(str);
    }

    @Override // X.AbstractC37121EhZ
    public final void setAccess(EnumC38014Evy enumC38014Evy) {
        o.LJIIIZ(enumC38014Evy, "<set-?>");
        this.LJLILLLLZI = enumC38014Evy;
    }

    @Override // com.ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod
    public final void handle(JSONObject params, InterfaceC37146Ehy iReturn) {
        String optString;
        int hashCode;
        LifecycleOwner lifecycleOwner;
        Object LIZ;
        Object LIZ2;
        View view;
        o.LJIIIZ(params, "params");
        o.LJIIIZ(iReturn, "iReturn");
        params.optString("reactId");
        String optString2 = params.optString("schema");
        JSONObject optJSONObject = params.optJSONObject("log_params");
        Map<String, String> map = null;
        if (ECommerceArchServiceImpl.LIZIZ().LIZ()) {
            Uri parse = UriProtector.parse(optString2);
            try {
                LIZ = UriProtector.getQueryParameter(parse, "btm_c_code");
                C3C5.m7constructorimpl(LIZ);
            } catch (Throwable th) {
                LIZ = C141335gf.LIZ(th);
                C3C5.m7constructorimpl(LIZ);
            }
            if (C3C5.m12isFailureimpl(LIZ)) {
                LIZ = null;
            }
            String str = (String) LIZ;
            try {
                LIZ2 = UriProtector.getQueryParameter(parse, "btm_d_code");
                C3C5.m7constructorimpl(LIZ2);
            } catch (Throwable th2) {
                LIZ2 = C141335gf.LIZ(th2);
                C3C5.m7constructorimpl(LIZ2);
            }
            if (C3C5.m12isFailureimpl(LIZ2)) {
                LIZ2 = null;
            }
            String str2 = (String) LIZ2;
            InterfaceC60761Nsz interfaceC60761Nsz = (InterfaceC60761Nsz) this.contextProviderFactory.LIZJ(InterfaceC60761Nsz.class);
            if (interfaceC60761Nsz != null) {
                view = interfaceC60761Nsz.LIZJ();
            } else {
                view = null;
            }
            JSONObject optJSONObject2 = params.optJSONObject("page_data");
            if (optJSONObject2 != null) {
                map = LIZJ(optJSONObject2);
            }
            if (view != null && (str != null || str2 != null || map != null)) {
                IEcomSearchService LJJJJZI = EcomSearchServiceImpl.LJJJJZI();
                o.LJIIIIZZ(LJJJJZI, "get().getService(IEcomSearchService::class.java)");
                if (str == null) {
                    str = "c0";
                }
                if (str2 == null) {
                    str2 = "d0";
                }
                LJJJJZI.LJIIL(view, str, str2, map, null);
            }
        }
        if (optJSONObject != null && (optString = optJSONObject.optString("from_card_type")) != null && ((hashCode = optString.hashCode()) == -157761233 ? optString.equals("music_card_shot") : hashCode == 745819626 ? optString.equals("trending_card") : !(hashCode != 1563961651 || !optString.equals("related_search_card")))) {
            ComponentCallbacks2 LJIIIIZZ = C84763XOl.LJIIIIZZ();
            if ((LJIIIIZZ instanceof LifecycleOwner) && (lifecycleOwner = (LifecycleOwner) LJIIIIZZ) != null) {
                Z9N.LIZIZ.LLILLIZIL(lifecycleOwner);
            }
        }
        int i = F28.LIZ[getHybridType().ordinal()];
        if (i != 1) {
            if (i != 2) {
                return;
            }
            LIZLLL(optString2);
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            JSONObject optJSONObject3 = params.optJSONObject("log");
            if (optJSONObject3 != null) {
                linkedHashMap.putAll(LIZJ(optJSONObject3));
                if (!linkedHashMap.isEmpty()) {
                    Z9N.LIZIZ.LIZ.LLLLLLZZ(linkedHashMap);
                }
            }
            iReturn.onSuccess(new JSONObject());
            return;
        }
        LIZLLL(optString2);
    }
}
