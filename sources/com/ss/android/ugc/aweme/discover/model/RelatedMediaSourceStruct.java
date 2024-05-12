package com.ss.android.ugc.aweme.discover.model;

import X.InterfaceC65349Pkn;
import X.ORZ;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import java.io.Serializable;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes4.dex */
public final class RelatedMediaSourceStruct implements Serializable {

    @InterfaceC65349Pkn("button")
    public MediaSourceButtonStruct button;

    @InterfaceC65349Pkn("classification")
    public List<String> classification;

    @InterfaceC65349Pkn("compass_id")
    public String compassId;

    @InterfaceC65349Pkn("seqs_count")
    public int epCount;

    @InterfaceC65349Pkn("episode_info")
    public MovieSource episodeInfo;

    @InterfaceC65349Pkn("movie_info")
    public Movie movieInfo;

    @InterfaceC65349Pkn("title")
    public String title = "";

    @InterfaceC65349Pkn("read_more")
    public String readMore = "";

    @InterfaceC65349Pkn("read_more_url")
    public String readMoreUrl = "";

    @InterfaceC65349Pkn("media_type")
    public int mediaType = 1;

    @InterfaceC65349Pkn("media_name")
    public String mediaName = "";

    @InterfaceC65349Pkn("cover")
    public UrlModel cover = new UrlModel();

    @InterfaceC65349Pkn("release_date")
    public String releaseData = "";

    @InterfaceC65349Pkn("duration")
    public Integer duration = 0;

    @InterfaceC65349Pkn("rating")
    public Float rating = Float.valueOf(0.0f);

    @InterfaceC65349Pkn("rating_status")
    public Integer ratingStatus = 0;

    @InterfaceC65349Pkn("media_tag")
    public String mediaTag = "";

    public final String getContentType() {
        List<String> list = this.classification;
        if (list != null) {
            return ORZ.LLD(list, " ", null, null, null, 62);
        }
        return "";
    }

    public final boolean isMovie() {
        if (this.mediaType == 3) {
            return true;
        }
        return false;
    }

    public final MediaSourceButtonStruct getButton() {
        return this.button;
    }

    public final List<String> getClassification() {
        return this.classification;
    }

    public final String getCompassId() {
        return this.compassId;
    }

    public final UrlModel getCover() {
        return this.cover;
    }

    public final Integer getDuration() {
        return this.duration;
    }

    public final int getEpCount() {
        return this.epCount;
    }

    public final MovieSource getEpisodeInfo() {
        return this.episodeInfo;
    }

    public final String getMediaName() {
        return this.mediaName;
    }

    public final String getMediaTag() {
        return this.mediaTag;
    }

    public final int getMediaType() {
        return this.mediaType;
    }

    public final Movie getMovieInfo() {
        return this.movieInfo;
    }

    public final Float getRating() {
        return this.rating;
    }

    public final Integer getRatingStatus() {
        return this.ratingStatus;
    }

    public final String getReadMore() {
        return this.readMore;
    }

    public final String getReadMoreUrl() {
        return this.readMoreUrl;
    }

    public final String getReleaseData() {
        return this.releaseData;
    }

    public final String getTitle() {
        return this.title;
    }

    public final void setButton(MediaSourceButtonStruct mediaSourceButtonStruct) {
        this.button = mediaSourceButtonStruct;
    }

    public final void setClassification(List<String> list) {
        this.classification = list;
    }

    public final void setCompassId(String str) {
        this.compassId = str;
    }

    public final void setCover(UrlModel urlModel) {
        o.LJIIIZ(urlModel, "<set-?>");
        this.cover = urlModel;
    }

    public final void setDuration(Integer num) {
        this.duration = num;
    }

    public final void setEpCount(int i) {
        this.epCount = i;
    }

    public final void setEpisodeInfo(MovieSource movieSource) {
        this.episodeInfo = movieSource;
    }

    public final void setMediaName(String str) {
        o.LJIIIZ(str, "<set-?>");
        this.mediaName = str;
    }

    public final void setMediaTag(String str) {
        o.LJIIIZ(str, "<set-?>");
        this.mediaTag = str;
    }

    public final void setMediaType(int i) {
        this.mediaType = i;
    }

    public final void setMovieInfo(Movie movie) {
        this.movieInfo = movie;
    }

    public final void setRating(Float f) {
        this.rating = f;
    }

    public final void setRatingStatus(Integer num) {
        this.ratingStatus = num;
    }

    public final void setReadMore(String str) {
        o.LJIIIZ(str, "<set-?>");
        this.readMore = str;
    }

    public final void setReadMoreUrl(String str) {
        o.LJIIIZ(str, "<set-?>");
        this.readMoreUrl = str;
    }

    public final void setReleaseData(String str) {
        this.releaseData = str;
    }

    public final void setTitle(String str) {
        o.LJIIIZ(str, "<set-?>");
        this.title = str;
    }
}
