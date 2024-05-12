package X;

import com.ss.android.ugc.effectmanager.effect.model.Effect;
import kotlin.jvm.internal.o;

/* renamed from: X.WOg, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C82210WOg extends AbstractC82213WOj {
    public final Effect LIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C82210WOg) && o.LJ(this.LIZ, ((C82210WOg) obj).LIZ);
    }

    public final int hashCode() {
        return this.LIZ.hashCode();
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("GameEnd(gameSticker=");
        LIZ.append(this.LIZ);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    public C82210WOg(Effect gameSticker) {
        o.LJIIIZ(gameSticker, "gameSticker");
        this.LIZ = gameSticker;
    }
}
