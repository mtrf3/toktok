package X;

import Y.AfS64S0100000_12;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import com.ss.android.ugc.effectmanager.effect.model.CategoryEffectModel;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class TI1 extends C74418TIo {
    public final C53048Krs LJJIFFI;

    @Override // X.C74418TIo
    public final void LJIILJJIL(TJ0 repository) {
        o.LJIIIZ(repository, "repository");
        this.LJIIIIZZ.LIZ(repository.LIZLLL().LJJJ(C73969T1h.LIZIZ()).LJJJJZI(new AfS64S0100000_12(this, 2)));
    }

    @Override // X.C74418TIo, X.InterfaceC74309TEj
    public final LiveData LIZIZ(String str, boolean z, boolean z2, boolean z3) {
        if (z && LJIJ()) {
            ((LiveData) this.LJIIJJI.getValue()).setValue(C74413TIj.LIZIZ());
            TJ0 tj0 = this.LJII;
            if (tj0 != null) {
                if (str == null) {
                    str = "";
                }
                tj0.LJIILJJIL(new TPM(str, false, z3, 94));
            }
        }
        return (LiveData) this.LJIIJJI.getValue();
    }

    @Override // X.C74418TIo, X.InterfaceC74309TEj
    public final MutableLiveData LJIIJ(String category, java.util.Map map, boolean z, boolean z2) {
        o.LJIIIZ(category, "category");
        return (MutableLiveData) LIZJ(z, z2, category, 0, 0, 0, map);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TI1(C62822Ol8 c62822Ol8, C62822Ol8 c62822Ol82, C62822Ol8 c62822Ol83, List defaultCategories, C53048Krs paginationConfig) {
        super(null, defaultCategories, c62822Ol8, c62822Ol82, c62822Ol83);
        o.LJIIIZ(defaultCategories, "defaultCategories");
        o.LJIIIZ(paginationConfig, "paginationConfig");
        this.LJJIFFI = paginationConfig;
    }

    @Override // X.C74418TIo, X.InterfaceC74309TEj
    public final LiveData LIZJ(boolean z, boolean z2, String category, int i, int i2, int i3, java.util.Map map) {
        List<Effect> list;
        CategoryEffectModel categoryEffectModel;
        int i4 = i3;
        o.LJIIIZ(category, "category");
        MutableLiveData<C74413TIj<CategoryEffectModel>> LJIILLIIL = LJIILLIIL(category);
        if (i4 == 0) {
            i4 = this.LJJIFFI.LJLILLLLZI;
        }
        if (LJIILLIIL.getValue() != null) {
            C74413TIj<CategoryEffectModel> value = LJIILLIIL.getValue();
            if (value == null || (categoryEffectModel = value.LIZ) == null || (list = categoryEffectModel.getEffects()) == null) {
                list = C61878OQg.INSTANCE;
            }
            list.size();
        }
        if (LJIILLIIL.getValue() != null) {
            LJIILLIIL.getValue();
        }
        if (z) {
            LJIILLIIL.setValue(C74413TIj.LIZIZ());
            TJ0 tj0 = this.LJII;
            if (tj0 != null) {
                tj0.LIZIZ(new TJI(category, i4, i, i2, z2, map, 112));
            }
        }
        return LJIILLIIL;
    }
}
