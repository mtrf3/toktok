package X;

import android.content.Context;
import android.graphics.PointF;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.jvm.internal.o;

/* renamed from: X.Vc6, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C80098Vc6 extends AbstractC28951Br {
    public final boolean LIZLLL;
    public final int LJ;
    public final int LJFF = 1;
    public final int LJI = 1;
    public C28851Bh LJII;
    public C28861Bi LJIIIIZZ;
    public RecyclerView LJIIIZ;

    @Override // X.AbstractC28951Br
    public final void LIZIZ(RecyclerView recyclerView) {
        super.LIZIZ(recyclerView);
        this.LJIIIZ = recyclerView;
    }

    @Override // X.AbstractC28951Br
    public final C0AB LIZLLL(C0A2 c0a2) {
        Context context = null;
        if (!(c0a2 instanceof C0AA)) {
            return null;
        }
        RecyclerView recyclerView = this.LJIIIZ;
        if (recyclerView != null) {
            context = recyclerView.getContext();
        }
        return new C74594TPi(this, context);
    }

    @Override // X.AbstractC28951Br
    public final View LJFF(C0A2 c0a2) {
        boolean z;
        if (!(c0a2 instanceof LinearLayoutManager)) {
            return null;
        }
        AbstractC03050Ab LJIIIZ = LJIIIZ(c0a2);
        LinearLayoutManager linearLayoutManager = (LinearLayoutManager) c0a2;
        if (!linearLayoutManager.LJIJJLI() || LJIIIZ == null) {
            return null;
        }
        int LLILL = linearLayoutManager.LLILL();
        if (linearLayoutManager.LLILLIZIL() == linearLayoutManager.LJJJJZ() - 1) {
            z = true;
        } else {
            z = false;
        }
        if (LLILL == -1 || z) {
            return null;
        }
        View LJJIJIL = c0a2.LJJIJIL(LLILL);
        if (LJIIIZ.LIZIZ(LJJIJIL) >= LJIIIZ.LIZJ(LJJIJIL) / 2 && LJIIIZ.LIZIZ(LJJIJIL) > 0) {
            return LJJIJIL;
        }
        LinearLayoutManager linearLayoutManager2 = (LinearLayoutManager) c0a2;
        if (linearLayoutManager2.LLILLIZIL() == linearLayoutManager2.LJJJJZ() - 1) {
            return null;
        }
        return c0a2.LJJIJIL(LLILL + 1);
    }

    public final AbstractC03050Ab LJIIIZ(C0A2 c0a2) {
        if (this.LJII == null) {
            this.LJII = new C28851Bh(c0a2);
        }
        return this.LJII;
    }

    public C80098Vc6(int i, boolean z) {
        this.LIZLLL = z;
        this.LJ = i;
    }

    @Override // X.AbstractC28951Br
    public final int[] LIZJ(C0A2 layoutManager, View targetView) {
        o.LJIIIZ(layoutManager, "layoutManager");
        o.LJIIIZ(targetView, "targetView");
        int[] iArr = new int[2];
        AbstractC03050Ab LJIIIZ = LJIIIZ(layoutManager);
        if (layoutManager.LJIJJLI() && LJIIIZ != null) {
            if (!this.LIZLLL) {
                iArr[0] = LJIIIZ.LJ(targetView) - LJIIIZ.LJIIJ();
            } else {
                iArr[0] = -((this.LJ - LJIIIZ.LJIIJ()) - LJIIIZ.LIZIZ(targetView));
            }
        } else {
            iArr[0] = 0;
        }
        return iArr;
    }

    public final View LJIIIIZZ(C0A2 c0a2, AbstractC03050Ab abstractC03050Ab) {
        int i;
        int LJJJI = c0a2.LJJJI();
        View view = null;
        if (LJJJI == 0) {
            return null;
        }
        if (c0a2 instanceof LinearLayoutManager) {
            if (((LinearLayoutManager) c0a2).LLILLIZIL() == r0.LJJJJZ() - 1) {
                return null;
            }
        }
        int i2 = 0;
        if (c0a2.LJJJJ()) {
            i = abstractC03050Ab.LJIIJ();
        } else {
            i = 0;
        }
        int i3 = Integer.MAX_VALUE;
        if (!this.LIZLLL) {
            int i4 = LJJJI - 1;
            if (i4 >= 0) {
                while (true) {
                    View LJJJ = c0a2.LJJJ(i2);
                    int abs = Math.abs(abstractC03050Ab.LJ(LJJJ) - i);
                    if (abs < i3) {
                        view = LJJJ;
                        i3 = abs;
                    }
                    if (i2 == i4) {
                        break;
                    }
                    i2++;
                }
            }
        } else {
            int i5 = this.LJ;
            int i6 = LJJJI - 1;
            if (i6 >= 0) {
                while (true) {
                    View LJJJ2 = c0a2.LJJJ(i2);
                    int abs2 = Math.abs((i5 - abstractC03050Ab.LIZIZ(LJJJ2)) - i);
                    if (abs2 < i3) {
                        view = LJJJ2;
                        i3 = abs2;
                    }
                    if (i2 == i6) {
                        break;
                    }
                    i2++;
                }
            }
        }
        return view;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.AbstractC28951Br
    public final int LJI(C0A2 c0a2, int i, int i2) {
        AbstractC03050Ab LJIIIZ;
        View LJIIIIZZ;
        int LJJJLL;
        int LJJJI;
        int LJJJLL2;
        boolean z;
        int i3;
        int i4;
        PointF LJII;
        View view = null;
        if (!this.LIZLLL) {
            int LJJJJZ = c0a2.LJJJJZ();
            if (LJJJJZ == 0) {
                return -1;
            }
            AbstractC03050Ab LJIIIZ2 = LJIIIZ(c0a2);
            if (c0a2.LJIJJLI() && LJIIIZ2 != null && (LJJJI = c0a2.LJJJI()) != 0) {
                int i5 = Integer.MAX_VALUE;
                for (int i6 = 0; i6 < LJJJI; i6++) {
                    View LJJJ = c0a2.LJJJ(i6);
                    int LJ = LJIIIZ2.LJ(LJJJ);
                    if (LJ < i5) {
                        view = LJJJ;
                        i5 = LJ;
                    }
                }
                if (view == null || (LJJJLL2 = C0A2.LJJJLL(view)) == -1) {
                    return -1;
                }
                int i7 = LJJJLL2 / (this.LJFF * this.LJI);
                if (!c0a2.LJIJJLI() ? i2 > 0 : i > 0) {
                    z = true;
                } else {
                    z = false;
                }
                if ((c0a2 instanceof C0AA) && (LJII = ((C0AA) c0a2).LJII(LJJJJZ - 1)) != null && (LJII.x < 0.0f || LJII.y < 0.0f)) {
                    if (z) {
                        i7--;
                        i3 = this.LJFF;
                        i4 = this.LJI;
                    } else {
                        i3 = this.LJFF;
                        i4 = this.LJI;
                    }
                } else if (z) {
                    i7++;
                    i3 = this.LJFF;
                    i4 = this.LJI;
                } else {
                    i3 = this.LJFF;
                    i4 = this.LJI;
                }
                return i3 * i4 * i7;
            }
            return -1;
        }
        if (c0a2.LJJJJZ() == 0) {
            return -1;
        }
        if (c0a2.LJIL()) {
            if (this.LJIIIIZZ == null) {
                this.LJIIIIZZ = new C28861Bi(c0a2);
            }
            C28861Bi c28861Bi = this.LJIIIIZZ;
            if (c28861Bi != null) {
                LJIIIIZZ = LJIIIIZZ(c0a2, c28861Bi);
                if (LJIIIIZZ == null || (LJJJLL = C0A2.LJJJLL(LJIIIIZZ)) == -1) {
                    return -1;
                }
                return LJJJLL;
            }
            return -1;
        }
        if (c0a2.LJIJJLI() && (LJIIIZ = LJIIIZ(c0a2)) != null) {
            LJIIIIZZ = LJIIIIZZ(c0a2, LJIIIZ);
            if (LJIIIIZZ == null) {
                return LJJJLL;
            }
        }
        return -1;
    }
}
