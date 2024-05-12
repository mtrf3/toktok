package X;

import com.bytedance.android.livesdkapi.depend.model.LiveEffect;
import kotlin.jvm.internal.o;

/* renamed from: X.1cj, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C36971cj<T> extends AbstractC260710p<T> {
    public final T LIZ;
    public final boolean LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C36971cj)) {
            return false;
        }
        C36971cj c36971cj = (C36971cj) obj;
        return o.LJ(this.LIZ, c36971cj.LIZ) && this.LIZIZ == c36971cj.LIZIZ;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        int hashCode = this.LIZ.hashCode() * 31;
        boolean z = this.LIZIZ;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        return hashCode + i;
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("UpdateFavoriteEffect(effect=");
        LIZ.append(this.LIZ);
        LIZ.append(", isAdd=");
        return C48339Iy7.LIZJ(LIZ, this.LIZIZ, ')', LIZ);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C36971cj(LiveEffect effect, boolean z) {
        o.LJIIIZ(effect, "effect");
        this.LIZ = effect;
        this.LIZIZ = z;
    }
}
