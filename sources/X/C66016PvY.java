package X;

import java.io.File;
import java.io.FilenameFilter;

/* renamed from: X.PvY, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C66016PvY implements FilenameFilter {
    @Override // java.io.FilenameFilter
    public final boolean accept(File file, String str) {
        if (str.endsWith(".hoting")) {
            return true;
        }
        if (str.endsWith(".hot") && !str.endsWith(".alog.hot")) {
            return true;
        }
        return false;
    }
}
