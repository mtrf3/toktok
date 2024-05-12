package X;

import com.ss.android.ugc.effectmanager.effect.model.Effect;
import defpackage.q;
import kotlin.jvm.internal.o;

/* renamed from: X.UYl, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C77379UYl extends AbstractC77369UYb implements InterfaceC47392Iiq {
    public final Effect LIZ;
    public final String LIZIZ;

    public final int hashCode() {
        return this.LIZIZ.hashCode() + (this.LIZ.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("SlipFavoriteEffect(effect=");
        LIZ.append(this.LIZ);
        LIZ.append(", tabName=");
        return q.LIZIZ(LIZ, this.LIZIZ, ')', LIZ);
    }

    @Override // X.InterfaceC47392Iiq
    public final Effect LIZ() {
        return this.LIZ;
    }

    @Override // X.InterfaceC47392Iiq
    public final String getTabName() {
        return this.LIZIZ;
    }

    public C77379UYl(Effect effect) {
        o.LJIIIZ(effect, "effect");
        this.LIZ = effect;
        this.LIZIZ = "carousal_Favourites";
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C77379UYl)) {
            return false;
        }
        C77379UYl c77379UYl = (C77379UYl) obj;
        if (o.LJ(this.LIZ, c77379UYl.LIZ) && o.LJ(this.LIZIZ, c77379UYl.LIZIZ)) {
            return true;
        }
        return false;
    }
}
