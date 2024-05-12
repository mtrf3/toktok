package X;

import java.io.File;
import java.io.FilenameFilter;

/* renamed from: X.GvS, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C43078GvS implements FilenameFilter {
    @Override // java.io.FilenameFilter
    public final boolean accept(File file, String str) {
        return str.endsWith("_frag_v");
    }
}
