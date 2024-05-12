package ms.bd.o;

import java.io.File;
import java.io.FilenameFilter;

/* loaded from: classes7.dex */
public class w implements FilenameFilter {
    public final /* synthetic */ String LIZ;

    public w(String str) {
        this.LIZ = str;
    }

    @Override // java.io.FilenameFilter
    public final boolean accept(File file, String str) {
        return str.startsWith(this.LIZ);
    }
}
