package X;

/* renamed from: X.Ol3, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C62817Ol3 implements InterfaceC62818Ol4 {
    public volatile InterfaceC62818Ol4 LJLIL;
    public volatile boolean LJLILLLLZI;
    public Object LJLJI;

    public final String toString() {
        Object obj = this.LJLIL;
        StringBuilder sb = new StringBuilder("Suppliers.memoize(");
        if (obj == null) {
            obj = "<supplier that returned " + this.LJLJI + ">";
        }
        sb.append(obj);
        sb.append(")");
        return sb.toString();
    }

    @Override // X.InterfaceC62818Ol4
    public final Object zza() {
        if (!this.LJLILLLLZI) {
            synchronized (this) {
                if (!this.LJLILLLLZI) {
                    InterfaceC62818Ol4 interfaceC62818Ol4 = this.LJLIL;
                    interfaceC62818Ol4.getClass();
                    Object zza = interfaceC62818Ol4.zza();
                    this.LJLJI = zza;
                    this.LJLILLLLZI = true;
                    this.LJLIL = null;
                    return zza;
                }
            }
        }
        return this.LJLJI;
    }

    public C62817Ol3(InterfaceC62818Ol4 interfaceC62818Ol4) {
        this.LJLIL = interfaceC62818Ol4;
    }
}
