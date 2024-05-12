package com.ss.android.ugc.aweme.music.model;

import X.InterfaceC65349Pkn;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import java.io.Serializable;
import java.util.List;

/* loaded from: classes13.dex */
public final class MatchedSoundInfo implements Serializable {

    @InterfaceC65349Pkn("author")
    public String author;

    @InterfaceC65349Pkn("chorus_info")
    public MusicChorusInfo chorusInfo;

    @InterfaceC65349Pkn("cover_medium")
    public UrlModel coverMedium;

    @InterfaceC65349Pkn("h5_url")
    public String h5Url;

    @InterfaceC65349Pkn("id")
    public String id;

    @InterfaceC65349Pkn("performers")
    public List<MusicPerformer> performers;

    @InterfaceC65349Pkn("title")
    public String title;

    public final String getAuthor() {
        return this.author;
    }

    public final MusicChorusInfo getChorusInfo() {
        return this.chorusInfo;
    }

    public final UrlModel getCoverMedium() {
        return this.coverMedium;
    }

    public final String getH5Url() {
        return this.h5Url;
    }

    public final String getId() {
        return this.id;
    }

    public final List<MusicPerformer> getPerformers() {
        return this.performers;
    }

    public final String getTitle() {
        return this.title;
    }

    public final void setAuthor(String str) {
        this.author = str;
    }

    public final void setChorusInfo(MusicChorusInfo musicChorusInfo) {
        this.chorusInfo = musicChorusInfo;
    }

    public final void setCoverMedium(UrlModel urlModel) {
        this.coverMedium = urlModel;
    }

    public final void setH5Url(String str) {
        this.h5Url = str;
    }

    public final void setId(String str) {
        this.id = str;
    }

    public final void setPerformers(List<MusicPerformer> list) {
        this.performers = list;
    }

    public final void setTitle(String str) {
        this.title = str;
    }
}
