package com.ss.android.ugc.aweme.simkit.impl.bitrateselector;

import X.C1NE;
import X.C47056IdQ;
import X.C47057IdR;
import X.C47058IdS;
import X.C47059IdT;
import X.C47060IdU;
import X.C47261Igj;
import X.IYN;
import X.InterfaceC65349Pkn;
import X.OJ4;
import X.ORZ;
import X.X1D;
import java.util.List;
import kotlin.jvm.internal.AqS174S0100000_8;
import kotlin.jvm.internal.o;

/* loaded from: classes9.dex */
public final class Filter {

    @InterfaceC65349Pkn("allow_gears")
    public final List<String> allowGears;

    @InterfaceC65349Pkn("allow_group")
    public final List<FilterGroup> allowGroup;

    @InterfaceC65349Pkn("forbidden_gears")
    public final List<String> forbiddenGears;

    @InterfaceC65349Pkn("forbidden_group")
    public final List<FilterGroup> forbiddenGroup;

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Filter copy$default(Filter filter, List list, List list2, List list3, List list4, int i, Object obj) {
        if ((i & 1) != 0) {
            list = filter.forbiddenGears;
        }
        if ((i & 2) != 0) {
            list2 = filter.allowGears;
        }
        if ((i & 4) != 0) {
            list3 = filter.forbiddenGroup;
        }
        if ((i & 8) != 0) {
            list4 = filter.allowGroup;
        }
        return filter.copy(list, list2, list3, list4);
    }

    public final Filter copy(List<String> list, List<String> list2, List<FilterGroup> list3, List<FilterGroup> list4) {
        return new Filter(list, list2, list3, list4);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Filter)) {
            return false;
        }
        Filter filter = (Filter) obj;
        return o.LJ(this.forbiddenGears, filter.forbiddenGears) && o.LJ(this.allowGears, filter.allowGears) && o.LJ(this.forbiddenGroup, filter.forbiddenGroup) && o.LJ(this.allowGroup, filter.allowGroup);
    }

    public int hashCode() {
        List<String> list = this.forbiddenGears;
        int hashCode = (list == null ? 0 : list.hashCode()) * 31;
        List<String> list2 = this.allowGears;
        int hashCode2 = (hashCode + (list2 == null ? 0 : list2.hashCode())) * 31;
        List<FilterGroup> list3 = this.forbiddenGroup;
        int hashCode3 = (hashCode2 + (list3 == null ? 0 : list3.hashCode())) * 31;
        List<FilterGroup> list4 = this.allowGroup;
        return hashCode3 + (list4 != null ? list4.hashCode() : 0);
    }

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("Filter(forbiddenGears=");
        LIZ.append(this.forbiddenGears);
        LIZ.append(", allowGears=");
        LIZ.append(this.allowGears);
        LIZ.append(", forbiddenGroup=");
        LIZ.append(this.forbiddenGroup);
        LIZ.append(", allowGroup=");
        return C1NE.LIZIZ(LIZ, this.allowGroup, ')', LIZ);
    }

    public final List<String> getAllowGears() {
        return this.allowGears;
    }

    public final List<FilterGroup> getAllowGroup() {
        return this.allowGroup;
    }

    public final List<String> getForbiddenGears() {
        return this.forbiddenGears;
    }

    public final List<FilterGroup> getForbiddenGroup() {
        return this.forbiddenGroup;
    }

    public final <T extends IYN> List<T> filter(List<? extends T> bitrateList) {
        o.LJIIIZ(bitrateList, "bitrateList");
        List<T> LJJIJLIJ = C47261Igj.LJJIJLIJ(OJ4.LJJLIIIJ(OJ4.LJJJLIIL(OJ4.LJJJJ(OJ4.LJJJLIIL(OJ4.LJJJJ(OJ4.LJJJLIIL(OJ4.LJJJJ(OJ4.LJJJLIIL(OJ4.LJJJJI(OJ4.LJJJLIIL(ORZ.LJLIIIL(bitrateList), C47056IdQ.LJLIL), new AqS174S0100000_8(this, 132)), C47057IdR.LJLIL), new AqS174S0100000_8(this, 133)), C47058IdS.LJLIL), new AqS174S0100000_8(this, 134)), C47059IdT.LJLIL), new AqS174S0100000_8(this, 135)), C47060IdU.LJLIL)));
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("end: ");
        LIZ.append(LJJIJLIJ.size());
        LIZ.append(" ================================ ");
        X1D.LIZIZ(LIZ);
        return LJJIJLIJ;
    }

    public Filter(List<String> list, List<String> list2, List<FilterGroup> list3, List<FilterGroup> list4) {
        this.forbiddenGears = list;
        this.allowGears = list2;
        this.forbiddenGroup = list3;
        this.allowGroup = list4;
    }
}
