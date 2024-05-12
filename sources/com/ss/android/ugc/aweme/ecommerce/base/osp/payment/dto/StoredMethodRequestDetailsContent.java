package com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto;

import X.InterfaceC65349Pkn;
import X.X1D;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public final class StoredMethodRequestDetailsContent {

    @InterfaceC65349Pkn("configuration")
    public final StoredMethodRequestDetailsConfig configuration;

    @InterfaceC65349Pkn("is_sensitive")
    public final boolean isSensitive;

    @InterfaceC65349Pkn("merchant_user_id")
    public final String merchant_user_id;

    @InterfaceC65349Pkn("nonce")
    public final String nonce;

    @InterfaceC65349Pkn("payment_method_token")
    public final String paymentMethodToken;

    public static /* synthetic */ StoredMethodRequestDetailsContent copy$default(StoredMethodRequestDetailsContent storedMethodRequestDetailsContent, String str, boolean z, String str2, String str3, StoredMethodRequestDetailsConfig storedMethodRequestDetailsConfig, int i, Object obj) {
        if ((i & 1) != 0) {
            str = storedMethodRequestDetailsContent.paymentMethodToken;
        }
        if ((i & 2) != 0) {
            z = storedMethodRequestDetailsContent.isSensitive;
        }
        if ((i & 4) != 0) {
            str2 = storedMethodRequestDetailsContent.merchant_user_id;
        }
        if ((i & 8) != 0) {
            str3 = storedMethodRequestDetailsContent.nonce;
        }
        if ((i & 16) != 0) {
            storedMethodRequestDetailsConfig = storedMethodRequestDetailsContent.configuration;
        }
        return storedMethodRequestDetailsContent.copy(str, z, str2, str3, storedMethodRequestDetailsConfig);
    }

    public final StoredMethodRequestDetailsContent copy(String str, boolean z, String str2, String str3, StoredMethodRequestDetailsConfig storedMethodRequestDetailsConfig) {
        return new StoredMethodRequestDetailsContent(str, z, str2, str3, storedMethodRequestDetailsConfig);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StoredMethodRequestDetailsContent)) {
            return false;
        }
        StoredMethodRequestDetailsContent storedMethodRequestDetailsContent = (StoredMethodRequestDetailsContent) obj;
        return o.LJ(this.paymentMethodToken, storedMethodRequestDetailsContent.paymentMethodToken) && this.isSensitive == storedMethodRequestDetailsContent.isSensitive && o.LJ(this.merchant_user_id, storedMethodRequestDetailsContent.merchant_user_id) && o.LJ(this.nonce, storedMethodRequestDetailsContent.nonce) && o.LJ(this.configuration, storedMethodRequestDetailsContent.configuration);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        String str = this.paymentMethodToken;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        boolean z = this.isSensitive;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        int i2 = (hashCode + i) * 31;
        String str2 = this.merchant_user_id;
        int hashCode2 = (i2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.nonce;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        StoredMethodRequestDetailsConfig storedMethodRequestDetailsConfig = this.configuration;
        return hashCode3 + (storedMethodRequestDetailsConfig != null ? storedMethodRequestDetailsConfig.hashCode() : 0);
    }

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("StoredMethodRequestDetailsContent(paymentMethodToken=");
        LIZ.append(this.paymentMethodToken);
        LIZ.append(", isSensitive=");
        LIZ.append(this.isSensitive);
        LIZ.append(", merchant_user_id=");
        LIZ.append(this.merchant_user_id);
        LIZ.append(", nonce=");
        LIZ.append(this.nonce);
        LIZ.append(", configuration=");
        LIZ.append(this.configuration);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    public final StoredMethodRequestDetailsConfig getConfiguration() {
        return this.configuration;
    }

    public final String getMerchant_user_id() {
        return this.merchant_user_id;
    }

    public final String getNonce() {
        return this.nonce;
    }

    public final String getPaymentMethodToken() {
        return this.paymentMethodToken;
    }

    public final boolean isSensitive() {
        return this.isSensitive;
    }

    public StoredMethodRequestDetailsContent(String str, boolean z, String str2, String str3, StoredMethodRequestDetailsConfig storedMethodRequestDetailsConfig) {
        this.paymentMethodToken = str;
        this.isSensitive = z;
        this.merchant_user_id = str2;
        this.nonce = str3;
        this.configuration = storedMethodRequestDetailsConfig;
    }

    public /* synthetic */ StoredMethodRequestDetailsContent(String str, boolean z, String str2, String str3, StoredMethodRequestDetailsConfig storedMethodRequestDetailsConfig, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? false : z, (i & 4) != 0 ? null : str2, (i & 8) != 0 ? null : str3, (i & 16) == 0 ? storedMethodRequestDetailsConfig : null);
    }
}
