package com.ss.android.ugc.aweme.audiomode.fullepisodev2.player.entity;

import X.C1E4;
import X.InterfaceC65349Pkn;
import java.io.Serializable;

/* loaded from: classes12.dex */
public final class MusicPlayInfo implements Serializable {

    @InterfaceC65349Pkn("expire_at")
    public final long expireAt;

    @InterfaceC65349Pkn("media_id")
    public final String mediaId = "";

    @InterfaceC65349Pkn("video_model")
    public final String videoModel = "";

    @InterfaceC65349Pkn("url_player_info")
    public final String urlPlayerInfo = "";

    @InterfaceC65349Pkn("authorization")
    public final String authorization = "";

    public final boolean isEmpty() {
        if (this.videoModel.length() == 0) {
            return true;
        }
        return false;
    }

    public final boolean isExpire() {
        if (this.expireAt < C1E4.LJIIZILJ()) {
            return true;
        }
        return false;
    }

    public final String getAuthorization() {
        return this.authorization;
    }

    public final long getExpireAt() {
        return this.expireAt;
    }

    public final String getMediaId() {
        return this.mediaId;
    }

    public final String getUrlPlayerInfo() {
        return this.urlPlayerInfo;
    }

    public final String getVideoModel() {
        return this.videoModel;
    }
}
