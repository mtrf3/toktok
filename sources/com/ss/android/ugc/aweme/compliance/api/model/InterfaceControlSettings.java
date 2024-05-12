package com.ss.android.ugc.aweme.compliance.api.model;

import X.C78920UyC;
import X.InterfaceC65349Pkn;
import X.PYH;
import X.PYJ;
import X.X1D;
import java.io.Serializable;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes12.dex */
public final class InterfaceControlSettings implements Serializable {

    @InterfaceC65349Pkn("rules")
    public final List<InterfaceControlRule> rules;

    @InterfaceC65349Pkn("use_new_control")
    public final Boolean useNewControl;

    @InterfaceC65349Pkn("user_type")
    public final String userType;

    @InterfaceC65349Pkn("version")
    public final String version;

    /* JADX WARN: Multi-variable type inference failed */
    public InterfaceControlSettings() {
        this(null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 15, 0 == true ? 1 : 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ InterfaceControlSettings copy$default(InterfaceControlSettings interfaceControlSettings, List list, String str, String str2, Boolean bool, int i, Object obj) {
        if ((i & 1) != 0) {
            list = interfaceControlSettings.rules;
        }
        if ((i & 2) != 0) {
            str = interfaceControlSettings.userType;
        }
        if ((i & 4) != 0) {
            str2 = interfaceControlSettings.version;
        }
        if ((i & 8) != 0) {
            bool = interfaceControlSettings.useNewControl;
        }
        return interfaceControlSettings.copy(list, str, str2, bool);
    }

    public final InterfaceControlSettings copy(List<InterfaceControlRule> list, String str, String str2, Boolean bool) {
        return new InterfaceControlSettings(list, str, str2, bool);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof InterfaceControlSettings)) {
            return false;
        }
        InterfaceControlSettings interfaceControlSettings = (InterfaceControlSettings) obj;
        return o.LJ(this.rules, interfaceControlSettings.rules) && o.LJ(this.userType, interfaceControlSettings.userType) && o.LJ(this.version, interfaceControlSettings.version) && o.LJ(this.useNewControl, interfaceControlSettings.useNewControl);
    }

    public int hashCode() {
        List<InterfaceControlRule> list = this.rules;
        int hashCode = (list == null ? 0 : list.hashCode()) * 31;
        String str = this.userType;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.version;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Boolean bool = this.useNewControl;
        return hashCode3 + (bool != null ? bool.hashCode() : 0);
    }

    public final PYH getUserType() {
        PYJ pyj = PYH.Companion;
        String str = this.userType;
        if (str == null) {
            str = "";
        }
        pyj.getClass();
        PYH pyh = PYH.NOT_LOGIN;
        if (o.LJ(str, pyh.getUserType())) {
            return pyh;
        }
        PYH pyh2 = PYH.NORMAL;
        if (o.LJ(str, pyh2.getUserType())) {
            return pyh2;
        }
        PYH pyh3 = PYH.CHILD_US;
        if (o.LJ(str, pyh3.getUserType()) || o.LJ(str, PYH.CHILD_OTHERS.getUserType())) {
            return pyh3;
        }
        return PYH.UNKNOWN;
    }

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("InterfaceControlSettings(rules=");
        LIZ.append(this.rules);
        LIZ.append(", userType=");
        LIZ.append(this.userType);
        LIZ.append(", version=");
        LIZ.append(this.version);
        LIZ.append(", useNewControl=");
        return C78920UyC.LIZIZ(LIZ, this.useNewControl, ')', LIZ);
    }

    public final List<InterfaceControlRule> getRules() {
        return this.rules;
    }

    public final Boolean getUseNewControl() {
        return this.useNewControl;
    }

    public final String getVersion() {
        return this.version;
    }

    /* renamed from: getUserType, reason: collision with other method in class */
    public final String m106getUserType() {
        return this.userType;
    }

    public InterfaceControlSettings(List<InterfaceControlRule> list, String str, String str2, Boolean bool) {
        this.rules = list;
        this.userType = str;
        this.version = str2;
        this.useNewControl = bool;
    }

    public /* synthetic */ InterfaceControlSettings(List list, String str, String str2, Boolean bool, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : list, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : str2, (i & 8) != 0 ? null : bool);
    }
}
