package X;

import java.util.Iterator;
import java.util.List;

/* renamed from: X.Qsb, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C68381Qsb implements InterfaceC68379QsZ {
    public final InterfaceC68379QsZ LJLIL;
    public final String LJLILLLLZI;

    public C68381Qsb(String str) {
        this.LJLIL = InterfaceC68379QsZ.LJIIJ;
        this.LJLILLLLZI = str;
    }

    public C68381Qsb(String str, InterfaceC68379QsZ interfaceC68379QsZ) {
        this.LJLIL = interfaceC68379QsZ;
        this.LJLILLLLZI = str;
    }

    @Override // X.InterfaceC68379QsZ
    public final Iterator LJIIJ() {
        return null;
    }

    @Override // X.InterfaceC68379QsZ
    public final Boolean LIZJ() {
        throw new IllegalStateException("Control is not a boolean");
    }

    @Override // X.InterfaceC68379QsZ
    public final InterfaceC68379QsZ LIZLLL() {
        return new C68381Qsb(this.LJLILLLLZI, this.LJLIL.LIZLLL());
    }

    @Override // X.InterfaceC68379QsZ
    public final Double LJI() {
        throw new IllegalStateException("Control is not a double");
    }

    @Override // X.InterfaceC68379QsZ
    public final String LJII() {
        throw new IllegalStateException("Control is not a String");
    }

    public final int hashCode() {
        return this.LJLIL.hashCode() + (this.LJLILLLLZI.hashCode() * 31);
    }

    public C68381Qsb() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C68381Qsb)) {
            return false;
        }
        C68381Qsb c68381Qsb = (C68381Qsb) obj;
        if (this.LJLILLLLZI.equals(c68381Qsb.LJLILLLLZI) && this.LJLIL.equals(c68381Qsb.LJLIL)) {
            return true;
        }
        return false;
    }

    @Override // X.InterfaceC68379QsZ
    public final InterfaceC68379QsZ LJIILJJIL(String str, C68377QsX c68377QsX, List list) {
        throw new IllegalStateException("Control does not have functions");
    }
}
