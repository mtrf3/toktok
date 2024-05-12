package X;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import java.util.List;

/* loaded from: classes12.dex */
public final class QY5 {
    public final Context LIZ;
    public String LIZIZ;
    public String LIZJ;
    public int LIZLLL;
    public int LJ;

    public final synchronized String LIZ() {
        if (this.LIZIZ == null) {
            LJ();
        }
        return this.LIZIZ;
    }

    public final synchronized String LIZIZ() {
        if (this.LIZJ == null) {
            LJ();
        }
        return this.LIZJ;
    }

    public final boolean LIZLLL() {
        synchronized (this) {
            if (this.LJ != 0) {
                return true;
            }
            PackageManager packageManager = this.LIZ.getPackageManager();
            if (packageManager.checkPermission("com.google.android.c2dm.permission.SEND", "com.google.android.gms") != -1) {
                if (!C44389HbV.LIZ()) {
                    Intent intent = new Intent("com.google.android.c2dm.intent.REGISTER");
                    intent.setPackage("com.google.android.gms");
                    List<ResolveInfo> queryIntentServices = packageManager.queryIntentServices(intent, 0);
                    if (queryIntentServices != null && queryIntentServices.size() > 0) {
                        this.LJ = 1;
                        return true;
                    }
                }
                Intent intent2 = new Intent("com.google.iid.TOKEN_REQUEST");
                intent2.setPackage("com.google.android.gms");
                List<ResolveInfo> queryBroadcastReceivers = packageManager.queryBroadcastReceivers(intent2, 0);
                if (queryBroadcastReceivers != null && queryBroadcastReceivers.size() > 0) {
                    this.LJ = 2;
                    return true;
                }
                if (C44389HbV.LIZ()) {
                    this.LJ = 2;
                } else {
                    this.LJ = 1;
                }
                int i = this.LJ;
                if (i != 0) {
                    return true;
                }
            }
            return false;
        }
    }

    public final synchronized void LJ() {
        try {
            PackageInfo LLLLLLZ = C16880lQ.LLLLLLZ(this.LIZ.getPackageManager(), this.LIZ.getPackageName(), 0);
            if (LLLLLLZ != null) {
                this.LIZIZ = Integer.toString(LLLLLLZ.versionCode);
                this.LIZJ = LLLLLLZ.versionName;
            }
        } catch (PackageManager.NameNotFoundException unused) {
        }
    }

    public QY5(Context context) {
        this.LIZ = context;
    }

    public static String LIZJ(C67195QYt c67195QYt) {
        c67195QYt.LIZ();
        String str = c67195QYt.LIZJ.LJ;
        if (str != null) {
            return str;
        }
        c67195QYt.LIZ();
        String str2 = c67195QYt.LIZJ.LIZIZ;
        if (!str2.startsWith("1:")) {
            return str2;
        }
        String[] split = str2.split(":");
        if (split.length < 2) {
            return null;
        }
        String str3 = split[1];
        if (str3.isEmpty()) {
            return null;
        }
        return str3;
    }
}
