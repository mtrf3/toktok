package X;

import android.app.AppOpsManager;
import android.content.ActivityNotFoundException;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.os.Binder;
import android.os.Build;
import android.os.Process;
import android.provider.Settings;
import com.bytedance.android.livesdkapi.host.IHostAppContext;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.List;

/* renamed from: X.FqI, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C40210FqI {
    public static final String LIZ = C16880lQ.LJLLILLLL(C40210FqI.class);

    public static String LIZJ() {
        return ((IHostAppContext) CN1.LIZ(IHostAppContext.class)).context().getPackageName();
    }

    public static boolean LIZ(ActivityC45651qj activityC45651qj) {
        String str = Build.MANUFACTURER;
        str.getClass();
        if (!str.equals("Xiaomi")) {
            return true;
        }
        try {
            AppOpsManager appOpsManager = (AppOpsManager) C16880lQ.LLILL(activityC45651qj, "appops");
            Class<?> cls = appOpsManager.getClass();
            Class<?> cls2 = Integer.TYPE;
            if (((Integer) cls.getMethod("checkOpNoThrow", cls2, cls2, String.class).invoke(appOpsManager, 10021, Integer.valueOf(Process.myUid()), activityC45651qj.getPackageName())).intValue() == 0) {
                return true;
            }
            return false;
        } catch (Exception e) {
            C0NB.LJFF(LIZ, "not support", e);
            return true;
        }
    }

    public static void LIZLLL(Context context) {
        Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
        intent.setData(android.net.Uri.fromParts("package", context.getPackageName(), null));
        intent.putExtra("pns.sandbox.dataflow_id", 1207965697L);
        try {
            if (LJFF(context, intent)) {
                C16880lQ.LIZJ(context, intent);
            }
        } catch (Exception e) {
            C0NB.LIZLLL(e.getMessage());
        }
    }

    public static boolean LJ(Context context) {
        if (Build.VERSION.SDK_INT >= 23) {
            try {
                return Settings.canDrawOverlays(context);
            } catch (Exception unused) {
                return false;
            }
        }
        try {
            AppOpsManager appOpsManager = (AppOpsManager) C16880lQ.LLILL(context, "appops");
            Class cls = Integer.TYPE;
            if (((Integer) AppOpsManager.class.getMethod("checkOp", cls, cls, String.class).invoke(appOpsManager, 24, Integer.valueOf(Binder.getCallingUid()), C16880lQ.LLLLL(context).getPackageName())).intValue() != 0) {
                return false;
            }
            return true;
        } catch (Exception unused2) {
            return false;
        }
    }

    public static void LJI(Context context) {
        String str = Build.MANUFACTURER;
        String LJLLILLLL = C16880lQ.LJLLILLLL(C40210FqI.class);
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("jumpPermissionPage --- name : ");
        LIZ2.append(str);
        C0NB.LJ(LJLLILLLL, X1D.LIZIZ(LIZ2));
        str.getClass();
        char c = 65535;
        switch (str.hashCode()) {
            case -1678088054:
                if (str.equals("Coolpad")) {
                    c = 0;
                    break;
                }
                break;
            case -1675632421:
                if (str.equals("Xiaomi")) {
                    c = 1;
                    break;
                }
                break;
            case 2427:
                if (str.equals("LG")) {
                    c = 2;
                    break;
                }
                break;
            case 2432928:
                if (str.equals("OPPO")) {
                    c = 3;
                    break;
                }
                break;
            case 2582855:
                if (str.equals("Sony")) {
                    c = 4;
                    break;
                }
                break;
            case 3620012:
                if (str.equals("vivo")) {
                    c = 5;
                    break;
                }
                break;
            case 74224812:
                if (str.equals("Meizu")) {
                    c = 6;
                    break;
                }
                break;
            case 1864941562:
                if (str.equals("samsung")) {
                    c = 7;
                    break;
                }
                break;
            case 2141820391:
                if (str.equals("HUAWEI")) {
                    c = '\b';
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
                LIZIZ(context, "com.yulong.android.security:remote");
                return;
            case 1:
                String LJJII = C86793Y4n.LJJII("ro.miui.ui.version.name");
                String str2 = LIZ;
                StringBuilder LIZ3 = X1D.LIZ();
                LIZ3.append("goMiaoMiMainager --- rom : ");
                LIZ3.append(LJJII);
                C0NB.LJ(str2, X1D.LIZIZ(LIZ3));
                Intent intent = new Intent();
                if ("V6".equals(LJJII) || "V7".equals(LJJII)) {
                    intent.setAction("miui.intent.action.APP_PERM_EDITOR");
                    intent.setClassName("com.miui.securitycenter", "com.miui.permcenter.permissions.AppPermissionsEditorActivity");
                    intent.putExtra("extra_pkgname", LIZJ());
                } else if ("V8".equals(LJJII) || "V9".equals(LJJII) || "V10".equals(LJJII)) {
                    intent.setAction("miui.intent.action.APP_PERM_EDITOR");
                    intent.setClassName("com.miui.securitycenter", "com.miui.permcenter.permissions.PermissionsEditorActivity");
                    intent.putExtra("extra_pkgname", LIZJ());
                } else {
                    LIZLLL(context);
                    return;
                }
                if (!LJFF(context, intent)) {
                    return;
                }
                intent.putExtra("pns.sandbox.dataflow_id", 1207965697L);
                C16880lQ.LIZJ(context, intent);
                return;
            case 2:
                try {
                    Intent intent2 = new Intent(LIZJ());
                    intent2.setComponent(new ComponentName("com.android.settings", "com.android.settings.Settings$AccessLockSummaryActivity"));
                    if (LJFF(context, intent2)) {
                        intent2.putExtra("pns.sandbox.dataflow_id", 1207965697L);
                        C16880lQ.LIZJ(context, intent2);
                    } else {
                        LIZLLL(context);
                    }
                    return;
                } catch (Exception unused) {
                    LIZLLL(context);
                    return;
                }
            case 3:
                LIZIZ(context, "com.coloros.safecenter");
                return;
            case 4:
                try {
                    Intent intent3 = new Intent(LIZJ());
                    intent3.setComponent(new ComponentName("com.sonymobile.cta", "com.sonymobile.cta.SomcCTAMainActivity"));
                    if (LJFF(context, intent3)) {
                        intent3.putExtra("pns.sandbox.dataflow_id", 1207965697L);
                        C16880lQ.LIZJ(context, intent3);
                    } else {
                        LIZLLL(context);
                    }
                    return;
                } catch (Exception e) {
                    C0NB.LJFF(LIZ, "goSonyMainager: ", e);
                    LIZLLL(context);
                    return;
                }
            case 5:
                LIZIZ(context, "com.bairenkeji.icaller");
                return;
            case 6:
                try {
                    Intent intent4 = new Intent("com.meizu.safe.security.SHOW_APPSEC");
                    intent4.addCategory("android.intent.category.DEFAULT");
                    intent4.putExtra("packageName", LIZJ());
                    if (LJFF(context, intent4)) {
                        intent4.putExtra("pns.sandbox.dataflow_id", 1207965697L);
                        C16880lQ.LIZJ(context, intent4);
                    } else {
                        LIZLLL(context);
                    }
                    return;
                } catch (ActivityNotFoundException e2) {
                    C0NB.LIZLLL(e2.getMessage());
                    LIZLLL(context);
                    return;
                }
            case 7:
                LIZLLL(context);
                return;
            case '\b':
                try {
                    Intent intent5 = new Intent(LIZJ());
                    intent5.setFlags(268435456);
                    intent5.setComponent(new ComponentName("com.huawei.systemmanager", "com.huawei.permissionmanager.ui.MainActivity"));
                    if (LJFF(context, intent5)) {
                        intent5.putExtra("pns.sandbox.dataflow_id", 1207965697L);
                        C16880lQ.LIZJ(context, intent5);
                    } else {
                        LIZLLL(context);
                    }
                    return;
                } catch (Exception unused2) {
                    LIZLLL(context);
                    return;
                }
            default:
                LIZLLL(context);
                return;
        }
    }

    public static void LIZIZ(Context context, String str) {
        PackageInfo LLLLLLZ;
        List<ResolveInfo> queryIntentActivities;
        try {
            LLLLLLZ = C16880lQ.LLLLLLZ(context.getPackageManager(), str, 0);
        } catch (PackageManager.NameNotFoundException e) {
            C0NB.LJFF(LIZ, "doStartApplicationWithPackageName: ", e);
        }
        if (LLLLLLZ != null) {
            Intent intent = new Intent("android.intent.action.MAIN", (android.net.Uri) null);
            intent.addCategory("android.intent.category.LAUNCHER");
            intent.setPackage(LLLLLLZ.packageName);
            PackageManager packageManager = context.getPackageManager();
            C39519Ff9 LIZJ = new C03880Dg(2).LIZJ(101311, "android/content/pm/PackageManager", "queryIntentActivities", packageManager, new Object[]{intent, 0}, "java.util.List", new C65300Pk0(false, "(Landroid/content/Intent;I)Ljava/util/List;", "-6536612472209025817"));
            if (LIZJ.LIZ) {
                queryIntentActivities = (List) LIZJ.LIZIZ;
            } else {
                queryIntentActivities = packageManager.queryIntentActivities(intent, 0);
            }
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("resolveinfoList");
            LIZ2.append(queryIntentActivities.size());
            C0NB.LJ("PermissionPageManager", X1D.LIZIZ(LIZ2));
            for (int i = 0; i < queryIntentActivities.size(); i++) {
                StringBuilder LIZ3 = X1D.LIZ();
                LIZ3.append(((ResolveInfo) ListProtector.get(queryIntentActivities, i)).activityInfo.packageName);
                LIZ3.append(((ResolveInfo) ListProtector.get(queryIntentActivities, i)).activityInfo.name);
                C0NB.LJ("PermissionPageManager", X1D.LIZIZ(LIZ3));
            }
            try {
                ResolveInfo next = queryIntentActivities.iterator().next();
                if (next != null) {
                    ActivityInfo activityInfo = next.activityInfo;
                    String str2 = activityInfo.packageName;
                    String str3 = activityInfo.name;
                    Intent intent2 = new Intent("android.intent.action.MAIN");
                    intent2.addCategory("android.intent.category.LAUNCHER");
                    intent2.setComponent(new ComponentName(str2, str3));
                    intent2.putExtra("pns.sandbox.dataflow_id", 1207965697L);
                    C16880lQ.LIZJ(context, intent2);
                    return;
                }
                return;
            } catch (Exception e2) {
                LIZLLL(context);
                C0NB.LJFF(LIZ, "doStartApplicationWithPackageName: ", e2);
                return;
            }
        }
        LIZLLL(context);
    }

    public static boolean LJFF(Context context, Intent intent) {
        if (context != null) {
            try {
                if (context.getPackageManager().resolveActivity(intent, 0) == null) {
                    return false;
                }
                return true;
            } catch (Exception e) {
                C0NB.LIZLLL(e.getMessage());
            }
        }
        return false;
    }

    public static void LJII(Context context, String str) {
        Intent intent = new Intent(str);
        intent.setData(android.net.Uri.fromParts("package", context.getPackageName(), null));
        try {
            if (LJFF(context, intent)) {
                intent.putExtra("pns.sandbox.dataflow_id", 1207965697L);
                C16880lQ.LIZJ(context, intent);
            }
        } catch (Exception e) {
            C0NB.LIZLLL(e.getMessage());
        }
    }
}
