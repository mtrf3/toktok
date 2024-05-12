package X;

import android.os.SystemClock;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import kotlin.jvm.internal.o;

/* renamed from: X.HXl, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C44229HXl {
    public final Effect LIZ;
    public final long LIZIZ;
    public int LIZJ;
    public boolean LIZLLL;
    public boolean LJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C44229HXl)) {
            return false;
        }
        C44229HXl c44229HXl = (C44229HXl) obj;
        return o.LJ(this.LIZ, c44229HXl.LIZ) && this.LIZIZ == c44229HXl.LIZIZ;
    }

    public final int hashCode() {
        Effect effect = this.LIZ;
        return C16880lQ.LLJIJIL(this.LIZIZ) + ((effect == null ? 0 : effect.hashCode()) * 31);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("PropClickUserView(effect=");
        LIZ.append(this.LIZ);
        LIZ.append(", timeStamp=");
        return C47135Ieh.LIZIZ(LIZ, this.LIZIZ, ')', LIZ);
    }

    public C44229HXl(Effect effect) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        this.LIZ = effect;
        this.LIZIZ = elapsedRealtime;
        this.LIZJ = 1;
        this.LJ = true;
    }
}
