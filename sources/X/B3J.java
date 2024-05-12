package X;

import com.bytedance.android.livesdk.widget.LivePlayPauseWidget;

/* loaded from: classes6.dex */
public final class B3J {
    public int LIZ;
    public int LIZIZ;
    public int LIZJ;
    public B8S LIZLLL;
    public LivePlayPauseWidget LJ;

    public final void LIZ(int i, int i2, int i3) {
        LivePlayPauseWidget livePlayPauseWidget = this.LJ;
        if (livePlayPauseWidget != null && livePlayPauseWidget.isInitialized()) {
            LivePlayPauseWidget livePlayPauseWidget2 = this.LJ;
            if (livePlayPauseWidget2 != null) {
                livePlayPauseWidget2.LL(i, i2, i3);
                return;
            }
            return;
        }
        this.LIZ = i;
        this.LIZIZ = i2;
        this.LIZJ = i3;
    }
}
