package com.bytedance.pitaya.bdcomponentimpl.featureevent;

import X.C93326aP4;
import com.bytedance.pitaya.thirdcomponent.featureevent.FeatureEventCallback;
import com.bytedance.pitaya.thirdcomponent.featureevent.FeatureEventProducer;
import com.ss.android.common.applog.AppLog;
import com.ss.android.common.lib.AppLogNewUtils;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* loaded from: classes30.dex */
public final class AppLogEventProducer implements FeatureEventProducer {
    @Override // com.bytedance.pitaya.thirdcomponent.featureevent.FeatureEventProducer
    public String getSessionId() {
        return AppLog.getCurrentSessionId();
    }

    @Override // com.bytedance.pitaya.thirdcomponent.featureevent.FeatureEventProducer
    public void newEvent(String eventName, JSONObject jSONObject) {
        o.LJIIJ(eventName, "eventName");
        AppLogNewUtils.onEventV3(eventName, jSONObject);
    }

    public void registerCallback(long j, FeatureEventCallback callback) {
        o.LJIIJ(callback, "callback");
        AppLog.registerGlobalEventCallback(new C93326aP4(callback));
    }

    @Override // com.bytedance.pitaya.thirdcomponent.stddelegate.CallbackRegister
    public /* bridge */ /* synthetic */ void registerCallback(Long l, FeatureEventCallback featureEventCallback) {
        registerCallback(l.longValue(), featureEventCallback);
    }
}
