package X;

import com.ss.android.videoshop.controller.VideoController;

/* loaded from: classes16.dex */
public final class YSY implements Runnable {
    public final /* synthetic */ int LJLIL;
    public final /* synthetic */ int LJLILLLLZI;
    public final /* synthetic */ YSV LJLJI;

    @Override // java.lang.Runnable
    public final void run() {
        boolean LIZ;
        try {
            VideoController videoController = this.LJLJI.LIZ;
            if (videoController != null) {
                videoController.handleSubSwitchCompleted(this.LJLIL, this.LJLILLLLZI);
            }
        } finally {
            if (LIZ) {
            }
        }
    }

    public YSY(YSV ysv, int i, int i2) {
        this.LJLJI = ysv;
        this.LJLIL = i;
        this.LJLILLLLZI = i2;
    }
}
