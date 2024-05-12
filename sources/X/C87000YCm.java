package X;

import Y.ALAdapterS0S0402000_15;
import Y.ALAdapterS2S0400000_15;
import android.view.View;
import android.view.ViewPropertyAnimator;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.YCm, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C87000YCm extends AbstractC28931Bp {
    public final VLL LJII;
    public final WJA LJIIIIZZ;
    public final ArrayList<RecyclerView.ViewHolder> LJIIIZ;
    public final ArrayList<C87003YCp> LJIIJ;
    public final ArrayList<C87002YCo> LJIIJJI;
    public final ArrayList<C87001YCn> LJIIL;
    public final ArrayList<ArrayList<C87003YCp>> LJIILIIL;
    public final ArrayList<ArrayList<C87002YCo>> LJIILJJIL;
    public final ArrayList<ArrayList<C87001YCn>> LJIILL;
    public final ArrayList<RecyclerView.ViewHolder> LJIILLIIL;
    public final ArrayList<RecyclerView.ViewHolder> LJIIZILJ;
    public final ArrayList<RecyclerView.ViewHolder> LJIJ;
    public final ArrayList<RecyclerView.ViewHolder> LJIJI;

    @Override // X.AbstractC030109x
    public final void LJIIJ() {
        View view;
        View view2;
        View view3;
        View view4;
        for (int size = this.LJIIJJI.size() - 1; -1 < size; size--) {
            Object obj = ListProtector.get(this.LJIIJJI, size);
            o.LJIIIIZZ(obj, "pendingMoves[i]");
            C87002YCo c87002YCo = (C87002YCo) obj;
            RecyclerView.ViewHolder viewHolder = c87002YCo.LIZ;
            if (viewHolder != null && (view4 = viewHolder.itemView) != null) {
                view4.setTranslationY(0.0f);
                view4.setTranslationX(0.0f);
            }
            LJII(c87002YCo.LIZ);
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
            C87003YCp c87003YCp = (C87003YCp) obj3;
            RecyclerView.ViewHolder viewHolder2 = c87003YCp.LIZ;
            if (viewHolder2 != null && (view3 = viewHolder2.itemView) != null) {
                view3.setAlpha(1.0f);
            }
            LJIL(c87003YCp.LIZ);
            ListProtector.remove(this.LJIIJ, size3);
        }
        for (int size4 = this.LJIIL.size() - 1; -1 < size4; size4--) {
            Object obj4 = ListProtector.get(this.LJIIL, size4);
            o.LJIIIIZZ(obj4, "pendingChanges[i]");
            C87001YCn c87001YCn = (C87001YCn) obj4;
            RecyclerView.ViewHolder viewHolder3 = c87001YCn.LIZ;
            RecyclerView.ViewHolder viewHolder4 = c87001YCn.LIZIZ;
            if (viewHolder3 != null) {
                LJJIII(c87001YCn, viewHolder3);
            }
            if (viewHolder4 != null) {
                LJJIII(c87001YCn, viewHolder4);
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
                C87002YCo c87002YCo2 = (C87002YCo) obj6;
                RecyclerView.ViewHolder viewHolder5 = c87002YCo2.LIZ;
                if (viewHolder5 != null && (view2 = viewHolder5.itemView) != null) {
                    view2.setTranslationY(0.0f);
                    view2.setTranslationX(0.0f);
                }
                LJII(c87002YCo2.LIZ);
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
                C87003YCp c87003YCp2 = (C87003YCp) obj8;
                RecyclerView.ViewHolder viewHolder6 = c87003YCp2.LIZ;
                if (viewHolder6 != null && (view = viewHolder6.itemView) != null) {
                    view.setAlpha(1.0f);
                }
                LJIL(c87003YCp2.LIZ);
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
                C87001YCn c87001YCn2 = (C87001YCn) obj10;
                RecyclerView.ViewHolder viewHolder7 = c87001YCn2.LIZ;
                RecyclerView.ViewHolder viewHolder8 = c87001YCn2.LIZIZ;
                if (viewHolder7 != null) {
                    LJJIII(c87001YCn2, viewHolder7);
                }
                if (viewHolder8 != null) {
                    LJJIII(c87001YCn2, viewHolder8);
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

    @Override // X.AbstractC030109x
    public final void LJIIZILJ() {
        float f;
        long j;
        View view;
        float f2;
        ViewPropertyAnimator alpha;
        ViewPropertyAnimator duration;
        ViewPropertyAnimator listener;
        View view2;
        boolean z = !this.LJIIIZ.isEmpty();
        boolean z2 = !this.LJIIJJI.isEmpty();
        boolean z3 = !this.LJIIL.isEmpty();
        boolean z4 = !this.LJIIJ.isEmpty();
        if (!z && !z2 && !z4 && !z3) {
            return;
        }
        Iterator<RecyclerView.ViewHolder> it = this.LJIIIZ.iterator();
        while (true) {
            f = 0.0f;
            j = 200;
            if (!it.hasNext()) {
                break;
            }
            RecyclerView.ViewHolder holder = it.next();
            o.LJIIIIZZ(holder, "holder");
            View view3 = holder.itemView;
            o.LJIIIIZZ(view3, "holder.itemView");
            ViewPropertyAnimator animate = view3.animate();
            this.LJIJ.add(holder);
            animate.setDuration(200L).alpha(0.0f).setListener(new ALAdapterS2S0400000_15(this, holder, animate, view3, 15)).start();
        }
        this.LJIIIZ.clear();
        if (z2) {
            ArrayList<C87002YCo> arrayList = new ArrayList<>();
            arrayList.addAll(this.LJIIJJI);
            this.LJIILJJIL.add(arrayList);
            this.LJIIJJI.clear();
            Iterator<C87002YCo> it2 = arrayList.iterator();
            while (it2.hasNext()) {
                C87002YCo next = it2.next();
                RecyclerView.ViewHolder viewHolder = next.LIZ;
                if (viewHolder != null) {
                    int i = next.LIZIZ;
                    int i2 = next.LIZJ;
                    int i3 = next.LIZLLL;
                    int i4 = next.LJ;
                    View view4 = viewHolder.itemView;
                    o.LJIIIIZZ(view4, "holder.itemView");
                    ViewPropertyAnimator animate2 = view4.animate();
                    int i5 = i3 - i;
                    int i6 = i4 - i2;
                    if (i5 != 0) {
                        animate2.translationX(f);
                    }
                    if (i6 != 0) {
                        animate2.translationY(f);
                    }
                    this.LJIIZILJ.add(viewHolder);
                    animate2.setDuration(j).setListener(new ALAdapterS0S0402000_15(this, viewHolder, i5, view4, i6, animate2, 3)).start();
                    f = 0.0f;
                    j = 200;
                }
            }
            arrayList.clear();
            this.LJIILJJIL.remove(arrayList);
        }
        if (z3) {
            ArrayList<C87001YCn> arrayList2 = new ArrayList<>();
            arrayList2.addAll(this.LJIIL);
            this.LJIILL.add(arrayList2);
            this.LJIIL.clear();
            Iterator<C87001YCn> it3 = arrayList2.iterator();
            while (it3.hasNext()) {
                C87001YCn change = it3.next();
                o.LJIIIIZZ(change, "change");
                RecyclerView.ViewHolder viewHolder2 = change.LIZ;
                View view5 = null;
                if (viewHolder2 != null) {
                    view2 = viewHolder2.itemView;
                } else {
                    view2 = null;
                }
                RecyclerView.ViewHolder viewHolder3 = change.LIZIZ;
                if (viewHolder3 != null) {
                    view5 = viewHolder3.itemView;
                }
                if (view2 != null) {
                    ViewPropertyAnimator duration2 = view2.animate().setDuration(j);
                    o.LJIIIIZZ(duration2, "view.animate().setDuration(DURATION)");
                    this.LJIJI.add(change.LIZ);
                    duration2.translationX(change.LJ - change.LIZJ);
                    duration2.translationY(change.LJFF - change.LIZLLL);
                    duration2.setListener(new ALAdapterS2S0400000_15(this, change, duration2, view2, 13)).start();
                }
                if (view5 != null) {
                    ViewPropertyAnimator animate3 = view5.animate();
                    this.LJIJI.add(change.LIZIZ);
                    animate3.alpha(1.0f);
                    animate3.translationX(0.0f).translationY(0.0f).setDuration(j).setListener(new ALAdapterS2S0400000_15(this, change, animate3, view5, 14)).start();
                }
            }
            arrayList2.clear();
            this.LJIILL.remove(arrayList2);
        }
        if (z4) {
            ArrayList<C87003YCp> arrayList3 = new ArrayList<>();
            arrayList3.addAll(this.LJIIJ);
            this.LJIILIIL.add(arrayList3);
            this.LJIIJ.clear();
            Iterator<C87003YCp> it4 = arrayList3.iterator();
            while (it4.hasNext()) {
                C87003YCp addInfo = it4.next();
                o.LJIIIIZZ(addInfo, "addInfo");
                RecyclerView.ViewHolder viewHolder4 = addInfo.LIZ;
                if (viewHolder4 != null && (view = viewHolder4.itemView) != null) {
                    ViewPropertyAnimator animate4 = view.animate();
                    if (addInfo.LIZJ != 0 && animate4 != null) {
                        f2 = 0.0f;
                        animate4.translationX(0.0f);
                    } else {
                        f2 = 0.0f;
                    }
                    if (addInfo.LIZIZ != 0 && animate4 != null) {
                        animate4.translationY(f2);
                    }
                    this.LJIILLIIL.add(addInfo.LIZ);
                    if (animate4 != null && (alpha = animate4.alpha(1.0f)) != null && (duration = alpha.setDuration(j)) != null && (listener = duration.setListener(new ALAdapterS2S0400000_15(this, addInfo, view, animate4, 12))) != null) {
                        listener.start();
                    }
                }
            }
            arrayList3.clear();
            this.LJIILIIL.remove(arrayList3);
        }
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
                if (((C87002YCo) obj).LIZ == item) {
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
        int size2 = this.LJIIJ.size() - 1;
        if (size2 >= 0) {
            while (true) {
                int i2 = size2 - 1;
                Object obj2 = ListProtector.get(this.LJIIJ, size2);
                o.LJIIIIZZ(obj2, "pendingAdditions[i]");
                if (((C87003YCp) obj2).LIZ == item) {
                    view.setTranslationX(0.0f);
                    view.setTranslationY(0.0f);
                    view.setAlpha(1.0f);
                    LJIL(item);
                    ListProtector.remove(this.LJIIJ, size2);
                }
                if (i2 < 0) {
                    break;
                } else {
                    size2 = i2;
                }
            }
        }
        int size3 = this.LJIILL.size() - 1;
        if (size3 >= 0) {
            while (true) {
                int i3 = size3 - 1;
                Object obj3 = ListProtector.get(this.LJIILL, size3);
                o.LJIIIIZZ(obj3, "changesList[i]");
                ArrayList arrayList = (ArrayList) obj3;
                LJJII(item, arrayList);
                if (arrayList.isEmpty()) {
                    ListProtector.remove(this.LJIILL, size3);
                }
                if (i3 < 0) {
                    break;
                } else {
                    size3 = i3;
                }
            }
        }
        int size4 = this.LJIILJJIL.size() - 1;
        if (size4 >= 0) {
            while (true) {
                int i4 = size4 - 1;
                Object obj4 = ListProtector.get(this.LJIILJJIL, size4);
                o.LJIIIIZZ(obj4, "movesList[i]");
                ArrayList arrayList2 = (ArrayList) obj4;
                int size5 = arrayList2.size() - 1;
                if (size5 >= 0) {
                    while (true) {
                        int i5 = size5 - 1;
                        Object obj5 = ListProtector.get(arrayList2, size5);
                        o.LJIIIIZZ(obj5, "moves[j]");
                        if (((C87002YCo) obj5).LIZ == item) {
                            view.setTranslationY(0.0f);
                            view.setTranslationX(0.0f);
                            LJII(item);
                            ListProtector.remove(arrayList2, size5);
                            if (arrayList2.isEmpty()) {
                                ListProtector.remove(this.LJIILJJIL, size4);
                            }
                        } else if (i5 < 0) {
                            break;
                        } else {
                            size5 = i5;
                        }
                    }
                }
                if (i4 < 0) {
                    break;
                } else {
                    size4 = i4;
                }
            }
        }
        int size6 = this.LJIILIIL.size() - 1;
        if (size6 >= 0) {
            while (true) {
                int i6 = size6 - 1;
                Object obj6 = ListProtector.get(this.LJIILIIL, size6);
                o.LJIIIIZZ(obj6, "additionsList[i]");
                ArrayList arrayList3 = (ArrayList) obj6;
                int size7 = arrayList3.size() - 1;
                if (size7 >= 0) {
                    while (true) {
                        int i7 = size7 - 1;
                        Object obj7 = ListProtector.get(arrayList3, size7);
                        o.LJIIIIZZ(obj7, "additions[j]");
                        if (((C87003YCp) obj7).LIZ == item) {
                            view.setTranslationY(0.0f);
                            view.setTranslationX(0.0f);
                            view.setAlpha(1.0f);
                            LJIL(item);
                            ListProtector.remove(arrayList3, size7);
                            if (arrayList3.isEmpty()) {
                                ListProtector.remove(this.LJIILIIL, size6);
                            }
                        }
                        if (i7 < 0) {
                            break;
                        } else {
                            size7 = i7;
                        }
                    }
                }
                if (i6 < 0) {
                    break;
                } else {
                    size6 = i6;
                }
            }
        }
        LJJIFFI();
    }

    @Override // X.AbstractC28931Bp
    public final void LJIJ(RecyclerView.ViewHolder holder) {
        int itemCount;
        int i;
        o.LJIIIZ(holder, "holder");
        LJJIIJ(holder);
        View view = holder.itemView;
        o.LJIIIIZZ(view, "holder.itemView");
        view.setAlpha(0.0f);
        if (this.LJII == VLL.FIXED) {
            itemCount = this.LJIIIIZZ.LIZLLL();
        } else {
            itemCount = this.LJIIIIZZ.getItemCount();
        }
        int adapterPosition = holder.getAdapterPosition();
        int measuredHeight = view.getMeasuredHeight();
        if (adapterPosition > itemCount && (i = (adapterPosition - itemCount) * measuredHeight) != 0) {
            view.setTranslationY(-i);
            this.LJIIJ.add(new C87003YCp(holder, i));
        } else {
            this.LJIIJ.add(new C87003YCp(holder, 0));
        }
    }

    @Override // X.AbstractC28931Bp
    public final void LJIJJLI(RecyclerView.ViewHolder holder) {
        o.LJIIIZ(holder, "holder");
        LJJIIJ(holder);
        this.LJIIIZ.add(holder);
    }

    public final void LJJIIJ(RecyclerView.ViewHolder viewHolder) {
        if (viewHolder != null) {
            viewHolder.itemView.animate().setInterpolator(new C81272Vv2());
            LJIIIZ(viewHolder);
        }
    }

    public C87000YCm(VLL region, WJA toolbarManager) {
        o.LJIIIZ(region, "region");
        o.LJIIIZ(toolbarManager, "toolbarManager");
        this.LJII = region;
        this.LJIIIIZZ = toolbarManager;
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
        this.LJIJI = new ArrayList<>();
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
            C87001YCn c87001YCn = (C87001YCn) ListProtector.get(list, size);
            if (LJJIII(c87001YCn, viewHolder) && c87001YCn.LIZ == null && c87001YCn.LIZIZ == null) {
                list.remove(c87001YCn);
            }
            if (i < 0) {
                return;
            } else {
                size = i;
            }
        }
    }

    public final boolean LJJIII(C87001YCn c87001YCn, RecyclerView.ViewHolder viewHolder) {
        if (c87001YCn.LIZIZ == viewHolder) {
            c87001YCn.LIZIZ = null;
        } else if (c87001YCn.LIZ == viewHolder) {
            c87001YCn.LIZ = null;
        } else {
            return false;
        }
        viewHolder.itemView.setAlpha(1.0f);
        viewHolder.itemView.setTranslationX(0.0f);
        viewHolder.itemView.setTranslationY(0.0f);
        LJII(viewHolder);
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0039, code lost:
    
        if (r1 != 0) goto L25;
     */
    @Override // X.AbstractC28931Bp
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean LJIJJ(androidx.recyclerview.widget.RecyclerView.ViewHolder r10, int r11, int r12, int r13, int r14) {
        /*
            r9 = this;
            r4 = r10
            r5 = r11
            r6 = r12
            if (r4 == 0) goto L35
            android.view.View r2 = r4.itemView
        L7:
            r3 = 0
            if (r4 == 0) goto L33
            android.view.View r0 = r4.itemView
            if (r0 == 0) goto L33
            float r0 = r0.getTranslationX()
            int r0 = (int) r0
        L13:
            int r5 = r5 + r0
            if (r4 == 0) goto L31
            android.view.View r0 = r4.itemView
            if (r0 == 0) goto L31
            float r0 = r0.getTranslationY()
            int r0 = (int) r0
        L1f:
            int r6 = r6 + r0
            r9.LJJIIJ(r4)
            r7 = r13
            int r0 = r7 - r5
            r8 = r14
            int r1 = r8 - r6
            if (r0 != 0) goto L37
            if (r1 != 0) goto L3b
            r9.LJII(r4)
            return r3
        L31:
            r0 = 0
            goto L1f
        L33:
            r0 = 0
            goto L13
        L35:
            r2 = 0
            goto L7
        L37:
            if (r2 != 0) goto L4f
        L39:
            if (r1 == 0) goto L3d
        L3b:
            if (r2 != 0) goto L49
        L3d:
            java.util.ArrayList<X.YCo> r0 = r9.LJIIJJI
            X.YCo r3 = new X.YCo
            r3.<init>(r4, r5, r6, r7, r8)
            r0.add(r3)
            r0 = 1
            return r0
        L49:
            float r0 = (float) r1
            float r0 = -r0
            r2.setTranslationY(r0)
            goto L3d
        L4f:
            float r0 = (float) r0
            float r0 = -r0
            r2.setTranslationX(r0)
            goto L39
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C87000YCm.LJIJJ(androidx.recyclerview.widget.RecyclerView$ViewHolder, int, int, int, int):boolean");
    }

    @Override // X.AbstractC28931Bp
    public final boolean LJIJI(int i, int i2, int i3, int i4, RecyclerView.ViewHolder viewHolder, RecyclerView.ViewHolder viewHolder2) {
        float f;
        float f2;
        float f3;
        if (viewHolder == viewHolder2) {
            return LJIJJ(viewHolder, i, i2, i3, i4);
        }
        View view = viewHolder.itemView;
        if (view != null) {
            f = view.getTranslationX();
        } else {
            f = 0.0f;
        }
        View view2 = viewHolder.itemView;
        if (view2 != null) {
            f2 = view2.getTranslationY();
        } else {
            f2 = 0.0f;
        }
        View view3 = viewHolder.itemView;
        if (view3 != null) {
            f3 = view3.getAlpha();
        } else {
            f3 = 0.0f;
        }
        LJJIIJ(viewHolder);
        int i5 = (int) ((i3 - i) - f);
        int i6 = (int) ((i4 - i2) - f2);
        View view4 = viewHolder.itemView;
        if (view4 != null) {
            view4.setTranslationX(f);
        }
        View view5 = viewHolder.itemView;
        if (view5 != null) {
            view5.setTranslationY(f2);
        }
        View view6 = viewHolder.itemView;
        if (view6 != null) {
            view6.setAlpha(f3);
        }
        LJJIIJ(viewHolder2);
        viewHolder2.itemView.setTranslationX(-i5);
        viewHolder2.itemView.setTranslationY(-i6);
        viewHolder2.itemView.setAlpha(0.0f);
        this.LJIIL.add(new C87001YCn(i, i2, i3, i4, viewHolder, viewHolder2));
        return true;
    }
}
