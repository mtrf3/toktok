package com.ss.android.ugc.aweme.ecommerce.mall.customdot.bean;

import X.InterfaceC65349Pkn;
import X.X1D;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public final class DiversionTargetRes {

    @InterfaceC65349Pkn("config")
    public final DiversionTargetResCfg config;

    @InterfaceC65349Pkn("name")
    public final String name;

    @InterfaceC65349Pkn("type")
    public final String type;

    @InterfaceC65349Pkn("uuid")
    public final String uuid;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DiversionTargetRes)) {
            return false;
        }
        DiversionTargetRes diversionTargetRes = (DiversionTargetRes) obj;
        return o.LJ(this.uuid, diversionTargetRes.uuid) && o.LJ(this.name, diversionTargetRes.name) && o.LJ(this.type, diversionTargetRes.type) && o.LJ(this.config, diversionTargetRes.config);
    }

    public final int hashCode() {
        String str = this.uuid;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.name;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.type;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        DiversionTargetResCfg diversionTargetResCfg = this.config;
        return hashCode3 + (diversionTargetResCfg != null ? diversionTargetResCfg.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("DiversionTargetRes(uuid=");
        LIZ.append(this.uuid);
        LIZ.append(", name=");
        LIZ.append(this.name);
        LIZ.append(", type=");
        LIZ.append(this.type);
        LIZ.append(", config=");
        LIZ.append(this.config);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    public DiversionTargetRes(String str, String str2, String str3, DiversionTargetResCfg diversionTargetResCfg) {
        this.uuid = str;
        this.name = str2;
        this.type = str3;
        this.config = diversionTargetResCfg;
    }
}
