package X;

import com.ss.android.ugc.effectmanager.effect.model.Effect;
import kotlin.jvm.internal.o;

/* renamed from: X.WOh, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C82211WOh extends AbstractC82213WOj {
    public final Effect LIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C82211WOh) && o.LJ(this.LIZ, ((C82211WOh) obj).LIZ);
    }

    public final int hashCode() {
        return this.LIZ.hashCode();
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("GameEnter(gameSticker=");
        LIZ.append(this.LIZ);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    public C82211WOh(Effect gameSticker) {
        o.LJIIIZ(gameSticker, "gameSticker");
        this.LIZ = gameSticker;
    }
}
