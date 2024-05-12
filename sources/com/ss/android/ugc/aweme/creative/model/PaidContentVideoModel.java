package com.ss.android.ugc.aweme.creative.model;

import X.HBE;
import X.InterfaceC65349Pkn;
import android.os.Parcel;
import android.os.Parcelable;
import java.io.Serializable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class PaidContentVideoModel implements Parcelable, Serializable {
    public static final Parcelable.Creator<PaidContentVideoModel> CREATOR = new HBE();

    @InterfaceC65349Pkn("collection_cover_url")
    public String collectionCoverUrl;

    @InterfaceC65349Pkn("paid_collection_id")
    public String collectionId;

    @InterfaceC65349Pkn("collection_name")
    public String collectionName;

    @InterfaceC65349Pkn("entry_point")
    public String entryPoint;

    @InterfaceC65349Pkn("publish_id")
    public final String publishId;

    /* JADX WARN: Multi-variable type inference failed */
    public PaidContentVideoModel() {
        this(null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 31, 0 == true ? 1 : 0);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i) {
        o.LJIIIZ(out, "out");
        out.writeString(this.collectionId);
        out.writeString(this.publishId);
        out.writeString(this.collectionCoverUrl);
        out.writeString(this.collectionName);
        out.writeString(this.entryPoint);
    }

    public final String getCollectionCoverUrl() {
        return this.collectionCoverUrl;
    }

    public final String getCollectionId() {
        return this.collectionId;
    }

    public final String getCollectionName() {
        return this.collectionName;
    }

    public final String getEntryPoint() {
        return this.entryPoint;
    }

    public final String getPublishId() {
        return this.publishId;
    }

    public final void setCollectionCoverUrl(String str) {
        o.LJIIIZ(str, "<set-?>");
        this.collectionCoverUrl = str;
    }

    public final void setCollectionId(String str) {
        o.LJIIIZ(str, "<set-?>");
        this.collectionId = str;
    }

    public final void setCollectionName(String str) {
        o.LJIIIZ(str, "<set-?>");
        this.collectionName = str;
    }

    public final void setEntryPoint(String str) {
        o.LJIIIZ(str, "<set-?>");
        this.entryPoint = str;
    }

    public PaidContentVideoModel(String collectionId, String publishId, String collectionCoverUrl, String collectionName, String entryPoint) {
        o.LJIIIZ(collectionId, "collectionId");
        o.LJIIIZ(publishId, "publishId");
        o.LJIIIZ(collectionCoverUrl, "collectionCoverUrl");
        o.LJIIIZ(collectionName, "collectionName");
        o.LJIIIZ(entryPoint, "entryPoint");
        this.collectionId = collectionId;
        this.publishId = publishId;
        this.collectionCoverUrl = collectionCoverUrl;
        this.collectionName = collectionName;
        this.entryPoint = entryPoint;
    }

    public /* synthetic */ PaidContentVideoModel(String str, String str2, String str3, String str4, String str5, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? "" : str4, (i & 16) == 0 ? str5 : "");
    }
}
