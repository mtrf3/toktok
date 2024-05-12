package X;

import com.ss.android.ugc.aweme.filter.FilterBean;
import com.ss.android.ugc.effectmanager.effect.model.EffectCategoryResponse;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class THY extends F9E {
    public final TK1 LJLIL;
    public final EffectCategoryResponse LJLILLLLZI;
    public final FilterBean LJLJI;

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{this.LJLIL, this.LJLILLLLZI, this.LJLJI};
    }

    public THY(TK1 type, EffectCategoryResponse effectCategoryResponse, FilterBean filterBean, int i) {
        effectCategoryResponse = (i & 2) != 0 ? null : effectCategoryResponse;
        filterBean = (i & 4) != 0 ? null : filterBean;
        o.LJIIIZ(type, "type");
        this.LJLIL = type;
        this.LJLILLLLZI = effectCategoryResponse;
        this.LJLJI = filterBean;
    }
}
