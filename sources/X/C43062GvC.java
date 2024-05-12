package X;

import java.io.File;
import java.io.FileFilter;
import kotlin.jvm.internal.o;

/* renamed from: X.GvC, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C43062GvC implements FileFilter {
    public static final C43062GvC LIZ = new C43062GvC();

    @Override // java.io.FileFilter
    public final boolean accept(File file) {
        if (file == null || !file.exists() || file.getName() == null) {
            return false;
        }
        String name = file.getName();
        o.LJIIIIZZ(name, "pathname.name");
        if (!ujb.o.LJJJJ(name, "-mix-concat-a", false)) {
            return false;
        }
        return true;
    }
}
