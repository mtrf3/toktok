package com.ss.android.ugc.aweme.music.model;

import X.InterfaceC65349Pkn;
import java.io.Serializable;
import kotlin.jvm.internal.o;

/* loaded from: classes11.dex */
public final class MusicChartRankStruct implements Serializable {

    @InterfaceC65349Pkn("link_style")
    public MusicChartLinkStyle musicChartLinkStyle;

    @InterfaceC65349Pkn("rank")
    public int rank;

    @InterfaceC65349Pkn("id")
    public String id = "";

    @InterfaceC65349Pkn("desc")
    public String desc = "";

    @InterfaceC65349Pkn("detail_url")
    public String detailUrl = "";

    @InterfaceC65349Pkn("chart_music_info")
    public String chartMusicInfo = "";

    public final String getChartMusicInfo() {
        return this.chartMusicInfo;
    }

    public final String getDesc() {
        return this.desc;
    }

    public final String getDetailUrl() {
        return this.detailUrl;
    }

    public final String getId() {
        return this.id;
    }

    public final MusicChartLinkStyle getMusicChartLinkStyle() {
        return this.musicChartLinkStyle;
    }

    public final int getRank() {
        return this.rank;
    }

    public final void setChartMusicInfo(String str) {
        o.LJIIIZ(str, "<set-?>");
        this.chartMusicInfo = str;
    }

    public final void setDesc(String str) {
        o.LJIIIZ(str, "<set-?>");
        this.desc = str;
    }

    public final void setDetailUrl(String str) {
        o.LJIIIZ(str, "<set-?>");
        this.detailUrl = str;
    }

    public final void setId(String str) {
        o.LJIIIZ(str, "<set-?>");
        this.id = str;
    }

    public final void setMusicChartLinkStyle(MusicChartLinkStyle musicChartLinkStyle) {
        this.musicChartLinkStyle = musicChartLinkStyle;
    }

    public final void setRank(int i) {
        this.rank = i;
    }
}
