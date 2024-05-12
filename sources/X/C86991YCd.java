package X;

import android.view.View;
import android.view.ViewPropertyAnimator;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.Interpolator;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.ies.powerlist.PowerCell;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.relation.usercard.impl.cell.AbsAuthCell;
import com.ss.android.ugc.aweme.relation.usercard.impl.cell.AbsRecUserCell;
import com.ss.android.ugc.aweme.relation.usercard.impl.cell.FixedCell;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.YCd, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C86991YCd extends AbstractC28931Bp {
    public static final C5H3<AccelerateDecelerateInterpolator> LJIJI = C27484AqW.LJIIIIZZ(C86995YCh.LJLIL);
    public static final C5H3<Interpolator> LJIJJ = C27484AqW.LJIIIIZZ(C86994YCg.LJLIL);
    public final java.util.Map<String, Boolean> LJII = new LinkedHashMap();
    public final ArrayList<RecyclerView.ViewHolder> LJIIIIZZ;
    public final ArrayList<RecyclerView.ViewHolder> LJIIIZ;
    public final ArrayList<C86993YCf> LJIIJ;
    public final ArrayList<C86992YCe> LJIIJJI;
    public final ArrayList<ArrayList<RecyclerView.ViewHolder>> LJIIL;
    public final ArrayList<ArrayList<C86993YCf>> LJIILIIL;
    public final ArrayList<ArrayList<C86992YCe>> LJIILJJIL;
    public final ArrayList<RecyclerView.ViewHolder> LJIILL;
    public final ArrayList<RecyclerView.ViewHolder> LJIILLIIL;
    public final ArrayList<RecyclerView.ViewHolder> LJIIZILJ;
    public final ArrayList<RecyclerView.ViewHolder> LJIJ;

    @Override // X.AbstractC030109x
    public final void LJIIJ() {
        for (int size = this.LJIIJ.size() - 1; -1 < size; size--) {
            Object obj = ListProtector.get(this.LJIIJ, size);
            o.LJIIIIZZ(obj, "pendingMoves[i]");
            C86993YCf c86993YCf = (C86993YCf) obj;
            View view = c86993YCf.LIZ.itemView;
            o.LJIIIIZZ(view, "item.holder.itemView");
            view.setTranslationY(0.0f);
            view.setTranslationX(0.0f);
            LJII(c86993YCf.LIZ);
            ListProtector.remove(this.LJIIJ, size);
        }
        for (int size2 = this.LJIIIIZZ.size() - 1; -1 < size2; size2--) {
            Object obj2 = ListProtector.get(this.LJIIIIZZ, size2);
            o.LJIIIIZZ(obj2, "pendingRemovals[i]");
            LJII((RecyclerView.ViewHolder) obj2);
            ListProtector.remove(this.LJIIIIZZ, size2);
        }
        for (int size3 = this.LJIIIZ.size() - 1; -1 < size3; size3--) {
            Object obj3 = ListProtector.get(this.LJIIIZ, size3);
            o.LJIIIIZZ(obj3, "pendingAdditions[i]");
            RecyclerView.ViewHolder viewHolder = (RecyclerView.ViewHolder) obj3;
            viewHolder.itemView.setAlpha(1.0f);
            LJIL(viewHolder);
            ListProtector.remove(this.LJIIIZ, size3);
        }
        for (int size4 = this.LJIIJJI.size() - 1; -1 < size4; size4--) {
            Object obj4 = ListProtector.get(this.LJIIJJI, size4);
            o.LJIIIIZZ(obj4, "pendingChanges[i]");
            C86992YCe c86992YCe = (C86992YCe) obj4;
            RecyclerView.ViewHolder viewHolder2 = c86992YCe.LIZ;
            if (viewHolder2 != null) {
                LJJIII(c86992YCe, viewHolder2);
            }
            RecyclerView.ViewHolder viewHolder3 = c86992YCe.LIZIZ;
            if (viewHolder3 != null) {
                LJJIII(c86992YCe, viewHolder3);
            }
        }
        this.LJIIJJI.clear();
        if (!LJIILJJIL()) {
            return;
        }
        for (int size5 = this.LJIILIIL.size() - 1; -1 < size5; size5--) {
            Object obj5 = ListProtector.get(this.LJIILIIL, size5);
            o.LJIIIIZZ(obj5, "movesList[i]");
            ArrayList arrayList = (ArrayList) obj5;
            for (int size6 = arrayList.size() - 1; -1 < size6; size6--) {
                Object obj6 = ListProtector.get(arrayList, size6);
                o.LJIIIIZZ(obj6, "moves[j]");
                C86993YCf c86993YCf2 = (C86993YCf) obj6;
                View view2 = c86993YCf2.LIZ.itemView;
                o.LJIIIIZZ(view2, "item.itemView");
                view2.setTranslationY(0.0f);
                view2.setTranslationX(0.0f);
                LJII(c86993YCf2.LIZ);
                ListProtector.remove(arrayList, size6);
                if (arrayList.isEmpty()) {
                    this.LJIILIIL.remove(arrayList);
                }
            }
        }
        for (int size7 = this.LJIIL.size() - 1; -1 < size7; size7--) {
            Object obj7 = ListProtector.get(this.LJIIL, size7);
            o.LJIIIIZZ(obj7, "additionsList[i]");
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
                    this.LJIIL.remove(arrayList2);
                }
            }
        }
        for (int size9 = this.LJIILJJIL.size() - 1; -1 < size9; size9--) {
            Object obj9 = ListProtector.get(this.LJIILJJIL, size9);
            o.LJIIIIZZ(obj9, "changesList[i]");
            ArrayList arrayList3 = (ArrayList) obj9;
            for (int size10 = arrayList3.size() - 1; -1 < size10; size10--) {
                Object obj10 = ListProtector.get(arrayList3, size10);
                o.LJIIIIZZ(obj10, "changes[j]");
                C86992YCe c86992YCe2 = (C86992YCe) obj10;
                RecyclerView.ViewHolder viewHolder5 = c86992YCe2.LIZ;
                if (viewHolder5 != null) {
                    LJJIII(c86992YCe2, viewHolder5);
                }
                RecyclerView.ViewHolder viewHolder6 = c86992YCe2.LIZIZ;
                if (viewHolder6 != null) {
                    LJJIII(c86992YCe2, viewHolder6);
                }
                if (arrayList3.isEmpty()) {
                    this.LJIILJJIL.remove(arrayList3);
                }
            }
        }
        LJJI(this.LJIIZILJ);
        LJJI(this.LJIILLIIL);
        LJJI(this.LJIILL);
        LJJI(this.LJIJ);
        LJIIIIZZ();
    }

    @Override // X.AbstractC030109x
    public final boolean LJIILJJIL() {
        if (!this.LJIIIZ.isEmpty() || !this.LJIIJJI.isEmpty() || !this.LJIIJ.isEmpty() || !this.LJIIIIZZ.isEmpty() || !this.LJIILLIIL.isEmpty() || !this.LJIIZILJ.isEmpty() || !this.LJIILL.isEmpty() || !this.LJIJ.isEmpty() || !this.LJIILIIL.isEmpty() || !this.LJIIL.isEmpty() || !this.LJIILJJIL.isEmpty()) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:51:0x014d  */
    @Override // X.AbstractC030109x
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJIIZILJ() {
        /*
            Method dump skipped, instructions count: 389
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C86991YCd.LJIIZILJ():void");
    }

    public C86991YCd() {
        this.LJ = 350L;
        this.LIZJ = 350L;
        this.LJIIIIZZ = new ArrayList<>();
        this.LJIIIZ = new ArrayList<>();
        this.LJIIJ = new ArrayList<>();
        this.LJIIJJI = new ArrayList<>();
        this.LJIIL = new ArrayList<>();
        this.LJIILIIL = new ArrayList<>();
        this.LJIILJJIL = new ArrayList<>();
        this.LJIILL = new ArrayList<>();
        this.LJIILLIIL = new ArrayList<>();
        this.LJIIZILJ = new ArrayList<>();
        this.LJIJ = new ArrayList<>();
    }

    public final void LJJIFFI() {
        if (!LJIILJJIL()) {
            LJIIIIZZ();
        }
    }

    public static final void LJJI(List<? extends RecyclerView.ViewHolder> viewHolders) {
        View view;
        ViewPropertyAnimator animate;
        o.LJIIIZ(viewHolders, "viewHolders");
        int size = viewHolders.size() - 1;
        if (size < 0) {
            return;
        }
        while (true) {
            int i = size - 1;
            RecyclerView.ViewHolder viewHolder = (RecyclerView.ViewHolder) ListProtector.get(viewHolders, size);
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
        int size = this.LJIIJ.size() - 1;
        if (size >= 0) {
            while (true) {
                int i = size - 1;
                Object obj = ListProtector.get(this.LJIIJ, size);
                o.LJIIIIZZ(obj, "pendingMoves[i]");
                if (((C86993YCf) obj).LIZ == item) {
                    view.setTranslationY(0.0f);
                    view.setTranslationX(0.0f);
                    LJII(item);
                    ListProtector.remove(this.LJIIJ, size);
                }
                if (i < 0) {
                    break;
                } else {
                    size = i;
                }
            }
        }
        LJJII(item, this.LJIIJJI);
        if (this.LJIIIIZZ.remove(item)) {
            view.setAlpha(1.0f);
            LJII(item);
        }
        if (this.LJIIIZ.remove(item)) {
            view.setAlpha(1.0f);
            LJIL(item);
        }
        int size2 = this.LJIILJJIL.size() - 1;
        if (size2 >= 0) {
            while (true) {
                int i2 = size2 - 1;
                Object obj2 = ListProtector.get(this.LJIILJJIL, size2);
                o.LJIIIIZZ(obj2, "changesList[i]");
                ArrayList arrayList = (ArrayList) obj2;
                LJJII(item, arrayList);
                if (arrayList.isEmpty()) {
                    ListProtector.remove(this.LJIILJJIL, size2);
                }
                if (i2 < 0) {
                    break;
                } else {
                    size2 = i2;
                }
            }
        }
        int size3 = this.LJIILIIL.size() - 1;
        if (size3 >= 0) {
            while (true) {
                int i3 = size3 - 1;
                Object obj3 = ListProtector.get(this.LJIILIIL, size3);
                o.LJIIIIZZ(obj3, "movesList[i]");
                ArrayList arrayList2 = (ArrayList) obj3;
                int size4 = arrayList2.size() - 1;
                if (size4 >= 0) {
                    while (true) {
                        int i4 = size4 - 1;
                        Object obj4 = ListProtector.get(arrayList2, size4);
                        o.LJIIIIZZ(obj4, "moves[j]");
                        if (((C86993YCf) obj4).LIZ == item) {
                            view.setTranslationY(0.0f);
                            view.setTranslationX(0.0f);
                            LJII(item);
                            ListProtector.remove(arrayList2, size4);
                            if (arrayList2.isEmpty()) {
                                ListProtector.remove(this.LJIILIIL, size3);
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
        int size5 = this.LJIIL.size() - 1;
        if (size5 >= 0) {
            while (true) {
                int i5 = size5 - 1;
                Object obj5 = ListProtector.get(this.LJIIL, size5);
                o.LJIIIIZZ(obj5, "additionsList[i]");
                ArrayList arrayList3 = (ArrayList) obj5;
                if (arrayList3.remove(item)) {
                    view.setAlpha(1.0f);
                    LJIL(item);
                    if (arrayList3.isEmpty()) {
                        ListProtector.remove(this.LJIIL, size5);
                    }
                }
                if (i5 < 0) {
                    break;
                } else {
                    size5 = i5;
                }
            }
        }
        this.LJIIZILJ.remove(item);
        this.LJIILL.remove(item);
        this.LJIJ.remove(item);
        this.LJIILLIIL.remove(item);
        LJJIFFI();
    }

    @Override // X.AbstractC28931Bp
    public final void LJIJ(RecyclerView.ViewHolder holder) {
        o.LJIIIZ(holder, "holder");
        LJJIIJ(holder);
        holder.itemView.setAlpha(0.0f);
        if (LJJIIJZLJL(holder)) {
            holder.itemView.setTranslationX(C32151Nz.LJIIZILJ(36));
        }
        this.LJIIIZ.add(holder);
    }

    @Override // X.AbstractC28931Bp
    public final void LJIJJLI(RecyclerView.ViewHolder holder) {
        o.LJIIIZ(holder, "holder");
        LJJIIJ(holder);
        this.LJIIIIZZ.add(holder);
    }

    public final void LJJIIJ(RecyclerView.ViewHolder viewHolder) {
        boolean z;
        if ((viewHolder instanceof AbsRecUserCell) || (viewHolder instanceof AbsAuthCell) || (viewHolder instanceof FixedCell)) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            viewHolder.itemView.animate().setInterpolator(LJIJJ.getValue()).setStartDelay(0L);
        } else {
            viewHolder.itemView.animate().setInterpolator(LJIJI.getValue()).setStartDelay(0L);
        }
        LJIIIZ(viewHolder);
    }

    public final boolean LJJIIJZLJL(RecyclerView.ViewHolder viewHolder) {
        PowerCell powerCell;
        C57826Mmk c57826Mmk;
        if (viewHolder instanceof AbsRecUserCell) {
            powerCell = (PowerCell) viewHolder;
        } else {
            powerCell = null;
        }
        if (powerCell == null || (c57826Mmk = (C57826Mmk) powerCell.getItem()) == null || !c57826Mmk.LJLJI.isRelatedRec()) {
            return false;
        }
        return !o.LJ(((LinkedHashMap) this.LJII).get(c57826Mmk.LJLJI.getElementId()), Boolean.TRUE);
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
            C86992YCe c86992YCe = (C86992YCe) ListProtector.get(list, size);
            if (LJJIII(c86992YCe, viewHolder) && c86992YCe.LIZ == null && c86992YCe.LIZIZ == null) {
                list.remove(c86992YCe);
            }
            if (i < 0) {
                return;
            } else {
                size = i;
            }
        }
    }

    public final boolean LJJIII(C86992YCe c86992YCe, RecyclerView.ViewHolder viewHolder) {
        if (viewHolder == null) {
            return false;
        }
        if (c86992YCe.LIZIZ == viewHolder) {
            c86992YCe.LIZIZ = null;
        } else {
            if (c86992YCe.LIZ != viewHolder) {
                return false;
            }
            c86992YCe.LIZ = null;
        }
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
            java.util.ArrayList<X.YCf> r0 = r8.LJIIJ
            X.YCf r2 = new X.YCf
            r2.<init>(r3, r4, r5, r6, r7)
            r0.add(r2)
            r0 = 1
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C86991YCd.LJIJJ(androidx.recyclerview.widget.RecyclerView$ViewHolder, int, int, int, int):boolean");
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
        this.LJIIJJI.add(new C86992YCe(i, i2, i3, i4, viewHolder, viewHolder2));
        return true;
    }
}
