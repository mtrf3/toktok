package X;

import com.ss.android.ugc.aweme.sticker.model.NewFaceStickerBean;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class SGI extends AbstractC65781Prl implements InterfaceC88471Ynr<Effect, Boolean, C76800UCe> {
    public static final SGI LJLIL = new SGI();

    public SGI() {
        super(2);
    }

    @Override // X.InterfaceC88471Ynr
    public final C76800UCe invoke(Effect effect, Boolean bool) {
        Effect effect2 = effect;
        boolean booleanValue = bool.booleanValue();
        o.LJIIIZ(effect2, "effect");
        NewFaceStickerBean newFaceStickerBean = new NewFaceStickerBean();
        newFaceStickerBean.id = effect2.getId();
        newFaceStickerBean.isFavorite = !booleanValue;
        C2U8.LIZ(new C76P(newFaceStickerBean));
        return C76800UCe.LIZ;
    }
}
