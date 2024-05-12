package X;

import Y.IDComparatorS29S0000000_1;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.relation.model.RecUser;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AqS159S0100000_9;
import kotlin.jvm.internal.o;

/* renamed from: X.Mn7, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C57849Mn7 implements InterfaceC57861MnJ {
    public final InterfaceC65784Pro<C76800UCe> LIZ;
    public final C57846Mn4 LIZIZ;
    public final List<AbstractC27771Av9> LIZJ;

    public C57849Mn7() {
        throw null;
    }

    @Override // X.InterfaceC57861MnJ
    public final List<InterfaceC57927MoN> LIZ(C57850Mn8 c57850Mn8) {
        int i;
        List<InterfaceC57927MoN> LLJILJILJ;
        List<AbstractC27771Av9> list = this.LIZJ;
        ArrayList arrayList = new ArrayList();
        Iterator<AbstractC27771Av9> it = list.iterator();
        while (true) {
            i = 0;
            if (!it.hasNext()) {
                break;
            }
            AbstractC27771Av9 next = it.next();
            if (!next.LJLJI || !c57850Mn8.LIZ.isEmpty()) {
                arrayList.add(next);
            }
        }
        if (arrayList.isEmpty()) {
            LLJILJILJ = c57850Mn8.LIZ;
        } else {
            ArrayList arrayList2 = new ArrayList();
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                Object next2 = it2.next();
                if (next2 instanceof C57864MnM) {
                    arrayList2.add(next2);
                }
            }
            List LLILII = ORZ.LLILII(new IDComparatorS29S0000000_1(28), arrayList2);
            LLJILJILJ = ORZ.LLJILJILJ(c57850Mn8.LIZ);
            ArrayList arrayList3 = (ArrayList) LLJILJILJ;
            arrayList3.addAll(0, LLILII);
            if (!c57850Mn8.LIZIZ) {
                ArrayList arrayList4 = new ArrayList();
                Iterator it3 = arrayList.iterator();
                while (it3.hasNext()) {
                    Object next3 = it3.next();
                    if (next3 instanceof C26421AYn) {
                        arrayList4.add(next3);
                    }
                }
                arrayList3.addAll(arrayList4);
            }
        }
        C57850Mn8 LIZ = C57850Mn8.LIZ(c57850Mn8, LLJILJILJ);
        if (LIZ.LIZ.isEmpty()) {
            return LIZ.LIZ;
        }
        List<InterfaceC57927MoN> LLJILJILJ2 = ORZ.LLJILJILJ(LIZ.LIZ);
        C57846Mn4 c57846Mn4 = this.LIZIZ;
        C57851Mn9 c57851Mn9 = c57846Mn4.LJIIIIZZ;
        C57848Mn6 c57848Mn6 = c57846Mn4.LJIIIZ;
        if (c57848Mn6 != null) {
            List LIZJ = C57964Moy.LIZJ(LLJILJILJ2);
            ArrayList arrayList5 = new ArrayList();
            Iterator it4 = ((ArrayList) LIZJ).iterator();
            while (it4.hasNext()) {
                Object next4 = it4.next();
                if (!((RecUser) next4).isRemoved()) {
                    arrayList5.add(next4);
                }
            }
            int size = arrayList5.size();
            if (size > 0) {
                ListProtector.add(LLJILJILJ2, 0, new C57848Mn6(size, c57848Mn6.LJLJI, c57848Mn6.LJLJJI, c57848Mn6.LJLJJL, c57848Mn6.LJLJJLL));
                i = size + 1;
            }
        }
        if (c57851Mn9 == null) {
            return LLJILJILJ2;
        }
        ListProtector.add(LLJILJILJ2, i, c57851Mn9);
        return LLJILJILJ2;
    }

    public C57849Mn7(AqS159S0100000_9 aqS159S0100000_9, C57846Mn4 uiConfig) {
        Collection collection = uiConfig.LJJI;
        collection = collection == null ? C61878OQg.INSTANCE : collection;
        Iterable iterable = uiConfig.LJJIFFI;
        List<AbstractC27771Av9> LLIIIZ = ORZ.LLIIIZ(iterable == null ? C61878OQg.INSTANCE : iterable, collection);
        o.LJIIIZ(uiConfig, "uiConfig");
        this.LIZ = aqS159S0100000_9;
        this.LIZIZ = uiConfig;
        this.LIZJ = LLIIIZ;
    }
}
