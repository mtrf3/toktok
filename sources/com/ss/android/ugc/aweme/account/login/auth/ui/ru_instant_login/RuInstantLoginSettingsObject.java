package com.ss.android.ugc.aweme.account.login.auth.ui.ru_instant_login;

import X.C1NE;
import X.InterfaceC65349Pkn;
import X.X1D;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class RuInstantLoginSettingsObject {

    @InterfaceC65349Pkn("si_config")
    public final RealConfig siConfig;

    /* JADX WARN: Multi-variable type inference failed */
    public RuInstantLoginSettingsObject() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof RuInstantLoginSettingsObject) && o.LJ(this.siConfig, ((RuInstantLoginSettingsObject) obj).siConfig);
    }

    public final int hashCode() {
        RealConfig realConfig = this.siConfig;
        if (realConfig == null) {
            return 0;
        }
        return realConfig.hashCode();
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("RuInstantLoginSettingsObject(siConfig=");
        LIZ.append(this.siConfig);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    /* loaded from: classes7.dex */
    public static final class RealConfig {

        @InterfaceC65349Pkn("mccmnc")
        public final List<String> mccmncList;

        @InterfaceC65349Pkn("type")
        public final int type;

        /* JADX WARN: Multi-variable type inference failed */
        public RealConfig() {
            this(0, null, 3, 0 == true ? 1 : 0);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof RealConfig)) {
                return false;
            }
            RealConfig realConfig = (RealConfig) obj;
            return this.type == realConfig.type && o.LJ(this.mccmncList, realConfig.mccmncList);
        }

        public final int hashCode() {
            int i = this.type * 31;
            List<String> list = this.mccmncList;
            return i + (list == null ? 0 : list.hashCode());
        }

        public final String toString() {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("RealConfig(type=");
            LIZ.append(this.type);
            LIZ.append(", mccmncList=");
            return C1NE.LIZIZ(LIZ, this.mccmncList, ')', LIZ);
        }

        public RealConfig(int i, List<String> list) {
            this.type = i;
            this.mccmncList = list;
        }

        public /* synthetic */ RealConfig(int i, List list, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this((i2 & 1) != 0 ? 0 : i, (i2 & 2) != 0 ? null : list);
        }
    }

    public RuInstantLoginSettingsObject(RealConfig realConfig) {
        this.siConfig = realConfig;
    }

    public /* synthetic */ RuInstantLoginSettingsObject(RealConfig realConfig, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : realConfig);
    }
}
