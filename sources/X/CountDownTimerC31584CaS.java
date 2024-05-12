package X;

import android.os.CountDownTimer;
import com.bytedance.android.livesdk.gift.event.LiveGiftSuspensionEvent;
import com.bytedance.android.livesdkapi.depend.model.live.GiftSuspension;
import com.bytedance.ies.sdk.datachannel.DataChannel;

/* renamed from: X.CaS, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class CountDownTimerC31584CaS extends CountDownTimer {
    public final /* synthetic */ GiftSuspension LIZ;
    public final /* synthetic */ DataChannel LIZIZ;

    @Override // android.os.CountDownTimer
    public final void onTick(long j) {
    }

    @Override // android.os.CountDownTimer
    public final void onFinish() {
        GiftSuspension giftSuspension = this.LIZ;
        if (giftSuspension != null) {
            giftSuspension.status = 0;
        }
        DataChannel dataChannel = this.LIZIZ;
        if (dataChannel != null) {
            dataChannel.rv0(LiveGiftSuspensionEvent.class, Boolean.FALSE);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CountDownTimerC31584CaS(long j, GiftSuspension giftSuspension, DataChannel dataChannel) {
        super(j, 1000L);
        this.LIZ = giftSuspension;
        this.LIZIZ = dataChannel;
    }
}
