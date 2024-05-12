package com.ss.android.ugc.aweme.music.model;

import X.InterfaceC65349Pkn;
import java.io.Serializable;

/* loaded from: classes13.dex */
public final class Dsp implements Serializable {

    @InterfaceC65349Pkn("collect_status")
    public int collectStatus = -1;

    @InterfaceC65349Pkn("default_performer_avatar")
    public MusicAvatar defaultPerformerAvatar;

    @InterfaceC65349Pkn("full_clip_author")
    public String fullClipAuthor;

    @InterfaceC65349Pkn("full_clip_id")
    public String fullClipId;

    @InterfaceC65349Pkn("full_clip_title")
    public String fullClipTitle;

    @InterfaceC65349Pkn("is_show_entrance")
    public boolean isShowEntrance;

    @InterfaceC65349Pkn("mv_id")
    public long mvId;

    public final boolean isCollected() {
        if (this.collectStatus == 1) {
            return true;
        }
        return false;
    }

    public final int getCollectStatus() {
        return this.collectStatus;
    }

    public final MusicAvatar getDefaultPerformerAvatar() {
        return this.defaultPerformerAvatar;
    }

    public final String getFullClipAuthor() {
        return this.fullClipAuthor;
    }

    public final String getFullClipId() {
        return this.fullClipId;
    }

    public final String getFullClipTitle() {
        return this.fullClipTitle;
    }

    public final long getMvId() {
        return this.mvId;
    }

    public final boolean isShowEntrance() {
        return this.isShowEntrance;
    }

    public final boolean shouldShowAnchor() {
        return this.isShowEntrance;
    }

    public final void setCollectStatus(int i) {
        this.collectStatus = i;
    }
}
