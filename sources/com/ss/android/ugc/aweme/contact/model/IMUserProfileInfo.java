package com.ss.android.ugc.aweme.contact.model;

import X.InterfaceC65349Pkn;
import X.X1D;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public final class IMUserProfileInfo {

    @InterfaceC65349Pkn("im_user_profile")
    public final IMUserBaseInfo imUserBaseInfo;

    @InterfaceC65349Pkn("share_permission")
    public final SharePermission sharePermission;

    /* JADX WARN: Multi-variable type inference failed */
    public IMUserProfileInfo() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof IMUserProfileInfo)) {
            return false;
        }
        IMUserProfileInfo iMUserProfileInfo = (IMUserProfileInfo) obj;
        return o.LJ(this.imUserBaseInfo, iMUserProfileInfo.imUserBaseInfo) && o.LJ(this.sharePermission, iMUserProfileInfo.sharePermission);
    }

    public final int hashCode() {
        IMUserBaseInfo iMUserBaseInfo = this.imUserBaseInfo;
        int hashCode = (iMUserBaseInfo == null ? 0 : iMUserBaseInfo.hashCode()) * 31;
        SharePermission sharePermission = this.sharePermission;
        return hashCode + (sharePermission != null ? sharePermission.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("IMUserProfileInfo(imUserBaseInfo=");
        LIZ.append(this.imUserBaseInfo);
        LIZ.append(", sharePermission=");
        LIZ.append(this.sharePermission);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    public IMUserProfileInfo(IMUserBaseInfo iMUserBaseInfo, SharePermission sharePermission) {
        this.imUserBaseInfo = iMUserBaseInfo;
        this.sharePermission = sharePermission;
    }

    public /* synthetic */ IMUserProfileInfo(IMUserBaseInfo iMUserBaseInfo, SharePermission sharePermission, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : iMUserBaseInfo, (i & 2) != 0 ? null : sharePermission);
    }
}
