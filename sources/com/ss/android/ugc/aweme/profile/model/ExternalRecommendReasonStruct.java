package com.ss.android.ugc.aweme.profile.model;

import X.InterfaceC65349Pkn;
import X.X1D;
import defpackage.q;
import java.io.Serializable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public final class ExternalRecommendReasonStruct implements Serializable {
    public String cacheReason;

    @InterfaceC65349Pkn("external_username")
    public String externalUsername;

    @InterfaceC65349Pkn("hashed_phone_number")
    public String hashedPhoneNumber;

    @InterfaceC65349Pkn("reason")
    public String reason;

    /* JADX WARN: Multi-variable type inference failed */
    public ExternalRecommendReasonStruct() {
        this(null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 15, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ ExternalRecommendReasonStruct copy$default(ExternalRecommendReasonStruct externalRecommendReasonStruct, String str, String str2, String str3, String str4, int i, Object obj) {
        if ((i & 1) != 0) {
            str = externalRecommendReasonStruct.reason;
        }
        if ((i & 2) != 0) {
            str2 = externalRecommendReasonStruct.hashedPhoneNumber;
        }
        if ((i & 4) != 0) {
            str3 = externalRecommendReasonStruct.externalUsername;
        }
        if ((i & 8) != 0) {
            str4 = externalRecommendReasonStruct.cacheReason;
        }
        return externalRecommendReasonStruct.copy(str, str2, str3, str4);
    }

    public final ExternalRecommendReasonStruct copy(String str, String str2, String str3, String str4) {
        return new ExternalRecommendReasonStruct(str, str2, str3, str4);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ExternalRecommendReasonStruct)) {
            return false;
        }
        ExternalRecommendReasonStruct externalRecommendReasonStruct = (ExternalRecommendReasonStruct) obj;
        return o.LJ(this.reason, externalRecommendReasonStruct.reason) && o.LJ(this.hashedPhoneNumber, externalRecommendReasonStruct.hashedPhoneNumber) && o.LJ(this.externalUsername, externalRecommendReasonStruct.externalUsername) && o.LJ(this.cacheReason, externalRecommendReasonStruct.cacheReason);
    }

    public int hashCode() {
        String str = this.reason;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.hashedPhoneNumber;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.externalUsername;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.cacheReason;
        return hashCode3 + (str4 != null ? str4.hashCode() : 0);
    }

    public final boolean isValid() {
        String str;
        String str2 = this.hashedPhoneNumber;
        if ((str2 == null || str2.length() == 0) && ((str = this.externalUsername) == null || str.length() == 0)) {
            return false;
        }
        return true;
    }

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("ExternalRecommendReasonStruct(reason=");
        LIZ.append(this.reason);
        LIZ.append(", hashedPhoneNumber=");
        LIZ.append(this.hashedPhoneNumber);
        LIZ.append(", externalUsername=");
        LIZ.append(this.externalUsername);
        LIZ.append(", cacheReason=");
        return q.LIZIZ(LIZ, this.cacheReason, ')', LIZ);
    }

    public final String getCacheReason() {
        return this.cacheReason;
    }

    public final String getExternalUsername() {
        return this.externalUsername;
    }

    public final String getHashedPhoneNumber() {
        return this.hashedPhoneNumber;
    }

    public final String getReason() {
        return this.reason;
    }

    public final void setCacheReason(String str) {
        this.cacheReason = str;
    }

    public final void setExternalUsername(String str) {
        this.externalUsername = str;
    }

    public final void setHashedPhoneNumber(String str) {
        this.hashedPhoneNumber = str;
    }

    public final void setReason(String str) {
        this.reason = str;
    }

    public ExternalRecommendReasonStruct(String str, String str2, String str3, String str4) {
        this.reason = str;
        this.hashedPhoneNumber = str2;
        this.externalUsername = str3;
        this.cacheReason = str4;
    }

    public /* synthetic */ ExternalRecommendReasonStruct(String str, String str2, String str3, String str4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4);
    }
}
