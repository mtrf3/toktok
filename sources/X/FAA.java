package X;

import android.os.Build;
import android.os.Handler;
import android.util.Printer;
import com.ss.android.ugc.aweme.legoImp.service.MainLooperOptService;
import java.util.HashMap;

/* loaded from: classes7.dex */
public class FAA implements Printer {
    public final /* synthetic */ MainLooperOptService LJLIL;

    public FAA(MainLooperOptService mainLooperOptService) {
        this.LJLIL = mainLooperOptService;
    }

    @Override // android.util.Printer
    public final void println(String str) {
        MainLooperOptService mainLooperOptService;
        Object obj;
        MainLooperOptService mainLooperOptService2 = this.LJLIL;
        if (mainLooperOptService2.LL) {
            return;
        }
        if (!MainLooperOptService.LLFFF) {
            mainLooperOptService2.LJIJ();
            return;
        }
        Printer printer = mainLooperOptService2.LJZI;
        if (printer != null && printer != mainLooperOptService2.LJLZ) {
            printer.println(str);
        }
        MainLooperOptService mainLooperOptService3 = this.LJLIL;
        if (((Boolean) ((HashMap) mainLooperOptService3.LJLIL).get(mainLooperOptService3.LJLILLLLZI)).booleanValue()) {
            return;
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("lookup for ");
        LIZ.append(this.LJLIL.LJLILLLLZI.name());
        X1D.LIZIZ(LIZ);
        int i = FAD.LIZ[this.LJLIL.LJLILLLLZI.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i != 4 || (obj = (mainLooperOptService = this.LJLIL).LJLL) == null || !mainLooperOptService.LJIILL(obj)) {
                        return;
                    }
                    ((HashMap) this.LJLIL.LJLIL).put(FAB.WATCH_UI_FRAME, Boolean.TRUE);
                    return;
                }
                MainLooperOptService mainLooperOptService4 = this.LJLIL;
                Handler handler = mainLooperOptService4.LJLJL;
                if (handler == null || !mainLooperOptService4.LJIILJJIL(6, handler)) {
                    return;
                }
                ((HashMap) this.LJLIL.LJLIL).put(FAB.WATCH_WINDOW_FOCUS_CHANGE, Boolean.TRUE);
                return;
            }
            MainLooperOptService mainLooperOptService5 = this.LJLIL;
            Object obj2 = mainLooperOptService5.LJLL;
            if (obj2 == null || !mainLooperOptService5.LJIILL(obj2)) {
                return;
            }
            ((HashMap) this.LJLIL.LJLIL).put(FAB.WATCH_MAIN_FRAME, Boolean.TRUE);
            return;
        }
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 28 || (i2 == 27 && Build.VERSION.PREVIEW_SDK_INT > 0)) {
            MainLooperOptService mainLooperOptService6 = this.LJLIL;
            mainLooperOptService6.LJIILJJIL(159, mainLooperOptService6.LJLJJLL);
            return;
        }
        java.util.Map<FAB, Boolean> map = this.LJLIL.LJLIL;
        FAB fab = FAB.WATCH_PAUSE_TOP_ACTIVITY;
        if (!((Boolean) ((HashMap) map).get(fab)).booleanValue()) {
            MainLooperOptService mainLooperOptService7 = this.LJLIL;
            if (!mainLooperOptService7.LJIILJJIL(101, mainLooperOptService7.LJLJJLL)) {
                return;
            }
            ((HashMap) this.LJLIL.LJLIL).put(fab, Boolean.TRUE);
            return;
        }
        MainLooperOptService mainLooperOptService8 = this.LJLIL;
        if (!mainLooperOptService8.LJIILJJIL(100, mainLooperOptService8.LJLJJLL)) {
            return;
        }
        ((HashMap) this.LJLIL.LJLIL).put(FAB.WATCH_LAUNCH_ACTIVITY, Boolean.TRUE);
    }
}
