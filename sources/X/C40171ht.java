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

/* renamed from: X.1ht, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public class C40171ht extends AbstractC28931Bp {
    public static TimeInterpolator LJIJ;
    public final ArrayList<RecyclerView.ViewHolder> LJII = new ArrayList<>();
    public final ArrayList<RecyclerView.ViewHolder> LJIIIIZZ = new ArrayList<>();
    public final ArrayList<C03080Ae> LJIIIZ = new ArrayList<>();
    public final ArrayList<C03070Ad> LJIIJ = new ArrayList<>();
    public final ArrayList<ArrayList<RecyclerView.ViewHolder>> LJIIJJI = new ArrayList<>();
    public final ArrayList<ArrayList<C03080Ae>> LJIIL = new ArrayList<>();
    public final ArrayList<ArrayList<C03070Ad>> LJIILIIL = new ArrayList<>();
    public final ArrayList<RecyclerView.ViewHolder> LJIILJJIL = new ArrayList<>();
    public final ArrayList<RecyclerView.ViewHolder> LJIILL = new ArrayList<>();
    public final ArrayList<RecyclerView.ViewHolder> LJIILLIIL = new ArrayList<>();
    public final ArrayList<RecyclerView.ViewHolder> LJIIZILJ = new ArrayList<>();

    @Override // X.AbstractC030109x
    public void LJIIJ() {
        int size = this.LJIIIZ.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            }
            C03080Ae c03080Ae = (C03080Ae) ListProtector.get(this.LJIIIZ, size);
            View view = c03080Ae.LIZ.itemView;
            view.setTranslationY(0.0f);
            view.setTranslationX(0.0f);
            LJII(c03080Ae.LIZ);
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
            C03070Ad c03070Ad = (C03070Ad) ListProtector.get(this.LJIIJ, size4);
            RecyclerView.ViewHolder viewHolder2 = c03070Ad.LIZ;
            if (viewHolder2 != null) {
                LJJIII(c03070Ad, viewHolder2);
            }
            RecyclerView.ViewHolder viewHolder3 = c03070Ad.LIZIZ;
            if (viewHolder3 != null) {
                LJJIII(c03070Ad, viewHolder3);
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
                    C03080Ae c03080Ae2 = (C03080Ae) ListProtector.get(arrayList, size6);
                    View view2 = c03080Ae2.LIZ.itemView;
                    view2.setTranslationY(0.0f);
                    view2.setTranslationX(0.0f);
                    LJII(c03080Ae2.LIZ);
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
                        C03070Ad c03070Ad2 = (C03070Ad) ListProtector.get(arrayList3, size10);
                        RecyclerView.ViewHolder viewHolder5 = c03070Ad2.LIZ;
                        if (viewHolder5 != null) {
                            LJJIII(c03070Ad2, viewHolder5);
                        }
                        RecyclerView.ViewHolder viewHolder6 = c03070Ad2.LIZIZ;
                        if (viewHolder6 != null) {
                            LJJIII(c03070Ad2, viewHolder6);
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
    public boolean LJIILJJIL() {
        if (!this.LJIIIIZZ.isEmpty() || !this.LJIIJ.isEmpty() || !this.LJIIIZ.isEmpty() || !this.LJII.isEmpty() || !this.LJIILL.isEmpty() || !this.LJIILLIIL.isEmpty() || !this.LJIILJJIL.isEmpty() || !this.LJIIZILJ.isEmpty() || !this.LJIIL.isEmpty() || !this.LJIIJJI.isEmpty() || !this.LJIILIIL.isEmpty()) {
            return true;
        }
        return false;
    }

    @Override // X.AbstractC030109x
    public void LJIIZILJ() {
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
            View view = next.itemView;
            ViewPropertyAnimator animate = view.animate();
            this.LJIILLIIL.add(next);
            animate.setDuration(LJIILIIL()).alpha(0.0f).setListener(new IDLAdapterS0S0400000(view, animate, this, next, 0)).start();
        }
        this.LJII.clear();
        if (z2) {
            ArrayList<C03080Ae> arrayList = new ArrayList<>();
            arrayList.addAll(this.LJIIIZ);
            this.LJIIL.add(arrayList);
            this.LJIIIZ.clear();
            IDRunnableS29S0200000 iDRunnableS29S0200000 = new IDRunnableS29S0200000(arrayList, this, 9);
            if (z) {
                C16300kU.LJIILIIL(((C03080Ae) ListProtector.get(arrayList, 0)).LIZ.itemView, iDRunnableS29S0200000, LJIILIIL());
            } else {
                iDRunnableS29S0200000.run();
            }
        }
        if (z3) {
            ArrayList<C03070Ad> arrayList2 = new ArrayList<>();
            arrayList2.addAll(this.LJIIJ);
            this.LJIILIIL.add(arrayList2);
            this.LJIIJ.clear();
            IDRunnableS29S0200000 iDRunnableS29S02000002 = new IDRunnableS29S0200000(arrayList2, this, 10);
            if (z) {
                C16300kU.LJIILIIL(((C03070Ad) ListProtector.get(arrayList2, 0)).LIZ.itemView, iDRunnableS29S02000002, LJIILIIL());
            } else {
                iDRunnableS29S02000002.run();
            }
        }
        if (z4) {
            ArrayList<RecyclerView.ViewHolder> arrayList3 = new ArrayList<>();
            arrayList3.addAll(this.LJIIIIZZ);
            this.LJIIJJI.add(arrayList3);
            this.LJIIIIZZ.clear();
            IDRunnableS29S0200000 iDRunnableS29S02000003 = new IDRunnableS29S0200000(arrayList3, this, 11);
            if (z || z2 || z3) {
                long j3 = 0;
                if (z) {
                    j = LJIILIIL();
                } else {
                    j = 0;
                }
                if (z2) {
                    j2 = LJIIL();
                } else {
                    j2 = 0;
                }
                if (z3) {
                    j3 = LJIIJJI();
                }
                C16300kU.LJIILIIL(((RecyclerView.ViewHolder) ListProtector.get(arrayList3, 0)).itemView, iDRunnableS29S02000003, Math.max(j2, j3) + j);
                return;
            }
            iDRunnableS29S02000003.run();
        }
    }

    public void LJJIFFI() {
        if (!LJIILJJIL()) {
            LJIIIIZZ();
        }
    }

    public static final void LJJI(List<RecyclerView.ViewHolder> list) {
        for (int size = list.size() - 1; size >= 0; size--) {
            ((RecyclerView.ViewHolder) ListProtector.get(list, size)).itemView.animate().cancel();
        }
    }

    @Override // X.AbstractC030109x
    public void LJIIIZ(RecyclerView.ViewHolder viewHolder) {
        View view = viewHolder.itemView;
        view.animate().cancel();
        for (int size = this.LJIIIZ.size() - 1; size >= 0; size--) {
            if (((C03080Ae) ListProtector.get(this.LJIIIZ, size)).LIZ == viewHolder) {
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
                if (((C03080Ae) ListProtector.get(arrayList2, size4)).LIZ == viewHolder) {
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
    public void LJIJ(RecyclerView.ViewHolder viewHolder) {
        LJJIIJ(viewHolder);
        viewHolder.itemView.setAlpha(0.0f);
        this.LJIIIIZZ.add(viewHolder);
    }

    @Override // X.AbstractC28931Bp
    public void LJIJJLI(RecyclerView.ViewHolder viewHolder) {
        LJJIIJ(viewHolder);
        this.LJII.add(viewHolder);
    }

    public final void LJJIIJ(RecyclerView.ViewHolder viewHolder) {
        if (LJIJ == null) {
            LJIJ = new ValueAnimator().getInterpolator();
        }
        viewHolder.itemView.animate().setInterpolator(LJIJ);
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
                C03070Ad c03070Ad = (C03070Ad) ListProtector.get(list, size);
                if (LJJIII(c03070Ad, viewHolder) && c03070Ad.LIZ == null && c03070Ad.LIZIZ == null) {
                    list.remove(c03070Ad);
                }
            } else {
                return;
            }
        }
    }

    public final boolean LJJIII(C03070Ad c03070Ad, RecyclerView.ViewHolder viewHolder) {
        if (c03070Ad.LIZIZ == viewHolder) {
            c03070Ad.LIZIZ = null;
        } else if (c03070Ad.LIZ == viewHolder) {
            c03070Ad.LIZ = null;
        } else {
            return false;
        }
        viewHolder.itemView.setAlpha(1.0f);
        viewHolder.itemView.setTranslationX(0.0f);
        viewHolder.itemView.setTranslationY(0.0f);
        LJII(viewHolder);
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x002a, code lost:
    
        if (r1 != 0) goto L9;
     */
    @Override // X.AbstractC28931Bp
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean LJIJJ(androidx.recyclerview.widget.RecyclerView.ViewHolder r9, int r10, int r11, int r12, int r13) {
        /*
            r8 = this;
            r4 = r10
            r5 = r11
            r3 = r9
            android.view.View r2 = r3.itemView
            float r0 = r2.getTranslationX()
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
            if (r0 != 0) goto L25
            if (r1 != 0) goto L2c
            r8.LJII(r3)
            r0 = 0
            return r0
        L25:
            int r0 = -r0
            float r0 = (float) r0
            r2.setTranslationX(r0)
            if (r1 == 0) goto L31
        L2c:
            int r0 = -r1
            float r0 = (float) r0
            r2.setTranslationY(r0)
        L31:
            java.util.ArrayList<X.0Ae> r0 = r8.LJIIIZ
            X.0Ae r2 = new X.0Ae
            r2.<init>(r3, r4, r5, r6, r7)
            r0.add(r2)
            r0 = 1
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C40171ht.LJIJJ(androidx.recyclerview.widget.RecyclerView$ViewHolder, int, int, int, int):boolean");
    }

    @Override // X.AbstractC28931Bp
    public boolean LJIJI(int i, int i2, int i3, int i4, RecyclerView.ViewHolder viewHolder, RecyclerView.ViewHolder viewHolder2) {
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
        this.LJIIJ.add(new C03070Ad(i, i2, i3, i4, viewHolder, viewHolder2));
        return true;
    }
}
