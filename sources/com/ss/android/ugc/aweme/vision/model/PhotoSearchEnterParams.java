package com.ss.android.ugc.aweme.vision.model;

import X.C37250Eje;
import X.X1D;
import android.net.Uri;
import com.bytedance.mt.protector.impl.UriProtector;
import java.io.Serializable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes9.dex */
public final class PhotoSearchEnterParams implements Serializable {
    public PhotoSearchBusinessEnterParams businessParams;
    public PhotoSearchLogEnterParams logParams;
    public PhotoSearchPdpEnterParams pdpParams;
    public PhotoSearchToolsEnterParams toolsParams;

    /* JADX WARN: Multi-variable type inference failed */
    public PhotoSearchEnterParams() {
        this(null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 15, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ PhotoSearchEnterParams copy$default(PhotoSearchEnterParams photoSearchEnterParams, PhotoSearchBusinessEnterParams photoSearchBusinessEnterParams, PhotoSearchLogEnterParams photoSearchLogEnterParams, PhotoSearchToolsEnterParams photoSearchToolsEnterParams, PhotoSearchPdpEnterParams photoSearchPdpEnterParams, int i, Object obj) {
        if ((i & 1) != 0) {
            photoSearchBusinessEnterParams = photoSearchEnterParams.businessParams;
        }
        if ((i & 2) != 0) {
            photoSearchLogEnterParams = photoSearchEnterParams.logParams;
        }
        if ((i & 4) != 0) {
            photoSearchToolsEnterParams = photoSearchEnterParams.toolsParams;
        }
        if ((i & 8) != 0) {
            photoSearchPdpEnterParams = photoSearchEnterParams.pdpParams;
        }
        return photoSearchEnterParams.copy(photoSearchBusinessEnterParams, photoSearchLogEnterParams, photoSearchToolsEnterParams, photoSearchPdpEnterParams);
    }

    public final PhotoSearchEnterParams copy(PhotoSearchBusinessEnterParams photoSearchBusinessEnterParams, PhotoSearchLogEnterParams photoSearchLogEnterParams, PhotoSearchToolsEnterParams photoSearchToolsEnterParams, PhotoSearchPdpEnterParams photoSearchPdpEnterParams) {
        return new PhotoSearchEnterParams(photoSearchBusinessEnterParams, photoSearchLogEnterParams, photoSearchToolsEnterParams, photoSearchPdpEnterParams);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PhotoSearchEnterParams)) {
            return false;
        }
        PhotoSearchEnterParams photoSearchEnterParams = (PhotoSearchEnterParams) obj;
        return o.LJ(this.businessParams, photoSearchEnterParams.businessParams) && o.LJ(this.logParams, photoSearchEnterParams.logParams) && o.LJ(this.toolsParams, photoSearchEnterParams.toolsParams) && o.LJ(this.pdpParams, photoSearchEnterParams.pdpParams);
    }

    public int hashCode() {
        PhotoSearchBusinessEnterParams photoSearchBusinessEnterParams = this.businessParams;
        int hashCode = (photoSearchBusinessEnterParams == null ? 0 : photoSearchBusinessEnterParams.hashCode()) * 31;
        PhotoSearchLogEnterParams photoSearchLogEnterParams = this.logParams;
        int hashCode2 = (hashCode + (photoSearchLogEnterParams == null ? 0 : photoSearchLogEnterParams.hashCode())) * 31;
        PhotoSearchToolsEnterParams photoSearchToolsEnterParams = this.toolsParams;
        int hashCode3 = (hashCode2 + (photoSearchToolsEnterParams == null ? 0 : photoSearchToolsEnterParams.hashCode())) * 31;
        PhotoSearchPdpEnterParams photoSearchPdpEnterParams = this.pdpParams;
        return hashCode3 + (photoSearchPdpEnterParams != null ? photoSearchPdpEnterParams.hashCode() : 0);
    }

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("PhotoSearchEnterParams(businessParams=");
        LIZ.append(this.businessParams);
        LIZ.append(", logParams=");
        LIZ.append(this.logParams);
        LIZ.append(", toolsParams=");
        LIZ.append(this.toolsParams);
        LIZ.append(", pdpParams=");
        LIZ.append(this.pdpParams);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    public final Uri getLocalPathUri() {
        String str;
        PhotoSearchToolsEnterParams photoSearchToolsEnterParams = this.toolsParams;
        if (photoSearchToolsEnterParams == null || (str = photoSearchToolsEnterParams.getLocalFilePath()) == null) {
            str = "";
        }
        Uri parse = UriProtector.parse(C37250Eje.LIZ(str));
        o.LJIIIIZZ(parse, "parse(PhotoSearchLocalIm…ms?.localFilePath ?: \"\"))");
        return parse;
    }

    public final PhotoSearchBusinessEnterParams getBusinessParams() {
        return this.businessParams;
    }

    public final PhotoSearchLogEnterParams getLogParams() {
        return this.logParams;
    }

    public final PhotoSearchPdpEnterParams getPdpParams() {
        return this.pdpParams;
    }

    public final PhotoSearchToolsEnterParams getToolsParams() {
        return this.toolsParams;
    }

    public final void setBusinessParams(PhotoSearchBusinessEnterParams photoSearchBusinessEnterParams) {
        this.businessParams = photoSearchBusinessEnterParams;
    }

    public final void setLogParams(PhotoSearchLogEnterParams photoSearchLogEnterParams) {
        this.logParams = photoSearchLogEnterParams;
    }

    public final void setPdpParams(PhotoSearchPdpEnterParams photoSearchPdpEnterParams) {
        this.pdpParams = photoSearchPdpEnterParams;
    }

    public final void setToolsParams(PhotoSearchToolsEnterParams photoSearchToolsEnterParams) {
        this.toolsParams = photoSearchToolsEnterParams;
    }

    public PhotoSearchEnterParams(PhotoSearchBusinessEnterParams photoSearchBusinessEnterParams, PhotoSearchLogEnterParams photoSearchLogEnterParams, PhotoSearchToolsEnterParams photoSearchToolsEnterParams, PhotoSearchPdpEnterParams photoSearchPdpEnterParams) {
        this.businessParams = photoSearchBusinessEnterParams;
        this.logParams = photoSearchLogEnterParams;
        this.toolsParams = photoSearchToolsEnterParams;
        this.pdpParams = photoSearchPdpEnterParams;
    }

    public /* synthetic */ PhotoSearchEnterParams(PhotoSearchBusinessEnterParams photoSearchBusinessEnterParams, PhotoSearchLogEnterParams photoSearchLogEnterParams, PhotoSearchToolsEnterParams photoSearchToolsEnterParams, PhotoSearchPdpEnterParams photoSearchPdpEnterParams, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : photoSearchBusinessEnterParams, (i & 2) != 0 ? null : photoSearchLogEnterParams, (i & 4) != 0 ? null : photoSearchToolsEnterParams, (i & 8) != 0 ? null : photoSearchPdpEnterParams);
    }
}
