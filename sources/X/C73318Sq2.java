package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.ArrayList;

/* renamed from: X.Sq2, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C73318Sq2 implements InterfaceC92693kP, InterfaceC73955T0t {
    public C73315Spz<InterfaceC92693kP> LJLIL;
    public volatile boolean LJLILLLLZI;

    public final void LIZLLL() {
        if (this.LJLILLLLZI) {
            return;
        }
        synchronized (this) {
            if (this.LJLILLLLZI) {
                return;
            }
            C73315Spz<InterfaceC92693kP> c73315Spz = this.LJLIL;
            this.LJLIL = null;
            LJ(c73315Spz);
        }
    }

    public final int LJFF() {
        int i = 0;
        if (this.LJLILLLLZI) {
            return 0;
        }
        synchronized (this) {
            if (this.LJLILLLLZI) {
                return 0;
            }
            C73315Spz<InterfaceC92693kP> c73315Spz = this.LJLIL;
            if (c73315Spz != null) {
                i = c73315Spz.LIZIZ;
            }
            return i;
        }
    }

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
            C73315Spz<InterfaceC92693kP> c73315Spz = this.LJLIL;
            this.LJLIL = null;
            LJ(c73315Spz);
        }
    }

    @Override // X.InterfaceC92693kP
    public final boolean isDisposed() {
        return this.LJLILLLLZI;
    }

    public static void LJ(C73315Spz c73315Spz) {
        if (c73315Spz == null) {
            return;
        }
        ArrayList arrayList = null;
        for (Object obj : c73315Spz.LIZLLL) {
            if (obj instanceof InterfaceC92693kP) {
                try {
                    ((InterfaceC92693kP) obj).dispose();
                } catch (Throwable th) {
                    V0N.LJJIL(th);
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    arrayList.add(th);
                }
            }
        }
        if (arrayList != null) {
            if (arrayList.size() == 1) {
                throw C73864Syq.LIZIZ((Throwable) ListProtector.get(arrayList, 0));
            }
            throw new C63756P0m(arrayList);
        }
    }

    @Override // X.InterfaceC73955T0t
    public final boolean LIZ(InterfaceC92693kP interfaceC92693kP) {
        C73320Sq4.LIZ(interfaceC92693kP, "d is null");
        if (!this.LJLILLLLZI) {
            synchronized (this) {
                if (!this.LJLILLLLZI) {
                    C73315Spz<InterfaceC92693kP> c73315Spz = this.LJLIL;
                    if (c73315Spz == null) {
                        c73315Spz = new C73315Spz<>(16);
                        this.LJLIL = c73315Spz;
                    }
                    c73315Spz.LIZ(interfaceC92693kP);
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
            C73315Spz<InterfaceC92693kP> c73315Spz = this.LJLIL;
            if (c73315Spz == null || !c73315Spz.LIZIZ(interfaceC92693kP)) {
                return false;
            }
            return true;
        }
    }
}
