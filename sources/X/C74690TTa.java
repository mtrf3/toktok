package X;

import kotlin.jvm.internal.o;

/* renamed from: X.TTa, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C74690TTa implements TQF {
    public final TQG LIZ;
    public final C74749TVh LIZIZ;

    public C74690TTa() {
        this(null, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C74690TTa)) {
            return false;
        }
        C74690TTa c74690TTa = (C74690TTa) obj;
        return o.LJ(this.LIZ, c74690TTa.LIZ) && o.LJ(this.LIZIZ, c74690TTa.LIZIZ);
    }

    public final int hashCode() {
        TQG tqg = this.LIZ;
        int hashCode = (tqg == null ? 0 : tqg.hashCode()) * 31;
        C74749TVh c74749TVh = this.LIZIZ;
        return hashCode + (c74749TVh != null ? c74749TVh.hashCode() : 0);
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

    public C74690TTa(TQG tqg, C74749TVh c74749TVh) {
        this.LIZ = tqg;
        this.LIZIZ = c74749TVh;
    }
}
