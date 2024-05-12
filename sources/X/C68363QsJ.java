package X;

import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: X.QsJ, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public class C68363QsJ implements InterfaceC68379QsZ, InterfaceC68406Qt0 {
    public final java.util.Map LJLIL = new HashMap();

    @Override // X.InterfaceC68379QsZ
    public final String LJII() {
        return "[object Object]";
    }

    @Override // X.InterfaceC68379QsZ
    public final InterfaceC68379QsZ LIZLLL() {
        C68363QsJ c68363QsJ = new C68363QsJ();
        for (Map.Entry entry : ((HashMap) this.LJLIL).entrySet()) {
            if (entry.getValue() instanceof InterfaceC68406Qt0) {
                ((HashMap) c68363QsJ.LJLIL).put(entry.getKey(), entry.getValue());
            } else {
                ((HashMap) c68363QsJ.LJLIL).put(entry.getKey(), ((InterfaceC68379QsZ) entry.getValue()).LIZLLL());
            }
        }
        return c68363QsJ;
    }

    @Override // X.InterfaceC68379QsZ
    public final Double LJI() {
        return Double.valueOf(Double.NaN);
    }

    @Override // X.InterfaceC68379QsZ
    public final Iterator LJIIJ() {
        return new C68401Qsv(((HashMap) this.LJLIL).keySet().iterator());
    }

    public final int hashCode() {
        return this.LJLIL.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("{");
        if (!((HashMap) this.LJLIL).isEmpty()) {
            for (Object obj : ((HashMap) this.LJLIL).keySet()) {
                sb.append(C16880lQ.LLLZ("%s: %s,", new Object[]{obj, ((HashMap) this.LJLIL).get(obj)}));
            }
            sb.deleteCharAt(sb.lastIndexOf(","));
        }
        sb.append("}");
        return sb.toString();
    }

    @Override // X.InterfaceC68379QsZ
    public final Boolean LIZJ() {
        return Boolean.TRUE;
    }

    @Override // X.InterfaceC68406Qt0
    public final boolean LJFF(String str) {
        return ((HashMap) this.LJLIL).containsKey(str);
    }

    @Override // X.InterfaceC68406Qt0
    public final InterfaceC68379QsZ LJIIIZ(String str) {
        if (((HashMap) this.LJLIL).containsKey(str)) {
            return (InterfaceC68379QsZ) ((HashMap) this.LJLIL).get(str);
        }
        return InterfaceC68379QsZ.LJIIJ;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C68363QsJ)) {
            return false;
        }
        return this.LJLIL.equals(((C68363QsJ) obj).LJLIL);
    }

    @Override // X.InterfaceC68406Qt0
    public final void LJIIIIZZ(String str, InterfaceC68379QsZ interfaceC68379QsZ) {
        if (interfaceC68379QsZ == null) {
            ((HashMap) this.LJLIL).remove(str);
        } else {
            ((HashMap) this.LJLIL).put(str, interfaceC68379QsZ);
        }
    }

    @Override // X.InterfaceC68379QsZ
    public InterfaceC68379QsZ LJIILJJIL(String str, C68377QsX c68377QsX, List list) {
        if ("toString".equals(str)) {
            return new C68376QsW(toString());
        }
        return C1DH.LJJJJ(this, new C68376QsW(str), c68377QsX, list);
    }
}
