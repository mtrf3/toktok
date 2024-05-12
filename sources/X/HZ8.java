package X;

import android.app.Activity;
import android.os.Bundle;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import kotlin.jvm.internal.AqS157S0100000_7;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class HZ8 implements THX, InterfaceC135635Tz {
    public final C82622Wbi LJLIL;

    @Override // X.THX
    public final void LIZJ() {
    }

    @Override // X.THX
    public final boolean isLogin() {
        return C1B8.LIZJ();
    }

    @Override // X.InterfaceC135635Tz
    public final C82622Wbi getDiContainer() {
        return this.LJLIL;
    }

    public HZ8(C82622Wbi diContainer) {
        o.LJIIIZ(diContainer, "diContainer");
        this.LJLIL = diContainer;
        C221108m2.LIZIZ(new AqS157S0100000_7(this, 607));
    }

    @Override // X.THX
    public final void LIZ(Effect effect) {
        o.LJIIIZ(effect, "effect");
        HF6 iStickerPropService = C60903NvH.LJIIJJI().getIStickerPropService();
        String id = effect.getId();
        iStickerPropService.getClass();
        o.LJIIIZ(id, "id");
    }

    @Override // X.THX
    public final void LIZIZ(Activity context, String str, int i, Bundle bundle, InterfaceC65784Pro<C76800UCe> interfaceC65784Pro) {
        String str2;
        o.LJIIIZ(context, "context");
        if (i != 241) {
            if (i == 242) {
                str2 = "click_favorite_prop";
            } else {
                "not support favorite login method".toString();
                throw new IllegalStateException("not support favorite login method");
            }
        } else {
            str2 = "click_my_prop";
        }
        C60903NvH.LJIIJJI().getAccountService().LIZ(context, str, str2, bundle, new HZ9(interfaceC65784Pro));
    }
}
