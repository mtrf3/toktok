package com.ss.android.ugc.aweme.fe.method.incentive;

import X.C38049EwX;
import X.C75792yF;
import X.C77879UhP;
import X.C77880UhQ;
import X.C84763XOl;
import X.InterfaceC36488ETs;
import android.app.Activity;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.touchpoint.core.model.CalendarParams;
import com.ss.android.ugc.aweme.fe.base.BaseCommonJavaMethod;
import org.json.JSONObject;

/* loaded from: classes14.dex */
public final class CreateCalendarEventMethod extends BaseCommonJavaMethod {
    public CreateCalendarEventMethod() {
        super(null);
    }

    @Override // com.ss.android.ugc.aweme.fe.base.BaseCommonJavaMethod, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    public CreateCalendarEventMethod(C38049EwX c38049EwX) {
        super(c38049EwX);
    }

    @Override // com.ss.android.ugc.aweme.fe.base.BaseCommonJavaMethod
    public final void handle(JSONObject jSONObject, InterfaceC36488ETs interfaceC36488ETs) {
        Activity LJIIIIZZ;
        if (jSONObject == null) {
            if (interfaceC36488ETs != null) {
                interfaceC36488ETs.LIZ(-1, "Parameter invalid");
            }
        } else {
            if (this.mContextRef.get() == null || (LJIIIIZZ = C84763XOl.LJIIIIZZ()) == null) {
                return;
            }
            CalendarParams calendarParams = (CalendarParams) C75792yF.LIZ(jSONObject.toString(), CalendarParams.class);
            if (C77879UhP.LIZ(new C77880UhQ(calendarParams.title, calendarParams.notes, calendarParams.startDate, calendarParams.endDate, calendarParams.repeatFrequency, calendarParams.repeatInterval, calendarParams.repeatCount, calendarParams.allDay), LJIIIIZZ, null, null)) {
                if (interfaceC36488ETs != null) {
                    interfaceC36488ETs.LIZJ(1, "Open system calendar app success", "");
                }
            } else {
                if (interfaceC36488ETs == null) {
                    return;
                }
                interfaceC36488ETs.LIZ(0, "System calendar app is not installed");
            }
        }
    }
}
