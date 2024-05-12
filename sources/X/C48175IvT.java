package X;

import com.bytedance.mt.protector.impl.PatternProtector;
import java.io.File;
import java.io.FilenameFilter;

/* renamed from: X.IvT, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C48175IvT implements FilenameFilter {
    @Override // java.io.FilenameFilter
    public final boolean accept(File file, String str) {
        if (str.contains(".ctx") && PatternProtector.compile("^\\d{1,13}-\\d{1,13}.*").matcher(str).matches()) {
            return true;
        }
        return false;
    }
}
