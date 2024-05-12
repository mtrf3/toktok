package com.ss.android.ugc.aweme.plugin.journey;

import X.C48339Iy7;
import X.InterfaceC65349Pkn;
import X.X1D;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public final class NewUserInterestPageStruct {
    public final boolean LIZ;

    @InterfaceC65349Pkn("interest_list")
    public final List<NewUserInterestStruct> interest_list;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof NewUserInterestPageStruct)) {
            return false;
        }
        NewUserInterestPageStruct newUserInterestPageStruct = (NewUserInterestPageStruct) obj;
        return o.LJ(this.interest_list, newUserInterestPageStruct.interest_list) && this.LIZ == newUserInterestPageStruct.LIZ;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        List<NewUserInterestStruct> list = this.interest_list;
        int hashCode = (list == null ? 0 : list.hashCode()) * 31;
        boolean z = this.LIZ;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        return hashCode + i;
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("NewUserInterestPageStruct(interest_list=");
        LIZ.append(this.interest_list);
        LIZ.append(", isDefault=");
        return C48339Iy7.LIZJ(LIZ, this.LIZ, ')', LIZ);
    }

    public NewUserInterestPageStruct(List<NewUserInterestStruct> list, boolean z) {
        this.interest_list = list;
        this.LIZ = z;
    }

    public /* synthetic */ NewUserInterestPageStruct(List list, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(list, (i & 2) != 0 ? false : z);
    }
}
