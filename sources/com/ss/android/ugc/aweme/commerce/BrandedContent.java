package com.ss.android.ugc.aweme.commerce;

import X.InterfaceC65349Pkn;
import java.io.Serializable;
import java.util.List;

/* loaded from: classes11.dex */
public final class BrandedContent implements Serializable {

    @InterfaceC65349Pkn("enter_from_list")
    public final List<String> enterFroms;

    @InterfaceC65349Pkn("new_content_num")
    public final int newContentNum;

    @InterfaceC65349Pkn("update_time")
    public final long updateTime;

    public final List<String> getEnterFroms() {
        return this.enterFroms;
    }

    public final int getNewContentNum() {
        return this.newContentNum;
    }

    public final long getUpdateTime() {
        return this.updateTime;
    }
}
