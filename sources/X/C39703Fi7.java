package X;

import java.io.File;
import java.io.FileFilter;
import java.util.regex.Pattern;

/* renamed from: X.Fi7, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C39703Fi7 implements FileFilter {
    @Override // java.io.FileFilter
    public final boolean accept(File file) {
        return Pattern.matches("cpu[0-9]", file.getName());
    }
}
