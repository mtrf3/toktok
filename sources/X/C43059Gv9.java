package X;

import java.io.File;
import java.io.FileFilter;
import kotlin.jvm.internal.o;

/* renamed from: X.Gv9, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C43059Gv9 implements FileFilter {
    public static final C43059Gv9 LIZ = new C43059Gv9();

    @Override // java.io.FileFilter
    public final boolean accept(File file) {
        if (file == null || !file.exists() || file.getName() == null) {
            return false;
        }
        String name = file.getName();
        o.LJIIIIZZ(name, "pathname.name");
        if (!ujb.o.LJJJJ(name, "-concat-v", false)) {
            return false;
        }
        String name2 = file.getName();
        o.LJIIIIZZ(name2, "pathname.name");
        if (ujb.o.LJJJLIIL(name2, "synthetise_", false)) {
            return false;
        }
        return true;
    }
}
