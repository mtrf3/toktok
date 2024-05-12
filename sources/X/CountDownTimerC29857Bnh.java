package X;

import android.os.CountDownTimer;
import com.bytedance.android.livesdk.dataChannel.SubOnlyLiveAudienceStatusChannel;
import com.bytedance.android.livesdk.impl.revenue.subscription.ui.SubscriptionTrialLiveCardWidget;
import com.bytedance.android.livesdkapi.depend.model.live.Room;

/* renamed from: X.Bnh, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class CountDownTimerC29857Bnh extends CountDownTimer {
    public final /* synthetic */ SubscriptionTrialLiveCardWidget LIZ;

    @Override // android.os.CountDownTimer
    public final void onFinish() {
        C47121t6 c47121t6 = this.LIZ.LJLJI;
        if (c47121t6 != null) {
            c47121t6.setText(SubscriptionTrialLiveCardWidget.LJLZ(0L));
        }
        this.LIZ.hide();
        Room room = this.LIZ.LJLJJLL;
        if (room != null) {
            room.allowPreviewTime = 0L;
            C28668BMy.LJI(new C28669BMz(room.allowPreviewTime, room.getId()));
        }
        SubscriptionTrialLiveCardWidget subscriptionTrialLiveCardWidget = this.LIZ;
        subscriptionTrialLiveCardWidget.LJLJLLL = 0L;
        subscriptionTrialLiveCardWidget.dataChannel.rv0(SubOnlyLiveAudienceStatusChannel.class, BKI.NON_SUBSCRIBER_FORBIDDEN_LIVE);
        this.LIZ.LJZI();
    }

    @Override // android.os.CountDownTimer
    public final void onTick(long j) {
        C47121t6 c47121t6 = this.LIZ.LJLJI;
        if (c47121t6 != null) {
            c47121t6.setText(SubscriptionTrialLiveCardWidget.LJLZ(j));
        }
        Room room = this.LIZ.LJLJJLL;
        if (room != null) {
            room.allowPreviewTime = j;
            C28668BMy.LJI(new C28669BMz(room.allowPreviewTime, room.getId()));
        }
        this.LIZ.LJLJLLL = j;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CountDownTimerC29857Bnh(long j, SubscriptionTrialLiveCardWidget subscriptionTrialLiveCardWidget) {
        super(j, 1000L);
        this.LIZ = subscriptionTrialLiveCardWidget;
    }
}
