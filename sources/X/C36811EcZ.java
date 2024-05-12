package X;

import defpackage.i0;
import java.io.File;

/* renamed from: X.EcZ, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C36811EcZ {
    public static File LIZ() {
        File file = new File(i0.LJFF(C16880lQ.LLIIJI(EF7.LIZIZ(), null).getPath(), "/aweme_monitor"));
        if (!file.exists()) {
            file.mkdir();
        }
        return file;
    }

    public static File LIZIZ() {
        File file = new File(i0.LJFF(C16880lQ.LLIIJLIL(EF7.LIZIZ()).getAbsolutePath(), "/aweme_monitor"));
        if (!file.exists()) {
            file.mkdir();
        }
        return file;
    }
}
