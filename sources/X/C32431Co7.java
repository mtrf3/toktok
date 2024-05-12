package X;

import android.os.Environment;
import android.os.StatFs;

/* renamed from: X.Co7, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C32431Co7 {
    public static long LIZ() {
        StatFs statFs = new StatFs(Environment.getDataDirectory().getPath());
        return (statFs.getAvailableBlocksLong() * statFs.getBlockSizeLong()) / 1024;
    }
}
