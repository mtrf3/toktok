package com.ss.android.ugc.aweme.service;

import X.InterfaceC65349Pkn;
import X.X1D;
import defpackage.q;
import java.util.ArrayList;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public final class Response {
    public final String LIZ;

    @InterfaceC65349Pkn("friend_feed_data")
    public ArrayList<String> friendFeedData;

    @InterfaceC65349Pkn("has_more")
    public final boolean hasMore;

    @InterfaceC65349Pkn("last_view_item_id")
    public final String lastViewItemId;

    @InterfaceC65349Pkn("page_token")
    public final String pageToken;

    @InterfaceC65349Pkn("preload")
    public final int preload;

    @InterfaceC65349Pkn("source")
    public final int source;

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public Response() {
        /*
            r10 = this;
            r1 = 0
            r3 = 0
            r8 = 127(0x7f, float:1.78E-43)
            r0 = r10
            r2 = r1
            r4 = r3
            r5 = r3
            r6 = r1
            r7 = r3
            r9 = r3
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.service.Response.<init>():void");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Response)) {
            return false;
        }
        Response response = (Response) obj;
        return this.source == response.source && this.hasMore == response.hasMore && o.LJ(this.friendFeedData, response.friendFeedData) && o.LJ(this.lastViewItemId, response.lastViewItemId) && o.LJ(this.pageToken, response.pageToken) && this.preload == response.preload && o.LJ(this.LIZ, response.LIZ);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        int i = this.source * 31;
        boolean z = this.hasMore;
        int i2 = z;
        if (z != 0) {
            i2 = 1;
        }
        int i3 = (i + i2) * 31;
        ArrayList<String> arrayList = this.friendFeedData;
        int hashCode = (i3 + (arrayList == null ? 0 : arrayList.hashCode())) * 31;
        String str = this.lastViewItemId;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.pageToken;
        int hashCode3 = (((hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31) + this.preload) * 31;
        String str3 = this.LIZ;
        return hashCode3 + (str3 != null ? str3.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("Response(source=");
        LIZ.append(this.source);
        LIZ.append(", hasMore=");
        LIZ.append(this.hasMore);
        LIZ.append(", friendFeedData=");
        LIZ.append(this.friendFeedData);
        LIZ.append(", lastViewItemId=");
        LIZ.append(this.lastViewItemId);
        LIZ.append(", pageToken=");
        LIZ.append(this.pageToken);
        LIZ.append(", preload=");
        LIZ.append(this.preload);
        LIZ.append(", requestId=");
        return q.LIZIZ(LIZ, this.LIZ, ')', LIZ);
    }

    public Response(int i, boolean z, ArrayList<String> arrayList, String str, String str2, int i2, String str3) {
        this.source = i;
        this.hasMore = z;
        this.friendFeedData = arrayList;
        this.lastViewItemId = str;
        this.pageToken = str2;
        this.preload = i2;
        this.LIZ = str3;
    }

    public /* synthetic */ Response(int i, boolean z, ArrayList arrayList, String str, String str2, int i2, String str3, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 & 1) != 0 ? 0 : i, (i3 & 2) != 0 ? false : z, (i3 & 4) != 0 ? null : arrayList, (i3 & 8) != 0 ? "" : str, (i3 & 16) != 0 ? "" : str2, (i3 & 32) == 0 ? i2 : 0, (i3 & 64) == 0 ? str3 : "");
    }
}
