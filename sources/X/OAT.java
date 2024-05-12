package X;

import java.io.File;
import java.io.FileFilter;

/* loaded from: classes11.dex */
public final class OAT implements FileFilter {
    @Override // java.io.FileFilter
    public final boolean accept(File file) {
        return file.isDirectory();
    }
}
