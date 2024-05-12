package X;

import Y.ALAdapterS2S0400000_15;
import Y.ARunnableS34S0200000_15;
import android.animation.TimeInterpolator;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.PathInterpolator;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.YCr, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C87005YCr extends AbstractC28931Bp {
    public final TimeInterpolator LJII = new AccelerateDecelerateInterpolator();
    public final PathInterpolator LJIIIIZZ = new PathInterpolator(0.4f, 0.8f, 0.74f, 1.0f);
    public final ArrayList<RecyclerView.ViewHolder> LJIIIZ = new ArrayList<>();
    public final ArrayList<RecyclerView.ViewHolder> LJIIJ = new ArrayList<>();
    public final ArrayList<C87007YCt> LJIIJJI = new ArrayList<>();
    public final ArrayList<C87006YCs> LJIIL = new ArrayList<>();
    public final ArrayList<ArrayList<RecyclerView.ViewHolder>> LJIILIIL = new ArrayList<>();
    public final ArrayList<ArrayList<C87007YCt>> LJIILJJIL = new ArrayList<>();
    public final ArrayList<ArrayList<C87006YCs>> LJIILL = new ArrayList<>();
    public final ArrayList<RecyclerView.ViewHolder> LJIILLIIL = new ArrayList<>();
    public final ArrayList<RecyclerView.ViewHolder> LJIIZILJ = new ArrayList<>();
    public final ArrayList<RecyclerView.ViewHolder> LJIJ = new ArrayList<>();
    public final ArrayList<RecyclerView.ViewHolder> LJIJI = new ArrayList<>();
    public final long LJIJJ = 120;
    public final long LJIJJLI = 120;
    public final long LJIL = 240;
    public final long LJJ = 240;
    public final long LJJI = 240;
    public final long LJJIFFI = 240;
    public final long LJJII = 240;
    public final C87008YCu LJJIII = C87008YCu.LJLIL;

    @Override // X.AbstractC030109x
    public final void LJIIZILJ() {
        long j;
        boolean z = !this.LJIIIZ.isEmpty();
        boolean z2 = !this.LJIIJJI.isEmpty();
        boolean z3 = !this.LJIIL.isEmpty();
        boolean z4 = !this.LJIIJ.isEmpty();
        if (!z && !z2 && !z4 && !z3) {
            return;
        }
        Iterator<RecyclerView.ViewHolder> it = this.LJIIIZ.iterator();
        while (it.hasNext()) {
            RecyclerView.ViewHolder pendingRemovals = it.next();
            o.LJIIIIZZ(pendingRemovals, "pendingRemovals");
            RecyclerView.ViewHolder viewHolder = pendingRemovals;
            View view = viewHolder.itemView;
            o.LJIIIIZZ(view, "holder.itemView");
            ViewPropertyAnimator animate = view.animate();
            this.LJIJ.add(viewHolder);
            animate.setDuration(this.LIZLLL).alpha(0.0f).setListener(new ALAdapterS2S0400000_15(view, animate, viewHolder, this, 22)).start();
        }
        this.LJIIIZ.clear();
        if (z2) {
            ArrayList<C87007YCt> arrayList = new ArrayList<>();
            arrayList.addAll(this.LJIIJJI);
            this.LJIILJJIL.add(arrayList);
            this.LJIIJJI.clear();
            ARunnableS34S0200000_15 aRunnableS34S0200000_15 = new ARunnableS34S0200000_15(arrayList, this, 61);
            if (z) {
                View view2 = ((C87007YCt) ListProtector.get(arrayList, 0)).LIZ.itemView;
                o.LJIIIIZZ(view2, "moves[0].holder.itemView");
                C16300kU.LJIILIIL(view2, aRunnableS34S0200000_15, this.LIZLLL);
            } else {
                aRunnableS34S0200000_15.run();
            }
        }
        if (z3) {
            ArrayList<C87006YCs> arrayList2 = new ArrayList<>();
            arrayList2.addAll(this.LJIIL);
            this.LJIILL.add(arrayList2);
            this.LJIIL.clear();
            ARunnableS34S0200000_15 aRunnableS34S0200000_152 = new ARunnableS34S0200000_15(arrayList2, this, 60);
            if (z) {
                RecyclerView.ViewHolder viewHolder2 = ((C87006YCs) ListProtector.get(arrayList2, 0)).LIZ;
                if (viewHolder2 != null) {
                    C16300kU.LJIILIIL(viewHolder2.itemView, aRunnableS34S0200000_152, this.LIZLLL);
                }
            } else {
                aRunnableS34S0200000_152.run();
            }
        }
        if (z4) {
            ArrayList<RecyclerView.ViewHolder> arrayList3 = new ArrayList<>();
            arrayList3.addAll(this.LJIIJ);
            this.LJIILIIL.add(arrayList3);
            this.LJIIJ.clear();
            ARunnableS34S0200000_15 aRunnableS34S0200000_153 = new ARunnableS34S0200000_15(arrayList3, this, 59);
            if (!z) {
                if (z2 || z3) {
                    j = 0;
                } else {
                    aRunnableS34S0200000_153.run();
                    return;
                }
            } else {
                j = this.LIZLLL;
            }
            View view3 = ((RecyclerView.ViewHolder) ListProtector.get(arrayList3, 0)).itemView;
            o.LJIIIIZZ(view3, "additions[0].itemView");
            C16300kU.LJIILIIL(view3, aRunnableS34S0200000_153, j);
        }
    }

    @Override // X.AbstractC030109x
    public final void LJIIJ() {
        for (int size = this.LJIIJJI.size() - 1; -1 < size; size--) {
            Object obj = ListProtector.get(this.LJIIJJI, size);
            o.LJIIIIZZ(obj, "pendingMoves[i]");
            C87007YCt c87007YCt = (C87007YCt) obj;
            View view = c87007YCt.LIZ.itemView;
            o.LJIIIIZZ(view, "item.holder.itemView");
            view.setTranslationY(0.0f);
            view.setTranslationX(0.0f);
            LJII(c87007YCt.LIZ);
            ListProtector.remove(this.LJIIJJI, size);
        }
        for (int size2 = this.LJIIIZ.size() - 1; -1 < size2; size2--) {
            Object obj2 = ListProtector.get(this.LJIIIZ, size2);
            o.LJIIIIZZ(obj2, "pendingRemovals[i]");
            LJII((RecyclerView.ViewHolder) obj2);
            ListProtector.remove(this.LJIIIZ, size2);
        }
        for (int size3 = this.LJIIJ.size() - 1; -1 < size3; size3--) {
            Object obj3 = ListProtector.get(this.LJIIJ, size3);
            o.LJIIIIZZ(obj3, "pendingAdditions[i]");
            RecyclerView.ViewHolder viewHolder = (RecyclerView.ViewHolder) obj3;
            viewHolder.itemView.setTranslationY(0.0f);
            LJIL(viewHolder);
            ListProtector.remove(this.LJIIJ, size3);
        }
        for (int size4 = this.LJIIL.size() - 1; -1 < size4; size4--) {
            Object obj4 = ListProtector.get(this.LJIIL, size4);
            o.LJIIIIZZ(obj4, "pendingChanges[i]");
            C87006YCs c87006YCs = (C87006YCs) obj4;
            RecyclerView.ViewHolder viewHolder2 = c87006YCs.LIZ;
            if (viewHolder2 != null) {
                LJJIII(c87006YCs, viewHolder2);
            }
            RecyclerView.ViewHolder viewHolder3 = c87006YCs.LIZIZ;
            if (viewHolder3 != null) {
                LJJIII(c87006YCs, viewHolder3);
            }
        }
        this.LJIIL.clear();
        if (!LJIILJJIL()) {
            return;
        }
        for (int size5 = this.LJIILJJIL.size() - 1; -1 < size5; size5--) {
            Object obj5 = ListProtector.get(this.LJIILJJIL, size5);
            o.LJIIIIZZ(obj5, "movesList[i]");
            ArrayList arrayList = (ArrayList) obj5;
            for (int size6 = arrayList.size() - 1; -1 < size6; size6--) {
                Object obj6 = ListProtector.get(arrayList, size6);
                o.LJIIIIZZ(obj6, "moves[j]");
                C87007YCt c87007YCt2 = (C87007YCt) obj6;
                View view2 = c87007YCt2.LIZ.itemView;
                o.LJIIIIZZ(view2, "item.itemView");
                view2.setTranslationY(0.0f);
                view2.setTranslationX(0.0f);
                LJII(c87007YCt2.LIZ);
                ListProtector.remove(arrayList, size6);
                if (arrayList.isEmpty()) {
                    this.LJIILJJIL.remove(arrayList);
                }
            }
        }
        for (int size7 = this.LJIILIIL.size() - 1; -1 < size7; size7--) {
            Object obj7 = ListProtector.get(this.LJIILIIL, size7);
            o.LJIIIIZZ(obj7, "additionsList[i]");
            ArrayList arrayList2 = (ArrayList) obj7;
            for (int size8 = arrayList2.size() - 1; -1 < size8; size8--) {
                Object obj8 = ListProtector.get(arrayList2, size8);
                o.LJIIIIZZ(obj8, "additions[j]");
                RecyclerView.ViewHolder viewHolder4 = (RecyclerView.ViewHolder) obj8;
                View view3 = viewHolder4.itemView;
                o.LJIIIIZZ(view3, "item.itemView");
                view3.setTranslationY(0.0f);
                LJIL(viewHolder4);
                ListProtector.remove(arrayList2, size8);
                if (arrayList2.isEmpty()) {
                    this.LJIILIIL.remove(arrayList2);
                }
            }
        }
        for (int size9 = this.LJIILL.size() - 1; -1 < size9; size9--) {
            Object obj9 = ListProtector.get(this.LJIILL, size9);
            o.LJIIIIZZ(obj9, "changesList[i]");
            ArrayList arrayList3 = (ArrayList) obj9;
            for (int size10 = arrayList3.size() - 1; -1 < size10; size10--) {
                Object obj10 = ListProtector.get(arrayList3, size10);
                o.LJIIIIZZ(obj10, "changes[j]");
                C87006YCs c87006YCs2 = (C87006YCs) obj10;
                RecyclerView.ViewHolder viewHolder5 = c87006YCs2.LIZ;
                if (viewHolder5 != null) {
                    LJJIII(c87006YCs2, viewHolder5);
                }
                RecyclerView.ViewHolder viewHolder6 = c87006YCs2.LIZIZ;
                if (viewHolder6 != null) {
                    LJJIII(c87006YCs2, viewHolder6);
                }
                if (arrayList3.isEmpty()) {
                    this.LJIILL.remove(arrayList3);
                }
            }
        }
        LJJI(this.LJIJ);
        LJJI(this.LJIIZILJ);
        LJJI(this.LJIILLIIL);
        LJJI(this.LJIJI);
        LJIIIIZZ();
    }

    @Override // X.AbstractC030109x
    public final boolean LJIILJJIL() {
        if ((!this.LJIIJ.isEmpty()) || (!this.LJIIL.isEmpty()) || (!this.LJIIJJI.isEmpty()) || (!this.LJIIIZ.isEmpty()) || (!this.LJIIZILJ.isEmpty()) || (!this.LJIJ.isEmpty()) || (!this.LJIILLIIL.isEmpty()) || (!this.LJIJI.isEmpty()) || (!this.LJIILJJIL.isEmpty()) || (!this.LJIILIIL.isEmpty()) || (!this.LJIILL.isEmpty())) {
            return true;
        }
        return false;
    }

    public final void LJJIFFI() {
        if (!LJIILJJIL()) {
            LJIIIIZZ();
        }
    }

    public static final void LJJI(List<? extends RecyclerView.ViewHolder> list) {
        View view;
        ViewPropertyAnimator animate;
        int size = list.size() - 1;
        if (size < 0) {
            return;
        }
        while (true) {
            int i = size - 1;
            RecyclerView.ViewHolder viewHolder = (RecyclerView.ViewHolder) ListProtector.get(list, size);
            if (viewHolder != null && (view = viewHolder.itemView) != null && (animate = view.animate()) != null) {
                animate.cancel();
            }
            if (i < 0) {
                return;
            } else {
                size = i;
            }
        }
    }

    @Override // X.AbstractC030109x
    public final void LJIIIZ(RecyclerView.ViewHolder item) {
        o.LJIIIZ(item, "item");
        View view = item.itemView;
        o.LJIIIIZZ(view, "item.itemView");
        view.animate().cancel();
        int size = this.LJIIJJI.size() - 1;
        if (size >= 0) {
            while (true) {
                int i = size - 1;
                Object obj = ListProtector.get(this.LJIIJJI, size);
                o.LJIIIIZZ(obj, "pendingMoves[i]");
                if (((C87007YCt) obj).LIZ == item) {
                    view.setTranslationY(0.0f);
                    view.setTranslationX(0.0f);
                    LJII(item);
                    ListProtector.remove(this.LJIIJJI, size);
                }
                if (i < 0) {
                    break;
                } else {
                    size = i;
                }
            }
        }
        LJJII(item, this.LJIIL);
        if (this.LJIIIZ.remove(item)) {
            view.setAlpha(1.0f);
            LJII(item);
        }
        if (this.LJIIJ.remove(item)) {
            view.setTranslationY(0.0f);
            LJIL(item);
        }
        int size2 = this.LJIILL.size() - 1;
        if (size2 >= 0) {
            while (true) {
                int i2 = size2 - 1;
                Object obj2 = ListProtector.get(this.LJIILL, size2);
                o.LJIIIIZZ(obj2, "changesList[i]");
                ArrayList arrayList = (ArrayList) obj2;
                LJJII(item, arrayList);
                if (arrayList.isEmpty()) {
                    ListProtector.remove(this.LJIILL, size2);
                }
                if (i2 < 0) {
                    break;
                } else {
                    size2 = i2;
                }
            }
        }
        int size3 = this.LJIILJJIL.size() - 1;
        if (size3 >= 0) {
            while (true) {
                int i3 = size3 - 1;
                Object obj3 = ListProtector.get(this.LJIILJJIL, size3);
                o.LJIIIIZZ(obj3, "movesList[i]");
                ArrayList arrayList2 = (ArrayList) obj3;
                int size4 = arrayList2.size() - 1;
                if (size4 >= 0) {
                    while (true) {
                        int i4 = size4 - 1;
                        Object obj4 = ListProtector.get(arrayList2, size4);
                        o.LJIIIIZZ(obj4, "moves[j]");
                        if (((C87007YCt) obj4).LIZ == item) {
                            view.setTranslationY(0.0f);
                            view.setTranslationX(0.0f);
                            LJII(item);
                            ListProtector.remove(arrayList2, size4);
                            if (arrayList2.isEmpty()) {
                                ListProtector.remove(this.LJIILJJIL, size3);
                            }
                        } else if (i4 < 0) {
                            break;
                        } else {
                            size4 = i4;
                        }
                    }
                }
                if (i3 < 0) {
                    break;
                } else {
                    size3 = i3;
                }
            }
        }
        int size5 = this.LJIILIIL.size() - 1;
        if (size5 >= 0) {
            while (true) {
                int i5 = size5 - 1;
                Object obj5 = ListProtector.get(this.LJIILIIL, size5);
                o.LJIIIIZZ(obj5, "additionsList[i]");
                ArrayList arrayList3 = (ArrayList) obj5;
                if (arrayList3.remove(item)) {
                    view.setTranslationY(0.0f);
                    LJIL(item);
                    if (arrayList3.isEmpty()) {
                        ListProtector.remove(this.LJIILIIL, size5);
                    }
                }
                if (i5 < 0) {
                    break;
                } else {
                    size5 = i5;
                }
            }
        }
        this.LJIJ.remove(item);
        this.LJIILLIIL.remove(item);
        this.LJIJI.remove(item);
        this.LJIIZILJ.remove(item);
        LJJIFFI();
    }

    @Override // X.AbstractC28931Bp
    public final void LJIJ(RecyclerView.ViewHolder holder) {
        o.LJIIIZ(holder, "holder");
        LJJIIJ(holder);
        holder.itemView.setAlpha(0.0f);
        this.LJIIJ.add(holder);
    }

    @Override // X.AbstractC28931Bp
    public final void LJIJJLI(RecyclerView.ViewHolder holder) {
        o.LJIIIZ(holder, "holder");
        LJJIIJ(holder);
        this.LJIIIZ.add(holder);
    }

    @Override // X.AbstractC28931Bp
    public final void LJJ(RecyclerView.ViewHolder viewHolder) {
        this.LJJIII.getClass();
    }

    public final void LJJIIJ(RecyclerView.ViewHolder viewHolder) {
        viewHolder.itemView.animate().setInterpolator(this.LJII);
        LJIIIZ(viewHolder);
    }

    @Override // X.AbstractC030109x
    public final boolean LJI(RecyclerView.ViewHolder viewHolder, List<? extends Object> payloads) {
        o.LJIIIZ(payloads, "payloads");
        if ((!payloads.isEmpty()) || LJFF(viewHolder)) {
            return true;
        }
        return false;
    }

    public final void LJJII(RecyclerView.ViewHolder viewHolder, List list) {
        int size = list.size() - 1;
        if (size < 0) {
            return;
        }
        while (true) {
            int i = size - 1;
            C87006YCs c87006YCs = (C87006YCs) ListProtector.get(list, size);
            if (LJJIII(c87006YCs, viewHolder) && c87006YCs.LIZ == null && c87006YCs.LIZIZ == null) {
                list.remove(c87006YCs);
            }
            if (i < 0) {
                return;
            } else {
                size = i;
            }
        }
    }

    public final boolean LJJIII(C87006YCs c87006YCs, RecyclerView.ViewHolder viewHolder) {
        View view;
        if (c87006YCs.LIZIZ == viewHolder) {
            c87006YCs.LIZIZ = null;
        } else if (c87006YCs.LIZ == viewHolder) {
            c87006YCs.LIZ = null;
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

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0036, code lost:
    
        if (r1 != 0) goto L9;
     */
    @Override // X.AbstractC28931Bp
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean LJIJJ(androidx.recyclerview.widget.RecyclerView.ViewHolder r9, int r10, int r11, int r12, int r13) {
        /*
            r8 = this;
            r4 = r10
            r5 = r11
            java.lang.String r0 = "holder"
            r3 = r9
            kotlin.jvm.internal.o.LJIIIZ(r3, r0)
            android.view.View r2 = r3.itemView
            java.lang.String r0 = "holder.itemView"
            kotlin.jvm.internal.o.LJIIIIZZ(r2, r0)
            android.view.View r0 = r3.itemView
            float r0 = r0.getTranslationX()
            int r0 = (int) r0
            int r4 = r4 + r0
            android.view.View r0 = r3.itemView
            float r0 = r0.getTranslationY()
            int r0 = (int) r0
            int r5 = r5 + r0
            r8.LJJIIJ(r3)
            r6 = r12
            int r0 = r6 - r4
            r7 = r13
            int r1 = r7 - r5
            if (r0 != 0) goto L31
            if (r1 != 0) goto L38
            r8.LJII(r3)
            r0 = 0
            return r0
        L31:
            float r0 = (float) r0
            float r0 = -r0
            r2.setTranslationX(r0)
            if (r1 == 0) goto L3d
        L38:
            float r0 = (float) r1
            float r0 = -r0
            r2.setTranslationY(r0)
        L3d:
            java.util.ArrayList<X.YCt> r0 = r8.LJIIJJI
            X.YCt r2 = new X.YCt
            r2.<init>(r3, r4, r5, r6, r7)
            r0.add(r2)
            r0 = 1
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C87005YCr.LJIJJ(androidx.recyclerview.widget.RecyclerView$ViewHolder, int, int, int, int):boolean");
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
        this.LJIIL.add(new C87006YCs(i, i2, i3, i4, viewHolder, viewHolder2));
        return true;
    }
}
