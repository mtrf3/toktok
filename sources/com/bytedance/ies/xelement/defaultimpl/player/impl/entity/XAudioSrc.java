package com.bytedance.ies.xelement.defaultimpl.player.impl.entity;

import X.C1DI;
import X.InterfaceC65349Pkn;
import X.V1L;
import X.X1D;
import com.bytedance.ies.xelement.defaultimpl.player.engine.api.common.PlayModel;
import defpackage.b1;
import java.util.HashMap;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes9.dex */
public final class XAudioSrc implements V1L {

    @InterfaceC65349Pkn("album_title")
    public final String mAlbumName;

    @InterfaceC65349Pkn("artist")
    public final String mArtistName;

    @InterfaceC65349Pkn("can_background_play")
    public final Boolean mCanBackgroundPlay;

    @InterfaceC65349Pkn("artwork_url")
    public final String mCoverUrl;

    @InterfaceC65349Pkn("playback_duration")
    public final Long mDuration;

    @InterfaceC65349Pkn("event_data")
    public final Map<String, String> mEventData;

    @InterfaceC65349Pkn("local_path")
    public final String mLocalPath;

    @InterfaceC65349Pkn("play_model")
    public final PlayModel mPlayModel;

    @InterfaceC65349Pkn("play_url")
    public final String mPlayUrl;

    @InterfaceC65349Pkn("id")
    public final String mSongId;

    @InterfaceC65349Pkn("title")
    public final String mSongName;

    /* JADX WARN: Multi-variable type inference failed */
    public XAudioSrc() {
        this(null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 2047, 0 == true ? 1 : 0);
    }

    @Override // X.V1L
    public String getAlbumName() {
        String str = this.mAlbumName;
        if (str != null) {
            return str;
        }
        return "";
    }

    @Override // X.V1L
    public String getArtistName() {
        String str = this.mArtistName;
        if (str != null) {
            return str;
        }
        return "";
    }

    @Override // X.V1L
    public String getCoverUrl() {
        String str = this.mCoverUrl;
        if (str != null) {
            return str;
        }
        return "";
    }

    @Override // X.V1L
    public long getDuration() {
        Long l = this.mDuration;
        if (l != null) {
            return l.longValue();
        }
        return 0L;
    }

    public Map<String, String> getExtras() {
        Map<String, String> map = this.mEventData;
        if (map != null) {
            return map;
        }
        return new HashMap();
    }

    @Override // X.V1L
    public String getId() {
        String str = this.mSongId;
        if (str != null) {
            return str;
        }
        return "";
    }

    @Override // X.V1L
    public String getLocalPath() {
        String str = this.mLocalPath;
        if (str != null) {
            return str;
        }
        return "";
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.V1L
    public PlayModel getPlayModel() {
        PlayModel playModel = this.mPlayModel;
        if (playModel != null) {
            return playModel;
        }
        return new PlayModel(null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 7, 0 == true ? 1 : 0);
    }

    @Override // X.V1L
    public String getPlayUrl() {
        String str = this.mPlayUrl;
        if (str != null) {
            return str;
        }
        return "";
    }

    @Override // X.V1L
    public String getSongName() {
        String str = this.mSongName;
        if (str != null) {
            return str;
        }
        return "";
    }

    public String toString() {
        StringBuilder LIZJ = b1.LIZJ("XAudioDataSource(", "mSongId=");
        C1DI.LIZIZ(LIZJ, this.mSongId, ", ", "mSongName=");
        C1DI.LIZIZ(LIZJ, this.mSongName, ", ", "mCoverUrl=");
        C1DI.LIZIZ(LIZJ, this.mCoverUrl, ", ", "mArtistName=");
        C1DI.LIZIZ(LIZJ, this.mArtistName, ", ", "mPlayUrl=");
        C1DI.LIZIZ(LIZJ, this.mPlayUrl, ", ", "mCoverUrl=");
        C1DI.LIZIZ(LIZJ, this.mCoverUrl, ", ", "mAlbumName=");
        C1DI.LIZIZ(LIZJ, this.mAlbumName, ", ", "mDuration=");
        LIZJ.append(this.mDuration);
        LIZJ.append(", ");
        LIZJ.append("mCanBackgroundPlay=");
        LIZJ.append(this.mCanBackgroundPlay);
        LIZJ.append(", ");
        LIZJ.append("mEventData=");
        LIZJ.append(this.mEventData);
        LIZJ.append(")");
        return X1D.LIZIZ(LIZJ);
    }

    public final String getMAlbumName() {
        return this.mAlbumName;
    }

    public final String getMArtistName() {
        return this.mArtistName;
    }

    public final Boolean getMCanBackgroundPlay() {
        return this.mCanBackgroundPlay;
    }

    public final String getMCoverUrl() {
        return this.mCoverUrl;
    }

    public final Long getMDuration() {
        return this.mDuration;
    }

    public final Map<String, String> getMEventData() {
        return this.mEventData;
    }

    public final String getMLocalPath() {
        return this.mLocalPath;
    }

    public final PlayModel getMPlayModel() {
        return this.mPlayModel;
    }

    public final String getMPlayUrl() {
        return this.mPlayUrl;
    }

    public final String getMSongId() {
        return this.mSongId;
    }

    public final String getMSongName() {
        return this.mSongName;
    }

    public XAudioSrc(String str, String str2, String str3, String str4, String str5, String str6, String str7, Long l, Boolean bool, Map<String, String> map, PlayModel playModel) {
        this.mSongId = str;
        this.mSongName = str2;
        this.mCoverUrl = str3;
        this.mArtistName = str4;
        this.mPlayUrl = str5;
        this.mLocalPath = str6;
        this.mAlbumName = str7;
        this.mDuration = l;
        this.mCanBackgroundPlay = bool;
        this.mEventData = map;
        this.mPlayModel = playModel;
    }

    public /* synthetic */ XAudioSrc(String str, String str2, String str3, String str4, String str5, String str6, String str7, Long l, Boolean bool, Map map, PlayModel playModel, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? "" : str4, (i & 16) != 0 ? "" : str5, (i & 32) != 0 ? "" : str6, (i & 64) == 0 ? str7 : "", (i & 128) != 0 ? 0L : l, (i & 256) != 0 ? Boolean.FALSE : bool, (i & 512) != 0 ? null : map, (i & 1024) == 0 ? playModel : null);
    }
}
