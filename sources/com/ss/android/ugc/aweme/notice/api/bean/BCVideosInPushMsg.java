package com.ss.android.ugc.aweme.notice.api.bean;

import X.EnumC54358LVa;
import X.InterfaceC65349Pkn;
import X.LVZ;
import java.io.Serializable;

/* loaded from: classes11.dex */
public final class BCVideosInPushMsg extends LVZ implements Serializable {
    public String LJLIL;

    @InterfaceC65349Pkn("new_content_num")
    public final int newContentNum;

    @InterfaceC65349Pkn("update_time")
    public final long updateTime;

    public final int getNewContentNum() {
        return this.newContentNum;
    }

    @Override // X.LVZ
    public EnumC54358LVa getType() {
        return EnumC54358LVa.BC;
    }

    public final String getUid() {
        return this.LJLIL;
    }

    public final long getUpdateTime() {
        return this.updateTime;
    }

    public final void setUid(String str) {
        this.LJLIL = str;
    }
}
