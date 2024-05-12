package X;

import com.ss.android.vesdk.runtime.VESafelyLibsLoader;
import java.util.List;

/* renamed from: X.FPl, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public class C38925FPl {
    public static final boolean LIZ(List<String> list) {
        System.currentTimeMillis();
        for (String str : list) {
            System.currentTimeMillis();
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("Start loadLibrary ");
            LIZ.append(str);
            C57964Moy.LIZLLL(3, X1D.LIZIZ(LIZ));
            if (!VESafelyLibsLoader.loadLibrary(str, null)) {
                return false;
            }
            System.currentTimeMillis();
        }
        return true;
    }
}
