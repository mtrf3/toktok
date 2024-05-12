package com.ss.android.ugc.aweme.discover.model;

import X.InterfaceC65349Pkn;
import android.text.TextUtils;
import java.io.Serializable;

/* loaded from: classes4.dex */
public final class EpisodeData implements Serializable {

    @InterfaceC65349Pkn("album_id")
    public String albumId;

    @InterfaceC65349Pkn("definition")
    public String definition;

    @InterfaceC65349Pkn("duration")
    public double duration;

    @InterfaceC65349Pkn("episode_id")
    public String episodeId;

    @InterfaceC65349Pkn("name")
    public String name;

    @InterfaceC65349Pkn("online_time")
    public long onlineTime;

    @InterfaceC65349Pkn("opening")
    public double opening;

    @InterfaceC65349Pkn("payment_status")
    public int paymentStatus;

    @InterfaceC65349Pkn("lvideo_tag")
    public LongVideoTag paymentTag;

    @InterfaceC65349Pkn("lvideo_tag_light")
    public LongVideoTag paymentTagLight;

    @InterfaceC65349Pkn("schema_type")
    public int schemaType;

    @InterfaceC65349Pkn("schema")
    public String scheme;

    @InterfaceC65349Pkn("seq")
    public int seq;
    public String seqStr;

    @InterfaceC65349Pkn("sub_title")
    public String subTitle;

    @InterfaceC65349Pkn("title")
    public String title;

    @InterfaceC65349Pkn("url")
    public String url;

    @InterfaceC65349Pkn("vid")
    public String vid;

    public final String getSeqStr() {
        if (TextUtils.isEmpty(this.seqStr)) {
            return String.valueOf(this.seq);
        }
        return this.seqStr;
    }

    public final String getAlbumId() {
        return this.albumId;
    }

    public final String getDefinition() {
        return this.definition;
    }

    public final double getDuration() {
        return this.duration;
    }

    public final String getEpisodeId() {
        return this.episodeId;
    }

    public final String getName() {
        return this.name;
    }

    public final long getOnlineTime() {
        return this.onlineTime;
    }

    public final double getOpening() {
        return this.opening;
    }

    public final int getPaymentStatus() {
        return this.paymentStatus;
    }

    public final LongVideoTag getPaymentTag() {
        return this.paymentTag;
    }

    public final LongVideoTag getPaymentTagLight() {
        return this.paymentTagLight;
    }

    public final int getSchemaType() {
        return this.schemaType;
    }

    public final String getScheme() {
        return this.scheme;
    }

    public final int getSeq() {
        return this.seq;
    }

    public final String getSubTitle() {
        return this.subTitle;
    }

    public final String getTitle() {
        return this.title;
    }

    public final String getUrl() {
        return this.url;
    }

    public final String getVid() {
        return this.vid;
    }

    public final void setAlbumId(String str) {
        this.albumId = str;
    }

    public final void setDefinition(String str) {
        this.definition = str;
    }

    public final void setDuration(double d) {
        this.duration = d;
    }

    public final void setEpisodeId(String str) {
        this.episodeId = str;
    }

    public final void setName(String str) {
        this.name = str;
    }

    public final void setOnlineTime(long j) {
        this.onlineTime = j;
    }

    public final void setOpening(double d) {
        this.opening = d;
    }

    public final void setPaymentStatus(int i) {
        this.paymentStatus = i;
    }

    public final void setPaymentTag(LongVideoTag longVideoTag) {
        this.paymentTag = longVideoTag;
    }

    public final void setPaymentTagLight(LongVideoTag longVideoTag) {
        this.paymentTagLight = longVideoTag;
    }

    public final void setSchemaType(int i) {
        this.schemaType = i;
    }

    public final void setScheme(String str) {
        this.scheme = str;
    }

    public final void setSeq(int i) {
        this.seq = i;
    }

    public final void setSeqStr(String str) {
        this.seqStr = str;
    }

    public final void setSubTitle(String str) {
        this.subTitle = str;
    }

    public final void setTitle(String str) {
        this.title = str;
    }

    public final void setUrl(String str) {
        this.url = str;
    }

    public final void setVid(String str) {
        this.vid = str;
    }
}
