package X;

import Y.IDRunnableS6S0101000;
import android.text.TextUtils;
import com.bytedance.android.livesdk.effect.StickerMessageManager;
import com.bytedance.android.livesdk.model.message.LiveUserPngInfo;

/* renamed from: X.Ch0, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C31990Ch0 extends CKI {
    public final /* synthetic */ StickerMessageManager LJLIL;

    public C31990Ch0(StickerMessageManager stickerMessageManager) {
        this.LJLIL = stickerMessageManager;
    }

    @Override // X.CKI, X.InterfaceC32416Cns
    public final void LIZ(long j) {
        InterfaceC31995Ch5 interfaceC31995Ch5;
        StickerMessageManager stickerMessageManager = this.LJLIL;
        stickerMessageManager.mIsPlaying = false;
        C31992Ch2 c31992Ch2 = stickerMessageManager.mCurrentMessage;
        if (c31992Ch2 != null && (interfaceC31995Ch5 = c31992Ch2.LJIILJJIL) != null) {
            interfaceC31995Ch5.LJIIJJI();
        }
    }

    @Override // X.CKI, X.InterfaceC32416Cns
    public final void onFailed(Throwable th) {
        InterfaceC31995Ch5 interfaceC31995Ch5;
        StickerMessageManager stickerMessageManager = this.LJLIL;
        stickerMessageManager.mIsPlaying = false;
        C31992Ch2 c31992Ch2 = stickerMessageManager.mCurrentMessage;
        if (c31992Ch2 != null && (interfaceC31995Ch5 = c31992Ch2.LJIILJJIL) != null) {
            interfaceC31995Ch5.LJIIJJI();
        }
    }

    @Override // X.CKI, X.InterfaceC32416Cns
    public final void LIZLLL(long j, String str) {
        C31992Ch2 c31992Ch2 = this.LJLIL.mCurrentMessage;
        if (c31992Ch2 == null) {
            return;
        }
        InterfaceC31995Ch5 interfaceC31995Ch5 = c31992Ch2.LJIILJJIL;
        if (interfaceC31995Ch5 != null) {
            interfaceC31995Ch5.LJIIJJI();
        }
        c31992Ch2.LJ = str;
        LiveUserPngInfo liveUserPngInfo = c31992Ch2.LJIILIIL;
        if (liveUserPngInfo != null && liveUserPngInfo.textWidth > 0 && liveUserPngInfo.textHeight > 0 && !TextUtils.isEmpty(this.LJLIL.workRoot)) {
            this.LJLIL.createStickerGiftPngIfNeeded();
        } else {
            C0NB.LJIIIZ("STICK", "download successful");
            this.LJLIL.mHandler.postDelayed(new IDRunnableS6S0101000(2, this, 14), 1000L);
        }
    }
}
