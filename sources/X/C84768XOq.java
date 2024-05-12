package X;

import com.ss.android.ugc.effectmanager.common.task.ExceptionResult;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import kotlin.jvm.internal.o;

/* renamed from: X.XOq, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C84768XOq {
    public final int LIZ;
    public final int LIZIZ;
    public final Effect LIZJ;
    public final long LIZLLL;
    public final ExceptionResult LJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C84768XOq)) {
            return false;
        }
        C84768XOq c84768XOq = (C84768XOq) obj;
        return this.LIZ == c84768XOq.LIZ && this.LIZIZ == c84768XOq.LIZIZ && o.LJ(this.LIZJ, c84768XOq.LIZJ) && this.LIZLLL == c84768XOq.LIZLLL && o.LJ(this.LJ, c84768XOq.LJ);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("MusicAndEffectProgress(type=");
        LIZ.append(this.LIZ);
        LIZ.append(", progress=");
        LIZ.append(this.LIZIZ);
        LIZ.append(", effect=");
        LIZ.append(this.LIZJ);
        LIZ.append(", effectTotalSize=");
        LIZ.append(this.LIZLLL);
        LIZ.append(", exceptionResult=");
        LIZ.append(this.LJ);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    public final int hashCode() {
        int hashCode;
        int i = ((this.LIZ * 31) + this.LIZIZ) * 31;
        Effect effect = this.LIZJ;
        int i2 = 0;
        if (effect == null) {
            hashCode = 0;
        } else {
            hashCode = effect.hashCode();
        }
        int LIZJ = JBR.LIZJ(this.LIZLLL, (i + hashCode) * 31, 31);
        ExceptionResult exceptionResult = this.LJ;
        if (exceptionResult != null) {
            i2 = exceptionResult.hashCode();
        }
        return LIZJ + i2;
    }

    public C84768XOq(int i, int i2, Effect effect, long j, ExceptionResult exceptionResult, int i3) {
        i2 = (i3 & 2) != 0 ? 0 : i2;
        effect = (i3 & 4) != 0 ? null : effect;
        j = (i3 & 8) != 0 ? 0L : j;
        exceptionResult = (i3 & 16) != 0 ? null : exceptionResult;
        this.LIZ = i;
        this.LIZIZ = i2;
        this.LIZJ = effect;
        this.LIZLLL = j;
        this.LJ = exceptionResult;
    }
}
