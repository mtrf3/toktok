package com.ss.android.ugc.aweme.bullet.bridge.framework;

import X.C38281F0r;
import X.C38354F3m;
import X.C47766Ios;
import X.F3T;
import X.InterfaceC37146Ehy;
import X.V1B;
import X.X1D;
import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.mt.protector.impl.JSONObjectProtectorUtils;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.o;
import org.json.JSONObject;
import ujb.s;

/* loaded from: classes7.dex */
public final class RecordParamMethod extends OpenMethod {
    @Override // X.InterfaceC38217EzF
    public final String getName() {
        return "openRecord";
    }

    @Override // com.ss.android.ugc.aweme.bullet.bridge.framework.OpenMethod, com.ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RecordParamMethod(F3T contextProviderFactory) {
        super(contextProviderFactory);
        o.LJIIIZ(contextProviderFactory, "contextProviderFactory");
    }

    @Override // com.ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod
    public final void handle(JSONObject params, InterfaceC37146Ehy iReturn) {
        Activity LIZJ;
        o.LJIIIZ(params, "params");
        o.LJIIIZ(iReturn, "iReturn");
        String string = JSONObjectProtectorUtils.getString(params, "type");
        o.LJIIIIZZ(string, "params.getString(\"type\")");
        if (TextUtils.equals("goods_order_share", string)) {
            new WeakReference(getContext());
            return;
        }
        new JSONObject();
        params.put("type", "openRecord");
        if (params.has("args")) {
            JSONObject jSONObject = JSONObjectProtectorUtils.getJSONObject(params, "args");
            o.LJIIIIZZ(jSONObject, "params.getJSONObject(\"args\")");
            jSONObject.put("recordOrigin", "jsBridge");
            if (o.LJ("challenge", string)) {
                jSONObject.put("id", jSONObject.get("challenge_id"));
                jSONObject.put("recordParam", "challenge");
            } else if (o.LJ("music", string)) {
                jSONObject.put("id", jSONObject.get("music_id"));
                jSONObject.put("recordParam", "music");
            } else if (o.LJ("effect", string)) {
                if (jSONObject.has("effect_id")) {
                    jSONObject.put("id", jSONObject.get("effect_id"));
                }
                jSONObject.put("recordParam", "sticker");
                if (jSONObject.has("effect_meta_info")) {
                    jSONObject.put("effect_meta_info", JSONObjectProtectorUtils.getJSONObject(jSONObject, "effect_meta_info").toString());
                }
                if (jSONObject.has("effect_image")) {
                    jSONObject.put("effect_image", JSONObjectProtectorUtils.getJSONObject(jSONObject, "effect_image").toString());
                }
            } else if (o.LJ("donation", string)) {
                jSONObject.put("id", jSONObject.get("charity_id"));
                jSONObject.put("recordParam", "donation");
            } else if (o.LJ("star_atlas", string)) {
                jSONObject.put("id", jSONObject.get("star_atlas_id"));
                jSONObject.put("recordParam", "star_atlas");
                jSONObject.put("star_atlas_object", JSONObjectProtectorUtils.getJSONObject(params, "args").toString());
            } else if (o.LJ("tcm", string)) {
                jSONObject.put("recordParam", "tcm");
                jSONObject.put("star_atlas_object", JSONObjectProtectorUtils.getJSONObject(params, "args").toString());
            }
            jSONObject.put("group", "1");
        }
        try {
            Context context = getContext();
            if ((((context instanceof Activity) && (LIZJ = (Activity) context) != null) || (LIZJ = OpenMethod.LIZJ(context)) != null) && V1B.LJJZZI(LIZJ, true)) {
                String p = params.optString("type");
                if (!C38354F3m.LJ(p)) {
                    o.LJIIIIZZ(p, "p");
                    if (s.LJJLIIIJJIZ(p, ':', 0, false, 6) < 0) {
                        StringBuilder LIZ = X1D.LIZ();
                        LIZ.append(C47766Ios.LIZ().getSSLocalScheme());
                        LIZ.append("://");
                        LIZ.append(p);
                        C38281F0r c38281F0r = new C38281F0r(X1D.LIZIZ(LIZ));
                        OpenMethod.LIZLLL(params.optJSONObject("args"), c38281F0r);
                        C47766Ios.LIZ().startAdsAppActivity(LIZJ, c38281F0r.LJ());
                    }
                }
            }
        } catch (Exception unused) {
        }
    }
}
