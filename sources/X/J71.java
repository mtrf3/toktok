package X;

import java.util.Objects;

/* loaded from: classes9.dex */
public final class J71 implements InterfaceC32365Cn3, Cloneable {
    public final String LJLIL;
    public final String LJLILLLLZI;

    public final int hashCode() {
        return Objects.hash(this.LJLIL, this.LJLILLLLZI);
    }

    public final String toString() {
        int length = this.LJLIL.length();
        String str = this.LJLILLLLZI;
        if (str != null) {
            length = C1FL.LIZ(str, 1, length);
        }
        J70 j70 = new J70(length);
        j70.L(this.LJLIL);
        if (this.LJLILLLLZI != null) {
            j70.L("=");
            j70.L(this.LJLILLLLZI);
        }
        return j70.toString();
    }

    public final Object clone() {
        return super.clone();
    }

    @Override // X.InterfaceC32365Cn3
    public final String getName() {
        return this.LJLIL;
    }

    @Override // X.InterfaceC32365Cn3
    public final String getValue() {
        return this.LJLILLLLZI;
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof InterfaceC32365Cn3)) {
            return false;
        }
        J71 j71 = (J71) obj;
        if (!this.LJLIL.equals(j71.LJLIL) || !Objects.equals(this.LJLILLLLZI, j71.LJLILLLLZI)) {
            return false;
        }
        return true;
    }

    public J71(String str, String str2) {
        if (str != null) {
            this.LJLIL = str;
            this.LJLILLLLZI = str2;
            return;
        }
        throw new IllegalArgumentException("Name may not be null");
    }
}
