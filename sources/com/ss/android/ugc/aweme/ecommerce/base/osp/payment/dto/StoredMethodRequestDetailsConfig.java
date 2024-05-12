package com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto;

import X.InterfaceC65349Pkn;
import X.X1D;
import defpackage.q;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public final class StoredMethodRequestDetailsConfig {

    @InterfaceC65349Pkn("environment")
    public final String environment;

    @InterfaceC65349Pkn("origin_key")
    public final String originKey;

    /* JADX WARN: Multi-variable type inference failed */
    public StoredMethodRequestDetailsConfig() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ StoredMethodRequestDetailsConfig copy$default(StoredMethodRequestDetailsConfig storedMethodRequestDetailsConfig, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = storedMethodRequestDetailsConfig.environment;
        }
        if ((i & 2) != 0) {
            str2 = storedMethodRequestDetailsConfig.originKey;
        }
        return storedMethodRequestDetailsConfig.copy(str, str2);
    }

    public final StoredMethodRequestDetailsConfig copy(String str, String str2) {
        return new StoredMethodRequestDetailsConfig(str, str2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StoredMethodRequestDetailsConfig)) {
            return false;
        }
        StoredMethodRequestDetailsConfig storedMethodRequestDetailsConfig = (StoredMethodRequestDetailsConfig) obj;
        return o.LJ(this.environment, storedMethodRequestDetailsConfig.environment) && o.LJ(this.originKey, storedMethodRequestDetailsConfig.originKey);
    }

    public int hashCode() {
        String str = this.environment;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.originKey;
        return hashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("StoredMethodRequestDetailsConfig(environment=");
        LIZ.append(this.environment);
        LIZ.append(", originKey=");
        return q.LIZIZ(LIZ, this.originKey, ')', LIZ);
    }

    public final String getEnvironment() {
        return this.environment;
    }

    public final String getOriginKey() {
        return this.originKey;
    }

    public StoredMethodRequestDetailsConfig(String str, String str2) {
        this.environment = str;
        this.originKey = str2;
    }

    public /* synthetic */ StoredMethodRequestDetailsConfig(String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2);
    }
}
