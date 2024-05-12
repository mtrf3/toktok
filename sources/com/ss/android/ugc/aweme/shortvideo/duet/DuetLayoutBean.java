package com.ss.android.ugc.aweme.shortvideo.duet;

import X.C1NE;
import X.InterfaceC65349Pkn;
import X.X1D;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class DuetLayoutBean {

    @InterfaceC65349Pkn("change_direction_mode")
    public final int changeDirectionMode;

    @InterfaceC65349Pkn("direction_status")
    public final List<String> directionStatus;

    @InterfaceC65349Pkn("name")
    public final String name;

    @InterfaceC65349Pkn("safety_status")
    public final List<String> safetyStatus;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DuetLayoutBean)) {
            return false;
        }
        DuetLayoutBean duetLayoutBean = (DuetLayoutBean) obj;
        return o.LJ(this.name, duetLayoutBean.name) && this.changeDirectionMode == duetLayoutBean.changeDirectionMode && o.LJ(this.directionStatus, duetLayoutBean.directionStatus) && o.LJ(this.safetyStatus, duetLayoutBean.safetyStatus);
    }

    public final int hashCode() {
        int hashCode = ((this.name.hashCode() * 31) + this.changeDirectionMode) * 31;
        List<String> list = this.directionStatus;
        return this.safetyStatus.hashCode() + ((hashCode + (list == null ? 0 : list.hashCode())) * 31);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("DuetLayoutBean(name=");
        LIZ.append(this.name);
        LIZ.append(", changeDirectionMode=");
        LIZ.append(this.changeDirectionMode);
        LIZ.append(", directionStatus=");
        LIZ.append(this.directionStatus);
        LIZ.append(", safetyStatus=");
        return C1NE.LIZIZ(LIZ, this.safetyStatus, ')', LIZ);
    }

    public DuetLayoutBean(String name, int i, List<String> list, List<String> safetyStatus) {
        o.LJIIIZ(name, "name");
        o.LJIIIZ(safetyStatus, "safetyStatus");
        this.name = name;
        this.changeDirectionMode = i;
        this.directionStatus = list;
        this.safetyStatus = safetyStatus;
    }
}
