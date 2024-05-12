package ms.bd.o;

import X.C64797Pbt;
import X.C65083PgV;
import X.EJ6;
import X.F7S;
import X.FBZ;
import X.InterfaceC37216Ej6;
import X.V1M;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes7.dex */
public class i2 extends g2 {
    public InterfaceC37216Ej6 LIZ;
    public long LIZIZ;

    public final void finalize() {
        InterfaceC37216Ej6 interfaceC37216Ej6 = this.LIZ;
        synchronized (C65083PgV.class) {
            if (interfaceC37216Ej6 != null) {
                String name = interfaceC37216Ej6.getClass().getName();
                InterfaceC37216Ej6 interfaceC37216Ej62 = (InterfaceC37216Ej6) ((ConcurrentHashMap) C65083PgV.LIZIZ).get(name);
                if (interfaceC37216Ej62 != null) {
                    C65083PgV.LIZ.remove(interfaceC37216Ej62);
                    ((ConcurrentHashMap) C65083PgV.LIZIZ).remove(name);
                    V1M.LJJJJIZL(C65083PgV.LIZJ, interfaceC37216Ej62);
                    V1M.LJJJJIZL(C65083PgV.LIZLLL, interfaceC37216Ej62);
                }
            }
        }
        super.finalize();
    }

    /* loaded from: classes7.dex */
    public class a implements InterfaceC37216Ej6 {
        public a() {
        }

        @Override // X.InterfaceC37216Ej6
        public final C64797Pbt intercept(FBZ fbz) {
            F7S f7s = (F7S) fbz;
            C64797Pbt LIZ = f7s.LIZ(f7s.LIZJ);
            Iterator<EJ6> it = LIZ.LIZ.LIZLLL.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                EJ6 next = it.next();
                if (((String) k.a(16777217, 0, 0L, "a42233", new byte[]{104, 123, 85, 11, 22, 44, 101})).equals(next.LIZ) && next.LIZIZ != null) {
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(k.a(16777217, 0, 0L, "c2e2db", new byte[]{96, 53, 6, 121, 95, 116, 116, 18}));
                    arrayList.add(next.LIZIZ);
                    k.a(117440513, 0, i2.this.LIZIZ, (String) k.a(16777217, 0, 0L, "4ced20", new byte[]{55, 100, 6, 31, 31, 51}), arrayList.toArray(new String[0]));
                    break;
                }
            }
            return LIZ;
        }
    }

    @Override // ms.bd.o.g2
    public final Object LIZJ(long j) {
        this.LIZIZ = j;
        a aVar = new a();
        this.LIZ = aVar;
        C65083PgV.LIZIZ(aVar);
        return Boolean.TRUE;
    }
}
