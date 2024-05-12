package X;

import com.bytedance.android.livesdk.gift.base.platform.core.manager.GiftManager;
import com.bytedance.android.livesdk.guide.LiveGiftGuideViewModel;
import com.bytedance.android.livesdk.livesetting.gift.LiveRechargeGiftGuideDisplayDuration;
import com.bytedance.android.livesdk.model.message.GiftGuideMessage;
import kotlin.jvm.internal.o;

/* renamed from: X.Cui, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C32840Cui extends AbstractC65781Prl implements InterfaceC88472Yns<Integer, C76800UCe> {
    public final /* synthetic */ GiftGuideMessage LJLIL;
    public final /* synthetic */ LiveGiftGuideViewModel LJLILLLLZI;
    public final /* synthetic */ boolean LJLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C32840Cui(GiftGuideMessage giftGuideMessage, LiveGiftGuideViewModel liveGiftGuideViewModel, boolean z) {
        super(1);
        this.LJLIL = giftGuideMessage;
        this.LJLILLLLZI = liveGiftGuideViewModel;
        this.LJLJI = z;
    }

    @Override // X.InterfaceC88472Yns
    public final C76800UCe invoke(Integer num) {
        int intValue = num.intValue();
        if (!o.LJ(this.LJLIL.guideType, "gift_guide_bubble")) {
            LiveGiftGuideViewModel liveGiftGuideViewModel = this.LJLILLLLZI;
            if (o.LJ(this.LJLIL.guideType, "gift_guide_popup_education")) {
                intValue = (int) this.LJLIL.displaySeconds;
            } else if (this.LJLJI) {
                intValue = LiveRechargeGiftGuideDisplayDuration.INSTANCE.getValue();
            }
            liveGiftGuideViewModel.LJLLI = intValue;
            LiveGiftGuideViewModel liveGiftGuideViewModel2 = this.LJLILLLLZI;
            GiftGuideMessage giftGuideMessage = this.LJLIL;
            int i = liveGiftGuideViewModel2.LJLLI;
            if (GiftManager.inst().findGiftById(giftGuideMessage.giftId) != null) {
                CountDownTimerC76833UDl countDownTimerC76833UDl = new CountDownTimerC76833UDl(i * 1000, liveGiftGuideViewModel2);
                liveGiftGuideViewModel2.LJLJL = countDownTimerC76833UDl;
                countDownTimerC76833UDl.start();
            }
        }
        this.LJLILLLLZI.LJLL.setValue(new OSZ<>(Boolean.TRUE, null));
        this.LJLILLLLZI.LJLJJL = true;
        return C76800UCe.LIZ;
    }
}
