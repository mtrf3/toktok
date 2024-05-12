package com.google.android.gms.measurement;

import X.AbstractC68143Qol;
import X.C68033Qmz;
import X.C68086Qnq;
import X.C68729QyD;
import X.C78886Uxe;
import X.InterfaceC68730QyE;
import X.QH7;
import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.internal.measurement.zzcl;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes12.dex */
public class AppMeasurement {
    public static volatile AppMeasurement LIZIZ;
    public final AbstractC68143Qol LIZ;

    public long generateEventId() {
        return this.LIZ.LIZ();
    }

    public String getAppInstanceId() {
        return this.LIZ.LJI();
    }

    public String getCurrentScreenClass() {
        return this.LIZ.LJII();
    }

    public String getCurrentScreenName() {
        return this.LIZ.LJIIJJI();
    }

    public String getGmpAppId() {
        return this.LIZ.LJIIL();
    }

    /* loaded from: classes12.dex */
    public static class ConditionalUserProperty {
        public boolean mActive;
        public String mAppId;
        public long mCreationTimestamp;
        public String mExpiredEventName;
        public Bundle mExpiredEventParams;
        public String mName;
        public String mOrigin;
        public long mTimeToLive;
        public String mTimedOutEventName;
        public Bundle mTimedOutEventParams;
        public String mTriggerEventName;
        public long mTriggerTimeout;
        public String mTriggeredEventName;
        public Bundle mTriggeredEventParams;
        public long mTriggeredTimestamp;
        public Object mValue;

        public ConditionalUserProperty() {
        }

        public ConditionalUserProperty(Bundle bundle) {
            QH7.LJIIIIZZ(bundle);
            this.mAppId = (String) C78886Uxe.LJJLJLI(bundle, "app_id", String.class, null);
            this.mOrigin = (String) C78886Uxe.LJJLJLI(bundle, "origin", String.class, null);
            this.mName = (String) C78886Uxe.LJJLJLI(bundle, "name", String.class, null);
            this.mValue = C78886Uxe.LJJLJLI(bundle, "value", Object.class, null);
            this.mTriggerEventName = (String) C78886Uxe.LJJLJLI(bundle, "trigger_event_name", String.class, null);
            this.mTriggerTimeout = ((Long) C78886Uxe.LJJLJLI(bundle, "trigger_timeout", Long.class, 0L)).longValue();
            this.mTimedOutEventName = (String) C78886Uxe.LJJLJLI(bundle, "timed_out_event_name", String.class, null);
            this.mTimedOutEventParams = (Bundle) C78886Uxe.LJJLJLI(bundle, "timed_out_event_params", Bundle.class, null);
            this.mTriggeredEventName = (String) C78886Uxe.LJJLJLI(bundle, "triggered_event_name", String.class, null);
            this.mTriggeredEventParams = (Bundle) C78886Uxe.LJJLJLI(bundle, "triggered_event_params", Bundle.class, null);
            this.mTimeToLive = ((Long) C78886Uxe.LJJLJLI(bundle, "time_to_live", Long.class, 0L)).longValue();
            this.mExpiredEventName = (String) C78886Uxe.LJJLJLI(bundle, "expired_event_name", String.class, null);
            this.mExpiredEventParams = (Bundle) C78886Uxe.LJJLJLI(bundle, "expired_event_params", Bundle.class, null);
            this.mActive = ((Boolean) C78886Uxe.LJJLJLI(bundle, "active", Boolean.class, Boolean.FALSE)).booleanValue();
            this.mCreationTimestamp = ((Long) C78886Uxe.LJJLJLI(bundle, "creation_timestamp", Long.class, 0L)).longValue();
            this.mTriggeredTimestamp = ((Long) C78886Uxe.LJJLJLI(bundle, "triggered_timestamp", Long.class, 0L)).longValue();
        }
    }

    public AppMeasurement(C68033Qmz c68033Qmz) {
        this.LIZ = new C68086Qnq(c68033Qmz);
    }

    public static AppMeasurement getInstance(Context context) {
        if (LIZIZ == null) {
            synchronized (AppMeasurement.class) {
                if (LIZIZ == null) {
                    try {
                        InterfaceC68730QyE interfaceC68730QyE = (InterfaceC68730QyE) Class.forName("com.google.firebase.analytics.FirebaseAnalytics").getDeclaredMethod("getScionFrontendApiImplementation", Context.class, Bundle.class).invoke(null, context, null);
                        if (interfaceC68730QyE != null) {
                            LIZIZ = new AppMeasurement(interfaceC68730QyE);
                        }
                    } catch (ClassNotFoundException | Exception unused) {
                    }
                    LIZIZ = new AppMeasurement(C68033Qmz.LJIIZILJ(context, new zzcl(0L, 0L, true, null, null, null, null, null), null));
                }
            }
        }
        return LIZIZ;
    }

    public void beginAdUnitExposure(String str) {
        this.LIZ.LJIILL(str);
    }

    public void endAdUnitExposure(String str) {
        this.LIZ.LJIILLIIL(str);
    }

    public int getMaxUserProperties(String str) {
        return this.LIZ.LJIJ(str);
    }

    public void setConditionalUserProperty(ConditionalUserProperty conditionalUserProperty) {
        QH7.LJIIIIZZ(conditionalUserProperty);
        AbstractC68143Qol abstractC68143Qol = this.LIZ;
        Bundle bundle = new Bundle();
        String str = conditionalUserProperty.mAppId;
        if (str != null) {
            bundle.putString("app_id", str);
        }
        String str2 = conditionalUserProperty.mOrigin;
        if (str2 != null) {
            bundle.putString("origin", str2);
        }
        String str3 = conditionalUserProperty.mName;
        if (str3 != null) {
            bundle.putString("name", str3);
        }
        Object obj = conditionalUserProperty.mValue;
        if (obj != null) {
            C78886Uxe.LJJLL(bundle, obj);
        }
        String str4 = conditionalUserProperty.mTriggerEventName;
        if (str4 != null) {
            bundle.putString("trigger_event_name", str4);
        }
        bundle.putLong("trigger_timeout", conditionalUserProperty.mTriggerTimeout);
        String str5 = conditionalUserProperty.mTimedOutEventName;
        if (str5 != null) {
            bundle.putString("timed_out_event_name", str5);
        }
        Bundle bundle2 = conditionalUserProperty.mTimedOutEventParams;
        if (bundle2 != null) {
            bundle.putBundle("timed_out_event_params", bundle2);
        }
        String str6 = conditionalUserProperty.mTriggeredEventName;
        if (str6 != null) {
            bundle.putString("triggered_event_name", str6);
        }
        Bundle bundle3 = conditionalUserProperty.mTriggeredEventParams;
        if (bundle3 != null) {
            bundle.putBundle("triggered_event_params", bundle3);
        }
        bundle.putLong("time_to_live", conditionalUserProperty.mTimeToLive);
        String str7 = conditionalUserProperty.mExpiredEventName;
        if (str7 != null) {
            bundle.putString("expired_event_name", str7);
        }
        Bundle bundle4 = conditionalUserProperty.mExpiredEventParams;
        if (bundle4 != null) {
            bundle.putBundle("expired_event_params", bundle4);
        }
        bundle.putLong("creation_timestamp", conditionalUserProperty.mCreationTimestamp);
        bundle.putBoolean("active", conditionalUserProperty.mActive);
        bundle.putLong("triggered_timestamp", conditionalUserProperty.mTriggeredTimestamp);
        abstractC68143Qol.LJIJI(bundle);
    }

    public AppMeasurement(InterfaceC68730QyE interfaceC68730QyE) {
        this.LIZ = new C68729QyD(interfaceC68730QyE);
    }

    public List<ConditionalUserProperty> getConditionalUserProperties(String str, String str2) {
        int size;
        List LJIILJJIL = this.LIZ.LJIILJJIL(str, str2);
        if (LJIILJJIL == null) {
            size = 0;
        } else {
            size = LJIILJJIL.size();
        }
        ArrayList arrayList = new ArrayList(size);
        Iterator it = LJIILJJIL.iterator();
        while (it.hasNext()) {
            arrayList.add(new ConditionalUserProperty((Bundle) it.next()));
        }
        return arrayList;
    }

    public void clearConditionalUserProperty(String str, String str2, Bundle bundle) {
        this.LIZ.LJIJJ(str, str2, bundle);
    }

    public Map<String, Object> getUserProperties(String str, String str2, boolean z) {
        return this.LIZ.LJIIZILJ(str, str2, z);
    }

    public void logEventInternal(String str, String str2, Bundle bundle) {
        this.LIZ.LJIILIIL(str, str2, bundle);
    }
}
