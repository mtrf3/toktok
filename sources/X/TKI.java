package X;

import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.effectmanager.effect.model.EffectCategoryModel;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class TKI extends AbstractC65781Prl implements InterfaceC88472Yns<EffectCategoryModel, C76800UCe> {
    public static final TKI LJLIL = new TKI();

    public TKI() {
        super(1);
    }

    @Override // X.InterfaceC88472Yns
    public final C76800UCe invoke(EffectCategoryModel effectCategoryModel) {
        EffectCategoryModel receiver = effectCategoryModel;
        o.LJIIIZ(receiver, "$receiver");
        receiver.setId(CardStruct.IStatusCode.DEFAULT);
        receiver.setKey("sticker_category:search");
        receiver.setName("Search");
        return C76800UCe.LIZ;
    }
}
