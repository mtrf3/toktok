package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.AqS106S0101000_6;

/* renamed from: X.EMx, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C36311EMx {
    public static boolean LIZIZ;
    public static boolean LIZJ;
    public static final C36311EMx LIZ = new C36311EMx();
    public static final AtomicBoolean LIZLLL = new AtomicBoolean(false);
    public static final List<Aweme> LJ = FII.LIZ();
    public static final LinkedList<Aweme> LJFF = new LinkedList<>();
    public static final LinkedList<Aweme> LJI = new LinkedList<>();
    public static final java.util.Map<Integer, InterfaceC65784Pro<List<Aweme>>> LJII = new LinkedHashMap();
    public static final List<InterfaceC36312EMy> LJIIIIZZ = new ArrayList();

    public static List LIZIZ() {
        AtomicBoolean atomicBoolean = LIZLLL;
        if (atomicBoolean.get()) {
            return C61878OQg.INSTANCE;
        }
        atomicBoolean.set(true);
        C68322mC c68322mC = new C68322mC();
        FMW.LIZJ(new AqS106S0101000_6(c68322mC, 3));
        atomicBoolean.set(false);
        return (List) c68322mC.element;
    }

    public static List LIZ(List list, int i) {
        boolean z;
        List<Aweme> list2 = LJ;
        if (list2 != null) {
            if (list2.isEmpty()) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                return list;
            }
            try {
                List LJFF2 = C1DH.LJFF(list2);
                list2.clear();
                ArrayList arrayList = new ArrayList();
                if (i >= 0) {
                    arrayList.addAll(list.subList(0, i + 1));
                }
                arrayList.addAll(LJFF2);
                if (arrayList.size() == 1 && (!list.isEmpty())) {
                    arrayList.add(ListProtector.get(list, 0));
                }
                return arrayList;
            } catch (Exception unused) {
                return list;
            }
        }
        return list;
    }

    public final void LIZJ(int i, List list) {
        if (i != 1 && i != 3) {
            if (i != 4) {
                LJFF.addAll(list);
                return;
            } else {
                LJI.addAll(list);
                return;
            }
        }
        if (list.size() < 2) {
            list.size();
        }
        List<Aweme> list2 = LJ;
        if (list2 != null) {
            list2.addAll(list);
        }
        if (!DUE.LJFF(false) && !DUE.LJ() && !DUE.LIZLLL()) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        synchronized (this) {
            arrayList.addAll(LJIIIIZZ);
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((InterfaceC36312EMy) it.next()).LIZ();
        }
    }
}
