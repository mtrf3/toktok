package X;

import java.io.File;
import java.io.FileFilter;

/* renamed from: X.QBi, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C66586QBi implements FileFilter {
    @Override // java.io.FileFilter
    public final boolean accept(File file) {
        if (file != null && file.getName().endsWith("-concat-v")) {
            return true;
        }
        return false;
    }
}
