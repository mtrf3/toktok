package com.ss.android.ugc.aweme.mix.model;

import X.InterfaceC65349Pkn;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.base.share.ShareInfo;
import java.io.Serializable;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public final class MixStruct implements Serializable {

    @InterfaceC65349Pkn("extra")
    public String extra;

    @InterfaceC65349Pkn("icon")
    public UrlModel icon;

    @InterfaceC65349Pkn("last_add_video_timestamp")
    public Long lastAddVideoTimestamp;

    @InterfaceC65349Pkn("mix_id")
    public String mixId;

    @InterfaceC65349Pkn("name")
    public String mixName;

    @InterfaceC65349Pkn("mix_type")
    public int mixType;

    @InterfaceC65349Pkn("moderated_rename_timestamp")
    public long moderatedRenameTimestamp;

    @InterfaceC65349Pkn("mix_name")
    public String name;

    @InterfaceC65349Pkn("share_info")
    public ShareInfo shareInfo;

    @InterfaceC65349Pkn("statistic")
    public MixStatisStruct statis;

    @InterfaceC65349Pkn("status")
    public MixStatusStruct status;

    public final String getMixName() {
        String str = this.mixName;
        if (str == null || o.LJ(str, "")) {
            return this.name;
        }
        return this.mixName;
    }

    public final String getName() {
        String str = this.name;
        if (str == null || o.LJ(str, "")) {
            return this.mixName;
        }
        return this.name;
    }

    public final String getExtra() {
        return this.extra;
    }

    public final UrlModel getIcon() {
        return this.icon;
    }

    public final Long getLastAddVideoTimestamp() {
        return this.lastAddVideoTimestamp;
    }

    public final int getMixType() {
        return this.mixType;
    }

    public final long getModeratedRenameTimestamp() {
        return this.moderatedRenameTimestamp;
    }

    public final ShareInfo getShareInfo() {
        return this.shareInfo;
    }

    public final MixStatisStruct getStatis() {
        return this.statis;
    }

    public final MixStatusStruct getStatus() {
        return this.status;
    }

    public final void setExtra(String str) {
        this.extra = str;
    }

    public final void setIcon(UrlModel urlModel) {
        this.icon = urlModel;
    }

    public final void setLastAddVideoTimestamp(Long l) {
        this.lastAddVideoTimestamp = l;
    }

    public final void setMixName(String str) {
        this.mixName = str;
    }

    public final void setMixType(int i) {
        this.mixType = i;
    }

    public final void setModeratedRenameTimestamp(long j) {
        this.moderatedRenameTimestamp = j;
    }

    public final void setName(String str) {
        this.name = str;
    }

    public final void setShareInfo(ShareInfo shareInfo) {
        this.shareInfo = shareInfo;
    }

    public final void setStatis(MixStatisStruct mixStatisStruct) {
        this.statis = mixStatisStruct;
    }

    public final void setStatus(MixStatusStruct mixStatusStruct) {
        this.status = mixStatusStruct;
    }
}
