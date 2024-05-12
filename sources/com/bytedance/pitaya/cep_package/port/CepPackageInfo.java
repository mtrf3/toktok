package com.bytedance.pitaya.cep_package.port;

import X.C79062V1e;
import X.EAG;
import X.HH1;
import X.X1D;
import com.bytedance.pitaya.cep_engine.port.CepKeeper;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* loaded from: classes7.dex */
public final class CepPackageInfo implements CepKeeper {
    public static final EAG Companion = new EAG();
    public final String business;
    public final String deployment;
    public final JSONObject extra;
    public final String extraStr;
    public final int from;
    public final String version;

    public static /* synthetic */ CepPackageInfo copy$default(CepPackageInfo cepPackageInfo, String str, String str2, String str3, int i, String str4, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = cepPackageInfo.business;
        }
        if ((i2 & 2) != 0) {
            str2 = cepPackageInfo.version;
        }
        if ((i2 & 4) != 0) {
            str3 = cepPackageInfo.deployment;
        }
        if ((i2 & 8) != 0) {
            i = cepPackageInfo.from;
        }
        if ((i2 & 16) != 0) {
            str4 = cepPackageInfo.extraStr;
        }
        return cepPackageInfo.copy(str, str2, str3, i, str4);
    }

    public final CepPackageInfo copy(String business, String version, String deployment, int i, String str) {
        o.LJIIIZ(business, "business");
        o.LJIIIZ(version, "version");
        o.LJIIIZ(deployment, "deployment");
        return new CepPackageInfo(business, version, deployment, i, str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CepPackageInfo)) {
            return false;
        }
        CepPackageInfo cepPackageInfo = (CepPackageInfo) obj;
        return o.LJ(this.business, cepPackageInfo.business) && o.LJ(this.version, cepPackageInfo.version) && o.LJ(this.deployment, cepPackageInfo.deployment) && this.from == cepPackageInfo.from && o.LJ(this.extraStr, cepPackageInfo.extraStr);
    }

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("CepPackageInfo(business=");
        LIZ.append(this.business);
        LIZ.append(", version=");
        LIZ.append(this.version);
        LIZ.append(", deployment=");
        LIZ.append(this.deployment);
        LIZ.append(", from=");
        LIZ.append(this.from);
        LIZ.append(", extraStr=");
        LIZ.append((Object) this.extraStr);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    public int hashCode() {
        int hashCode;
        int LJ = (C79062V1e.LJ(this.deployment, C79062V1e.LJ(this.version, this.business.hashCode() * 31, 31), 31) + this.from) * 31;
        String str = this.extraStr;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        return LJ + hashCode;
    }

    public final String getBusiness() {
        return this.business;
    }

    public final String getDeployment() {
        return this.deployment;
    }

    public final JSONObject getExtra() {
        return this.extra;
    }

    public final String getExtraStr() {
        return this.extraStr;
    }

    public final int getFrom() {
        return this.from;
    }

    public final String getVersion() {
        return this.version;
    }

    public CepPackageInfo(String str, String str2, String str3, int i, String str4) {
        JSONObject jSONObject;
        HH1.LIZ(str, "business", str2, "version", str3, "deployment");
        this.business = str;
        this.version = str2;
        this.deployment = str3;
        this.from = i;
        this.extraStr = str4;
        if (str4 == null) {
            jSONObject = null;
        } else {
            jSONObject = new JSONObject(str4);
        }
        this.extra = jSONObject;
    }
}
