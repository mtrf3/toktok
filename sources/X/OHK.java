package X;

import android.app.Activity;
import android.os.Build;
import android.os.Environment;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes11.dex */
public final class OHK implements OHO {
    @Override // X.OHO
    public final String LIZLLL() {
        return "android.permission.MANAGE_EXTERNAL_STORAGE";
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0041, code lost:
    
        if (r3 >= 30) goto L4;
     */
    @Override // X.OHO
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.content.Intent LIZ(android.content.Context r5) {
        /*
            r4 = this;
            java.lang.String r0 = "context"
            kotlin.jvm.internal.o.LJIIIZ(r5, r0)
            X.OHI r0 = X.OHI.LIZ
            r0.getClass()
            int r3 = android.os.Build.VERSION.SDK_INT
            r1 = 30
            if (r3 < r1) goto L3d
        L10:
            android.content.Intent r2 = new android.content.Intent
            java.lang.String r0 = "android.settings.MANAGE_APP_ALL_FILES_ACCESS_PERMISSION"
            r2.<init>(r0)
            java.lang.StringBuilder r1 = X.X1D.LIZ()
            java.lang.String r0 = "package:"
            r1.append(r0)
            java.lang.String r0 = r5.getPackageName()
            r1.append(r0)
            java.lang.String r0 = X.X1D.LIZIZ(r1)
            android.net.Uri r0 = com.bytedance.mt.protector.impl.UriProtector.parse(r0)
            r2.setData(r0)
            boolean r0 = X.OHI.LIZ(r5, r2)
            if (r0 != 0) goto L3c
        L38:
            android.content.Intent r2 = X.OHI.LIZIZ(r5)
        L3c:
            return r2
        L3d:
            r0 = 0
            r2 = 0
            if (r0 == 0) goto L3c
            if (r3 < r1) goto L38
            goto L10
        */
        throw new UnsupportedOperationException("Method not decompiled: X.OHK.LIZ(android.content.Context):android.content.Intent");
    }

    @Override // X.OHO
    public final boolean LIZIZ(Activity context) {
        o.LJIIIZ(context, "context");
        OHI.LIZ.getClass();
        if (Build.VERSION.SDK_INT >= 30) {
            return Environment.isExternalStorageManager();
        }
        List<String> LJJZZIII = ORY.LJJZZIII(new String[]{"android.permission.READ_EXTERNAL_STORAGE", "android.permission.WRITE_EXTERNAL_STORAGE"});
        if (!OHI.LIZLLL()) {
            return true;
        }
        for (String str : LJJZZIII) {
            if (str != null) {
                OHI.LIZ.getClass();
                if (!OHI.LJ(context, str)) {
                    return false;
                }
            }
        }
        return true;
    }

    @Override // X.OHO
    public final boolean LIZJ(Activity context) {
        o.LJIIIZ(context, "context");
        return OHP.LIZ(this, context);
    }
}
