package X;

import android.appwidget.AppWidgetManager;
import android.content.ComponentName;
import android.content.Context;
import com.ss.android.ugc.aweme.search.core.ui.SearchMIUIWidgetProvider;
import com.ss.android.ugc.aweme.search.core.ui.SearchMiddleWidget;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public final class MAX {
    public static final /* synthetic */ int LIZ = 0;

    public static boolean LIZ(Context context) {
        int[] mediumWidgetIds;
        o.LJIIIZ(context, "context");
        boolean z = false;
        try {
            mediumWidgetIds = AppWidgetManager.getInstance(context).getAppWidgetIds(new ComponentName(context, (Class<?>) SearchMiddleWidget.class));
        } catch (Throwable unused) {
            mediumWidgetIds = new int[0];
        }
        o.LJIIIIZZ(mediumWidgetIds, "mediumWidgetIds");
        if (mediumWidgetIds.length == 0) {
            z = true;
        }
        return !z;
    }

    public static boolean LIZIZ(Context context) {
        int[] suggestWidgetIds;
        o.LJIIIZ(context, "context");
        boolean z = false;
        try {
            suggestWidgetIds = AppWidgetManager.getInstance(context).getAppWidgetIds(new ComponentName(context, (Class<?>) SearchMIUIWidgetProvider.class));
        } catch (Throwable unused) {
            suggestWidgetIds = new int[0];
        }
        o.LJIIIIZZ(suggestWidgetIds, "suggestWidgetIds");
        if (suggestWidgetIds.length == 0) {
            z = true;
        }
        return !z;
    }

    public static int[] LIZJ(Context context, AppWidgetManager appWidgetManager, String widgetType) {
        Class cls;
        o.LJIIIZ(context, "context");
        o.LJIIIZ(widgetType, "widgetType");
        try {
            if (o.LJ(widgetType, "function_entry_medium")) {
                cls = SearchMiddleWidget.class;
            } else if (o.LJ(widgetType, "recom_word_with_default")) {
                cls = SearchMIUIWidgetProvider.class;
            } else {
                cls = MAS.class;
            }
            int[] appWidgetIds = appWidgetManager.getAppWidgetIds(new ComponentName(context, (Class<?>) cls));
            o.LJIIIIZZ(appWidgetIds, "{\n            val classN…,\n            )\n        }");
            return appWidgetIds;
        } catch (Throwable unused) {
            return new int[0];
        }
    }
}
