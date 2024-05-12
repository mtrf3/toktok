package com.ss.android.ugc.aweme.plugin.personalizednuj;

import X.InterfaceC65349Pkn;
import X.X1D;
import defpackage.s0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class PersonalizedNUJPreloadData {

    @InterfaceC65349Pkn("exp_ab_group")
    public final Integer expABGroup;

    /* JADX WARN: Multi-variable type inference failed */
    public PersonalizedNUJPreloadData() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof PersonalizedNUJPreloadData) && o.LJ(this.expABGroup, ((PersonalizedNUJPreloadData) obj).expABGroup);
    }

    public final int hashCode() {
        Integer num = this.expABGroup;
        if (num == null) {
            return 0;
        }
        return num.hashCode();
    }

    public final boolean LIZ() {
        Integer num;
        Integer num2 = this.expABGroup;
        if ((num2 == null || num2.intValue() != 2) && ((num = this.expABGroup) == null || num.intValue() != 3)) {
            return false;
        }
        return true;
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("PersonalizedNUJPreloadData(expABGroup=");
        return s0.LIZJ(LIZ, this.expABGroup, ')', LIZ);
    }

    public PersonalizedNUJPreloadData(Integer num) {
        this.expABGroup = num;
    }

    public /* synthetic */ PersonalizedNUJPreloadData(Integer num, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? 1 : num);
    }
}
