package com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.bullet;

import X.C2U8;
import X.C49162JRe;
import X.C50345JpN;
import X.C50699Jv5;
import X.F3T;
import X.InterfaceC37146Ehy;
import android.os.Bundle;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod;
import java.util.Iterator;
import kotlin.jvm.internal.o;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes9.dex */
public final class OpenHotSpotMethod extends BaseBridgeMethod {
    public final String LJLIL;
    public final C50345JpN LJLILLLLZI;

    @Override // com.ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    @Override // X.InterfaceC38217EzF
    public final String getName() {
        return this.LJLIL;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OpenHotSpotMethod(F3T contextProviderFactory) {
        super(contextProviderFactory);
        o.LJIIIZ(contextProviderFactory, "contextProviderFactory");
        this.LJLIL = "openHotspot";
        this.LJLILLLLZI = new C50345JpN(contextProviderFactory, "openHotspot");
    }

    @Override // com.ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod
    public final void handle(JSONObject params, InterfaceC37146Ehy iReturn) {
        String optString;
        o.LJIIIZ(params, "params");
        o.LJIIIZ(iReturn, "iReturn");
        if (this.LJLILLLLZI.LIZ(params, iReturn)) {
            return;
        }
        Bundle bundle = new Bundle();
        JSONObject optJSONObject = params.optJSONObject("log_extra");
        String cid = params.optString("cid");
        String fromCardType = params.optString("from_card_type");
        if (o.LJ(fromCardType, "hotspot_video_card")) {
            new C50699Jv5(getContext()).LJI();
        }
        if (optJSONObject != null) {
            Iterator<String> keys = optJSONObject.keys();
            o.LJIIIIZZ(keys, "logExtra.keys()");
            while (keys.hasNext()) {
                String next = keys.next();
                Object opt = optJSONObject.opt(next);
                if (opt != null) {
                    bundle.putString(next, opt.toString());
                }
            }
            String optString2 = params.optString("aweme_id");
            String optString3 = params.optString("trending_event_id");
            String optString4 = params.optString("trending_event_name");
            bundle.putString("id", optString2);
            bundle.putString("trending_event_id", optString3);
            bundle.putString("trending_event_name", optString4);
        }
        int optInt = params.optInt("is_activity_card");
        int optInt2 = params.optInt("is_official_card");
        int optInt3 = params.optInt("tab_index");
        String backtrace = params.optString("backtrace");
        String str = null;
        if (optJSONObject != null) {
            str = optJSONObject.optString("activity_keyword");
        }
        String str2 = "";
        if (str == null) {
            str = "";
        }
        if (optJSONObject != null && (optString = optJSONObject.optString("video_card_type")) != null) {
            str2 = optString;
        }
        if (optInt + optInt2 > 1 || ((optInt2 == 1 || optInt == 1) && o.LJ(fromCardType, "popular_places"))) {
            iReturn.LIZ(0, "Illegal card type");
            return;
        }
        Integer valueOf = Integer.valueOf(optInt);
        Integer valueOf2 = Integer.valueOf(optInt2);
        Integer valueOf3 = Integer.valueOf(optInt3);
        o.LJIIIIZZ(backtrace, "backtrace");
        o.LJIIIIZZ(cid, "cid");
        o.LJIIIIZZ(fromCardType, "fromCardType");
        C2U8.LIZ(new C49162JRe(bundle, valueOf, valueOf2, valueOf3, backtrace, str, str2, cid, fromCardType));
        iReturn.onSuccess(new JSONArray());
    }
}
