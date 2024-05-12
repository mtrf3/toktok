package com.ss.android.ugc.aweme.setting.serverpush.model;

import X.C1NE;
import X.InterfaceC65349Pkn;
import X.X1D;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class PushOffReasonsData {

    @InterfaceC65349Pkn("desc")
    public final String description;

    @InterfaceC65349Pkn("frequency")
    public final int interval;

    @InterfaceC65349Pkn("reason")
    public final List<PushOffReason> reasonsList;

    @InterfaceC65349Pkn("title")
    public final String title;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PushOffReasonsData)) {
            return false;
        }
        PushOffReasonsData pushOffReasonsData = (PushOffReasonsData) obj;
        return this.interval == pushOffReasonsData.interval && o.LJ(this.title, pushOffReasonsData.title) && o.LJ(this.description, pushOffReasonsData.description) && o.LJ(this.reasonsList, pushOffReasonsData.reasonsList);
    }

    public final int hashCode() {
        int i = this.interval * 31;
        String str = this.title;
        int hashCode = (i + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.description;
        return this.reasonsList.hashCode() + ((hashCode + (str2 != null ? str2.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("PushOffReasonsData(interval=");
        LIZ.append(this.interval);
        LIZ.append(", title=");
        LIZ.append(this.title);
        LIZ.append(", description=");
        LIZ.append(this.description);
        LIZ.append(", reasonsList=");
        return C1NE.LIZIZ(LIZ, this.reasonsList, ')', LIZ);
    }

    public PushOffReasonsData(int i, String str, String str2, List<PushOffReason> reasonsList) {
        o.LJIIIZ(reasonsList, "reasonsList");
        this.interval = i;
        this.title = str;
        this.description = str2;
        this.reasonsList = reasonsList;
    }

    public /* synthetic */ PushOffReasonsData(int i, String str, String str2, List list, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? Integer.MAX_VALUE : i, (i2 & 2) != 0 ? null : str, (i2 & 4) != 0 ? null : str2, list);
    }
}
