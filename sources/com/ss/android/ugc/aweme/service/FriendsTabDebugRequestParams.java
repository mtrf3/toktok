package com.ss.android.ugc.aweme.service;

import X.InterfaceC65349Pkn;
import X.X1D;
import defpackage.q;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class FriendsTabDebugRequestParams {

    @InterfaceC65349Pkn("client_read_gids")
    public final List<String> clientReadGids;

    @InterfaceC65349Pkn("client_read_gids_notification")
    public final List<String> clientReadGidsNotification;

    @InterfaceC65349Pkn("client_unread_gids")
    public final String clientUnreadGids;

    @InterfaceC65349Pkn("page_token")
    public final String pageToken;

    @InterfaceC65349Pkn("pull_type")
    public final int pullType;

    @InterfaceC65349Pkn("source")
    public final int source;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FriendsTabDebugRequestParams)) {
            return false;
        }
        FriendsTabDebugRequestParams friendsTabDebugRequestParams = (FriendsTabDebugRequestParams) obj;
        return o.LJ(this.pageToken, friendsTabDebugRequestParams.pageToken) && this.source == friendsTabDebugRequestParams.source && this.pullType == friendsTabDebugRequestParams.pullType && o.LJ(this.clientReadGids, friendsTabDebugRequestParams.clientReadGids) && o.LJ(this.clientReadGidsNotification, friendsTabDebugRequestParams.clientReadGidsNotification) && o.LJ(this.clientUnreadGids, friendsTabDebugRequestParams.clientUnreadGids);
    }

    public final int hashCode() {
        String str = this.pageToken;
        int hashCode = (((((str == null ? 0 : str.hashCode()) * 31) + this.source) * 31) + this.pullType) * 31;
        List<String> list = this.clientReadGids;
        int hashCode2 = (hashCode + (list == null ? 0 : list.hashCode())) * 31;
        List<String> list2 = this.clientReadGidsNotification;
        int hashCode3 = (hashCode2 + (list2 == null ? 0 : list2.hashCode())) * 31;
        String str2 = this.clientUnreadGids;
        return hashCode3 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("FriendsTabDebugRequestParams(pageToken=");
        LIZ.append(this.pageToken);
        LIZ.append(", source=");
        LIZ.append(this.source);
        LIZ.append(", pullType=");
        LIZ.append(this.pullType);
        LIZ.append(", clientReadGids=");
        LIZ.append(this.clientReadGids);
        LIZ.append(", clientReadGidsNotification=");
        LIZ.append(this.clientReadGidsNotification);
        LIZ.append(", clientUnreadGids=");
        return q.LIZIZ(LIZ, this.clientUnreadGids, ')', LIZ);
    }

    public FriendsTabDebugRequestParams(String str, int i, int i2, List<String> list, List<String> list2, String str2) {
        this.pageToken = str;
        this.source = i;
        this.pullType = i2;
        this.clientReadGids = list;
        this.clientReadGidsNotification = list2;
        this.clientUnreadGids = str2;
    }

    public /* synthetic */ FriendsTabDebugRequestParams(String str, int i, int i2, List list, List list2, String str2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i3 & 2) != 0 ? 0 : i, i2, list, list2, (i3 & 32) != 0 ? "" : str2);
    }
}
