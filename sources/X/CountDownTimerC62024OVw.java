package X;

import android.os.CountDownTimer;
import com.bytedance.android.livesdk.guide.LiveGiftGuideViewModel;
import com.bytedance.android.livesdk.livesetting.gift.LiveRechargeGiftGuideShowTimes;
import com.bytedance.android.livesdk.model.message.GiftGuideMessage;

/* renamed from: X.OVw, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class CountDownTimerC62024OVw extends CountDownTimer {
    public final /* synthetic */ LiveGiftGuideViewModel LIZ;

    @Override // android.os.CountDownTimer
    public final void onTick(long j) {
    }

    @Override // android.os.CountDownTimer
    public final void onFinish() {
        GiftGuideMessage first;
        boolean z;
        OSZ<GiftGuideMessage, Boolean> value = this.LIZ.LJLJLLL.getValue();
        if (value != null && (first = value.getFirst()) != null) {
            LiveGiftGuideViewModel liveGiftGuideViewModel = this.LIZ;
            C35558DxS c35558DxS = liveGiftGuideViewModel.LJLJLJ;
            if (c35558DxS.LJLIL > 0 && c35558DxS.LJLILLLLZI < LiveRechargeGiftGuideShowTimes.INSTANCE.getValue()) {
                z = true;
                liveGiftGuideViewModel.LJLJLJ.LJLILLLLZI++;
            } else {
                z = false;
            }
            liveGiftGuideViewModel.gv0(first, z);
        }
        CountDownTimerC62024OVw countDownTimerC62024OVw = this.LIZ.LJLJJLL;
        if (countDownTimerC62024OVw != null) {
            countDownTimerC62024OVw.cancel();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CountDownTimerC62024OVw(LiveGiftGuideViewModel liveGiftGuideViewModel) {
        super(1000L, 1000L);
        this.LIZ = liveGiftGuideViewModel;
    }
}
