package X;

import Y.ALAdapterS8S0300000_15;
import Y.ARunnableS34S0200000_15;
import Y.AUListenerS90S0100000_1;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.feed.guide.GalleryLayoutManager;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.YCj, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C86997YCj extends AbstractC28931Bp {
    public static TimeInterpolator LJIJI;
    public final ArrayList<RecyclerView.ViewHolder> LJII = new ArrayList<>();
    public final ArrayList<RecyclerView.ViewHolder> LJIIIIZZ = new ArrayList<>();
    public final ArrayList<C86999YCl> LJIIIZ = new ArrayList<>();
    public final ArrayList<C86998YCk> LJIIJ = new ArrayList<>();
    public final ArrayList<ArrayList<RecyclerView.ViewHolder>> LJIIJJI = new ArrayList<>();
    public final ArrayList<ArrayList<C86999YCl>> LJIIL = new ArrayList<>();
    public final ArrayList<ArrayList<C86998YCk>> LJIILIIL = new ArrayList<>();
    public final ArrayList<RecyclerView.ViewHolder> LJIILJJIL = new ArrayList<>();
    public final ArrayList<RecyclerView.ViewHolder> LJIILL = new ArrayList<>();
    public final ArrayList<RecyclerView.ViewHolder> LJIILLIIL = new ArrayList<>();
    public final ArrayList<RecyclerView.ViewHolder> LJIIZILJ = new ArrayList<>();
    public final RecyclerView LJIJ;

    @Override // X.AbstractC030109x
    public final void LJIIJ() {
        int size = this.LJIIIZ.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            }
            C86999YCl c86999YCl = (C86999YCl) ListProtector.get(this.LJIIIZ, size);
            View view = c86999YCl.LIZ.itemView;
            view.setTranslationY(0.0f);
            view.setTranslationX(0.0f);
            LJII(c86999YCl.LIZ);
            ListProtector.remove(this.LJIIIZ, size);
        }
        int size2 = this.LJII.size();
        while (true) {
            size2--;
            if (size2 < 0) {
                break;
            }
            LJII((RecyclerView.ViewHolder) ListProtector.get(this.LJII, size2));
            ListProtector.remove(this.LJII, size2);
        }
        int size3 = this.LJIIIIZZ.size();
        while (true) {
            size3--;
            if (size3 < 0) {
                break;
            }
            RecyclerView.ViewHolder viewHolder = (RecyclerView.ViewHolder) ListProtector.get(this.LJIIIIZZ, size3);
            viewHolder.itemView.setAlpha(1.0f);
            LJIL(viewHolder);
            ListProtector.remove(this.LJIIIIZZ, size3);
        }
        int size4 = this.LJIIJ.size();
        while (true) {
            size4--;
            if (size4 < 0) {
                break;
            }
            C86998YCk c86998YCk = (C86998YCk) ListProtector.get(this.LJIIJ, size4);
            RecyclerView.ViewHolder viewHolder2 = c86998YCk.LIZ;
            if (viewHolder2 != null) {
                LJJIII(c86998YCk, viewHolder2);
            }
            RecyclerView.ViewHolder viewHolder3 = c86998YCk.LIZIZ;
            if (viewHolder3 != null) {
                LJJIII(c86998YCk, viewHolder3);
            }
        }
        this.LJIIJ.clear();
        if (!LJIILJJIL()) {
            return;
        }
        int size5 = this.LJIIL.size();
        while (true) {
            size5--;
            if (size5 < 0) {
                break;
            }
            ArrayList arrayList = (ArrayList) ListProtector.get(this.LJIIL, size5);
            int size6 = arrayList.size();
            while (true) {
                size6--;
                if (size6 >= 0) {
                    C86999YCl c86999YCl2 = (C86999YCl) ListProtector.get(arrayList, size6);
                    View view2 = c86999YCl2.LIZ.itemView;
                    view2.setTranslationY(0.0f);
                    view2.setTranslationX(0.0f);
                    LJII(c86999YCl2.LIZ);
                    ListProtector.remove(arrayList, size6);
                    if (arrayList.isEmpty()) {
                        this.LJIIL.remove(arrayList);
                    }
                }
            }
        }
        int size7 = this.LJIIJJI.size();
        while (true) {
            size7--;
            if (size7 < 0) {
                break;
            }
            ArrayList arrayList2 = (ArrayList) ListProtector.get(this.LJIIJJI, size7);
            int size8 = arrayList2.size();
            while (true) {
                size8--;
                if (size8 >= 0) {
                    RecyclerView.ViewHolder viewHolder4 = (RecyclerView.ViewHolder) ListProtector.get(arrayList2, size8);
                    viewHolder4.itemView.setAlpha(1.0f);
                    LJIL(viewHolder4);
                    ListProtector.remove(arrayList2, size8);
                    if (arrayList2.isEmpty()) {
                        this.LJIIJJI.remove(arrayList2);
                    }
                }
            }
        }
        int size9 = this.LJIILIIL.size();
        while (true) {
            size9--;
            if (size9 >= 0) {
                ArrayList arrayList3 = (ArrayList) ListProtector.get(this.LJIILIIL, size9);
                int size10 = arrayList3.size();
                while (true) {
                    size10--;
                    if (size10 >= 0) {
                        C86998YCk c86998YCk2 = (C86998YCk) ListProtector.get(arrayList3, size10);
                        RecyclerView.ViewHolder viewHolder5 = c86998YCk2.LIZ;
                        if (viewHolder5 != null) {
                            LJJIII(c86998YCk2, viewHolder5);
                        }
                        RecyclerView.ViewHolder viewHolder6 = c86998YCk2.LIZIZ;
                        if (viewHolder6 != null) {
                            LJJIII(c86998YCk2, viewHolder6);
                        }
                        if (arrayList3.isEmpty()) {
                            this.LJIILIIL.remove(arrayList3);
                        }
                    }
                }
            } else {
                LJJI(this.LJIILLIIL);
                LJJI(this.LJIILL);
                LJJI(this.LJIILJJIL);
                LJJI(this.LJIIZILJ);
                LJIIIIZZ();
                return;
            }
        }
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
            RecyclerView.ViewHolder next = it.next();
            this.LJIILLIIL.add(next);
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            ofFloat.setDuration(300L);
            ofFloat.addUpdateListener(new AUListenerS90S0100000_1(next, 84));
            ofFloat.addListener(new ALAdapterS8S0300000_15(this, next, ofFloat, 0));
            ofFloat.start();
        }
        this.LJII.clear();
        if (z2) {
            ArrayList<C86999YCl> arrayList = new ArrayList<>();
            arrayList.addAll(this.LJIIIZ);
            this.LJIIL.add(arrayList);
            this.LJIIIZ.clear();
            ARunnableS34S0200000_15 aRunnableS34S0200000_15 = new ARunnableS34S0200000_15(arrayList, this, 52);
            if (z) {
                C16300kU.LJIILIIL(((C86999YCl) ListProtector.get(arrayList, 0)).LIZ.itemView, aRunnableS34S0200000_15, this.LIZLLL);
            } else {
                aRunnableS34S0200000_15.run();
            }
        }
        if (z3) {
            ArrayList<C86998YCk> arrayList2 = new ArrayList<>();
            arrayList2.addAll(this.LJIIJ);
            this.LJIILIIL.add(arrayList2);
            this.LJIIJ.clear();
            ARunnableS34S0200000_15 aRunnableS34S0200000_152 = new ARunnableS34S0200000_15(arrayList2, this, 53);
            if (z) {
                C16300kU.LJIILIIL(((C86998YCk) ListProtector.get(arrayList2, 0)).LIZ.itemView, aRunnableS34S0200000_152, this.LIZLLL);
            } else {
                aRunnableS34S0200000_152.run();
            }
        }
        if (z4) {
            ArrayList<RecyclerView.ViewHolder> arrayList3 = new ArrayList<>();
            arrayList3.addAll(this.LJIIIIZZ);
            this.LJIIJJI.add(arrayList3);
            this.LJIIIIZZ.clear();
            ARunnableS34S0200000_15 aRunnableS34S0200000_153 = new ARunnableS34S0200000_15(arrayList3, this, 54);
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
                C16300kU.LJIILIIL(((RecyclerView.ViewHolder) ListProtector.get(arrayList3, 0)).itemView, aRunnableS34S0200000_153, Math.max(j2, j3) + j);
                return;
            }
            aRunnableS34S0200000_153.run();
        }
    }

    public final void LJJIFFI() {
        if (!LJIILJJIL()) {
            LJIIIIZZ();
        }
    }

    public C86997YCj(RecyclerView recyclerView) {
        this.LJIJ = recyclerView;
    }

    public static final void LJJI(List<RecyclerView.ViewHolder> list) {
        for (int size = list.size() - 1; size >= 0; size--) {
            ((RecyclerView.ViewHolder) ListProtector.get(list, size)).itemView.animate().cancel();
        }
    }

    @Override // X.AbstractC030109x
    public final void LJIIIZ(RecyclerView.ViewHolder viewHolder) {
        View view = viewHolder.itemView;
        view.animate().cancel();
        for (int size = this.LJIIIZ.size() - 1; size >= 0; size--) {
            if (((C86999YCl) ListProtector.get(this.LJIIIZ, size)).LIZ == viewHolder) {
                view.setTranslationY(0.0f);
                view.setTranslationX(0.0f);
                LJII(viewHolder);
                ListProtector.remove(this.LJIIIZ, size);
            }
        }
        LJJII(viewHolder, this.LJIIJ);
        if (this.LJII.remove(viewHolder)) {
            view.setAlpha(1.0f);
            LJII(viewHolder);
        }
        if (this.LJIIIIZZ.remove(viewHolder)) {
            view.setAlpha(1.0f);
            LJIL(viewHolder);
        }
        for (int size2 = this.LJIILIIL.size() - 1; size2 >= 0; size2--) {
            ArrayList arrayList = (ArrayList) ListProtector.get(this.LJIILIIL, size2);
            LJJII(viewHolder, arrayList);
            if (arrayList.isEmpty()) {
                ListProtector.remove(this.LJIILIIL, size2);
            }
        }
        for (int size3 = this.LJIIL.size() - 1; size3 >= 0; size3--) {
            ArrayList arrayList2 = (ArrayList) ListProtector.get(this.LJIIL, size3);
            int size4 = arrayList2.size() - 1;
            while (true) {
                if (size4 < 0) {
                    break;
                }
                if (((C86999YCl) ListProtector.get(arrayList2, size4)).LIZ == viewHolder) {
                    view.setTranslationY(0.0f);
                    view.setTranslationX(0.0f);
                    LJII(viewHolder);
                    ListProtector.remove(arrayList2, size4);
                    if (arrayList2.isEmpty()) {
                        ListProtector.remove(this.LJIIL, size3);
                    }
                } else {
                    size4--;
                }
            }
        }
        for (int size5 = this.LJIIJJI.size() - 1; size5 >= 0; size5--) {
            ArrayList arrayList3 = (ArrayList) ListProtector.get(this.LJIIJJI, size5);
            if (arrayList3.remove(viewHolder)) {
                view.setAlpha(1.0f);
                LJIL(viewHolder);
                if (arrayList3.isEmpty()) {
                    ListProtector.remove(this.LJIIJJI, size5);
                }
            }
        }
        this.LJIILLIIL.remove(viewHolder);
        this.LJIILJJIL.remove(viewHolder);
        this.LJIIZILJ.remove(viewHolder);
        this.LJIILL.remove(viewHolder);
        LJJIFFI();
    }

    @Override // X.AbstractC28931Bp
    public final void LJIJ(RecyclerView.ViewHolder viewHolder) {
        LJJIIJ(viewHolder);
        viewHolder.itemView.setAlpha(0.34f);
        if (viewHolder.getAdapterPosition() > ((GalleryLayoutManager) this.LJIJ.getLayoutManager()).LJZL) {
            viewHolder.itemView.setTranslationX(this.LJIJ.getWidth());
        } else {
            viewHolder.itemView.setTranslationX(-this.LJIJ.getWidth());
        }
        this.LJIIIIZZ.add(viewHolder);
    }

    @Override // X.AbstractC28931Bp
    public final void LJIJJLI(RecyclerView.ViewHolder viewHolder) {
        LJJIIJ(viewHolder);
        this.LJII.add(viewHolder);
    }

    public final void LJJIIJ(RecyclerView.ViewHolder viewHolder) {
        if (LJIJI == null) {
            LJIJI = new ValueAnimator().getInterpolator();
        }
        viewHolder.itemView.animate().setInterpolator(LJIJI);
        LJIIIZ(viewHolder);
    }

    @Override // X.AbstractC030109x
    public final boolean LJI(RecyclerView.ViewHolder viewHolder, List<Object> list) {
        if (!list.isEmpty() || LJFF(viewHolder)) {
            return true;
        }
        return false;
    }

    public final void LJJII(RecyclerView.ViewHolder viewHolder, List list) {
        int size = list.size();
        while (true) {
            size--;
            if (size >= 0) {
                C86998YCk c86998YCk = (C86998YCk) ListProtector.get(list, size);
                if (LJJIII(c86998YCk, viewHolder) && c86998YCk.LIZ == null && c86998YCk.LIZIZ == null) {
                    list.remove(c86998YCk);
                }
            } else {
                return;
            }
        }
    }

    public final boolean LJJIII(C86998YCk c86998YCk, RecyclerView.ViewHolder viewHolder) {
        if (c86998YCk.LIZIZ == viewHolder) {
            c86998YCk.LIZIZ = null;
        } else if (c86998YCk.LIZ == viewHolder) {
            c86998YCk.LIZ = null;
        } else {
            return false;
        }
        viewHolder.itemView.setAlpha(1.0f);
        viewHolder.itemView.setTranslationX(0.0f);
        viewHolder.itemView.setTranslationY(0.0f);
        LJII(viewHolder);
        return true;
    }

    @Override // X.AbstractC28931Bp
    public final boolean LJIJJ(RecyclerView.ViewHolder viewHolder, int i, int i2, int i3, int i4) {
        int i5 = i - i3;
        viewHolder.itemView.setTranslationX(i5);
        viewHolder.itemView.setAlpha(0.34f);
        viewHolder.itemView.setScaleX(0.9f);
        viewHolder.itemView.setScaleY(0.9f);
        View view = viewHolder.itemView;
        float f = 12.0f;
        if (view.getContext() != null) {
            f = KL2.LIZJ(viewHolder.itemView.getContext(), 12.0f);
        }
        view.setTranslationY(f);
        if (Math.abs(i5) >= viewHolder.itemView.getWidth() / 2) {
            this.LJIIIZ.add(new C86999YCl(viewHolder, i, i2, i3, i4));
            return true;
        }
        return true;
    }

    @Override // X.AbstractC28931Bp
    public final boolean LJIJI(int i, int i2, int i3, int i4, RecyclerView.ViewHolder viewHolder, RecyclerView.ViewHolder viewHolder2) {
        if (viewHolder == viewHolder2) {
            LJIJJ(viewHolder, i, i2, i3, i4);
            return true;
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
        this.LJIIJ.add(new C86998YCk(i, i2, i3, i4, viewHolder, viewHolder2));
        return true;
    }
}
