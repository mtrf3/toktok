package X;

import kotlin.jvm.internal.o;

/* renamed from: X.a1c, reason: case insensitive filesystem */
/* loaded from: classes20.dex */
public final class C91872a1c {
    public final String LIZ;
    public final String LIZIZ;
    public final EnumC91871a1b LIZJ;

    public /* synthetic */ C91872a1c() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C91872a1c)) {
            return false;
        }
        C91872a1c c91872a1c = (C91872a1c) obj;
        return o.LJ(this.LIZ, c91872a1c.LIZ) && o.LJ(this.LIZIZ, c91872a1c.LIZIZ) && this.LIZJ == c91872a1c.LIZJ;
    }

    public final int hashCode() {
        int hashCode = ((this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode()) * 31;
        EnumC91871a1b enumC91871a1b = this.LIZJ;
        return hashCode + (enumC91871a1b == null ? 0 : enumC91871a1b.hashCode());
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("ListItem(label=");
        LIZ.append(this.LIZ);
        LIZ.append(", content=");
        LIZ.append(this.LIZIZ);
        LIZ.append(", kind=");
        LIZ.append(this.LIZJ);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    public C91872a1c(String str, String content, EnumC91871a1b enumC91871a1b) {
        o.LJIIIZ(content, "content");
        this.LIZ = str;
        this.LIZIZ = content;
        this.LIZJ = enumC91871a1b;
    }
}
