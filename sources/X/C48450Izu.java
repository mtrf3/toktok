package X;

import android.view.Surface;
import com.bytedance.gift.render.engine.alphaplayer.controller.LocalPlayerController;
import com.ss.android.ugc.aweme.live.alphaplayer.player.AbsPlayer;
import com.ss.android.ugc.aweme.live.alphaplayer.player.IMediaPlayer;
import com.ss.texturerender.VideoSurface;
import com.ss.ttvideoengine.TTVideoEngine;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.Izu, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public class C48450Izu implements InterfaceC47814Ipe {
    public final /* synthetic */ C48449Izt LJLIL;

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
    public final /* synthetic */ void onRefreshSurface(TTVideoEngine tTVideoEngine) {
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

    public C48450Izu(C48449Izt c48449Izt) {
        this.LJLIL = c48449Izt;
    }

    @Override // X.InterfaceC47814Ipe
    public final void onCompletion(TTVideoEngine tTVideoEngine) {
        int LJJII;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("onCompletion player : [");
        LIZ.append(this.LJLIL.LIZIZ);
        LIZ.append(", ");
        LIZ.append(tTVideoEngine);
        LIZ.append("]");
        C32444CoK.LIZ("TTEnginePlayerImpl", X1D.LIZIZ(LIZ));
        C48449Izt c48449Izt = this.LJLIL;
        int i = 0;
        if (c48449Izt.LJFF) {
            boolean LJJJLL = c48449Izt.LIZIZ.LJJJLL();
            if (LJJJLL) {
                C32444CoK.LIZ("TTEnginePlayerImpl", "SR play success");
                LJJII = 0;
            } else {
                LJJII = c48449Izt.LIZIZ.LJJII(660);
                StringBuilder LIZ2 = X1D.LIZ();
                LIZ2.append("SR play fail and fail reason is ");
                LIZ2.append(LJJII);
                C32444CoK.LIZ("TTEnginePlayerImpl", X1D.LIZIZ(LIZ2));
            }
            J04 j04 = c48449Izt.LJII;
            if (j04 != null) {
                try {
                    LocalPlayerController localPlayerController = ((J01) j04).LIZ;
                    JSONObject put = new JSONObject().put("is_super_resolution_enable", 1);
                    if (!LJJJLL) {
                        i = LJJII;
                    }
                    localPlayerController.LLFF = put.put("super_resolution_status", i);
                } catch (JSONException e) {
                    C16880lQ.LLLLIIL(e);
                }
            }
        } else {
            J04 j042 = c48449Izt.LJII;
            if (j042 != null) {
                try {
                    ((J01) j042).LIZ.LLFF = new JSONObject().put("is_super_resolution_enable", 0);
                } catch (JSONException e2) {
                    C16880lQ.LLLLIIL(e2);
                }
            }
        }
        C48449Izt c48449Izt2 = this.LJLIL;
        IMediaPlayer.OnCompletionListener<AbsPlayer<T>> onCompletionListener = c48449Izt2.completionListener;
        if (onCompletionListener != 0) {
            onCompletionListener.onCompletion(c48449Izt2.self);
        }
    }

    @Override // X.InterfaceC47814Ipe
    public final void onError(C47789IpF c47789IpF) {
        C48449Izt c48449Izt = this.LJLIL;
        IMediaPlayer.OnErrorListener<AbsPlayer<T>> onErrorListener = c48449Izt.errorListener;
        if (onErrorListener != 0) {
            onErrorListener.onError(c48449Izt.self, c47789IpF.LIZ, c47789IpF.LIZIZ, c47789IpF.LIZLLL);
        }
    }

    @Override // X.InterfaceC47814Ipe
    public final void onPrepared(TTVideoEngine tTVideoEngine) {
        C48449Izt c48449Izt = this.LJLIL;
        IMediaPlayer.OnPreparedListener<AbsPlayer<T>> onPreparedListener = c48449Izt.preparedListener;
        if (onPreparedListener != 0) {
            onPreparedListener.onPrepared(c48449Izt.self);
        }
    }

    @Override // X.InterfaceC47814Ipe
    public final void onRenderStart(TTVideoEngine tTVideoEngine) {
        C48449Izt c48449Izt = this.LJLIL;
        IMediaPlayer.OnFirstFrameListener<AbsPlayer<T>> onFirstFrameListener = c48449Izt.firstFrameListener;
        if (onFirstFrameListener != 0) {
            onFirstFrameListener.onFirstFrame(c48449Izt.self);
        }
    }
}
