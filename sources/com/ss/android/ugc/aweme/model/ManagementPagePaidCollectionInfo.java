package com.ss.android.ugc.aweme.model;

import X.InterfaceC65349Pkn;
import X.JBR;
import X.X1D;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class ManagementPagePaidCollectionInfo {

    @InterfaceC65349Pkn("collection_id")
    public final String collectionId;

    @InterfaceC65349Pkn("cover_uri")
    public final String coverUri;

    @InterfaceC65349Pkn("cover_url")
    public final String coverUrl;

    @InterfaceC65349Pkn("description")
    public final String description;

    @InterfaceC65349Pkn("discount_amount_in_usd")
    public final String discountAmountInUsd;

    @InterfaceC65349Pkn("name")
    public final String name;

    @InterfaceC65349Pkn("num_videos")
    public final int numVideos;

    @InterfaceC65349Pkn("price_in_usd")
    public final String priceInUsd;

    @InterfaceC65349Pkn("status")
    public final ManagementPagePaidCollectionStatus status;

    @InterfaceC65349Pkn("total_duration")
    public final long totalDuration;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ManagementPagePaidCollectionInfo)) {
            return false;
        }
        ManagementPagePaidCollectionInfo managementPagePaidCollectionInfo = (ManagementPagePaidCollectionInfo) obj;
        return o.LJ(this.collectionId, managementPagePaidCollectionInfo.collectionId) && o.LJ(this.name, managementPagePaidCollectionInfo.name) && o.LJ(this.description, managementPagePaidCollectionInfo.description) && o.LJ(this.coverUrl, managementPagePaidCollectionInfo.coverUrl) && o.LJ(this.coverUri, managementPagePaidCollectionInfo.coverUri) && o.LJ(this.priceInUsd, managementPagePaidCollectionInfo.priceInUsd) && o.LJ(this.discountAmountInUsd, managementPagePaidCollectionInfo.discountAmountInUsd) && this.numVideos == managementPagePaidCollectionInfo.numVideos && this.totalDuration == managementPagePaidCollectionInfo.totalDuration && this.status == managementPagePaidCollectionInfo.status;
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("ManagementPagePaidCollectionInfo(collectionId=");
        LIZ.append(this.collectionId);
        LIZ.append(", name=");
        LIZ.append(this.name);
        LIZ.append(", description=");
        LIZ.append(this.description);
        LIZ.append(", coverUrl=");
        LIZ.append(this.coverUrl);
        LIZ.append(", coverUri=");
        LIZ.append(this.coverUri);
        LIZ.append(", priceInUsd=");
        LIZ.append(this.priceInUsd);
        LIZ.append(", discountAmountInUsd=");
        LIZ.append(this.discountAmountInUsd);
        LIZ.append(", numVideos=");
        LIZ.append(this.numVideos);
        LIZ.append(", totalDuration=");
        LIZ.append(this.totalDuration);
        LIZ.append(", status=");
        LIZ.append(this.status);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int hashCode4;
        int hashCode5;
        int hashCode6 = this.collectionId.hashCode() * 31;
        String str = this.name;
        int i = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i2 = (hashCode6 + hashCode) * 31;
        String str2 = this.description;
        if (str2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str2.hashCode();
        }
        int i3 = (i2 + hashCode2) * 31;
        String str3 = this.coverUrl;
        if (str3 == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = str3.hashCode();
        }
        int i4 = (i3 + hashCode3) * 31;
        String str4 = this.coverUri;
        if (str4 == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = str4.hashCode();
        }
        int i5 = (i4 + hashCode4) * 31;
        String str5 = this.priceInUsd;
        if (str5 == null) {
            hashCode5 = 0;
        } else {
            hashCode5 = str5.hashCode();
        }
        int i6 = (i5 + hashCode5) * 31;
        String str6 = this.discountAmountInUsd;
        if (str6 != null) {
            i = str6.hashCode();
        }
        return this.status.hashCode() + JBR.LIZJ(this.totalDuration, (((i6 + i) * 31) + this.numVideos) * 31, 31);
    }

    public ManagementPagePaidCollectionInfo(String collectionId, String str, String str2, String str3, String str4, String str5, String str6, int i, long j, ManagementPagePaidCollectionStatus status) {
        o.LJIIIZ(collectionId, "collectionId");
        o.LJIIIZ(status, "status");
        this.collectionId = collectionId;
        this.name = str;
        this.description = str2;
        this.coverUrl = str3;
        this.coverUri = str4;
        this.priceInUsd = str5;
        this.discountAmountInUsd = str6;
        this.numVideos = i;
        this.totalDuration = j;
        this.status = status;
    }

    public /* synthetic */ ManagementPagePaidCollectionInfo(String str, String str2, String str3, String str4, String str5, String str6, String str7, int i, long j, ManagementPagePaidCollectionStatus managementPagePaidCollectionStatus, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? "" : str, (i2 & 2) != 0 ? null : str2, (i2 & 4) != 0 ? null : str3, (i2 & 8) != 0 ? null : str4, (i2 & 16) != 0 ? null : str5, (i2 & 32) != 0 ? null : str6, (i2 & 64) == 0 ? str7 : null, (i2 & 128) != 0 ? 0 : i, (i2 & 256) != 0 ? 0L : j, managementPagePaidCollectionStatus);
    }
}
