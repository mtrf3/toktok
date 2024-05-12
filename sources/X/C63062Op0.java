package X;

import java.io.Serializable;
import java.util.Date;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* renamed from: X.Op0, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C63062Op0 implements Serializable {
    public final int LJLIL;
    public final int LJLILLLLZI;
    public final Date LJLJI;
    public final Date LJLJJI;

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C63062Op0() {
        /*
            r7 = this;
            r1 = 0
            r3 = 0
            r5 = 15
            r0 = r7
            r2 = r1
            r4 = r3
            r6 = r3
            r0.<init>(r1, r2, r3, r4, r5, r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C63062Op0.<init>():void");
    }

    public static /* synthetic */ C63062Op0 copy$default(C63062Op0 c63062Op0, int i, int i2, Date date, Date date2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = c63062Op0.LJLIL;
        }
        if ((i3 & 2) != 0) {
            i2 = c63062Op0.LJLILLLLZI;
        }
        if ((i3 & 4) != 0) {
            date = c63062Op0.LJLJI;
        }
        if ((i3 & 8) != 0) {
            date2 = c63062Op0.LJLJJI;
        }
        return c63062Op0.copy(i, i2, date, date2);
    }

    public final C63062Op0 copy(int i, int i2, Date date, Date date2) {
        return new C63062Op0(i, i2, date, date2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C63062Op0)) {
            return false;
        }
        C63062Op0 c63062Op0 = (C63062Op0) obj;
        return this.LJLIL == c63062Op0.LJLIL && this.LJLILLLLZI == c63062Op0.LJLILLLLZI && o.LJ(this.LJLJI, c63062Op0.LJLJI) && o.LJ(this.LJLJJI, c63062Op0.LJLJJI);
    }

    public int hashCode() {
        int i = ((this.LJLIL * 31) + this.LJLILLLLZI) * 31;
        Date date = this.LJLJI;
        int hashCode = (i + (date == null ? 0 : date.hashCode())) * 31;
        Date date2 = this.LJLJJI;
        return hashCode + (date2 != null ? date2.hashCode() : 0);
    }

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("PNSEditAgeConfig(type=");
        LIZ.append(this.LJLIL);
        LIZ.append(", descType=");
        LIZ.append(this.LJLILLLLZI);
        LIZ.append(", defaultDate=");
        LIZ.append(this.LJLJI);
        LIZ.append(", upperBound=");
        LIZ.append(this.LJLJJI);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    public final Date getDefaultDate() {
        return this.LJLJI;
    }

    public final int getDescType() {
        return this.LJLILLLLZI;
    }

    public final int getType() {
        return this.LJLIL;
    }

    public final Date getUpperBound() {
        return this.LJLJJI;
    }

    public C63062Op0(int i, int i2, Date date, Date date2) {
        this.LJLIL = i;
        this.LJLILLLLZI = i2;
        this.LJLJI = date;
        this.LJLJJI = date2;
    }

    public /* synthetic */ C63062Op0(int i, int i2, Date date, Date date2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 & 1) != 0 ? -1 : i, (i3 & 2) != 0 ? -1 : i2, (i3 & 4) != 0 ? null : date, (i3 & 8) != 0 ? null : date2);
    }
}
