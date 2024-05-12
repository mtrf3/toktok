package X;

import com.bytedance.mt.protector.impl.string2number.CastLongProtector;
import java.io.File;
import java.io.FilenameFilter;

/* loaded from: classes9.dex */
public final class IV6 implements FilenameFilter {
    public final /* synthetic */ long LIZ;

    public IV6(long j) {
        this.LIZ = j;
    }

    @Override // java.io.FilenameFilter
    public final boolean accept(File file, String str) {
        try {
            if (Math.abs(CastLongProtector.parseLong(str.split("_")[2].substring(0, r1.length() - 4)) - this.LIZ) >= 1000) {
                return false;
            }
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }
}
