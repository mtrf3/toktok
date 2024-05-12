package X;

import java.io.File;
import java.io.FileFilter;
import kotlin.jvm.internal.o;

/* renamed from: X.GvA, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C43060GvA implements FileFilter {
    public static final C43060GvA LIZ = new C43060GvA();

    @Override // java.io.FileFilter
    public final boolean accept(File file) {
        if (file == null || !file.exists() || file.getName() == null) {
            return false;
        }
        String name = file.getName();
        o.LJIIIIZZ(name, "pathname.name");
        if (!ujb.o.LJJJLIIL(name, "synthetise_", false)) {
            String name2 = file.getName();
            o.LJIIIIZZ(name2, "pathname.name");
            if (!ujb.o.LJJJJ(name2, "_synthetise", false)) {
                return false;
            }
        }
        return true;
    }
}
