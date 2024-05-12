package com.bytedance.android.live.liveinteract.multilive.model;

import X.F9E;
import X.InterfaceC65349Pkn;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes14.dex */
public final class GuestClientList extends F9E {

    @InterfaceC65349Pkn("link_mic_id")
    public String linkMicId;

    @InterfaceC65349Pkn("rtc_status")
    public int rtcStatus;

    @InterfaceC65349Pkn("source")
    public int source;

    @InterfaceC65349Pkn("status")
    public int status;

    @InterfaceC65349Pkn("uid")
    public long uid;

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public GuestClientList() {
        /*
            r9 = this;
            r1 = 0
            r3 = 0
            r4 = 0
            r7 = 31
            r0 = r9
            r5 = r4
            r6 = r4
            r8 = r3
            r0.<init>(r1, r3, r4, r5, r6, r7, r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.live.liveinteract.multilive.model.GuestClientList.<init>():void");
    }

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{Long.valueOf(this.uid), this.linkMicId, Integer.valueOf(this.status), Integer.valueOf(this.source), Integer.valueOf(this.rtcStatus)};
    }

    public GuestClientList(long j, String str, int i, int i2, int i3) {
        this.uid = j;
        this.linkMicId = str;
        this.status = i;
        this.source = i2;
        this.rtcStatus = i3;
    }

    public /* synthetic */ GuestClientList(long j, String str, int i, int i2, int i3, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this((i4 & 1) != 0 ? 0L : j, (i4 & 2) != 0 ? null : str, (i4 & 4) != 0 ? 0 : i, (i4 & 8) != 0 ? 0 : i2, (i4 & 16) != 0 ? 0 : i3);
    }
}
