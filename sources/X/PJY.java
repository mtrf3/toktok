package X;

import com.bytedance.crash.ensure.EnsureInitInner;
import java.io.File;

/* loaded from: classes12.dex */
public final class PJY implements InterfaceC39656FhM {
    @Override // X.InterfaceC39656FhM
    public final boolean LJIILL(ClassLoader classLoader, File file, File file2, boolean z) {
        return C78857UxB.LJJII(classLoader, file, file2, z);
    }

    public /* synthetic */ PJY() {
        EnsureInitInner.LIZ();
    }

    public /* synthetic */ PJY(int i) {
    }

    public static boolean LIZIZ(Throwable th) {
        if (PK0.LJIIIIZZ.isEnsureEnable() && !PJ2.LIZ(th)) {
            return true;
        }
        return false;
    }

    public static void LIZ(String str, Throwable th) {
        C78685UuP.LJJ();
        if (PK0.LIZ == null) {
            return;
        }
        if (PJD.LIZIZ == -1) {
            PJD.LIZIZ = 5;
            PJD.LIZIZ = PJA.LJIIIIZZ(5, "custom_event_settings", "npth_simple_setting", "crash_inner_limit");
        }
        int i = PJD.LIZJ;
        if (i >= PJD.LIZIZ) {
            return;
        }
        PJD.LIZJ = i + 1;
        PJD.LIZ().reportCustomErr(str, "INNER", th);
    }

    @Override // X.InterfaceC39656FhM
    public final void LIZLLL(ClassLoader classLoader, java.util.Set set) {
        C78857UxB.LJIILJJIL(classLoader, set, new C65314PkE());
    }

    public static void LIZJ(String str, String str2, java.util.Map map) {
        if (!PK0.LJIIIIZZ.isEnsureEnable()) {
            return;
        }
        V1M.LJJJJ(null, null, C16880lQ.LLLLIIIILLL().getStackTrace(), 5, str, true, map, C16880lQ.LLLLIIIILLL(), str2, "core_exception_monitor");
    }
}
