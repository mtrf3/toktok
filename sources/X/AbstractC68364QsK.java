package X;

import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.QsK, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public abstract class AbstractC68364QsK implements InterfaceC68379QsZ, InterfaceC68406Qt0 {
    public final String LJLIL;
    public final java.util.Map LJLILLLLZI = new HashMap();

    public abstract InterfaceC68379QsZ LIZ(C68377QsX c68377QsX, List list);

    @Override // X.InterfaceC68379QsZ
    public InterfaceC68379QsZ LIZLLL() {
        return this;
    }

    @Override // X.InterfaceC68379QsZ
    public final String LJII() {
        return this.LJLIL;
    }

    @Override // X.InterfaceC68379QsZ
    public final Double LJI() {
        return Double.valueOf(Double.NaN);
    }

    @Override // X.InterfaceC68379QsZ
    public final Iterator LJIIJ() {
        return new C68401Qsv(((HashMap) this.LJLILLLLZI).keySet().iterator());
    }

    public final int hashCode() {
        String str = this.LJLIL;
        if (str != null) {
            return str.hashCode();
        }
        return 0;
    }

    @Override // X.InterfaceC68379QsZ
    public final Boolean LIZJ() {
        return Boolean.TRUE;
    }

    public AbstractC68364QsK(String str) {
        this.LJLIL = str;
    }

    @Override // X.InterfaceC68406Qt0
    public final boolean LJFF(String str) {
        return ((HashMap) this.LJLILLLLZI).containsKey(str);
    }

    @Override // X.InterfaceC68406Qt0
    public final InterfaceC68379QsZ LJIIIZ(String str) {
        if (((HashMap) this.LJLILLLLZI).containsKey(str)) {
            return (InterfaceC68379QsZ) ((HashMap) this.LJLILLLLZI).get(str);
        }
        return InterfaceC68379QsZ.LJIIJ;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AbstractC68364QsK)) {
            return false;
        }
        AbstractC68364QsK abstractC68364QsK = (AbstractC68364QsK) obj;
        String str = this.LJLIL;
        if (str == null) {
            return false;
        }
        return str.equals(abstractC68364QsK.LJLIL);
    }

    @Override // X.InterfaceC68406Qt0
    public final void LJIIIIZZ(String str, InterfaceC68379QsZ interfaceC68379QsZ) {
        if (interfaceC68379QsZ == null) {
            ((HashMap) this.LJLILLLLZI).remove(str);
        } else {
            ((HashMap) this.LJLILLLLZI).put(str, interfaceC68379QsZ);
        }
    }

    @Override // X.InterfaceC68379QsZ
    public final InterfaceC68379QsZ LJIILJJIL(String str, C68377QsX c68377QsX, List list) {
        if ("toString".equals(str)) {
            return new C68376QsW(this.LJLIL);
        }
        return C1DH.LJJJJ(this, new C68376QsW(str), c68377QsX, list);
    }
}
