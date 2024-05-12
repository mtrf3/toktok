package X;

import android.os.Build;

/* renamed from: X.Ene, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C37498Ene {
    public static final String LIZ;

    static {
        boolean z;
        StringBuilder sb = new StringBuilder("(Linux; Android ");
        sb.append(Build.VERSION.RELEASE);
        String str = Build.MODEL;
        if (!str.isEmpty() && "REL".equals(Build.VERSION.CODENAME)) {
            sb.append("; ");
            sb.append(str);
            z = true;
        } else {
            z = false;
        }
        if (!Build.ID.isEmpty()) {
            if (!z) {
                sb.append("; ");
            }
            sb.append(" Build/");
            sb.append(Build.ID);
        }
        sb.append(") Mobile PIA/2.3.0");
        LIZ = sb.toString();
    }
}
