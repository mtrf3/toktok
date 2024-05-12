package X;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.Qsm, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C68392Qsm implements InterfaceC68379QsZ {
    public final String LJLIL;
    public final ArrayList LJLILLLLZI;

    @Override // X.InterfaceC68379QsZ
    public final InterfaceC68379QsZ LIZLLL() {
        return this;
    }

    @Override // X.InterfaceC68379QsZ
    public final Iterator LJIIJ() {
        return null;
    }

    @Override // X.InterfaceC68379QsZ
    public final Boolean LIZJ() {
        throw new IllegalStateException("Statement cannot be cast as Boolean");
    }

    @Override // X.InterfaceC68379QsZ
    public final Double LJI() {
        throw new IllegalStateException("Statement cannot be cast as Double");
    }

    @Override // X.InterfaceC68379QsZ
    public final String LJII() {
        throw new IllegalStateException("Statement cannot be cast as String");
    }

    public final int hashCode() {
        int i;
        String str = this.LJLIL;
        if (str != null) {
            i = str.hashCode();
        } else {
            i = 0;
        }
        return this.LJLILLLLZI.hashCode() + (i * 31);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C68392Qsm)) {
            return false;
        }
        C68392Qsm c68392Qsm = (C68392Qsm) obj;
        String str = this.LJLIL;
        if (str == null ? c68392Qsm.LJLIL != null : !str.equals(c68392Qsm.LJLIL)) {
            return false;
        }
        return this.LJLILLLLZI.equals(c68392Qsm.LJLILLLLZI);
    }

    public C68392Qsm(String str, List list) {
        this.LJLIL = str;
        ArrayList arrayList = new ArrayList();
        this.LJLILLLLZI = arrayList;
        arrayList.addAll(list);
    }

    @Override // X.InterfaceC68379QsZ
    public final InterfaceC68379QsZ LJIILJJIL(String str, C68377QsX c68377QsX, List list) {
        throw new IllegalStateException("Statement is not an evaluated entity");
    }
}
