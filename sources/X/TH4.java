package X;

import android.view.View;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.effectmanager.effect.model.EffectCategoryModel;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class TH4 implements InterfaceC80707Vlv {
    public final /* synthetic */ TH3 LIZ;

    @Override // X.InterfaceC80707Vlv
    public final void LIZ(C164456cr c164456cr) {
    }

    @Override // X.InterfaceC80707Vlv
    public final void LIZIZ(C164456cr c164456cr) {
    }

    public TH4(TH5 th5) {
        this.LIZ = th5;
    }

    @Override // X.InterfaceC80707Vlv
    public final void LIZJ(C164456cr tab, boolean z) {
        o.LJIIIZ(tab, "tab");
        View view = tab.LIZLLL;
        if (view != null && (view instanceof THN)) {
            ((THN) view).LIZ(false);
        }
        int i = tab.LIZJ;
        EffectCategoryModel effectCategoryModel = (EffectCategoryModel) ListProtector.get(this.LIZ.LJLJI, i);
        if (effectCategoryModel.getKey() != null && o.LJ(this.LIZ.LJLLI.Zj().getValue(), Boolean.TRUE)) {
            this.LIZ.LJLL.LJ.LIZIZ(effectCategoryModel);
            String name = effectCategoryModel.getName();
            this.LIZ.LJLILLLLZI.onNext(new OSZ<>(effectCategoryModel, Integer.valueOf(i)));
            this.LIZ.LJLL.LIZJ.LJI(effectCategoryModel.getKey(), name);
        }
    }
}
