package com.ss.android.ugc.aweme.commercialize.log.repo.adsession;

import X.F9E;
import X.InterfaceC65349Pkn;
import kotlin.jvm.internal.o;

/* loaded from: classes4.dex */
public final class SessionClickInfo extends F9E {

    @InterfaceC65349Pkn("click_refer")
    public final String clickRefer;

    @InterfaceC65349Pkn("click_tag")
    public final String clickTag;

    @InterfaceC65349Pkn("id")
    public final int id;

    @InterfaceC65349Pkn("time_stamp")
    public final long timeStamp;

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{Integer.valueOf(this.id), this.clickRefer, this.clickTag, Long.valueOf(this.timeStamp)};
    }

    public SessionClickInfo(int i, String clickRefer, String clickTag, long j) {
        o.LJIIIZ(clickRefer, "clickRefer");
        o.LJIIIZ(clickTag, "clickTag");
        this.id = i;
        this.clickRefer = clickRefer;
        this.clickTag = clickTag;
        this.timeStamp = j;
    }
}
