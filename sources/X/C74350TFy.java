package X;

import com.ss.android.ugc.effectmanager.effect.model.EffectCategoryModel;
import kotlin.jvm.internal.o;

/* renamed from: X.TFy, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C74350TFy extends TG1 {
    public final EffectCategoryModel LIZ;
    public final int LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C74350TFy)) {
            return false;
        }
        C74350TFy c74350TFy = (C74350TFy) obj;
        return o.LJ(this.LIZ, c74350TFy.LIZ) && this.LIZIZ == c74350TFy.LIZIZ;
    }

    public final int hashCode() {
        EffectCategoryModel effectCategoryModel = this.LIZ;
        return ((effectCategoryModel != null ? effectCategoryModel.hashCode() : 0) * 31) + this.LIZIZ;
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("TabClick(tab=");
        LIZ.append(this.LIZ);
        LIZ.append(", index=");
        return C08380Uo.LIZ(LIZ, this.LIZIZ, ")", LIZ);
    }

    public C74350TFy(EffectCategoryModel tab, int i) {
        o.LJIIIZ(tab, "tab");
        this.LIZ = tab;
        this.LIZIZ = i;
    }
}
