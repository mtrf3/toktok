package com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.bullet;

import X.C141335gf;
import X.C3C5;
import X.C49667JeR;
import X.C50345JpN;
import X.C50653JuL;
import X.C50654JuM;
import X.C76800UCe;
import X.EnumC50341JpJ;
import X.F29;
import X.F3T;
import X.HG3;
import X.InterfaceC37146Ehy;
import X.InterfaceC60761Nsz;
import X.InterfaceC65784Pro;
import X.K3L;
import X.RBX;
import X.X1D;
import X.Z9N;
import android.net.Uri;
import android.view.View;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.mt.protector.impl.JSONObjectProtectorUtils;
import com.bytedance.mt.protector.impl.UriProtector;
import com.ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod;
import com.ss.android.ugc.aweme.ecommerce.ab.ECommerceArchServiceImpl;
import com.ss.android.ugc.aweme.search.ecommerce.EcomSearchServiceImpl;
import com.ss.android.ugc.aweme.search.ecommerce.IEcomSearchService;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.AqS97S0300000_8;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* loaded from: classes9.dex */
public final class SearchOpenSchemaMethod extends BaseBridgeMethod {
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
    public SearchOpenSchemaMethod(F3T contextProviderFactory) {
        super(contextProviderFactory);
        o.LJIIIZ(contextProviderFactory, "contextProviderFactory");
        this.LJLIL = "searchOpenSchema";
        this.LJLILLLLZI = new C50345JpN(contextProviderFactory, "searchOpenSchema", EnumC50341JpJ.STABLE);
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

    public final void LJ(JSONObject jSONObject) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        JSONObject optJSONObject = jSONObject.optJSONObject("log_params");
        if (optJSONObject != null) {
            linkedHashMap.putAll(LIZJ(optJSONObject));
        }
        HashMap<String, String> hashMap = K3L.LJIIJJI;
        hashMap.clear();
        hashMap.putAll(linkedHashMap);
        C50653JuL.LJLILLLLZI.getClass();
        C50654JuM.LIZJ(linkedHashMap, false);
    }

    public final void LIZLLL(JSONObject jSONObject, InterfaceC65784Pro<C76800UCe> interfaceC65784Pro) {
        JSONObject optJSONObject;
        if (jSONObject != null && (optJSONObject = jSONObject.optJSONObject("bundle_params")) != null && optJSONObject.optBoolean("click_on_live_card") && !((RBX) HG3.LJIILL()).isLogin()) {
            Z9N.LIZIZ.LJJJJLI(interfaceC65784Pro, null);
        } else {
            interfaceC65784Pro.invoke();
        }
    }

    @Override // com.ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod
    public final void handle(JSONObject params, InterfaceC37146Ehy iReturn) {
        View view;
        o.LJIIIZ(params, "params");
        o.LJIIIZ(iReturn, "iReturn");
        if (this.LJLILLLLZI.LIZ(params, iReturn)) {
            return;
        }
        try {
            if (ECommerceArchServiceImpl.LIZIZ().LIZ()) {
                String optString = params.optString("schema");
                InterfaceC60761Nsz interfaceC60761Nsz = (InterfaceC60761Nsz) this.contextProviderFactory.LIZJ(InterfaceC60761Nsz.class);
                Map<String, String> map = null;
                if (interfaceC60761Nsz != null) {
                    view = interfaceC60761Nsz.LIZJ();
                } else {
                    view = null;
                }
                JSONObject optJSONObject = params.optJSONObject("page_data");
                if (optJSONObject != null) {
                    map = LIZJ(optJSONObject);
                }
                LJFF(optString, view, map);
            }
            if (C49667JeR.LIZ()) {
                if (F29.LIZ[getHybridType().ordinal()] == 1) {
                    LIZLLL(params, new AqS97S0300000_8(this, params, iReturn, 1));
                    return;
                }
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("Unsupported engine type: ");
                LIZ.append(getHybridType());
                iReturn.LIZ(0, X1D.LIZIZ(LIZ));
                return;
            }
            if (F29.LIZ[getHybridType().ordinal()] == 1) {
                LIZLLL(params, new AqS97S0300000_8(this, params, iReturn, 2));
            }
        } catch (Exception e) {
            iReturn.LIZ(0, e.getMessage());
        }
    }

    public final void LJFF(String str, View view, Map<String, String> map) {
        Object LIZ;
        Object LIZ2;
        if (str == null || str.length() == 0) {
            return;
        }
        Uri parse = UriProtector.parse(str);
        try {
            LIZ = UriProtector.getQueryParameter(parse, "btm_c_code");
            C3C5.m7constructorimpl(LIZ);
        } catch (Throwable th) {
            LIZ = C141335gf.LIZ(th);
            C3C5.m7constructorimpl(LIZ);
        }
        Object obj = null;
        if (C3C5.m12isFailureimpl(LIZ)) {
            LIZ = null;
        }
        String str2 = (String) LIZ;
        try {
            LIZ2 = UriProtector.getQueryParameter(parse, "btm_d_code");
            C3C5.m7constructorimpl(LIZ2);
        } catch (Throwable th2) {
            LIZ2 = C141335gf.LIZ(th2);
            C3C5.m7constructorimpl(LIZ2);
        }
        if (!C3C5.m12isFailureimpl(LIZ2)) {
            obj = LIZ2;
        }
        String str3 = (String) obj;
        if (view != null) {
            if (str2 != null || str3 != null || map != null) {
                IEcomSearchService LJJJJZI = EcomSearchServiceImpl.LJJJJZI();
                o.LJIIIIZZ(LJJJJZI, "get().getService(IEcomSearchService::class.java)");
                if (str2 == null) {
                    str2 = "c0";
                }
                if (str3 == null) {
                    str3 = "d0";
                }
                LJJJJZI.LJIIL(view, str2, str3, map, null);
            }
        }
    }
}
