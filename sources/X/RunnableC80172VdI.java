package X;

import android.view.View;
import android.view.animation.AnimationUtils;
import android.webkit.WebView;
import android.widget.AbsListView;
import android.widget.ScrollView;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: X.VdI, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public class RunnableC80172VdI implements Runnable {
    public int LJLIL;
    public float LJLILLLLZI;
    public long LJLJI;
    public long LJLJJI = AnimationUtils.currentAnimationTimeMillis();
    public final /* synthetic */ C80164VdA LJLJJL;

    public final void LIZ() {
        C80164VdA c80164VdA = this.LJLJJL;
        if (c80164VdA.LLLFF == this && !c80164VdA.LLJLIL.isFinishing) {
            long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
            long j = currentAnimationTimeMillis - this.LJLJJI;
            float pow = (float) (Math.pow(0.98f, ((float) (currentAnimationTimeMillis - this.LJLJI)) / (1000.0f / 10)) * this.LJLILLLLZI);
            this.LJLILLLLZI = pow;
            float f = ((((float) j) * 1.0f) / 1000.0f) * pow;
            if (Math.abs(f) > 1.0f) {
                this.LJLJJI = currentAnimationTimeMillis;
                int i = (int) (this.LJLIL + f);
                this.LJLIL = i;
                C80164VdA c80164VdA2 = this.LJLJJL;
                if (c80164VdA2.LJLILLLLZI * i > 0) {
                    c80164VdA2.LLJL.LIZIZ(i, true);
                    this.LJLJJL.LLJJLIIIJLLLLLLLZ.postDelayed(this, 10);
                    return;
                }
                c80164VdA2.LLLFF = null;
                c80164VdA2.LLJL.LIZIZ(0, true);
                View view = this.LJLJJL.LLJJJJLIIL.LJLJI;
                int i2 = (int) (-this.LJLILLLLZI);
                if (view instanceof ScrollView) {
                    ((ScrollView) view).fling(i2);
                } else if (view instanceof AbsListView) {
                    ((AbsListView) view).fling(i2);
                } else if (view instanceof WebView) {
                    ((WebView) view).flingScroll(0, i2);
                } else if (view instanceof C45631qh) {
                    ((C45631qh) view).LJ(i2);
                } else if (view instanceof RecyclerView) {
                    ((RecyclerView) view).LJJJI(0, i2);
                }
                C80164VdA c80164VdA3 = this.LJLJJL;
                if (!c80164VdA3.LLJZIJLIL || f <= 0.0f) {
                    return;
                }
                c80164VdA3.LLJZIJLIL = false;
                return;
            }
            this.LJLJJL.LLLFF = null;
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

    public RunnableC80172VdI(C80164VdA c80164VdA, float f) {
        this.LJLJJL = c80164VdA;
        this.LJLILLLLZI = f;
        this.LJLIL = c80164VdA.LJLILLLLZI;
    }
}
