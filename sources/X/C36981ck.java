package X;

import com.bytedance.android.livesdkapi.depend.model.LiveEffect;
import kotlin.jvm.internal.o;

/* renamed from: X.1ck, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C36981ck<T> extends AbstractC260710p<T> {
    public final T LIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C36981ck) && o.LJ(this.LIZ, ((C36981ck) obj).LIZ);
    }

    public final int hashCode() {
        return this.LIZ.hashCode();
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("UpdateRecentEffect(effect=");
        return U26.LIZJ(LIZ, this.LIZ, ')', LIZ);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C36981ck(LiveEffect effect) {
        o.LJIIIZ(effect, "effect");
        this.LIZ = effect;
    }
}
