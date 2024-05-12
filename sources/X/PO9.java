package X;

import java.io.File;
import kotlin.jvm.internal.o;

/* loaded from: classes12.dex */
public final class PO9 {
    public static long LIZ(String path) {
        o.LJIIIZ(path, "path");
        try {
            return new File(path).length();
        } catch (Exception e) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("Download Music, getFileSize fail ");
            LIZ.append(e.getMessage());
            String msg = X1D.LIZIZ(LIZ);
            o.LJIIIZ(msg, "msg");
            C36922EeM.LIZLLL(6, "Music", msg);
            return -1L;
        }
    }
}
