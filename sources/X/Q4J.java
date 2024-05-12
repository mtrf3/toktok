package X;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import defpackage.a1;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;
import m43.u;

/* loaded from: classes12.dex */
public final class Q4J {
    public static final /* synthetic */ int LIZ = 0;

    static {
        new Q4J();
    }

    public static final void LJI() {
        if (u.LJII()) {
        } else {
            throw new Q4U("The SDK has not been initialized, make sure to call FacebookSdk.sdkInitialize() first.");
        }
    }

    public static final void LJ(Collection collection) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (it.next() == null) {
                throw new NullPointerException(a1.LJ("Container '", "requests", "' cannot contain null values"));
            }
        }
        if (!collection.isEmpty()) {
            return;
        }
        String LJ = a1.LJ("Container '", "requests", "' cannot be empty");
        LJ.toString();
        throw new IllegalArgumentException(LJ);
    }

    public static final void LIZ(Context context, boolean z) {
        o.LJIIIZ(context, "context");
        PackageManager packageManager = context.getPackageManager();
        if (packageManager != null) {
            try {
                if (packageManager.getActivityInfo(new ComponentName(context, "com.facebook.FacebookActivity"), 1) != null) {
                    return;
                }
            } catch (PackageManager.NameNotFoundException unused) {
            }
        }
        if (!z) {
            return;
        }
        "FacebookActivity is not declared in the AndroidManifest.xml. If you are using the facebook-common module or dependent modules please add com.facebook.FacebookActivity to your AndroidManifest.xml file. See https://developers.facebook.com/docs/android/getting-started for more info.".toString();
        throw new IllegalStateException("FacebookActivity is not declared in the AndroidManifest.xml. If you are using the facebook-common module or dependent modules please add com.facebook.FacebookActivity to your AndroidManifest.xml file. See https://developers.facebook.com/docs/android/getting-started for more info.");
    }

    public static final boolean LIZIZ(Context context, String redirectURI) {
        List<ResolveInfo> queryIntentActivities;
        o.LJIIIZ(redirectURI, "redirectURI");
        PackageManager packageManager = context.getPackageManager();
        if (packageManager == null) {
            return false;
        }
        Intent intent = new Intent();
        intent.setAction("android.intent.action.VIEW");
        intent.addCategory("android.intent.category.DEFAULT");
        intent.addCategory("android.intent.category.BROWSABLE");
        intent.setData(android.net.Uri.parse(redirectURI));
        C39519Ff9 LIZJ = new C03880Dg(2).LIZJ(101311, "android/content/pm/PackageManager", "queryIntentActivities", packageManager, new Object[]{intent, 64}, "java.util.List", new C65300Pk0(false, "(Landroid/content/Intent;I)Ljava/util/List;", "-662185194432282995"));
        if (LIZJ.LIZ) {
            queryIntentActivities = (List) LIZJ.LIZIZ;
        } else {
            queryIntentActivities = packageManager.queryIntentActivities(intent, 64);
        }
        if (queryIntentActivities == null) {
            return false;
        }
        Iterator<ResolveInfo> it = queryIntentActivities.iterator();
        boolean z = false;
        while (it.hasNext()) {
            ActivityInfo activityInfo = it.next().activityInfo;
            if (!o.LJ(activityInfo.name, "com.facebook.CustomTabActivity") || !o.LJ(activityInfo.packageName, context.getPackageName())) {
                return false;
            }
            z = true;
        }
        return z;
    }

    public static final void LIZJ(Context context, boolean z) {
        o.LJIIIZ(context, "context");
        if (context.checkCallingOrSelfPermission("android.permission.INTERNET") != -1 || (!z)) {
            return;
        }
        "No internet permissions granted for the app, please add <uses-permission android:name=\"android.permission.INTERNET\" /> to your AndroidManifest.xml.".toString();
        throw new IllegalStateException("No internet permissions granted for the app, please add <uses-permission android:name=\"android.permission.INTERNET\" /> to your AndroidManifest.xml.");
    }

    public static final void LIZLLL(String arg, String str) {
        o.LJIIIZ(arg, "arg");
        if (arg.length() > 0) {
            return;
        }
        String LJ = a1.LJ("Argument '", str, "' cannot be empty");
        LJ.toString();
        throw new IllegalArgumentException(LJ);
    }

    public static final void LJFF(String str, String str2) {
        if (str != null && str.length() > 0) {
            return;
        }
        String LJ = a1.LJ("Argument '", str2, "' cannot be null or empty");
        LJ.toString();
        throw new IllegalArgumentException(LJ);
    }
}
