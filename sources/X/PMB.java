package X;

import java.io.File;
import java.io.FileFilter;

/* loaded from: classes12.dex */
public final class PMB implements FileFilter {
    public final /* synthetic */ long[] LIZ;

    public PMB(long[] jArr) {
        this.LIZ = jArr;
    }

    @Override // java.io.FileFilter
    public final boolean accept(File file) {
        long lastModified = file.lastModified();
        long[] jArr = this.LIZ;
        if (lastModified > jArr[0]) {
            jArr[0] = file.lastModified();
        }
        return file.exists();
    }
}
