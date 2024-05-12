package X;

import android.app.AppOpsManager;
import android.app.NotificationManager;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.os.Build;
import android.text.TextUtils;
import android.util.Pair;
import com.bytedance.common.utility.reflect.Reflect;
import com.bytedance.mt.protector.impl.string2number.CastLongProtector;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* renamed from: X.EeT, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C36929EeT {
    public static Boolean LIZ;
    public static long LIZIZ;
    public static long LIZJ;
    public static boolean LIZLLL;
    public static boolean LJ;

    public static long LIZLLL() {
        String str;
        long j = LIZIZ;
        if (j == 0) {
            if (C36930EeU.LIZIZ == null) {
                synchronized (C36930EeU.class) {
                    if (C36930EeU.LIZIZ == null) {
                        C36930EeU.LIZIZ = new C36930EeU();
                    }
                }
            }
            C36930EeU c36930EeU = C36930EeU.LIZIZ;
            c36930EeU.getClass();
            try {
                Object LIZ2 = c36930EeU.LIZ();
                str = (String) LIZ2.getClass().getMethod("get", String.class).invoke(LIZ2, "log.tag.push.timestamp");
            } catch (IllegalArgumentException e) {
                throw e;
            } catch (Throwable unused) {
                str = "";
            }
            if (TextUtils.isEmpty(str)) {
                LIZIZ = -1L;
            } else {
                try {
                    LIZIZ = CastLongProtector.parseLong(str);
                } catch (Throwable unused2) {
                    LIZIZ = -1L;
                }
                LIZJ = System.currentTimeMillis();
                return LIZIZ;
            }
        } else if (j != -1) {
            return (System.currentTimeMillis() - LIZJ) + j;
        }
        return System.currentTimeMillis();
    }

    public static int LIZJ(Context context) {
        if (context == null) {
            return -1;
        }
        if (Build.VERSION.SDK_INT >= 24) {
            try {
                return ((Boolean) Reflect.on((NotificationManager) C16880lQ.LLILL(context, "notification")).call("areNotificationsEnabled").get()).booleanValue() ? 1 : 0;
            } catch (Exception e) {
                C16880lQ.LLLLIIL(e);
            }
        }
        try {
            AppOpsManager appOpsManager = (AppOpsManager) C16880lQ.LLILL(context, "appops");
            ApplicationInfo applicationInfo = context.getApplicationInfo();
            String packageName = C16880lQ.LLLLL(context).getPackageName();
            int i = applicationInfo.uid;
            Reflect on = Reflect.on(appOpsManager);
            Class<?> cls = Integer.TYPE;
            if (((Integer) on.call("checkOpNoThrow", new Class[]{cls, cls, String.class}, Integer.valueOf(((Integer) on.field("OP_POST_NOTIFICATION", cls).get()).intValue()), Integer.valueOf(i), packageName).get()).intValue() == 0) {
                return 1;
            }
            return 0;
        } catch (Throwable unused) {
            return -1;
        }
    }

    public static boolean LJ(String str) {
        String str2;
        if (TextUtils.isEmpty(str)) {
            str = EXC.LIZ().LIZIZ("ro.build.version.emui");
        }
        if (!TextUtils.isEmpty(str) && str.toLowerCase().startsWith("emotionui")) {
            return true;
        }
        try {
            str2 = Build.BRAND;
        } catch (Throwable unused) {
        }
        if (C38354F3m.LJ(str2) || !str2.toLowerCase().startsWith("huawei")) {
            String str3 = Build.MANUFACTURER;
            if (!C38354F3m.LJ(str3)) {
                if (str3.toLowerCase().startsWith("huawei")) {
                }
            }
            return false;
        }
        return true;
    }

    public static boolean LJFF(Context context) {
        Boolean bool = LIZ;
        if (bool != null) {
            return bool.booleanValue();
        }
        String LIZ2 = FCD.LIZ(context);
        boolean z = false;
        if (LIZ2 != null) {
            if (LIZ2.contains(":")) {
                return false;
            }
            if (LIZ2.equals(context.getPackageName())) {
                z = true;
            }
        }
        Boolean valueOf = Boolean.valueOf(z);
        LIZ = valueOf;
        return valueOf.booleanValue();
    }

    public static String LIZ(String str, List<Pair<String, String>> list) {
        StringBuilder sb = new StringBuilder(str);
        if (str.indexOf(63) < 0) {
            sb.append("?");
        } else {
            sb.append("&");
        }
        sb.append(C48189Ivh.LIZJ(list));
        return sb.toString();
    }

    public static String LIZIZ(String str, java.util.Map<String, String> map) {
        ArrayList arrayList = new ArrayList();
        if (map != null) {
            for (Map.Entry<String, String> entry : map.entrySet()) {
                arrayList.add(new Pair(entry.getKey(), entry.getValue()));
            }
        }
        return LIZ(str, arrayList);
    }
}
