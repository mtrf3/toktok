package com.ss.android.ugc.aweme.vision.repo;

import X.InterfaceC65349Pkn;
import X.X1D;
import com.google.gson.m;
import com.ss.android.ugc.aweme.vision.RDPhotoSearchTraceTime;
import defpackage.q;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes9.dex */
public final class PhotoSearchResponse {
    public PhotoSearchImageResponse LIZ;
    public String LIZIZ;

    @InterfaceC65349Pkn("searchResData")
    public m photoSearchResponse;

    @InterfaceC65349Pkn("techLogParams")
    public RDPhotoSearchTraceTime techLogParams;

    /* JADX WARN: Multi-variable type inference failed */
    public PhotoSearchResponse() {
        this(null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 15, 0 == true ? 1 : 0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PhotoSearchResponse)) {
            return false;
        }
        PhotoSearchResponse photoSearchResponse = (PhotoSearchResponse) obj;
        return o.LJ(this.photoSearchResponse, photoSearchResponse.photoSearchResponse) && o.LJ(this.LIZ, photoSearchResponse.LIZ) && o.LJ(this.techLogParams, photoSearchResponse.techLogParams) && o.LJ(this.LIZIZ, photoSearchResponse.LIZIZ);
    }

    public final int hashCode() {
        m mVar = this.photoSearchResponse;
        int hashCode = (mVar == null ? 0 : mVar.hashCode()) * 31;
        PhotoSearchImageResponse photoSearchImageResponse = this.LIZ;
        int hashCode2 = (hashCode + (photoSearchImageResponse == null ? 0 : photoSearchImageResponse.hashCode())) * 31;
        RDPhotoSearchTraceTime rDPhotoSearchTraceTime = this.techLogParams;
        int hashCode3 = (hashCode2 + (rDPhotoSearchTraceTime == null ? 0 : rDPhotoSearchTraceTime.hashCode())) * 31;
        String str = this.LIZIZ;
        return hashCode3 + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("PhotoSearchResponse(photoSearchResponse=");
        LIZ.append(this.photoSearchResponse);
        LIZ.append(", imageInfo=");
        LIZ.append(this.LIZ);
        LIZ.append(", techLogParams=");
        LIZ.append(this.techLogParams);
        LIZ.append(", lynxString=");
        return q.LIZIZ(LIZ, this.LIZIZ, ')', LIZ);
    }

    public PhotoSearchResponse(m mVar, PhotoSearchImageResponse photoSearchImageResponse, RDPhotoSearchTraceTime rDPhotoSearchTraceTime, String str) {
        this.photoSearchResponse = mVar;
        this.LIZ = photoSearchImageResponse;
        this.techLogParams = rDPhotoSearchTraceTime;
        this.LIZIZ = str;
    }

    public /* synthetic */ PhotoSearchResponse(m mVar, PhotoSearchImageResponse photoSearchImageResponse, RDPhotoSearchTraceTime rDPhotoSearchTraceTime, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : mVar, (i & 2) != 0 ? null : photoSearchImageResponse, (i & 4) != 0 ? null : rDPhotoSearchTraceTime, (i & 8) != 0 ? null : str);
    }
}
