package com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto;

import X.C48339Iy7;
import X.InterfaceC65349Pkn;
import X.X1D;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public final class StoredMethodRequestContent {

    @InterfaceC65349Pkn("include_expired")
    public final Boolean includeExpired;

    @InterfaceC65349Pkn("include_invalid")
    public final Boolean includeInvalid;

    @InterfaceC65349Pkn("is_sensitive")
    public final boolean isSensitive;

    @InterfaceC65349Pkn("merchant_user_id")
    public final String merchantUserId;

    @InterfaceC65349Pkn("type")
    public final String type;

    public static /* synthetic */ StoredMethodRequestContent copy$default(StoredMethodRequestContent storedMethodRequestContent, Boolean bool, Boolean bool2, String str, String str2, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            bool = storedMethodRequestContent.includeExpired;
        }
        if ((i & 2) != 0) {
            bool2 = storedMethodRequestContent.includeInvalid;
        }
        if ((i & 4) != 0) {
            str = storedMethodRequestContent.merchantUserId;
        }
        if ((i & 8) != 0) {
            str2 = storedMethodRequestContent.type;
        }
        if ((i & 16) != 0) {
            z = storedMethodRequestContent.isSensitive;
        }
        return storedMethodRequestContent.copy(bool, bool2, str, str2, z);
    }

    public final StoredMethodRequestContent copy(Boolean bool, Boolean bool2, String str, String str2, boolean z) {
        return new StoredMethodRequestContent(bool, bool2, str, str2, z);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StoredMethodRequestContent)) {
            return false;
        }
        StoredMethodRequestContent storedMethodRequestContent = (StoredMethodRequestContent) obj;
        return o.LJ(this.includeExpired, storedMethodRequestContent.includeExpired) && o.LJ(this.includeInvalid, storedMethodRequestContent.includeInvalid) && o.LJ(this.merchantUserId, storedMethodRequestContent.merchantUserId) && o.LJ(this.type, storedMethodRequestContent.type) && this.isSensitive == storedMethodRequestContent.isSensitive;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        Boolean bool = this.includeExpired;
        int hashCode = (bool == null ? 0 : bool.hashCode()) * 31;
        Boolean bool2 = this.includeInvalid;
        int hashCode2 = (hashCode + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        String str = this.merchantUserId;
        int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.type;
        int hashCode4 = (hashCode3 + (str2 != null ? str2.hashCode() : 0)) * 31;
        boolean z = this.isSensitive;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        return hashCode4 + i;
    }

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("StoredMethodRequestContent(includeExpired=");
        LIZ.append(this.includeExpired);
        LIZ.append(", includeInvalid=");
        LIZ.append(this.includeInvalid);
        LIZ.append(", merchantUserId=");
        LIZ.append(this.merchantUserId);
        LIZ.append(", type=");
        LIZ.append(this.type);
        LIZ.append(", isSensitive=");
        return C48339Iy7.LIZJ(LIZ, this.isSensitive, ')', LIZ);
    }

    public final Boolean getIncludeExpired() {
        return this.includeExpired;
    }

    public final Boolean getIncludeInvalid() {
        return this.includeInvalid;
    }

    public final String getMerchantUserId() {
        return this.merchantUserId;
    }

    public final String getType() {
        return this.type;
    }

    public final boolean isSensitive() {
        return this.isSensitive;
    }

    public StoredMethodRequestContent(Boolean bool, Boolean bool2, String str, String str2, boolean z) {
        this.includeExpired = bool;
        this.includeInvalid = bool2;
        this.merchantUserId = str;
        this.type = str2;
        this.isSensitive = z;
    }

    public /* synthetic */ StoredMethodRequestContent(Boolean bool, Boolean bool2, String str, String str2, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? Boolean.FALSE : bool, (i & 2) != 0 ? Boolean.FALSE : bool2, str, (i & 8) != 0 ? null : str2, (i & 16) != 0 ? false : z);
    }
}
