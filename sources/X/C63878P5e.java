package X;

import java.io.File;

/* renamed from: X.P5e, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C63878P5e {
    public final String LIZ;

    public final String LIZ() {
        File file = new File(this.LIZ, "audio");
        if (!file.exists() && !file.mkdirs()) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("mkdirs failed, workspace path: ");
            LIZ.append(this.LIZ);
            P4Q.LIZJ("VEResManager", X1D.LIZIZ(LIZ));
            return "";
        }
        return file.getAbsolutePath();
    }

    public C63878P5e(String str) {
        this.LIZ = str;
    }

    public static String LIZIZ(String str, String str2) {
        File file = new File(str, str2);
        if (!file.exists() && !file.mkdirs()) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("mkdirs failed, workspace path: ");
            LIZ.append(str);
            P4Q.LIZJ("VEResManager", X1D.LIZIZ(LIZ));
            return "";
        }
        return file.getAbsolutePath();
    }
}
