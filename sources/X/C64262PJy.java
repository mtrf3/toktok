package X;

import java.io.File;
import java.io.FilenameFilter;

/* renamed from: X.PJy, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C64262PJy implements FilenameFilter {
    @Override // java.io.FilenameFilter
    public final boolean accept(File file, String str) {
        return str.endsWith(".txt");
    }
}
