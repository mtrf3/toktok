package X;

import android.content.Context;
import android.graphics.Matrix;
import android.graphics.PointF;
import android.graphics.RectF;
import android.widget.OverScroller;
import android.widget.Scroller;

/* renamed from: X.WEw, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public class RunnableC81966WEw implements Runnable {
    public boolean LJLIL;
    public final OverScroller LJLILLLLZI;
    public final OverScroller LJLJI;
    public final Scroller LJLJJI;
    public final Scroller LJLJJL;
    public final Scroller LJLJJLL;
    public WF2 LJLJL;
    public int LJLJLJ;
    public int LJLJLLL;
    public int LJLL;
    public int LJLLI;
    public final RectF LJLLILLLL = new RectF();
    public final InterpolatorC81968WEy LJLLJ;
    public final /* synthetic */ C81964WEu LJLLL;

    public final void LIZ() {
        this.LJLLL.LJLJL.reset();
        C81964WEu c81964WEu = this.LJLLL;
        Matrix matrix = c81964WEu.LJLJL;
        RectF rectF = c81964WEu.LLIIII;
        matrix.postTranslate(-rectF.left, -rectF.top);
        C81964WEu c81964WEu2 = this.LJLLL;
        Matrix matrix2 = c81964WEu2.LJLJL;
        PointF pointF = c81964WEu2.LLIIJLIL;
        matrix2.postTranslate(pointF.x, pointF.y);
        C81964WEu c81964WEu3 = this.LJLLL;
        c81964WEu3.LJLJL.postTranslate(-c81964WEu3.LLI, -c81964WEu3.LLIFFJFJJ);
        C81964WEu c81964WEu4 = this.LJLLL;
        Matrix matrix3 = c81964WEu4.LJLJL;
        float f = c81964WEu4.LLFF;
        PointF pointF2 = c81964WEu4.LLIIJLIL;
        matrix3.postRotate(f, pointF2.x, pointF2.y);
        C81964WEu c81964WEu5 = this.LJLLL;
        Matrix matrix4 = c81964WEu5.LJLJL;
        float f2 = c81964WEu5.LLFFF;
        PointF pointF3 = c81964WEu5.LLIIJI;
        matrix4.postScale(f2, f2, pointF3.x, pointF3.y);
        this.LJLLL.LJLJL.postTranslate(r3.LLFII, r3.LLFZ);
        this.LJLLL.LJFF();
    }

    /* JADX WARN: Code restructure failed: missing block: B:44:0x0174, code lost:
    
        if (r5 != false) goto L41;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZIZ() {
        /*
            Method dump skipped, instructions count: 412
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.RunnableC81966WEw.LIZIZ():void");
    }

    public final void LIZJ() {
        this.LJLLL.removeCallbacks(this);
        this.LJLILLLLZI.abortAnimation();
        this.LJLJJI.abortAnimation();
        this.LJLJI.abortAnimation();
        this.LJLJJLL.abortAnimation();
        this.LJLIL = false;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean LIZ;
        try {
            LIZIZ();
        } finally {
            if (LIZ) {
            }
        }
    }

    public RunnableC81966WEw(C81964WEu c81964WEu) {
        this.LJLLL = c81964WEu;
        InterpolatorC81968WEy interpolatorC81968WEy = new InterpolatorC81968WEy();
        this.LJLLJ = interpolatorC81968WEy;
        Context context = c81964WEu.getContext();
        this.LJLILLLLZI = new OverScroller(context, interpolatorC81968WEy);
        this.LJLJJI = new Scroller(context, interpolatorC81968WEy);
        this.LJLJI = new OverScroller(context, interpolatorC81968WEy);
        this.LJLJJL = new Scroller(context, interpolatorC81968WEy);
        this.LJLJJLL = new Scroller(context, interpolatorC81968WEy);
    }

    public final void LIZLLL(float f, float f2) {
        this.LJLJJI.startScroll((int) (f * 10000.0f), 0, (int) ((f2 - f) * 10000.0f), 0, this.LJLLL.LJLIL);
    }
}
