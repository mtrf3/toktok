package X;

import java.io.File;
import java.io.FilenameFilter;

/* renamed from: X.Fi2, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C39698Fi2 implements FilenameFilter {
    public static final C39698Fi2 LIZ = new C39698Fi2();

    @Override // java.io.FilenameFilter
    public final boolean accept(File file, String str) {
        return file.isDirectory();
    }
}
