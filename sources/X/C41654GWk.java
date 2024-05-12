package X;

import defpackage.q;
import kotlin.jvm.internal.o;

/* renamed from: X.GWk, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C41654GWk {
    public final String LIZ;
    public final String LIZIZ;
    public final String LIZJ;

    public C41654GWk() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C41654GWk)) {
            return false;
        }
        C41654GWk c41654GWk = (C41654GWk) obj;
        return o.LJ(this.LIZ, c41654GWk.LIZ) && o.LJ(this.LIZIZ, c41654GWk.LIZIZ) && o.LJ(this.LIZJ, c41654GWk.LIZJ);
    }

    public final int hashCode() {
        String str = this.LIZ;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.LIZIZ;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.LIZJ;
        return hashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("RecordCommonParameter(shootWay=");
        LIZ.append(this.LIZ);
        LIZ.append(", creationId=");
        LIZ.append(this.LIZIZ);
        LIZ.append(", enterForm=");
        return q.LIZIZ(LIZ, this.LIZJ, ')', LIZ);
    }

    public /* synthetic */ C41654GWk(int i) {
        this("", "", "");
    }

    public C41654GWk(String str, String str2, String str3) {
        this.LIZ = str;
        this.LIZIZ = str2;
        this.LIZJ = str3;
    }
}
