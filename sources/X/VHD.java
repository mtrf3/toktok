package X;

import Y.ARunnableS25S0300000_14;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ExecutorService;

/* loaded from: classes15.dex */
public final class VHD implements InterfaceC46993IcP {
    public final C79469VGv LIZ = new C79469VGv();
    public final VH9 LIZIZ = new VH9();
    public final VH8 LIZJ = new VH8();
    public final ExecutorService LIZLLL = C46982IcE.LIZLLL;

    @Override // X.InterfaceC46993IcP
    public final <T> T LIZ(final VHN vhn, final Type type) {
        return (T) C79413VEr.LIZ("pick total cost", new InterfaceC79414VEs() { // from class: X.VHB
            @Override // X.InterfaceC79414VEs
            public final Object execute() {
                Object obj;
                VH6 vh6;
                VHD vhd = VHD.this;
                VHN vhn2 = vhn;
                Type type2 = type;
                synchronized (vhd) {
                    vhd.LIZ.LIZJ(vhn2);
                    vhd.LIZIZ.LIZIZ(vhn2);
                    VH8 vh8 = vhd.LIZJ;
                    vh8.LIZ = vhn2;
                    if (vh8.LIZIZ == null) {
                        vh8.LIZIZ = vh8.LIZ();
                    }
                    List<List<VH6>> list = vh8.LIZIZ;
                    obj = null;
                    if (list != null) {
                        Iterator it = ((ArrayList) list).iterator();
                        while (true) {
                            if (it.hasNext()) {
                                List<VH6> LIZIZ = vhd.LIZ.LIZIZ((List) it.next());
                                int size = ((ArrayList) LIZIZ).size();
                                if (size == 1) {
                                    vh6 = (VH6) ListProtector.get(LIZIZ, 0);
                                } else {
                                    vh6 = null;
                                }
                                if (size > 1) {
                                    vh6 = vhd.LIZIZ.LIZ(LIZIZ);
                                }
                                if (vh6 != null) {
                                    obj = C36900Ee0.LIZ(vh6.LIZLLL, type2);
                                    ExecutorService executorService = vhd.LIZLLL;
                                    if (executorService != null) {
                                        executorService.execute(new ARunnableS25S0300000_14(vhd, vhn2, vh6, 35));
                                    }
                                }
                            } else {
                                ExecutorService executorService2 = vhd.LIZLLL;
                                if (executorService2 != null) {
                                    executorService2.execute(new ARunnableS25S0300000_14(vhd, vhn2, null, 35));
                                }
                            }
                        }
                    }
                }
                return obj;
            }
        });
    }
}
