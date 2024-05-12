package X;

import com.ss.android.ugc.effectmanager.effect.model.EffectCategoryModel;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class TI7 extends AbstractC65781Prl implements InterfaceC88472Yns<EffectCategoryModel, Boolean> {
    public static final TI7 LJLIL = new TI7();

    public TI7() {
        super(1);
    }

    @Override // X.InterfaceC88472Yns
    public final Boolean invoke(EffectCategoryModel effectCategoryModel) {
        EffectCategoryModel it = effectCategoryModel;
        o.LJIIIZ(it, "it");
        return Boolean.valueOf(V3N.LJIJ(it.getExtra(), "prop_tab_block_story", false));
    }
}
