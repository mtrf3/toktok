package X;

import Y.IDLAdapterS0S0400000;
import Y.IDRunnableS29S0200000;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewPropertyAnimator;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.1ou, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public class C44521ou extends AbstractC28931Bp {
    public static TimeInterpolator LJIJ;
    public final ArrayList<RecyclerView.ViewHolder> LJII = new ArrayList<>();
    public final ArrayList<RecyclerView.ViewHolder> LJIIIIZZ = new ArrayList<>();
    public final ArrayList<C14K> LJIIIZ = new ArrayList<>();
    public final ArrayList<C14I> LJIIJ = new ArrayList<>();
    public final ArrayList<ArrayList<RecyclerView.ViewHolder>> LJIIJJI = new ArrayList<>();
    public final ArrayList<ArrayList<C14K>> LJIIL = new ArrayList<>();
    public final ArrayList<ArrayList<C14I>> LJIILIIL = new ArrayList<>();
    public final ArrayList<RecyclerView.ViewHolder> LJIILJJIL = new ArrayList<>();
    public final ArrayList<RecyclerView.ViewHolder> LJIILL = new ArrayList<>();
    public final ArrayList<RecyclerView.ViewHolder> LJIILLIIL = new ArrayList<>();
    public final ArrayList<RecyclerView.ViewHolder> LJIIZILJ = new ArrayList<>();

    @Override // X.AbstractC030109x
    public final void LJIIJ() {
        for (int size = this.LJIIIZ.size() - 1; -1 < size; size--) {
            Object obj = ListProtector.get(this.LJIIIZ, size);
            o.LJIIIIZZ(obj, "mPendingMoves[i]");
            C14K c14k = (C14K) obj;
            View view = c14k.LIZ.itemView;
            o.LJIIIIZZ(view, "item.holder.itemView");
            view.setTranslationY(0.0f);
            view.setTranslationX(0.0f);
            LJII(c14k.LIZ);
            ListProtector.remove(this.LJIIIZ, size);
        }
        for (int size2 = this.LJII.size() - 1; -1 < size2; size2--) {
            Object obj2 = ListProtector.get(this.LJII, size2);
            o.LJIIIIZZ(obj2, "mPendingRemovals[i]");
            LJII((RecyclerView.ViewHolder) obj2);
            ListProtector.remove(this.LJII, size2);
        }
        for (int size3 = this.LJIIIIZZ.size() - 1; -1 < size3; size3--) {
            Object obj3 = ListProtector.get(this.LJIIIIZZ, size3);
            o.LJIIIIZZ(obj3, "mPendingAdditions[i]");
            RecyclerView.ViewHolder viewHolder = (RecyclerView.ViewHolder) obj3;
            viewHolder.itemView.setAlpha(1.0f);
            LJIL(viewHolder);
            ListProtector.remove(this.LJIIIIZZ, size3);
        }
        for (int size4 = this.LJIIJ.size() - 1; -1 < size4; size4--) {
            Object obj4 = ListProtector.get(this.LJIIJ, size4);
            o.LJIIIIZZ(obj4, "mPendingChanges[i]");
            C14I c14i = (C14I) obj4;
            RecyclerView.ViewHolder viewHolder2 = c14i.LIZ;
            if (viewHolder2 != null) {
                LJJIII(c14i, viewHolder2);
            }
            RecyclerView.ViewHolder viewHolder3 = c14i.LIZIZ;
            if (viewHolder3 != null) {
                LJJIII(c14i, viewHolder3);
            }
        }
        this.LJIIJ.clear();
        if (!LJIILJJIL()) {
            return;
        }
        for (int size5 = this.LJIIL.size() - 1; -1 < size5; size5--) {
            Object obj5 = ListProtector.get(this.LJIIL, size5);
            o.LJIIIIZZ(obj5, "mMovesList[i]");
            ArrayList arrayList = (ArrayList) obj5;
            for (int size6 = arrayList.size() - 1; -1 < size6; size6--) {
                Object obj6 = ListProtector.get(arrayList, size6);
                o.LJIIIIZZ(obj6, "moves[j]");
                C14K c14k2 = (C14K) obj6;
                View view2 = c14k2.LIZ.itemView;
                o.LJIIIIZZ(view2, "item.itemView");
                view2.setTranslationY(0.0f);
                view2.setTranslationX(0.0f);
                LJII(c14k2.LIZ);
                ListProtector.remove(arrayList, size6);
                if (arrayList.isEmpty()) {
                    this.LJIIL.remove(arrayList);
                }
            }
        }
        for (int size7 = this.LJIIJJI.size() - 1; -1 < size7; size7--) {
            Object obj7 = ListProtector.get(this.LJIIJJI, size7);
            o.LJIIIIZZ(obj7, "mAdditionsList[i]");
            ArrayList arrayList2 = (ArrayList) obj7;
            for (int size8 = arrayList2.size() - 1; -1 < size8; size8--) {
                Object obj8 = ListProtector.get(arrayList2, size8);
                o.LJIIIIZZ(obj8, "additions[j]");
                RecyclerView.ViewHolder viewHolder4 = (RecyclerView.ViewHolder) obj8;
                View view3 = viewHolder4.itemView;
                o.LJIIIIZZ(view3, "item.itemView");
                view3.setAlpha(1.0f);
                LJIL(viewHolder4);
                ListProtector.remove(arrayList2, size8);
                if (arrayList2.isEmpty()) {
                    this.LJIIJJI.remove(arrayList2);
                }
            }
        }
        for (int size9 = this.LJIILIIL.size() - 1; -1 < size9; size9--) {
            Object obj9 = ListProtector.get(this.LJIILIIL, size9);
            o.LJIIIIZZ(obj9, "mChangesList[i]");
            ArrayList arrayList3 = (ArrayList) obj9;
            for (int size10 = arrayList3.size() - 1; -1 < size10; size10--) {
                Object obj10 = ListProtector.get(arrayList3, size10);
                o.LJIIIIZZ(obj10, "changes[j]");
                C14I c14i2 = (C14I) obj10;
                RecyclerView.ViewHolder viewHolder5 = c14i2.LIZ;
                if (viewHolder5 != null) {
                    LJJIII(c14i2, viewHolder5);
                }
                RecyclerView.ViewHolder viewHolder6 = c14i2.LIZIZ;
                if (viewHolder6 != null) {
                    LJJIII(c14i2, viewHolder6);
                }
                if (arrayList3.isEmpty()) {
                    this.LJIILIIL.remove(arrayList3);
                }
            }
        }
        LJJI(this.LJIILLIIL);
        LJJI(this.LJIILL);
        LJJI(this.LJIILJJIL);
        LJJI(this.LJIIZILJ);
        LJIIIIZZ();
    }

    @Override // X.AbstractC030109x
    public final boolean LJIILJJIL() {
        if (!this.LJIIIIZZ.isEmpty() || !this.LJIIJ.isEmpty() || !this.LJIIIZ.isEmpty() || !this.LJII.isEmpty() || !this.LJIILL.isEmpty() || !this.LJIILLIIL.isEmpty() || !this.LJIILJJIL.isEmpty() || !this.LJIIZILJ.isEmpty() || !this.LJIIL.isEmpty() || !this.LJIIJJI.isEmpty() || !this.LJIILIIL.isEmpty()) {
            return true;
        }
        return false;
    }

    @Override // X.AbstractC030109x
    public final void LJIIZILJ() {
        long j;
        long j2;
        boolean z = !this.LJII.isEmpty();
        boolean z2 = !this.LJIIIZ.isEmpty();
        boolean z3 = !this.LJIIJ.isEmpty();
        boolean z4 = !this.LJIIIIZZ.isEmpty();
        if (!z && !z2 && !z4 && !z3) {
            return;
        }
        Iterator<RecyclerView.ViewHolder> it = this.LJII.iterator();
        while (it.hasNext()) {
            RecyclerView.ViewHolder mPendingRemovals = it.next();
            o.LJIIIIZZ(mPendingRemovals, "mPendingRemovals");
            RecyclerView.ViewHolder viewHolder = mPendingRemovals;
            C0NB.LIZIZ("BaseAnimator", "animateRemoveImpl");
            View view = viewHolder.itemView;
            o.LJIIIIZZ(view, "holder.itemView");
            ViewPropertyAnimator animate = view.animate();
            this.LJIILLIIL.add(viewHolder);
            animate.setDuration(this.LIZLLL).alpha(0.0f).setListener(new IDLAdapterS0S0400000(view, animate, viewHolder, this, 8)).start();
        }
        this.LJII.clear();
        if (z2) {
            ArrayList<C14K> arrayList = new ArrayList<>();
            arrayList.addAll(this.LJIIIZ);
            this.LJIIL.add(arrayList);
            this.LJIIIZ.clear();
            IDRunnableS29S0200000 iDRunnableS29S0200000 = new IDRunnableS29S0200000(arrayList, this, 49);
            if (z) {
                View view2 = ((C14K) ListProtector.get(arrayList, 0)).LIZ.itemView;
                o.LJIIIIZZ(view2, "moves[0].holder.itemView");
                C16300kU.LJIILIIL(view2, iDRunnableS29S0200000, this.LIZLLL);
            } else {
                iDRunnableS29S0200000.run();
            }
        }
        if (z3) {
            ArrayList<C14I> arrayList2 = new ArrayList<>();
            arrayList2.addAll(this.LJIIJ);
            this.LJIILIIL.add(arrayList2);
            this.LJIIJ.clear();
            IDRunnableS29S0200000 iDRunnableS29S02000002 = new IDRunnableS29S0200000(arrayList2, this, 48);
            if (z) {
                RecyclerView.ViewHolder viewHolder2 = ((C14I) ListProtector.get(arrayList2, 0)).LIZ;
                o.LJI(viewHolder2);
                C16300kU.LJIILIIL(viewHolder2.itemView, iDRunnableS29S02000002, this.LIZLLL);
            } else {
                iDRunnableS29S02000002.run();
            }
        }
        if (z4) {
            ArrayList<RecyclerView.ViewHolder> arrayList3 = new ArrayList<>();
            arrayList3.addAll(this.LJIIIIZZ);
            this.LJIIJJI.add(arrayList3);
            this.LJIIIIZZ.clear();
            IDRunnableS29S0200000 iDRunnableS29S02000003 = new IDRunnableS29S0200000(arrayList3, this, 47);
            if (z || z2 || z3) {
                long j3 = 0;
                if (z) {
                    j = this.LIZLLL;
                } else {
                    j = 0;
                }
                if (z2) {
                    j2 = this.LJ;
                } else {
                    j2 = 0;
                }
                if (z3) {
                    j3 = this.LJFF;
                }
                long max = Math.max(j2, j3) + j;
                View view3 = ((RecyclerView.ViewHolder) ListProtector.get(arrayList3, 0)).itemView;
                o.LJIIIIZZ(view3, "additions[0].itemView");
                C16300kU.LJIILIIL(view3, iDRunnableS29S02000003, max);
                return;
            }
            iDRunnableS29S02000003.run();
        }
    }

    public final void LJJIFFI() {
        if (!LJIILJJIL()) {
            LJIIIIZZ();
        }
    }

    public static final void LJJI(List<? extends RecyclerView.ViewHolder> viewHolders) {
        o.LJIIIZ(viewHolders, "viewHolders");
        int size = viewHolders.size() - 1;
        if (size < 0) {
            return;
        }
        while (true) {
            int i = size - 1;
            Object obj = ListProtector.get(viewHolders, size);
            o.LJI(obj);
            ((RecyclerView.ViewHolder) obj).itemView.animate().cancel();
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
        int size = this.LJIIIZ.size() - 1;
        if (size >= 0) {
            while (true) {
                int i = size - 1;
                Object obj = ListProtector.get(this.LJIIIZ, size);
                o.LJIIIIZZ(obj, "mPendingMoves[i]");
                if (((C14K) obj).LIZ == item) {
                    view.setTranslationY(0.0f);
                    view.setTranslationX(0.0f);
                    LJII(item);
                    ListProtector.remove(this.LJIIIZ, size);
                }
                if (i < 0) {
                    break;
                } else {
                    size = i;
                }
            }
        }
        LJJII(item, this.LJIIJ);
        if (this.LJII.remove(item)) {
            view.setAlpha(1.0f);
            LJII(item);
        }
        if (this.LJIIIIZZ.remove(item)) {
            view.setAlpha(1.0f);
            LJIL(item);
        }
        int size2 = this.LJIILIIL.size() - 1;
        if (size2 >= 0) {
            while (true) {
                int i2 = size2 - 1;
                Object obj2 = ListProtector.get(this.LJIILIIL, size2);
                o.LJIIIIZZ(obj2, "mChangesList[i]");
                ArrayList arrayList = (ArrayList) obj2;
                LJJII(item, arrayList);
                if (arrayList.isEmpty()) {
                    ListProtector.remove(this.LJIILIIL, size2);
                }
                if (i2 < 0) {
                    break;
                } else {
                    size2 = i2;
                }
            }
        }
        int size3 = this.LJIIL.size() - 1;
        if (size3 >= 0) {
            while (true) {
                int i3 = size3 - 1;
                Object obj3 = ListProtector.get(this.LJIIL, size3);
                o.LJIIIIZZ(obj3, "mMovesList[i]");
                ArrayList arrayList2 = (ArrayList) obj3;
                int size4 = arrayList2.size() - 1;
                if (size4 >= 0) {
                    while (true) {
                        int i4 = size4 - 1;
                        Object obj4 = ListProtector.get(arrayList2, size4);
                        o.LJIIIIZZ(obj4, "moves[j]");
                        if (((C14K) obj4).LIZ == item) {
                            view.setTranslationY(0.0f);
                            view.setTranslationX(0.0f);
                            LJII(item);
                            ListProtector.remove(arrayList2, size4);
                            if (arrayList2.isEmpty()) {
                                ListProtector.remove(this.LJIIL, size3);
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
        int size5 = this.LJIIJJI.size() - 1;
        if (size5 >= 0) {
            while (true) {
                int i5 = size5 - 1;
                Object obj5 = ListProtector.get(this.LJIIJJI, size5);
                o.LJIIIIZZ(obj5, "mAdditionsList[i]");
                ArrayList arrayList3 = (ArrayList) obj5;
                if (arrayList3.remove(item)) {
                    view.setAlpha(1.0f);
                    LJIL(item);
                    if (arrayList3.isEmpty()) {
                        ListProtector.remove(this.LJIIJJI, size5);
                    }
                }
                if (i5 < 0) {
                    break;
                } else {
                    size5 = i5;
                }
            }
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
        holder.itemView.setAlpha(0.0f);
        this.LJIIIIZZ.add(holder);
    }

    @Override // X.AbstractC28931Bp
    public final void LJIJJLI(RecyclerView.ViewHolder holder) {
        o.LJIIIZ(holder, "holder");
        LJJIIJ(holder);
        this.LJII.add(holder);
    }

    public final void LJJIIJ(RecyclerView.ViewHolder viewHolder) {
        if (LJIJ == null) {
            LJIJ = new ValueAnimator().getInterpolator();
        }
        viewHolder.itemView.animate().setInterpolator(LJIJ);
        LJIIIZ(viewHolder);
    }

    @Override // X.AbstractC030109x
    public final boolean LJI(RecyclerView.ViewHolder viewHolder, List<? extends Object> payloads) {
        o.LJIIIZ(payloads, "payloads");
        if (!payloads.isEmpty() || LJFF(viewHolder)) {
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
            C14I c14i = (C14I) ListProtector.get(list, size);
            if (LJJIII(c14i, viewHolder) && c14i.LIZ == null && c14i.LIZIZ == null) {
                list.remove(c14i);
            }
            if (i < 0) {
                return;
            } else {
                size = i;
            }
        }
    }

    public final boolean LJJIII(C14I c14i, RecyclerView.ViewHolder viewHolder) {
        if (c14i.LIZIZ == viewHolder) {
            c14i.LIZIZ = null;
        } else if (c14i.LIZ == viewHolder) {
            c14i.LIZ = null;
        } else {
            return false;
        }
        o.LJI(viewHolder);
        viewHolder.itemView.setAlpha(1.0f);
        viewHolder.itemView.setTranslationX(0.0f);
        viewHolder.itemView.setTranslationY(0.0f);
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
            java.util.ArrayList<X.14K> r0 = r8.LJIIIZ
            X.14K r2 = new X.14K
            r2.<init>(r3, r4, r5, r6, r7)
            r0.add(r2)
            r0 = 1
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C44521ou.LJIJJ(androidx.recyclerview.widget.RecyclerView$ViewHolder, int, int, int, int):boolean");
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
        this.LJIIJ.add(new C14I(i, i2, i3, i4, viewHolder, viewHolder2));
        return true;
    }
}
