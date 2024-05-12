package X;

import java.io.File;
import java.io.FilenameFilter;

/* loaded from: classes12.dex */
public class PK9 implements FilenameFilter {
    public final String LIZ;

    public PK9(String str) {
        this.LIZ = str;
    }

    @Override // java.io.FilenameFilter
    public final boolean accept(File file, String str) {
        return !str.equals(this.LIZ);
    }
}
