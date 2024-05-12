package com.ss.android.ugc.aweme.commercialize.log.repo.adsession;

import X.F9E;
import X.InterfaceC65349Pkn;

/* loaded from: classes4.dex */
public final class SessionPlayInfo extends F9E {

    @InterfaceC65349Pkn("id")
    public final int id;

    @InterfaceC65349Pkn("time_stamp")
    public final long timeStamp;

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{Integer.valueOf(this.id), Long.valueOf(this.timeStamp)};
    }

    public SessionPlayInfo(int i, long j) {
        this.id = i;
        this.timeStamp = j;
    }
}
