package com.ss.android.ugc.aweme.bullet.bridge.common;

import X.C09650Zl;
import X.C45804HyK;
import X.C77879UhP;
import X.C77880UhQ;
import X.F3T;
import X.InterfaceC37146Ehy;
import android.app.Activity;
import android.content.Context;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod;
import com.ss.android.ugc.aweme.liveevent.CalendarEvent;
import com.ss.android.ugc.aweme.liveevent.EventParams;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* loaded from: classes14.dex */
public final class OpenCalendarMethod extends BaseBridgeMethod {
    public final String LJLIL;

    @Override // com.ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    @Override // X.InterfaceC38217EzF
    public final String getName() {
        return this.LJLIL;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OpenCalendarMethod(F3T contextProviderFactory) {
        super(contextProviderFactory);
        o.LJIIIZ(contextProviderFactory, "contextProviderFactory");
        this.LJLIL = "calendarOperation";
    }

    @Override // com.ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod
    public final void handle(JSONObject params, InterfaceC37146Ehy iReturn) {
        String str;
        String str2;
        long j;
        Activity activity;
        o.LJIIIZ(params, "params");
        o.LJIIIZ(iReturn, "iReturn");
        EventParams eventParams = (EventParams) GsonProtectorUtils.fromJson(C09650Zl.LIZIZ, params.toString(), EventParams.class);
        if (o.LJ(eventParams.operation, "add")) {
            CalendarEvent calendarEvent = eventParams.event;
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
            C77880UhQ c77880UhQ = new C77880UhQ(str, str2, j, j2, "", -1, -1, false);
            if (getContext() == null) {
                return;
            }
            Context context = getContext();
            if (context != null) {
                activity = C45804HyK.LJIJJ(context);
            } else {
                activity = null;
            }
            if (C77879UhP.LIZ(c77880UhQ, activity, null, null)) {
                iReturn.LIZJ(1, "Open system calendar app success", "");
                return;
            } else {
                iReturn.LIZ(0, "System calendar app is not installed");
                return;
            }
        }
        iReturn.LIZ(0, "Only add operations are supported");
    }
}
