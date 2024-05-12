package X;

import com.bytedance.android.live.effect.api.soundeffect.SoundEffect;
import kotlin.jvm.internal.o;

/* renamed from: X.1cx, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C37111cx<T> extends AbstractC261010s<T> {
    public final T LIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C37111cx) && o.LJ(this.LIZ, ((C37111cx) obj).LIZ);
    }

    public final int hashCode() {
        return this.LIZ.hashCode();
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("ItemSelected(effect=");
        return U26.LIZJ(LIZ, this.LIZ, ')', LIZ);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C37111cx(SoundEffect effect) {
        o.LJIIIZ(effect, "effect");
        this.LIZ = effect;
    }
}
