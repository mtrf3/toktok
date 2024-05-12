package X;

/* renamed from: X.Fxe, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C40666Fxe<T> implements InterfaceC153055zZ, InterfaceC38408F5o {
    public static final Object LJLJI = new Object();
    public volatile InterfaceC153055zZ<T> LJLIL;
    public volatile Object LJLILLLLZI = LJLJI;

    public C40666Fxe(InterfaceC153055zZ<T> interfaceC153055zZ) {
        this.LJLIL = interfaceC153055zZ;
    }

    @Override // X.InterfaceC153055zZ
    public final T a() {
        T t = (T) this.LJLILLLLZI;
        Object obj = LJLJI;
        if (t == obj) {
            synchronized (this) {
                t = (T) this.LJLILLLLZI;
                if (t == obj) {
                    t = this.LJLIL.a();
                    Object obj2 = this.LJLILLLLZI;
                    if (obj2 != obj && obj2 != t) {
                        String valueOf = String.valueOf(obj2);
                        String valueOf2 = String.valueOf(t);
                        StringBuilder sb = new StringBuilder(valueOf.length() + 118 + valueOf2.length());
                        sb.append("Scoped provider was invoked recursively returning different results: ");
                        sb.append(valueOf);
                        sb.append(" & ");
                        sb.append(valueOf2);
                        sb.append(". This is likely due to a circular dependency.");
                        throw new IllegalStateException(sb.toString());
                    }
                    this.LJLILLLLZI = t;
                    this.LJLIL = null;
                }
            }
        }
        return t;
    }

    public static <P extends InterfaceC153055zZ<T>, T> InterfaceC153055zZ<T> LIZ(P p) {
        if (p instanceof C40666Fxe) {
            return p;
        }
        return new C40666Fxe(p);
    }

    public static <P extends InterfaceC153055zZ<T>, T> InterfaceC38408F5o<T> LIZIZ(P p) {
        if (p instanceof InterfaceC38408F5o) {
            return (InterfaceC38408F5o) p;
        }
        p.getClass();
        return new C40666Fxe(p);
    }
}
