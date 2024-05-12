package X;

import java.io.File;
import java.io.FilenameFilter;

/* renamed from: X.PvZ, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C66017PvZ implements FilenameFilter {
    @Override // java.io.FilenameFilter
    public final boolean accept(File file, String str) {
        return str.startsWith(".logCache_");
    }
}
