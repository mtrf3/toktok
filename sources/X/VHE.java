package X;

import Y.ARunnableS25S0300000_14;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ExecutorService;

/* loaded from: classes15.dex */
public final class VHE implements InterfaceC46992IcO {
    public final C79469VGv LIZ = new C79469VGv();
    public final VH8 LIZIZ = new VH8();
    public final ExecutorService LIZJ = C46982IcE.LIZLLL;

    @Override // X.InterfaceC46992IcO
    public final <T> List<T> LIZ(final VHN vhn, final Type type) {
        return (List) C79413VEr.LIZ("match total time cost", new InterfaceC79414VEs() { // from class: X.VHC
            @Override // X.InterfaceC79414VEs
            public final Object execute() {
                VHE vhe = VHE.this;
                VHN vhn2 = vhn;
                Type type2 = type;
                synchronized (vhe) {
                    vhe.LIZ.LIZJ(vhn2);
                    VH8 vh8 = vhe.LIZIZ;
                    vh8.LIZ = vhn2;
                    if (vh8.LIZJ == null) {
                        vh8.LIZ();
                    }
                    List<VH6> LIZIZ = vhe.LIZ.LIZIZ(vh8.LIZJ);
                    ExecutorService executorService = vhe.LIZJ;
                    if (executorService != null) {
                        executorService.execute(new ARunnableS25S0300000_14(vhe, vhn2, LIZIZ, 34));
                    }
                    ArrayList arrayList = (ArrayList) LIZIZ;
                    if (arrayList.size() == 0) {
                        return null;
                    }
                    ArrayList arrayList2 = new ArrayList();
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        arrayList2.add(C36900Ee0.LIZ(((VH6) it.next()).LIZLLL, type2));
                    }
                    return arrayList2;
                }
            }
        });
    }
}
