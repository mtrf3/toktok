package X;

import java.io.File;
import java.io.FileFilter;

/* loaded from: classes12.dex */
public final class PB8 implements FileFilter {
    @Override // java.io.FileFilter
    public final boolean accept(File file) {
        String name = file.getName();
        if (name.endsWith(".log")) {
            return true;
        }
        if (name.endsWith(".txt")) {
            return false;
        }
        OPR.LIZ(file);
        return false;
    }
}
