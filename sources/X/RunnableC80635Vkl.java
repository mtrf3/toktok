package X;

import android.graphics.RectF;
import com.bytedance.android.livesdk.livesetting.linkmic.LivesdkLinkmicFloatWindowOptimizeSetting;

/* renamed from: X.Vkl, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class RunnableC80635Vkl implements Runnable {
    public double LJLIL;
    public double LJLILLLLZI;
    public final /* synthetic */ double LJLJI = 300.0d;
    public final /* synthetic */ long LJLJJI;
    public final /* synthetic */ double LJLJJL;
    public final /* synthetic */ double LJLJJLL;
    public final /* synthetic */ AbstractC80634Vkk LJLJL;

    public final void LIZ() {
        double min = Math.min(this.LJLJI, System.currentTimeMillis() - this.LJLJJI);
        C73312Spw c73312Spw = this.LJLJL.LJLIL;
        double d = this.LJLJJL;
        double d2 = this.LJLJI;
        c73312Spw.getClass();
        double d3 = (min / d2) - 1.0d;
        double d4 = (((d3 * d3 * d3) + 1.0d) * d) + LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX;
        C73312Spw c73312Spw2 = this.LJLJL.LJLIL;
        double d5 = this.LJLJJLL;
        double d6 = this.LJLJI;
        c73312Spw2.getClass();
        double d7 = (min / d6) - 1.0d;
        double d8 = (((d7 * d7 * d7) + 1.0d) * d5) + LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX;
        this.LJLJL.LJIIIIZZ(d4 - this.LJLIL, d8 - this.LJLILLLLZI);
        this.LJLIL = d4;
        this.LJLILLLLZI = d8;
        if (min < this.LJLJI) {
            this.LJLJL.LJLJJL.post(this);
            return;
        }
        AbstractC80634Vkk abstractC80634Vkk = this.LJLJL;
        RectF LIZLLL = abstractC80634Vkk.LIZLLL(abstractC80634Vkk.LJLJI);
        float f = LIZLLL.left;
        if (f == 0.0f && LIZLLL.top == 0.0f) {
            return;
        }
        this.LJLJL.LJIIIIZZ(f, LIZLLL.top);
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

    public RunnableC80635Vkl(C80638Vko c80638Vko, long j, double d, double d2) {
        this.LJLJL = c80638Vko;
        this.LJLJJI = j;
        this.LJLJJL = d;
        this.LJLJJLL = d2;
    }
}
