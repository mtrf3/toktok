package X;

import Y.AObserverS76S0200000_13;
import Y.ARunnableS50S0100000_14;
import Y.IDComparatorS42S0000000_14;
import android.content.ComponentCallbacks2;
import android.content.Context;
import android.os.Looper;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.MutableLiveData;
import com.bytedance.tux.icon.TuxIconView;
import com.ss.android.ugc.aweme.dependence.beauty.utils.SafeMutableLiveData;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AqS168S0100000_2;
import kotlin.jvm.internal.o;

/* loaded from: classes15.dex */
public final class WIW implements WJA {
    public final int LIZ;
    public final C82622Wbi LIZIZ;
    public boolean LIZJ;
    public final MutableLiveData<Integer> LIZLLL;
    public final MutableLiveData<Integer> LJ;
    public final MutableLiveData<Integer> LJFF;
    public final MutableLiveData<C82108WKi> LJI;
    public final MutableLiveData LJII;
    public final MutableLiveData LJIIIIZZ;
    public final MutableLiveData LJIIIZ;
    public final List<WI1> LJIIJ;
    public final HashMap<C6MP, WI1> LJIIJJI;
    public final HashMap<C6MP, WI1> LJIIL;
    public List<? extends WI1> LJIILIIL;
    public List<C82033WHl> LJIILJJIL;
    public final List<C82033WHl> LJIILL;
    public List<C82033WHl> LJIILLIIL;
    public boolean LJIIZILJ;
    public final boolean LJIJ;
    public InterfaceC88472Yns<? super Integer, Integer> LJIJI;

    @Override // X.WJA
    public final int LIZLLL() {
        return ((ArrayList) this.LJIILL).size();
    }

    @Override // X.WJA
    public final int getItemCount() {
        return this.LJIILJJIL.size();
    }

    @Override // X.WJA
    public final void LJIIJJI() {
        int min;
        List LLILLL;
        List<C82033WHl> LLJI;
        int intValue;
        if (!o.LJ(C16880lQ.LLJJJJ(), Looper.myLooper())) {
            C1DH.LJJIJIIJI(new ARunnableS50S0100000_14(this, 139));
            return;
        }
        if (!this.LIZJ) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(this.LJIILJJIL);
        List LLJI2 = ORZ.LLJI(arrayList);
        ArrayList arrayList2 = new ArrayList();
        arrayList2.addAll(this.LJIILL);
        List LLJI3 = ORZ.LLJI(arrayList2);
        List<WI1> list = this.LJIIJ;
        ArrayList arrayList3 = new ArrayList();
        Iterator it = ((ArrayList) list).iterator();
        while (it.hasNext()) {
            Object next = it.next();
            if (true ^ ((WI1) next).LIZJ().LJLJI) {
                arrayList3.add(next);
            }
        }
        ((ArrayList) this.LJIILL).clear();
        ArrayList arrayList4 = new ArrayList();
        Iterator it2 = arrayList3.iterator();
        while (it2.hasNext()) {
            Object next2 = it2.next();
            WI1 wi1 = (WI1) next2;
            if (this.LJIJ && wi1.LIZJ().LJLIL == VLL.FIXED) {
                arrayList4.add(next2);
            }
        }
        ArrayList arrayList5 = new ArrayList(C32I.LJJL(arrayList4, 10));
        Iterator it3 = arrayList4.iterator();
        while (it3.hasNext()) {
            arrayList5.add(C30581Hy.LJIIIZ((WI1) it3.next()));
        }
        ((ArrayList) this.LJIILL).addAll(ORZ.LLJI(ORZ.LLILII(new IDComparatorS42S0000000_14(6), arrayList5)));
        ArrayList arrayList6 = new ArrayList();
        Iterator it4 = arrayList3.iterator();
        while (it4.hasNext()) {
            Object next3 = it4.next();
            WI1 wi12 = (WI1) next3;
            if (!this.LJIJ || wi12.LIZJ().LJLIL == VLL.SLIDE) {
                arrayList6.add(next3);
            }
        }
        ArrayList arrayList7 = new ArrayList(C32I.LJJL(arrayList6, 10));
        Iterator it5 = arrayList6.iterator();
        while (it5.hasNext()) {
            arrayList7.add(C30581Hy.LJIIIZ((WI1) it5.next()));
        }
        List LLJI4 = ORZ.LLJI(ORZ.LLILII(new IDComparatorS42S0000000_14(7), arrayList7));
        if (C52533KjZ.LIZ() == 0 && C148745sc.LIZ()) {
            if (this.LJIIZILJ) {
                intValue = Integer.MAX_VALUE;
            } else {
                intValue = this.LJIJI.invoke(Integer.valueOf(LLJI4.size())).intValue();
            }
            LLILLL = ORZ.LLILLL(LLJI4, intValue);
        } else {
            int size = LLJI4.size();
            if (!ORY.LJJIJIIJIL(Integer.valueOf(this.LIZ), new Integer[]{4, 5})) {
                if (this.LIZ == 1) {
                    if (this.LJIJ && !this.LJIIZILJ) {
                        min = Math.min(4, Math.max(size - 1, 0));
                        LLILLL = ORZ.LLILLL(LLJI4, min);
                    }
                } else if (this.LJIJ) {
                    min = Math.min(7, Math.max(size - 1, 0));
                    LLILLL = ORZ.LLILLL(LLJI4, min);
                }
            }
            min = 20;
            LLILLL = ORZ.LLILLL(LLJI4, min);
        }
        List<C82033WHl> LLIIIILZ = ORZ.LLIIIILZ(LLJI4, LLILLL);
        this.LJIILLIIL = LLIIIILZ;
        if (this.LJIIZILJ) {
            LLJI = ORZ.LLJI(LLJI4);
        } else {
            LLJI = ORZ.LLJI(LLILLL);
        }
        this.LJIILJJIL = LLJI;
        this.LIZLLL.setValue(Integer.valueOf(LLJI4.size()));
        this.LJ.setValue(Integer.valueOf(this.LJIILJJIL.size()));
        this.LJFF.setValue(Integer.valueOf(LLIIIILZ.size()));
        List LLJI5 = ORZ.LLJI(this.LJIILL);
        C82038WHq c82038WHq = new C82038WHq(LLJI2, ORZ.LLJI(this.LJIILJJIL));
        C82109WKj c82109WKj = new C82109WKj(this);
        C82039WHr c82039WHr = new C82039WHr(LLJI3, LLJI5);
        C82110WKk c82110WKk = new C82110WKk(this);
        C03200Aq.LIZ(c82038WHq, true).LIZIZ(c82109WKj);
        C03200Aq.LIZ(c82039WHr, true).LIZIZ(c82110WKk);
    }

    @Override // X.WJA
    public final boolean LIZJ() {
        return this.LJIIZILJ;
    }

    @Override // X.WJA
    public final MutableLiveData LJ() {
        return this.LJIIIZ;
    }

    @Override // X.WJA
    public final MutableLiveData LJII() {
        return this.LJIIIIZZ;
    }

    @Override // X.WJA
    public final MutableLiveData LJIIIZ() {
        return this.LJII;
    }

    @Override // X.WJA
    public final List<WI1> LJIIJ() {
        return this.LJIILIIL;
    }

    @Override // X.WJA
    public final void LIZ(List<? extends WI1> list) {
        ((ArrayList) this.LJIIJ).clear();
        this.LJIILIIL = list;
        ArrayList arrayList = (ArrayList) list;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            WI1 wi1 = (WI1) it.next();
            this.LJIIL.put(wi1.LJIIIIZZ(), wi1);
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            WI1 wi12 = (WI1) it2.next();
            if (!this.LJIIJJI.containsKey(wi12.LJIIIIZZ())) {
                this.LJIIJJI.put(wi12.LJIIIIZZ(), wi12);
                ((ArrayList) this.LJIIJ).add(wi12);
            }
        }
        LJIIJJI();
    }

    @Override // X.WJA
    public final C82033WHl LIZIZ(int i) {
        return (C82033WHl) ORZ.LJLLLLLL(i, this.LJIILL);
    }

    @Override // X.WJA
    public final WI1 LJFF(C6MP type) {
        o.LJIIIZ(type, "type");
        return this.LJIIL.get(type);
    }

    @Override // X.WJA
    public final int LJI(C6MP type) {
        o.LJIIIZ(type, "type");
        Iterator<C82033WHl> it = this.LJIILJJIL.iterator();
        int i = 0;
        while (it.hasNext()) {
            if (it.next().LIZ == type) {
                return i;
            }
            i++;
        }
        return -1;
    }

    @Override // X.WJA
    public final C82033WHl LJIIIIZZ(int i) {
        return (C82033WHl) ORZ.LJLLLLLL(i, this.LJIILJJIL);
    }

    @Override // X.WJA
    public final void LJIIL(boolean z) {
        this.LIZJ = z;
    }

    @Override // X.WJA
    public final void LJIILIIL(TuxIconView view) {
        o.LJIIIZ(view, "view");
        InterfaceC83142Wk6 f7 = ((C83113Wjd) this.LIZIZ.LJ(C83113Wjd.class, null)).f7();
        o.LJII(f7, "null cannot be cast to non-null type com.ss.android.ugc.aweme.tools.beauty.manager.BeautySource");
        C83146WkA c83146WkA = (C83146WkA) f7;
        SafeMutableLiveData<Integer> safeMutableLiveData = c83146WkA.LJIILIIL;
        Context context = view.getContext();
        o.LJIIIIZZ(context, "view.context");
        ComponentCallbacks2 LJIJJ = C45804HyK.LJIJJ(context);
        o.LJII(LJIJJ, "null cannot be cast to non-null type androidx.lifecycle.LifecycleOwner");
        safeMutableLiveData.observe((LifecycleOwner) LJIJJ, new AObserverS76S0200000_13(c83146WkA, view, 6));
    }

    @Override // X.WJA
    public final void LJIILJJIL(boolean z) {
        this.LJIIZILJ = z;
    }

    @Override // X.WJA
    public final void LJIILL(AqS168S0100000_2 aqS168S0100000_2) {
        this.LJIJI = aqS168S0100000_2;
    }

    public WIW(int i, C82622Wbi objectContainer) {
        o.LJIIIZ(objectContainer, "objectContainer");
        this.LIZ = i;
        this.LIZIZ = objectContainer;
        this.LIZLLL = new MutableLiveData<>();
        MutableLiveData<Integer> mutableLiveData = new MutableLiveData<>();
        this.LJ = mutableLiveData;
        MutableLiveData<Integer> mutableLiveData2 = new MutableLiveData<>();
        this.LJFF = mutableLiveData2;
        MutableLiveData<C82108WKi> mutableLiveData3 = new MutableLiveData<>();
        this.LJI = mutableLiveData3;
        this.LJII = mutableLiveData3;
        this.LJIIIIZZ = mutableLiveData;
        this.LJIIIZ = mutableLiveData2;
        this.LJIIJ = new ArrayList();
        this.LJIIJJI = new HashMap<>();
        this.LJIIL = new HashMap<>();
        this.LJIILIIL = C61878OQg.INSTANCE;
        this.LJIILJJIL = new ArrayList();
        this.LJIILL = new ArrayList();
        new ArrayList();
        this.LJIJ = ORY.LJJIJIIJIL(Integer.valueOf(i), new Integer[]{4, 5}) || C52533KjZ.LIZJ();
        this.LJIJI = C165056dp.LJLIL;
    }
}
