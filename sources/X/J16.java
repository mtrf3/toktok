package X;

import android.view.ViewGroup;

/* loaded from: classes9.dex */
public final class J16 implements Runnable {
    public final /* synthetic */ int LJLIL;
    public final /* synthetic */ int LJLILLLLZI;
    public final /* synthetic */ int LJLJI;
    public final /* synthetic */ int LJLJJI;
    public final /* synthetic */ J14 LJLJJL;

    public J16(int i, int i2, int i3, int i4, J14 j14) {
        this.LJLIL = i;
        this.LJLILLLLZI = i2;
        this.LJLJI = i3;
        this.LJLJJI = i4;
        this.LJLJJL = j14;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean LIZ;
        try {
            double d = (this.LJLIL * 1.0d) / this.LJLILLLLZI;
            int i = this.LJLJI;
            int i2 = this.LJLJJI;
            if (i / i2 < d) {
                i = (int) (i2 / d);
            } else {
                i2 = (int) (i * d);
            }
            ViewGroup.LayoutParams layoutParams = this.LJLJJL.getVideoPlayer().getLayoutParams();
            layoutParams.width = i2;
            layoutParams.height = i;
            this.LJLJJL.getVideoPlayer().setLayoutParams(layoutParams);
        } finally {
            if (LIZ) {
            }
        }
    }
}
