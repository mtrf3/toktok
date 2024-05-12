package X;

import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.text.TextUtils;
import com.google.android.gms.common.ConnectionResult;

/* renamed from: X.QaU, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public class C67258QaU {
    public static final int GOOGLE_PLAY_SERVICES_VERSION_CODE = 12451000;
    public static final C67258QaU zza = new C67258QaU();

    public static C67258QaU getInstance() {
        return zza;
    }

    public void cancelAvailabilityErrorNotifications(Context context) {
        if (C67264Qaa.LIZ.getAndSet(true)) {
            return;
        }
        try {
            NotificationManager notificationManager = (NotificationManager) C16880lQ.LLILL(context, "notification");
            if (notificationManager == null) {
                return;
            }
            notificationManager.cancel(10436);
        } catch (SecurityException unused) {
        }
    }

    public int getApkVersion(Context context) {
        try {
            return C16880lQ.LLLLLLZ(context.getPackageManager(), "com.google.android.gms", 0).versionCode;
        } catch (PackageManager.NameNotFoundException unused) {
            return 0;
        }
    }

    public Intent getErrorResolutionIntent(int i) {
        return getErrorResolutionIntent(null, i, null);
    }

    public String getErrorString(int i) {
        return ConnectionResult.LJJJJZI(i);
    }

    public int isGooglePlayServicesAvailable(Context context) {
        return isGooglePlayServicesAvailable(context, GOOGLE_PLAY_SERVICES_VERSION_CODE);
    }

    public boolean isUserResolvableError(int i) {
        if (i == 1 || i == 2 || i == 3 || i == 9) {
            return true;
        }
        return false;
    }

    public int isGooglePlayServicesAvailable(Context context, int i) {
        int LIZIZ = C67264Qaa.LIZIZ(context, i);
        if (LIZIZ == 18 || (LIZIZ == 1 && C67264Qaa.LIZJ(context, "com.google.android.gms"))) {
            return 18;
        }
        return LIZIZ;
    }

    public boolean isPlayServicesPossiblyUpdating(Context context, int i) {
        if (i == 18) {
            return true;
        }
        if (i == 1) {
            return C67264Qaa.LIZJ(context, "com.google.android.gms");
        }
        return false;
    }

    public boolean isUninstalledAppPossiblyUpdating(Context context, String str) {
        return C67264Qaa.LIZJ(context, str);
    }

    public Intent getErrorResolutionIntent(Context context, int i, String str) {
        if (i != 1 && i != 2) {
            if (i != 3) {
                return null;
            }
            android.net.Uri fromParts = android.net.Uri.fromParts("package", "com.google.android.gms", null);
            Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
            intent.setData(fromParts);
            return intent;
        }
        if (context == null || !C67261QaX.LIZ(context)) {
            StringBuilder sb = new StringBuilder("gcore_");
            sb.append(GOOGLE_PLAY_SERVICES_VERSION_CODE);
            sb.append("-");
            if (!TextUtils.isEmpty(str)) {
                sb.append(str);
            }
            sb.append("-");
            if (context != null) {
                sb.append(context.getPackageName());
            }
            sb.append("-");
            if (context != null) {
                try {
                    sb.append(QCX.LIZ(context).LIZIZ(0, context.getPackageName()).versionCode);
                } catch (PackageManager.NameNotFoundException unused) {
                }
            }
            String sb2 = sb.toString();
            Intent intent2 = new Intent("android.intent.action.VIEW");
            Uri.Builder LIZIZ = C1EU.LIZIZ("market://details", "id", "com.google.android.gms");
            if (!TextUtils.isEmpty(sb2)) {
                LIZIZ.appendQueryParameter("pcampaignid", sb2);
            }
            intent2.setData(LIZIZ.build());
            intent2.setPackage("com.android.vending");
            intent2.addFlags(524288);
            return intent2;
        }
        Intent intent3 = new Intent("com.google.android.clockwork.home.UPDATE_ANDROID_WEAR_ACTION");
        intent3.setPackage("com.google.android.wearable.app");
        return intent3;
    }

    public PendingIntent getErrorResolutionPendingIntent(Context context, int i, int i2) {
        return getErrorResolutionPendingIntent(context, i, i2, null);
    }

    public PendingIntent getErrorResolutionPendingIntent(Context context, int i, int i2, String str) {
        Intent errorResolutionIntent = getErrorResolutionIntent(context, i, str);
        if (errorResolutionIntent == null) {
            return null;
        }
        return PendingIntent.getActivity(context, i2, errorResolutionIntent, C38533FAj.LIZ | 134217728);
    }
}
