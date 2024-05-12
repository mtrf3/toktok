package com.ss.android.ugc.aweme.shortvideo.model;

import X.X1D;
import defpackage.q;
import kotlin.jvm.internal.o;

/* loaded from: classes3.dex */
public final class ShortVideoCommonParams {
    public final String contentSource;
    public final String contentType;
    public final String creationId;
    public final String shootWay;

    public static /* synthetic */ ShortVideoCommonParams copy$default(ShortVideoCommonParams shortVideoCommonParams, String str, String str2, String str3, String str4, int i, Object obj) {
        if ((i & 1) != 0) {
            str = shortVideoCommonParams.shootWay;
        }
        if ((i & 2) != 0) {
            str2 = shortVideoCommonParams.contentSource;
        }
        if ((i & 4) != 0) {
            str3 = shortVideoCommonParams.contentType;
        }
        if ((i & 8) != 0) {
            str4 = shortVideoCommonParams.creationId;
        }
        return shortVideoCommonParams.copy(str, str2, str3, str4);
    }

    public final ShortVideoCommonParams copy(String str, String str2, String str3, String str4) {
        return new ShortVideoCommonParams(str, str2, str3, str4);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ShortVideoCommonParams)) {
            return false;
        }
        ShortVideoCommonParams shortVideoCommonParams = (ShortVideoCommonParams) obj;
        return o.LJ(this.shootWay, shortVideoCommonParams.shootWay) && o.LJ(this.contentSource, shortVideoCommonParams.contentSource) && o.LJ(this.contentType, shortVideoCommonParams.contentType) && o.LJ(this.creationId, shortVideoCommonParams.creationId);
    }

    public int hashCode() {
        String str = this.shootWay;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.contentSource;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.contentType;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.creationId;
        return hashCode3 + (str4 != null ? str4.hashCode() : 0);
    }

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("ShortVideoCommonParams(shootWay=");
        LIZ.append(this.shootWay);
        LIZ.append(", contentSource=");
        LIZ.append(this.contentSource);
        LIZ.append(", contentType=");
        LIZ.append(this.contentType);
        LIZ.append(", creationId=");
        return q.LIZIZ(LIZ, this.creationId, ')', LIZ);
    }

    public ShortVideoCommonParams(String str, String str2, String str3, String str4) {
        this.shootWay = str;
        this.contentSource = str2;
        this.contentType = str3;
        this.creationId = str4;
    }
}
