package X;

import android.text.TextUtils;
import java.io.IOException;
import java.util.Arrays;
import kotlin.jvm.internal.o;

/* renamed from: X.5yE, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C152225yE {
    public static int LIZ(String filepath) {
        C0MW LJ;
        o.LJIIIZ(filepath, "filepath");
        if (TextUtils.isEmpty(filepath)) {
            C131935Ft.LIZIZ("ExifUtils", "filepath is null or nil");
            return 0;
        }
        if (!F9B.LIZ(filepath)) {
            String LLLZ = C16880lQ.LLLZ("file not exist:[%s]", Arrays.copyOf(new Object[]{filepath}, 1));
            o.LJIIIIZZ(LLLZ, "format(format, *args)");
            C131935Ft.LIZIZ("ExifUtils", LLLZ);
            return 0;
        }
        try {
            C0MZ c0mz = new C0MZ(filepath);
            int i = -1;
            if (c0mz == null || (LJ = c0mz.LJ("Orientation")) == null) {
                return 0;
            }
            try {
                i = LJ.LJII(c0mz.LJ);
            } catch (NumberFormatException unused) {
            }
            if (i != 3) {
                if (i != 6) {
                    if (i != 8) {
                        return 0;
                    }
                    return 270;
                }
                return 90;
            }
            return 180;
        } catch (IOException e) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("cannot read exif ");
            LIZ.append(e);
            C131935Ft.LIZLLL("ExifUtils", X1D.LIZIZ(LIZ));
            return 0;
        }
    }
}
