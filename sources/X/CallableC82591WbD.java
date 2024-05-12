package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.effectmanager.effect.model.CategoryEffectModel;
import com.ss.android.ugc.effectmanager.effect.model.CategoryPageModel;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import java.util.List;
import java.util.concurrent.Callable;

/* renamed from: X.WbD, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class CallableC82591WbD<V> implements Callable {
    public final /* synthetic */ Effect LJLIL;
    public final /* synthetic */ C82585Wb7 LJLILLLLZI;
    public final /* synthetic */ int LJLJI;
    public final /* synthetic */ Effect LJLJJI;

    public CallableC82591WbD(Effect effect, C82585Wb7 c82585Wb7, int i, Effect effect2) {
        this.LJLIL = effect;
        this.LJLILLLLZI = c82585Wb7;
        this.LJLJI = i;
        this.LJLJJI = effect2;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        CategoryEffectModel categoryEffects;
        Effect effect = this.LJLIL;
        if (effect != null) {
            C82585Wb7 c82585Wb7 = this.LJLILLLLZI;
            int i = this.LJLJI;
            CategoryPageModel categoryPageModel = c82585Wb7.LJLJLJ;
            if (categoryPageModel != null && (categoryEffects = categoryPageModel.getCategoryEffects()) != null) {
                List<? extends Effect> LLJILJILJ = ORZ.LLJILJILJ(categoryEffects.getEffects());
                ListProtector.set(LLJILJILJ, i - 1, effect);
                categoryEffects.setEffects(LLJILJILJ);
            }
        }
        this.LJLILLLLZI.LJLZ(this.LJLJI, 1);
        this.LJLILLLLZI.LJZ(this.LJLJI);
        C82584Wb6 c82584Wb6 = this.LJLILLLLZI.LJLLILLLL;
        if (c82584Wb6 != null) {
            c82584Wb6.LLJILJILJ(this.LJLJJI);
            return C76800UCe.LIZ;
        }
        return null;
    }
}
