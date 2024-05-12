package com.ss.android.ugc.aweme.feed.model;

import X.C61878OQg;
import X.InterfaceC65349Pkn;
import java.io.Serializable;
import java.util.List;

/* loaded from: classes13.dex */
public final class PodcastInfo implements Serializable {

    @InterfaceC65349Pkn("podcast_episode_cover_image")
    public PodcastUrlModel cover;

    @InterfaceC65349Pkn("podcast_episode_authors")
    public List<String> episodeAuthors;

    @InterfaceC65349Pkn("podcast_episode_id")
    public String episodeItemId;

    @InterfaceC65349Pkn("podcast_episode_title")
    public String episodeTitle;

    @InterfaceC65349Pkn("podcast_feed_title")
    public String feedTitle;

    @InterfaceC65349Pkn("podcast_episode_is_branded_content")
    public Boolean isBrandedContent;

    @InterfaceC65349Pkn("audio_is_listenable")
    public Boolean isListenable;

    @InterfaceC65349Pkn("audio_is_podcast")
    public Boolean isPodcast;

    @InterfaceC65349Pkn("is_podcast_preview")
    public Boolean isPodcastPreview;

    @InterfaceC65349Pkn("follow_display")
    public Integer isSupportFollowButton;

    @InterfaceC65349Pkn("podcast_episode_play_addr")
    public PodcastUrlModel playAddr;

    public PodcastInfo() {
        Boolean bool = Boolean.FALSE;
        this.isListenable = bool;
        this.isPodcast = bool;
        this.isSupportFollowButton = 1;
        this.isPodcastPreview = bool;
        this.episodeItemId = "";
        this.episodeAuthors = C61878OQg.INSTANCE;
        this.playAddr = new PodcastUrlModel();
        this.cover = new PodcastUrlModel();
        this.feedTitle = "";
        this.episodeTitle = "";
        this.isBrandedContent = bool;
    }

    public final PodcastUrlModel getCover() {
        return this.cover;
    }

    public final List<String> getEpisodeAuthors() {
        return this.episodeAuthors;
    }

    public final String getEpisodeItemId() {
        return this.episodeItemId;
    }

    public final String getEpisodeTitle() {
        return this.episodeTitle;
    }

    public final String getFeedTitle() {
        return this.feedTitle;
    }

    public final PodcastUrlModel getPlayAddr() {
        return this.playAddr;
    }

    public final Boolean isBrandedContent() {
        return this.isBrandedContent;
    }

    public final Boolean isListenable() {
        return this.isListenable;
    }

    public final Boolean isPodcast() {
        return this.isPodcast;
    }

    public final Boolean isPodcastPreview() {
        return this.isPodcastPreview;
    }

    public final Integer isSupportFollowButton() {
        return this.isSupportFollowButton;
    }
}
