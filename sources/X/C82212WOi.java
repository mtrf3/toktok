package X;

import com.ss.android.ugc.effectmanager.effect.model.Effect;
import kotlin.jvm.internal.o;

/* renamed from: X.WOi, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C82212WOi extends AbstractC82213WOj {
    public final Effect LIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C82212WOi) && o.LJ(this.LIZ, ((C82212WOi) obj).LIZ);
    }

    public final int hashCode() {
        return this.LIZ.hashCode();
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("GameReset(gameSticker=");
        LIZ.append(this.LIZ);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    public C82212WOi(Effect gameSticker) {
        o.LJIIIZ(gameSticker, "gameSticker");
        this.LIZ = gameSticker;
    }
}
