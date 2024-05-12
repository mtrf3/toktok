package X;

import com.ss.android.ugc.aweme.effect.EffectPointModel;
import com.ss.android.ugc.effectmanager.effect.model.EffectCategoryResponse;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.5M2, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C5M2 {
    public final int LIZ;
    public final EffectCategoryResponse LIZIZ;
    public final List<EffectPointModel> LIZJ;

    public C5M2() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C5M2)) {
            return false;
        }
        C5M2 c5m2 = (C5M2) obj;
        return this.LIZ == c5m2.LIZ && o.LJ(this.LIZIZ, c5m2.LIZIZ) && o.LJ(this.LIZJ, c5m2.LIZJ);
    }

    public final int hashCode() {
        int i = this.LIZ * 31;
        EffectCategoryResponse effectCategoryResponse = this.LIZIZ;
        int hashCode = (i + (effectCategoryResponse == null ? 0 : effectCategoryResponse.hashCode())) * 31;
        List<EffectPointModel> list = this.LIZJ;
        return hashCode + (list != null ? list.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("SelectedTabState(index=");
        LIZ.append(this.LIZ);
        LIZ.append(", categoryModel=");
        LIZ.append(this.LIZIZ);
        LIZ.append(", curEffects=");
        return C1NE.LIZIZ(LIZ, this.LIZJ, ')', LIZ);
    }

    public /* synthetic */ C5M2(int i) {
        this(-1, null, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C5M2(int i, EffectCategoryResponse effectCategoryResponse, List<? extends EffectPointModel> list) {
        this.LIZ = i;
        this.LIZIZ = effectCategoryResponse;
        this.LIZJ = list;
    }
}
