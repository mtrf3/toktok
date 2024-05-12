package X;

import java.util.Iterator;
import java.util.List;

/* renamed from: X.QsR, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C68371QsR implements InterfaceC68379QsZ {
    @Override // X.InterfaceC68379QsZ
    public final InterfaceC68379QsZ LIZLLL() {
        return InterfaceC68379QsZ.LJIIJ;
    }

    @Override // X.InterfaceC68379QsZ
    public final String LJII() {
        return "undefined";
    }

    @Override // X.InterfaceC68379QsZ
    public final Iterator LJIIJ() {
        return null;
    }

    @Override // X.InterfaceC68379QsZ
    public final Double LJI() {
        return Double.valueOf(Double.NaN);
    }

    @Override // X.InterfaceC68379QsZ
    public final Boolean LIZJ() {
        return Boolean.FALSE;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return obj instanceof C68371QsR;
    }

    @Override // X.InterfaceC68379QsZ
    public final InterfaceC68379QsZ LJIILJJIL(String str, C68377QsX c68377QsX, List list) {
        throw new IllegalStateException(C16880lQ.LLLZ("Undefined has no function %s", new Object[]{str}));
    }
}
