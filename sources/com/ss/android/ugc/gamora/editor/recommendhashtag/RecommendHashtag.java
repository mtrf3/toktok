package com.ss.android.ugc.gamora.editor.recommendhashtag;

import X.C42312Gj6;
import X.C43588H8u;
import X.InterfaceC65349Pkn;
import android.os.Parcel;
import android.os.Parcelable;
import java.io.Serializable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class RecommendHashtag implements Parcelable, Serializable {
    public static final Parcelable.Creator<RecommendHashtag> CREATOR = new C42312Gj6();

    @InterfaceC65349Pkn("cha_name")
    public final String challengeName;

    @InterfaceC65349Pkn("cid")
    public final String cid;

    @InterfaceC65349Pkn("log_id")
    public String logId;

    @InterfaceC65349Pkn("query_id")
    public final String queryId;

    @InterfaceC65349Pkn("view_count")
    public final long viewCount;

    /* JADX WARN: Multi-variable type inference failed */
    public RecommendHashtag() {
        this(null, 0L, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 31, 0 == true ? 1 : 0);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i) {
        o.LJIIIZ(out, "out");
        out.writeString(this.challengeName);
        out.writeLong(this.viewCount);
        out.writeString(this.cid);
        out.writeString(this.queryId);
        out.writeString(this.logId);
    }

    public final String getChallengeName() {
        return this.challengeName;
    }

    public final String getCid() {
        return this.cid;
    }

    public final String getLogId() {
        return this.logId;
    }

    public final String getQueryId() {
        return this.queryId;
    }

    public final long getViewCount() {
        return this.viewCount;
    }

    public final void setLogId(String str) {
        o.LJIIIZ(str, "<set-?>");
        this.logId = str;
    }

    public RecommendHashtag(String str, long j, String str2, String str3, String str4) {
        C43588H8u.LIZLLL(str, "challengeName", str2, "cid", str3, "queryId", str4, "logId");
        this.challengeName = str;
        this.viewCount = j;
        this.cid = str2;
        this.queryId = str3;
        this.logId = str4;
    }

    public /* synthetic */ RecommendHashtag(String str, long j, String str2, String str3, String str4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? -1L : j, (i & 4) != 0 ? "" : str2, (i & 8) != 0 ? "" : str3, (i & 16) == 0 ? str4 : "");
    }
}
