package X;

import com.bytedance.android.livesdk.livesetting.linkmic.LivesdkLinkmicFloatWindowOptimizeSetting;

/* renamed from: X.Vkm, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class RunnableC80636Vkm implements Runnable {
    public final /* synthetic */ float LJLIL;
    public final /* synthetic */ long LJLILLLLZI;
    public final /* synthetic */ float LJLJI;
    public final /* synthetic */ float LJLJJI;
    public final /* synthetic */ float LJLJJL;
    public final /* synthetic */ float LJLJJLL;
    public final /* synthetic */ AbstractC80634Vkk LJLJL;

    public final void LIZ() {
        double d;
        float min = Math.min(this.LJLIL, (float) (System.currentTimeMillis() - this.LJLILLLLZI));
        C73312Spw c73312Spw = this.LJLJL.LJLIL;
        double d2 = this.LJLJI;
        double d3 = this.LJLIL;
        c73312Spw.getClass();
        double d4 = min / (d3 / 2.0d);
        double d5 = d2 / 2.0d;
        if (d4 < 1.0d) {
            d = C67399Qcl.LIZ(d5, d4, d4, d4, LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX);
        } else {
            double d6 = d4 - 2.0d;
            d = (((d6 * d6 * d6) + 2.0d) * d5) + LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX;
        }
        this.LJLJL.LJIILIIL(this.LJLJJI + ((float) d), this.LJLJJL, this.LJLJJLL);
        if (min < this.LJLIL) {
            this.LJLJL.LJLJJL.post(this);
            return;
        }
        AbstractC80634Vkk abstractC80634Vkk = this.LJLJL;
        abstractC80634Vkk.LJII(abstractC80634Vkk.getScale());
        this.LJLJL.LIZIZ();
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

    public RunnableC80636Vkm(AbstractC80634Vkk abstractC80634Vkk, float f, long j, float f2, float f3, float f4, float f5) {
        this.LJLJL = abstractC80634Vkk;
        this.LJLIL = f;
        this.LJLILLLLZI = j;
        this.LJLJI = f2;
        this.LJLJJI = f3;
        this.LJLJJL = f4;
        this.LJLJJLL = f5;
    }
}
