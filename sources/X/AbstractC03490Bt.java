package X;

import Y.IDLAdapterS2S0100000;
import a04.IDfS0S0000000;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.TimeInterpolator;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import defpackage.b1;
import defpackage.i0;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

/* renamed from: X.0Bt, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC03490Bt implements Cloneable {
    public static final int[] LLFF = {2, 1, 3, 4};
    public static final IDfS0S0000000 LLFFF = new IDfS0S0000000(0);
    public static final ThreadLocal<C1HQ<Animator, C03460Bq>> LLFII = new ThreadLocal<>();
    public ArrayList<C03860De> LJLLI;
    public ArrayList<C03860De> LJLLILLLL;
    public ViewGroup LJLLJ;
    public QXX LL;
    public AbstractC03470Br LLD;
    public final String LJLIL = getClass().getName();
    public long LJLILLLLZI = -1;
    public long LJLJI = -1;
    public TimeInterpolator LJLJJI = null;
    public final ArrayList<Integer> LJLJJL = new ArrayList<>();
    public final ArrayList<View> LJLJJLL = new ArrayList<>();
    public C03870Df LJLJL = new C03870Df();
    public C03870Df LJLJLJ = new C03870Df();
    public C1CT LJLJLLL = null;
    public final int[] LJLL = LLFF;
    public boolean LJLLL = false;
    public final ArrayList<Animator> LJLLLL = new ArrayList<>();
    public int LJLLLLLL = 0;
    public boolean LJLZ = false;
    public boolean LJZ = false;
    public ArrayList<InterfaceC03480Bs> LJZI = null;
    public ArrayList<Animator> LJZL = new ArrayList<>();
    public QXX LLF = LLFFF;

    public abstract void LIZLLL(C03860De c03860De);

    public abstract void LJI(C03860De c03860De);

    @Override // 
    /* renamed from: LJIIIZ, reason: merged with bridge method [inline-methods] */
    public AbstractC03490Bt clone() {
        try {
            AbstractC03490Bt abstractC03490Bt = (AbstractC03490Bt) super.clone();
            abstractC03490Bt.LJZL = new ArrayList<>();
            abstractC03490Bt.LJLJL = new C03870Df();
            abstractC03490Bt.LJLJLJ = new C03870Df();
            abstractC03490Bt.LJLLI = null;
            abstractC03490Bt.LJLLILLLL = null;
            return abstractC03490Bt;
        } catch (CloneNotSupportedException unused) {
            return null;
        }
    }

    public Animator LJIIJ(ViewGroup viewGroup, C03860De c03860De, C03860De c03860De2) {
        return null;
    }

    public String[] LJIILLIIL() {
        return null;
    }

    public void LJJII() {
        this.LJLLL = true;
    }

    public static C1HQ<Animator, C03460Bq> LJIILL() {
        ThreadLocal<C1HQ<Animator, C03460Bq>> threadLocal = LLFII;
        C1HQ<Animator, C03460Bq> c1hq = threadLocal.get();
        if (c1hq == null) {
            C1HQ<Animator, C03460Bq> c1hq2 = new C1HQ<>();
            threadLocal.set(c1hq2);
            return c1hq2;
        }
        return c1hq;
    }

    public final void LJIIL() {
        int i = this.LJLLLLLL - 1;
        this.LJLLLLLL = i;
        if (i == 0) {
            ArrayList<InterfaceC03480Bs> arrayList = this.LJZI;
            if (arrayList != null && arrayList.size() > 0) {
                ArrayList arrayList2 = (ArrayList) this.LJZI.clone();
                int size = arrayList2.size();
                for (int i2 = 0; i2 < size; i2++) {
                    ((InterfaceC03480Bs) ListProtector.get(arrayList2, i2)).LIZJ(this);
                }
            }
            for (int i3 = 0; i3 < this.LJLJL.LIZJ.LJIIIIZZ(); i3++) {
                View LJIIIZ = this.LJLJL.LIZJ.LJIIIZ(i3);
                if (LJIIIZ != null) {
                    C16300kU.LJIIZILJ(LJIIIZ, false);
                }
            }
            for (int i4 = 0; i4 < this.LJLJLJ.LIZJ.LJIIIIZZ(); i4++) {
                View LJIIIZ2 = this.LJLJLJ.LIZJ.LJIIIZ(i4);
                if (LJIIIZ2 != null) {
                    C16300kU.LJIIZILJ(LJIIIZ2, false);
                }
            }
            this.LJZ = true;
        }
    }

    public final void LJJIJIIJIL() {
        if (this.LJLLLLLL == 0) {
            ArrayList<InterfaceC03480Bs> arrayList = this.LJZI;
            if (arrayList != null && arrayList.size() > 0) {
                ArrayList arrayList2 = (ArrayList) this.LJZI.clone();
                int size = arrayList2.size();
                for (int i = 0; i < size; i++) {
                    ((InterfaceC03480Bs) ListProtector.get(arrayList2, i)).LIZIZ(this);
                }
            }
            this.LJZ = false;
        }
        this.LJLLLLLL++;
    }

    public final String toString() {
        return LJJIJIL("");
    }

    public void LJJIFFI() {
        LJJIJIIJIL();
        final C1HQ<Animator, C03460Bq> LJIILL = LJIILL();
        Iterator<Animator> it = this.LJZL.iterator();
        while (it.hasNext()) {
            Animator next = it.next();
            if (LJIILL.containsKey(next)) {
                LJJIJIIJIL();
                if (next != null) {
                    next.addListener(new AnimatorListenerAdapter() { // from class: X.0Dc
                        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                        public final void onAnimationEnd(Animator animator) {
                            LJIILL.remove(animator);
                            AbstractC03490Bt.this.LJLLLL.remove(animator);
                        }

                        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                        public final void onAnimationStart(Animator animator) {
                            AbstractC03490Bt.this.LJLLLL.add(animator);
                        }
                    });
                    long j = this.LJLJI;
                    if (j >= 0) {
                        next.setDuration(j);
                    }
                    long j2 = this.LJLILLLLZI;
                    if (j2 >= 0) {
                        next.setStartDelay(next.getStartDelay() + j2);
                    }
                    TimeInterpolator timeInterpolator = this.LJLJJI;
                    if (timeInterpolator != null) {
                        next.setInterpolator(timeInterpolator);
                    }
                    next.addListener(new IDLAdapterS2S0100000(this, 2));
                    next.start();
                }
            }
        }
        this.LJZL.clear();
        LJIIL();
    }

    public AbstractC03490Bt LIZ(InterfaceC03480Bs interfaceC03480Bs) {
        if (this.LJZI == null) {
            this.LJZI = new ArrayList<>();
        }
        this.LJZI.add(interfaceC03480Bs);
        return this;
    }

    public void LIZIZ(View view) {
        this.LJLJJLL.add(view);
    }

    public void LJFF(C03860De c03860De) {
        if (this.LL != null && !((HashMap) c03860De.LIZ).isEmpty()) {
            this.LL.LLILZLL();
            for (String str : C46121rU.LJLILLLLZI) {
                if (!((HashMap) c03860De.LIZ).containsKey(str)) {
                    this.LL.LJLJJI(c03860De);
                    return;
                }
            }
        }
    }

    public final void LJIIIIZZ(boolean z) {
        if (z) {
            this.LJLJL.LIZ.clear();
            this.LJLJL.LIZIZ.clear();
            this.LJLJL.LIZJ.LIZIZ();
        } else {
            this.LJLJLJ.LIZ.clear();
            this.LJLJLJ.LIZIZ.clear();
            this.LJLJLJ.LIZJ.LIZIZ();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void LJIILIIL(ViewGroup viewGroup) {
        C1HQ<Animator, C03460Bq> LJIILL = LJIILL();
        int i = LJIILL.LJLJI;
        if (viewGroup == null || i == 0) {
            return;
        }
        C29391Dj c29391Dj = new C29391Dj(viewGroup);
        C1HQ c1hq = new C1HQ(LJIILL);
        LJIILL.clear();
        while (true) {
            i--;
            if (i < 0) {
                return;
            }
            C03460Bq c03460Bq = (C03460Bq) c1hq.LJIIJJI(i);
            if (c03460Bq.LIZ != null && c29391Dj.equals(c03460Bq.LIZLLL)) {
                ((Animator) c1hq.LJIIIIZZ(i)).end();
            }
        }
    }

    public final boolean LJIJI(View view) {
        int id = view.getId();
        if ((this.LJLJJL.size() == 0 && this.LJLJJLL.size() == 0) || this.LJLJJL.contains(Integer.valueOf(id)) || this.LJLJJLL.contains(view)) {
            return true;
        }
        return false;
    }

    public void LJIJJLI(View view) {
        if (!this.LJZ) {
            C1HQ<Animator, C03460Bq> LJIILL = LJIILL();
            int i = LJIILL.LJLJI;
            C29391Dj c29391Dj = new C29391Dj(view);
            for (int i2 = i - 1; i2 >= 0; i2--) {
                C03460Bq LJIIJJI = LJIILL.LJIIJJI(i2);
                if (LJIIJJI.LIZ != null && c29391Dj.equals(LJIIJJI.LIZLLL)) {
                    LJIILL.LJIIIIZZ(i2).pause();
                }
            }
            ArrayList<InterfaceC03480Bs> arrayList = this.LJZI;
            if (arrayList != null && arrayList.size() > 0) {
                ArrayList arrayList2 = (ArrayList) this.LJZI.clone();
                int size = arrayList2.size();
                for (int i3 = 0; i3 < size; i3++) {
                    ((InterfaceC03480Bs) ListProtector.get(arrayList2, i3)).LJFF(this);
                }
            }
            this.LJLZ = true;
        }
    }

    public void LJIL(InterfaceC03480Bs interfaceC03480Bs) {
        ArrayList<InterfaceC03480Bs> arrayList = this.LJZI;
        if (arrayList == null) {
            return;
        }
        arrayList.remove(interfaceC03480Bs);
        if (this.LJZI.size() == 0) {
            this.LJZI = null;
        }
    }

    public void LJJ(View view) {
        this.LJLJJLL.remove(view);
    }

    public void LJJI(View view) {
        if (this.LJLZ) {
            if (!this.LJZ) {
                C1HQ<Animator, C03460Bq> LJIILL = LJIILL();
                int i = LJIILL.LJLJI;
                C29391Dj c29391Dj = new C29391Dj(view);
                for (int i2 = i - 1; i2 >= 0; i2--) {
                    C03460Bq LJIIJJI = LJIILL.LJIIJJI(i2);
                    if (LJIIJJI.LIZ != null && c29391Dj.equals(LJIIJJI.LIZLLL)) {
                        LJIILL.LJIIIIZZ(i2).resume();
                    }
                }
                ArrayList<InterfaceC03480Bs> arrayList = this.LJZI;
                if (arrayList != null && arrayList.size() > 0) {
                    ArrayList arrayList2 = (ArrayList) this.LJZI.clone();
                    int size = arrayList2.size();
                    for (int i3 = 0; i3 < size; i3++) {
                        ((InterfaceC03480Bs) ListProtector.get(arrayList2, i3)).LIZLLL(this);
                    }
                }
            }
            this.LJLZ = false;
        }
    }

    public void LJJIII(long j) {
        this.LJLJI = j;
    }

    public void LJJIIJ(AbstractC03470Br abstractC03470Br) {
        this.LLD = abstractC03470Br;
    }

    public void LJJIIJZLJL(TimeInterpolator timeInterpolator) {
        this.LJLJJI = timeInterpolator;
    }

    public void LJJIIZ(QXX qxx) {
        if (qxx == null) {
            this.LLF = LLFFF;
        } else {
            this.LLF = qxx;
        }
    }

    public void LJJIIZI(QXX qxx) {
        this.LL = qxx;
    }

    public void LJJIJ(ViewGroup viewGroup) {
        this.LJLLJ = viewGroup;
    }

    public void LJJIJIIJI(long j) {
        this.LJLILLLLZI = j;
    }

    public String LJJIJIL(String str) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(str);
        LIZ.append(C16880lQ.LJLLJ(getClass()));
        LIZ.append("@");
        LIZ.append(Integer.toHexString(hashCode()));
        LIZ.append(": ");
        String LIZIZ = X1D.LIZIZ(LIZ);
        if (this.LJLJI != -1) {
            StringBuilder LIZJ = b1.LIZJ(LIZIZ, "dur(");
            LIZIZ = C0H1.LIZJ(LIZJ, this.LJLJI, ") ", LIZJ);
        }
        if (this.LJLILLLLZI != -1) {
            StringBuilder LIZJ2 = b1.LIZJ(LIZIZ, "dly(");
            LIZIZ = C0H1.LIZJ(LIZJ2, this.LJLILLLLZI, ") ", LIZJ2);
        }
        if (this.LJLJJI != null) {
            StringBuilder LIZJ3 = b1.LIZJ(LIZIZ, "interp(");
            LIZJ3.append(this.LJLJJI);
            LIZJ3.append(") ");
            LIZIZ = X1D.LIZIZ(LIZJ3);
        }
        if (this.LJLJJL.size() > 0 || this.LJLJJLL.size() > 0) {
            String LJFF = i0.LJFF(LIZIZ, "tgts(");
            if (this.LJLJJL.size() > 0) {
                for (int i = 0; i < this.LJLJJL.size(); i++) {
                    if (i > 0) {
                        LJFF = i0.LJFF(LJFF, ", ");
                    }
                    StringBuilder LIZ2 = X1D.LIZ();
                    LIZ2.append(LJFF);
                    LIZ2.append(ListProtector.get(this.LJLJJL, i));
                    LJFF = X1D.LIZIZ(LIZ2);
                }
            }
            if (this.LJLJJLL.size() > 0) {
                for (int i2 = 0; i2 < this.LJLJJLL.size(); i2++) {
                    if (i2 > 0) {
                        LJFF = i0.LJFF(LJFF, ", ");
                    }
                    StringBuilder LIZ3 = X1D.LIZ();
                    LIZ3.append(LJFF);
                    LIZ3.append(ListProtector.get(this.LJLJJLL, i2));
                    LJFF = X1D.LIZIZ(LIZ3);
                }
            }
            return i0.LJFF(LJFF, ")");
        }
        return LIZIZ;
    }

    public final void LJ(View view, boolean z) {
        if (view == null) {
            return;
        }
        view.getId();
        if (view.getParent() instanceof ViewGroup) {
            C03860De c03860De = new C03860De(view);
            if (z) {
                LJI(c03860De);
            } else {
                LIZLLL(c03860De);
            }
            c03860De.LIZJ.add(this);
            LJFF(c03860De);
            if (z) {
                LIZJ(this.LJLJL, view, c03860De);
            } else {
                LIZJ(this.LJLJLJ, view, c03860De);
            }
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i = 0; i < viewGroup.getChildCount(); i++) {
                LJ(viewGroup.getChildAt(i), z);
            }
        }
    }

    public final void LJII(ViewGroup viewGroup, boolean z) {
        LJIIIIZZ(z);
        if (this.LJLJJL.size() > 0 || this.LJLJJLL.size() > 0) {
            for (int i = 0; i < this.LJLJJL.size(); i++) {
                View findViewById = viewGroup.findViewById(((Integer) ListProtector.get(this.LJLJJL, i)).intValue());
                if (findViewById != null) {
                    C03860De c03860De = new C03860De(findViewById);
                    if (z) {
                        LJI(c03860De);
                    } else {
                        LIZLLL(c03860De);
                    }
                    c03860De.LIZJ.add(this);
                    LJFF(c03860De);
                    if (z) {
                        LIZJ(this.LJLJL, findViewById, c03860De);
                    } else {
                        LIZJ(this.LJLJLJ, findViewById, c03860De);
                    }
                }
            }
            for (int i2 = 0; i2 < this.LJLJJLL.size(); i2++) {
                View view = (View) ListProtector.get(this.LJLJJLL, i2);
                C03860De c03860De2 = new C03860De(view);
                if (z) {
                    LJI(c03860De2);
                } else {
                    LIZLLL(c03860De2);
                }
                c03860De2.LIZJ.add(this);
                LJFF(c03860De2);
                if (z) {
                    LIZJ(this.LJLJL, view, c03860De2);
                } else {
                    LIZJ(this.LJLJLJ, view, c03860De2);
                }
            }
            return;
        }
        LJ(viewGroup, z);
    }

    public final C03860De LJIILJJIL(View view, boolean z) {
        ArrayList<C03860De> arrayList;
        ArrayList<C03860De> arrayList2;
        C1CT c1ct = this.LJLJLLL;
        if (c1ct != null) {
            return c1ct.LJIILJJIL(view, z);
        }
        if (z) {
            arrayList = this.LJLLI;
        } else {
            arrayList = this.LJLLILLLL;
        }
        if (arrayList == null) {
            return null;
        }
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            C03860De c03860De = (C03860De) ListProtector.get(arrayList, i);
            if (c03860De == null) {
                return null;
            }
            if (c03860De.LIZIZ == view) {
                if (i < 0) {
                    return null;
                }
                if (z) {
                    arrayList2 = this.LJLLILLLL;
                } else {
                    arrayList2 = this.LJLLI;
                }
                return (C03860De) ListProtector.get(arrayList2, i);
            }
        }
        return null;
    }

    public final C03860De LJIIZILJ(View view, boolean z) {
        C03870Df c03870Df;
        C1CT c1ct = this.LJLJLLL;
        if (c1ct != null) {
            return c1ct.LJIIZILJ(view, z);
        }
        if (z) {
            c03870Df = this.LJLJL;
        } else {
            c03870Df = this.LJLJLJ;
        }
        return c03870Df.LIZ.getOrDefault(view, null);
    }

    public boolean LJIJ(C03860De c03860De, C03860De c03860De2) {
        if (c03860De == null || c03860De2 == null) {
            return false;
        }
        String[] LJIILLIIL = LJIILLIIL();
        if (LJIILLIIL != null) {
            for (String str : LJIILLIIL) {
                if (!LJIJJ(c03860De, c03860De2, str)) {
                }
            }
            return false;
        }
        Iterator it = ((HashMap) c03860De.LIZ).keySet().iterator();
        while (it.hasNext()) {
            if (LJIJJ(c03860De, c03860De2, (String) it.next())) {
            }
        }
        return false;
        return true;
    }

    public static void LIZJ(C03870Df c03870Df, View view, C03860De c03860De) {
        c03870Df.LIZ.put(view, c03860De);
        int id = view.getId();
        if (id >= 0) {
            if (c03870Df.LIZIZ.indexOfKey(id) >= 0) {
                c03870Df.LIZIZ.put(id, null);
            } else {
                c03870Df.LIZIZ.put(id, view);
            }
        }
        String LJIIJ = C16360ka.LJIIJ(view);
        if (LJIIJ != null) {
            if (c03870Df.LIZLLL.containsKey(LJIIJ)) {
                c03870Df.LIZLLL.put(LJIIJ, null);
            } else {
                c03870Df.LIZLLL.put(LJIIJ, view);
            }
        }
        if (view.getParent() instanceof ListView) {
            ListView listView = (ListView) view.getParent();
            if (listView.getAdapter().hasStableIds()) {
                long itemIdAtPosition = listView.getItemIdAtPosition(listView.getPositionForView(view));
                C0M5<View> c0m5 = c03870Df.LIZJ;
                if (c0m5.LJLIL) {
                    c0m5.LIZLLL();
                }
                if (C60903NvH.LJ(itemIdAtPosition, c0m5.LJLJJI, c0m5.LJLILLLLZI) >= 0) {
                    View LJ = c03870Df.LIZJ.LJ(itemIdAtPosition, null);
                    if (LJ != null) {
                        C16300kU.LJIIZILJ(LJ, false);
                        c03870Df.LIZJ.LJI(itemIdAtPosition, null);
                        return;
                    }
                    return;
                }
                C16300kU.LJIIZILJ(view, true);
                c03870Df.LIZJ.LJI(itemIdAtPosition, view);
            }
        }
    }

    public static boolean LJIJJ(C03860De c03860De, C03860De c03860De2, String str) {
        Object obj = c03860De.LIZ.get(str);
        Object obj2 = c03860De2.LIZ.get(str);
        if (obj == null) {
            if (obj2 == null) {
                return false;
            }
        } else if (obj2 != null) {
            return !obj.equals(obj2);
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0045 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void LJIIJJI(android.view.ViewGroup r26, X.C03870Df r27, X.C03870Df r28, java.util.ArrayList<X.C03860De> r29, java.util.ArrayList<X.C03860De> r30) {
        /*
            Method dump skipped, instructions count: 310
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC03490Bt.LJIIJJI(android.view.ViewGroup, X.0Df, X.0Df, java.util.ArrayList, java.util.ArrayList):void");
    }
}
