package X;

import com.ss.android.ugc.effectmanager.effect.model.CategoryEffectModel;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.ss.android.ugc.effectmanager.effect.model.EffectCategoryModel;
import kotlin.jvm.internal.AqS164S0100000_14;
import kotlin.jvm.internal.AqS180S0100000_14;
import kotlin.jvm.internal.o;

/* renamed from: X.Wel, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C82811Wel implements TI9 {
    public final Effect LIZ;
    public final ActivityC45651qj LIZIZ;
    public final C62822Ol8 LIZJ;
    public final EffectCategoryModel LIZLLL;
    public final C73849Syb<CategoryEffectModel> LJ;
    public final C82812Wem LJFF;

    @Override // X.TI9
    public final void LIZ() {
    }

    @Override // X.TI9
    public final void LIZLLL() {
    }

    @Override // X.TI9
    public final void getFilters() {
    }

    @Override // X.TI9
    public final EffectCategoryModel LIZIZ() {
        return this.LIZLLL;
    }

    @Override // X.TI9
    public final TJJ LIZJ() {
        return this.LJFF;
    }

    public C82811Wel(Effect effect, ActivityC45651qj activity) {
        o.LJIIIZ(activity, "activity");
        this.LIZ = effect;
        this.LIZIZ = activity;
        this.LIZJ = C221108m2.LIZIZ(new AqS164S0100000_14(this, 401));
        AqS180S0100000_14 aqS180S0100000_14 = new AqS180S0100000_14(this, 344);
        EffectCategoryModel effectCategoryModel = new EffectCategoryModel(null, 1, null);
        aqS180S0100000_14.invoke(effectCategoryModel);
        this.LIZLLL = effectCategoryModel;
        this.LJ = new C73849Syb<>();
        this.LJFF = new C82812Wem(this);
    }
}
