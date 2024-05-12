package com.bytedance.pipo.checkout.api.network.model.response;

import X.InterfaceC65349Pkn;
import X.X1D;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes20.dex */
public final class PrivacyAgreementList {

    @InterfaceC65349Pkn("starling_key")
    public String starlingKey;

    @InterfaceC65349Pkn("url")
    public String url;

    /* JADX WARN: Multi-variable type inference failed */
    public PrivacyAgreementList() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ PrivacyAgreementList copy$default(PrivacyAgreementList privacyAgreementList, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = privacyAgreementList.url;
        }
        if ((i & 2) != 0) {
            str2 = privacyAgreementList.starlingKey;
        }
        return privacyAgreementList.copy(str, str2);
    }

    public final PrivacyAgreementList copy(String str, String str2) {
        return new PrivacyAgreementList(str, str2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PrivacyAgreementList)) {
            return false;
        }
        PrivacyAgreementList privacyAgreementList = (PrivacyAgreementList) obj;
        return o.LJ(this.url, privacyAgreementList.url) && o.LJ(this.starlingKey, privacyAgreementList.starlingKey);
    }

    public int hashCode() {
        String str = this.url;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.starlingKey;
        return hashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("PrivacyAgreementList(url=");
        LIZ.append((Object) this.url);
        LIZ.append(", starlingKey=");
        LIZ.append((Object) this.starlingKey);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    public final String getStarlingKey() {
        return this.starlingKey;
    }

    public final String getUrl() {
        return this.url;
    }

    public final void setStarlingKey(String str) {
        this.starlingKey = str;
    }

    public final void setUrl(String str) {
        this.url = str;
    }

    public PrivacyAgreementList(String str, String str2) {
        this.url = str;
        this.starlingKey = str2;
    }

    public /* synthetic */ PrivacyAgreementList(String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2);
    }
}
