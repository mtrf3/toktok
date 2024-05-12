package X;

import com.bytedance.android.live.effect.api.soundeffect.SoundEffect;
import kotlin.jvm.internal.o;

/* renamed from: X.1ch, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C36951ch<T> extends AbstractC260710p<T> {
    public final T LIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C36951ch) && o.LJ(this.LIZ, ((C36951ch) obj).LIZ);
    }

    public final int hashCode() {
        return this.LIZ.hashCode();
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("SelectItem(effect=");
        return U26.LIZJ(LIZ, this.LIZ, ')', LIZ);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C36951ch(SoundEffect effect) {
        o.LJIIIZ(effect, "effect");
        this.LIZ = effect;
    }
}
