package X;

import com.ss.android.ugc.aweme.bnpl.biz.verify.pin.model.PinChangeConsultResult;
import kotlin.jvm.internal.o;

/* renamed from: X.a4m, reason: case insensitive filesystem */
/* loaded from: classes20.dex */
public final class C92068a4m {
    public final PinChangeConsultResult LIZ;
    public final boolean LIZIZ;
    public final C92290a8M LIZJ;
    public final String LIZLLL;
    public final String LJ;

    public C92068a4m() {
        this(null, 31);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C92068a4m)) {
            return false;
        }
        C92068a4m c92068a4m = (C92068a4m) obj;
        return o.LJ(this.LIZ, c92068a4m.LIZ) && this.LIZIZ == c92068a4m.LIZIZ && o.LJ(this.LIZJ, c92068a4m.LIZJ) && o.LJ(this.LIZLLL, c92068a4m.LIZLLL) && o.LJ(this.LJ, c92068a4m.LJ);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        PinChangeConsultResult pinChangeConsultResult = this.LIZ;
        int hashCode = (pinChangeConsultResult == null ? 0 : pinChangeConsultResult.hashCode()) * 31;
        boolean z = this.LIZIZ;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        int i2 = (hashCode + i) * 31;
        C92290a8M c92290a8M = this.LIZJ;
        int hashCode2 = (i2 + (c92290a8M == null ? 0 : c92290a8M.hashCode())) * 31;
        String str = this.LIZLLL;
        int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.LJ;
        return hashCode3 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("PinChangeConsultInfo(consultResult=");
        LIZ.append(this.LIZ);
        LIZ.append(", needShowBlockPop=");
        LIZ.append(this.LIZIZ);
        LIZ.append(", alertInfo=");
        LIZ.append(this.LIZJ);
        LIZ.append(", errorCode=");
        LIZ.append(this.LIZLLL);
        LIZ.append(", errorContent=");
        LIZ.append(this.LJ);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    public C92068a4m(PinChangeConsultResult pinChangeConsultResult, int i) {
        this.LIZ = (i & 1) != 0 ? null : pinChangeConsultResult;
        this.LIZIZ = false;
        this.LIZJ = null;
        this.LIZLLL = null;
        this.LJ = null;
    }
}
