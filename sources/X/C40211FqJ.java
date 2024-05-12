package X;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.ResolveInfo;
import android.os.Build;
import android.text.TextUtils;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.FqJ, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C40211FqJ {
    public static final List<Intent> LIZ = new ArrayList();

    public static Intent LIZ(Context context) {
        boolean z = false;
        try {
            String trim = C36843Ed5.LIZ("ro.miui.ui.version.name").trim();
            if (trim != null && !trim.isEmpty()) {
                if (CastIntegerProtector.valueOf(trim.substring(1)).intValue() >= 12) {
                    z = true;
                }
            }
        } catch (Exception e) {
            C16880lQ.LLLLIIL(e);
        }
        if (z) {
            return null;
        }
        Intent intent = new Intent("miui.intent.action.APP_PERM_EDITOR");
        intent.setComponent(new ComponentName("com.miui.securitycenter", "com.miui.permcenter.permissions.PermissionsEditorActivity"));
        intent.putExtra("extra_pkgname", context.getPackageName());
        return intent;
    }

    public static void LIZIZ(Context context) {
        Intent intent;
        ActivityInfo activityInfo;
        ActivityInfo activityInfo2;
        if (context == null) {
            return;
        }
        List<Intent> list = LIZ;
        ArrayList arrayList = (ArrayList) list;
        if (arrayList.size() == 0) {
            String packageName = context.getPackageName();
            Intent component = new Intent().setComponent(new ComponentName("com.coloros.safecenter", "com.coloros.safecenter.permission.PermissionManagerActivity"));
            component.putExtra("pkg_name", packageName);
            component.putExtra("app_name", context.getResources().getString(context.getApplicationInfo().labelRes));
            component.putExtra("class_name", C40211FqJ.class.getName());
            arrayList.add(component);
            Intent component2 = new Intent().setComponent(new ComponentName("com.coloros.safecenter", "com.coloros.safecenter.permission.PermissionAppAllPermissionActivity"));
            component2.putExtra("packageName", packageName);
            arrayList.add(component2);
            Intent component3 = new Intent().setComponent(new ComponentName("com.google.android.packageinstaller", "com.android.packageinstaller.permission.ui.ManagePermissionsActivity"));
            component3.putExtra("android.intent.extra.PACKAGE_NAME", packageName);
            arrayList.add(component3);
        }
        if (!C19N.LJ("open_perimission_page_strategy", false)) {
            try {
                String lowerCase = Build.MANUFACTURER.toLowerCase();
                if (TextUtils.equals(lowerCase, "oppo") && Build.VERSION.SDK_INT <= 23) {
                    Iterator it = ((ArrayList) list).iterator();
                    while (it.hasNext()) {
                        intent = (Intent) it.next();
                        if (intent != null) {
                            try {
                                ResolveInfo resolveActivity = context.getPackageManager().resolveActivity(intent, 1);
                                if (resolveActivity != null && (activityInfo2 = resolveActivity.activityInfo) != null && activityInfo2.exported) {
                                    intent.addFlags(268435456);
                                }
                            } catch (Exception unused) {
                                continue;
                            }
                        }
                    }
                } else if (TextUtils.equals(lowerCase, "xiaomi")) {
                    intent = LIZ(context);
                    if (intent != null) {
                    }
                } else if (TextUtils.equals(lowerCase, "meizu")) {
                    intent = new Intent("com.meizu.safe.security.SHOW_APPSEC");
                    intent.addCategory("android.intent.category.DEFAULT");
                    intent.putExtra("packageName", context.getPackageName());
                }
                ResolveInfo resolveActivity2 = context.getPackageManager().resolveActivity(intent, 1);
                if (resolveActivity2 != null && (activityInfo = resolveActivity2.activityInfo) != null && activityInfo.exported) {
                    C16880lQ.LIZJ(context, intent);
                    return;
                }
            } catch (Exception unused2) {
            }
        }
        try {
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("package:");
            LIZ2.append(context.getPackageName());
            Intent intent2 = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS", UriProtector.parse(X1D.LIZIZ(LIZ2)));
            intent2.addFlags(268435456);
            C16880lQ.LIZJ(context, intent2);
        } catch (Exception unused3) {
            if (0 != 0) {
                return;
            }
            try {
                Intent intent3 = new Intent("android.settings.APPLICATION_SETTINGS");
                intent3.addFlags(268435456);
                C16880lQ.LIZJ(context, intent3);
            } catch (Exception unused4) {
            }
        }
    }
}
