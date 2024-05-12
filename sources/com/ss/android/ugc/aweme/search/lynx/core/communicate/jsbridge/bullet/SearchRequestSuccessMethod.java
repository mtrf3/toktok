package com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.bullet;

import X.C2U8;
import X.C49667JeR;
import X.C50143Jm7;
import X.C50236Jnc;
import X.C50345JpN;
import X.C50619Jtn;
import X.EnumC50341JpJ;
import X.F3T;
import X.InterfaceC37146Ehy;
import X.X1D;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.mt.protector.impl.JSONObjectProtectorUtils;
import com.google.gson.Gson;
import com.google.gson.e;
import com.ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod;
import com.ss.android.ugc.aweme.discover.helper.LastSearch;
import com.ss.android.ugc.aweme.discover.model.GlobalDoodleConfig;
import com.ss.android.ugc.aweme.feed.model.LogPbBean;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* loaded from: classes9.dex */
public final class SearchRequestSuccessMethod extends BaseBridgeMethod {
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
    public SearchRequestSuccessMethod(F3T contextProviderFactory) {
        super(contextProviderFactory);
        o.LJIIIZ(contextProviderFactory, "contextProviderFactory");
        this.LJLIL = "searchRequestSuccess";
        this.LJLILLLLZI = new C50345JpN(contextProviderFactory, "searchRequestSuccess", EnumC50341JpJ.STABLE);
    }

    @Override // com.ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod
    public final void handle(JSONObject params, InterfaceC37146Ehy iReturn) {
        GlobalDoodleConfig globalDoodleConfig;
        Long l;
        LogPbBean logPbBean;
        String str;
        String str2;
        o.LJIIIZ(params, "params");
        o.LJIIIZ(iReturn, "iReturn");
        if (this.LJLILLLLZI.LIZ(params, iReturn)) {
            return;
        }
        try {
            e eVar = new e();
            eVar.LJIIJ = true;
            eVar.LJIILIIL = true;
            Gson LIZ = eVar.LIZ();
            boolean LIZ2 = C49667JeR.LIZ();
            if (LIZ2) {
                try {
                    globalDoodleConfig = (GlobalDoodleConfig) LIZ.LJI(JSONObjectProtectorUtils.getString(params, "global_doodle_config"), GlobalDoodleConfig.class);
                } catch (Throwable th) {
                    StringBuilder LIZ3 = X1D.LIZ();
                    LIZ3.append("parsing global_doodle_config with exception: ");
                    LIZ3.append(th.getMessage());
                    iReturn.LIZ(-3, X1D.LIZIZ(LIZ3));
                    return;
                }
            } else {
                globalDoodleConfig = (GlobalDoodleConfig) LIZ.LJI(JSONObjectProtectorUtils.getString(params, "global_doodle_config"), GlobalDoodleConfig.class);
            }
            JSONObject optJSONObject = params.optJSONObject("extra");
            String str3 = null;
            if (optJSONObject != null) {
                l = Long.valueOf(optJSONObject.optLong("now"));
                optJSONObject.optString("logid");
                optJSONObject.optJSONArray("fatal_item_ids");
                optJSONObject.optString("search_request_id");
            } else {
                l = null;
            }
            if (LIZ2) {
                try {
                    logPbBean = (LogPbBean) LIZ.LJI(JSONObjectProtectorUtils.getString(params, "log_pb"), LogPbBean.class);
                } catch (Throwable th2) {
                    StringBuilder LIZ4 = X1D.LIZ();
                    LIZ4.append("parsing log_pb with exception ");
                    LIZ4.append(th2.getMessage());
                    iReturn.LIZ(-3, X1D.LIZIZ(LIZ4));
                    return;
                }
            } else {
                logPbBean = (LogPbBean) LIZ.LJI(JSONObjectProtectorUtils.getString(params, "log_pb"), LogPbBean.class);
            }
            C2U8.LIZ(new C50143Jm7(globalDoodleConfig, logPbBean));
            if (!params.optBoolean("is_load_more")) {
                C50619Jtn LIZ5 = C50236Jnc.LIZ();
                if (globalDoodleConfig != null) {
                    str = globalDoodleConfig.getRequestKeyword();
                } else {
                    str = null;
                }
                String imprId = logPbBean.getImprId();
                if (globalDoodleConfig != null) {
                    str2 = globalDoodleConfig.getSearchChannel();
                    str3 = globalDoodleConfig.getNewSource();
                } else {
                    str2 = null;
                }
                LIZ5.LIZJ(new LastSearch(str, imprId, str2, str3, l));
            }
            iReturn.onSuccess(new JSONObject());
        } catch (Exception e) {
            iReturn.LIZ(0, e.getMessage());
        }
    }
}
