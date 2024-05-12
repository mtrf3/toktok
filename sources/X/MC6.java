package X;

import android.appwidget.AppWidgetManager;
import android.appwidget.AppWidgetProvider;
import android.content.Context;
import com.bytedance.keva.KevaImpl;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public class MC6 extends AppWidgetProvider {
    public String LIZ() {
        return "";
    }

    @Override // android.appwidget.AppWidgetProvider
    public final void onDisabled(Context context) {
        o.LJIIIZ(context, "context");
        super.onDisabled(context);
        MC9.LIZ("disabled", LIZ());
        try {
            KevaImpl.getRepoFromSp(context, "fe-storage", 0).storeString("referral_widget_added", CardStruct.IStatusCode.DEFAULT);
            C3C5.m7constructorimpl(C76800UCe.LIZ);
        } catch (Throwable th) {
            C3C5.m7constructorimpl(C141335gf.LIZ(th));
        }
    }

    @Override // android.appwidget.AppWidgetProvider
    public final void onEnabled(Context context) {
        o.LJIIIZ(context, "context");
        super.onEnabled(context);
        String widgetTypeName = LIZ();
        o.LJIIIZ(widgetTypeName, "widgetTypeName");
        MC9.LIZ("enable", widgetTypeName);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("widget_size", CardStruct.IStatusCode.DEFAULT);
        linkedHashMap.put("real_time", String.valueOf(System.currentTimeMillis()));
        linkedHashMap.put("widget_kind", "IncentiveWidget");
        InterfaceC247459nR interfaceC247459nR = C95J.LIZ;
        if (interfaceC247459nR != null) {
            interfaceC247459nR.LIZIZ("widget_added", linkedHashMap);
        }
        try {
            KevaImpl.getRepoFromSp(context, "fe-storage", 0).storeString("referral_widget_added", "1");
            C3C5.m7constructorimpl(C76800UCe.LIZ);
        } catch (Throwable th) {
            C3C5.m7constructorimpl(C141335gf.LIZ(th));
        }
    }

    @Override // android.appwidget.AppWidgetProvider
    public final void onDeleted(Context context, int[] appWidgetIds) {
        o.LJIIIZ(context, "context");
        o.LJIIIZ(appWidgetIds, "appWidgetIds");
        super.onDeleted(context, appWidgetIds);
        MC9.LIZ("delete", LIZ());
    }

    @Override // android.appwidget.AppWidgetProvider
    public final void onUpdate(Context context, AppWidgetManager appWidgetManager, int[] appWidgetIds) {
        o.LJIIIZ(context, "context");
        o.LJIIIZ(appWidgetManager, "appWidgetManager");
        o.LJIIIZ(appWidgetIds, "appWidgetIds");
        MC9.LIZ("update", LIZ());
        MCA.LIZIZ(context);
    }
}
