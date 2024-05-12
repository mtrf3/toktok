package X;

import android.os.Handler;
import android.os.Message;
import android.util.Printer;
import com.ss.android.ugc.aweme.legoImp.service.MainLooperOptService;
import java.util.HashMap;

/* loaded from: classes7.dex */
public class FA9 implements Printer {
    public final /* synthetic */ MainLooperOptService LJLIL;

    public FA9(MainLooperOptService mainLooperOptService) {
        this.LJLIL = mainLooperOptService;
    }

    @Override // android.util.Printer
    public final void println(String str) {
        Message LJIIZILJ;
        Message LJIIZILJ2;
        Message LJIIZILJ3;
        Message LJIIZILJ4;
        MainLooperOptService mainLooperOptService = this.LJLIL;
        if (mainLooperOptService.LL) {
            return;
        }
        if (!MainLooperOptService.LLFFF) {
            mainLooperOptService.LJIJ();
            return;
        }
        Printer printer = mainLooperOptService.LJZI;
        if (printer != null && printer != mainLooperOptService.LJZ) {
            printer.println(str);
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("we will double check: ");
        LIZ.append(this.LJLIL.LJLILLLLZI.name());
        X1D.LIZIZ(LIZ);
        int i = FAD.LIZ[this.LJLIL.LJLILLLLZI.ordinal()];
        if (i != 2) {
            if (i != 3) {
                if (i != 4) {
                    if (i != 5) {
                        return;
                    }
                    if (!((Boolean) ((HashMap) this.LJLIL.LJLIL).get(FAB.WATCH_EXECUTE_TRANSACTION)).booleanValue()) {
                        return;
                    }
                    java.util.Map<FAB, Boolean> map = this.LJLIL.LJLIL;
                    FAB fab = FAB.DOUBLE_CHECK_WATCH_EXECUTE_TRANSACTION;
                    if (((Boolean) ((HashMap) map).get(fab)).booleanValue() || (LJIIZILJ4 = this.LJLIL.LJIIZILJ()) == null) {
                        return;
                    }
                    Handler target = LJIIZILJ4.getTarget();
                    MainLooperOptService mainLooperOptService2 = this.LJLIL;
                    FA8 fa8 = mainLooperOptService2.LJLLL;
                    if (target == fa8) {
                        return;
                    }
                    boolean LJIILJJIL = mainLooperOptService2.LJIILJJIL(159, fa8);
                    ((HashMap) this.LJLIL.LJLIL).put(fab, Boolean.valueOf(LJIILJJIL));
                    StringBuilder LIZ2 = X1D.LIZ();
                    LIZ2.append("already double check: WATCH_EXECUTE_TRANSACTION, result = ");
                    LIZ2.append(LJIILJJIL);
                    X1D.LIZIZ(LIZ2);
                    return;
                }
                if (!((Boolean) ((HashMap) this.LJLIL.LJLIL).get(FAB.WATCH_UI_FRAME)).booleanValue()) {
                    return;
                }
                java.util.Map<FAB, Boolean> map2 = this.LJLIL.LJLIL;
                FAB fab2 = FAB.DOUBLE_CHECK_WATCH_UI_FRAME;
                if (((Boolean) ((HashMap) map2).get(fab2)).booleanValue() || (LJIIZILJ3 = this.LJLIL.LJIIZILJ()) == null) {
                    return;
                }
                Handler target2 = LJIIZILJ3.getTarget();
                MainLooperOptService mainLooperOptService3 = this.LJLIL;
                FA7 fa7 = mainLooperOptService3.LJLLLL;
                if (target2 == fa7) {
                    return;
                }
                boolean LJIILJJIL2 = mainLooperOptService3.LJIILJJIL(0, fa7);
                ((HashMap) this.LJLIL.LJLIL).put(fab2, Boolean.valueOf(LJIILJJIL2));
                StringBuilder LIZ3 = X1D.LIZ();
                LIZ3.append("already double check: WATCH_UI_FRAME, result = ");
                LIZ3.append(LJIILJJIL2);
                X1D.LIZIZ(LIZ3);
                return;
            }
            if (!((Boolean) ((HashMap) this.LJLIL.LJLIL).get(FAB.WATCH_WINDOW_FOCUS_CHANGE)).booleanValue()) {
                return;
            }
            java.util.Map<FAB, Boolean> map3 = this.LJLIL.LJLIL;
            FAB fab3 = FAB.DOUBLE_CHECK_WINDOW_FOCUS_CHANGE;
            if (((Boolean) ((HashMap) map3).get(fab3)).booleanValue() || (LJIIZILJ2 = this.LJLIL.LJIIZILJ()) == null) {
                return;
            }
            Handler target3 = LJIIZILJ2.getTarget();
            MainLooperOptService mainLooperOptService4 = this.LJLIL;
            FA6 fa6 = mainLooperOptService4.LJLLLLLL;
            if (target3 == fa6) {
                return;
            }
            boolean LJIILJJIL3 = mainLooperOptService4.LJIILJJIL(6, fa6);
            ((HashMap) this.LJLIL.LJLIL).put(fab3, Boolean.valueOf(LJIILJJIL3));
            StringBuilder LIZ4 = X1D.LIZ();
            LIZ4.append("already double check: WATCH_WINDOW_FOCUS_CHANGE, result = ");
            LIZ4.append(LJIILJJIL3);
            X1D.LIZIZ(LIZ4);
            return;
        }
        java.util.Map<FAB, Boolean> map4 = this.LJLIL.LJLIL;
        FAB fab4 = FAB.WATCH_MAIN_FRAME;
        if (!((Boolean) ((HashMap) map4).get(fab4)).booleanValue()) {
            return;
        }
        if (((Boolean) ((HashMap) this.LJLIL.LJLIL).get(FAB.DOUBLE_CHECK_WATCH_MAIN_FRAME)).booleanValue() || (LJIIZILJ = this.LJLIL.LJIIZILJ()) == null) {
            return;
        }
        Handler target4 = LJIIZILJ.getTarget();
        MainLooperOptService mainLooperOptService5 = this.LJLIL;
        FA7 fa72 = mainLooperOptService5.LJLLLL;
        if (target4 == fa72) {
            return;
        }
        boolean LJIILJJIL4 = mainLooperOptService5.LJIILJJIL(0, fa72);
        ((HashMap) this.LJLIL.LJLIL).put(fab4, Boolean.valueOf(LJIILJJIL4));
        StringBuilder LIZ5 = X1D.LIZ();
        LIZ5.append("already double check: WATCH_EXECUTE_TRANSACTION, result = ");
        LIZ5.append(LJIILJJIL4);
        X1D.LIZIZ(LIZ5);
    }
}
