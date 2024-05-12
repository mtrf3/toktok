package X;

import com.ss.android.ugc.effectmanager.effect.model.EffectCategoryModel;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class TG0 extends TG1 {
    public final EffectCategoryModel LIZ;
    public final int LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TG0)) {
            return false;
        }
        TG0 tg0 = (TG0) obj;
        return o.LJ(this.LIZ, tg0.LIZ) && this.LIZIZ == tg0.LIZIZ;
    }

    public final int hashCode() {
        EffectCategoryModel effectCategoryModel = this.LIZ;
        return ((effectCategoryModel != null ? effectCategoryModel.hashCode() : 0) * 31) + this.LIZIZ;
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("TabChanged(tab=");
        LIZ.append(this.LIZ);
        LIZ.append(", index=");
        return C08380Uo.LIZ(LIZ, this.LIZIZ, ")", LIZ);
    }

    public TG0(EffectCategoryModel tab, int i) {
        o.LJIIIZ(tab, "tab");
        this.LIZ = tab;
        this.LIZIZ = i;
    }
}
