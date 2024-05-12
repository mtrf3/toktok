package com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.bullet;

import X.C31999Ch9;
import X.C49503Jbn;
import X.C50345JpN;
import X.C60193Njp;
import X.C60737Nsb;
import X.EnumC38014Evy;
import X.F2Y;
import X.F3T;
import X.InterfaceC37146Ehy;
import X.JY2;
import android.view.View;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.mt.protector.impl.JSONObjectProtectorUtils;
import com.ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod;
import java.util.Iterator;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* loaded from: classes9.dex */
public final class SearchCardClickMethod extends BaseBridgeMethod {
    public final String LJLIL;
    public EnumC38014Evy LJLILLLLZI;
    public final C50345JpN LJLJI;

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
    public SearchCardClickMethod(F3T contextProviderFactory) {
        super(contextProviderFactory);
        o.LJIIIZ(contextProviderFactory, "contextProviderFactory");
        this.LJLIL = "click_search_card";
        this.LJLILLLLZI = EnumC38014Evy.PRIVATE;
        this.LJLJI = new C50345JpN(contextProviderFactory, "click_search_card");
    }

    @Override // X.AbstractC37121EhZ
    public final void setAccess(EnumC38014Evy enumC38014Evy) {
        o.LJIIIZ(enumC38014Evy, "<set-?>");
        this.LJLILLLLZI = enumC38014Evy;
    }

    @Override // com.ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod
    public final void handle(JSONObject params, InterfaceC37146Ehy iReturn) {
        String str;
        C60193Njp c60193Njp;
        Iterator<String> keys;
        o.LJIIIZ(params, "params");
        o.LJIIIZ(iReturn, "iReturn");
        if (this.LJLJI.LIZ(params, iReturn)) {
            return;
        }
        Object obj = null;
        if (params.has("card_params")) {
            params.optString("react_id");
            try {
                JSONObject optJSONObject = params.optJSONObject("card_params");
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                if (optJSONObject != null && (keys = optJSONObject.keys()) != null) {
                    while (keys.hasNext()) {
                        String it = keys.next();
                        o.LJIIIIZZ(it, "it");
                        String string = JSONObjectProtectorUtils.getString(optJSONObject, it);
                        if (string == null) {
                            string = "";
                        }
                        linkedHashMap.put(it, string);
                    }
                }
                F2Y LIZ = this.contextProviderFactory.LIZ(C60193Njp.class);
                if (LIZ != null && (c60193Njp = (C60193Njp) LIZ.LIZIZ()) != null) {
                    obj = c60193Njp;
                } else {
                    C60737Nsb c60737Nsb = this.contextProviderFactory.LIZIZ;
                    if (c60737Nsb != null && (str = c60737Nsb.containerId) != null) {
                        C31999Ch9.LIZJ.getClass();
                        obj = C31999Ch9.LIZIZ(str);
                    }
                }
                o.LJII(obj, "null cannot be cast to non-null type android.view.View");
                View view = (View) obj;
                C49503Jbn.LIZ(view, (String) linkedHashMap.get("search_result_id"), JY2.LIZ(view).LJIIL, linkedHashMap);
            } catch (Exception e) {
                iReturn.LIZ(0, e.getMessage());
            }
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("code", 1);
        iReturn.LIZIZ(jSONObject);
    }
}
