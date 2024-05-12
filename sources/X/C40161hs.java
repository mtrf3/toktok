package X;

import android.content.Context;
import android.graphics.PointF;
import android.util.DisplayMetrics;
import android.view.View;
import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;

/* renamed from: X.1hs, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public class C40161hs extends AbstractC28951Br {
    public C28861Bi LIZLLL;
    public C28851Bh LJ;

    private AbstractC03050Ab LJIIJ(C0A2 c0a2) {
        C28851Bh c28851Bh = this.LJ;
        if (c28851Bh == null || c28851Bh.LIZ != c0a2) {
            this.LJ = new C28851Bh(c0a2);
        }
        return this.LJ;
    }

    private AbstractC03050Ab LJIIJJI(C0A2 c0a2) {
        C28861Bi c28861Bi = this.LIZLLL;
        if (c28861Bi == null || c28861Bi.LIZ != c0a2) {
            this.LIZLLL = new C28861Bi(c0a2);
        }
        return this.LIZLLL;
    }

    @Override // X.AbstractC28951Br
    public final C0AB LIZLLL(C0A2 c0a2) {
        if (!(c0a2 instanceof C0AA)) {
            return null;
        }
        final Context context = this.LIZ.getContext();
        return new C1C9(context) { // from class: X.1hr
            @Override // X.C1C9
            public final float LJIIJ(DisplayMetrics displayMetrics) {
                return 100.0f / displayMetrics.densityDpi;
            }

            @Override // X.C1C9
            public final int LJIIL(int i) {
                return Math.min(100, super.LJIIL(i));
            }

            @Override // X.C1C9, X.C0AB
            public final void LJFF(View view, C0AC c0ac, C0A9 c0a9) {
                C40161hs c40161hs = C40161hs.this;
                int[] LIZJ = c40161hs.LIZJ(c40161hs.LIZ.getLayoutManager(), view);
                int i = LIZJ[0];
                int i2 = LIZJ[1];
                int LJIIJJI = LJIIJJI(Math.max(Math.abs(i), Math.abs(i2)));
                if (LJIIJJI > 0) {
                    c0a9.LIZIZ(i, i2, LJIIJJI, this.LJIIIIZZ);
                }
            }
        };
    }

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

    public static final int LJIIIIZZ(View view, AbstractC03050Ab abstractC03050Ab) {
        return ((abstractC03050Ab.LIZJ(view) / 2) + abstractC03050Ab.LJ(view)) - ((abstractC03050Ab.LJIIJJI() / 2) + abstractC03050Ab.LJIIJ());
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
            iArr[0] = LJIIIIZZ(view, LJIIJ(c0a2));
        } else {
            iArr[0] = 0;
        }
        if (c0a2.LJIL()) {
            iArr[1] = LJIIIIZZ(view, LJIIJJI(c0a2));
        } else {
            iArr[1] = 0;
        }
        return iArr;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.AbstractC28951Br
    public int LJI(C0A2 c0a2, int i, int i2) {
        AbstractC03050Ab LJIIJ;
        boolean z;
        PointF LJII;
        int LJJJJZ = c0a2.LJJJJZ();
        if (LJJJJZ == 0) {
            return -1;
        }
        View view = null;
        if (c0a2.LJIL()) {
            LJIIJ = LJIIJJI(c0a2);
        } else {
            if (c0a2.LJIJJLI()) {
                LJIIJ = LJIIJ(c0a2);
            }
            return -1;
        }
        if (LJIIJ != null) {
            int LJJJI = c0a2.LJJJI();
            boolean z2 = false;
            View view2 = null;
            int i3 = LiveLayoutPreloadThreadPriority.DEFAULT;
            int i4 = Integer.MAX_VALUE;
            for (int i5 = 0; i5 < LJJJI; i5++) {
                View LJJJ = c0a2.LJJJ(i5);
                if (LJJJ != null) {
                    int LJIIIIZZ = LJIIIIZZ(LJJJ, LJIIJ);
                    if (LJIIIIZZ <= 0) {
                        if (LJIIIIZZ > i3) {
                            view2 = LJJJ;
                            i3 = LJIIIIZZ;
                        }
                        if (LJIIIIZZ < 0) {
                        }
                    }
                    if (LJIIIIZZ < i4) {
                        view = LJJJ;
                        i4 = LJIIIIZZ;
                    }
                }
            }
            int i6 = 1;
            if (!c0a2.LJIJJLI() ? i2 > 0 : i > 0) {
                z = true;
                if (view != null) {
                    return C0A2.LJJJLL(view);
                }
                view = view2;
            } else {
                z = false;
                if (view2 != null) {
                    return C0A2.LJJJLL(view2);
                }
            }
            if (view == null) {
                return -1;
            }
            int LJJJLL = C0A2.LJJJLL(view);
            int LJJJJZ2 = c0a2.LJJJJZ();
            if ((c0a2 instanceof C0AA) && (LJII = ((C0AA) c0a2).LJII(LJJJJZ2 - 1)) != null && (LJII.x < 0.0f || LJII.y < 0.0f)) {
                z2 = true;
            }
            if (z2 == z) {
                i6 = -1;
            }
            int i7 = LJJJLL + i6;
            if (i7 < 0 || i7 >= LJJJJZ) {
                return -1;
            }
            return i7;
        }
        return -1;
    }
}
