package X;

import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;

/* loaded from: classes9.dex */
public final class JZG {
    public final int LIZ;
    public final JZI LIZIZ;
    public final InterfaceC191547fS LIZJ;
    public int LIZLLL;

    public JZG(JZI jzi) {
        this.LIZLLL = LiveLayoutPreloadThreadPriority.DEFAULT;
        this.LIZ = 0;
        this.LIZIZ = jzi;
    }

    public JZG(int i, InterfaceC191547fS interfaceC191547fS) {
        this.LIZLLL = LiveLayoutPreloadThreadPriority.DEFAULT;
        this.LIZ = i;
        this.LIZJ = interfaceC191547fS;
    }

    public final void LIZ(int i, int i2) {
        if (i > this.LIZLLL) {
            this.LIZLLL = i;
            int i3 = this.LIZ;
            if (i3 <= 0 || (i2 - i) - 1 > i3) {
                return;
            }
            InterfaceC191547fS interfaceC191547fS = this.LIZJ;
            if (interfaceC191547fS != null) {
                interfaceC191547fS.LJIIJJI();
                return;
            }
            JZI jzi = this.LIZIZ;
            if (jzi == null) {
                return;
            }
            jzi.LJIIJJI();
        }
    }
}
