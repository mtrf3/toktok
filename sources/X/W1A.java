package X;

import android.view.Surface;
import com.ss.android.ugc.gamora.editorpro.anchor.EditorProAnchorActivity;
import com.ss.texturerender.VideoSurface;
import com.ss.ttvideoengine.TTVideoEngine;

/* loaded from: classes15.dex */
public final class W1A implements InterfaceC47814Ipe {
    public final /* synthetic */ EditorProAnchorActivity LJLIL;

    @Override // X.InterfaceC47814Ipe
    public final void onBufferingUpdate(TTVideoEngine tTVideoEngine, int i) {
    }

    @Override // X.InterfaceC47814Ipe
    public final /* synthetic */ void onFirstAVSyncFrame(TTVideoEngine tTVideoEngine) {
    }

    @Override // X.InterfaceC47814Ipe
    public final void onLoadStateChanged(TTVideoEngine tTVideoEngine, int i) {
    }

    @Override // X.InterfaceC47814Ipe
    public final void onPlaybackStateChanged(TTVideoEngine tTVideoEngine, int i) {
    }

    @Override // X.InterfaceC47814Ipe
    public final void onPrepare(TTVideoEngine tTVideoEngine) {
    }

    @Override // X.InterfaceC47814Ipe
    public final void onRefreshSurface(TTVideoEngine tTVideoEngine) {
    }

    @Override // X.InterfaceC47814Ipe
    public final /* synthetic */ int onSetSurface(TTVideoEngine tTVideoEngine, VideoSurface videoSurface, Surface surface) {
        return 0;
    }

    @Override // X.InterfaceC47814Ipe
    public final void onStreamChanged(TTVideoEngine tTVideoEngine, int i) {
    }

    @Override // X.InterfaceC47814Ipe
    public final /* synthetic */ void onVideoSecondFrame(TTVideoEngine tTVideoEngine) {
    }

    @Override // X.InterfaceC47814Ipe
    public final void onVideoSizeChanged(TTVideoEngine tTVideoEngine, int i, int i2) {
    }

    public W1A(EditorProAnchorActivity editorProAnchorActivity) {
        this.LJLIL = editorProAnchorActivity;
    }

    @Override // X.InterfaceC47814Ipe
    public final void onCompletion(TTVideoEngine tTVideoEngine) {
        this.LJLIL.LJLLILLLL++;
    }

    @Override // X.InterfaceC47814Ipe
    public final void onError(C47789IpF c47789IpF) {
        EditorProAnchorActivity editorProAnchorActivity = this.LJLIL;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("editor_pro_guide_page, onError=");
        LIZ.append(c47789IpF);
        editorProAnchorActivity.LLII(X1D.LIZIZ(LIZ));
        this.LJLIL.LLIIIZ(W1C.FAIL);
    }

    @Override // X.InterfaceC47814Ipe
    public final void onPrepared(TTVideoEngine tTVideoEngine) {
        this.LJLIL.LJLLI = true;
    }

    @Override // X.InterfaceC47814Ipe
    public final void onRenderStart(TTVideoEngine tTVideoEngine) {
        this.LJLIL.LLIIIILZ();
    }

    @Override // X.InterfaceC47814Ipe
    public final void onVideoStatusException(int i) {
        EditorProAnchorActivity editorProAnchorActivity = this.LJLIL;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("editor_pro_guide_page, onVideoStatusException, status=");
        LIZ.append(i);
        editorProAnchorActivity.LLII(X1D.LIZIZ(LIZ));
        this.LJLIL.LLIIIZ(W1C.FAIL);
    }
}
