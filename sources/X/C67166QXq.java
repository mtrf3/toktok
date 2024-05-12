package X;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.os.Binder;
import android.os.Process;

/* renamed from: X.QXq, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C67166QXq {
    public final Context LIZ;

    public C67166QXq(Context context) {
        this.LIZ = context;
    }

    public final boolean LIZJ() {
        String nameForUid;
        if (Binder.getCallingUid() == Process.myUid()) {
            return C44384HbQ.LJLLL(this.LIZ);
        }
        if (C44389HbV.LIZ() && (nameForUid = this.LIZ.getPackageManager().getNameForUid(Binder.getCallingUid())) != null) {
            return this.LIZ.getPackageManager().isInstantApp(nameForUid);
        }
        return false;
    }

    public final ApplicationInfo LIZ(int i, String str) {
        return C16880lQ.LLLLLLLLL(this.LIZ.getPackageManager(), str, i);
    }

    public final PackageInfo LIZIZ(int i, String str) {
        return C16880lQ.LLLLLLZ(this.LIZ.getPackageManager(), str, i);
    }
}
