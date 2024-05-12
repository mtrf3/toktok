package X;

import android.hardware.display.DisplayManager;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveCenterDelayLoadSetting;

/* renamed from: X.JEl, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class RunnableC48831JEl implements Runnable {
    public static final RunnableC48831JEl LJLIL = new RunnableC48831JEl();

    public static void LIZ() {
        try {
            if ((C48833JEn.LIZJ & 1) <= 0 && C48833JEn.LIZ == null) {
                ChoreographerFrameCallbackC48830JEk choreographerFrameCallbackC48830JEk = new ChoreographerFrameCallbackC48830JEk(LiveCenterDelayLoadSetting.DEFAULT);
                C48833JEn.LIZ = choreographerFrameCallbackC48830JEk;
                choreographerFrameCallbackC48830JEk.LJLILLLLZI = true;
                C16880lQ.LLIIIJ().postFrameCallback(choreographerFrameCallbackC48830JEk);
            }
            if ((C48833JEn.LIZJ & 2) <= 0) {
                C48832JEm c48832JEm = C48833JEn.LIZIZ;
                if (c48832JEm == null) {
                    C48832JEm c48832JEm2 = new C48832JEm();
                    C48833JEn.LIZIZ = c48832JEm2;
                    if (C77357UXp.LJJIIJZLJL()) {
                        DisplayManager displayManager = (DisplayManager) c48832JEm2.LJLJI.getValue();
                        if (displayManager != null) {
                            displayManager.registerDisplayListener(c48832JEm2, null);
                        }
                        c48832JEm2.LJLILLLLZI = System.currentTimeMillis();
                        return;
                    }
                    return;
                }
                if (System.currentTimeMillis() - c48832JEm.LJLILLLLZI > LiveCenterDelayLoadSetting.DEFAULT && !c48832JEm.LJLIL) {
                    C48833JEn.LIZ(false, false);
                    c48832JEm.LJLIL = true;
                    DisplayManager displayManager2 = (DisplayManager) c48832JEm.LJLJI.getValue();
                    if (displayManager2 != null) {
                        displayManager2.unregisterDisplayListener(c48832JEm);
                    }
                }
            }
        } catch (Throwable unused) {
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean LIZ;
        try {
            LIZ();
        } finally {
            if (LIZ) {
            }
        }
    }
}
