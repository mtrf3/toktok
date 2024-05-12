package X;

import X.AbstractC73265SpB;
import android.util.SparseArray;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AqS178S0100000_12;
import kotlin.jvm.internal.o;

/* renamed from: X.Soi, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public class C73236Soi<VH extends AbstractC73265SpB<?>> {
    public final SparseArray<InterfaceC88472Yns<ViewGroup, VH>> LIZ = new SparseArray<>();
    public int LIZIZ;
    public final List<C72812Shs<VH>> LIZJ;
    public final C73240Som LIZLLL;

    public void LIZJ(AbstractC73265SpB abstractC73265SpB) {
        throw null;
    }

    public VH LIZLLL(ViewGroup viewGroup) {
        throw null;
    }

    public VH LJII(int i) {
        throw null;
    }

    public C73236Soi() {
        this.LIZIZ = 11513600;
        AqS178S0100000_12 aqS178S0100000_12 = new AqS178S0100000_12((C73236Soi) this, 99);
        C73255Sp1 c73255Sp1 = C73255Sp1.LJLIL;
        int i = this.LIZIZ;
        this.LIZIZ = i + 1;
        this.LIZJ = C47261Igj.LJJIJIL(new C72812Shs(aqS178S0100000_12, c73255Sp1, i, null));
        this.LIZLLL = new C73240Som();
    }

    public final int LIZIZ(int i) {
        C72812Shs<VH> c72812Shs;
        Iterator<C72812Shs<VH>> it = this.LIZJ.iterator();
        while (true) {
            if (it.hasNext()) {
                c72812Shs = it.next();
                if (c72812Shs.LIZIZ.invoke(Integer.valueOf(i)).booleanValue()) {
                    break;
                }
            } else {
                c72812Shs = null;
                break;
            }
        }
        C72812Shs<VH> c72812Shs2 = c72812Shs;
        if (c72812Shs2 != null) {
            InterfaceC88472Yns<ViewGroup, VH> interfaceC88472Yns = c72812Shs2.LIZ;
            int i2 = c72812Shs2.LIZJ;
            if (this.LIZ.get(i2) == null) {
                this.LIZ.put(i2, interfaceC88472Yns);
            }
            return i2;
        }
        "no factory is registered for this item type".toString();
        throw new IllegalArgumentException("no factory is registered for this item type");
    }

    public final void LJ(RecyclerView recyclerView) {
        o.LJIIJ(recyclerView, "recyclerView");
        C73240Som c73240Som = this.LIZLLL;
        c73240Som.getClass();
        ViewOnAttachStateChangeListenerC73199So7 viewOnAttachStateChangeListenerC73199So7 = c73240Som.LIZIZ;
        viewOnAttachStateChangeListenerC73199So7.getClass();
        viewOnAttachStateChangeListenerC73199So7.LJLIL = recyclerView;
        recyclerView.addOnAttachStateChangeListener(viewOnAttachStateChangeListenerC73199So7);
        c73240Som.LIZJ = new C73245Sor();
        for (C72812Shs<VH> c72812Shs : this.LIZJ) {
            int i = c72812Shs.LIZJ;
            InterfaceC88471Ynr<Integer, RecyclerView, C76800UCe> interfaceC88471Ynr = c72812Shs.LIZLLL;
            if (interfaceC88471Ynr != null) {
                interfaceC88471Ynr.invoke(Integer.valueOf(i), recyclerView);
            }
        }
    }

    public final AbstractC73265SpB LIZ(int i, ViewGroup parent) {
        o.LJIIJ(parent, "parent");
        VH LJII = LJII(i);
        if (LJII != null) {
            return LJII;
        }
        if (this.LIZ.indexOfKey(i) >= 0) {
            InterfaceC88472Yns<ViewGroup, VH> interfaceC88472Yns = this.LIZ.get(i);
            o.LJFF(interfaceC88472Yns, "factories[viewType]");
            VH invoke = interfaceC88472Yns.invoke(parent);
            LIZJ(invoke);
            return invoke;
        }
        String LIZIZ = C0NY.LIZIZ("no factory for viewType ", i, " is registered");
        LIZIZ.toString();
        throw new IllegalArgumentException(LIZIZ);
    }

    public final C73236Soi LJI(InterfaceC88471Ynr interfaceC88471Ynr, AqS178S0100000_12 aqS178S0100000_12) {
        InterfaceC88472Yns<ViewGroup, VH> interfaceC88472Yns = this.LIZ.get(0);
        if (interfaceC88472Yns == null) {
            ListProtector.add(this.LIZJ, this.LIZJ.size() - 1, new C72812Shs(aqS178S0100000_12, C2N3.LJLIL, 0, interfaceC88471Ynr));
            this.LIZ.put(0, aqS178S0100000_12);
            return this;
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("factory's viewType ");
        LIZ.append(0);
        LIZ.append(' ');
        LIZ.append(C16880lQ.LJLLJ(interfaceC88472Yns.getClass()));
        LIZ.append(" is already registered");
        String LIZIZ = X1D.LIZIZ(LIZ);
        LIZIZ.toString();
        throw new IllegalArgumentException(LIZIZ);
    }

    public final C73236Soi LJFF(InterfaceC88472Yns typeMatcher, InterfaceC88472Yns factory, InterfaceC88471Ynr interfaceC88471Ynr) {
        o.LJIIJ(typeMatcher, "typeMatcher");
        o.LJIIJ(factory, "factory");
        int size = this.LIZJ.size();
        int i = this.LIZIZ;
        this.LIZIZ = i + 1;
        ListProtector.add(this.LIZJ, size - 1, new C72812Shs(factory, typeMatcher, i, interfaceC88471Ynr));
        return this;
    }
}
