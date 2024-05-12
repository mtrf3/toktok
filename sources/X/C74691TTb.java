package X;

import kotlin.jvm.internal.o;

/* renamed from: X.TTb, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C74691TTb {
    public final TT1 LIZ;
    public final C74748TVg LIZIZ;

    public C74691TTb() {
        this(null, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C74691TTb)) {
            return false;
        }
        C74691TTb c74691TTb = (C74691TTb) obj;
        return o.LJ(this.LIZ, c74691TTb.LIZ) && o.LJ(this.LIZIZ, c74691TTb.LIZIZ);
    }

    public final int hashCode() {
        TT1 tt1 = this.LIZ;
        int hashCode = (tt1 == null ? 0 : tt1.hashCode()) * 31;
        C74748TVg c74748TVg = this.LIZIZ;
        return hashCode + (c74748TVg != null ? c74748TVg.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("ApplyDialogUICtrlCmd(applyOptPresenter=");
        LIZ.append(this.LIZ);
        LIZ.append(", previewDialogUICtrlCmd=");
        LIZ.append(this.LIZIZ);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    public C74691TTb(TT1 tt1, C74748TVg c74748TVg) {
        this.LIZ = tt1;
        this.LIZIZ = c74748TVg;
    }
}
