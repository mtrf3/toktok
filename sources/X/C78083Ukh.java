package X;

import android.os.SystemClock;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.livesdk.model.Gift;
import com.bytedance.android.livesdk.model.message.GiftMessage;

/* renamed from: X.Ukh, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C78083Ukh extends V1B {
    public long LJLJJL;
    public final /* synthetic */ AbstractC78073UkX LJLJJLL;
    public final /* synthetic */ C78072UkW LJLJL;

    @Override // X.V1B, X.InterfaceC75158Tec
    public final void LJ() {
        this.LJLJJL = SystemClock.elapsedRealtime();
    }

    public C78083Ukh(AbstractC78073UkX abstractC78073UkX, C78072UkW c78072UkW) {
        this.LJLJJLL = abstractC78073UkX;
        this.LJLJL = c78072UkW;
    }

    @Override // X.V1B, X.InterfaceC75158Tec
    public final void LJIILL(Exception exc, String str) {
        C78072UkW mGiftMsg = this.LJLJJLL.getMGiftMsg();
        if (mGiftMsg != null) {
            mGiftMsg.LJJIJL = -1;
        }
        C78072UkW mGiftMsg2 = this.LJLJJLL.getMGiftMsg();
        if (mGiftMsg2 != null) {
            mGiftMsg2.LJIJJ = 0;
        }
        ImageModel imageModel = this.LJLJL.LJJJJ;
        if (imageModel != null) {
            AbstractC78073UkX abstractC78073UkX = this.LJLJJLL;
            abstractC78073UkX.LIZIZ(abstractC78073UkX.getMGiftIconIv(), imageModel);
        }
    }

    @Override // X.V1B, X.InterfaceC75158Tec
    public final void LJIILJJIL(int i, int i2, String str) {
        long j;
        Gift gift;
        if (this.LJLJJLL.getMTrayType() == EnumC78095Ukt.LOCAL) {
            C78110Ul8.LIZ.LIZLLL(this.LJLJJLL.getMIndex(), true);
            long elapsedRealtime = SystemClock.elapsedRealtime() - this.LJLJJL;
            GiftMessage giftMessage = this.LJLJL.LIZ;
            if (giftMessage != null && (gift = giftMessage.mGift) != null) {
                j = gift.id;
            } else {
                j = 0;
            }
            if (str == null) {
                str = "";
            }
            CGY.LIZIZ(elapsedRealtime, j, str);
        }
        C78072UkW mGiftMsg = this.LJLJJLL.getMGiftMsg();
        if (mGiftMsg != null) {
            mGiftMsg.LJJIJIL = System.currentTimeMillis();
        }
        C78072UkW mGiftMsg2 = this.LJLJJLL.getMGiftMsg();
        if (mGiftMsg2 == null) {
            return;
        }
        mGiftMsg2.LJJIJL = 0;
    }
}
