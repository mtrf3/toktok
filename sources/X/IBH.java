package X;

import com.ss.android.ugc.aweme.sticker.presenter.handler.AudioGraphStickerHandler;

/* loaded from: classes8.dex */
public final class IBH implements InterfaceC83962WxK {
    public final /* synthetic */ C46193IAz LIZ;

    public IBH(C46193IAz c46193IAz) {
        this.LIZ = c46193IAz;
    }

    @Override // X.InterfaceC83962WxK
    public final void LIZ(boolean z) {
        AudioGraphStickerHandler audioGraphStickerHandler;
        if (!z && (audioGraphStickerHandler = this.LIZ.LLILIL) != null) {
            audioGraphStickerHandler.LJIILLIIL();
        }
    }

    @Override // X.InterfaceC83962WxK
    public final void LIZIZ(boolean z) {
        AudioGraphStickerHandler audioGraphStickerHandler;
        if (!z && (audioGraphStickerHandler = this.LIZ.LLILIL) != null) {
            audioGraphStickerHandler.LJIIZILJ();
        }
    }
}
