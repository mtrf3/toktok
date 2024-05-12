package X;

import com.ss.android.ugc.aweme.sticker.presenter.handler.AudioGraphStickerHandler;

/* loaded from: classes8.dex */
public final class IBA implements InterfaceC83972WxU {
    public final /* synthetic */ C46193IAz LIZ;

    @Override // X.InterfaceC83972WxU
    public final void onInit() {
    }

    @Override // X.InterfaceC83972WxU
    public final void onRelease() {
    }

    @Override // X.InterfaceC83972WxU
    public final void onStartRecord() {
        AudioGraphStickerHandler audioGraphStickerHandler;
        AudioGraphStickerHandler audioGraphStickerHandler2;
        boolean O8 = this.LIZ.LJLJJL.getMediaController().O8();
        if (O8 && (audioGraphStickerHandler2 = this.LIZ.LLILIL) != null) {
            audioGraphStickerHandler2.LJIIZILJ();
        }
        AudioGraphStickerHandler audioGraphStickerHandler3 = this.LIZ.LLILIL;
        if (audioGraphStickerHandler3 != null) {
            AudioGraphStickerHandler.LJIILIIL(audioGraphStickerHandler3, Boolean.TRUE, null, false, 6);
        }
        if (O8 && (audioGraphStickerHandler = this.LIZ.LLILIL) != null) {
            audioGraphStickerHandler.LJIILLIIL();
        }
    }

    public IBA(C46193IAz c46193IAz) {
        this.LIZ = c46193IAz;
    }

    @Override // X.InterfaceC83972WxU
    public final void LIZ(boolean z) {
        AudioGraphStickerHandler audioGraphStickerHandler;
        AudioGraphStickerHandler audioGraphStickerHandler2;
        boolean O8 = this.LIZ.LJLJJL.getMediaController().O8();
        if (O8 && (audioGraphStickerHandler2 = this.LIZ.LLILIL) != null) {
            audioGraphStickerHandler2.LJIIZILJ();
        }
        AudioGraphStickerHandler audioGraphStickerHandler3 = this.LIZ.LLILIL;
        if (audioGraphStickerHandler3 != null) {
            AudioGraphStickerHandler.LJIILIIL(audioGraphStickerHandler3, Boolean.FALSE, null, false, 6);
        }
        if (!z && O8 && (audioGraphStickerHandler = this.LIZ.LLILIL) != null) {
            audioGraphStickerHandler.LJIILLIIL();
        }
    }
}
