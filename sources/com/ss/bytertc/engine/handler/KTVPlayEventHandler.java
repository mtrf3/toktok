package com.ss.bytertc.engine.handler;

import X.X1D;
import com.ss.bytertc.engine.utils.LogUtil;
import com.ss.bytertc.ktv.IKTVPlayerEventHandler;
import com.ss.bytertc.ktv.data.KTVPlayerErrorCode;
import com.ss.bytertc.ktv.data.PlayState;

/* loaded from: classes33.dex */
public class KTVPlayEventHandler extends IKTVPlayerEventHandler {
    public final IKTVPlayerEventHandler mHandler;

    public KTVPlayEventHandler(IKTVPlayerEventHandler iKTVPlayerEventHandler) {
        this.mHandler = iKTVPlayerEventHandler;
    }

    @Override // com.ss.bytertc.ktv.IKTVPlayerEventHandler
    public void onPlayProgress(String str, long j) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("onPlayProgress...musicId: ");
        LIZ.append(str);
        LIZ.append(",progress:");
        LIZ.append(j);
        LogUtil.d("KTVPlayEventHandler", X1D.LIZIZ(LIZ));
        try {
            IKTVPlayerEventHandler iKTVPlayerEventHandler = this.mHandler;
            if (iKTVPlayerEventHandler != null) {
                iKTVPlayerEventHandler.onPlayProgress(str, j);
            }
        } catch (Exception e) {
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("onPlayProgress callback catch exception.\n");
            LIZ2.append(e.getMessage());
            LogUtil.e("KTVPlayEventHandler", X1D.LIZIZ(LIZ2));
        }
    }

    @Override // com.ss.bytertc.ktv.IKTVPlayerEventHandler
    public void onPlayStateChanged(String str, PlayState playState, KTVPlayerErrorCode kTVPlayerErrorCode) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("onPlayStateChanged...musicId: ");
        LIZ.append(str);
        LIZ.append(",playState:");
        LIZ.append(playState.toString());
        LogUtil.d("KTVPlayEventHandler", X1D.LIZIZ(LIZ));
        try {
            IKTVPlayerEventHandler iKTVPlayerEventHandler = this.mHandler;
            if (iKTVPlayerEventHandler != null) {
                iKTVPlayerEventHandler.onPlayStateChanged(str, playState, kTVPlayerErrorCode);
            }
        } catch (Exception e) {
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("onPlayStateChanged callback catch exception.\n");
            LIZ2.append(e.getMessage());
            LogUtil.e("KTVPlayEventHandler", X1D.LIZIZ(LIZ2));
        }
    }
}
