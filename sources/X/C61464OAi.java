package X;

import java.io.File;
import java.io.FileFilter;

/* renamed from: X.OAi, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C61464OAi implements FileFilter {
    @Override // java.io.FileFilter
    public final boolean accept(File file) {
        return file.isDirectory();
    }
}
