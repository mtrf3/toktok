package X;

import android.util.Size;
import android.view.View;
import android.view.ViewGroup;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.SlZ, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class RunnableC73041SlZ implements Runnable {
    public final /* synthetic */ C73051Slj LJLIL;
    public final /* synthetic */ Size LJLILLLLZI;
    public final /* synthetic */ int LJLJI;
    public final /* synthetic */ int LJLJJI;

    public RunnableC73041SlZ(C73051Slj c73051Slj, Size size, int i, int i2) {
        this.LJLIL = c73051Slj;
        this.LJLILLLLZI = size;
        this.LJLJI = i;
        this.LJLJJI = i2;
    }

    public final void LIZ() {
        View LIZ = this.LJLIL.LIZ(R.id.n9f);
        Size videoSize = this.LJLILLLLZI;
        int i = this.LJLJI;
        int i2 = this.LJLJJI;
        o.LJIIIZ(videoSize, "videoSize");
        if (LIZ != null) {
            double width = videoSize.getWidth();
            double height = videoSize.getHeight();
            double d = i;
            double d2 = i2;
            if (width / height > d / d2) {
                i2 = (int) ((d * height) / width);
            } else {
                i = (int) ((d2 * width) / height);
            }
            Size size = new Size(i, i2);
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("end onMeasure viewSize:");
            LIZ2.append(size);
            C0NB.LIZIZ("LiveReplayVideoClip", X1D.LIZIZ(LIZ2));
            int width2 = size.getWidth();
            int height2 = size.getHeight();
            ViewGroup.LayoutParams layoutParams = LIZ.getLayoutParams();
            o.LJII(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            if (marginLayoutParams.width != width2 || marginLayoutParams.height != height2) {
                marginLayoutParams.width = width2;
                marginLayoutParams.height = height2;
                LIZ.setLayoutParams(marginLayoutParams);
            }
            C48956JJg.LIZ(LIZ, 8.0f);
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
