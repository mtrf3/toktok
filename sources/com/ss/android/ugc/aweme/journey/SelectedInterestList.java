package com.ss.android.ugc.aweme.journey;

import X.InterfaceC65349Pkn;
import X.X1D;
import com.ss.android.ugc.aweme.plugin.journey.NewUserInterestStruct;
import defpackage.s0;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public final class SelectedInterestList {

    @InterfaceC65349Pkn("interest_list")
    public final List<NewUserInterestStruct> interest_list;

    @InterfaceC65349Pkn("select_duration")
    public final Integer select_duration;

    @InterfaceC65349Pkn("select_interest_type")
    public final Integer select_interest_type;

    @InterfaceC65349Pkn("special_type")
    public final Integer special_type;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SelectedInterestList)) {
            return false;
        }
        SelectedInterestList selectedInterestList = (SelectedInterestList) obj;
        return o.LJ(this.interest_list, selectedInterestList.interest_list) && o.LJ(this.special_type, selectedInterestList.special_type) && o.LJ(this.select_duration, selectedInterestList.select_duration) && o.LJ(this.select_interest_type, selectedInterestList.select_interest_type);
    }

    public final int hashCode() {
        List<NewUserInterestStruct> list = this.interest_list;
        int hashCode = (list == null ? 0 : list.hashCode()) * 31;
        Integer num = this.special_type;
        int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.select_duration;
        int hashCode3 = (hashCode2 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.select_interest_type;
        return hashCode3 + (num3 != null ? num3.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("SelectedInterestList(interest_list=");
        LIZ.append(this.interest_list);
        LIZ.append(", special_type=");
        LIZ.append(this.special_type);
        LIZ.append(", select_duration=");
        LIZ.append(this.select_duration);
        LIZ.append(", select_interest_type=");
        return s0.LIZJ(LIZ, this.select_interest_type, ')', LIZ);
    }

    public SelectedInterestList(List<NewUserInterestStruct> list, Integer num, Integer num2, Integer num3) {
        this.interest_list = list;
        this.special_type = num;
        this.select_duration = num2;
        this.select_interest_type = num3;
    }

    public /* synthetic */ SelectedInterestList(List list, Integer num, Integer num2, Integer num3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(list, num, (i & 4) != 0 ? 0 : num2, (i & 8) != 0 ? 0 : num3);
    }
}
