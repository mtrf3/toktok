package X;

import defpackage.q;
import kotlin.jvm.internal.o;

/* renamed from: X.ADo, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C25876ADo extends AEC {
    public final boolean LJLJJL;
    public final boolean LJLJJLL;
    public final Object LJLJL;
    public final String LJLJLJ;

    public C25876ADo() {
        this(null, 15);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v8 */
    /* JADX WARN: Type inference failed for: r0v9 */
    public final int hashCode() {
        int hashCode;
        boolean z = this.LJLJJL;
        int i = 1;
        ?? r0 = z;
        if (z) {
            r0 = 1;
        }
        int i2 = r0 * 31;
        if (!this.LJLJJLL) {
            i = 0;
        }
        int i3 = (i2 + i) * 31;
        Object obj = this.LJLJL;
        int i4 = 0;
        if (obj == null) {
            hashCode = 0;
        } else {
            hashCode = obj.hashCode();
        }
        int i5 = (i3 + hashCode) * 31;
        String str = this.LJLJLJ;
        if (str != null) {
            i4 = str.hashCode();
        }
        return i5 + i4;
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("SettingHeaderItem(divider=");
        LIZ.append(this.LJLJJL);
        LIZ.append(", visibility=");
        LIZ.append(this.LJLJJLL);
        LIZ.append(", tag=");
        LIZ.append(this.LJLJL);
        LIZ.append(", title=");
        return q.LIZIZ(LIZ, this.LJLJLJ, ')', LIZ);
    }

    @Override // X.AEC
    public final Object LIZ() {
        return this.LJLJL;
    }

    @Override // X.AEC
    public final boolean LIZIZ() {
        return this.LJLJJLL;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C25876ADo)) {
            return false;
        }
        C25876ADo c25876ADo = (C25876ADo) obj;
        if (this.LJLJJL == c25876ADo.LJLJJL && this.LJLJJLL == c25876ADo.LJLJJLL && o.LJ(this.LJLJL, c25876ADo.LJLJL) && o.LJ(this.LJLJLJ, c25876ADo.LJLJLJ)) {
            return true;
        }
        return false;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C25876ADo(String str, int i) {
        super(false, null, 15);
        boolean z;
        if ((i & 2) != 0) {
            z = true;
        } else {
            z = false;
        }
        str = (i & 8) != 0 ? null : str;
        this.LJLJJL = false;
        this.LJLJJLL = z;
        this.LJLJL = null;
        this.LJLJLJ = str;
    }
}
