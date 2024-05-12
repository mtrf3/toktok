package X;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.N0f, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C58653N0f implements InterfaceC58626Mze<OSJ<? extends String, ? extends String, ? extends String>> {
    public final String LIZ;
    public final String LIZIZ;
    public final String LIZJ;
    public final InterfaceC58549MyP LIZLLL;
    public final InterfaceC58602MzG<?, ?>[] LJ;
    public final String LJFF;
    public final OSJ<String, String, String> LJI;

    public C58653N0f() {
        throw null;
    }

    @Override // X.InterfaceC58626Mze
    public final InterfaceC58549MyP LIZ() {
        return this.LIZLLL;
    }

    @Override // X.InterfaceC58626Mze
    public final String LIZIZ() {
        return this.LJFF;
    }

    @Override // X.InterfaceC58626Mze
    public final /* bridge */ /* synthetic */ OSJ<? extends String, ? extends String, ? extends String> getEventId() {
        return this.LJI;
    }

    @Override // X.InterfaceC58626Mze
    public final InterfaceC58602MzG<?, ?>[] getKeys() {
        return this.LJ;
    }

    public C58653N0f(String str, String str2, String str3, InterfaceC58602MzG[] defaultKeys, InterfaceC58602MzG[] keys) {
        o.LJIIIZ(defaultKeys, "defaultKeys");
        o.LJIIIZ(keys, "keys");
        this.LIZ = str;
        this.LIZIZ = str2;
        this.LIZJ = str3;
        this.LIZLLL = null;
        List LJLIIIL = ORY.LJLIIIL(keys);
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = (ArrayList) LJLIIIL;
        Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            if (next instanceof C58650N0c) {
                arrayList.add(next);
            }
        }
        C58650N0c c58650N0c = (C58650N0c) ORZ.LJLLLL(arrayList);
        ArrayList arrayList3 = new ArrayList();
        for (InterfaceC58602MzG interfaceC58602MzG : defaultKeys) {
            if (interfaceC58602MzG instanceof C58650N0c) {
                arrayList3.add(interfaceC58602MzG);
            }
        }
        C58650N0c c58650N0c2 = (C58650N0c) ORZ.LJLLLL(arrayList3);
        if (c58650N0c != null && c58650N0c2 != null) {
            ORS.LJJLIL(C58630Mzi.LJLIL, LJLIIIL);
            QSQ qsq = new QSQ(2);
            qsq.LJ(c58650N0c.LIZ);
            qsq.LJ(c58650N0c2.LIZ);
            arrayList2.add(new C58650N0c((InterfaceC58602MzG[]) qsq.LJIIIZ(new InterfaceC58602MzG[qsq.LJFF()])));
        }
        ORS.LJJLIIIJJIZ(LJLIIIL, defaultKeys);
        Object[] array = arrayList2.toArray(new InterfaceC58602MzG[0]);
        if (array != null) {
            this.LJ = (InterfaceC58602MzG[]) array;
            String str4 = this.LIZ;
            this.LJFF = str4;
            this.LJI = new OSJ<>(str4, this.LIZIZ, this.LIZJ);
            return;
        }
        throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
    }
}
