package X;

import com.bytedance.android.livesdkapi.depend.model.LiveEffect;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.1LP, reason: invalid class name */
/* loaded from: classes.dex */
public final class C1LP extends AbstractC07660Ru {
    public final List<LiveEffect> LIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C1LP) && o.LJ(this.LIZ, ((C1LP) obj).LIZ);
    }

    public final int hashCode() {
        return this.LIZ.hashCode();
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("UpdateKaraokeSoundEffect(effectList=");
        return C1NE.LIZIZ(LIZ, this.LIZ, ')', LIZ);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C1LP(List<? extends LiveEffect> effectList) {
        o.LJIIIZ(effectList, "effectList");
        this.LIZ = effectList;
    }
}
