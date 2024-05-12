package X;

import android.content.Context;
import com.ss.android.ugc.effectmanager.effect.model.EffectCategoryModel;
import kotlin.jvm.internal.AqS178S0100000_12;

/* renamed from: X.TJq, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C74446TJq implements TI9 {
    public final EffectCategoryModel LIZ;
    public final InterfaceC74445TJp LIZIZ;
    public final InterfaceC74445TJp LIZJ;
    public final Context LIZLLL;
    public final boolean LJ;

    @Override // X.TI9
    public final void LIZLLL() {
    }

    @Override // X.TI9
    public final void getFilters() {
    }

    @Override // X.TI9
    public final void LIZ() {
        this.LIZJ.LIZ();
    }

    @Override // X.TI9
    public final EffectCategoryModel LIZIZ() {
        return this.LIZ;
    }

    @Override // X.TI9
    public final TJJ LIZJ() {
        return this.LIZIZ;
    }

    public C74446TJq(C74444TJo c74444TJo, Context context, boolean z) {
        this.LIZJ = c74444TJo;
        this.LIZLLL = context;
        this.LJ = z;
        AqS178S0100000_12 aqS178S0100000_12 = new AqS178S0100000_12(this, 4);
        EffectCategoryModel effectCategoryModel = new EffectCategoryModel(null, 1, null);
        aqS178S0100000_12.invoke(effectCategoryModel);
        this.LIZ = effectCategoryModel;
        this.LIZIZ = c74444TJo;
    }
}
