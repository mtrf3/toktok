package X;

import java.io.File;
import java.io.FileOutputStream;
import java.nio.channels.FileLock;
import kotlin.jvm.internal.o;

/* renamed from: X.PMo, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C64330PMo {
    public static volatile FileLock LIZ;
    public static File LIZIZ;
    public static File LIZJ;
    public static final C64330PMo LIZLLL = new C64330PMo();

    public static void LIZ() {
        File[] listFiles;
        File file = LIZIZ;
        if (file != null && (listFiles = file.listFiles()) != null) {
            for (File file2 : listFiles) {
                try {
                    if (!o.LJ(file2, LIZJ)) {
                        FileLock tryLock = new FileOutputStream(file2).getChannel().tryLock();
                        if (tryLock != null) {
                            try {
                                tryLock.release();
                                C3C5.m7constructorimpl(C76800UCe.LIZ);
                            } catch (Throwable th) {
                                C3C5.m7constructorimpl(C141335gf.LIZ(th));
                            }
                            C16880lQ.LLLZZIL(file2);
                        }
                        C3C5.m7constructorimpl(C76800UCe.LIZ);
                    }
                } catch (Throwable th2) {
                    C3C5.m7constructorimpl(C141335gf.LIZ(th2));
                }
            }
        }
    }
}
