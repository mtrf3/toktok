package X;

import com.ss.android.ugc.effectmanager.effect.model.Effect;
import defpackage.q;
import kotlin.jvm.internal.o;

/* renamed from: X.UYe, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C77372UYe extends AbstractC77373UYf implements UYY {
    public final Effect LIZ;
    public final String LIZIZ;
    public final String LIZJ;

    public final int hashCode() {
        return this.LIZJ.hashCode() + C79062V1e.LJ(this.LIZIZ, this.LIZ.hashCode() * 31, 31);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("VCSlipNormalEffect(effect=");
        LIZ.append(this.LIZ);
        LIZ.append(", tabName=");
        LIZ.append(this.LIZIZ);
        LIZ.append(", speakState=");
        return q.LIZIZ(LIZ, this.LIZJ, ')', LIZ);
    }

    @Override // X.UYY
    public final Effect LIZ() {
        return this.LIZ;
    }

    @Override // X.UYY
    public final String getTabName() {
        return this.LIZIZ;
    }

    public C77372UYe(Effect effect) {
        o.LJIIIZ(effect, "effect");
        this.LIZ = effect;
        this.LIZIZ = "normal";
        this.LIZJ = "";
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C77372UYe)) {
            return false;
        }
        C77372UYe c77372UYe = (C77372UYe) obj;
        if (o.LJ(this.LIZ, c77372UYe.LIZ) && o.LJ(this.LIZIZ, c77372UYe.LIZIZ) && o.LJ(this.LIZJ, c77372UYe.LIZJ)) {
            return true;
        }
        return false;
    }
}
