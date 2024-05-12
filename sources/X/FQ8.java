package X;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class FQ8 {
    public static final /* synthetic */ int LIZ = 0;

    public static final void LIZ(File file, File file2) {
        try {
            FileInputStream fileInputStream = new FileInputStream(file);
            String absolutePath = file2.getAbsolutePath();
            o.LJIIIIZZ(absolutePath, "destDir.absolutePath");
            C16880lQ.LJJLJ(fileInputStream, absolutePath);
            o.LJIIIIZZ(file2.getAbsolutePath(), "destDir.absolutePath");
        } catch (Exception e) {
            C78983UzD.LJIIZILJ(e);
            C16880lQ.LLLZZIL(file2);
            if (!(e instanceof IOException)) {
                throw new IOException("Error when decompressing zip file.", e);
            }
            throw e;
        }
    }
}
