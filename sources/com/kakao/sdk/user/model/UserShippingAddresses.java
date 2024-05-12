package com.kakao.sdk.user.model;

import X.C1NE;
import X.InterfaceC65349Pkn;
import X.X1D;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public final class UserShippingAddresses {

    @InterfaceC65349Pkn("shipping_addresses_needs_agreement")
    public final Boolean needsAgreement;
    public final List<ShippingAddress> shippingAddresses;
    public final Long userId;

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ UserShippingAddresses copy$default(UserShippingAddresses userShippingAddresses, Long l, Boolean bool, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            l = userShippingAddresses.userId;
        }
        if ((i & 2) != 0) {
            bool = userShippingAddresses.needsAgreement;
        }
        if ((i & 4) != 0) {
            list = userShippingAddresses.shippingAddresses;
        }
        return userShippingAddresses.copy(l, bool, list);
    }

    public final UserShippingAddresses copy(Long l, Boolean bool, List<ShippingAddress> list) {
        return new UserShippingAddresses(l, bool, list);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UserShippingAddresses)) {
            return false;
        }
        UserShippingAddresses userShippingAddresses = (UserShippingAddresses) obj;
        return o.LJ(this.userId, userShippingAddresses.userId) && o.LJ(this.needsAgreement, userShippingAddresses.needsAgreement) && o.LJ(this.shippingAddresses, userShippingAddresses.shippingAddresses);
    }

    public int hashCode() {
        Long l = this.userId;
        int hashCode = (l == null ? 0 : l.hashCode()) * 31;
        Boolean bool = this.needsAgreement;
        int hashCode2 = (hashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        List<ShippingAddress> list = this.shippingAddresses;
        return hashCode2 + (list != null ? list.hashCode() : 0);
    }

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("UserShippingAddresses(userId=");
        LIZ.append(this.userId);
        LIZ.append(", needsAgreement=");
        LIZ.append(this.needsAgreement);
        LIZ.append(", shippingAddresses=");
        return C1NE.LIZIZ(LIZ, this.shippingAddresses, ')', LIZ);
    }

    public final Boolean getNeedsAgreement() {
        return this.needsAgreement;
    }

    public final List<ShippingAddress> getShippingAddresses() {
        return this.shippingAddresses;
    }

    public final Long getUserId() {
        return this.userId;
    }

    public UserShippingAddresses(Long l, Boolean bool, List<ShippingAddress> list) {
        this.userId = l;
        this.needsAgreement = bool;
        this.shippingAddresses = list;
    }
}
