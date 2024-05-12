package X;

import android.appwidget.AppWidgetManager;
import android.content.ComponentName;
import android.content.Context;
import android.os.Build;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;
import com.bytedance.touchpoint.core.appwidget.ReferralWidget;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public final class MCB extends AbstractC43292Gyu {
    @Override // X.AbstractC37594EpC
    public final void LJI(XBaseParamModel xBaseParamModel, C37356ElM c37356ElM, EnumC37844EtE type) {
        Context LJ;
        o.LJIIIZ(type, "type");
        AbstractC247499nV abstractC247499nV = (AbstractC247499nV) C95J.LIZ(0);
        if (abstractC247499nV != null && (LJ = abstractC247499nV.LJ()) != null && Build.VERSION.SDK_INT >= 26) {
            AppWidgetManager appWidgetManager = AppWidgetManager.getInstance(LJ);
            o.LJIIIIZZ(appWidgetManager, "AppWidgetManager.getInstance(context)");
            if (appWidgetManager.isRequestPinAppWidgetSupported()) {
                AppWidgetManager.getInstance(LJ).requestPinAppWidget(new ComponentName(LJ, (Class<?>) ReferralWidget.class), null, null);
            }
        }
    }
}
