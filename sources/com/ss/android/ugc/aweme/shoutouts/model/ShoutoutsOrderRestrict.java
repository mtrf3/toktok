package com.ss.android.ugc.aweme.shoutouts.model;

import X.InterfaceC65349Pkn;
import X.X1D;
import defpackage.b0;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public final class ShoutoutsOrderRestrict {

    @InterfaceC65349Pkn("opening")
    public final boolean opening;

    @InterfaceC65349Pkn("other_restrict")
    public final boolean otherRestrict;

    @InterfaceC65349Pkn("reason")
    public final String reason;

    @InterfaceC65349Pkn("restrict_type")
    public final int restrictType;

    public static /* synthetic */ ShoutoutsOrderRestrict copy$default(ShoutoutsOrderRestrict shoutoutsOrderRestrict, boolean z, boolean z2, String str, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            z = shoutoutsOrderRestrict.opening;
        }
        if ((i2 & 2) != 0) {
            z2 = shoutoutsOrderRestrict.otherRestrict;
        }
        if ((i2 & 4) != 0) {
            str = shoutoutsOrderRestrict.reason;
        }
        if ((i2 & 8) != 0) {
            i = shoutoutsOrderRestrict.restrictType;
        }
        return shoutoutsOrderRestrict.copy(z, z2, str, i);
    }

    public final ShoutoutsOrderRestrict copy(boolean z, boolean z2, String str, int i) {
        return new ShoutoutsOrderRestrict(z, z2, str, i);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ShoutoutsOrderRestrict)) {
            return false;
        }
        ShoutoutsOrderRestrict shoutoutsOrderRestrict = (ShoutoutsOrderRestrict) obj;
        return this.opening == shoutoutsOrderRestrict.opening && this.otherRestrict == shoutoutsOrderRestrict.otherRestrict && o.LJ(this.reason, shoutoutsOrderRestrict.reason) && this.restrictType == shoutoutsOrderRestrict.restrictType;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v8 */
    /* JADX WARN: Type inference failed for: r0v9 */
    public int hashCode() {
        boolean z = this.opening;
        ?? r0 = z;
        if (z) {
            r0 = 1;
        }
        int i = ((r0 * 31) + (this.otherRestrict ? 1 : 0)) * 31;
        String str = this.reason;
        return ((i + (str == null ? 0 : str.hashCode())) * 31) + this.restrictType;
    }

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("ShoutoutsOrderRestrict(opening=");
        LIZ.append(this.opening);
        LIZ.append(", otherRestrict=");
        LIZ.append(this.otherRestrict);
        LIZ.append(", reason=");
        LIZ.append(this.reason);
        LIZ.append(", restrictType=");
        return b0.LIZJ(LIZ, this.restrictType, ')', LIZ);
    }

    public final boolean getOpening() {
        return this.opening;
    }

    public final boolean getOtherRestrict() {
        return this.otherRestrict;
    }

    public final String getReason() {
        return this.reason;
    }

    public final int getRestrictType() {
        return this.restrictType;
    }

    public ShoutoutsOrderRestrict(boolean z, boolean z2, String str, int i) {
        this.opening = z;
        this.otherRestrict = z2;
        this.reason = str;
        this.restrictType = i;
    }
}
