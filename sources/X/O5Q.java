package X;

import java.io.File;
import java.io.IOException;

/* loaded from: classes11.dex */
public final class O5Q {
    public final File LIZ;
    public String LIZIZ;
    public String LIZJ;

    public O5Q(File file) {
        this.LIZ = file;
    }

    public final File LIZ(File file, String str) {
        String message;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("res");
        File file2 = new File(file, JBR.LJFF(LIZ, File.separator, str, LIZ));
        if (file2.getCanonicalPath().startsWith(file.getCanonicalPath())) {
            if (file2.exists()) {
                try {
                    try {
                        C61467OAl.LIZ(file2);
                    } catch (Throwable th) {
                        message = th.getMessage();
                        OD6.LJII(11, C16880lQ.LLLZ("last modify time: %d", new Object[]{Long.valueOf(file2.lastModified())}), C16880lQ.LLLZ("path:%s, length: %d, md5:%s", new Object[]{str, Long.valueOf(file2.length()), message}), this.LIZIZ, this.LIZJ, 1101);
                        C61467OAl.LIZLLL(file);
                        throw new IOException("file was broken");
                    }
                } catch (Throwable unused) {
                    message = C61327O5b.LIZJ(file2);
                    OD6.LJII(11, C16880lQ.LLLZ("last modify time: %d", new Object[]{Long.valueOf(file2.lastModified())}), C16880lQ.LLLZ("path:%s, length: %d, md5:%s", new Object[]{str, Long.valueOf(file2.length()), message}), this.LIZIZ, this.LIZJ, 1101);
                    C61467OAl.LIZLLL(file);
                    throw new IOException("file was broken");
                }
            }
            return file2.getCanonicalFile();
        }
        throw new IOException("file not found");
    }
}
