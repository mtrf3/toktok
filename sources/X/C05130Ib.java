package X;

import java.io.Serializable;
import java.util.Objects;

/* renamed from: X.0Ib, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C05130Ib implements Cloneable, Serializable {
    public static final long serialVersionUID = -6437800749411518984L;
    public final String LJLIL;
    public final String LJLILLLLZI;

    public int hashCode() {
        return Objects.hash(this.LJLIL, this.LJLILLLLZI);
    }

    public String toString() {
        if (this.LJLILLLLZI == null) {
            return this.LJLIL;
        }
        StringBuilder sb = new StringBuilder(this.LJLILLLLZI.length() + this.LJLIL.length() + 1);
        sb.append(this.LJLIL);
        sb.append("=");
        sb.append(this.LJLILLLLZI);
        return sb.toString();
    }

    public Object clone() {
        return super.clone();
    }

    public String getName() {
        return this.LJLIL;
    }

    public String getValue() {
        return this.LJLILLLLZI;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C05130Ib)) {
            return false;
        }
        C05130Ib c05130Ib = (C05130Ib) obj;
        if (this.LJLIL.equals(c05130Ib.LJLIL) && Objects.equals(this.LJLILLLLZI, c05130Ib.LJLILLLLZI)) {
            return true;
        }
        return false;
    }

    public C05130Ib(String str, String str2) {
        if (str != null) {
            this.LJLIL = str;
            this.LJLILLLLZI = str2;
            return;
        }
        throw new IllegalArgumentException("Name may not be null");
    }
}
