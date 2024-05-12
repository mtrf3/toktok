package com.ss.bytertc.ktv;

import com.ss.bytertc.engine.BuildConfig;
import com.ss.bytertc.engine.NativeKTVManagerFunctions;
import com.ss.bytertc.engine.handler.KTVManagerEventHandler;
import com.ss.bytertc.engine.utils.LogUtil;
import com.ss.bytertc.ktv.data.DownloadLyricType;
import com.ss.bytertc.ktv.data.MusicFilterType;
import com.ss.bytertc.ktv.data.MusicHotType;

/* loaded from: classes33.dex */
public class KTVManagerImpl extends IKTVManager {
    public KTVManagerEventHandler mKTVManagerEventHandler;
    public KTVPlayerImpl mKTVPlayer;
    public final long mNativeKTVManager;
    public long mNativeKTVManagerEventHandlerPtr;

    @Override // com.ss.bytertc.ktv.IKTVManager
    public void clearCache() {
        if (this.mNativeKTVManager == 0) {
            LogUtil.e("KTVManagerImpl", "native KTVManagerImpl is invalid, clearCache failed.");
        }
        NativeKTVManagerFunctions.nativeClearCache(this.mNativeKTVManager);
    }

    public void destroy() {
        KTVPlayerImpl kTVPlayerImpl = this.mKTVPlayer;
        if (kTVPlayerImpl != null) {
            kTVPlayerImpl.destroy();
            this.mKTVPlayer = null;
        }
        long j = this.mNativeKTVManagerEventHandlerPtr;
        if (j != 0) {
            NativeKTVManagerFunctions.nativeReleaseKTVManagerEventHandler(j);
            this.mNativeKTVManagerEventHandlerPtr = 0L;
        }
        this.mKTVManagerEventHandler = null;
    }

    public IKTVManagerEventHandler getHandler() {
        return this.mKTVManagerEventHandler.getKTVHandler();
    }

    @Override // com.ss.bytertc.ktv.IKTVManager
    public IKTVPlayer getKTVPlayer() {
        if (this.mNativeKTVManager == 0) {
            LogUtil.e("KTVManagerImpl", "native KTVManagerImpl is invalid, getKTVPlayer failed.");
        }
        KTVPlayerImpl kTVPlayerImpl = this.mKTVPlayer;
        if (kTVPlayerImpl != null) {
            return kTVPlayerImpl;
        }
        long nativeGetKTVPlayer = NativeKTVManagerFunctions.nativeGetKTVPlayer(this.mNativeKTVManager);
        if (nativeGetKTVPlayer == 0) {
            LogUtil.e("KTVManagerImpl", "native nativeKTVPlayer is invalid, getKTVPlayer failed.");
            return null;
        }
        KTVPlayerImpl kTVPlayerImpl2 = new KTVPlayerImpl(nativeGetKTVPlayer);
        this.mKTVPlayer = kTVPlayerImpl2;
        return kTVPlayerImpl2;
    }

    public KTVManagerImpl(long j) {
        this.mNativeKTVManager = j;
    }

    private int calculateMusicFilterValue(MusicFilterType[] musicFilterTypeArr) {
        int length;
        if (musicFilterTypeArr == null || (length = musicFilterTypeArr.length) == 0) {
            return MusicFilterType.NONE.value();
        }
        if (length == 1) {
            return musicFilterTypeArr[0].value();
        }
        int value = musicFilterTypeArr[0].value();
        for (MusicFilterType musicFilterType : musicFilterTypeArr) {
            if (value == MusicFilterType.NONE.value()) {
                if (!BuildConfig.DEBUG) {
                    LogUtil.e("KTVManagerImpl", "types contains 'MUSIC_FILTER_TYPE_NONE' and other");
                    return -1;
                }
                throw new IllegalArgumentException("types contains 'MUSIC_FILTER_TYPE_NONE' and other");
            }
            value |= musicFilterType.value();
        }
        return value;
    }

    private int calculateMusicHotTypeValue(MusicHotType[] musicHotTypeArr) {
        int length;
        if (musicHotTypeArr == null || (length = musicHotTypeArr.length) == 0) {
            return MusicHotType.CONTENT_CENTER.value();
        }
        if (length == 1) {
            return musicHotTypeArr[0].value();
        }
        int value = musicHotTypeArr[0].value();
        for (MusicHotType musicHotType : musicHotTypeArr) {
            value |= musicHotType.value();
        }
        return value;
    }

    @Override // com.ss.bytertc.ktv.IKTVManager
    public void cancelDownload(int i) {
        if (this.mNativeKTVManager == 0) {
            LogUtil.e("KTVManagerImpl", "native KTVManagerImpl is invalid, downloadLyric failed.");
        }
        NativeKTVManagerFunctions.nativeCancelDownload(this.mNativeKTVManager, i);
    }

    @Override // com.ss.bytertc.ktv.IKTVManager
    public int downloadMidi(String str) {
        long j = this.mNativeKTVManager;
        if (j == 0) {
            LogUtil.e("KTVManagerImpl", "native KTVManagerImpl is invalid, downloadMidi failed.");
            return -1;
        }
        return NativeKTVManagerFunctions.nativeDownloadMidi(j, str);
    }

    @Override // com.ss.bytertc.ktv.IKTVManager
    public int downloadMusic(String str) {
        long j = this.mNativeKTVManager;
        if (j == 0) {
            LogUtil.e("KTVManagerImpl", "native KTVManagerImpl is invalid, downloadMusic failed.");
            return -1;
        }
        return NativeKTVManagerFunctions.nativeDownloadMusic(j, str);
    }

    @Override // com.ss.bytertc.ktv.IKTVManager
    public void getMusicDetail(String str) {
        long j = this.mNativeKTVManager;
        if (j == 0) {
            LogUtil.e("KTVManagerImpl", "native KTVManagerImpl is invalid, getMusicDetail failed.");
        } else {
            NativeKTVManagerFunctions.nativeGetMusicDetail(j, str);
        }
    }

    @Override // com.ss.bytertc.ktv.IKTVManager
    public void setKTVManagerEventHandler(IKTVManagerEventHandler iKTVManagerEventHandler) {
        if (this.mNativeKTVManager == 0) {
            LogUtil.e("KTVManagerImpl", "native KTVManagerImpl is invalid, setKTVManagerEventHandler failed.");
            return;
        }
        KTVManagerEventHandler kTVManagerEventHandler = new KTVManagerEventHandler(iKTVManagerEventHandler);
        this.mKTVManagerEventHandler = kTVManagerEventHandler;
        long j = this.mNativeKTVManagerEventHandlerPtr;
        this.mNativeKTVManagerEventHandlerPtr = NativeKTVManagerFunctions.nativeSetKTVManagerEventHandler(this.mNativeKTVManager, kTVManagerEventHandler);
        if (j != 0) {
            NativeKTVManagerFunctions.nativeReleaseKTVManagerEventHandler(j);
        }
    }

    @Override // com.ss.bytertc.ktv.IKTVManager
    public void setMaxCacheSize(int i) {
        long j = this.mNativeKTVManager;
        if (j == 0) {
            LogUtil.e("KTVManagerImpl", "native KTVManagerImpl is invalid, setMaxCacheSize failed.");
        } else {
            NativeKTVManagerFunctions.nativeSetMaxCacheSize(j, i);
        }
    }

    @Override // com.ss.bytertc.ktv.IKTVManager
    public int downloadLyric(String str, DownloadLyricType downloadLyricType) {
        long j = this.mNativeKTVManager;
        if (j == 0) {
            LogUtil.e("KTVManagerImpl", "native KTVManagerImpl is invalid, downloadLyric failed.");
            return -1;
        }
        return NativeKTVManagerFunctions.nativeDownloadLyric(j, str, downloadLyricType.value());
    }

    @Override // com.ss.bytertc.ktv.IKTVManager
    public void getHotMusic(MusicHotType[] musicHotTypeArr, MusicFilterType[] musicFilterTypeArr) {
        if (this.mNativeKTVManager == 0) {
            LogUtil.e("KTVManagerImpl", "native KTVManagerImpl is invalid, getHotMusic failed.");
            return;
        }
        int calculateMusicFilterValue = calculateMusicFilterValue(musicFilterTypeArr);
        int calculateMusicHotTypeValue = calculateMusicHotTypeValue(musicHotTypeArr);
        if (calculateMusicFilterValue == -1 || calculateMusicHotTypeValue == -1) {
            return;
        }
        NativeKTVManagerFunctions.nativeGetHotMusic(this.mNativeKTVManager, calculateMusicHotTypeValue, calculateMusicFilterValue);
    }

    @Override // com.ss.bytertc.ktv.IKTVManager
    public void getMusicList(int i, int i2, MusicFilterType[] musicFilterTypeArr) {
        if (this.mNativeKTVManager == 0) {
            LogUtil.e("KTVManagerImpl", "native KTVManagerImpl is invalid, getMusicList failed.");
            return;
        }
        int calculateMusicFilterValue = calculateMusicFilterValue(musicFilterTypeArr);
        if (calculateMusicFilterValue == -1) {
            return;
        }
        NativeKTVManagerFunctions.nativeGetMusicList(this.mNativeKTVManager, i, i2, calculateMusicFilterValue);
    }

    @Override // com.ss.bytertc.ktv.IKTVManager
    public void searchMusic(String str, int i, int i2, MusicFilterType[] musicFilterTypeArr) {
        if (this.mNativeKTVManager == 0) {
            LogUtil.e("KTVManagerImpl", "native KTVManagerImpl is invalid, searchMusic failed.");
            return;
        }
        int calculateMusicFilterValue = calculateMusicFilterValue(musicFilterTypeArr);
        if (calculateMusicFilterValue == -1) {
            return;
        }
        NativeKTVManagerFunctions.nativeSearchMusic(this.mNativeKTVManager, str, i, i2, calculateMusicFilterValue);
    }
}
