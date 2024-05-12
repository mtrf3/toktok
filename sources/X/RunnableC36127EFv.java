package X;

import com.bytedance.common.jato.JatoXL;
import com.bytedance.common.jato.boost.CpusetManager;

/* renamed from: X.EFv, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class RunnableC36127EFv implements Runnable {
    public static final RunnableC36127EFv LJLIL = new RunnableC36127EFv();

    @Override // java.lang.Runnable
    public final void run() {
        boolean LIZ;
        int i;
        try {
            Thread thread = C16880lQ.LLJJJJ().getThread();
            if (JatoXL.isInited()) {
                try {
                    i = EUS.LIZIZ(((Long) C36496EUa.LIZ(Thread.class, "nativePeer").get(thread)).longValue() + 12);
                } catch (Throwable unused) {
                    i = -1;
                }
                JatoXL.resetPriority(i);
                CpusetManager.resetCoreBind(i);
            }
        } finally {
            if (LIZ) {
            }
        }
    }
}
