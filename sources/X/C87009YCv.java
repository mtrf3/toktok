package X;

import Y.ALAdapterS2S0400000_15;
import Y.ARunnableS34S0200000_15;
import Y.IDComparatorS29S0000000_1;
import android.animation.TimeInterpolator;
import android.view.View;
import android.view.animation.AccelerateDecelerateInterpolator;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.livesdk.livesetting.publicscreen.LivePublicScreenAnimConfigSetting;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.YCv, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C87009YCv extends AbstractC28931Bp {
    public final Runnable LJII;
    public final Runnable LJIIIIZZ;
    public final TimeInterpolator LJIIIZ = new AccelerateDecelerateInterpolator();
    public final ArrayList<RecyclerView.ViewHolder> LJIIJ = new ArrayList<>();
    public final ArrayList<RecyclerView.ViewHolder> LJIIJJI = new ArrayList<>();
    public final ArrayList<YD0> LJIIL = new ArrayList<>();
    public final ArrayList<C87011YCx> LJIILIIL = new ArrayList<>();
    public final ArrayList<ArrayList<RecyclerView.ViewHolder>> LJIILJJIL = new ArrayList<>();
    public final ArrayList<ArrayList<YD0>> LJIILL = new ArrayList<>();
    public final ArrayList<ArrayList<C87011YCx>> LJIILLIIL = new ArrayList<>();
    public final ArrayList<RecyclerView.ViewHolder> LJIIZILJ = new ArrayList<>();
    public final ArrayList<RecyclerView.ViewHolder> LJIJ = new ArrayList<>();
    public final ArrayList<RecyclerView.ViewHolder> LJIJI = new ArrayList<>();
    public final ArrayList<RecyclerView.ViewHolder> LJIJJ = new ArrayList<>();
    public final long LJIJJLI = 300;
    public final long LJIL = 300;
    public InterfaceC65784Pro<C76800UCe> LJJ = YD2.LJLIL;
    public final boolean LJJI;
    public final boolean LJJIFFI;
    public final boolean LJJII;

    @Override // X.AbstractC030109x
    public final void LJIIZILJ() {
        long j;
        boolean z = !this.LJIIJ.isEmpty();
        boolean z2 = !this.LJIIL.isEmpty();
        boolean z3 = !this.LJIILIIL.isEmpty();
        boolean z4 = !this.LJIIJJI.isEmpty();
        if (!z && !z2 && !z4 && !z3) {
            return;
        }
        Iterator<RecyclerView.ViewHolder> it = this.LJIIJ.iterator();
        while (it.hasNext()) {
            RecyclerView.ViewHolder mPendingRemovals = it.next();
            o.LJIIIIZZ(mPendingRemovals, "mPendingRemovals");
            RecyclerView.ViewHolder viewHolder = mPendingRemovals;
            View view = viewHolder.itemView;
            o.LJIIIIZZ(view, "holder.itemView");
            C87013YCz LJJIIJ = LJJIIJ(view);
            this.LJIJI.add(viewHolder);
            LJJIIJ.LIZ.setDuration(this.LIZLLL);
            LJJIIJ.LIZ.alpha(0.0f);
            LJJIIJ.LIZ(new ALAdapterS2S0400000_15(view, viewHolder, LJJIIJ, this, 7));
            LJJIIJ.LIZIZ();
        }
        this.LJIIJ.clear();
        if (z2) {
            ArrayList<YD0> arrayList = new ArrayList<>();
            arrayList.addAll(this.LJIIL);
            this.LJIILL.add(arrayList);
            this.LJIIL.clear();
            ARunnableS34S0200000_15 aRunnableS34S0200000_15 = new ARunnableS34S0200000_15(arrayList, this, 7);
            if (z && !this.LJJIFFI) {
                View view2 = ((YD0) ListProtector.get(arrayList, 0)).LIZ.itemView;
                o.LJIIIIZZ(view2, "moves[0].holder.itemView");
                C16300kU.LJIILIIL(view2, aRunnableS34S0200000_15, this.LIZLLL);
            } else {
                aRunnableS34S0200000_15.run();
            }
        }
        if (z3) {
            ArrayList<C87011YCx> arrayList2 = new ArrayList<>();
            arrayList2.addAll(this.LJIILIIL);
            this.LJIILLIIL.add(arrayList2);
            this.LJIILIIL.clear();
            ARunnableS34S0200000_15 aRunnableS34S0200000_152 = new ARunnableS34S0200000_15(arrayList2, this, 6);
            if (z && !this.LJJIFFI) {
                RecyclerView.ViewHolder viewHolder2 = ((C87011YCx) ListProtector.get(arrayList2, 0)).LIZ;
                if (viewHolder2 != null) {
                    C16300kU.LJIILIIL(viewHolder2.itemView, aRunnableS34S0200000_152, this.LIZLLL);
                }
            } else {
                aRunnableS34S0200000_152.run();
            }
        }
        if (z4) {
            ArrayList<RecyclerView.ViewHolder> arrayList3 = new ArrayList<>();
            arrayList3.addAll(this.LJIIJJI);
            this.LJIILJJIL.add(arrayList3);
            this.LJIIJJI.clear();
            ARunnableS34S0200000_15 aRunnableS34S0200000_153 = new ARunnableS34S0200000_15(arrayList3, this, 5);
            if ((z || z2 || z3) && !this.LJJIFFI) {
                if (z) {
                    j = this.LIZLLL;
                } else {
                    j = 0;
                }
                View view3 = ((RecyclerView.ViewHolder) ListProtector.get(arrayList3, 0)).itemView;
                o.LJIIIIZZ(view3, "additions[0].itemView");
                C16300kU.LJIILIIL(view3, aRunnableS34S0200000_153, j);
                return;
            }
            aRunnableS34S0200000_153.run();
        }
    }

    @Override // X.AbstractC030109x
    public final void LJIIJ() {
        for (int size = this.LJIIL.size() - 1; -1 < size; size--) {
            Object obj = ListProtector.get(this.LJIIL, size);
            o.LJIIIIZZ(obj, "mPendingMoves[i]");
            YD0 yd0 = (YD0) obj;
            View view = yd0.LIZ.itemView;
            o.LJIIIIZZ(view, "item.holder.itemView");
            view.setTranslationY(0.0f);
            view.setTranslationX(0.0f);
            LJII(yd0.LIZ);
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
            C87011YCx c87011YCx = (C87011YCx) obj4;
            RecyclerView.ViewHolder viewHolder2 = c87011YCx.LIZ;
            if (viewHolder2 != null) {
                LJJIII(c87011YCx, viewHolder2);
            }
            RecyclerView.ViewHolder viewHolder3 = c87011YCx.LIZIZ;
            if (viewHolder3 != null) {
                LJJIII(c87011YCx, viewHolder3);
            }
        }
        this.LJIILIIL.clear();
        if (!LJIILJJIL()) {
            return;
        }
        for (int size5 = this.LJIILL.size() - 1; -1 < size5; size5--) {
            Object obj5 = ListProtector.get(this.LJIILL, size5);
            o.LJIIIIZZ(obj5, "mMovesList[i]");
            ArrayList arrayList = (ArrayList) obj5;
            for (int size6 = arrayList.size() - 1; -1 < size6; size6--) {
                Object obj6 = ListProtector.get(arrayList, size6);
                o.LJIIIIZZ(obj6, "moves[j]");
                YD0 yd02 = (YD0) obj6;
                View view2 = yd02.LIZ.itemView;
                o.LJIIIIZZ(view2, "item.itemView");
                view2.setTranslationY(0.0f);
                view2.setTranslationX(0.0f);
                LJII(yd02.LIZ);
                ListProtector.remove(arrayList, size6);
                if (arrayList.isEmpty()) {
                    this.LJIILL.remove(arrayList);
                }
            }
        }
        for (int size7 = this.LJIILJJIL.size() - 1; -1 < size7; size7--) {
            Object obj7 = ListProtector.get(this.LJIILJJIL, size7);
            o.LJIIIIZZ(obj7, "mAdditionsList[i]");
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
                    this.LJIILJJIL.remove(arrayList2);
                }
            }
        }
        for (int size9 = this.LJIILLIIL.size() - 1; -1 < size9; size9--) {
            Object obj9 = ListProtector.get(this.LJIILLIIL, size9);
            o.LJIIIIZZ(obj9, "mChangesList[i]");
            ArrayList arrayList3 = (ArrayList) obj9;
            for (int size10 = arrayList3.size() - 1; -1 < size10; size10--) {
                Object obj10 = ListProtector.get(arrayList3, size10);
                o.LJIIIIZZ(obj10, "changes[j]");
                C87011YCx c87011YCx2 = (C87011YCx) obj10;
                RecyclerView.ViewHolder viewHolder5 = c87011YCx2.LIZ;
                if (viewHolder5 != null) {
                    LJJIII(c87011YCx2, viewHolder5);
                }
                RecyclerView.ViewHolder viewHolder6 = c87011YCx2.LIZIZ;
                if (viewHolder6 != null) {
                    LJJIII(c87011YCx2, viewHolder6);
                }
                if (arrayList3.isEmpty()) {
                    this.LJIILLIIL.remove(arrayList3);
                }
            }
        }
        LJJI(this.LJIJI);
        LJJI(this.LJIJ);
        LJJI(this.LJIIZILJ);
        LJJI(this.LJIJJ);
        LJIIIIZZ();
    }

    @Override // X.AbstractC030109x
    public final boolean LJIILJJIL() {
        if (!this.LJIIJJI.isEmpty() || !this.LJIILIIL.isEmpty() || !this.LJIIL.isEmpty() || !this.LJIIJ.isEmpty() || !this.LJIJ.isEmpty() || !this.LJIJI.isEmpty() || !this.LJIIZILJ.isEmpty() || !this.LJIJJ.isEmpty() || !this.LJIILL.isEmpty() || !this.LJIILJJIL.isEmpty() || !this.LJIILLIIL.isEmpty()) {
            return true;
        }
        return false;
    }

    public final void LJJIFFI() {
        if (!LJIILJJIL()) {
            LJIIIIZZ();
        }
    }

    public static final C87013YCz LJJIIJ(View view) {
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
        LJJIIJ(view).LIZ.cancel();
        int size = this.LJIIL.size() - 1;
        if (size >= 0) {
            while (true) {
                int i = size - 1;
                Object obj = ListProtector.get(this.LJIIL, size);
                o.LJIIIIZZ(obj, "mPendingMoves[i]");
                if (((YD0) obj).LIZ == item) {
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
        LJJII(item, this.LJIILIIL);
        if (this.LJIIJ.remove(item)) {
            view.setAlpha(1.0f);
            LJII(item);
        }
        if (this.LJIIJJI.remove(item)) {
            view.setTranslationY(0.0f);
            LJIL(item);
        }
        int size2 = this.LJIILLIIL.size() - 1;
        if (size2 >= 0) {
            while (true) {
                int i2 = size2 - 1;
                Object obj2 = ListProtector.get(this.LJIILLIIL, size2);
                o.LJIIIIZZ(obj2, "mChangesList[i]");
                ArrayList arrayList = (ArrayList) obj2;
                LJJII(item, arrayList);
                if (arrayList.isEmpty()) {
                    ListProtector.remove(this.LJIILLIIL, size2);
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
                o.LJIIIIZZ(obj3, "mMovesList[i]");
                ArrayList arrayList2 = (ArrayList) obj3;
                int size4 = arrayList2.size() - 1;
                if (size4 >= 0) {
                    while (true) {
                        int i4 = size4 - 1;
                        Object obj4 = ListProtector.get(arrayList2, size4);
                        o.LJIIIIZZ(obj4, "moves[j]");
                        if (((YD0) obj4).LIZ == item) {
                            view.setTranslationY(0.0f);
                            view.setTranslationX(0.0f);
                            LJII(item);
                            ListProtector.remove(arrayList2, size4);
                            if (arrayList2.isEmpty()) {
                                ListProtector.remove(this.LJIILL, size3);
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
        int size5 = this.LJIILJJIL.size() - 1;
        if (size5 >= 0) {
            while (true) {
                int i5 = size5 - 1;
                Object obj5 = ListProtector.get(this.LJIILJJIL, size5);
                o.LJIIIIZZ(obj5, "mAdditionsList[i]");
                ArrayList arrayList3 = (ArrayList) obj5;
                if (arrayList3.remove(item)) {
                    view.setTranslationY(0.0f);
                    LJIL(item);
                    if (arrayList3.isEmpty()) {
                        ListProtector.remove(this.LJIILJJIL, size5);
                    }
                }
                if (i5 < 0) {
                    break;
                } else {
                    size5 = i5;
                }
            }
        }
        this.LJIJI.remove(item);
        this.LJIIZILJ.remove(item);
        this.LJIJJ.remove(item);
        this.LJIJ.remove(item);
        LJJIFFI();
    }

    @Override // X.AbstractC28931Bp
    public final void LJIJ(RecyclerView.ViewHolder holder) {
        o.LJIIIZ(holder, "holder");
        if (this.LJJI) {
            LJJIIJZLJL(holder);
            this.LJIIJJI.add(holder);
            ArrayList<RecyclerView.ViewHolder> arrayList = this.LJIIJJI;
            if (arrayList.size() > 1) {
                C40675Fxn.LJJLIIIJ(arrayList, new IDComparatorS29S0000000_1(2));
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
            return;
        }
        LJJIIJZLJL(holder);
        if (this.LJIIJJI.isEmpty()) {
            Object parent2 = holder.itemView.getParent();
            o.LJII(parent2, "null cannot be cast to non-null type android.view.View");
            int bottom3 = ((View) parent2).getBottom();
            int bottom4 = holder.itemView.getBottom();
            holder.itemView.setTranslationY(r1.getHeight() + (bottom3 - bottom4));
        } else {
            holder.itemView.setTranslationY(((RecyclerView.ViewHolder) ORZ.LLFF(this.LJIIJJI)).itemView.getTranslationY() + holder.itemView.getHeight());
        }
        this.LJIIJJI.add(holder);
    }

    @Override // X.AbstractC28931Bp
    public final void LJIJJLI(RecyclerView.ViewHolder holder) {
        o.LJIIIZ(holder, "holder");
        LJJIIJZLJL(holder);
        this.LJIIJ.add(holder);
    }

    @Override // X.AbstractC28931Bp
    public final void LJJ(RecyclerView.ViewHolder viewHolder) {
        CSE cse;
        if ((viewHolder instanceof CSE) && (cse = (CSE) viewHolder) != null) {
            cse.P();
        }
        this.LJJ.invoke();
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
                LJJIIJ(view).LIZ.cancel();
            }
            if (i < 0) {
                return;
            } else {
                size = i;
            }
        }
    }

    public final void LJJIIJZLJL(RecyclerView.ViewHolder viewHolder) {
        View view = viewHolder.itemView;
        o.LJIIIIZZ(view, "holder.itemView");
        C87013YCz LJJIIJ = LJJIIJ(view);
        LJJIIJ.LIZ.setInterpolator(this.LJIIIZ);
        LJIIIZ(viewHolder);
    }

    public C87009YCv(Runnable runnable, Runnable runnable2) {
        this.LJII = runnable;
        this.LJIIIIZZ = runnable2;
        LivePublicScreenAnimConfigSetting livePublicScreenAnimConfigSetting = LivePublicScreenAnimConfigSetting.INSTANCE;
        this.LJJI = livePublicScreenAnimConfigSetting.isItemSortEnabled();
        this.LJJIFFI = livePublicScreenAnimConfigSetting.isRemoveDelayEnabled();
        this.LJJII = livePublicScreenAnimConfigSetting.isMoveCheckEnabled();
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
            C87011YCx c87011YCx = (C87011YCx) ListProtector.get(list, size);
            if (LJJIII(c87011YCx, viewHolder) && c87011YCx.LIZ == null && c87011YCx.LIZIZ == null) {
                list.remove(c87011YCx);
            }
            if (i < 0) {
                return;
            } else {
                size = i;
            }
        }
    }

    public final boolean LJJIII(C87011YCx c87011YCx, RecyclerView.ViewHolder viewHolder) {
        View view;
        if (c87011YCx.LIZIZ == viewHolder) {
            c87011YCx.LIZIZ = null;
        } else if (c87011YCx.LIZ == viewHolder) {
            c87011YCx.LIZ = null;
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

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0099, code lost:
    
        if (r1 != 0) goto L22;
     */
    @Override // X.AbstractC28931Bp
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean LJIJJ(androidx.recyclerview.widget.RecyclerView.ViewHolder r21, int r22, int r23, int r24, int r25) {
        /*
            r20 = this;
            java.lang.String r0 = "holder"
            r9 = r21
            kotlin.jvm.internal.o.LJIIIZ(r9, r0)
            r3 = r20
            boolean r0 = r3.LJJII
            r7 = 1
            r6 = 0
            java.lang.String r1 = "holder.itemView"
            r16 = r22
            r13 = r25
            r12 = r24
            if (r0 == 0) goto L6e
            android.view.View r4 = r9.itemView
            kotlin.jvm.internal.o.LJIIIIZZ(r4, r1)
            android.view.View r0 = r9.itemView
            float r0 = r0.getTranslationY()
            int r2 = (int) r0
            int r2 = r2 + r23
            int r5 = r13 - r2
            if (r5 != 0) goto L30
            r3.LJJIIJZLJL(r9)
            r3.LJII(r9)
            return r6
        L30:
            android.view.View r0 = r9.itemView
            kotlin.jvm.internal.o.LJIIIIZZ(r0, r1)
            X.YCz r0 = LJJIIJ(r0)
            boolean r0 = r0.LIZJ
            if (r0 == 0) goto L54
            android.view.View r0 = r9.itemView
            kotlin.jvm.internal.o.LJIIIIZZ(r0, r1)
            X.YCz r0 = LJJIIJ(r0)
            float r1 = r0.LIZIZ
            r0 = 0
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 != 0) goto L54
            r3.LJII(r9)
            r3.LJJIFFI()
            return r6
        L54:
            r3.LJJIIJZLJL(r9)
            float r0 = (float) r5
            float r0 = -r0
            r4.setTranslationY(r0)
            java.util.ArrayList<X.YD0> r0 = r3.LJIIL
            X.YD0 r14 = new X.YD0
            r15 = r9
            r18 = r12
            r19 = r13
            r17 = r2
            r14.<init>(r15, r16, r17, r18, r19)
            r0.add(r14)
            goto Laa
        L6e:
            android.view.View r2 = r9.itemView
            kotlin.jvm.internal.o.LJIIIIZZ(r2, r1)
            android.view.View r0 = r9.itemView
            float r0 = r0.getTranslationX()
            int r10 = (int) r0
            int r10 = r10 + r16
            android.view.View r0 = r9.itemView
            float r0 = r0.getTranslationY()
            int r11 = (int) r0
            int r11 = r11 + r23
            r3.LJJIIJZLJL(r9)
            int r0 = r12 - r10
            int r1 = r13 - r11
            if (r0 != 0) goto L94
            if (r1 != 0) goto L9b
            r3.LJII(r9)
            return r6
        L94:
            float r0 = (float) r0
            float r0 = -r0
            r2.setTranslationX(r0)
            if (r1 == 0) goto La0
        L9b:
            float r0 = (float) r1
            float r0 = -r0
            r2.setTranslationY(r0)
        La0:
            java.util.ArrayList<X.YD0> r0 = r3.LJIIL
            X.YD0 r8 = new X.YD0
            r8.<init>(r9, r10, r11, r12, r13)
            r0.add(r8)
        Laa:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C87009YCv.LJIJJ(androidx.recyclerview.widget.RecyclerView$ViewHolder, int, int, int, int):boolean");
    }

    @Override // X.AbstractC28931Bp
    public final boolean LJIJI(int i, int i2, int i3, int i4, RecyclerView.ViewHolder viewHolder, RecyclerView.ViewHolder viewHolder2) {
        if (viewHolder == viewHolder2) {
            return LJIJJ(viewHolder, i, i2, i3, i4);
        }
        float translationX = viewHolder.itemView.getTranslationX();
        float translationY = viewHolder.itemView.getTranslationY();
        float alpha = viewHolder.itemView.getAlpha();
        LJJIIJZLJL(viewHolder);
        viewHolder.itemView.setTranslationX(translationX);
        viewHolder.itemView.setTranslationY(translationY);
        viewHolder.itemView.setAlpha(alpha);
        LJJIIJZLJL(viewHolder2);
        viewHolder2.itemView.setTranslationX(-((int) ((i3 - i) - translationX)));
        viewHolder2.itemView.setTranslationY(-((int) ((i4 - i2) - translationY)));
        viewHolder2.itemView.setAlpha(0.0f);
        this.LJIILIIL.add(new C87011YCx(i, i2, i3, i4, viewHolder, viewHolder2));
        return true;
    }
}
