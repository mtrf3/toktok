package X;

import java.io.File;
import java.io.FilenameFilter;

/* renamed from: X.FYi, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C39156FYi implements FilenameFilter {
    @Override // java.io.FilenameFilter
    public final boolean accept(File file, String str) {
        return !str.endsWith(".zip");
    }
}
