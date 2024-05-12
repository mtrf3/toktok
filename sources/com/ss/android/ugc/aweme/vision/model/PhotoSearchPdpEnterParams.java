package com.ss.android.ugc.aweme.vision.model;

import X.X1D;
import defpackage.s0;
import java.io.Serializable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes9.dex */
public final class PhotoSearchPdpEnterParams implements Serializable {
    public String enterProductId;
    public String pageName;
    public String rawPhotoSource;
    public Integer screenHeight;
    public String searchEntrance;
    public String trackId;

    /* JADX WARN: Multi-variable type inference failed */
    public PhotoSearchPdpEnterParams() {
        this(null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 63, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ PhotoSearchPdpEnterParams copy$default(PhotoSearchPdpEnterParams photoSearchPdpEnterParams, String str, String str2, String str3, String str4, String str5, Integer num, int i, Object obj) {
        if ((i & 1) != 0) {
            str = photoSearchPdpEnterParams.searchEntrance;
        }
        if ((i & 2) != 0) {
            str2 = photoSearchPdpEnterParams.pageName;
        }
        if ((i & 4) != 0) {
            str3 = photoSearchPdpEnterParams.rawPhotoSource;
        }
        if ((i & 8) != 0) {
            str4 = photoSearchPdpEnterParams.enterProductId;
        }
        if ((i & 16) != 0) {
            str5 = photoSearchPdpEnterParams.trackId;
        }
        if ((i & 32) != 0) {
            num = photoSearchPdpEnterParams.screenHeight;
        }
        return photoSearchPdpEnterParams.copy(str, str2, str3, str4, str5, num);
    }

    public final PhotoSearchPdpEnterParams copy(String str, String str2, String str3, String str4, String str5, Integer num) {
        return new PhotoSearchPdpEnterParams(str, str2, str3, str4, str5, num);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PhotoSearchPdpEnterParams)) {
            return false;
        }
        PhotoSearchPdpEnterParams photoSearchPdpEnterParams = (PhotoSearchPdpEnterParams) obj;
        return o.LJ(this.searchEntrance, photoSearchPdpEnterParams.searchEntrance) && o.LJ(this.pageName, photoSearchPdpEnterParams.pageName) && o.LJ(this.rawPhotoSource, photoSearchPdpEnterParams.rawPhotoSource) && o.LJ(this.enterProductId, photoSearchPdpEnterParams.enterProductId) && o.LJ(this.trackId, photoSearchPdpEnterParams.trackId) && o.LJ(this.screenHeight, photoSearchPdpEnterParams.screenHeight);
    }

    public int hashCode() {
        String str = this.searchEntrance;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.pageName;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.rawPhotoSource;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.enterProductId;
        int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.trackId;
        int hashCode5 = (hashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        Integer num = this.screenHeight;
        return hashCode5 + (num != null ? num.hashCode() : 0);
    }

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("PhotoSearchPdpEnterParams(searchEntrance=");
        LIZ.append(this.searchEntrance);
        LIZ.append(", pageName=");
        LIZ.append(this.pageName);
        LIZ.append(", rawPhotoSource=");
        LIZ.append(this.rawPhotoSource);
        LIZ.append(", enterProductId=");
        LIZ.append(this.enterProductId);
        LIZ.append(", trackId=");
        LIZ.append(this.trackId);
        LIZ.append(", screenHeight=");
        return s0.LIZJ(LIZ, this.screenHeight, ')', LIZ);
    }

    public final String getEnterProductId() {
        return this.enterProductId;
    }

    public final String getPageName() {
        return this.pageName;
    }

    public final String getRawPhotoSource() {
        return this.rawPhotoSource;
    }

    public final Integer getScreenHeight() {
        return this.screenHeight;
    }

    public final String getSearchEntrance() {
        return this.searchEntrance;
    }

    public final String getTrackId() {
        return this.trackId;
    }

    public final void setEnterProductId(String str) {
        this.enterProductId = str;
    }

    public final void setPageName(String str) {
        this.pageName = str;
    }

    public final void setRawPhotoSource(String str) {
        this.rawPhotoSource = str;
    }

    public final void setScreenHeight(Integer num) {
        this.screenHeight = num;
    }

    public final void setSearchEntrance(String str) {
        this.searchEntrance = str;
    }

    public final void setTrackId(String str) {
        this.trackId = str;
    }

    public PhotoSearchPdpEnterParams(String str, String str2, String str3, String str4, String str5, Integer num) {
        this.searchEntrance = str;
        this.pageName = str2;
        this.rawPhotoSource = str3;
        this.enterProductId = str4;
        this.trackId = str5;
        this.screenHeight = num;
    }

    public /* synthetic */ PhotoSearchPdpEnterParams(String str, String str2, String str3, String str4, String str5, Integer num, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? null : str5, (i & 32) == 0 ? num : null);
    }
}
