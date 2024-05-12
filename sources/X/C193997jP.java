package X;

import java.util.Arrays;
import kotlin.jvm.internal.o;

/* renamed from: X.7jP, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C193997jP extends AbstractC194007jQ {
    public final Boolean LIZJ;

    @Override // X.AbstractC194007jQ
    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.LIZ), Integer.valueOf(this.LIZIZ), this.LIZJ});
    }

    @Override // X.AbstractC194007jQ
    public final boolean equals(Object obj) {
        if (!(obj instanceof C193997jP) || !super.equals(obj) || !o.LJ(((C193997jP) obj).LIZJ, this.LIZJ)) {
            return false;
        }
        return true;
    }

    public C193997jP(int i, int i2, Boolean bool) {
        super(i, i2);
        this.LIZJ = bool;
    }
}
