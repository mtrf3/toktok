package com.ss.bytertc.ktv;

import com.ss.bytertc.ktv.data.DownloadLyricType;
import com.ss.bytertc.ktv.data.MusicFilterType;
import com.ss.bytertc.ktv.data.MusicHotType;

/* loaded from: classes33.dex */
public abstract class IKTVManager {
    public abstract void cancelDownload(int i);

    public abstract void clearCache();

    public abstract int downloadLyric(String str, DownloadLyricType downloadLyricType);

    public abstract int downloadMidi(String str);

    public abstract int downloadMusic(String str);

    public abstract void getHotMusic(MusicHotType[] musicHotTypeArr, MusicFilterType[] musicFilterTypeArr);

    public abstract IKTVPlayer getKTVPlayer();

    public abstract void getMusicDetail(String str);

    public abstract void getMusicList(int i, int i2, MusicFilterType[] musicFilterTypeArr);

    public abstract void searchMusic(String str, int i, int i2, MusicFilterType[] musicFilterTypeArr);

    public abstract void setKTVManagerEventHandler(IKTVManagerEventHandler iKTVManagerEventHandler);

    public abstract void setMaxCacheSize(int i);
}
