package X;

import com.ss.android.ugc.aweme.image.experiment.PhotoModePerformanceOptiData;
import java.util.List;

/* renamed from: X.5wx, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C151435wx {
    public static final C62822Ol8 LIZ = C221108m2.LIZIZ(C151675xL.LJLIL);
    public static final List<Integer> LIZIZ = C47261Igj.LJJIJ(0);
    public static int LIZJ;

    public static boolean LIZ() {
        if (LIZIZ.contains(Integer.valueOf(LIZJ)) && LIZIZ().getEnablePreCopyFile()) {
            return true;
        }
        return false;
    }

    public static final PhotoModePerformanceOptiData LIZIZ() {
        PhotoModePerformanceOptiData photoModePerformanceOptiData = (PhotoModePerformanceOptiData) LIZ.getValue();
        if (photoModePerformanceOptiData == null) {
            return new PhotoModePerformanceOptiData(false, false, 0, 0, 0, 0, false, false, false, false, false, 0, 4095, null);
        }
        return photoModePerformanceOptiData;
    }
}
