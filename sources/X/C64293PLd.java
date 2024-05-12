package X;

import java.io.File;
import java.io.FilenameFilter;

/* renamed from: X.PLd, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C64293PLd implements FilenameFilter {
    public final /* synthetic */ String LIZ;

    public C64293PLd(String str) {
        this.LIZ = str;
    }

    @Override // java.io.FilenameFilter
    public final boolean accept(File file, String str) {
        return str.contains(this.LIZ);
    }
}
