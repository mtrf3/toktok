package com.ss.android.ugc.aweme.compliance.business.hideaccount;

import X.EnumC25557A1h;
import X.InterfaceC65349Pkn;
import X.X1D;
import defpackage.b0;
import java.io.Serializable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class HiddenItem implements Serializable {
    public static final int $stable = 0;

    @InterfaceC65349Pkn("hide_status")
    public final int hideStatus;

    @InterfaceC65349Pkn("user")
    public final HiddenUser user;

    /* JADX WARN: Multi-variable type inference failed */
    public HiddenItem() {
        this(null, 0, 3, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ HiddenItem copy$default(HiddenItem hiddenItem, HiddenUser hiddenUser, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            hiddenUser = hiddenItem.user;
        }
        if ((i2 & 2) != 0) {
            i = hiddenItem.hideStatus;
        }
        return hiddenItem.copy(hiddenUser, i);
    }

    public final HiddenItem copy(HiddenUser hiddenUser, int i) {
        return new HiddenItem(hiddenUser, i);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof HiddenItem)) {
            return false;
        }
        HiddenItem hiddenItem = (HiddenItem) obj;
        return o.LJ(this.user, hiddenItem.user) && this.hideStatus == hiddenItem.hideStatus;
    }

    public int hashCode() {
        HiddenUser hiddenUser = this.user;
        return ((hiddenUser == null ? 0 : hiddenUser.hashCode()) * 31) + this.hideStatus;
    }

    public final boolean isHidden() {
        if (this.hideStatus == EnumC25557A1h.HIDE.getValue()) {
            return true;
        }
        return false;
    }

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("HiddenItem(user=");
        LIZ.append(this.user);
        LIZ.append(", hideStatus=");
        return b0.LIZJ(LIZ, this.hideStatus, ')', LIZ);
    }

    public final int getHideStatus() {
        return this.hideStatus;
    }

    public final HiddenUser getUser() {
        return this.user;
    }

    public HiddenItem(HiddenUser hiddenUser, int i) {
        this.user = hiddenUser;
        this.hideStatus = i;
    }

    public /* synthetic */ HiddenItem(HiddenUser hiddenUser, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? null : hiddenUser, (i2 & 2) != 0 ? EnumC25557A1h.NOT_HIDE.getValue() : i);
    }
}
