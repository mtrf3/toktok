package com.ss.android.ugc.aweme.contact.model;

import X.InterfaceC65349Pkn;
import X.X1D;
import defpackage.b0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public final class IMContactEvent {

    @InterfaceC65349Pkn("base")
    public final IMUserBaseInfo base;

    @InterfaceC65349Pkn("contact_event_type")
    public final int contactEventType;

    @InterfaceC65349Pkn("share_permission")
    public final SharePermission sharePermission;

    /* JADX WARN: Multi-variable type inference failed */
    public IMContactEvent() {
        this(null, 0 == true ? 1 : 0, 0, 7, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ IMContactEvent copy$default(IMContactEvent iMContactEvent, IMUserBaseInfo iMUserBaseInfo, SharePermission sharePermission, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            iMUserBaseInfo = iMContactEvent.base;
        }
        if ((i2 & 2) != 0) {
            sharePermission = iMContactEvent.sharePermission;
        }
        if ((i2 & 4) != 0) {
            i = iMContactEvent.contactEventType;
        }
        return iMContactEvent.copy(iMUserBaseInfo, sharePermission, i);
    }

    public final IMContactEvent copy(IMUserBaseInfo iMUserBaseInfo, SharePermission sharePermission, int i) {
        return new IMContactEvent(iMUserBaseInfo, sharePermission, i);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof IMContactEvent)) {
            return false;
        }
        IMContactEvent iMContactEvent = (IMContactEvent) obj;
        return o.LJ(this.base, iMContactEvent.base) && o.LJ(this.sharePermission, iMContactEvent.sharePermission) && this.contactEventType == iMContactEvent.contactEventType;
    }

    public int hashCode() {
        IMUserBaseInfo iMUserBaseInfo = this.base;
        int hashCode = (iMUserBaseInfo == null ? 0 : iMUserBaseInfo.hashCode()) * 31;
        SharePermission sharePermission = this.sharePermission;
        return ((hashCode + (sharePermission != null ? sharePermission.hashCode() : 0)) * 31) + this.contactEventType;
    }

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("IMContactEvent(base=");
        LIZ.append(this.base);
        LIZ.append(", sharePermission=");
        LIZ.append(this.sharePermission);
        LIZ.append(", contactEventType=");
        return b0.LIZJ(LIZ, this.contactEventType, ')', LIZ);
    }

    public final IMUserBaseInfo getBase() {
        return this.base;
    }

    public final int getContactEventType() {
        return this.contactEventType;
    }

    public final SharePermission getSharePermission() {
        return this.sharePermission;
    }

    public IMContactEvent(IMUserBaseInfo iMUserBaseInfo, SharePermission sharePermission, int i) {
        this.base = iMUserBaseInfo;
        this.sharePermission = sharePermission;
        this.contactEventType = i;
    }

    public /* synthetic */ IMContactEvent(IMUserBaseInfo iMUserBaseInfo, SharePermission sharePermission, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? null : iMUserBaseInfo, (i2 & 2) != 0 ? null : sharePermission, (i2 & 4) != 0 ? 0 : i);
    }
}
