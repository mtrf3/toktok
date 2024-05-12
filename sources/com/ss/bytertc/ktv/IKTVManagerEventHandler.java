package com.ss.bytertc.ktv;

import com.ss.bytertc.ktv.data.DownloadResult;
import com.ss.bytertc.ktv.data.HotMusicInfo;
import com.ss.bytertc.ktv.data.KTVErrorCode;
import com.ss.bytertc.ktv.data.MusicInfo;

/* loaded from: classes33.dex */
public abstract class IKTVManagerEventHandler {
    public abstract void onClearCacheResult(KTVErrorCode kTVErrorCode);

    public abstract void onDownloadFailed(int i, KTVErrorCode kTVErrorCode);

    public abstract void onDownloadMusicProgress(int i, int i2);

    public abstract void onDownloadSuccess(int i, DownloadResult downloadResult);

    public abstract void onHotMusicResult(HotMusicInfo[] hotMusicInfoArr, KTVErrorCode kTVErrorCode);

    public abstract void onMusicDetailResult(MusicInfo musicInfo, KTVErrorCode kTVErrorCode);

    public abstract void onMusicListResult(MusicInfo[] musicInfoArr, int i, KTVErrorCode kTVErrorCode);

    public abstract void onSearchMusicResult(MusicInfo[] musicInfoArr, int i, KTVErrorCode kTVErrorCode);
}
