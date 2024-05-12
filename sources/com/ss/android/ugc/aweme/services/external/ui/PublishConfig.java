package com.ss.android.ugc.aweme.services.external.ui;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class PublishConfig {
    public String challenge;
    public String creationId;
    public String enterFrom;
    public String musicId;
    public String shootway;
    public String videoId;
    public String videoPath;

    public /* synthetic */ PublishConfig(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public final String getCreationId() {
        String str = this.creationId;
        if (str != null) {
            return str;
        }
        o.LJIJI("creationId");
        throw null;
    }

    public final String getEnterFrom() {
        String str = this.enterFrom;
        if (str != null) {
            return str;
        }
        o.LJIJI("enterFrom");
        throw null;
    }

    public final String getShootway() {
        String str = this.shootway;
        if (str != null) {
            return str;
        }
        o.LJIJI("shootway");
        throw null;
    }

    /* loaded from: classes8.dex */
    public static class Builder {
        public PublishConfig config = new PublishConfig();

        public final PublishConfig build() {
            return this.config;
        }

        public final Builder challenge(String challenge) {
            o.LJIIIZ(challenge, "challenge");
            this.config.setChallenge(challenge);
            return this;
        }

        public final Builder creationId(String creationId) {
            o.LJIIIZ(creationId, "creationId");
            this.config.setCreationId(creationId);
            return this;
        }

        public final Builder enterFrom(String enterFrom) {
            o.LJIIIZ(enterFrom, "enterFrom");
            this.config.setEnterFrom(enterFrom);
            return this;
        }

        public final Builder musicId(String musicId) {
            o.LJIIIZ(musicId, "musicId");
            this.config.setMusicId(musicId);
            return this;
        }

        public final Builder shootWay(String shootway) {
            o.LJIIIZ(shootway, "shootway");
            this.config.setShootway(shootway);
            return this;
        }

        public final Builder videoId(String videoId) {
            o.LJIIIZ(videoId, "videoId");
            this.config.setVideoId(videoId);
            return this;
        }

        public final Builder videoPath(String path) {
            o.LJIIIZ(path, "path");
            this.config.setVideoPath(path);
            return this;
        }
    }

    public PublishConfig() {
    }

    public final String getChallenge() {
        return this.challenge;
    }

    public final String getMusicId() {
        return this.musicId;
    }

    public final String getVideoId() {
        return this.videoId;
    }

    public final String getVideoPath() {
        return this.videoPath;
    }

    public final void setChallenge(String str) {
        this.challenge = str;
    }

    public final void setCreationId(String str) {
        o.LJIIIZ(str, "<set-?>");
        this.creationId = str;
    }

    public final void setEnterFrom(String str) {
        o.LJIIIZ(str, "<set-?>");
        this.enterFrom = str;
    }

    public final void setMusicId(String str) {
        this.musicId = str;
    }

    public final void setShootway(String str) {
        o.LJIIIZ(str, "<set-?>");
        this.shootway = str;
    }

    public final void setVideoId(String str) {
        this.videoId = str;
    }

    public final void setVideoPath(String str) {
        this.videoPath = str;
    }
}
