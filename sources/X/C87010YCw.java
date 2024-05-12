package X;

import Y.ALAdapterS0S0402000_15;
import Y.ALAdapterS2S0400000_15;
import Y.IDComparatorS29S0000000_1;
import android.animation.TimeInterpolator;
import android.view.View;
import android.view.animation.AccelerateDecelerateInterpolator;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.YCw, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C87010YCw extends AbstractC28931Bp {
    public final Runnable LJII;
    public final Runnable LJIIIIZZ;
    public final TimeInterpolator LJIIIZ = new AccelerateDecelerateInterpolator();
    public final ArrayList<RecyclerView.ViewHolder> LJIIJ = new ArrayList<>();
    public final ArrayList<RecyclerView.ViewHolder> LJIIJJI = new ArrayList<>();
    public final ArrayList<YD1> LJIIL = new ArrayList<>();
    public final ArrayList<C87012YCy> LJIILIIL = new ArrayList<>();
    public final ArrayList<RecyclerView.ViewHolder> LJIILJJIL = new ArrayList<>();
    public final ArrayList<RecyclerView.ViewHolder> LJIILL = new ArrayList<>();
    public final ArrayList<RecyclerView.ViewHolder> LJIILLIIL = new ArrayList<>();
    public final ArrayList<RecyclerView.ViewHolder> LJIIZILJ = new ArrayList<>();
    public final long LJIJ = 300;
    public final long LJIJI = 300;
    public InterfaceC65784Pro<C76800UCe> LJIJJ = YD3.LJLIL;

    @Override // X.AbstractC030109x
    public final void LJIIJ() {
        for (int size = this.LJIIL.size() - 1; -1 < size; size--) {
            Object obj = ListProtector.get(this.LJIIL, size);
            o.LJIIIIZZ(obj, "mPendingMoves[i]");
            YD1 yd1 = (YD1) obj;
            View view = yd1.LIZ.itemView;
            o.LJIIIIZZ(view, "item.holder.itemView");
            view.setTranslationY(0.0f);
            view.setTranslationX(0.0f);
            LJII(yd1.LIZ);
            ListProtector.remove(this.LJIIL, size);
        }
        for (int size2 = this.LJIIJ.size() - 1; -1 < size2; size2--) {
            Object obj2 = ListProtector.get(this.LJIIJ, size2);
            o.LJIIIIZZ(obj2, "mPendingRemovals[i]");
            LJII((RecyclerView.ViewHolder) obj2);
            ListProtector.remove(this.LJIIJ, size2);
        }
        for (int size3 = this.LJIIJJI.size() - 1; -1 < size3; size3--) {
            Object obj3 = ListProtector.get(this.LJIIJJI, size3);
            o.LJIIIIZZ(obj3, "mPendingAdditions[i]");
            RecyclerView.ViewHolder viewHolder = (RecyclerView.ViewHolder) obj3;
            viewHolder.itemView.setTranslationY(0.0f);
            LJIL(viewHolder);
            ListProtector.remove(this.LJIIJJI, size3);
        }
        for (int size4 = this.LJIILIIL.size() - 1; -1 < size4; size4--) {
            Object obj4 = ListProtector.get(this.LJIILIIL, size4);
            o.LJIIIIZZ(obj4, "mPendingChanges[i]");
            C87012YCy c87012YCy = (C87012YCy) obj4;
            RecyclerView.ViewHolder viewHolder2 = c87012YCy.LIZ;
            if (viewHolder2 != null) {
                LJJII(c87012YCy, viewHolder2);
            }
            RecyclerView.ViewHolder viewHolder3 = c87012YCy.LIZIZ;
            if (viewHolder3 != null) {
                LJJII(c87012YCy, viewHolder3);
            }
        }
        this.LJIILIIL.clear();
        if (!LJIILJJIL()) {
            return;
        }
        LJJI(this.LJIILLIIL);
        LJJI(this.LJIILL);
        LJJI(this.LJIILJJIL);
        LJJI(this.LJIIZILJ);
        LJIIIIZZ();
    }

    @Override // X.AbstractC030109x
    public final boolean LJIILJJIL() {
        if (!this.LJIIJJI.isEmpty() || !this.LJIILIIL.isEmpty() || !this.LJIIL.isEmpty() || !this.LJIIJ.isEmpty() || !this.LJIILL.isEmpty() || !this.LJIILLIIL.isEmpty() || !this.LJIILJJIL.isEmpty() || !this.LJIIZILJ.isEmpty()) {
            return true;
        }
        return false;
    }

    @Override // X.AbstractC030109x
    public final void LJIIZILJ() {
        View view;
        C87010YCw c87010YCw = this;
        boolean z = !c87010YCw.LJIIJ.isEmpty();
        boolean z2 = !c87010YCw.LJIIL.isEmpty();
        boolean z3 = !c87010YCw.LJIILIIL.isEmpty();
        boolean z4 = !c87010YCw.LJIIJJI.isEmpty();
        if (!z && !z2 && !z4 && !z3) {
            return;
        }
        Iterator<RecyclerView.ViewHolder> it = c87010YCw.LJIIJ.iterator();
        while (it.hasNext()) {
            RecyclerView.ViewHolder mPendingRemovals = it.next();
            o.LJIIIIZZ(mPendingRemovals, "mPendingRemovals");
            RecyclerView.ViewHolder viewHolder = mPendingRemovals;
            View view2 = viewHolder.itemView;
            o.LJIIIIZZ(view2, "holder.itemView");
            C87013YCz LJJIII = LJJIII(view2);
            c87010YCw.LJIILLIIL.add(viewHolder);
            LJJIII.LIZ.setDuration(c87010YCw.LIZLLL);
            LJJIII.LIZ.alpha(0.0f);
            LJJIII.LIZ(new ALAdapterS2S0400000_15(view2, viewHolder, LJJIII, c87010YCw, 11));
            LJJIII.LIZIZ();
        }
        c87010YCw.LJIIJ.clear();
        if (z2) {
            ArrayList arrayList = new ArrayList();
            arrayList.addAll(c87010YCw.LJIIL);
            c87010YCw.LJIIL.clear();
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                Object moves = it2.next();
                o.LJIIIIZZ(moves, "moves");
                YD1 yd1 = (YD1) moves;
                RecyclerView.ViewHolder viewHolder2 = yd1.LIZ;
                int i = yd1.LIZIZ;
                int i2 = yd1.LIZJ;
                int i3 = yd1.LIZLLL;
                int i4 = yd1.LJ;
                long j = c87010YCw.LJIJI;
                View view3 = viewHolder2.itemView;
                o.LJIIIIZZ(view3, "holder.itemView");
                int i5 = i3 - i;
                int i6 = i4 - i2;
                if (i5 != 0) {
                    LJJIII(view3).LIZ.translationX(0.0f);
                }
                if (i6 != 0) {
                    LJJIII(view3).LIZJ(0.0f);
                }
                C87013YCz LJJIII2 = LJJIII(view3);
                c87010YCw.LJIILL.add(viewHolder2);
                LJJIII2.LIZ.setDuration(j);
                LJJIII2.LIZ(new ALAdapterS0S0402000_15(c87010YCw, viewHolder2, i5, view3, i6, LJJIII2, 2));
                LJJIII2.LIZIZ();
            }
            arrayList.clear();
        }
        if (z3) {
            ArrayList arrayList2 = new ArrayList();
            arrayList2.addAll(c87010YCw.LJIILIIL);
            c87010YCw.LJIILIIL.clear();
            Iterator it3 = arrayList2.iterator();
            while (it3.hasNext()) {
                Object changes = it3.next();
                o.LJIIIIZZ(changes, "changes");
                C87012YCy c87012YCy = (C87012YCy) changes;
                RecyclerView.ViewHolder viewHolder3 = c87012YCy.LIZ;
                View view4 = null;
                if (viewHolder3 != null) {
                    view = viewHolder3.itemView;
                } else {
                    view = null;
                }
                RecyclerView.ViewHolder viewHolder4 = c87012YCy.LIZIZ;
                if (viewHolder4 != null) {
                    view4 = viewHolder4.itemView;
                }
                if (view != null) {
                    C87013YCz LJJIII3 = LJJIII(view);
                    LJJIII3.LIZ.setDuration(c87010YCw.LJFF);
                    c87010YCw.LJIIZILJ.add(c87012YCy.LIZ);
                    LJJIII3.LIZ.translationX(c87012YCy.LJ - c87012YCy.LIZJ);
                    LJJIII3.LIZJ(c87012YCy.LJFF - c87012YCy.LIZLLL);
                    LJJIII3.LIZ.alpha(0.0f);
                    LJJIII3.LIZ(new ALAdapterS2S0400000_15(c87010YCw, c87012YCy, LJJIII3, view, 9));
                    LJJIII3.LIZIZ();
                }
                if (view4 != null) {
                    C87013YCz LJJIII4 = LJJIII(view4);
                    c87010YCw.LJIIZILJ.add(c87012YCy.LIZIZ);
                    LJJIII4.LIZ.translationX(0.0f);
                    LJJIII4.LIZJ(0.0f);
                    LJJIII4.LIZ.setDuration(c87010YCw.LJFF);
                    LJJIII4.LIZ.alpha(1.0f);
                    c87010YCw = c87010YCw;
                    LJJIII4.LIZ(new ALAdapterS2S0400000_15(c87010YCw, c87012YCy, LJJIII4, view4, 10));
                    LJJIII4.LIZIZ();
                }
            }
            arrayList2.clear();
        }
        if (z4) {
            ArrayList arrayList3 = new ArrayList();
            arrayList3.addAll(c87010YCw.LJIIJJI);
            c87010YCw.LJIIJJI.clear();
            Iterator it4 = arrayList3.iterator();
            while (it4.hasNext()) {
                Object additions = it4.next();
                o.LJIIIIZZ(additions, "additions");
                RecyclerView.ViewHolder viewHolder5 = (RecyclerView.ViewHolder) additions;
                long j2 = c87010YCw.LJIJ;
                View view5 = viewHolder5.itemView;
                o.LJIIIIZZ(view5, "holder.itemView");
                C87013YCz LJJIII5 = LJJIII(view5);
                c87010YCw.LJIILJJIL.add(viewHolder5);
                LJJIII5.LIZJ(0.0f);
                LJJIII5.LIZ.setDuration(j2);
                LJJIII5.LIZ(new ALAdapterS2S0400000_15(view5, viewHolder5, LJJIII5, c87010YCw, 8));
                LJJIII5.LIZIZ();
            }
            arrayList3.clear();
        }
    }

    public final void LJJIFFI() {
        if (!LJIILJJIL()) {
            LJIIIIZZ();
        }
    }

    public static final C87013YCz LJJIII(View view) {
        if (view.getTag(R.id.lr5) == null) {
            C87013YCz c87013YCz = new C87013YCz(view);
            view.setTag(R.id.lr5, c87013YCz);
            return c87013YCz;
        }
        Object tag = view.getTag(R.id.lr5);
        o.LJII(tag, "null cannot be cast to non-null type com.bytedance.android.live.publicscreen.impl.itemAnim.AnimatorProxy");
        return (C87013YCz) tag;
    }

    @Override // X.AbstractC030109x
    public final void LJIIIZ(RecyclerView.ViewHolder item) {
        o.LJIIIZ(item, "item");
        View view = item.itemView;
        o.LJIIIIZZ(view, "item.itemView");
        LJJIII(view).LIZ.cancel();
        int size = this.LJIIL.size() - 1;
        if (size >= 0) {
            while (true) {
                int i = size - 1;
                Object obj = ListProtector.get(this.LJIIL, size);
                o.LJIIIIZZ(obj, "mPendingMoves[i]");
                if (((YD1) obj).LIZ == item) {
                    view.setTranslationY(0.0f);
                    view.setTranslationX(0.0f);
                    LJII(item);
                    ListProtector.remove(this.LJIIL, size);
                }
                if (i < 0) {
                    break;
                } else {
                    size = i;
                }
            }
        }
        ArrayList<C87012YCy> arrayList = this.LJIILIIL;
        int size2 = arrayList.size() - 1;
        if (size2 >= 0) {
            while (true) {
                int i2 = size2 - 1;
                C87012YCy c87012YCy = (C87012YCy) ListProtector.get(arrayList, size2);
                if (LJJII(c87012YCy, item) && c87012YCy.LIZ == null && c87012YCy.LIZIZ == null) {
                    arrayList.remove(c87012YCy);
                }
                if (i2 < 0) {
                    break;
                } else {
                    size2 = i2;
                }
            }
        }
        if (this.LJIIJ.remove(item)) {
            view.setAlpha(1.0f);
            LJII(item);
        }
        if (this.LJIIJJI.remove(item)) {
            view.setTranslationY(0.0f);
            LJIL(item);
        }
        this.LJIILLIIL.remove(item);
        this.LJIILJJIL.remove(item);
        this.LJIIZILJ.remove(item);
        this.LJIILL.remove(item);
        LJJIFFI();
    }

    @Override // X.AbstractC28931Bp
    public final void LJIJ(RecyclerView.ViewHolder holder) {
        o.LJIIIZ(holder, "holder");
        LJJIIJ(holder);
        this.LJIIJJI.add(holder);
        ArrayList<RecyclerView.ViewHolder> arrayList = this.LJIIJJI;
        if (arrayList.size() > 1) {
            C40675Fxn.LJJLIIIJ(arrayList, new IDComparatorS29S0000000_1(3));
        }
        Iterator<RecyclerView.ViewHolder> it = this.LJIIJJI.iterator();
        int i = 0;
        while (it.hasNext()) {
            RecyclerView.ViewHolder next = it.next();
            int i2 = i + 1;
            if (i >= 0) {
                RecyclerView.ViewHolder viewHolder = next;
                if (i == 0) {
                    Object parent = viewHolder.itemView.getParent();
                    o.LJII(parent, "null cannot be cast to non-null type android.view.View");
                    int bottom = ((View) parent).getBottom();
                    int bottom2 = viewHolder.itemView.getBottom();
                    viewHolder.itemView.setTranslationY(r1.getHeight() + (bottom - bottom2));
                } else {
                    viewHolder.itemView.setTranslationY(((RecyclerView.ViewHolder) ListProtector.get(this.LJIIJJI, i - 1)).itemView.getTranslationY());
                }
                i = i2;
            } else {
                C47261Igj.LJJJJJ();
                throw null;
            }
        }
    }

    @Override // X.AbstractC28931Bp
    public final void LJIJJLI(RecyclerView.ViewHolder holder) {
        o.LJIIIZ(holder, "holder");
        LJJIIJ(holder);
        this.LJIIJ.add(holder);
    }

    @Override // X.AbstractC28931Bp
    public final void LJJ(RecyclerView.ViewHolder viewHolder) {
        CSE cse;
        if ((viewHolder instanceof CSE) && (cse = (CSE) viewHolder) != null) {
            cse.P();
        }
        this.LJIJJ.invoke();
    }

    public final void LJJI(List<? extends RecyclerView.ViewHolder> viewHolders) {
        View view;
        o.LJIIIZ(viewHolders, "viewHolders");
        int size = ((ArrayList) viewHolders).size() - 1;
        if (size < 0) {
            return;
        }
        while (true) {
            int i = size - 1;
            RecyclerView.ViewHolder viewHolder = (RecyclerView.ViewHolder) ListProtector.get(viewHolders, size);
            if (viewHolder != null && (view = viewHolder.itemView) != null) {
                LJJIII(view).LIZ.cancel();
            }
            if (i < 0) {
                return;
            } else {
                size = i;
            }
        }
    }

    public final void LJJIIJ(RecyclerView.ViewHolder viewHolder) {
        View view = viewHolder.itemView;
        o.LJIIIIZZ(view, "holder.itemView");
        C87013YCz LJJIII = LJJIII(view);
        LJJIII.LIZ.setInterpolator(this.LJIIIZ);
        LJIIIZ(viewHolder);
    }

    public C87010YCw(Runnable runnable, Runnable runnable2) {
        this.LJII = runnable;
        this.LJIIIIZZ = runnable2;
    }

    @Override // X.AbstractC030109x
    public final boolean LJI(RecyclerView.ViewHolder viewHolder, List<? extends Object> payloads) {
        o.LJIIIZ(payloads, "payloads");
        if (!payloads.isEmpty() || LJFF(viewHolder)) {
            return true;
        }
        return false;
    }

    public final boolean LJJII(C87012YCy c87012YCy, RecyclerView.ViewHolder viewHolder) {
        View view;
        if (c87012YCy.LIZIZ == viewHolder) {
            c87012YCy.LIZIZ = null;
        } else if (c87012YCy.LIZ == viewHolder) {
            c87012YCy.LIZ = null;
        } else {
            return false;
        }
        if (viewHolder != null) {
            View view2 = viewHolder.itemView;
            if (view2 != null) {
                view2.setAlpha(1.0f);
            }
            if (viewHolder != null) {
                View view3 = viewHolder.itemView;
                if (view3 != null) {
                    view3.setTranslationX(0.0f);
                }
                if (viewHolder != null && (view = viewHolder.itemView) != null) {
                    view.setTranslationY(0.0f);
                }
            }
        }
        LJII(viewHolder);
        return true;
    }

    @Override // X.AbstractC28931Bp, X.AbstractC030109x
    public final boolean LIZJ(RecyclerView.ViewHolder viewHolder, C030009w preLayoutInfo, C030009w c030009w) {
        int left;
        int top;
        o.LJIIIZ(viewHolder, "viewHolder");
        o.LJIIIZ(preLayoutInfo, "preLayoutInfo");
        int i = preLayoutInfo.LIZ;
        int i2 = preLayoutInfo.LIZIZ;
        View view = viewHolder.itemView;
        o.LJIIIIZZ(view, "viewHolder.itemView");
        if (c030009w != null) {
            left = c030009w.LIZ;
        } else {
            left = view.getLeft();
        }
        if (c030009w != null) {
            top = c030009w.LIZIZ;
        } else {
            top = view.getTop();
        }
        if ((preLayoutInfo.LJ & 8) != 8) {
            if (i != left || i2 != top) {
                view.layout(left, top, view.getWidth() + left, view.getHeight() + top);
                return LJIJJ(viewHolder, i, i2, left, top);
            }
            LJII(viewHolder);
            LJJIFFI();
            return false;
        }
        LJIJJLI(viewHolder);
        return true;
    }

    @Override // X.AbstractC030109x
    public final C030009w LJIILLIIL(C0AC state, RecyclerView.ViewHolder viewHolder, int i, List<Object> payloads) {
        o.LJIIIZ(state, "state");
        o.LJIIIZ(payloads, "payloads");
        C030009w LJIILLIIL = super.LJIILLIIL(state, viewHolder, i, payloads);
        LJIILLIIL.LJ = i;
        return LJIILLIIL;
    }

    @Override // X.AbstractC28931Bp
    public final boolean LJIJJ(RecyclerView.ViewHolder holder, int i, int i2, int i3, int i4) {
        o.LJIIIZ(holder, "holder");
        View view = holder.itemView;
        o.LJIIIIZZ(view, "holder.itemView");
        int translationY = i2 + ((int) holder.itemView.getTranslationY());
        int i5 = i4 - translationY;
        if (i5 == 0) {
            LJJIIJ(holder);
            LJII(holder);
            return false;
        }
        View view2 = holder.itemView;
        o.LJIIIIZZ(view2, "holder.itemView");
        if (LJJIII(view2).LIZJ) {
            View view3 = holder.itemView;
            o.LJIIIIZZ(view3, "holder.itemView");
            if (LJJIII(view3).LIZIZ == 0.0f) {
                LJII(holder);
                LJJIFFI();
                return false;
            }
        }
        LJJIIJ(holder);
        view.setTranslationY(-i5);
        this.LJIIL.add(new YD1(holder, i, translationY, i3, i4));
        return true;
    }

    @Override // X.AbstractC28931Bp
    public final boolean LJIJI(int i, int i2, int i3, int i4, RecyclerView.ViewHolder viewHolder, RecyclerView.ViewHolder viewHolder2) {
        if (viewHolder == viewHolder2) {
            return LJIJJ(viewHolder, i, i2, i3, i4);
        }
        float translationX = viewHolder.itemView.getTranslationX();
        float translationY = viewHolder.itemView.getTranslationY();
        float alpha = viewHolder.itemView.getAlpha();
        LJJIIJ(viewHolder);
        viewHolder.itemView.setTranslationX(translationX);
        viewHolder.itemView.setTranslationY(translationY);
        viewHolder.itemView.setAlpha(alpha);
        LJJIIJ(viewHolder2);
        viewHolder2.itemView.setTranslationX(-((int) ((i3 - i) - translationX)));
        viewHolder2.itemView.setTranslationY(-((int) ((i4 - i2) - translationY)));
        viewHolder2.itemView.setAlpha(0.0f);
        this.LJIILIIL.add(new C87012YCy(i, i2, i3, i4, viewHolder, viewHolder2));
        return true;
    }
}
