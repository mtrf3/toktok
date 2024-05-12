package X;

import com.bytedance.android.live.effect.api.IEffectService;

/* loaded from: classes6.dex */
public final class BA8 extends AbstractC65781Prl implements InterfaceC88472Yns<Boolean, C76800UCe> {
    public static final BA8 LJLIL = new BA8();

    public BA8() {
        super(1);
    }

    @Override // X.InterfaceC88472Yns
    public final C76800UCe invoke(Boolean bool) {
        if (bool.booleanValue()) {
            ((IEffectService) CN1.LIZ(IEffectService.class)).getLiveGameEffectHelper();
            C1XG.LIZJ();
        }
        return C76800UCe.LIZ;
    }
}
