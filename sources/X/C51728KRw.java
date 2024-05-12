package X;

import android.view.Surface;
import com.ss.android.ugc.aweme.shortvideo.edit.capcut.EditCapCutFragment;
import com.ss.texturerender.VideoSurface;
import com.ss.ttvideoengine.TTVideoEngine;

/* renamed from: X.KRw, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C51728KRw implements InterfaceC47814Ipe {
    public final /* synthetic */ EditCapCutFragment LJLIL;

    @Override // X.InterfaceC47814Ipe
    public final void onBufferingUpdate(TTVideoEngine tTVideoEngine, int i) {
    }

    @Override // X.InterfaceC47814Ipe
    public final void onCompletion(TTVideoEngine tTVideoEngine) {
    }

    @Override // X.InterfaceC47814Ipe
    public final void onError(C47789IpF c47789IpF) {
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
    public final /* synthetic */ void onRefreshSurface(TTVideoEngine tTVideoEngine) {
    }

    @Override // X.InterfaceC47814Ipe
    public final void onRenderStart(TTVideoEngine tTVideoEngine) {
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

    @Override // X.InterfaceC47814Ipe
    public final void onVideoStatusException(int i) {
    }

    public C51728KRw(EditCapCutFragment editCapCutFragment) {
        this.LJLIL = editCapCutFragment;
    }

    @Override // X.InterfaceC47814Ipe
    public final void onPrepared(TTVideoEngine tTVideoEngine) {
        EditCapCutFragment editCapCutFragment = this.LJLIL;
        editCapCutFragment.LJLJI = true;
        if (!editCapCutFragment.getUserVisibleHint() && tTVideoEngine != null) {
            tTVideoEngine.LJJL();
        }
    }
}
