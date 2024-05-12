package com.ss.android.ugc.aweme.live.livehostimpl.livereply;

import X.InterfaceC65349Pkn;
import java.io.Serializable;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class LiveReplyPayload implements Serializable {

    @InterfaceC65349Pkn("download_url")
    public String downloadUrl = "";

    @InterfaceC65349Pkn("is_success")
    public boolean isSuccess;

    @InterfaceC65349Pkn("punish_type")
    public int punishType;

    @InterfaceC65349Pkn("replay_id")
    public long replayId;

    public final String getDownloadUrl() {
        return this.downloadUrl;
    }

    public final int getPunishType() {
        return this.punishType;
    }

    public final long getReplayId() {
        return this.replayId;
    }

    public final boolean isSuccess() {
        return this.isSuccess;
    }

    public final void setDownloadUrl(String str) {
        o.LJIIIZ(str, "<set-?>");
        this.downloadUrl = str;
    }

    public final void setPunishType(int i) {
        this.punishType = i;
    }

    public final void setReplayId(long j) {
        this.replayId = j;
    }

    public final void setSuccess(boolean z) {
        this.isSuccess = z;
    }
}
