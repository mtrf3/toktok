package X;

import android.os.Bundle;
import android.os.IInterface;
import com.google.android.gms.internal.measurement.zzcl;

/* renamed from: X.Qpn, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public interface InterfaceC68207Qpn extends IInterface {
    void beginAdUnitExposure(String str, long j);

    void clearConditionalUserProperty(String str, String str2, Bundle bundle);

    void clearMeasurementEnabled(long j);

    void endAdUnitExposure(String str, long j);

    void generateEventId(InterfaceC68139Qoh interfaceC68139Qoh);

    void getAppInstanceId(InterfaceC68139Qoh interfaceC68139Qoh);

    void getCachedAppInstanceId(InterfaceC68139Qoh interfaceC68139Qoh);

    void getConditionalUserProperties(String str, String str2, InterfaceC68139Qoh interfaceC68139Qoh);

    void getCurrentScreenClass(InterfaceC68139Qoh interfaceC68139Qoh);

    void getCurrentScreenName(InterfaceC68139Qoh interfaceC68139Qoh);

    void getGmpAppId(InterfaceC68139Qoh interfaceC68139Qoh);

    void getMaxUserProperties(String str, InterfaceC68139Qoh interfaceC68139Qoh);

    void getTestFlag(InterfaceC68139Qoh interfaceC68139Qoh, int i);

    void getUserProperties(String str, String str2, boolean z, InterfaceC68139Qoh interfaceC68139Qoh);

    void initForTests(java.util.Map map);

    void initialize(InterfaceC68163Qp5 interfaceC68163Qp5, zzcl zzclVar, long j);

    void isDataCollectionEnabled(InterfaceC68139Qoh interfaceC68139Qoh);

    void logEvent(String str, String str2, Bundle bundle, boolean z, boolean z2, long j);

    void logEventAndBundle(String str, String str2, Bundle bundle, InterfaceC68139Qoh interfaceC68139Qoh, long j);

    void logHealthData(int i, String str, InterfaceC68163Qp5 interfaceC68163Qp5, InterfaceC68163Qp5 interfaceC68163Qp52, InterfaceC68163Qp5 interfaceC68163Qp53);

    void onActivityCreated(InterfaceC68163Qp5 interfaceC68163Qp5, Bundle bundle, long j);

    void onActivityDestroyed(InterfaceC68163Qp5 interfaceC68163Qp5, long j);

    void onActivityPaused(InterfaceC68163Qp5 interfaceC68163Qp5, long j);

    void onActivityResumed(InterfaceC68163Qp5 interfaceC68163Qp5, long j);

    void onActivitySaveInstanceState(InterfaceC68163Qp5 interfaceC68163Qp5, InterfaceC68139Qoh interfaceC68139Qoh, long j);

    void onActivityStarted(InterfaceC68163Qp5 interfaceC68163Qp5, long j);

    void onActivityStopped(InterfaceC68163Qp5 interfaceC68163Qp5, long j);

    void performAction(Bundle bundle, InterfaceC68139Qoh interfaceC68139Qoh, long j);

    void registerOnMeasurementEventListener(InterfaceC68137Qof interfaceC68137Qof);

    void resetAnalyticsData(long j);

    void setConditionalUserProperty(Bundle bundle, long j);

    void setConsent(Bundle bundle, long j);

    void setConsentThirdParty(Bundle bundle, long j);

    void setCurrentScreen(InterfaceC68163Qp5 interfaceC68163Qp5, String str, String str2, long j);

    void setDataCollectionEnabled(boolean z);

    void setDefaultEventParameters(Bundle bundle);

    void setEventInterceptor(InterfaceC68137Qof interfaceC68137Qof);

    void setInstanceIdProvider(InterfaceC68145Qon interfaceC68145Qon);

    void setMeasurementEnabled(boolean z, long j);

    void setMinimumSessionDuration(long j);

    void setSessionTimeoutDuration(long j);

    void setUserId(String str, long j);

    void setUserProperty(String str, String str2, InterfaceC68163Qp5 interfaceC68163Qp5, boolean z, long j);

    void unregisterOnMeasurementEventListener(InterfaceC68137Qof interfaceC68137Qof);
}
