package X;

import X.C3C8;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.internal.AqS134S0200000_3;
import kotlin.jvm.internal.AqS150S0200000_3;
import kotlin.jvm.internal.o;

/* renamed from: X.8YF, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C8YF<R extends C3C8, ITEM> implements InterfaceC212878Xb<R, ITEM> {
    public final C62822Ol8 LIZ;

    public final CopyOnWriteArrayList<C212988Xm<?, ?>> LJ() {
        return (CopyOnWriteArrayList) this.LIZ.getValue();
    }

    public C8YF(AbstractC029409q<?> adapter) {
        o.LJIIIZ(adapter, "adapter");
        adapter.registerAdapterDataObserver(new AbstractC029609s(this) { // from class: X.8YG
            public final /* synthetic */ C8YF<R, ITEM> LJLIL;

            {
                this.LJLIL = this;
            }

            @Override // X.AbstractC029609s
            public final void LJFF(int i, int i2) {
                if (i < 0 || i2 <= 0) {
                    return;
                }
                this.LJLIL.LJFF(i, i2);
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // X.AbstractC029609s
            public final void LJI(int i, int i2) {
                C8YF<R, ITEM> c8yf = this.LJLIL;
                int size = c8yf.LJ().size();
                if (i2 < 0 || i2 >= size || i == i2) {
                    return;
                }
                Object LJLLLLLL = ORZ.LJLLLLLL(i, c8yf.LJ());
                c8yf.LJ().remove(LJLLLLLL);
                c8yf.LJ().add(i2, LJLLLLLL);
            }

            @Override // X.AbstractC029609s
            public final void LJII(int i, int i2) {
                C8YF<R, ITEM> c8yf = this.LJLIL;
                if (c8yf.LJ().size() > i) {
                    int i3 = i2 + i;
                    int size = c8yf.LJ().size();
                    if (i3 > size) {
                        i3 = size;
                    }
                    List<C212988Xm<?, ?>> subList = c8yf.LJ().subList(i, i3);
                    o.LJIIIIZZ(subList, "proxies.subList(position, end)");
                    Iterator<C212988Xm<?, ?>> it = subList.iterator();
                    while (it.hasNext()) {
                        it.next();
                        c8yf.LJ().remove(i);
                    }
                }
            }
        });
        this.LIZ = C221108m2.LIZIZ(C8YH.LJLIL);
    }

    public final void LJFF(int i, int i2) {
        C212988Xm[] c212988XmArr = new C212988Xm[i2];
        Arrays.fill(c212988XmArr, (Object) null);
        if (LJ().size() >= i) {
            LJ().addAll(i, ORY.LJJZZIII(c212988XmArr));
        }
    }

    @Override // X.InterfaceC212878Xb
    public final void LIZIZ(C8RL item, InterfaceC212998Xn<?, ?> proxyHolder, int i, List<? extends Object> list) {
        boolean z;
        InterfaceC212978Xl<?, ?> interfaceC212978Xl;
        C212988Xm<?, ?> c212988Xm;
        C212988Xm<?, ?> c212988Xm2;
        o.LJIIIZ(item, "item");
        o.LJIIIZ(proxyHolder, "proxyHolder");
        if (LJ().size() <= i) {
            LJFF(LJ().size(), (i - LJ().size()) + 1);
        }
        InterfaceC65350Pko<?> interfaceC65350Pko = null;
        if (LJ().get(i) == null) {
            LJ().set(i, new C212988Xm<>(C65352Pkq.LIZ(proxyHolder.getClass()), proxyHolder.getChild()));
        } else {
            boolean z2 = false;
            if (proxyHolder.getChild() == null && (c212988Xm = LJ().get(i)) != null && c212988Xm.LIZIZ != null) {
                z = true;
            } else {
                z = false;
            }
            C65776Prg LIZ = C65352Pkq.LIZ(proxyHolder.getClass());
            C212988Xm<?, ?> c212988Xm3 = LJ().get(i);
            if (c212988Xm3 != null) {
                interfaceC65350Pko = c212988Xm3.LIZ;
            }
            boolean z3 = !o.LJ(LIZ, interfaceC65350Pko);
            if (z || z3) {
                z2 = true;
            }
            C8YJ c8yj = C8YI.LIZ;
            if (c8yj != null) {
                StringBuilder LIZ2 = X1D.LIZ();
                LIZ2.append("bindProxy item: ");
                LIZ2.append(item);
                LIZ2.append(", ");
                LIZ2.append(i);
                LIZ2.append(", ");
                LIZ2.append(z2);
                c8yj.log(X1D.LIZIZ(LIZ2));
            }
            if (z2) {
                C212988Xm<?, ?> c212988Xm4 = LJ().get(i);
                if (c212988Xm4 != null && (interfaceC212978Xl = c212988Xm4.LIZIZ) != null) {
                    interfaceC212978Xl.LJ(true);
                }
                LJ().set(i, new C212988Xm<>(C65352Pkq.LIZ(proxyHolder.getClass()), proxyHolder.getChild()));
            }
        }
        C212988Xm<?, ?> proxy = proxyHolder.getProxy();
        if (proxy != null) {
            proxy.LIZIZ();
        }
        C212988Xm<?, ?> c212988Xm5 = LJ().get(i);
        if ((c212988Xm5 instanceof C212988Xm) && (c212988Xm2 = c212988Xm5) != null) {
            c212988Xm2.LIZ(i, proxyHolder, item, list, new AqS134S0200000_3(this, c212988Xm2, 21), new AqS150S0200000_3(this, c212988Xm2, 3));
        }
    }
}
