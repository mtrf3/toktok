package com.ss.android.ugc.aweme.search.core.ui;

import X.AV1;
import X.C113554cx;
import X.C67942la;
import X.EnumC72807Shn;
import X.MA8;
import X.MAC;
import X.MAO;
import X.MAP;
import X.MAR;
import X.MAS;
import X.W5F;
import X.W5U;
import android.appwidget.AppWidgetManager;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.widget.RemoteViews;
import com.ss.android.ugc.aweme.search.core.model.SearchWidgetModel;
import com.zhiliaoapp.musically.R;
import java.util.Map;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* loaded from: classes10.dex */
public final class SearchMiddleWidget extends MAS {
    @Override // X.MAS
    public final String LJ() {
        return "function_entry_medium";
    }

    @Override // X.MAS, android.appwidget.AppWidgetProvider
    public final void onDisabled(Context context) {
        o.LJIIIZ(context, "context");
        super.onDisabled(context);
        MA8.LIZIZ();
    }

    @Override // X.MAS
    public final void LJFF(Context context, AppWidgetManager appWidgetManager, int[] iArr, Intent intent) {
        o.LJIIIZ(context, "context");
        o.LJIIIZ(intent, "intent");
        C67942la<SearchWidgetModel> c67942la = MAR.LIZJ;
        if (c67942la.LIZ == 1) {
            RemoteViews remoteViews = new RemoteViews(context.getPackageName(), R.layout.hk);
            remoteViews.setOnClickPendingIntent(R.id.g2b, MAS.LIZLLL(this, R.id.g2b, context, 0, 12));
            appWidgetManager.updateAppWidget(iArr, remoteViews);
            return;
        }
        RemoteViews remoteViews2 = new RemoteViews(context.getPackageName(), R.layout.hj);
        remoteViews2.setOnClickPendingIntent(R.id.mip, MAS.LIZLLL(this, R.id.mip, context, 0, 12));
        remoteViews2.setTextViewText(R.id.m75, context.getText(R.string.qbt));
        remoteViews2.setTextViewText(R.id.mek, context.getText(R.string.qbu));
        remoteViews2.setTextViewText(R.id.m8w, context.getText(R.string.qbv));
        remoteViews2.setOnClickPendingIntent(R.id.g3g, MAS.LIZLLL(this, R.id.g3g, context, 0, 12));
        remoteViews2.setOnClickPendingIntent(R.id.g5a, MAS.LIZLLL(this, R.id.g5a, context, 0, 12));
        remoteViews2.setOnClickPendingIntent(R.id.g3z, MAS.LIZLLL(this, R.id.g3z, context, 0, 12));
        if (c67942la.LIZ == 2) {
            SearchWidgetModel searchWidgetModel = c67942la.LIZIZ;
            if (searchWidgetModel != null) {
                remoteViews2.setTextViewText(R.id.mip, searchWidgetModel.getFirstGuessWord());
                MAC.LJIIIIZZ(searchWidgetModel, "function_entry_medium", "widget_default_search_keyword", C113554cx.LJJJLIIL());
            }
        } else {
            remoteViews2.setTextViewText(R.id.mip, context.getString(R.string.qc0));
        }
        appWidgetManager.updateAppWidget(iArr, remoteViews2);
        MAO.LIZ.getClass();
        LJI(R.id.f3a, R.drawable.oy, appWidgetManager, remoteViews2, MAO.LIZ(0), iArr);
        LJI(R.id.f8w, R.drawable.p2, appWidgetManager, remoteViews2, MAO.LIZ(1), iArr);
        LJI(R.id.f5c, R.drawable.oz, appWidgetManager, remoteViews2, MAO.LIZ(2), iArr);
    }

    @Override // X.MAS
    public final void LIZ(Intent intent, int i, Context context, int i2, Map<String, String> extraData) {
        o.LJIIIZ(context, "context");
        o.LJIIIZ(extraData, "extraData");
        Bundle bundle = new Bundle();
        if (i == R.id.mip) {
            intent.putExtra("url", "//search");
            bundle.putString("enter_from", "search_widget");
            bundle.putString("enter_method", "default_search_keyword");
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("widget_type", "function_entry_medium");
            jSONObject.put("add_widget_type", MA8.LIZ("function_entry_medium"));
            bundle.putString("extraLogParams", jSONObject.toString());
            if (MAR.LIZ().length() > 0) {
                bundle.putString("keyword", MAR.LIZ());
                bundle.putInt("back_flag", 2);
                bundle.putBoolean("in_single_stack", true);
                intent.putExtra("click_type", "click_search_result");
            } else {
                intent.putExtra("click_type", "click_enter_search");
            }
        } else if (i == R.id.g3g) {
            MAO.LIZ.getClass();
            String LIZIZ = MAO.LIZIZ(0);
            if (LIZIZ == null) {
                LIZIZ = "//main?tab=0&com.ss.android.ugc.aweme.intent.extra.EXTRA_AWEME_PUSH_TAB=HOME";
            }
            intent.putExtra("url", LIZIZ);
            intent.putExtra("click_type", "click_follow");
        } else if (i == R.id.g5a) {
            MAO.LIZ.getClass();
            String LIZIZ2 = MAO.LIZIZ(1);
            if (LIZIZ2 == null) {
                LIZIZ2 = "aweme://openShoot";
            }
            intent.putExtra("url", LIZIZ2);
            intent.putExtra("click_type", "click_post");
        } else if (i == R.id.g3z) {
            MAO.LIZ.getClass();
            String LIZIZ3 = MAO.LIZIZ(2);
            if (LIZIZ3 == null) {
                LIZIZ3 = "//main?com.ss.android.ugc.aweme.intent.extra.EXTRA_AWEME_PUSH_TAB=NOTIFICATION";
            }
            intent.putExtra("url", LIZIZ3);
            intent.putExtra("click_type", "click_message");
        } else if (i == R.id.g2b) {
            if (AV1.LJIILLIIL()) {
                intent.putExtra("url", "//kids/main");
            } else {
                intent.putExtra("url", "//main");
            }
            intent.putExtra("click_type", "click_fyp");
        }
        intent.putExtra("extra_jump_type", 14);
        intent.putExtra("data_model", MAR.LIZJ.LIZIZ);
        intent.putExtra("search_extra", bundle);
    }

    public static void LJI(int i, int i2, AppWidgetManager appWidgetManager, RemoteViews remoteViews, String str, int[] iArr) {
        W5F LJIIIIZZ = W5U.LJIIIIZZ(str);
        LJIIIIZZ.LJIJJ = EnumC72807Shn.FIT_XY;
        LJIIIIZZ.LJIIIZ(new MAP(i, i2, appWidgetManager, remoteViews, iArr));
    }
}
