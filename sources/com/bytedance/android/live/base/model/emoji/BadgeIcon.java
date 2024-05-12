package com.bytedance.android.live.base.model.emoji;

import X.InterfaceC65349Pkn;
import X.X1D;
import defpackage.q;
import kotlin.jvm.internal.o;

/* loaded from: classes.dex */
public final class BadgeIcon {

    @InterfaceC65349Pkn("icon_str")
    public final String iconStr;

    @InterfaceC65349Pkn("icon_type")
    public final int iconType;

    @InterfaceC65349Pkn("icon_uri")
    public final String iconUri;

    @InterfaceC65349Pkn("icon_url")
    public final String iconUrl;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BadgeIcon)) {
            return false;
        }
        BadgeIcon badgeIcon = (BadgeIcon) obj;
        return this.iconType == badgeIcon.iconType && o.LJ(this.iconUri, badgeIcon.iconUri) && o.LJ(this.iconStr, badgeIcon.iconStr) && o.LJ(this.iconUrl, badgeIcon.iconUrl);
    }

    public final int hashCode() {
        int i = this.iconType * 31;
        String str = this.iconUri;
        int hashCode = (i + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.iconStr;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.iconUrl;
        return hashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("BadgeIcon(iconType=");
        LIZ.append(this.iconType);
        LIZ.append(", iconUri=");
        LIZ.append(this.iconUri);
        LIZ.append(", iconStr=");
        LIZ.append(this.iconStr);
        LIZ.append(", iconUrl=");
        return q.LIZIZ(LIZ, this.iconUrl, ')', LIZ);
    }

    public BadgeIcon(int i, String str, String str2, String str3) {
        this.iconType = i;
        this.iconUri = str;
        this.iconStr = str2;
        this.iconUrl = str3;
    }
}
