package com.ss.android.ugc.aweme.mix.model;

import X.InterfaceC65349Pkn;
import java.io.Serializable;

/* loaded from: classes13.dex */
public final class MixStatisStruct implements Serializable {

    @InterfaceC65349Pkn("collect_vv")
    public long collectVV;

    @InterfaceC65349Pkn("current_episode")
    public long currentEpisode;

    @InterfaceC65349Pkn("has_updated_episode")
    public long hasUpdatedEpisode;

    @InterfaceC65349Pkn("last_read_episode")
    public long lastReadEpisode;

    @InterfaceC65349Pkn("play_vv")
    public long playVV;

    @InterfaceC65349Pkn("total")
    public int total;

    @InterfaceC65349Pkn("updated_to_episode")
    public long updatedToEpisode;

    public final long getCollectVV() {
        return this.collectVV;
    }

    public final long getCurrentEpisode() {
        return this.currentEpisode;
    }

    public final long getHasUpdatedEpisode() {
        return this.hasUpdatedEpisode;
    }

    public final long getLastReadEpisode() {
        return this.lastReadEpisode;
    }

    public final long getPlayVV() {
        return this.playVV;
    }

    public final int getTotal() {
        return this.total;
    }

    public final long getUpdatedToEpisode() {
        return this.updatedToEpisode;
    }

    public final void setCollectVV(long j) {
        this.collectVV = j;
    }

    public final void setCurrentEpisode(long j) {
        this.currentEpisode = j;
    }

    public final void setHasUpdatedEpisode(long j) {
        this.hasUpdatedEpisode = j;
    }

    public final void setLastReadEpisode(long j) {
        this.lastReadEpisode = j;
    }

    public final void setPlayVV(long j) {
        this.playVV = j;
    }

    public final void setTotal(int i) {
        this.total = i;
    }

    public final void setUpdatedToEpisode(long j) {
        this.updatedToEpisode = j;
    }
}
