package com.ss.android.ugc.aweme.appwidget;

import X.C145995oB;
import X.C16880lQ;
import X.C35532Dx2;
import X.C38413F5t;
import X.C38523F9z;
import X.C84763XOl;
import X.GXR;
import X.HKC;
import X.WM7;
import android.appwidget.AppWidgetProvider;
import android.content.Context;
import android.content.Intent;
import java.util.ArrayList;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public final class CameraWidgetProvider extends AppWidgetProvider {
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00ac, code lost:
    
        if (X.C47614ImQ.LIZ(r1, "vivo") != false) goto L12;
     */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0086  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LIZIZ(android.content.Context r12) {
        /*
            java.lang.String r0 = "context"
            kotlin.jvm.internal.o.LJIIIZ(r12, r0)
            boolean r0 = X.JF5.LJ()
            if (r0 == 0) goto Laf
            android.widget.RemoteViews r6 = new android.widget.RemoteViews
            java.lang.String r1 = r12.getPackageName()
            r0 = 2131558605(0x7f0d00cd, float:1.874253E38)
            r6.<init>(r1, r0)
        L17:
            android.appwidget.AppWidgetManager r4 = android.appwidget.AppWidgetManager.getInstance(r12)
            java.lang.String r0 = "main_camera"
            android.content.Intent r3 = X.MAE.LIZ(r12, r0)
            java.lang.String r1 = "extra_jump_type"
            r0 = 10
            r3.putExtra(r1, r0)
            r2 = 268435456(0x10000000, float:2.524355E-29)
            r3.setFlags(r2)
            r0 = 67108864(0x4000000, float:1.5046328E-36)
            r3.addFlags(r0)
            int r1 = android.os.Build.VERSION.SDK_INT
            r0 = 23
            if (r1 < r0) goto L3b
            r2 = 335544320(0x14000000, float:6.4623485E-27)
        L3b:
            r0 = 3
            android.app.PendingIntent r3 = android.app.PendingIntent.getActivity(r12, r0, r3, r2)
            java.lang.String r1 = android.os.Build.BRAND
            boolean r0 = android.text.TextUtils.isEmpty(r1)
            r8 = 0
            r2 = 1
            java.lang.String r5 = "vivo"
            if (r0 != 0) goto L91
            boolean r0 = X.C47614ImQ.LIZ(r1, r5)
            if (r0 == 0) goto L91
        L52:
            r5 = 2131379329(0x7f0a4481, float:1.8378916E38)
            r1 = 2
            r0 = 1091567616(0x41100000, float:9.0)
            r6.setTextViewTextSize(r5, r1, r0)
            r0 = 1077936128(0x40400000, float:3.0)
            float r0 = X.KL2.LIZJ(r12, r0)
            int r9 = (int) r0
            r7 = 2131379329(0x7f0a4481, float:1.8378916E38)
            r10 = r8
            r11 = r8
            r6.setViewPadding(r7, r8, r9, r10, r11)
        L6a:
            r0 = 2131375035(0x7f0a33bb, float:1.8370206E38)
            r6.setOnClickPendingIntent(r0, r3)
            android.appwidget.AppWidgetManager r3 = android.appwidget.AppWidgetManager.getInstance(r12)
            java.lang.String r0 = "getInstance(context)"
            kotlin.jvm.internal.o.LJIIIIZZ(r3, r0)
            android.content.ComponentName r1 = new android.content.ComponentName
            java.lang.Class<com.ss.android.ugc.aweme.appwidget.CameraWidgetProvider> r0 = com.ss.android.ugc.aweme.appwidget.CameraWidgetProvider.class
            r1.<init>(r12, r0)
            int[] r3 = r3.getAppWidgetIds(r1)
            if (r3 == 0) goto Lbd
            int r1 = r3.length
        L87:
            if (r8 >= r1) goto Lbd
            r0 = r3[r8]
            r4.updateAppWidget(r0, r6)
            int r8 = r8 + 1
            goto L87
        L91:
            java.lang.String r1 = android.os.Build.MODEL
            boolean r0 = android.text.TextUtils.isEmpty(r1)
            if (r0 != 0) goto La0
            boolean r0 = X.C47614ImQ.LIZ(r1, r5)
            if (r0 == 0) goto La0
            goto L52
        La0:
            java.lang.String r1 = android.os.Build.MANUFACTURER
            boolean r0 = android.text.TextUtils.isEmpty(r1)
            if (r0 != 0) goto L6a
            boolean r0 = X.C47614ImQ.LIZ(r1, r5)
            if (r0 == 0) goto L6a
            goto L52
        Laf:
            android.widget.RemoteViews r6 = new android.widget.RemoteViews
            java.lang.String r1 = r12.getPackageName()
            r0 = 2131558604(0x7f0d00cc, float:1.8742529E38)
            r6.<init>(r1, r0)
            goto L17
        Lbd:
            com.bytedance.keva.Keva r1 = X.HKC.LIZ()
            java.lang.String r0 = "widget_installed"
            r1.storeBoolean(r0, r2)
            com.bytedance.keva.Keva r1 = X.HKC.LIZ()
            java.lang.String r0 = "widget_current_install"
            r1.storeBoolean(r0, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.appwidget.CameraWidgetProvider.LIZIZ(android.content.Context):void");
    }

    public final void LIZ(Context context, Intent intent) {
        o.LJIIIZ(context, "context");
        o.LJIIIZ(intent, "intent");
        super.onReceive(context, intent);
        String action = intent.getAction();
        if (action != null) {
            int hashCode = action.hashCode();
            if (hashCode != 0) {
                if (hashCode != 452171151) {
                    if (hashCode != 1619576947 || !action.equals("android.appwidget.action.APPWIDGET_UPDATE")) {
                        return;
                    }
                    LIZIZ(context);
                    return;
                }
                if (!action.equals("android.appwidget.action.APPWIDGET_DELETED")) {
                    return;
                }
                HKC.LIZ().storeBoolean("widget_current_install", false);
                return;
            }
            String str = "";
            if (!action.equals("")) {
                return;
            }
            LIZIZ(context);
            String LLJJIJIIJIL = C16880lQ.LLJJIJIIJIL(intent, "enter_from");
            if (LLJJIJIIJIL == null) {
                LLJJIJIIJIL = "";
            }
            String LLJJIJIIJIL2 = C16880lQ.LLJJIJIIJIL(intent, "shoot_way");
            if (LLJJIJIIJIL2 == null) {
                LLJJIJIIJIL2 = "";
            }
            String LLJJIJIIJIL3 = C16880lQ.LLJJIJIIJIL(intent, "creation_id");
            if (LLJJIJIIJIL3 == null) {
                LLJJIJIIJIL3 = "";
            }
            String LLJJIJIIJIL4 = C16880lQ.LLJJIJIIJIL(intent, WM7.SCENE_SERVICE);
            if (LLJJIJIIJIL4 != null) {
                str = LLJJIJIIJIL4;
            }
            C145995oB c145995oB = new C145995oB();
            c145995oB.LJI("enter_from", LLJJIJIIJIL);
            c145995oB.LJI("shoot_way", LLJJIJIIJIL2);
            c145995oB.LJI("creation_id", LLJJIJIIJIL3);
            c145995oB.LJI(WM7.SCENE_SERVICE, str);
            c145995oB.LJI("status", "add");
            GXR.LIZ("click_add_camera_popup_system", c145995oB.LIZ);
        }
    }

    @Override // android.appwidget.AppWidgetProvider, android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if (!C84763XOl.LJIIJJI && intent != null) {
            if (!((ArrayList) C38413F5t.LIZ).contains(intent.getAction()) && C38413F5t.LIZ("onBroadcastReceiverReceive")) {
                C35532Dx2.LIZIZ();
            }
        }
        if (!"android.net.conn.CONNECTIVITY_CHANGE".equals(intent.getAction())) {
            LIZ(context, intent);
        } else {
            C38523F9z.LIZ();
            LIZ(context, intent);
        }
    }
}
