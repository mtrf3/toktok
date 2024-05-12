package X;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Bundle;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveBroadcastUploadVideoImageHeightSetting;

/* renamed from: X.06s, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C021806s {
    public static Intent LIZ(Activity activity) {
        Intent LIZ = C021706r.LIZ(activity);
        if (LIZ != null) {
            return LIZ;
        }
        try {
            String LIZJ = LIZJ(activity, activity.getComponentName());
            if (LIZJ == null) {
                return null;
            }
            ComponentName componentName = new ComponentName(activity, LIZJ);
            try {
                if (LIZJ(activity, componentName) == null) {
                    return Intent.makeMainActivity(componentName);
                }
                return new Intent().setComponent(componentName);
            } catch (PackageManager.NameNotFoundException unused) {
                return null;
            }
        } catch (PackageManager.NameNotFoundException e) {
            throw new IllegalArgumentException(e);
        }
    }

    public static Intent LIZIZ(Context context, ComponentName componentName) {
        String LIZJ = LIZJ(context, componentName);
        if (LIZJ == null) {
            return null;
        }
        ComponentName componentName2 = new ComponentName(componentName.getPackageName(), LIZJ);
        if (LIZJ(context, componentName2) == null) {
            return Intent.makeMainActivity(componentName2);
        }
        return new Intent().setComponent(componentName2);
    }

    public static String LIZJ(Context context, ComponentName componentName) {
        int i;
        String string;
        PackageManager packageManager = context.getPackageManager();
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 29) {
            i = 269222528;
        } else if (i2 >= 24) {
            i = 787072;
        } else {
            i = LiveBroadcastUploadVideoImageHeightSetting.DEFAULT;
        }
        ActivityInfo activityInfo = packageManager.getActivityInfo(componentName, i);
        String str = activityInfo.parentActivityName;
        if (str != null) {
            return str;
        }
        Bundle bundle = activityInfo.metaData;
        if (bundle == null || (string = bundle.getString("android.support.PARENT_ACTIVITY")) == null) {
            return null;
        }
        if (string.charAt(0) == '.') {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append(context.getPackageName());
            LIZ.append(string);
            return X1D.LIZIZ(LIZ);
        }
        return string;
    }
}
