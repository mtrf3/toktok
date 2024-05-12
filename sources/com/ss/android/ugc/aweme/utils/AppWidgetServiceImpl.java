package com.ss.android.ugc.aweme.utils;

import X.AK2;
import X.ActivityC45651qj;
import X.C00F;
import X.C08880Wm;
import X.C0MQ;
import X.C0MR;
import X.C0MS;
import X.C47261Igj;
import X.C56378MAs;
import X.C58096Mr6;
import X.C65429Pm5;
import X.EE1;
import X.InterfaceC57784Mm4;
import X.MA1;
import X.MA6;
import X.MA8;
import X.MAA;
import X.MAE;
import X.MCI;
import X.MCT;
import android.app.PendingIntent;
import android.appwidget.AppWidgetManager;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Build;
import android.os.Bundle;
import android.os.RemoteException;
import androidx.core.graphics.drawable.IconCompat;
import com.bytedance.ies.powerlist.PowerCell;
import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.IAppWidgetService;
import com.ss.android.ugc.aweme.core.SmallAppWidgetProvider;
import com.ss.android.ugc.aweme.referral.ReferralWidgetLegoTask;
import com.ss.android.ugc.aweme.search.core.ui.SearchMiddleWidget;
import com.ss.android.ugc.aweme.search.core.viewmodel.task.SearchWidgetTask;
import com.ss.android.ugc.aweme.story.SocialWidgetLegoTask;
import com.ss.android.ugc.aweme.story.guide.StoryWidgetGuideInboxCell;
import com.zhiliaoapp.musically.R;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.AqS169S0100000_3;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public final class AppWidgetServiceImpl implements IAppWidgetService {
    @Override // com.ss.android.ugc.aweme.IAppWidgetService
    public final boolean LIZ() {
        return C08880Wm.LIZ(1, 0, "search_widget_size_config", true) != 1;
    }

    @Override // com.ss.android.ugc.aweme.IAppWidgetService
    public final void LIZIZ(Context context) {
        o.LJIIIZ(context, "context");
    }

    @Override // com.ss.android.ugc.aweme.IAppWidgetService
    public final List<EE1> LIZLLL() {
        return C47261Igj.LJJIJIIJI(new SocialWidgetLegoTask(), new ReferralWidgetLegoTask(), new SearchWidgetTask());
    }

    @Override // com.ss.android.ugc.aweme.IAppWidgetService
    public final Class<? extends PowerCell<? extends InterfaceC57784Mm4>>[] LJIIIZ() {
        return new Class[]{StoryWidgetGuideInboxCell.class};
    }

    @Override // com.ss.android.ugc.aweme.IAppWidgetService
    public final void getLauncherIconRes() {
    }

    public static IAppWidgetService LJIJI() {
        Object LIZ = C58096Mr6.LIZ(IAppWidgetService.class, false);
        if (LIZ != null) {
            return (IAppWidgetService) LIZ;
        }
        if (C58096Mr6.R7 == null) {
            synchronized (IAppWidgetService.class) {
                if (C58096Mr6.R7 == null) {
                    C58096Mr6.R7 = new AppWidgetServiceImpl();
                }
            }
        }
        return C58096Mr6.R7;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0074  */
    @Override // com.ss.android.ugc.aweme.IAppWidgetService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.OSZ<X.InterfaceC57784Mm4, java.lang.Boolean> LIZJ() {
        /*
            r9 = this;
            java.lang.String r3 = "StoryWidgetGuideLogicUtil-getStoryWidgetItem"
            java.lang.String r0 = "invoke"
            X.MCT.LIZ(r3, r0)
            boolean r4 = X.MA6.LIZIZ()
            X.MAN r1 = X.MAN.LIZIZ
            android.app.Activity r0 = com.ss.android.ugc.aweme.utils.ActivityStack.getValidTopActivity()
            boolean r6 = r1.LIZIZ(r0)
            r1 = 0
            if (r4 != 0) goto L27
            if (r6 != 0) goto L29
            java.lang.String r0 = "can not show"
            X.MCT.LIZ(r3, r0)
            X.OSZ r2 = new X.OSZ
            java.lang.Boolean r0 = java.lang.Boolean.FALSE
            r2.<init>(r1, r0)
        L26:
            return r2
        L27:
            if (r6 == 0) goto L76
        L29:
            X.M9z r2 = X.C56359M9z.LJLILLLLZI
        L2b:
            com.bytedance.keva.Keva r1 = r2.LJIIZILJ()
            java.lang.String r0 = "keva_key_widget_guide_dialog_appeared"
            r8 = 0
            boolean r7 = r1.getBoolean(r0, r8)
            boolean r5 = X.MA6.LIZ(r2)
            java.lang.String r2 = "widget guide dialog appeared: "
            java.lang.String r1 = ", more than 72hours: "
            java.lang.String r0 = ", isStory: "
            java.lang.StringBuilder r1 = X.C00F.LIZLLL(r2, r7, r1, r5, r0)
            r1.append(r4)
            java.lang.String r0 = ", isNow: "
            r1.append(r0)
            r1.append(r6)
            java.lang.String r0 = X.X1D.LIZIZ(r1)
            X.MCT.LIZ(r3, r0)
            java.lang.String r4 = "now"
            java.lang.String r3 = "story"
            java.lang.String r1 = "StoryWidgetGuideLogicUtil"
            if (r7 != 0) goto L60
            if (r5 == 0) goto L79
        L60:
            java.lang.String r0 = "can show"
            X.MCT.LIZ(r1, r0)
            X.OSZ r2 = new X.OSZ
            X.M9y r1 = new X.M9y
            if (r6 == 0) goto L74
        L6b:
            r1.<init>(r4, r8)
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            r2.<init>(r1, r0)
            goto L26
        L74:
            r4 = r3
            goto L6b
        L76:
            X.MA1 r2 = X.MA1.LJLILLLLZI
            goto L2b
        L79:
            java.lang.String r0 = "dealWithStoryWidgetGuideItem first time"
            X.MCT.LIZ(r1, r0)
            X.OSZ r2 = new X.OSZ
            X.M9y r1 = new X.M9y
            if (r6 == 0) goto L8e
        L84:
            r0 = 1
            r1.<init>(r4, r0)
            java.lang.Boolean r0 = java.lang.Boolean.FALSE
            r2.<init>(r1, r0)
            goto L26
        L8e:
            r4 = r3
            goto L84
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.utils.AppWidgetServiceImpl.LIZJ():X.OSZ");
    }

    @Override // com.ss.android.ugc.aweme.IAppWidgetService
    public final SocialWidgetLegoTask LJIIIIZZ() {
        return new SocialWidgetLegoTask();
    }

    @Override // com.ss.android.ugc.aweme.IAppWidgetService
    public final SearchWidgetTask LJIILJJIL() {
        return new SearchWidgetTask();
    }

    @Override // com.ss.android.ugc.aweme.IAppWidgetService
    public final Map<String, String> LJIJ() {
        HashMap hashMap = new HashMap();
        if (MAA.LIZJ != 1) {
            return hashMap;
        }
        hashMap.put("enter_to", MAA.LIZIZ);
        hashMap.put("from_awe_widget", String.valueOf(MAA.LIZJ));
        hashMap.put("refer", MAA.LIZLLL);
        hashMap.put("gd_label", MAA.LJ);
        return hashMap;
    }

    @Override // com.ss.android.ugc.aweme.IAppWidgetService
    public final boolean LJ(ActivityC45651qj activityC45651qj) {
        int[] middleWidgetIds;
        boolean z = false;
        try {
            middleWidgetIds = AppWidgetManager.getInstance(activityC45651qj).getAppWidgetIds(new ComponentName(activityC45651qj, (Class<?>) SearchMiddleWidget.class));
        } catch (RemoteException unused) {
            middleWidgetIds = new int[0];
        }
        o.LJIIIIZZ(middleWidgetIds, "middleWidgetIds");
        if (middleWidgetIds.length == 0) {
            z = true;
        }
        return !z;
    }

    @Override // com.ss.android.ugc.aweme.IAppWidgetService
    public final boolean LJFF(Context context) {
        if (!LJI(context)) {
            return false;
        }
        MCT.LIZ("AppWidgetServiceImpl", "try to pin search small widget");
        AppWidgetManager.getInstance(context).requestPinAppWidget(new ComponentName(context, (Class<?>) SearchMiddleWidget.class), null, null);
        C65429Pm5.LJ("guide_", "function_entry_medium", (Keva) MA8.LIZ.getValue(), true);
        return true;
    }

    @Override // com.ss.android.ugc.aweme.IAppWidgetService
    public final boolean LJI(Context context) {
        if (Build.VERSION.SDK_INT >= 26) {
            return AppWidgetManager.getInstance(context).isRequestPinAppWidgetSupported();
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0076  */
    @Override // com.ss.android.ugc.aweme.IAppWidgetService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.OSZ<java.util.List<X.InterfaceC57784Mm4>, java.lang.Boolean> LJII(java.util.List<X.InterfaceC57784Mm4> r10) {
        /*
            r9 = this;
            java.lang.String r0 = "[dz appendStoryWidgetGuideItemFirstPositionIfNeed]"
            java.lang.String r7 = "StoryWidgetGuideLogicUtil"
            X.MCT.LIZ(r7, r0)
            boolean r8 = X.MA6.LIZIZ()
            X.MAN r1 = X.MAN.LIZIZ
            android.app.Activity r0 = com.ss.android.ugc.aweme.utils.ActivityStack.getValidTopActivity()
            boolean r6 = r1.LIZIZ(r0)
            if (r8 != 0) goto L26
            if (r6 != 0) goto L28
            java.lang.String r0 = "[dz appendStoryWidgetGuideItemAfterDmListIfNeed can not show]"
            X.MCT.LIZ(r7, r0)
            X.OSZ r1 = new X.OSZ
            java.lang.Boolean r0 = java.lang.Boolean.FALSE
            r1.<init>(r10, r0)
        L25:
            return r1
        L26:
            if (r6 == 0) goto L79
        L28:
            X.M9z r2 = X.C56359M9z.LJLILLLLZI
        L2a:
            com.bytedance.keva.Keva r1 = r2.LJIIZILJ()
            java.lang.String r0 = "keva_key_widget_guide_dialog_appeared"
            r5 = 0
            boolean r4 = r1.getBoolean(r0, r5)
            boolean r3 = X.MA6.LIZ(r2)
            java.lang.String r2 = "[dz appendStoryWidgetGuideItemFirstPositionIfNeed] widget guide dialog appeared: "
            java.lang.String r1 = ",more than 72hours: "
            java.lang.String r0 = ",isStory: "
            java.lang.StringBuilder r1 = X.C00F.LIZLLL(r2, r4, r1, r3, r0)
            r1.append(r8)
            java.lang.String r0 = ", isNow: "
            r1.append(r0)
            r1.append(r6)
            java.lang.String r0 = X.X1D.LIZIZ(r1)
            X.MCT.LIZ(r7, r0)
            if (r4 != 0) goto L6c
            if (r3 != 0) goto L6c
            java.lang.String r0 = "dealWithStoryWidgetGuideItem first time"
            X.MCT.LIZ(r7, r0)
            X.M9y r2 = new X.M9y
            if (r6 == 0) goto L76
            java.lang.String r1 = "now"
        L64:
            r0 = 1
            r2.<init>(r1, r0)
            com.bytedance.mt.protector.impl.collections.ListProtector.add(r10, r5, r2)
            r5 = 1
        L6c:
            X.OSZ r1 = new X.OSZ
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r5)
            r1.<init>(r10, r0)
            goto L25
        L76:
            java.lang.String r1 = "story"
            goto L64
        L79:
            X.MA1 r2 = X.MA1.LJLILLLLZI
            goto L2a
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.utils.AppWidgetServiceImpl.LJII(java.util.List):X.OSZ");
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x007c  */
    @Override // com.ss.android.ugc.aweme.IAppWidgetService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.OSZ<java.util.List<X.InterfaceC57784Mm4>, java.lang.Boolean> LJIIJJI(java.util.List<? extends X.InterfaceC57784Mm4> r10) {
        /*
            r9 = this;
            java.lang.String r0 = "invoke"
            java.lang.String r7 = "StoryWidgetGuideLogicUtil-appendStoryWidgetGuideItemAfterDmListIfNeed"
            X.MCT.LIZ(r7, r0)
            boolean r8 = X.MA6.LIZIZ()
            X.MAN r1 = X.MAN.LIZIZ
            android.app.Activity r0 = com.ss.android.ugc.aweme.utils.ActivityStack.getValidTopActivity()
            boolean r6 = r1.LIZIZ(r0)
            if (r8 != 0) goto L26
            if (r6 != 0) goto L28
            java.lang.String r0 = "can not show"
            X.MCT.LIZ(r7, r0)
            X.OSZ r1 = new X.OSZ
            java.lang.Boolean r0 = java.lang.Boolean.FALSE
            r1.<init>(r10, r0)
        L25:
            return r1
        L26:
            if (r6 == 0) goto L7f
        L28:
            X.M9z r2 = X.C56359M9z.LJLILLLLZI
        L2a:
            com.bytedance.keva.Keva r1 = r2.LJIIZILJ()
            java.lang.String r0 = "keva_key_widget_guide_dialog_appeared"
            r5 = 0
            boolean r4 = r1.getBoolean(r0, r5)
            boolean r3 = X.MA6.LIZ(r2)
            java.lang.String r2 = "widget guide dialog appeared: "
            java.lang.String r1 = ", more than 72hours: "
            java.lang.String r0 = ", isStory: "
            java.lang.StringBuilder r1 = X.C00F.LIZLLL(r2, r4, r1, r3, r0)
            r1.append(r8)
            java.lang.String r0 = ", isNow: "
            r1.append(r0)
            r1.append(r6)
            java.lang.String r0 = X.X1D.LIZIZ(r1)
            X.MCT.LIZ(r7, r0)
            if (r4 != 0) goto L59
            if (r3 == 0) goto L82
        L59:
            java.lang.String r1 = "StoryWidgetGuideLogicUtil"
            java.lang.String r0 = "can show"
            X.MCT.LIZ(r1, r0)
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            r2.addAll(r10)
            X.M9y r1 = new X.M9y
            if (r6 == 0) goto L7c
            java.lang.String r0 = "now"
        L6e:
            r1.<init>(r0, r5)
            r2.add(r1)
            X.OSZ r1 = new X.OSZ
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            r1.<init>(r2, r0)
            goto L25
        L7c:
            java.lang.String r0 = "story"
            goto L6e
        L7f:
            X.MA1 r2 = X.MA1.LJLILLLLZI
            goto L2a
        L82:
            X.OSZ r1 = new X.OSZ
            java.lang.Boolean r0 = java.lang.Boolean.FALSE
            r1.<init>(r10, r0)
            goto L25
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.utils.AppWidgetServiceImpl.LJIIJJI(java.util.List):X.OSZ");
    }

    @Override // com.ss.android.ugc.aweme.IAppWidgetService
    public final boolean LJIIL(Context context) {
        return C0MS.LIZ(context);
    }

    @Override // com.ss.android.ugc.aweme.IAppWidgetService
    public final boolean LJIILIIL(Context context) {
        if (!C0MS.LIZ(context)) {
            return false;
        }
        Intent LIZ = MAE.LIZ(context, "now_shortcut");
        LIZ.putExtra("extra_jump_type", 11);
        LIZ.putExtra("enter_from", "now_widget");
        LIZ.putExtra("enter_method", "click_now_shortcut");
        Bundle bundle = new Bundle();
        bundle.putString("enter_to", "now_shortcut");
        LIZ.putExtra("extra_now_event_log_info", bundle);
        LIZ.setFlags(268435456);
        LIZ.addFlags(67108864);
        LIZ.setAction("android.intent.action.VIEW");
        C0MQ c0mq = new C0MQ(context);
        c0mq.LIZ.LIZJ = new Intent[]{LIZ};
        c0mq.LIZ.LJ = context.getString(R.string.yw);
        c0mq.LIZ.LJII = IconCompat.LIZJ(context.getResources(), context.getPackageName(), R.drawable.ot);
        C0MR LIZ2 = c0mq.LIZ();
        o.LJIIIIZZ(LIZ2, "Builder(context, NowCame…on))\n            .build()");
        Intent intent = new Intent("com.ss.android.ugc.aweme.now.shortcut.NOW_CAMERA_SHORTCUT_ADDED");
        intent.putExtra("android.intent.extra.shortcut.ID", "now_shortcut");
        try {
            C0MS.LIZIZ(context, LIZ2, PendingIntent.getBroadcast(context, 4, intent, C56378MAs.LIZIZ()).getIntentSender());
            return true;
        } catch (Exception unused) {
            return false;
        }
    }

    @Override // com.ss.android.ugc.aweme.IAppWidgetService
    public final boolean LJIILL(Context context) {
        if (!LJI(context)) {
            return false;
        }
        MCT.LIZ("AppWidgetServiceImpl", "try to pin now small widget");
        AppWidgetManager.getInstance(context).requestPinAppWidget(new ComponentName(context, (Class<?>) SmallAppWidgetProvider.class), null, null);
        return true;
    }

    @Override // com.ss.android.ugc.aweme.IAppWidgetService
    public final void LJIILLIIL(Context context) {
        long millis;
        if (MA6.LIZIZ()) {
            MA1 ma1 = MA1.LJLILLLLZI;
            int i = ma1.LJIIZILJ().getInt("key_widget_guide_contextual_count", 0);
            long j = ma1.LJIIZILJ().getLong("key_widget_guide_contextual_time", -1L);
            MCT.LIZ("StoryWidgetGuideLogicUtil", C00F.LIZJ("showStoryGuideSheetContextual count: ", i, ", time: ", j));
            long currentTimeMillis = System.currentTimeMillis();
            if (i != 0) {
                if (1 <= i && i < 4) {
                    millis = TimeUnit.HOURS.toMillis(72L);
                } else {
                    millis = TimeUnit.DAYS.toMillis(14L);
                }
                if (currentTimeMillis < j + millis) {
                    return;
                }
            }
            AK2.LIZ(context, "contextual");
            ma1.LJIIZILJ().storeInt("key_widget_guide_contextual_count", i + 1);
            ma1.LJIIZILJ().storeLong("key_widget_guide_contextual_time", currentTimeMillis);
        }
    }

    @Override // com.ss.android.ugc.aweme.IAppWidgetService
    public final Intent LJIIJ(Context context, String widgetType) {
        o.LJIIIZ(context, "context");
        o.LJIIIZ(widgetType, "widgetType");
        return MAE.LIZ(context, widgetType);
    }

    @Override // com.ss.android.ugc.aweme.IAppWidgetService
    public final void LJIIZILJ(Bitmap bitmap, int[] targetSize, boolean z, float f, AqS169S0100000_3 aqS169S0100000_3) {
        o.LJIIIZ(bitmap, "bitmap");
        o.LJIIIZ(targetSize, "targetSize");
        MCI.LIZJ(bitmap, targetSize, z, f, aqS169S0100000_3);
    }
}
