package com.ss.android.ugc.aweme.feed.model;

import X.InterfaceC65349Pkn;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import java.io.Serializable;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes11.dex */
public final class PlayListInfo implements Serializable {
    public static final Companion Companion = new Companion();
    public transient boolean alreadyShownPlayNext;

    @InterfaceC65349Pkn("icon")
    public UrlModel icon;

    @InterfaceC65349Pkn("index")
    public Integer index;

    @InterfaceC65349Pkn("mix_id")
    public String mixId;

    @InterfaceC65349Pkn("name")
    public String mixName;

    @InterfaceC65349Pkn("item_total")
    public Long itemTotal = 0L;

    @InterfaceC65349Pkn("show_rename_tooltip")
    public Boolean showRenameTooltip = Boolean.FALSE;

    @InterfaceC65349Pkn("create_time")
    public Long createTime = 0L;

    @InterfaceC65349Pkn("update_time")
    public Long updateTime = 0L;

    @InterfaceC65349Pkn("mix_src")
    public Integer mixSrc = 0;

    @InterfaceC65349Pkn("total_item_play_count")
    public Long playCount = 0L;

    /* loaded from: classes11.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }
    }

    public final boolean getAlreadyShownPlayNext() {
        return this.alreadyShownPlayNext;
    }

    public final Long getCreateTime() {
        return this.createTime;
    }

    public final UrlModel getIcon() {
        return this.icon;
    }

    public final Integer getIndex() {
        return this.index;
    }

    public final Long getItemTotal() {
        return this.itemTotal;
    }

    public final String getMixId() {
        return this.mixId;
    }

    public final String getMixName() {
        return this.mixName;
    }

    public final Integer getMixSrc() {
        return this.mixSrc;
    }

    public final Long getPlayCount() {
        return this.playCount;
    }

    public final Boolean getShowRenameTooltip() {
        return this.showRenameTooltip;
    }

    public final Long getUpdateTime() {
        return this.updateTime;
    }

    public final void setAlreadyShownPlayNext(boolean z) {
        this.alreadyShownPlayNext = z;
    }

    public final void setCreateTime(Long l) {
        this.createTime = l;
    }

    public final void setIcon(UrlModel urlModel) {
        this.icon = urlModel;
    }

    public final void setIndex(Integer num) {
        this.index = num;
    }

    public final void setItemTotal(Long l) {
        this.itemTotal = l;
    }

    public final void setMixId(String str) {
        this.mixId = str;
    }

    public final void setMixName(String str) {
        this.mixName = str;
    }

    public final void setMixSrc(Integer num) {
        this.mixSrc = num;
    }

    public final void setPlayCount(Long l) {
        this.playCount = l;
    }

    public final void setShowRenameTooltip(Boolean bool) {
        this.showRenameTooltip = bool;
    }

    public final void setUpdateTime(Long l) {
        this.updateTime = l;
    }
}
