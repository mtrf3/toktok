package X;

import kotlin.jvm.internal.o;

/* renamed from: X.Acs, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26638Acs {
    public final String LIZ;

    public C26638Acs() {
        this(0);
    }

    public final int hashCode() {
        String str = this.LIZ;
        if (str != null) {
            return str.hashCode();
        }
        return 0;
    }

    public C26638Acs(int i) {
        this.LIZ = "add";
    }

    public final boolean equals(Object obj) {
        C26638Acs c26638Acs;
        String str = this.LIZ;
        String str2 = null;
        if ((obj instanceof C26638Acs) && (c26638Acs = (C26638Acs) obj) != null) {
            str2 = c26638Acs.LIZ;
        }
        return o.LJ(str, str2);
    }
}
