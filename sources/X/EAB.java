package X;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.internal.AqS172S0100000_6;

/* loaded from: classes7.dex */
public final class EAB {
    public final CopyOnWriteArrayList<String> LIZ;
    public final EAA LIZIZ;

    public final String[] LIZJ() {
        CopyOnWriteArrayList<String> copyOnWriteArrayList = this.LIZ;
        if (copyOnWriteArrayList != null) {
            Object[] array = copyOnWriteArrayList.toArray(new String[0]);
            if (array != null) {
                return (String[]) array;
            }
            throw new C37692Eqm("null cannot be cast to non-null type kotlin.Array<T>");
        }
        throw new C37692Eqm("null cannot be cast to non-null type java.util.Collection<T>");
    }

    public final void LIZLLL() {
        EAA eaa = this.LIZIZ;
        CopyOnWriteArrayList<String> copyOnWriteArrayList = this.LIZ;
        if (copyOnWriteArrayList != null) {
            Object[] array = copyOnWriteArrayList.toArray(new String[0]);
            if (array != null) {
                eaa.LIZIZ((String[]) array);
                return;
            }
            throw new C37692Eqm("null cannot be cast to non-null type kotlin.Array<T>");
        }
        throw new C37692Eqm("null cannot be cast to non-null type java.util.Collection<T>");
    }

    public EAB(EAA eaa) {
        this.LIZIZ = eaa;
        CopyOnWriteArrayList<String> copyOnWriteArrayList = new CopyOnWriteArrayList<>();
        this.LIZ = copyOnWriteArrayList;
        String[] LIZ = eaa.LIZ();
        if (LIZ.length == 0) {
            return;
        }
        ORS.LJJLIIIJJIZ(copyOnWriteArrayList, LIZ);
    }

    public final void LIZ(List<String> list) {
        java.util.Set LIZIZ = LIZIZ(new AqS172S0100000_6(this, 121), list);
        if (!LIZIZ.isEmpty()) {
            this.LIZ.addAll(LIZIZ);
            LIZLLL();
        }
    }

    public final void LJ(List<String> list) {
        java.util.Set LIZIZ = LIZIZ(new AqS172S0100000_6(this, 122), list);
        if (!LIZIZ.isEmpty()) {
            this.LIZ.removeAll(LIZIZ);
            LIZLLL();
        }
    }

    public static java.util.Set LIZIZ(InterfaceC88472Yns interfaceC88472Yns, List list) {
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (((Boolean) interfaceC88472Yns.invoke(obj)).booleanValue()) {
                arrayList.add(obj);
            }
        }
        return ORZ.LLJJ(arrayList);
    }
}
