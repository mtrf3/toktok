package X;

import java.io.File;
import kotlin.jvm.internal.o;

/* renamed from: X.aZN, reason: case insensitive filesystem */
/* loaded from: classes34.dex */
public final class C93965aZN {
    public static String LIZ;
    public static String LIZIZ;
    public static String LIZJ;
    public static String LIZLLL;
    public static String LJ;
    public static String LJFF;
    public static String LJI;

    public static String LIZ() {
        String str = LIZLLL;
        if (str != null) {
            return str;
        }
        o.LJIJI("DRAFT_EXPORT_PATH_TEMP");
        throw null;
    }

    public static String LIZIZ(String pathAppend, String subPath) {
        o.LJIIIZ(pathAppend, "$this$pathAppend");
        o.LJIIIZ(subPath, "subPath");
        String str = File.separator;
        o.LJIIIIZZ(str, "File.separator");
        if (ujb.o.LJJJJ(pathAppend, str, false) && ujb.o.LJJJLIIL(subPath, str, false)) {
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append(pathAppend);
            String substring = subPath.substring(str.length());
            o.LJIIIIZZ(substring, "(this as java.lang.String).substring(startIndex)");
            LIZ2.append(substring);
            return X1D.LIZIZ(LIZ2);
        }
        if (!ujb.o.LJJJJ(pathAppend, str, false) && !ujb.o.LJJJLIIL(subPath, str, false)) {
            StringBuilder LIZ3 = X1D.LIZ();
            LIZ3.append(pathAppend);
            LIZ3.append(str);
            LIZ3.append(subPath);
            return X1D.LIZIZ(LIZ3);
        }
        StringBuilder LIZ4 = X1D.LIZ();
        LIZ4.append(pathAppend);
        LIZ4.append(subPath);
        return X1D.LIZIZ(LIZ4);
    }
}
