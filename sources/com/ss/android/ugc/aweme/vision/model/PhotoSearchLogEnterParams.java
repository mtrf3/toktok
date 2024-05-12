package com.ss.android.ugc.aweme.vision.model;

import X.X1D;
import defpackage.q;
import java.io.Serializable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes9.dex */
public final class PhotoSearchLogEnterParams implements Serializable {
    public String currentPage;
    public String photoSearchTypeDetail;
    public String searchEntrance;
    public String searchType;

    /* JADX WARN: Multi-variable type inference failed */
    public PhotoSearchLogEnterParams() {
        this(null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 15, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ PhotoSearchLogEnterParams copy$default(PhotoSearchLogEnterParams photoSearchLogEnterParams, String str, String str2, String str3, String str4, int i, Object obj) {
        if ((i & 1) != 0) {
            str = photoSearchLogEnterParams.searchEntrance;
        }
        if ((i & 2) != 0) {
            str2 = photoSearchLogEnterParams.currentPage;
        }
        if ((i & 4) != 0) {
            str3 = photoSearchLogEnterParams.searchType;
        }
        if ((i & 8) != 0) {
            str4 = photoSearchLogEnterParams.photoSearchTypeDetail;
        }
        return photoSearchLogEnterParams.copy(str, str2, str3, str4);
    }

    public final PhotoSearchLogEnterParams copy(String str, String str2, String str3, String str4) {
        return new PhotoSearchLogEnterParams(str, str2, str3, str4);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PhotoSearchLogEnterParams)) {
            return false;
        }
        PhotoSearchLogEnterParams photoSearchLogEnterParams = (PhotoSearchLogEnterParams) obj;
        return o.LJ(this.searchEntrance, photoSearchLogEnterParams.searchEntrance) && o.LJ(this.currentPage, photoSearchLogEnterParams.currentPage) && o.LJ(this.searchType, photoSearchLogEnterParams.searchType) && o.LJ(this.photoSearchTypeDetail, photoSearchLogEnterParams.photoSearchTypeDetail);
    }

    public int hashCode() {
        String str = this.searchEntrance;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.currentPage;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.searchType;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.photoSearchTypeDetail;
        return hashCode3 + (str4 != null ? str4.hashCode() : 0);
    }

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("PhotoSearchLogEnterParams(searchEntrance=");
        LIZ.append(this.searchEntrance);
        LIZ.append(", currentPage=");
        LIZ.append(this.currentPage);
        LIZ.append(", searchType=");
        LIZ.append(this.searchType);
        LIZ.append(", photoSearchTypeDetail=");
        return q.LIZIZ(LIZ, this.photoSearchTypeDetail, ')', LIZ);
    }

    public final String getCurrentPage() {
        return this.currentPage;
    }

    public final String getPhotoSearchTypeDetail() {
        return this.photoSearchTypeDetail;
    }

    public final String getSearchEntrance() {
        return this.searchEntrance;
    }

    public final String getSearchType() {
        return this.searchType;
    }

    public final void setCurrentPage(String str) {
        this.currentPage = str;
    }

    public final void setPhotoSearchTypeDetail(String str) {
        this.photoSearchTypeDetail = str;
    }

    public final void setSearchEntrance(String str) {
        this.searchEntrance = str;
    }

    public final void setSearchType(String str) {
        this.searchType = str;
    }

    public PhotoSearchLogEnterParams(String str, String str2, String str3, String str4) {
        this.searchEntrance = str;
        this.currentPage = str2;
        this.searchType = str3;
        this.photoSearchTypeDetail = str4;
    }

    public /* synthetic */ PhotoSearchLogEnterParams(String str, String str2, String str3, String str4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4);
    }
}
