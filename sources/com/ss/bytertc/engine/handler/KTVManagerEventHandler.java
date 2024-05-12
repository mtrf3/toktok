package com.ss.bytertc.engine.handler;

import X.X1D;
import com.ss.bytertc.engine.utils.LogUtil;
import com.ss.bytertc.ktv.IKTVManagerEventHandler;
import com.ss.bytertc.ktv.data.DownloadResult;
import com.ss.bytertc.ktv.data.HotMusicInfo;
import com.ss.bytertc.ktv.data.KTVErrorCode;
import com.ss.bytertc.ktv.data.MusicInfo;

/* loaded from: classes33.dex */
public class KTVManagerEventHandler extends IKTVManagerEventHandler {
    public final IKTVManagerEventHandler mHandler;

    public IKTVManagerEventHandler getKTVHandler() {
        return this.mHandler;
    }

    public KTVManagerEventHandler(IKTVManagerEventHandler iKTVManagerEventHandler) {
        this.mHandler = iKTVManagerEventHandler;
    }

    @Override // com.ss.bytertc.ktv.IKTVManagerEventHandler
    public void onClearCacheResult(KTVErrorCode kTVErrorCode) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("onClearCacheResult...errorCode: ");
        LIZ.append(kTVErrorCode);
        LogUtil.d("KTVManagerEventHandler", X1D.LIZIZ(LIZ));
        try {
            IKTVManagerEventHandler iKTVManagerEventHandler = this.mHandler;
            if (iKTVManagerEventHandler != null) {
                iKTVManagerEventHandler.onClearCacheResult(kTVErrorCode);
            }
        } catch (Exception e) {
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("onClearCacheResult callback catch exception.\n");
            LIZ2.append(e.getMessage());
            LogUtil.e("KTVManagerEventHandler", X1D.LIZIZ(LIZ2));
        }
    }

    @Override // com.ss.bytertc.ktv.IKTVManagerEventHandler
    public void onDownloadFailed(int i, KTVErrorCode kTVErrorCode) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("onDownloadFailed...downloadId: ");
        LIZ.append(i);
        LIZ.append(",errorCode:");
        LIZ.append(kTVErrorCode);
        LogUtil.d("KTVManagerEventHandler", X1D.LIZIZ(LIZ));
        try {
            IKTVManagerEventHandler iKTVManagerEventHandler = this.mHandler;
            if (iKTVManagerEventHandler != null) {
                iKTVManagerEventHandler.onDownloadFailed(i, kTVErrorCode);
            }
        } catch (Exception e) {
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("onDownloadFailed callback catch exception.\n");
            LIZ2.append(e.getMessage());
            LogUtil.e("KTVManagerEventHandler", X1D.LIZIZ(LIZ2));
        }
    }

    @Override // com.ss.bytertc.ktv.IKTVManagerEventHandler
    public void onDownloadMusicProgress(int i, int i2) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("onDownloadMusicProgress...downloadId: ");
        LIZ.append(i);
        LIZ.append(",downloadProgress:");
        LIZ.append(i2);
        LogUtil.d("KTVManagerEventHandler", X1D.LIZIZ(LIZ));
        try {
            IKTVManagerEventHandler iKTVManagerEventHandler = this.mHandler;
            if (iKTVManagerEventHandler != null) {
                iKTVManagerEventHandler.onDownloadMusicProgress(i, i2);
            }
        } catch (Exception e) {
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("onDownloadMusicProgress callback catch exception.\n");
            LIZ2.append(e.getMessage());
            LogUtil.e("KTVManagerEventHandler", X1D.LIZIZ(LIZ2));
        }
    }

    @Override // com.ss.bytertc.ktv.IKTVManagerEventHandler
    public void onDownloadSuccess(int i, DownloadResult downloadResult) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("onDownloadSuccess...downloadId: ");
        LIZ.append(i);
        LIZ.append(",result:");
        LIZ.append(downloadResult);
        LogUtil.d("KTVManagerEventHandler", X1D.LIZIZ(LIZ));
        try {
            IKTVManagerEventHandler iKTVManagerEventHandler = this.mHandler;
            if (iKTVManagerEventHandler != null) {
                iKTVManagerEventHandler.onDownloadSuccess(i, downloadResult);
            }
        } catch (Exception e) {
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("onDownloadSuccess callback catch exception.\n");
            LIZ2.append(e.getMessage());
            LogUtil.e("KTVManagerEventHandler", X1D.LIZIZ(LIZ2));
        }
    }

    @Override // com.ss.bytertc.ktv.IKTVManagerEventHandler
    public void onHotMusicResult(HotMusicInfo[] hotMusicInfoArr, KTVErrorCode kTVErrorCode) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("onHotMusicResult...errorCode: ");
        LIZ.append(kTVErrorCode);
        LIZ.append(",musicsLen:");
        LIZ.append(hotMusicInfoArr.length);
        LogUtil.d("KTVManagerEventHandler", X1D.LIZIZ(LIZ));
        try {
            IKTVManagerEventHandler iKTVManagerEventHandler = this.mHandler;
            if (iKTVManagerEventHandler != null) {
                iKTVManagerEventHandler.onHotMusicResult(hotMusicInfoArr, kTVErrorCode);
            }
        } catch (Exception e) {
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("onHotMusicResult callback catch exception.\n");
            LIZ2.append(e.getMessage());
            LogUtil.e("KTVManagerEventHandler", X1D.LIZIZ(LIZ2));
        }
    }

    @Override // com.ss.bytertc.ktv.IKTVManagerEventHandler
    public void onMusicDetailResult(MusicInfo musicInfo, KTVErrorCode kTVErrorCode) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("onMusicDetailResult...errorCode: ");
        LIZ.append(kTVErrorCode);
        LIZ.append(",music:");
        LIZ.append(musicInfo);
        LogUtil.d("KTVManagerEventHandler", X1D.LIZIZ(LIZ));
        try {
            IKTVManagerEventHandler iKTVManagerEventHandler = this.mHandler;
            if (iKTVManagerEventHandler != null) {
                iKTVManagerEventHandler.onMusicDetailResult(musicInfo, kTVErrorCode);
            }
        } catch (Exception e) {
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("onMusicDetailResult callback catch exception.\n");
            LIZ2.append(e.getMessage());
            LogUtil.e("KTVManagerEventHandler", X1D.LIZIZ(LIZ2));
        }
    }

    @Override // com.ss.bytertc.ktv.IKTVManagerEventHandler
    public void onMusicListResult(MusicInfo[] musicInfoArr, int i, KTVErrorCode kTVErrorCode) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("onMusicListResult...errorCode: ");
        LIZ.append(kTVErrorCode);
        LIZ.append(",totalSize:");
        LIZ.append(i);
        LIZ.append(",musicsLen:");
        LIZ.append(musicInfoArr.length);
        LogUtil.d("KTVManagerEventHandler", X1D.LIZIZ(LIZ));
        try {
            IKTVManagerEventHandler iKTVManagerEventHandler = this.mHandler;
            if (iKTVManagerEventHandler != null) {
                iKTVManagerEventHandler.onMusicListResult(musicInfoArr, i, kTVErrorCode);
            }
        } catch (Exception e) {
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("onMusicListResult callback catch exception.\n");
            LIZ2.append(e.getMessage());
            LogUtil.e("KTVManagerEventHandler", X1D.LIZIZ(LIZ2));
        }
    }

    @Override // com.ss.bytertc.ktv.IKTVManagerEventHandler
    public void onSearchMusicResult(MusicInfo[] musicInfoArr, int i, KTVErrorCode kTVErrorCode) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("onSearchMusicResult...errorCode: ");
        LIZ.append(kTVErrorCode);
        LIZ.append(",totalSize:");
        LIZ.append(i);
        LIZ.append(",musicsLen:");
        LIZ.append(musicInfoArr.length);
        LogUtil.d("KTVManagerEventHandler", X1D.LIZIZ(LIZ));
        try {
            IKTVManagerEventHandler iKTVManagerEventHandler = this.mHandler;
            if (iKTVManagerEventHandler != null) {
                iKTVManagerEventHandler.onSearchMusicResult(musicInfoArr, i, kTVErrorCode);
            }
        } catch (Exception e) {
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("onSearchMusicResult callback catch exception.\n");
            LIZ2.append(e.getMessage());
            LogUtil.e("KTVManagerEventHandler", X1D.LIZIZ(LIZ2));
        }
    }
}
