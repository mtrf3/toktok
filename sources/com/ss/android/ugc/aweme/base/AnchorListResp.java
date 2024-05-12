package com.ss.android.ugc.aweme.base;

import X.InterfaceC65349Pkn;
import X.X1D;
import com.ss.android.ugc.aweme.shortvideo.model.AnchorPublishStruct;
import defpackage.q;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public final class AnchorListResp {

    @InterfaceC65349Pkn("anchor_list")
    public final List<AnchorPublishStruct> anchorList;

    @InterfaceC65349Pkn("register_region")
    public final String registerRegion;

    @InterfaceC65349Pkn("status_code")
    public final int statusCode;

    @InterfaceC65349Pkn("status_msg")
    public final String statusMsg;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AnchorListResp)) {
            return false;
        }
        AnchorListResp anchorListResp = (AnchorListResp) obj;
        return this.statusCode == anchorListResp.statusCode && o.LJ(this.statusMsg, anchorListResp.statusMsg) && o.LJ(this.anchorList, anchorListResp.anchorList) && o.LJ(this.registerRegion, anchorListResp.registerRegion);
    }

    public final int hashCode() {
        int i = this.statusCode * 31;
        String str = this.statusMsg;
        int hashCode = (i + (str == null ? 0 : str.hashCode())) * 31;
        List<AnchorPublishStruct> list = this.anchorList;
        int hashCode2 = (hashCode + (list == null ? 0 : list.hashCode())) * 31;
        String str2 = this.registerRegion;
        return hashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("AnchorListResp(statusCode=");
        LIZ.append(this.statusCode);
        LIZ.append(", statusMsg=");
        LIZ.append(this.statusMsg);
        LIZ.append(", anchorList=");
        LIZ.append(this.anchorList);
        LIZ.append(", registerRegion=");
        return q.LIZIZ(LIZ, this.registerRegion, ')', LIZ);
    }

    public AnchorListResp(int i, String str, List<AnchorPublishStruct> list, String str2) {
        this.statusCode = i;
        this.statusMsg = str;
        this.anchorList = list;
        this.registerRegion = str2;
    }

    public /* synthetic */ AnchorListResp(int i, String str, List list, String str2, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, str, list, (i2 & 8) != 0 ? "" : str2);
    }
}
