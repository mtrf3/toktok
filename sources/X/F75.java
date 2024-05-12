package X;

import android.text.TextUtils;
import java.text.SimpleDateFormat;
import java.util.Date;

/* loaded from: classes7.dex */
public final class F75 {
    public static final SimpleDateFormat LJ = new SimpleDateFormat("HH:mm:ss.SSS");
    public final YSM LIZ;
    public final String LIZIZ;
    public final Date LIZJ = new Date();
    public final Object LIZLLL;

    public final String toString() {
        String str;
        String LIZIZ;
        StringBuilder LIZ = X1D.LIZ();
        try {
            str = LJ.format(this.LIZJ);
        } catch (Exception unused) {
            str = null;
        }
        LIZ.append(str);
        LIZ.append(" ");
        LIZ.append(this.LIZ.name().toLowerCase());
        if (TextUtils.isEmpty(this.LIZIZ)) {
            LIZIZ = "";
        } else {
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append(", extra='");
            LIZ2.append(this.LIZIZ);
            LIZIZ = X1D.LIZIZ(LIZ2);
        }
        LIZ.append(LIZIZ);
        return X1D.LIZIZ(LIZ);
    }

    public F75(YSM ysm, String str, Object obj) {
        this.LIZ = ysm;
        this.LIZIZ = str;
        this.LIZLLL = obj;
    }
}
