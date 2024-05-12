package X;

import com.bytedance.mt.protector.impl.string2number.CastLongProtector;
import java.io.File;
import java.io.FilenameFilter;

/* loaded from: classes12.dex */
public final class PLJ implements FilenameFilter {
    public final /* synthetic */ long LIZ;

    public PLJ(long j) {
        this.LIZ = j;
    }

    @Override // java.io.FilenameFilter
    public final boolean accept(File file, String str) {
        try {
            if (Math.abs(CastLongProtector.parseLong(str.split("_")[0]) - this.LIZ) >= 20000) {
                return false;
            }
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }
}
