package X;

import com.bytedance.common.jato.boost.CpusetManager;

/* renamed from: X.EVd, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class RunnableC36525EVd implements Runnable {
    public static final RunnableC36525EVd LJLIL = new RunnableC36525EVd();

    @Override // java.lang.Runnable
    public final void run() {
        boolean LIZ;
        try {
            CpusetManager.resetCoreBind();
        } finally {
            if (LIZ) {
            }
        }
    }
}
