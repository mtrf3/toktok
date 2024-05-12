package X;

import com.bytedance.android.live.effect.api.IEffectService;
import com.bytedance.android.live.effect.model.LogParams;

/* renamed from: X.Bud, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C30287Bud extends AbstractC65781Prl implements InterfaceC88472Yns<Boolean, C76800UCe> {
    public static final C30287Bud LJLIL = new C30287Bud();

    public C30287Bud() {
        super(1);
    }

    @Override // X.InterfaceC88472Yns
    public final C76800UCe invoke(Boolean bool) {
        boolean booleanValue = bool.booleanValue();
        InterfaceC08100Tm liveGoalLogHelper = ((IEffectService) CN1.LIZ(IEffectService.class)).getLiveGoalLogHelper();
        if (booleanValue) {
            liveGoalLogHelper.getClass();
            LogParams logParams = C31701Mg.LIZIZ;
            if (logParams.dragMode == 0) {
                logParams.isAdjust = 1;
            }
        }
        return C76800UCe.LIZ;
    }
}
