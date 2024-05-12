package X;

import android.os.Handler;
import android.os.Message;

/* loaded from: classes7.dex */
public final class FW7 implements Runnable {
    public static final FW7 LJLIL = new FW7();

    public static void LIZ() {
        FW6 fw6;
        Handler handler;
        if (!C1DH.LJIL() || (fw6 = LXV.LJIJI) == null || fw6.LIZ == null) {
            return;
        }
        synchronized (LXV.LJIJJ) {
            Message obtain = Message.obtain();
            obtain.what = 0;
            obtain.obj = new FW8();
            FW6 fw62 = LXV.LJIJI;
            if (fw62 != null && (handler = fw62.LIZ) != null) {
                try {
                    handler.sendMessage(obtain);
                } catch (Exception e) {
                    C16880lQ.LLLLIIL(e);
                }
            }
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
