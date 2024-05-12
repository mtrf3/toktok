package X;

import com.bytedance.android.live.gift.GiftLimitNotificationEvent;
import com.bytedance.ies.sdk.datachannel.DataChannel;

/* loaded from: classes6.dex */
public final class BEB implements Runnable {
    public static final BEB LJLIL = new BEB();

    @Override // java.lang.Runnable
    public final void run() {
        boolean LIZ;
        try {
            C0NB.LIZIZ("gift_prompt_notification_leo", "send exit");
            BEA.LIZ.getClass();
            BEA.LIZJ = true;
            DataChannel dataChannel = BEA.LJJIJIIJI;
            if (dataChannel != null) {
                dataChannel.qv0(GiftLimitNotificationEvent.class, Boolean.valueOf(BEA.LIZJ()));
            }
        } finally {
            if (LIZ) {
            }
        }
    }
}
