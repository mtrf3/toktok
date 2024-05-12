package com.ss.android.ugc.aweme.vision.model;

import X.X1D;
import defpackage.q;
import java.io.Serializable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes9.dex */
public final class PhotoSearchToolsEnterParams implements Serializable {
    public String localFilePath;
    public String searchSource;
    public Long searchTime;

    /* JADX WARN: Multi-variable type inference failed */
    public PhotoSearchToolsEnterParams() {
        this(null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 7, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ PhotoSearchToolsEnterParams copy$default(PhotoSearchToolsEnterParams photoSearchToolsEnterParams, String str, Long l, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = photoSearchToolsEnterParams.localFilePath;
        }
        if ((i & 2) != 0) {
            l = photoSearchToolsEnterParams.searchTime;
        }
        if ((i & 4) != 0) {
            str2 = photoSearchToolsEnterParams.searchSource;
        }
        return photoSearchToolsEnterParams.copy(str, l, str2);
    }

    public final PhotoSearchToolsEnterParams copy(String str, Long l, String str2) {
        return new PhotoSearchToolsEnterParams(str, l, str2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PhotoSearchToolsEnterParams)) {
            return false;
        }
        PhotoSearchToolsEnterParams photoSearchToolsEnterParams = (PhotoSearchToolsEnterParams) obj;
        return o.LJ(this.localFilePath, photoSearchToolsEnterParams.localFilePath) && o.LJ(this.searchTime, photoSearchToolsEnterParams.searchTime) && o.LJ(this.searchSource, photoSearchToolsEnterParams.searchSource);
    }

    public int hashCode() {
        String str = this.localFilePath;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        Long l = this.searchTime;
        int hashCode2 = (hashCode + (l == null ? 0 : l.hashCode())) * 31;
        String str2 = this.searchSource;
        return hashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("PhotoSearchToolsEnterParams(localFilePath=");
        LIZ.append(this.localFilePath);
        LIZ.append(", searchTime=");
        LIZ.append(this.searchTime);
        LIZ.append(", searchSource=");
        return q.LIZIZ(LIZ, this.searchSource, ')', LIZ);
    }

    public final String getLocalFilePath() {
        return this.localFilePath;
    }

    public final String getSearchSource() {
        return this.searchSource;
    }

    public final Long getSearchTime() {
        return this.searchTime;
    }

    public final void setLocalFilePath(String str) {
        this.localFilePath = str;
    }

    public final void setSearchSource(String str) {
        this.searchSource = str;
    }

    public final void setSearchTime(Long l) {
        this.searchTime = l;
    }

    public PhotoSearchToolsEnterParams(String str, Long l, String str2) {
        this.localFilePath = str;
        this.searchTime = l;
        this.searchSource = str2;
    }

    public /* synthetic */ PhotoSearchToolsEnterParams(String str, Long l, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : l, (i & 4) != 0 ? "" : str2);
    }
}
