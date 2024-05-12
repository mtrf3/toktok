package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/* renamed from: X.Sq3, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C73319Sq3 implements InterfaceC92693kP, InterfaceC73955T0t {
    public List<InterfaceC92693kP> LJLIL;
    public volatile boolean LJLILLLLZI;

    @Override // X.InterfaceC92693kP
    public final void dispose() {
        if (this.LJLILLLLZI) {
            return;
        }
        synchronized (this) {
            if (this.LJLILLLLZI) {
                return;
            }
            this.LJLILLLLZI = true;
            List<InterfaceC92693kP> list = this.LJLIL;
            ArrayList arrayList = null;
            this.LJLIL = null;
            if (list == null) {
                return;
            }
            Iterator<InterfaceC92693kP> it = list.iterator();
            while (it.hasNext()) {
                try {
                    it.next().dispose();
                } catch (Throwable th) {
                    V0N.LJJIL(th);
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    arrayList.add(th);
                }
            }
            if (arrayList == null) {
                return;
            }
            if (arrayList.size() == 1) {
                throw C73864Syq.LIZIZ((Throwable) ListProtector.get(arrayList, 0));
            }
            throw new C63756P0m(arrayList);
        }
    }

    @Override // X.InterfaceC92693kP
    public final boolean isDisposed() {
        return this.LJLILLLLZI;
    }

    @Override // X.InterfaceC73955T0t
    public final boolean LIZ(InterfaceC92693kP interfaceC92693kP) {
        if (!this.LJLILLLLZI) {
            synchronized (this) {
                if (!this.LJLILLLLZI) {
                    List list = this.LJLIL;
                    if (list == null) {
                        list = new LinkedList();
                        this.LJLIL = list;
                    }
                    list.add(interfaceC92693kP);
                    return true;
                }
            }
        }
        interfaceC92693kP.dispose();
        return false;
    }

    @Override // X.InterfaceC73955T0t
    public final boolean LIZIZ(InterfaceC92693kP interfaceC92693kP) {
        if (LIZJ(interfaceC92693kP)) {
            interfaceC92693kP.dispose();
            return true;
        }
        return false;
    }

    @Override // X.InterfaceC73955T0t
    public final boolean LIZJ(InterfaceC92693kP interfaceC92693kP) {
        C73320Sq4.LIZ(interfaceC92693kP, "Disposable item is null");
        if (this.LJLILLLLZI) {
            return false;
        }
        synchronized (this) {
            if (this.LJLILLLLZI) {
                return false;
            }
            List<InterfaceC92693kP> list = this.LJLIL;
            if (list == null || !((LinkedList) list).remove(interfaceC92693kP)) {
                return false;
            }
            return true;
        }
    }
}
