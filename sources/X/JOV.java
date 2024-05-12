package X;

import kotlin.jvm.internal.o;

/* loaded from: classes9.dex */
public final class JOV implements C33Q {
    public final boolean LJLIL;
    public final C43I<EnumC48742JBa> LJLILLLLZI;
    public final C43I<C90U> LJLJI;
    public final C49086JOg LJLJJI;
    public final JO3 LJLJJL;

    public JOV() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof JOV)) {
            return false;
        }
        JOV jov = (JOV) obj;
        return this.LJLIL == jov.LJLIL && o.LJ(this.LJLILLLLZI, jov.LJLILLLLZI) && o.LJ(this.LJLJI, jov.LJLJI) && o.LJ(this.LJLJJI, jov.LJLJJI) && o.LJ(this.LJLJJL, jov.LJLJJL);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v15 */
    /* JADX WARN: Type inference failed for: r0v16 */
    public final int hashCode() {
        boolean z = this.LJLIL;
        ?? r0 = z;
        if (z) {
            r0 = 1;
        }
        int i = r0 * 31;
        C43I<EnumC48742JBa> c43i = this.LJLILLLLZI;
        int hashCode = (i + (c43i == null ? 0 : c43i.hashCode())) * 31;
        C43I<C90U> c43i2 = this.LJLJI;
        int hashCode2 = (hashCode + (c43i2 == null ? 0 : c43i2.hashCode())) * 31;
        C49086JOg c49086JOg = this.LJLJJI;
        int hashCode3 = (hashCode2 + (c49086JOg == null ? 0 : c49086JOg.hashCode())) * 31;
        JO3 jo3 = this.LJLJJL;
        return hashCode3 + (jo3 != null ? jo3.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("SearchCLASubtitleState(showSubtitle=");
        LIZ.append(this.LJLIL);
        LIZ.append(", subtitleStateUpdate=");
        LIZ.append(this.LJLILLLLZI);
        LIZ.append(", updateSubtitleTextEvent=");
        LIZ.append(this.LJLJI);
        LIZ.append(", onSubLoadFinished=");
        LIZ.append(this.LJLJJI);
        LIZ.append(", onSubSwitchCompleted=");
        LIZ.append(this.LJLJJL);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    public /* synthetic */ JOV(int i) {
        this(false, null, null, null, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public JOV(boolean z, C43I<? extends EnumC48742JBa> c43i, C43I<C90U> c43i2, C49086JOg c49086JOg, JO3 jo3) {
        this.LJLIL = z;
        this.LJLILLLLZI = c43i;
        this.LJLJI = c43i2;
        this.LJLJJI = c49086JOg;
        this.LJLJJL = jo3;
    }

    public static JOV LIZ(JOV jov, C43I c43i, C43I c43i2, C49086JOg c49086JOg, JO3 jo3, int i) {
        boolean z;
        JO3 jo32 = jo3;
        C49086JOg c49086JOg2 = c49086JOg;
        C43I c43i3 = c43i;
        C43I c43i4 = c43i2;
        if ((i & 1) != 0) {
            z = jov.LJLIL;
        } else {
            z = false;
        }
        if ((i & 2) != 0) {
            c43i3 = jov.LJLILLLLZI;
        }
        if ((i & 4) != 0) {
            c43i4 = jov.LJLJI;
        }
        if ((i & 8) != 0) {
            c49086JOg2 = jov.LJLJJI;
        }
        if ((i & 16) != 0) {
            jo32 = jov.LJLJJL;
        }
        jov.getClass();
        return new JOV(z, c43i3, c43i4, c49086JOg2, jo32);
    }
}
