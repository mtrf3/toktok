package com.ss.android.ugc.aweme.share.systemshare;

import X.C03880Dg;
import X.C107264Iw;
import X.C16880lQ;
import X.C188727au;
import X.C35532Dx2;
import X.C38354F3m;
import X.C38413F5t;
import X.C38523F9z;
import X.C39519Ff9;
import X.C4LD;
import X.C65300Pk0;
import X.C84763XOl;
import X.FMX;
import X.PEH;
import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.os.Build;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes7.dex */
public class SystemShareTargetChosenReceiver extends BroadcastReceiver {
    public static List LIZIZ(PackageManager packageManager, Intent intent) {
        C39519Ff9 LIZJ = new C03880Dg(2).LIZJ(101311, "android/content/pm/PackageManager", "queryIntentActivities", packageManager, new Object[]{intent, 0}, "java.util.List", new C65300Pk0(false, "(Landroid/content/Intent;I)Ljava/util/List;", "1130979828932847212"));
        return LIZJ.LIZ ? (List) LIZJ.LIZIZ : packageManager.queryIntentActivities(intent, 0);
    }

    public static void LIZ(Context context, Intent intent) {
        String str;
        if (intent == null || context == null || Build.VERSION.SDK_INT < 22) {
            return;
        }
        try {
            ComponentName componentName = (ComponentName) intent.getParcelableExtra("android.intent.extra.CHOSEN_COMPONENT");
            if (componentName != null) {
                String LLJJIJIIJIL = C16880lQ.LLJJIJIIJIL(intent, "extra_type");
                if (!C38354F3m.LJ(LLJJIJIIJIL)) {
                    str = LIZJ(context, componentName, LLJJIJIIJIL);
                } else {
                    str = null;
                }
                if (C38354F3m.LJ(str)) {
                    str = "";
                    try {
                        PackageManager packageManager = context.getPackageManager();
                        ApplicationInfo LLLLLLLLL = C16880lQ.LLLLLLLLL(packageManager, componentName.getPackageName(), 0);
                        if (LLLLLLLLL != null) {
                            str = LLLLLLLLL.loadLabel(packageManager).toString();
                        }
                    } catch (Throwable th) {
                        PEH.LIZLLL(th, "SystemShareTargetChosenReceiver getApplicationLabel error");
                    }
                }
                C188727au c188727au = new C188727au();
                c188727au.LJIIIZ("platform", str);
                c188727au.LJIIIZ("package_name", componentName.getPackageName());
                c188727au.LJIIIZ("component_name", componentName.getClassName());
                Aweme aweme = C107264Iw.LIZ;
                if (aweme != null && C4LD.LIZIZ.LJIILLIIL(aweme)) {
                    c188727au.LIZLLL(aweme.getAwemeType(), "aweme_type");
                    c188727au.LIZLLL(aweme.getPhotoModeImageInfo().getImageList().size(), "pic_cnt");
                }
                FMX.LJIIL("share_video_more_track", c188727au.LIZ);
            }
        } catch (Exception unused) {
        }
    }

    @Override // android.content.BroadcastReceiver
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

    public static String LIZJ(Context context, ComponentName componentName, String str) {
        try {
            PackageManager packageManager = context.getPackageManager();
            Intent intent = new Intent("android.intent.action.SEND");
            intent.setType(str);
            for (ResolveInfo resolveInfo : LIZIZ(packageManager, intent)) {
                ActivityInfo activityInfo = resolveInfo.activityInfo;
                if (activityInfo != null && C38354F3m.LIZJ(activityInfo.name, componentName.getClassName()) && C38354F3m.LIZJ(resolveInfo.activityInfo.packageName, componentName.getPackageName())) {
                    return resolveInfo.loadLabel(packageManager).toString();
                }
            }
            return "";
        } catch (Throwable th) {
            PEH.LIZLLL(th, "SystemShareTargetChosenReceiver getApplicationLabel error");
            return "";
        }
    }
}
