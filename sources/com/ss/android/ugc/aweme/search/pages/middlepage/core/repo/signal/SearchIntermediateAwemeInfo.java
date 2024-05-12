package com.ss.android.ugc.aweme.search.pages.middlepage.core.repo.signal;

import X.InterfaceC65349Pkn;
import X.JBR;
import X.X1D;
import defpackage.s0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes9.dex */
public final class SearchIntermediateAwemeInfo {

    @InterfaceC65349Pkn("channel_id")
    public final String channelId;

    @InterfaceC65349Pkn("video_duration")
    public final Integer duration;

    @InterfaceC65349Pkn("group_id")
    public final String groupId;

    @InterfaceC65349Pkn("browing_time_extra")
    public final long innerPlayTime;

    @InterfaceC65349Pkn("browing_time")
    public final long outerPlayTime;

    @InterfaceC65349Pkn("start_time")
    public final long startPlayTimestamp;

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public SearchIntermediateAwemeInfo() {
        /*
            r12 = this;
            r1 = 0
            r3 = 0
            r10 = 63
            r0 = r12
            r2 = r1
            r5 = r3
            r7 = r3
            r9 = r1
            r11 = r1
            r0.<init>(r1, r2, r3, r5, r7, r9, r10, r11)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.search.pages.middlepage.core.repo.signal.SearchIntermediateAwemeInfo.<init>():void");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SearchIntermediateAwemeInfo)) {
            return false;
        }
        SearchIntermediateAwemeInfo searchIntermediateAwemeInfo = (SearchIntermediateAwemeInfo) obj;
        return o.LJ(this.groupId, searchIntermediateAwemeInfo.groupId) && o.LJ(this.channelId, searchIntermediateAwemeInfo.channelId) && this.startPlayTimestamp == searchIntermediateAwemeInfo.startPlayTimestamp && this.innerPlayTime == searchIntermediateAwemeInfo.innerPlayTime && this.outerPlayTime == searchIntermediateAwemeInfo.outerPlayTime && o.LJ(this.duration, searchIntermediateAwemeInfo.duration);
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2;
        String str = this.groupId;
        int i = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i2 = hashCode * 31;
        String str2 = this.channelId;
        if (str2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str2.hashCode();
        }
        int LIZJ = JBR.LIZJ(this.outerPlayTime, JBR.LIZJ(this.innerPlayTime, JBR.LIZJ(this.startPlayTimestamp, (i2 + hashCode2) * 31, 31), 31), 31);
        Integer num = this.duration;
        if (num != null) {
            i = num.hashCode();
        }
        return LIZJ + i;
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("SearchIntermediateAwemeInfo(groupId=");
        LIZ.append(this.groupId);
        LIZ.append(", channelId=");
        LIZ.append(this.channelId);
        LIZ.append(", startPlayTimestamp=");
        LIZ.append(this.startPlayTimestamp);
        LIZ.append(", innerPlayTime=");
        LIZ.append(this.innerPlayTime);
        LIZ.append(", outerPlayTime=");
        LIZ.append(this.outerPlayTime);
        LIZ.append(", duration=");
        return s0.LIZJ(LIZ, this.duration, ')', LIZ);
    }

    public SearchIntermediateAwemeInfo(String str, String str2, long j, long j2, long j3, Integer num) {
        this.groupId = str;
        this.channelId = str2;
        this.startPlayTimestamp = j;
        this.innerPlayTime = j2;
        this.outerPlayTime = j3;
        this.duration = num;
    }

    public /* synthetic */ SearchIntermediateAwemeInfo(String str, String str2, long j, long j2, long j3, Integer num, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) == 0 ? str2 : "", (i & 4) != 0 ? 0L : j, (i & 8) != 0 ? 0L : j2, (i & 16) == 0 ? j3 : 0L, (i & 32) != 0 ? 0 : num);
    }
}
