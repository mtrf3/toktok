package X;

import com.ss.android.ugc.effectmanager.effect.model.Effect;
import defpackage.q;
import kotlin.jvm.internal.o;

/* renamed from: X.UYi, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C77376UYi extends AbstractC77369UYb implements InterfaceC47392Iiq {
    public final Effect LIZ;
    public final String LIZIZ;

    public final int hashCode() {
        return this.LIZIZ.hashCode() + (this.LIZ.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("SlipHotEffect(effect=");
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

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C77376UYi)) {
            return false;
        }
        C77376UYi c77376UYi = (C77376UYi) obj;
        if (o.LJ(this.LIZ, c77376UYi.LIZ) && o.LJ(this.LIZIZ, c77376UYi.LIZIZ)) {
            return true;
        }
        return false;
    }

    public C77376UYi(Effect effect, String str) {
        o.LJIIIZ(effect, "effect");
        this.LIZ = effect;
        this.LIZIZ = str;
    }
}
