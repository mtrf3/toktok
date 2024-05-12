package X;

/* loaded from: classes16.dex */
public class YR2 implements YR1 {
    public static volatile YR2 LJLIL;

    @Override // X.YR1
    public final void onCaptureStarted(int i, int i2) {
    }

    @Override // X.YR1
    public final void onCaptureStopped(int i) {
    }

    @Override // X.YR1
    public final void onError(int i, String str) {
    }

    @Override // X.YR1
    public final void onInfo(int i, int i2, String str) {
    }

    public static YR2 LIZ() {
        YR2 yr2;
        synchronized (YR2.class) {
            if (LJLIL == null) {
                synchronized (YR2.class) {
                    LJLIL = new YR2();
                }
            }
            yr2 = LJLIL;
        }
        return yr2;
    }
}
