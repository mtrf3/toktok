package com.ss.android.ugc.aweme.discover.model;

import X.InterfaceC65349Pkn;
import X.UPJ;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import java.io.Serializable;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes4.dex */
public final class MovieSource implements Serializable {

    @InterfaceC65349Pkn("album_group_id")
    public String agid;

    @InterfaceC65349Pkn("album_id")
    public String albumId;

    @InterfaceC65349Pkn("cid")
    public String cid;

    @InterfaceC65349Pkn("cover")
    public UrlModel cover;

    @InterfaceC65349Pkn("desc")
    public String desc;

    @InterfaceC65349Pkn("duration")
    public double duration;

    @InterfaceC65349Pkn("episode_list")
    public List<EpisodeData> episodesList;

    @InterfaceC65349Pkn("has_more")
    public boolean hasMore;

    @InterfaceC65349Pkn("latest_seqs_count")
    public int latestSeqsCount;

    @InterfaceC65349Pkn("movie_module")
    public MovieModule movieModule;

    @InterfaceC65349Pkn("mp_icon")
    public String mpIcon;

    @InterfaceC65349Pkn("mp_id")
    public int mpId;

    @InterfaceC65349Pkn("mp_name")
    public String mpName;

    @InterfaceC65349Pkn("payment_status")
    public int paymentStatus;

    @InterfaceC65349Pkn("play_word")
    public String playWord;

    @InterfaceC65349Pkn("lvideo_tag")
    public LongVideoTag posterTag;

    @InterfaceC65349Pkn("lvideo_tag_light")
    public LongVideoTag posterTagLight;

    @InterfaceC65349Pkn("poster_tag_type")
    public int posterTagType;

    @InterfaceC65349Pkn("schema")
    public String schema;

    @InterfaceC65349Pkn("schema_type")
    public int schemaType;

    @InterfaceC65349Pkn("current_count")
    public int seqsCount;

    @InterfaceC65349Pkn("tags")
    public List<String> tags;

    @InterfaceC65349Pkn("title")
    public String title;

    @InterfaceC65349Pkn("seqs_count")
    public int totalSeqsCount;

    @InterfaceC65349Pkn("release_date")
    public long releaseDate = -1;

    @InterfaceC65349Pkn("status")
    public int status = -1;

    public final EpisodeData getFirstEpisodeData() {
        List<EpisodeData> list = this.episodesList;
        if (list != null) {
            o.LJI(list);
            if (list.size() > 0) {
                List<EpisodeData> list2 = this.episodesList;
                o.LJI(list2);
                return (EpisodeData) ListProtector.get(list2, 0);
            }
            return null;
        }
        return null;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("MovieSource(albumId=");
        sb.append(this.albumId);
        sb.append(", latestSeqsCount=");
        sb.append(this.latestSeqsCount);
        sb.append(", seqsCount=");
        sb.append(this.seqsCount);
        sb.append(", totalSeqsCount=");
        sb.append(this.totalSeqsCount);
        sb.append(", title=");
        sb.append(this.title);
        sb.append(", desc=");
        sb.append(this.desc);
        sb.append(", cover=");
        sb.append(this.cover);
        sb.append(", duration=");
        sb.append(this.duration);
        sb.append(", mpId=");
        sb.append(this.mpId);
        sb.append(", mpIcon=");
        sb.append(this.mpIcon);
        sb.append(", paymentStatus=");
        sb.append(this.paymentStatus);
        sb.append(", releaseDate=");
        sb.append(this.releaseDate);
        sb.append(", tags=");
        sb.append(this.tags);
        sb.append(", episodesList=");
        sb.append(this.episodesList);
        sb.append(", playWord=");
        sb.append(this.playWord);
        sb.append(", status=");
        sb.append(this.status);
        sb.append(", hasMore=");
        sb.append(this.hasMore);
        sb.append(", mpName=");
        sb.append(this.mpName);
        sb.append(", schema=");
        sb.append(this.schema);
        sb.append(", cid=");
        sb.append(this.cid);
        sb.append(", agid=");
        sb.append(this.agid);
        sb.append(", movieModule=");
        sb.append(this.movieModule);
        sb.append(", schemaType=");
        sb.append(this.schemaType);
        sb.append(", posterTag=$, posterTagType=");
        return UPJ.LIZLLL(sb, this.posterTagType, ')');
    }

    public final String getAgid() {
        return this.agid;
    }

    public final String getAlbumId() {
        return this.albumId;
    }

    public final String getCid() {
        return this.cid;
    }

    public final UrlModel getCover() {
        return this.cover;
    }

    public final String getDesc() {
        return this.desc;
    }

    public final double getDuration() {
        return this.duration;
    }

    public final List<EpisodeData> getEpisodesList() {
        return this.episodesList;
    }

    public final boolean getHasMore() {
        return this.hasMore;
    }

    public final int getLatestSeqsCount() {
        return this.latestSeqsCount;
    }

    public final MovieModule getMovieModule() {
        return this.movieModule;
    }

    public final String getMpIcon() {
        return this.mpIcon;
    }

    public final int getMpId() {
        return this.mpId;
    }

    public final String getMpName() {
        return this.mpName;
    }

    public final int getPaymentStatus() {
        return this.paymentStatus;
    }

    public final String getPlayWord() {
        return this.playWord;
    }

    public final LongVideoTag getPosterTag() {
        return this.posterTag;
    }

    public final LongVideoTag getPosterTagLight() {
        return this.posterTagLight;
    }

    public final int getPosterTagType() {
        return this.posterTagType;
    }

    public final long getReleaseDate() {
        return this.releaseDate;
    }

    public final String getSchema() {
        return this.schema;
    }

    public final int getSchemaType() {
        return this.schemaType;
    }

    public final int getSeqsCount() {
        return this.seqsCount;
    }

    public final int getStatus() {
        return this.status;
    }

    public final List<String> getTags() {
        return this.tags;
    }

    public final String getTitle() {
        return this.title;
    }

    public final int getTotalSeqsCount() {
        return this.totalSeqsCount;
    }

    public final void setAgid(String str) {
        this.agid = str;
    }

    public final void setAlbumId(String str) {
        this.albumId = str;
    }

    public final void setCid(String str) {
        this.cid = str;
    }

    public final void setCover(UrlModel urlModel) {
        this.cover = urlModel;
    }

    public final void setDesc(String str) {
        this.desc = str;
    }

    public final void setDuration(double d) {
        this.duration = d;
    }

    public final void setEpisodesList(List<EpisodeData> list) {
        this.episodesList = list;
    }

    public final void setHasMore(boolean z) {
        this.hasMore = z;
    }

    public final void setLatestSeqsCount(int i) {
        this.latestSeqsCount = i;
    }

    public final void setMovieModule(MovieModule movieModule) {
        this.movieModule = movieModule;
    }

    public final void setMpIcon(String str) {
        this.mpIcon = str;
    }

    public final void setMpId(int i) {
        this.mpId = i;
    }

    public final void setMpName(String str) {
        this.mpName = str;
    }

    public final void setPaymentStatus(int i) {
        this.paymentStatus = i;
    }

    public final void setPlayWord(String str) {
        this.playWord = str;
    }

    public final void setPosterTag(LongVideoTag longVideoTag) {
        this.posterTag = longVideoTag;
    }

    public final void setPosterTagLight(LongVideoTag longVideoTag) {
        this.posterTagLight = longVideoTag;
    }

    public final void setPosterTagType(int i) {
        this.posterTagType = i;
    }

    public final void setReleaseDate(long j) {
        this.releaseDate = j;
    }

    public final void setSchema(String str) {
        this.schema = str;
    }

    public final void setSchemaType(int i) {
        this.schemaType = i;
    }

    public final void setSeqsCount(int i) {
        this.seqsCount = i;
    }

    public final void setStatus(int i) {
        this.status = i;
    }

    public final void setTags(List<String> list) {
        this.tags = list;
    }

    public final void setTitle(String str) {
        this.title = str;
    }

    public final void setTotalSeqsCount(int i) {
        this.totalSeqsCount = i;
    }
}
