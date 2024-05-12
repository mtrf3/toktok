package X;

import com.ss.android.ugc.effectmanager.effect.model.Effect;
import defpackage.q;
import kotlin.jvm.internal.o;

/* renamed from: X.UYj, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C77377UYj extends AbstractC77369UYb implements InterfaceC47392Iiq {
    public final Effect LIZ;
    public final String LIZIZ;

    public final int hashCode() {
        return this.LIZIZ.hashCode() + (this.LIZ.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("SlipLastUsedEffect(effect=");
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

    public C77377UYj(Effect effect) {
        o.LJIIIZ(effect, "effect");
        this.LIZ = effect;
        this.LIZIZ = "Recently Used";
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C77377UYj)) {
            return false;
        }
        C77377UYj c77377UYj = (C77377UYj) obj;
        if (o.LJ(this.LIZ, c77377UYj.LIZ) && o.LJ(this.LIZIZ, c77377UYj.LIZIZ)) {
            return true;
        }
        return false;
    }
}
