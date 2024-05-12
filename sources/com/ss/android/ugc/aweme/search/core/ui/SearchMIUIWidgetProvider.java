package com.ss.android.ugc.aweme.search.core.ui;

import X.AV1;
import X.C35532Dx2;
import X.C38413F5t;
import X.C38523F9z;
import X.C67932lZ;
import X.C84763XOl;
import X.MAS;
import android.appwidget.AppWidgetManager;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.ss.android.ugc.aweme.search.core.model.SearchWidgetModel;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Map;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public final class SearchMIUIWidgetProvider extends MAS {
    public boolean LIZIZ;
    public boolean LIZJ;

    @Override // X.MAS
    public final String LJ() {
        return "recom_word_with_default";
    }

    @Override // X.MAS
    public final void LJFF(Context context, AppWidgetManager appWidgetManager, int[] iArr, Intent intent) {
        o.LJIIIZ(context, "context");
        o.LJIIIZ(intent, "intent");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0048, code lost:
    
        if (r6.equals("com.ss.android.ugc.tiktok.app.widget.SEARCH_SUGGEST_LIST_WIDGET_NO_SEARCH") == false) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0061, code lost:
    
        r4 = android.appwidget.AppWidgetManager.getInstance(r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0065, code lost:
    
        if (r4 != null) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0067, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0068, code lost:
    
        r3 = X.MAX.LIZJ(r9, r4, "recom_word_with_default");
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0070, code lost:
    
        if (r3.length != 0) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0072, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0077, code lost:
    
        if (kotlin.jvm.internal.o.LJ(r6, "android.appwidget.action.APPWIDGET_ENABLED") == false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0079, code lost:
    
        X.DK3.LIZ().storeInt("added_", r3[0]);
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0084, code lost:
    
        r8.LIZIZ = kotlin.jvm.internal.o.LJ(r6, "com.ss.android.ugc.tiktok.app.widget.SEARCH_WIDGET_CHECK_STATE");
        onUpdate(r9, r4, r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0051, code lost:
    
        if (r6.equals("android.appwidget.action.APPWIDGET_UPDATE") == false) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0058, code lost:
    
        if (r6.equals("com.ss.android.ugc.tiktok.app.widget.SEARCH_WIDGET_CHECK_STATE") == false) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x005f, code lost:
    
        if (r6.equals("android.appwidget.action.APPWIDGET_ENABLED") != false) goto L28;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:10:0x002d. Please report as an issue. */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJI(android.content.Context r9, android.content.Intent r10) {
        /*
            r8 = this;
            super.onReceive(r9, r10)
            if (r9 == 0) goto L41
            java.lang.String r6 = r10.getAction()
            java.lang.String r2 = "android.appwidget.action.APPWIDGET_ENABLED"
            boolean r0 = kotlin.jvm.internal.o.LJ(r6, r2)
            r8.LIZJ = r0
            java.lang.String r0 = "com.ss.android.ugc.tiktok.app.widget.SEARCH_SUGGEST_LIST_WIDGET_UPDATE"
            boolean r0 = kotlin.jvm.internal.o.LJ(r6, r0)
            if (r0 != 0) goto L21
            java.lang.String r0 = "miui.appwidget.action.APPWIDGET_UPDATE"
            boolean r0 = kotlin.jvm.internal.o.LJ(r6, r0)
            if (r0 == 0) goto L24
        L21:
            X.C67932lZ.LIZJ(r9)
        L24:
            r5 = 1
            if (r6 == 0) goto L30
            int r0 = r6.hashCode()
            java.lang.String r7 = "com.ss.android.ugc.tiktok.app.widget.SEARCH_WIDGET_CHECK_STATE"
            switch(r0) {
                case -1539974816: goto L42;
                case 1587081399: goto L5b;
                case 1619576947: goto L4b;
                case 1908027248: goto L54;
                default: goto L30;
            }
        L30:
            java.lang.String r0 = "android.appwidget.action.APPWIDGET_DELETED"
            boolean r0 = kotlin.jvm.internal.o.LJ(r6, r0)
            if (r0 == 0) goto L41
            com.bytedance.keva.Keva r1 = X.DK3.LIZ()
            java.lang.String r0 = "deleted_"
            r1.storeBoolean(r0, r5)
        L41:
            return
        L42:
            java.lang.String r0 = "com.ss.android.ugc.tiktok.app.widget.SEARCH_SUGGEST_LIST_WIDGET_NO_SEARCH"
            boolean r0 = r6.equals(r0)
            if (r0 != 0) goto L61
            goto L30
        L4b:
            java.lang.String r0 = "android.appwidget.action.APPWIDGET_UPDATE"
            boolean r0 = r6.equals(r0)
            if (r0 != 0) goto L61
            goto L30
        L54:
            boolean r0 = r6.equals(r7)
            if (r0 != 0) goto L61
            goto L30
        L5b:
            boolean r0 = r6.equals(r2)
            if (r0 == 0) goto L30
        L61:
            android.appwidget.AppWidgetManager r4 = android.appwidget.AppWidgetManager.getInstance(r9)
            if (r4 != 0) goto L68
            return
        L68:
            java.lang.String r0 = "recom_word_with_default"
            int[] r3 = X.MAX.LIZJ(r9, r4, r0)
            int r0 = r3.length
            r1 = 0
            if (r0 != 0) goto L73
            return
        L73:
            boolean r0 = kotlin.jvm.internal.o.LJ(r6, r2)
            if (r0 == 0) goto L84
            r2 = r3[r1]
            com.bytedance.keva.Keva r1 = X.DK3.LIZ()
            java.lang.String r0 = "added_"
            r1.storeInt(r0, r2)
        L84:
            boolean r0 = kotlin.jvm.internal.o.LJ(r6, r7)
            r8.LIZIZ = r0
            r8.onUpdate(r9, r4, r3)
            goto L30
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.search.core.ui.SearchMIUIWidgetProvider.LJI(android.content.Context, android.content.Intent):void");
    }

    public final void LJII(Intent intent, Bundle bundle) {
        intent.putExtra("url", "//search");
        bundle.putString("enter_from", "search_widget");
        bundle.putString("enter_method", "recom_search");
        bundle.putInt("back_flag", 2);
        bundle.putBoolean("in_single_stack", true);
    }

    @Override // X.MAS, X.MAZ, android.appwidget.AppWidgetProvider, android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if (!C84763XOl.LJIIJJI && intent != null) {
            if (!((ArrayList) C38413F5t.LIZ).contains(intent.getAction()) && C38413F5t.LIZ("onBroadcastReceiverReceive")) {
                C35532Dx2.LIZIZ();
            }
        }
        if (!"android.net.conn.CONNECTIVITY_CHANGE".equals(intent.getAction())) {
            LJI(context, intent);
        } else {
            C38523F9z.LIZ();
            LJI(context, intent);
        }
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:60:0x0172. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0145  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x02d0  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x02f1  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x02ba  */
    @Override // X.MAS, android.appwidget.AppWidgetProvider
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onUpdate(android.content.Context r30, android.appwidget.AppWidgetManager r31, int[] r32) {
        /*
            Method dump skipped, instructions count: 832
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.search.core.ui.SearchMIUIWidgetProvider.onUpdate(android.content.Context, android.appwidget.AppWidgetManager, int[]):void");
    }

    @Override // X.MAS
    public final void LIZ(Intent intent, int i, Context context, int i2, Map<String, String> extraData) {
        boolean z;
        String str;
        o.LJIIIZ(context, "context");
        o.LJIIIZ(extraData, "extraData");
        Bundle bundle = new Bundle();
        intent.putExtra("widgetId", i2);
        if (i == R.id.jf8 || i == R.id.jhu) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            LJII(intent, bundle);
            intent.putExtra("click_type", "click_enter_search");
        } else if (i == R.id.kt8 || i == R.id.ksv || i == R.id.kt7 || i == R.id.kt6 || i == R.id.ksm || i == R.id.ksl || i == R.id.ksx || i == R.id.ksw) {
            LJII(intent, bundle);
            intent.putExtra("isNeedMergeParams", true);
            for (Map.Entry<String, String> entry : extraData.entrySet()) {
                intent.putExtra(entry.getKey(), entry.getValue());
            }
            intent.putExtra("click_type", "click_recom_result");
        } else if (i == R.id.g2b) {
            if (AV1.LJIILLIIL()) {
                intent.putExtra("url", "//kids/main");
            } else {
                intent.putExtra("url", "//main");
            }
            intent.putExtra("click_type", "click_fyp");
        }
        intent.putExtra("extra_jump_type", 15);
        SearchWidgetModel searchWidgetModel = C67932lZ.LIZIZ.LIZIZ;
        if (searchWidgetModel != null) {
            str = searchWidgetModel.getLogId();
        } else {
            str = null;
        }
        intent.putExtra("logid", str);
        intent.putExtra("search_extra", bundle);
        intent.putExtra("isNeedMergeParams", true);
    }
}
