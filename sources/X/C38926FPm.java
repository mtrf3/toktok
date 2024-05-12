package X;

import com.ss.android.ttve.nativePort.TENativeLibsLoader;
import com.ss.android.vesdk.runtime.VESafelyLibsLoader;
import java.util.List;

/* renamed from: X.FPm, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public class C38926FPm implements InterfaceC38927FPn {
    @Override // X.InterfaceC38927FPn
    public final boolean LIZ(List<String> list) {
        C57964Moy.LIZLLL(4, "Load library start...");
        long currentTimeMillis = System.currentTimeMillis();
        for (String str : list) {
            System.currentTimeMillis();
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("Start loadLibrary ");
            LIZ.append(str);
            C57964Moy.LIZLLL(3, X1D.LIZIZ(LIZ));
            if (!VESafelyLibsLoader.loadLibrary(str, TENativeLibsLoader.sContext)) {
                StringBuilder LIZ2 = X1D.LIZ();
                LIZ2.append("loadLibrary ");
                LIZ2.append(str);
                LIZ2.append(" failed");
                C57964Moy.LIZLLL(4, X1D.LIZIZ(LIZ2));
                return false;
            }
            long currentTimeMillis2 = System.currentTimeMillis();
            StringBuilder LIZIZ = C25620zW.LIZIZ("Load ", str, " cost ");
            LIZIZ.append(currentTimeMillis2 - currentTimeMillis);
            LIZIZ.append("ms");
            C57964Moy.LIZLLL(4, X1D.LIZIZ(LIZIZ));
            currentTimeMillis = currentTimeMillis2;
        }
        return true;
    }
}
