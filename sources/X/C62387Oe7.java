package X;

import android.view.View;
import android.widget.FrameLayout;
import com.ss.android.ugc.aweme.share.base.model.BaseSharePackage;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AqS176S0100000_10;
import kotlin.jvm.internal.o;

/* renamed from: X.Oe7, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C62387Oe7 {
    public List<InterfaceC62225ObV> LIZ;
    public final EnumC62492Ofo LIZIZ;
    public final List<InterfaceC62486Ofi> LIZJ;
    public final List<Integer> LIZLLL;
    public final boolean LJ;
    public final boolean LJFF;
    public final int LJI;
    public final int LJII;
    public final float LJIIIIZZ;
    public final int LJIIIZ;
    public final BaseSharePackage LJIIJ;
    public final boolean LJIIJJI;
    public final View LJIIL;
    public final InterfaceC62474OfW LJIILIIL;
    public final C4RB LJIILJJIL;
    public final InterfaceC65784Pro<Boolean> LJIILL;
    public final boolean LJIILLIIL;
    public final float LJIIZILJ;
    public final boolean LJIJ;
    public final boolean LJIJI;
    public final boolean LJIJJ;
    public final int LJIJJLI;
    public boolean LJIL;
    public final boolean LJJ;
    public final boolean LJJI;
    public final long LJJIFFI;
    public boolean LJJII;
    public final boolean LJJIII;
    public final AbstractC65550Po2<InterfaceC62225ObV> LJJIIJ;
    public final Comparator<InterfaceC62225ObV> LJJIIJZLJL;
    public boolean LJJIIZ;
    public InterfaceC88473Ynt<? super Integer, ? super Boolean, ? super Integer, ? extends OSZ<? extends View, ? extends FrameLayout.LayoutParams>> LJJIIZI;
    public Boolean LJJIJ;
    public final String LJJIJIIJI;
    public final boolean LJJIJIIJIL;
    public final String LJJIJIL;

    /* JADX WARN: Multi-variable type inference failed */
    public C62387Oe7(C62394OeE c62394OeE) {
        List<InterfaceC62225ObV> list;
        this.LJJIFFI = 100L;
        boolean z = true;
        this.LJJII = true;
        AbstractC65550Po2<InterfaceC62225ObV> LIZ = AbstractC65550Po2.LIZ(C62525OgL.LJLIL);
        o.LJIIIIZZ(LIZ, "Ordering.from { _, _ -> 0 }");
        this.LJJIIJ = LIZ;
        this.LJJIJIIJI = "";
        this.LJJIJIL = "";
        BaseSharePackage baseSharePackage = c62394OeE.LJIIZILJ;
        o.LJI(baseSharePackage);
        this.LJIIJ = baseSharePackage;
        List<InterfaceC62225ObV> list2 = c62394OeE.LIZ;
        ORS.LJJLIL(new AqS176S0100000_10(c62394OeE, 242), list2);
        HashSet hashSet = new HashSet();
        ArrayList arrayList = new ArrayList();
        for (InterfaceC62225ObV interfaceC62225ObV : list2) {
            if (hashSet.add(interfaceC62225ObV.key())) {
                arrayList.add(interfaceC62225ObV);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            if (c62394OeE.LJIIJJI.invoke(next).booleanValue()) {
                arrayList2.add(next);
            }
        }
        this.LIZ = C65777Prh.LIZIZ(arrayList2);
        this.LIZIZ = c62394OeE.LIZIZ;
        this.LJIIJ.extras.getBoolean("is_async_sort");
        this.LIZ = c62394OeE.LJIIIZ.LIZIZ(this.LIZ);
        List<InterfaceC62486Ofi> list3 = c62394OeE.LIZJ;
        HashSet hashSet2 = new HashSet();
        ArrayList arrayList3 = new ArrayList();
        for (InterfaceC62486Ofi interfaceC62486Ofi : list3) {
            if (hashSet2.add(interfaceC62486Ofi.key())) {
                arrayList3.add(interfaceC62486Ofi);
            }
        }
        ArrayList arrayList4 = new ArrayList();
        Iterator it2 = arrayList3.iterator();
        while (it2.hasNext()) {
            Object next2 = it2.next();
            if (c62394OeE.LJIIL.invoke(next2).booleanValue()) {
                arrayList4.add(next2);
            }
        }
        List<InterfaceC62486Ofi> LIZIZ = C65777Prh.LIZIZ(arrayList4);
        this.LIZJ = LIZIZ;
        List LIZIZ2 = c62394OeE.LJII.LIZIZ(LIZIZ);
        this.LIZJ = LIZIZ2;
        this.LIZLLL = c62394OeE.LIZLLL;
        InterfaceC44918Hk2<InterfaceC62486Ofi> interfaceC44918Hk2 = c62394OeE.LJIIIIZZ;
        if (interfaceC44918Hk2 != 0) {
            interfaceC44918Hk2.LIZIZ(LIZIZ2);
        }
        if (!c62394OeE.LJFF && (list = this.LIZ) != null && list.size() > 0) {
            z = false;
        }
        this.LJ = z;
        this.LJFF = c62394OeE.LJI;
        this.LJI = c62394OeE.LJIILIIL;
        this.LJII = c62394OeE.LJIILJJIL;
        this.LJIIIIZZ = c62394OeE.LJIILL;
        this.LJIIIZ = c62394OeE.LJIILLIIL;
        this.LJIIJJI = c62394OeE.LJIJ;
        this.LJIIL = c62394OeE.LJIL;
        this.LJIILIIL = c62394OeE.LJJ;
        this.LJIILJJIL = c62394OeE.LJJI;
        this.LJIILL = c62394OeE.LJJIFFI;
        this.LJIILLIIL = c62394OeE.LJJII;
        this.LJIIZILJ = c62394OeE.LJJIII;
        this.LJIJ = c62394OeE.LJJIIJ;
        this.LJIJI = c62394OeE.LJJIIJZLJL;
        this.LJIJJ = c62394OeE.LJJIIZ;
        this.LJIJJLI = c62394OeE.LJJIIZI;
        this.LJJII = c62394OeE.LJJIJ;
        this.LJJIII = c62394OeE.LJJIJIIJI;
        this.LJJIJIIJIL = c62394OeE.LJJIJLIJ;
        this.LJJIJIL = c62394OeE.LJJIL;
        this.LJJIIZI = c62394OeE.LJJIJIL;
        this.LJJIIZ = c62394OeE.LJJIJIIJIL;
        this.LJJIJIIJI = c62394OeE.LJJIJL;
        this.LJJIIJ = c62394OeE.LJIIIZ;
        this.LJJIIJZLJL = c62394OeE.LJIIJ;
        this.LJJ = c62394OeE.LJIJI;
        this.LJJI = c62394OeE.LJIJJ;
        this.LJJIFFI = c62394OeE.LJIJJLI;
    }
}
