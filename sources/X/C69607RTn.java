package X;

import com.bytedance.android.livesdk.model.Gift;
import defpackage.q;
import kotlin.jvm.internal.o;

/* renamed from: X.RTn, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C69607RTn {
    public final int LIZ;
    public final boolean LIZIZ = true;
    public final Gift LIZJ;
    public final boolean LIZLLL;
    public final String LJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C69607RTn)) {
            return false;
        }
        C69607RTn c69607RTn = (C69607RTn) obj;
        return this.LIZ == c69607RTn.LIZ && this.LIZIZ == c69607RTn.LIZIZ && o.LJ(this.LIZJ, c69607RTn.LIZJ) && this.LIZLLL == c69607RTn.LIZLLL && o.LJ(this.LJ, c69607RTn.LJ);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        int i = this.LIZ * 31;
        boolean z = this.LIZIZ;
        int i2 = z;
        if (z != 0) {
            i2 = 1;
        }
        int i3 = (i + i2) * 31;
        Gift gift = this.LIZJ;
        int hashCode = (((i3 + (gift == null ? 0 : gift.hashCode())) * 31) + (this.LIZLLL ? 1 : 0)) * 31;
        String str = this.LJ;
        return hashCode + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("ConfirmationPopupState(confirmationType=");
        LIZ.append(this.LIZ);
        LIZ.append(", isVisible=");
        LIZ.append(this.LIZIZ);
        LIZ.append(", gift=");
        LIZ.append(this.LIZJ);
        LIZ.append(", isInputDialogShowing=");
        LIZ.append(this.LIZLLL);
        LIZ.append(", coinValueInLocalCurrency=");
        return q.LIZIZ(LIZ, this.LJ, ')', LIZ);
    }

    public C69607RTn(int i, Gift gift, boolean z, String str) {
        this.LIZ = i;
        this.LIZJ = gift;
        this.LIZLLL = z;
        this.LJ = str;
    }
}
