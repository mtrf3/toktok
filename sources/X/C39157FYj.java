package X;

import java.io.File;
import java.io.FilenameFilter;

/* renamed from: X.FYj, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C39157FYj implements FilenameFilter {
    @Override // java.io.FilenameFilter
    public final boolean accept(File file, String str) {
        return str.endsWith(".zip");
    }
}
