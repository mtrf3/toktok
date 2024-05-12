package X;

import java.io.File;
import java.util.Comparator;

/* renamed from: X.FgL, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C39593FgL<T> implements Comparator<File> {
    public static final C39593FgL LJLIL = new C39593FgL();

    @Override // java.util.Comparator
    public final int compare(File file, File file2) {
        return (file.lastModified() > file2.lastModified() ? 1 : (file.lastModified() == file2.lastModified() ? 0 : -1));
    }
}
