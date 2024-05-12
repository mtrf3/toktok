package X;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import com.bytedance.ies.android.base.runtime.depend.IAppLogDepend;
import com.ss.android.common.applog.AppLog;
import java.util.concurrent.ExecutorService;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* renamed from: X.FMc, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C38838FMc implements IAppLogDepend {
    @Override // com.bytedance.ies.android.base.runtime.depend.IAppLogDepend
    public final String getCategory(boolean z) {
        return z ? "event_v3" : "event_v1";
    }

    @Override // com.bytedance.ies.android.base.runtime.depend.IAppLogDepend
    public final ExecutorService getLogThreadPool() {
        return FMX.LIZIZ();
    }

    @Override // com.bytedance.ies.android.base.runtime.depend.IAppLogDepend
    public final void appendCommonParams(StringBuilder strBuilder, boolean z) {
        o.LJIIIZ(strBuilder, "strBuilder");
        AppLog.appendCommonParams(strBuilder, z);
    }

    @Override // com.bytedance.ies.android.base.runtime.depend.IAppLogDepend
    public final void onEventV3Bundle(String eventName, Bundle bundle) {
        o.LJIIIZ(eventName, "eventName");
        FMX.LJIIJJI(eventName, bundle);
    }

    @Override // com.bytedance.ies.android.base.runtime.depend.IAppLogDepend
    public final void onEventV3Json(String eventName, JSONObject jSONObject) {
        o.LJIIIZ(eventName, "eventName");
        FMX.LJIILJJIL(eventName, jSONObject);
    }

    @Override // com.bytedance.ies.android.base.runtime.depend.IAppLogDepend
    public final void onEventV3Map(String eventName, java.util.Map<String, String> map) {
        o.LJIIIZ(eventName, "eventName");
        FMX.LJIIL(eventName, map);
    }

    @Override // com.bytedance.ies.android.base.runtime.depend.IAppLogDepend
    public final void putCommonParams(java.util.Map<String, String> params, boolean z) {
        o.LJIIIZ(params, "params");
        QJY.LJI(params, z);
    }

    @Override // com.bytedance.ies.android.base.runtime.depend.IAppLogDepend
    public final void onEventV1(Context context, String tag, String str, String str2, String str3, long j, JSONObject jSONObject) {
        o.LJIIIZ(context, "context");
        o.LJIIIZ(tag, "tag");
        if (TextUtils.isEmpty(str)) {
            FMX.LJI(j, tag, str2, str3, jSONObject);
        } else {
            FMX.LJFF(j, str, tag, str2, str3, jSONObject);
        }
    }
}
