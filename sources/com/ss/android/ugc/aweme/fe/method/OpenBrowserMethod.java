package com.ss.android.ugc.aweme.fe.method;

import X.C16880lQ;
import X.C2U8;
import X.C38049EwX;
import X.C38282F0s;
import X.C39550Ffe;
import X.C39551Fff;
import X.C58704N2e;
import X.C59127NIl;
import X.C59128NIm;
import X.InterfaceC36488ETs;
import X.NO5;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.ResolveInfo;
import android.text.TextUtils;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.mt.protector.impl.JSONObjectProtectorUtils;
import com.bytedance.mt.protector.impl.UriProtector;
import com.ss.android.ugc.aweme.fe.base.BaseCommonJavaMethod;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* loaded from: classes7.dex */
public final class OpenBrowserMethod extends BaseCommonJavaMethod {
    public OpenBrowserMethod() {
        super(null);
    }

    @Override // com.ss.android.ugc.aweme.fe.base.BaseCommonJavaMethod, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    public OpenBrowserMethod(C38049EwX c38049EwX) {
        super(c38049EwX);
    }

    public final void LIZIZ(JSONObject jSONObject) {
        Context context = this.mContextRef.get();
        String string = JSONObjectProtectorUtils.getString(jSONObject, "url");
        if (context != null && jSONObject.optBoolean("use_external_browser", false)) {
            Intent intent = new Intent("android.intent.action.VIEW", UriProtector.parse(string));
            intent.addFlags(268435456);
            intent.addCategory("android.intent.category.BROWSABLE");
            ResolveInfo resolveActivity = context.getPackageManager().resolveActivity(intent, 65536);
            if (resolveActivity != null) {
                ActivityInfo activityInfo = resolveActivity.activityInfo;
                intent.setClassName(activityInfo.packageName, activityInfo.name);
                C16880lQ.LIZJ(context, intent);
                return;
            }
        }
        jSONObject.put("type", "webview");
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("url", string);
        jSONObject.put("args", jSONObject2);
        C38282F0s.LIZIZ(context, jSONObject);
    }

    @Override // com.ss.android.ugc.aweme.fe.base.BaseCommonJavaMethod
    public final void handle(JSONObject params, InterfaceC36488ETs iReturn) {
        o.LJIIIZ(params, "params");
        o.LJIIIZ(iReturn, "iReturn");
        Context context = this.mContextRef.get();
        try {
            String url = JSONObjectProtectorUtils.getString(params, "url");
            if (!TextUtils.isEmpty(url)) {
                o.LJIIIIZZ(url, "url");
                String lowerCase = url.toLowerCase();
                o.LJIIIIZZ(lowerCase, "this as java.lang.String).toLowerCase()");
                if (ujb.o.LJJJLIIL(lowerCase, "http://", false) || ujb.o.LJJJLIIL(lowerCase, "https://", false)) {
                    LIZIZ(params);
                } else if (context != null && NO5.LJI(context, url, false)) {
                    C59127NIl LIZ = C59128NIm.LIZ();
                    LIZ.LIZ = "draw_ad";
                    LIZ.LIZIZ = "open_url_app";
                    LIZ.LJIIIZ(context);
                    C58704N2e.LJ("draw_ad", "open_url_app", CardStruct.IStatusCode.DEFAULT, "", CardStruct.IStatusCode.DEFAULT).LJII();
                    NO5.LJIJI(new C39550Ffe(context));
                }
                C2U8.LIZ(new C39551Fff());
                iReturn.onSuccess("");
                return;
            }
            iReturn.LIZ(0, "");
        } catch (Exception unused) {
            iReturn.LIZ(0, "");
        }
    }
}
