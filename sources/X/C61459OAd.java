package X;

import com.bytedance.geckox.buffer.impl.MMapBuffer;
import java.io.File;
import java.io.IOException;

/* renamed from: X.OAd, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C61459OAd {
    public static OEF LIZ(C61276O3c c61276O3c, File file, long j) {
        OEF LIZIZ = LIZIZ(c61276O3c, file, j, null);
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("buffer type:");
        LIZ.append(LIZIZ.getClass());
        OC6.LIZ("gecko-debug-tag", X1D.LIZIZ(LIZ));
        return LIZIZ;
    }

    public static OEF LIZIZ(C61276O3c c61276O3c, File file, long j, String str) {
        if (j <= 0) {
            try {
                return new C40923G4h(file, str);
            } catch (Exception e) {
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("create FileBuffer failed! file:");
                LIZ.append(file.getAbsolutePath());
                LIZ.append(" caused by:");
                LIZ.append(e.getMessage());
                throw new IOException(X1D.LIZIZ(LIZ), e);
            }
        }
        if (c61276O3c.LJIILJJIL) {
            try {
                return new MMapBuffer(str, file, j);
            } catch (Exception e2) {
                OC6.LJ("gecko-debug-tag", "mmap failed:", e2);
            }
        }
        try {
            return new C40924G4i(str, file, j);
        } catch (Exception e3) {
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("create random access file failed! file:");
            LIZ2.append(file.getAbsolutePath());
            LIZ2.append(" caused by:");
            LIZ2.append(e3.getMessage());
            throw new RuntimeException(X1D.LIZIZ(LIZ2), e3);
        }
    }
}
