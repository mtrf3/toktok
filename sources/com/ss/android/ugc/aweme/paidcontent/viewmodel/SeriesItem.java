package com.ss.android.ugc.aweme.paidcontent.viewmodel;

import X.C79062V1e;
import X.HH1;
import X.InterfaceC57784Mm4;
import X.InterfaceC65349Pkn;
import X.X1D;
import com.ss.android.ugc.aweme.model.ManagementPagePaidCollectionStatus;
import com.ss.android.ugc.aweme.profile.model.User;
import defpackage.b0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class SeriesItem implements InterfaceC57784Mm4 {

    @InterfaceC65349Pkn("cover_uri")
    public final String collectionCoverUri;

    @InterfaceC65349Pkn("cover_url")
    public final String collectionCoverUrl;

    @InterfaceC65349Pkn("creator")
    public final User collectionCreator;

    @InterfaceC65349Pkn("description")
    public final String collectionDescription;

    @InterfaceC65349Pkn("collection_id")
    public final String collectionId;

    @InterfaceC65349Pkn("name")
    public final String collectionName;

    @InterfaceC65349Pkn("num_videos")
    public final int numVideos;

    @InterfaceC65349Pkn("status")
    public final ManagementPagePaidCollectionStatus status;

    /* JADX WARN: Multi-variable type inference failed */
    public SeriesItem() {
        this(null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0, 255, 0 == true ? 1 : 0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SeriesItem)) {
            return false;
        }
        SeriesItem seriesItem = (SeriesItem) obj;
        return o.LJ(this.collectionId, seriesItem.collectionId) && o.LJ(this.collectionName, seriesItem.collectionName) && o.LJ(this.collectionDescription, seriesItem.collectionDescription) && o.LJ(this.collectionCoverUri, seriesItem.collectionCoverUri) && o.LJ(this.collectionCoverUrl, seriesItem.collectionCoverUrl) && o.LJ(this.collectionCreator, seriesItem.collectionCreator) && this.status == seriesItem.status && this.numVideos == seriesItem.numVideos;
    }

    @Override // X.InterfaceC57784Mm4
    public final Object getChangePayload(InterfaceC57784Mm4 interfaceC57784Mm4) {
        return null;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int LJ = C79062V1e.LJ(this.collectionDescription, C79062V1e.LJ(this.collectionName, this.collectionId.hashCode() * 31, 31), 31);
        String str = this.collectionCoverUri;
        int i = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i2 = (LJ + hashCode) * 31;
        String str2 = this.collectionCoverUrl;
        if (str2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str2.hashCode();
        }
        int i3 = (i2 + hashCode2) * 31;
        User user = this.collectionCreator;
        if (user == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = user.hashCode();
        }
        int i4 = (i3 + hashCode3) * 31;
        ManagementPagePaidCollectionStatus managementPagePaidCollectionStatus = this.status;
        if (managementPagePaidCollectionStatus != null) {
            i = managementPagePaidCollectionStatus.hashCode();
        }
        return ((i4 + i) * 31) + this.numVideos;
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("SeriesItem(collectionId=");
        LIZ.append(this.collectionId);
        LIZ.append(", collectionName=");
        LIZ.append(this.collectionName);
        LIZ.append(", collectionDescription=");
        LIZ.append(this.collectionDescription);
        LIZ.append(", collectionCoverUri=");
        LIZ.append(this.collectionCoverUri);
        LIZ.append(", collectionCoverUrl=");
        LIZ.append(this.collectionCoverUrl);
        LIZ.append(", collectionCreator=");
        LIZ.append(this.collectionCreator);
        LIZ.append(", status=");
        LIZ.append(this.status);
        LIZ.append(", numVideos=");
        return b0.LIZJ(LIZ, this.numVideos, ')', LIZ);
    }

    @Override // X.InterfaceC57784Mm4
    public final boolean areContentsTheSame(InterfaceC57784Mm4 interfaceC57784Mm4) {
        return o.LJ(interfaceC57784Mm4, this);
    }

    @Override // X.InterfaceC57784Mm4
    public final boolean areItemTheSame(InterfaceC57784Mm4 interfaceC57784Mm4) {
        return o.LJ(interfaceC57784Mm4, this);
    }

    public SeriesItem(String str, String str2, String str3, String str4, String str5, User user, ManagementPagePaidCollectionStatus managementPagePaidCollectionStatus, int i) {
        HH1.LIZ(str, "collectionId", str2, "collectionName", str3, "collectionDescription");
        this.collectionId = str;
        this.collectionName = str2;
        this.collectionDescription = str3;
        this.collectionCoverUri = str4;
        this.collectionCoverUrl = str5;
        this.collectionCreator = user;
        this.status = managementPagePaidCollectionStatus;
        this.numVideos = i;
    }

    public /* synthetic */ SeriesItem(String str, String str2, String str3, String str4, String str5, User user, ManagementPagePaidCollectionStatus managementPagePaidCollectionStatus, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? "" : str, (i2 & 2) != 0 ? "" : str2, (i2 & 4) == 0 ? str3 : "", (i2 & 8) != 0 ? null : str4, (i2 & 16) != 0 ? null : str5, (i2 & 32) != 0 ? null : user, (i2 & 64) == 0 ? managementPagePaidCollectionStatus : null, (i2 & 128) != 0 ? 0 : i);
    }
}
