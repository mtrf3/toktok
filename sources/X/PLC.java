package X;

import com.bytedance.mt.protector.impl.string2number.CastLongProtector;
import java.io.File;
import java.io.FilenameFilter;

/* loaded from: classes12.dex */
public final class PLC implements FilenameFilter {
    @Override // java.io.FilenameFilter
    public final boolean accept(File file, String str) {
        try {
            if (CastLongProtector.parseLong(str.split("_")[0]) - PK0.LIZJ > 86400000) {
                PK8.LIZJ(new File(file, str));
            }
        } catch (Throwable unused) {
        }
        return false;
    }
}
