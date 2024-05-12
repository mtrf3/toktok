package com.bytedance.pipo.checkout.api.network.model.request;

import X.InterfaceC65349Pkn;
import X.X1D;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes20.dex */
public final class PIManageConfigure {

    @InterfaceC65349Pkn("configuration")
    public Configuration configuration;

    @InterfaceC65349Pkn("merchant_user_id")
    public String merchantUserId;

    @InterfaceC65349Pkn("nonce")
    public String nonce;

    @InterfaceC65349Pkn("payment_method_token")
    public String paymentMethodToken;

    /* JADX WARN: Multi-variable type inference failed */
    public PIManageConfigure() {
        this(null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 15, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ PIManageConfigure copy$default(PIManageConfigure pIManageConfigure, String str, Configuration configuration, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = pIManageConfigure.merchantUserId;
        }
        if ((i & 2) != 0) {
            configuration = pIManageConfigure.configuration;
        }
        if ((i & 4) != 0) {
            str2 = pIManageConfigure.nonce;
        }
        if ((i & 8) != 0) {
            str3 = pIManageConfigure.paymentMethodToken;
        }
        return pIManageConfigure.copy(str, configuration, str2, str3);
    }

    public final PIManageConfigure copy(String str, Configuration configuration, String str2, String str3) {
        return new PIManageConfigure(str, configuration, str2, str3);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PIManageConfigure)) {
            return false;
        }
        PIManageConfigure pIManageConfigure = (PIManageConfigure) obj;
        return o.LJ(this.merchantUserId, pIManageConfigure.merchantUserId) && o.LJ(this.configuration, pIManageConfigure.configuration) && o.LJ(this.nonce, pIManageConfigure.nonce) && o.LJ(this.paymentMethodToken, pIManageConfigure.paymentMethodToken);
    }

    public int hashCode() {
        String str = this.merchantUserId;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        Configuration configuration = this.configuration;
        int hashCode2 = (hashCode + (configuration == null ? 0 : configuration.hashCode())) * 31;
        String str2 = this.nonce;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.paymentMethodToken;
        return hashCode3 + (str3 != null ? str3.hashCode() : 0);
    }

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("PIManageConfigure(merchantUserId=");
        LIZ.append((Object) this.merchantUserId);
        LIZ.append(", configuration=");
        LIZ.append(this.configuration);
        LIZ.append(", nonce=");
        LIZ.append((Object) this.nonce);
        LIZ.append(", paymentMethodToken=");
        LIZ.append((Object) this.paymentMethodToken);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    public final Configuration getConfiguration() {
        return this.configuration;
    }

    public final String getMerchantUserId() {
        return this.merchantUserId;
    }

    public final String getNonce() {
        return this.nonce;
    }

    public final String getPaymentMethodToken() {
        return this.paymentMethodToken;
    }

    public final void setConfiguration(Configuration configuration) {
        this.configuration = configuration;
    }

    public final void setMerchantUserId(String str) {
        this.merchantUserId = str;
    }

    public final void setNonce(String str) {
        this.nonce = str;
    }

    public final void setPaymentMethodToken(String str) {
        this.paymentMethodToken = str;
    }

    public PIManageConfigure(String str, Configuration configuration, String str2, String str3) {
        this.merchantUserId = str;
        this.configuration = configuration;
        this.nonce = str2;
        this.paymentMethodToken = str3;
    }

    public /* synthetic */ PIManageConfigure(String str, Configuration configuration, String str2, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? new Configuration(null, null, null, null, null, null, 63, null) : configuration, (i & 4) != 0 ? null : str2, (i & 8) == 0 ? str3 : null);
    }
}
