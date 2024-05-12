package X;

import Y.AfS58S0100000_6;
import android.appwidget.AppWidgetManager;
import android.content.ComponentName;
import android.content.Context;
import com.bytedance.touchpoint.core.appwidget.ReferralWidget;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public final class MC7 {
    public static volatile boolean LIZ;

    public static void LIZ(Context context) {
        int[] iArr;
        AbstractC73672Svk<Boolean> LIZLLL;
        o.LJIIIZ(context, "context");
        if (LIZ) {
            return;
        }
        LIZ = true;
        try {
            AppWidgetManager appWidgetManager = AppWidgetManager.getInstance(context);
            if (appWidgetManager == null || (iArr = appWidgetManager.getAppWidgetIds(new ComponentName(context, (Class<?>) ReferralWidget.class))) == null) {
                iArr = new int[0];
            }
        } catch (Throwable unused) {
            iArr = new int[0];
        }
        if (iArr.length != 0) {
            LinkedHashMap LIZIZ = JF1.LIZIZ("widget_size", CardStruct.IStatusCode.DEFAULT, "widget_kind", "IncentiveWidget");
            InterfaceC247459nR interfaceC247459nR = C95J.LIZ;
            if (interfaceC247459nR != null) {
                interfaceC247459nR.LIZIZ("launch_widget_subinfo", LIZIZ);
            }
        }
        MCC mcc = (MCC) C95J.LIZ(1000);
        if (mcc != null && (LIZLLL = mcc.LIZLLL()) != null) {
            LIZLLL.LJJJJZI(new AfS58S0100000_6(context, 40));
        }
    }
}
