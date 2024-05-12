package X;

import android.content.Context;
import com.ss.android.ugc.effectmanager.effect.model.EffectCategoryModel;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class TKJ implements TI9 {
    public final EffectCategoryModel LIZ;

    @Override // X.TI9
    public final void LIZ() {
    }

    @Override // X.TI9
    public final TJJ LIZJ() {
        return null;
    }

    @Override // X.TI9
    public final void LIZLLL() {
    }

    @Override // X.TI9
    public final void getFilters() {
    }

    @Override // X.TI9
    public final EffectCategoryModel LIZIZ() {
        return this.LIZ;
    }

    public TKJ(Context context) {
        TKI init = TKI.LJLIL;
        o.LJIIIZ(init, "init");
        EffectCategoryModel effectCategoryModel = new EffectCategoryModel(null, 1, null);
        init.invoke(effectCategoryModel);
        this.LIZ = effectCategoryModel;
    }
}
