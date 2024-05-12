package X;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/* renamed from: X.6az, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C163296az {
    public final String LIZ;
    public final SimpleDateFormat LIZIZ;

    public C163296az() {
        File file = new File(LIZIZ());
        if (!file.exists()) {
            file.mkdirs();
        }
        this.LIZ = file.getAbsolutePath();
        this.LIZIZ = new SimpleDateFormat("yyyyMMdd_HHmmss", Locale.getDefault());
    }

    public static String LIZIZ() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(C16880lQ.LLLLLLLLLL());
        LIZ.append("/DCIM/Camera/");
        return X1D.LIZIZ(LIZ);
    }

    public final String LIZ() {
        return C16880lQ.LLLZI(Locale.getDefault(), "%s/IMG_%s.png", new Object[]{this.LIZ, this.LIZIZ.format(new Date())});
    }
}
