package com.bytedance.android.live.liveinteract.matchx.models;

import X.InterfaceC65349Pkn;
import X.X1D;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public final class XPanelData {

    @InterfaceC65349Pkn("business")
    public final String business;

    @InterfaceC65349Pkn("detail")
    public final XPanelDetail detail;

    @InterfaceC65349Pkn("error")
    public final XPanelError error;

    /* JADX WARN: Multi-variable type inference failed */
    public XPanelData() {
        this(null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 7, 0 == true ? 1 : 0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof XPanelData)) {
            return false;
        }
        XPanelData xPanelData = (XPanelData) obj;
        return o.LJ(this.business, xPanelData.business) && o.LJ(this.detail, xPanelData.detail) && o.LJ(this.error, xPanelData.error);
    }

    public final int hashCode() {
        int hashCode = this.business.hashCode() * 31;
        XPanelDetail xPanelDetail = this.detail;
        int hashCode2 = (hashCode + (xPanelDetail == null ? 0 : xPanelDetail.hashCode())) * 31;
        XPanelError xPanelError = this.error;
        return hashCode2 + (xPanelError != null ? xPanelError.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("XPanelData(business=");
        LIZ.append(this.business);
        LIZ.append(", detail=");
        LIZ.append(this.detail);
        LIZ.append(", error=");
        LIZ.append(this.error);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    public XPanelData(String business, XPanelDetail xPanelDetail, XPanelError xPanelError) {
        o.LJIIIZ(business, "business");
        this.business = business;
        this.detail = xPanelDetail;
        this.error = xPanelError;
    }

    public /* synthetic */ XPanelData(String str, XPanelDetail xPanelDetail, XPanelError xPanelError, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? null : xPanelDetail, (i & 4) != 0 ? null : xPanelError);
    }
}
