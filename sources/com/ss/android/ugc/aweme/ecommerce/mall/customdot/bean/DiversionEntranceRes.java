package com.ss.android.ugc.aweme.ecommerce.mall.customdot.bean;

import X.InterfaceC65349Pkn;
import X.X1D;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public final class DiversionEntranceRes {

    @InterfaceC65349Pkn("config")
    public final DiversionEntranceResCfg config;

    @InterfaceC65349Pkn("name")
    public final String name;

    @InterfaceC65349Pkn("type")
    public final String type;

    public static /* synthetic */ DiversionEntranceRes copy$default(DiversionEntranceRes diversionEntranceRes, String str, String str2, DiversionEntranceResCfg diversionEntranceResCfg, int i, Object obj) {
        if ((i & 1) != 0) {
            str = diversionEntranceRes.name;
        }
        if ((i & 2) != 0) {
            str2 = diversionEntranceRes.type;
        }
        if ((i & 4) != 0) {
            diversionEntranceResCfg = diversionEntranceRes.config;
        }
        return diversionEntranceRes.copy(str, str2, diversionEntranceResCfg);
    }

    public final DiversionEntranceRes copy(String str, String str2, DiversionEntranceResCfg diversionEntranceResCfg) {
        return new DiversionEntranceRes(str, str2, diversionEntranceResCfg);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DiversionEntranceRes)) {
            return false;
        }
        DiversionEntranceRes diversionEntranceRes = (DiversionEntranceRes) obj;
        return o.LJ(this.name, diversionEntranceRes.name) && o.LJ(this.type, diversionEntranceRes.type) && o.LJ(this.config, diversionEntranceRes.config);
    }

    public int hashCode() {
        String str = this.name;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.type;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        DiversionEntranceResCfg diversionEntranceResCfg = this.config;
        return hashCode2 + (diversionEntranceResCfg != null ? diversionEntranceResCfg.hashCode() : 0);
    }

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("DiversionEntranceRes(name=");
        LIZ.append(this.name);
        LIZ.append(", type=");
        LIZ.append(this.type);
        LIZ.append(", config=");
        LIZ.append(this.config);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    public final DiversionEntranceResCfg getConfig() {
        return this.config;
    }

    public final String getName() {
        return this.name;
    }

    public final String getType() {
        return this.type;
    }

    public DiversionEntranceRes(String str, String str2, DiversionEntranceResCfg diversionEntranceResCfg) {
        this.name = str;
        this.type = str2;
        this.config = diversionEntranceResCfg;
    }
}
