package X;

import android.text.TextUtils;
import defpackage.b1;
import java.io.File;

/* renamed from: X.5Sv, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C135335Sv {
    public static final /* synthetic */ int LIZ = 0;

    public static final void LIZ(String str, String str2) {
        if (TextUtils.isEmpty(str2)) {
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("  logFile is null :");
            LIZ2.append(str);
            C170666ms.LIZIZ(X1D.LIZIZ(LIZ2));
            return;
        }
        File file = new File(str2);
        StringBuilder LIZJ = b1.LIZJ(str, "   filePath:");
        LIZJ.append(file.getAbsolutePath());
        LIZJ.append("         exist:");
        LIZJ.append(file.exists());
        LIZJ.append("        fileSize:");
        LIZJ.append(file.length());
        C170666ms.LIZIZ(X1D.LIZIZ(LIZJ));
    }
}
