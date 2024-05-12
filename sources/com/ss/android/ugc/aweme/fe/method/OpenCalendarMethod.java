package com.ss.android.ugc.aweme.fe.method;

import X.C09650Zl;
import X.C38049EwX;
import X.C45804HyK;
import X.C77879UhP;
import X.C77880UhQ;
import X.InterfaceC36488ETs;
import android.content.Context;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.ss.android.ugc.aweme.fe.base.BaseCommonJavaMethod;
import com.ss.android.ugc.aweme.liveevent.CalendarEvent;
import com.ss.android.ugc.aweme.liveevent.EventParams;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* loaded from: classes14.dex */
public final class OpenCalendarMethod extends BaseCommonJavaMethod {
    public OpenCalendarMethod() {
        super(null);
    }

    @Override // com.ss.android.ugc.aweme.fe.base.BaseCommonJavaMethod, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    public OpenCalendarMethod(C38049EwX c38049EwX) {
        super(c38049EwX);
    }

    @Override // com.ss.android.ugc.aweme.fe.base.BaseCommonJavaMethod
    public final void handle(JSONObject jSONObject, InterfaceC36488ETs interfaceC36488ETs) {
        String str;
        String str2;
        long j;
        EventParams eventParams = (EventParams) GsonProtectorUtils.fromJson(C09650Zl.LIZIZ, String.valueOf(jSONObject), EventParams.class);
        if (o.LJ(eventParams.operation, "add")) {
            CalendarEvent calendarEvent = eventParams.event;
            Context context = this.mContextRef.get();
            if (context == null) {
                return;
            }
            if (calendarEvent != null) {
                str = calendarEvent.title;
                str2 = calendarEvent.note;
            } else {
                str = null;
                str2 = null;
            }
            long j2 = 0;
            if (calendarEvent != null) {
                j = calendarEvent.startTime;
                j2 = calendarEvent.endTime;
            } else {
                j = 0;
            }
            if (C77879UhP.LIZ(new C77880UhQ(str, str2, j, j2, "", -1, -1, false), C45804HyK.LJIJJ(context), null, null)) {
                if (interfaceC36488ETs == null) {
                    return;
                }
                interfaceC36488ETs.LIZJ(1, "Open system calendar app success", "");
                return;
            } else {
                if (interfaceC36488ETs == null) {
                    return;
                }
                interfaceC36488ETs.LIZ(0, "System calendar app is not installed");
                return;
            }
        }
        if (interfaceC36488ETs == null) {
            return;
        }
        interfaceC36488ETs.LIZ(0, "Only add operations are supported");
    }
}
