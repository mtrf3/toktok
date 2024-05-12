package com.ss.android.ugc.aweme.im.sdk.common.data.model;

import X.InterfaceC65349Pkn;
import X.WM7;
import X.X1D;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class SingleResourceRefreshReq {

    @InterfaceC65349Pkn("ext")
    public final IMPublicResourceRequestExt ext;

    @InterfaceC65349Pkn("public_resource_id")
    public final Long resId;

    @InterfaceC65349Pkn(WM7.SCENE_SERVICE)
    public final int scene;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SingleResourceRefreshReq)) {
            return false;
        }
        SingleResourceRefreshReq singleResourceRefreshReq = (SingleResourceRefreshReq) obj;
        return this.scene == singleResourceRefreshReq.scene && o.LJ(this.resId, singleResourceRefreshReq.resId) && o.LJ(this.ext, singleResourceRefreshReq.ext);
    }

    public final int hashCode() {
        int i = this.scene * 31;
        Long l = this.resId;
        int hashCode = (i + (l == null ? 0 : l.hashCode())) * 31;
        IMPublicResourceRequestExt iMPublicResourceRequestExt = this.ext;
        return hashCode + (iMPublicResourceRequestExt != null ? iMPublicResourceRequestExt.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("SingleResourceRefreshReq(scene=");
        LIZ.append(this.scene);
        LIZ.append(", resId=");
        LIZ.append(this.resId);
        LIZ.append(", ext=");
        LIZ.append(this.ext);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    public SingleResourceRefreshReq(int i, Long l, IMPublicResourceRequestExt iMPublicResourceRequestExt) {
        this.scene = i;
        this.resId = l;
        this.ext = iMPublicResourceRequestExt;
    }

    public /* synthetic */ SingleResourceRefreshReq(int i, Long l, IMPublicResourceRequestExt iMPublicResourceRequestExt, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, l, (i2 & 4) != 0 ? null : iMPublicResourceRequestExt);
    }
}
