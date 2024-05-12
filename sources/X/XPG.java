package X;

import java.lang.ref.ReferenceQueue;

/* loaded from: classes16.dex */
public class XPG<K, V> implements XPL<K, V> {
    public volatile XPL<K, V> LJLIL;
    public final XP8<V> LJLILLLLZI;
    public final C44428Hc8 LJLJI;

    @Override // X.XPL
    public final InterfaceC84796XPs<K, V> LIZIZ() {
        return null;
    }

    @Override // X.XPL
    public final XPL<K, V> LJ(ReferenceQueue<V> referenceQueue, V v, InterfaceC84796XPs<K, V> interfaceC84796XPs) {
        return this;
    }

    @Override // X.XPL
    public final boolean isLoading() {
        return true;
    }

    public XPG() {
        this(XQ3.LLFF);
    }

    @Override // X.XPL
    public final int LIZ() {
        return this.LJLIL.LIZ();
    }

    @Override // X.XPL
    public final V LIZLLL() {
        return (V) P8D.LIZ(this.LJLILLLLZI);
    }

    @Override // X.XPL
    public final V get() {
        return this.LJLIL.get();
    }

    @Override // X.XPL
    public final boolean isActive() {
        return this.LJLIL.isActive();
    }

    public XPG(XPL<K, V> xpl) {
        this.LJLILLLLZI = new XP8<>();
        this.LJLJI = new C44428Hc8();
        this.LJLIL = xpl;
    }

    @Override // X.XPL
    public final void LIZJ(V v) {
        if (v != null) {
            this.LJLILLLLZI.LJIIJ(v);
        } else {
            this.LJLIL = XQ3.LLFF;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final XPE LJFF(Object obj, XPX xpx) {
        XPE xp7;
        C43956HMy<Object> c43956HMy;
        try {
            this.LJLJI.LIZLLL();
            if (this.LJLIL.get() == null) {
                Object call = ((XPZ) xpx).LIZ.call();
                if (this.LJLILLLLZI.LJIIJ(call)) {
                    return this.LJLILLLLZI;
                }
                if (call == null) {
                    return C43956HMy.LJLJI;
                }
                return new C43956HMy(call);
            }
            xpx.getClass();
            obj.getClass();
            Object call2 = ((XPZ) xpx).LIZ.call();
            if (call2 == null) {
                c43956HMy = C43956HMy.LJLJI;
                if (c43956HMy == null) {
                    return C43956HMy.LJLJI;
                }
            } else {
                c43956HMy = new C43956HMy<>(call2);
            }
            XPB xpb = new XPB(c43956HMy, new XPD(this));
            c43956HMy.LJFF(xpb, EnumC169566l6.LJLIL);
            return xpb;
        } catch (Throwable th) {
            if (this.LJLILLLLZI.LJIIJJI(th)) {
                xp7 = this.LJLILLLLZI;
            } else {
                xp7 = new XP7(th);
            }
            if (th instanceof InterruptedException) {
                C16880lQ.LLLLIIIILLL().interrupt();
            }
            return xp7;
        }
    }
}
