package X;

import android.app.AppOpsManager;
import android.app.Notification;
import android.app.NotificationManager;
import android.content.ContentResolver;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.os.Build;
import android.os.Bundle;
import android.provider.Settings;
import java.lang.reflect.InvocationTargetException;
import java.util.HashSet;

/* renamed from: X.078, reason: invalid class name */
/* loaded from: classes.dex */
public final class AnonymousClass078 {
    public static String LIZLLL;
    public static AnonymousClass076 LJI;
    public final Context LIZ;
    public final NotificationManager LIZIZ;
    public static final Object LIZJ = new Object();
    public static java.util.Set<String> LJ = new HashSet();
    public static final Object LJFF = new Object();

    public static String LIZ(ContentResolver contentResolver) {
        C03880Dg c03880Dg = new C03880Dg(2);
        Object[] objArr = {contentResolver, "enabled_notification_listeners"};
        C65300Pk0 c65300Pk0 = new C65300Pk0(false, "(Landroid/content/ContentResolver;Ljava/lang/String;)Ljava/lang/String;", "-3152964045519955636");
        C39519Ff9 LIZJ2 = c03880Dg.LIZJ(102004, "android/provider/Settings$Secure", "getString", Settings.Secure.class, objArr, "java.lang.String", c65300Pk0);
        if (LIZJ2.LIZ) {
            c03880Dg.LIZIZ(102004, "android/provider/Settings$Secure", "getString", null, objArr, Settings.Secure.class, c65300Pk0, false);
            return (String) LIZJ2.LIZIZ;
        }
        String string = Settings.Secure.getString(contentResolver, "enabled_notification_listeners");
        c03880Dg.LIZIZ(102004, "android/provider/Settings$Secure", "getString", string, objArr, Settings.Secure.class, c65300Pk0, true);
        return string;
    }

    public final boolean LIZIZ() {
        if (Build.VERSION.SDK_INT >= 24) {
            return this.LIZIZ.areNotificationsEnabled();
        }
        Object LLILL = C16880lQ.LLILL(this.LIZ, "appops");
        ApplicationInfo applicationInfo = this.LIZ.getApplicationInfo();
        String packageName = C16880lQ.LLLLL(this.LIZ).getPackageName();
        int i = applicationInfo.uid;
        try {
            Class<?> cls = Class.forName(AppOpsManager.class.getName());
            Class<?> cls2 = Integer.TYPE;
            if (((Integer) cls.getMethod("checkOpNoThrow", cls2, cls2, String.class).invoke(LLILL, Integer.valueOf(((Integer) cls.getDeclaredField("OP_POST_NOTIFICATION").get(Integer.class)).intValue()), Integer.valueOf(i), packageName)).intValue() == 0) {
                return true;
            }
            return false;
        } catch (ClassNotFoundException | IllegalAccessException | NoSuchFieldException | NoSuchMethodException | RuntimeException | InvocationTargetException unused) {
            return true;
        }
    }

    public AnonymousClass078(Context context) {
        this.LIZ = context;
        this.LIZIZ = (NotificationManager) C16880lQ.LLILL(context, "notification");
    }

    public final void LIZJ(int i, String str) {
        this.LIZIZ.cancel(str, i);
    }

    public final void LIZLLL(final int i, final Notification notification) {
        boolean z;
        Bundle bundle = notification.extras;
        if (bundle != null && bundle.getBoolean("android.support.useSideChannel")) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            final String packageName = this.LIZ.getPackageName();
            AnonymousClass077 anonymousClass077 = new AnonymousClass077(i, notification, packageName) { // from class: X.1Aa
                public final String LIZ;
                public final int LIZIZ;
                public final String LIZJ = null;
                public final Notification LIZLLL;

                public final String toString() {
                    StringBuilder sb = new StringBuilder("NotifyTask[packageName:");
                    sb.append(this.LIZ);
                    sb.append(", id:");
                    sb.append(this.LIZIZ);
                    sb.append(", tag:");
                    return AnonymousClass073.LIZIZ(sb, this.LIZJ, "]");
                }

                @Override // X.AnonymousClass077
                public final void LIZ(InterfaceC12990f9 interfaceC12990f9) {
                    String str = this.LIZ;
                    interfaceC12990f9.x0(this.LIZIZ, this.LIZLLL, str, this.LIZJ);
                }

                {
                    this.LIZ = packageName;
                    this.LIZIZ = i;
                    this.LIZLLL = notification;
                }
            };
            synchronized (LJFF) {
                if (LJI == null) {
                    LJI = new AnonymousClass076(C16880lQ.LLLLL(this.LIZ));
                }
                LJI.LJLILLLLZI.obtainMessage(0, anonymousClass077).sendToTarget();
            }
            this.LIZIZ.cancel(null, i);
            return;
        }
        this.LIZIZ.notify(null, i, notification);
    }
}
