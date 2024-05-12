package com.ss.android.ugc.aweme.api;

import X.C1NE;
import X.InterfaceC65349Pkn;
import X.X1D;
import com.ss.android.ugc.aweme.shortvideo.model.AnchorPublishStruct;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public final class AnchorSearchResponse {

    @InterfaceC65349Pkn("ranked_anchor_list")
    public final List<AnchorPublishStruct> rankedAnchorList;

    @InterfaceC65349Pkn("status_code")
    public final int statusCode;

    @InterfaceC65349Pkn("status_msg")
    public final String statusMsg;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AnchorSearchResponse)) {
            return false;
        }
        AnchorSearchResponse anchorSearchResponse = (AnchorSearchResponse) obj;
        return this.statusCode == anchorSearchResponse.statusCode && o.LJ(this.statusMsg, anchorSearchResponse.statusMsg) && o.LJ(this.rankedAnchorList, anchorSearchResponse.rankedAnchorList);
    }

    public final int hashCode() {
        int i = this.statusCode * 31;
        String str = this.statusMsg;
        int hashCode = (i + (str == null ? 0 : str.hashCode())) * 31;
        List<AnchorPublishStruct> list = this.rankedAnchorList;
        return hashCode + (list != null ? list.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("AnchorSearchResponse(statusCode=");
        LIZ.append(this.statusCode);
        LIZ.append(", statusMsg=");
        LIZ.append(this.statusMsg);
        LIZ.append(", rankedAnchorList=");
        return C1NE.LIZIZ(LIZ, this.rankedAnchorList, ')', LIZ);
    }

    public AnchorSearchResponse(int i, String str, List<AnchorPublishStruct> list) {
        this.statusCode = i;
        this.statusMsg = str;
        this.rankedAnchorList = list;
    }
}
