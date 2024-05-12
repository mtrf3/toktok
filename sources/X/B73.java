package X;

import android.os.Handler;
import com.bytedance.ies.sdk.datachannel.DataChannel;

/* loaded from: classes6.dex */
public final class B73 {
    public static Handler LIZ;

    public static Handler LIZ() {
        if (LIZ == null) {
            synchronized (B73.class) {
                if (LIZ == null) {
                    LIZ = new Handler(C16880lQ.LLJJJJ());
                }
            }
        }
        return LIZ;
    }

    public static void LIZJ(Object obj) {
        LIZ().removeCallbacksAndMessages(obj);
    }

    public static void LIZIZ(Runnable runnable, DataChannel dataChannel) {
        LIZ().postAtTime(runnable, dataChannel, 2L);
    }
}
