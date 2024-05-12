package X;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import java.util.List;

/* loaded from: classes12.dex */
public final class QY7 {
    public final Context LIZ;
    public int LIZIZ;
    public int LIZJ;

    public QY7(Context context) {
        this.LIZ = context;
    }

    public final synchronized int LIZ() {
        int i = this.LIZJ;
        if (i != 0) {
            return i;
        }
        PackageManager packageManager = this.LIZ.getPackageManager();
        if (QCX.LIZ(this.LIZ).LIZ.getPackageManager().checkPermission("com.google.android.c2dm.permission.SEND", "com.google.android.gms") == -1) {
            return 0;
        }
        int i2 = 1;
        if (!C44389HbV.LIZ()) {
            Intent intent = new Intent("com.google.android.c2dm.intent.REGISTER");
            intent.setPackage("com.google.android.gms");
            List<ResolveInfo> queryIntentServices = packageManager.queryIntentServices(intent, 0);
            if (queryIntentServices != null && queryIntentServices.size() > 0) {
                this.LIZJ = 1;
                return 1;
            }
        }
        Intent intent2 = new Intent("com.google.iid.TOKEN_REQUEST");
        intent2.setPackage("com.google.android.gms");
        List<ResolveInfo> queryBroadcastReceivers = packageManager.queryBroadcastReceivers(intent2, 0);
        if (queryBroadcastReceivers == null || queryBroadcastReceivers.size() <= 0) {
            if (C44389HbV.LIZ()) {
                this.LIZJ = 2;
                i2 = 2;
            } else {
                this.LIZJ = 1;
            }
            return i2;
        }
        this.LIZJ = 2;
        return 2;
    }
}
