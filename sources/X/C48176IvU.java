package X;

import com.bytedance.mt.protector.impl.PatternProtector;
import java.io.File;
import java.io.FilenameFilter;

/* renamed from: X.IvU, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C48176IvU implements FilenameFilter {
    public final /* synthetic */ String LIZ;

    public C48176IvU(String str) {
        this.LIZ = str;
    }

    @Override // java.io.FilenameFilter
    public final boolean accept(File file, String str) {
        if (str.endsWith(this.LIZ) && PatternProtector.compile("^\\d{1,13}-\\d{1,13}.*").matcher(str).matches()) {
            return true;
        }
        return false;
    }
}
