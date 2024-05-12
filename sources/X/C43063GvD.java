package X;

import java.io.File;
import java.io.FileFilter;
import kotlin.jvm.internal.o;

/* renamed from: X.GvD, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C43063GvD implements FileFilter {
    public static final C43063GvD LIZ = new C43063GvD();

    @Override // java.io.FileFilter
    public final boolean accept(File file) {
        if (file == null || !file.exists() || file.getName() == null) {
            return false;
        }
        String name = file.getName();
        o.LJIIIIZZ(name, "pathname.name");
        if (!ujb.o.LJJJJ(name, "-concat-a", false)) {
            return false;
        }
        String name2 = file.getName();
        o.LJIIIIZZ(name2, "pathname.name");
        if (ujb.o.LJJJJ(name2, "-mix-concat-a", false)) {
            return false;
        }
        return true;
    }
}
