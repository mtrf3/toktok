package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import com.ss.android.ugc.aweme.im.service.appsettings.ActivityStatusConfig;
import com.ss.android.ugc.aweme.im.service.model.ActivityStatus;
import com.zhiliaoapp.musically.R;
import java.lang.ref.WeakReference;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.AqS22S0000100_1;
import kotlin.jvm.internal.o;

/* renamed from: X.3KP, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C3KP implements InterfaceC48038ItG {
    public static final C3KP LJLIL = new C3KP();
    public static WeakReference LJLILLLLZI;

    @Override // X.InterfaceC48038ItG
    public Object apply(Object obj) {
        String it = (String) obj;
        o.LJIIIZ(it, "it");
        Drawable LIZ = C15490jB.LIZ("tiktok_live_game_demand_1", it);
        if (LIZ != null) {
            LIZ.setBounds(0, 0, C7MY.LIZIZ(16), O6R.LJJIIZ(C32151Nz.LJIIZILJ(16)));
            return LIZ;
        }
        return null;
    }

    public static C82603Ma LIZ(ActivityStatus activityStatus, AqS22S0000100_1 aqS22S0000100_1, Context context, int i) {
        ActivityStatusConfig config;
        boolean z;
        long j;
        long j2;
        InterfaceC65784Pro timeNow = aqS22S0000100_1;
        if ((i & 1) != 0) {
            timeNow = C3AJ.LJLIL;
        }
        if ((i & 2) != 0) {
            C3AL.LIZ.getClass();
            config = C3AL.LIZ();
        } else {
            config = null;
        }
        o.LJIIIZ(activityStatus, "<this>");
        o.LJIIIZ(timeNow, "timeNow");
        o.LJIIIZ(config, "config");
        o.LJIIIZ(context, "context");
        long longValue = ((Number) timeNow.invoke()).longValue();
        if (C117504jK.LIZ && activityStatus.inactiveTime > activityStatus.activeTime) {
            z = true;
        } else {
            z = false;
        }
        TimeUnit timeUnit = TimeUnit.SECONDS;
        if (z) {
            j = activityStatus.inactiveTime;
        } else {
            j = activityStatus.activeTime;
        }
        long millis = timeUnit.toMillis(j);
        if (z) {
            j2 = config.inactive_threshold;
        } else {
            j2 = config.active_threshold;
        }
        if (millis <= longValue) {
            if (longValue <= j2 + millis) {
                return new C82603Ma(C29822Bn8.LIZ(context, R.string.b7v, "context.resources.getStr…ity_status_status_active)"), C4FY.ACTIVE_NOW);
            }
            if (longValue < config.status_copy_display_min_threshold + millis) {
                int i2 = (int) ((longValue - millis) / 60000);
                String quantityString = context.getResources().getQuantityString(R.plurals.an, i2, Integer.valueOf(i2));
                o.LJIIIIZZ(quantityString, "context.resources.getQua…s_mins, minutes, minutes)");
                return new C82603Ma(quantityString, C4FY.MIN_THRESHOLD);
            }
        }
        long j3 = config.status_copy_display_min_threshold + millis;
        if (longValue < config.status_copy_display_hour_threshold + millis && j3 <= longValue) {
            int i3 = (int) ((longValue - millis) / 3600000);
            String quantityString2 = context.getResources().getQuantityString(R.plurals.am, i3, Integer.valueOf(i3));
            o.LJIIIIZZ(quantityString2, "context.resources.getQua…atus_hours, hours, hours)");
            return new C82603Ma(quantityString2, C4FY.HOUR_THRESHOLD);
        }
        if (SU4.LJ(millis)) {
            return new C82603Ma(C29822Bn8.LIZ(context, R.string.b7x, "context.resources.getStr…_status_status_yesterday)"), C4FY.DATE_THRESHOLD);
        }
        if (SU4.LIZLLL(millis)) {
            return new C82603Ma(C29822Bn8.LIZ(context, R.string.b7w, "context.resources.getStr…vity_status_status_today)"), C4FY.DATE_THRESHOLD);
        }
        return new C82603Ma("", C4FY.NO_STATUS);
    }
}
