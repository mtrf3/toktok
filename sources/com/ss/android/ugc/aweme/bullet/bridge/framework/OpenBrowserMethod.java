package com.ss.android.ugc.aweme.bullet.bridge.framework;

import X.C16880lQ;
import X.C2U8;
import X.C38282F0s;
import X.C39549Ffd;
import X.C39551Fff;
import X.C58704N2e;
import X.C59127NIl;
import X.C59128NIm;
import X.EnumC38014Evy;
import X.F3T;
import X.InterfaceC37146Ehy;
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
import com.ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* loaded from: classes7.dex */
public final class OpenBrowserMethod extends BaseBridgeMethod {
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
    public OpenBrowserMethod(F3T contextProviderFactory) {
        super(contextProviderFactory);
        o.LJIIIZ(contextProviderFactory, "contextProviderFactory");
        this.LJLIL = "openBrowser";
        this.LJLILLLLZI = EnumC38014Evy.PROTECT;
    }

    public final void LIZJ(JSONObject jSONObject) {
        String string = JSONObjectProtectorUtils.getString(jSONObject, "url");
        Context context = getContext();
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

    @Override // X.AbstractC37121EhZ
    public final void setAccess(EnumC38014Evy enumC38014Evy) {
        o.LJIIIZ(enumC38014Evy, "<set-?>");
        this.LJLILLLLZI = enumC38014Evy;
    }

    @Override // com.ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod
    public final void handle(JSONObject params, InterfaceC37146Ehy iReturn) {
        o.LJIIIZ(params, "params");
        o.LJIIIZ(iReturn, "iReturn");
        try {
            Context context = getContext();
            String url = JSONObjectProtectorUtils.getString(params, "url");
            if (!TextUtils.isEmpty(url)) {
                o.LJIIIIZZ(url, "url");
                String lowerCase = url.toLowerCase();
                o.LJIIIIZZ(lowerCase, "this as java.lang.String).toLowerCase()");
                if (ujb.o.LJJJLIIL(lowerCase, "http://", false) || ujb.o.LJJJLIIL(lowerCase, "https://", false)) {
                    LIZJ(params);
                } else if (context != null && NO5.LJI(context, url, false)) {
                    C59127NIl LIZ = C59128NIm.LIZ();
                    LIZ.LIZ = "draw_ad";
                    LIZ.LIZIZ = "open_url_app";
                    LIZ.LJIIIZ(context);
                    C58704N2e.LJ("draw_ad", "open_url_app", CardStruct.IStatusCode.DEFAULT, "", CardStruct.IStatusCode.DEFAULT).LJII();
                    NO5.LJIJI(new C39549Ffd(context));
                }
                C2U8.LIZ(new C39551Fff());
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("code", 1);
                iReturn.LIZIZ(jSONObject);
                return;
            }
            iReturn.LIZ(0, "");
        } catch (Exception unused) {
            iReturn.LIZ(0, "");
        }
    }
}
