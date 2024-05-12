package X;

import android.content.Context;
import android.view.View;
import androidx.lifecycle.LifecycleOwner;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.im.sdk.activitystatus.analytics.ActivityStatusAccuracyImpl;
import com.ss.android.ugc.aweme.im.sdk.common.controller.providedservices.IMService;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.4ao, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C112224ao implements InterfaceC100183wU {
    public static final C112224ao LIZ = new C112224ao();
    public static final java.util.Map<EnumC112364b2, ActivityStatusAccuracyImpl> LIZIZ = new LinkedHashMap();

    @Override // X.InterfaceC100183wU
    public final void LIZJ(InterfaceC75532xp onEventV3) {
        o.LJIIIZ(onEventV3, "onEventV3");
        onEventV3.LIZIZ("trigger_activity_status_guidance_popup", new C1HQ());
    }

    public static void LJ(EnumC112364b2 position, List list) {
        ActivityStatusAccuracyImpl activityStatusAccuracyImpl;
        o.LJIIIZ(position, "position");
        if (C35564DxY.LIZ() && (activityStatusAccuracyImpl = (ActivityStatusAccuracyImpl) ((LinkedHashMap) LIZIZ).get(position)) != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                C112234ap c112234ap = (C112234ap) it.next();
                StringBuilder LIZ2 = X1D.LIZ();
                LIZ2.append(c112234ap.LIZ);
                LIZ2.append('_');
                LIZ2.append(c112234ap.LIZIZ);
                LIZ2.append('_');
                LIZ2.append(c112234ap.LIZJ);
                activityStatusAccuracyImpl.LIZIZ(X1D.LIZIZ(LIZ2));
                C100193wV.LIZIZ(LIZ, activityStatusAccuracyImpl.LIZ.getValue(), c112234ap.LIZIZ, c112234ap.LIZ, c112234ap.LIZJ, "type_show");
            }
        }
    }

    @Override // X.InterfaceC100183wU
    public final void LIZLLL(int i, boolean z, InterfaceC75532xp onEventV3) {
        String str;
        o.LJIIIZ(onEventV3, "onEventV3");
        C1HQ c1hq = new C1HQ();
        c1hq.put("app_status", String.valueOf(i));
        if (z) {
            str = "1";
        } else {
            str = CardStruct.IStatusCode.DEFAULT;
        }
        c1hq.put("has_ack_activity_status", str);
        onEventV3.LIZIZ("activity_status_guidance_request_event", c1hq);
    }

    @Override // X.InterfaceC100183wU
    public final C112254ar LIZIZ(EnumC112364b2 position, View view, LifecycleOwner lifecycleOwner, Context context, View view2) {
        o.LJIIIZ(position, "position");
        if (lifecycleOwner == null || !C35564DxY.LIZ()) {
            return null;
        }
        return new C112254ar(position, view, lifecycleOwner, context, view2);
    }

    @Override // X.InterfaceC100183wU
    public final void LIZ(String str, boolean z, String str2, Integer num, String str3, InterfaceC75532xp onEventV3) {
        String str4;
        o.LJIIIZ(onEventV3, "onEventV3");
        if (!C35564DxY.LIZ() || !C107454Jp.LIZ() || !IMService.createIIMServicebyMonsterPlugin(false).getActivityStatusViewModel().getSettings().LJFF() || str == null || str2 == null) {
            return;
        }
        C34B.LIZIZ("ActivityStatusAccuracyAnalytics", "position " + str + " toUid " + str2 + " type " + str3 + " isActive " + z);
        C1HQ c1hq = new C1HQ();
        c1hq.put("position", str);
        if (z) {
            str4 = "1";
        } else {
            str4 = CardStruct.IStatusCode.DEFAULT;
        }
        c1hq.put("is_active", str4);
        c1hq.put("to_user_id", str2);
        if (num != null) {
            c1hq.put("rank_index", String.valueOf(num.intValue()));
        }
        c1hq.put("activity_status_accuracy_type", str3);
        onEventV3.LIZIZ("activity_status_accuracy", c1hq);
    }
}
