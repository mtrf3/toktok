package X;

import Y.AfS36S0101000_5;
import Y.IDuS76S0200000_5;
import com.bytedance.android.livesdk.effect.StickerMessageManager;
import com.bytedance.android.livesdk.model.Gift;
import com.bytedance.android.livesdk.model.message.GiftMessage;
import com.bytedance.common.utility.collection.WeakHandler;

/* renamed from: X.Cgy, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public class C31988Cgy implements InterfaceC32103Cip {
    public boolean LIZ;
    public final /* synthetic */ StickerMessageManager LIZIZ;

    @Override // X.InterfaceC32103Cip
    public final void LIZ() {
        this.LIZ = true;
        if (this.LIZIZ.mHandler.hasMessages(140001)) {
            this.LIZIZ.mHandler.removeMessages(140001);
        }
        WeakHandler weakHandler = this.LIZIZ.mHandler;
        weakHandler.sendMessage(weakHandler.obtainMessage(140001));
    }

    @Override // X.InterfaceC32103Cip
    public final void LIZIZ() {
    }

    @Override // X.InterfaceC32103Cip
    public final void release() {
    }

    public C31988Cgy(StickerMessageManager stickerMessageManager) {
        this.LIZIZ = stickerMessageManager;
    }

    @Override // X.InterfaceC32103Cip
    public final void LIZJ(GiftMessage giftMessage, C32090Cic c32090Cic) {
        Gift gift;
        C0NB.LJIIIZ("STICK", "handle message check");
        if (this.LIZ || giftMessage == null || (gift = giftMessage.mGift) == null || 4 != gift.type) {
            return;
        }
        C0NB.LJIIIZ("STICK", "handle the message check done, ready to go");
        AbstractC73672Svk.LJIIJ(new IDuS76S0200000_5(giftMessage, c32090Cic, 4)).LJJL(T16.LIZ()).LJJJ(C73969T1h.LIZIZ()).LJJJLIIL(new AfS36S0101000_5(1, this, 10), new C1PM(2));
    }
}
