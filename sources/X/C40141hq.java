package X;

import android.graphics.PointF;
import android.view.View;
import android.widget.Scroller;
import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;

/* renamed from: X.1hq, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public class C40141hq extends AbstractC28951Br {
    public C28861Bi LIZLLL;
    public C28851Bh LJ;

    @Override // X.AbstractC28951Br
    public View LJFF(C0A2 c0a2) {
        if (c0a2.LJIL()) {
            return LJIIIZ(c0a2, LJIIJJI(c0a2));
        }
        if (c0a2.LJIJJLI()) {
            return LJIIIZ(c0a2, LJIIJ(c0a2));
        }
        return null;
    }

    public final AbstractC03050Ab LJIIJ(C0A2 c0a2) {
        C28851Bh c28851Bh = this.LJ;
        if (c28851Bh == null || c28851Bh.LIZ != c0a2) {
            this.LJ = new C28851Bh(c0a2);
        }
        return this.LJ;
    }

    public final AbstractC03050Ab LJIIJJI(C0A2 c0a2) {
        C28861Bi c28861Bi = this.LIZLLL;
        if (c28861Bi == null || c28861Bi.LIZ != c0a2) {
            this.LIZLLL = new C28861Bi(c0a2);
        }
        return this.LIZLLL;
    }

    public static final View LJIIIZ(C0A2 c0a2, AbstractC03050Ab abstractC03050Ab) {
        int LJJJI = c0a2.LJJJI();
        View view = null;
        if (LJJJI == 0) {
            return null;
        }
        int LJIIJJI = (abstractC03050Ab.LJIIJJI() / 2) + abstractC03050Ab.LJIIJ();
        int i = Integer.MAX_VALUE;
        for (int i2 = 0; i2 < LJJJI; i2++) {
            View LJJJ = c0a2.LJJJ(i2);
            int abs = Math.abs(((abstractC03050Ab.LIZJ(LJJJ) / 2) + abstractC03050Ab.LJ(LJJJ)) - LJIIJJI);
            if (abs < i) {
                view = LJJJ;
                i = abs;
            }
        }
        return view;
    }

    @Override // X.AbstractC28951Br
    public int[] LIZJ(C0A2 c0a2, View view) {
        int[] iArr = new int[2];
        if (c0a2.LJIJJLI()) {
            AbstractC03050Ab LJIIJ = LJIIJ(c0a2);
            iArr[0] = ((LJIIJ.LIZJ(view) / 2) + LJIIJ.LJ(view)) - ((LJIIJ.LJIIJJI() / 2) + LJIIJ.LJIIJ());
        } else {
            iArr[0] = 0;
        }
        if (c0a2.LJIL()) {
            AbstractC03050Ab LJIIJJI = LJIIJJI(c0a2);
            iArr[1] = ((LJIIJJI.LIZJ(view) / 2) + LJIIJJI.LJ(view)) - ((LJIIJJI.LJIIJJI() / 2) + LJIIJJI.LJIIJ());
        } else {
            iArr[1] = 0;
        }
        return iArr;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.AbstractC28951Br
    public final int LJI(C0A2 c0a2, int i, int i2) {
        int LJJJJZ;
        View LJFF;
        int LJJJLL;
        int i3;
        PointF LJII;
        int i4;
        int i5;
        if (!(c0a2 instanceof C0AA) || (LJJJJZ = c0a2.LJJJJZ()) == 0 || (LJFF = LJFF(c0a2)) == null || (LJJJLL = C0A2.LJJJLL(LJFF)) == -1 || (LJII = ((C0AA) c0a2).LJII(LJJJJZ - 1)) == null) {
            return -1;
        }
        int i6 = 0;
        if (c0a2.LJIJJLI()) {
            i4 = LJIIIIZZ(c0a2, LJIIJ(c0a2), i, 0);
            if (LJII.x < 0.0f) {
                i4 = -i4;
            }
        } else {
            i4 = 0;
        }
        if (c0a2.LJIL()) {
            i5 = LJIIIIZZ(c0a2, LJIIJJI(c0a2), 0, i2);
            if (LJII.y < 0.0f) {
                i5 = -i5;
            }
        } else {
            i5 = 0;
        }
        if (c0a2.LJIL()) {
            i4 = i5;
        }
        if (i4 == 0) {
            return -1;
        }
        int i7 = LJJJLL + i4;
        if (i7 >= 0) {
            i6 = i7;
        }
        if (i6 >= LJJJJZ) {
            return i3;
        }
        return i6;
    }

    public final int LJIIIIZZ(C0A2 c0a2, AbstractC03050Ab abstractC03050Ab, int i, int i2) {
        int max;
        int i3;
        Scroller scroller = this.LIZIZ;
        int i4 = LiveLayoutPreloadThreadPriority.DEFAULT;
        scroller.fling(0, 0, i, i2, LiveLayoutPreloadThreadPriority.DEFAULT, Integer.MAX_VALUE, LiveLayoutPreloadThreadPriority.DEFAULT, Integer.MAX_VALUE);
        int[] iArr = {this.LIZIZ.getFinalX(), this.LIZIZ.getFinalY()};
        int LJJJI = c0a2.LJJJI();
        float f = 1.0f;
        if (LJJJI != 0) {
            View view = null;
            View view2 = null;
            int i5 = Integer.MAX_VALUE;
            for (int i6 = 0; i6 < LJJJI; i6++) {
                View LJJJ = c0a2.LJJJ(i6);
                int LJJJLL = C0A2.LJJJLL(LJJJ);
                if (LJJJLL != -1) {
                    if (LJJJLL < i5) {
                        view = LJJJ;
                        i5 = LJJJLL;
                    }
                    if (LJJJLL > i4) {
                        view2 = LJJJ;
                        i4 = LJJJLL;
                    }
                }
            }
            if (view != null && view2 != null && (max = Math.max(abstractC03050Ab.LIZIZ(view), abstractC03050Ab.LIZIZ(view2)) - Math.min(abstractC03050Ab.LJ(view), abstractC03050Ab.LJ(view2))) != 0) {
                f = (max * 1.0f) / ((i4 - i5) + 1);
                if (f <= 0.0f) {
                    return 0;
                }
            }
        }
        if (Math.abs(iArr[0]) > Math.abs(iArr[1])) {
            i3 = iArr[0];
        } else {
            i3 = iArr[1];
        }
        return Math.round(i3 / f);
    }
}
