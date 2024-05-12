package X;

import java.io.Serializable;

/* renamed from: X.Ol2, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C62816Ol2 implements Serializable, InterfaceC62818Ol4 {
    public final InterfaceC62818Ol4 LJLIL;
    public volatile transient boolean LJLILLLLZI;
    public transient Object LJLJI;

    public final String toString() {
        Object obj;
        StringBuilder sb = new StringBuilder("Suppliers.memoize(");
        if (this.LJLILLLLZI) {
            obj = "<supplier that returned " + this.LJLJI + ">";
        } else {
            obj = this.LJLIL;
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
                    Object zza = this.LJLIL.zza();
                    this.LJLJI = zza;
                    this.LJLILLLLZI = true;
                    return zza;
                }
            }
        }
        return this.LJLJI;
    }

    public C62816Ol2(InterfaceC62818Ol4 interfaceC62818Ol4) {
        this.LJLIL = interfaceC62818Ol4;
    }
}
