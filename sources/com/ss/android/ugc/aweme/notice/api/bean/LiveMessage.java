package com.ss.android.ugc.aweme.notice.api.bean;

import X.EnumC54358LVa;
import X.InterfaceC65349Pkn;
import X.LVZ;
import com.ss.android.ugc.aweme.base.model.UrlModel;

/* loaded from: classes10.dex */
public class LiveMessage extends LVZ {

    @InterfaceC65349Pkn("anchor_avatar")
    public UrlModel anchorAvatar;

    @InterfaceC65349Pkn("anchor_id")
    public String anchorId;

    @InterfaceC65349Pkn("type")
    public int liveMessageType;

    public LiveMessage() {
        this.msgType = EnumC54358LVa.LIVE;
    }

    public UrlModel getAnchorAvatar() {
        return this.anchorAvatar;
    }

    public String getAnchorId() {
        return this.anchorId;
    }

    public int getLiveMessageType() {
        return this.liveMessageType;
    }

    public void setAnchorAvatar(UrlModel urlModel) {
        this.anchorAvatar = urlModel;
    }

    public void setAnchorId(String str) {
        this.anchorId = str;
    }

    public void setLiveMessageType(int i) {
        this.liveMessageType = i;
    }
}
