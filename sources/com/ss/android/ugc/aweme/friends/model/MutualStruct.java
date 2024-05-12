package com.ss.android.ugc.aweme.friends.model;

import X.InterfaceC65349Pkn;
import X.X1D;
import defpackage.b0;
import java.io.Serializable;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes4.dex */
public final class MutualStruct implements Serializable {

    @InterfaceC65349Pkn("mutual_tag_is_hidden")
    public int isMutualTagHidden;

    @InterfaceC65349Pkn("mutual_type")
    public int mutualType;

    @InterfaceC65349Pkn("total")
    public int total;

    @InterfaceC65349Pkn("user_list")
    public List<MutualUser> userList;

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public MutualStruct() {
        /*
            r7 = this;
            r1 = 0
            r3 = 0
            r5 = 15
            r0 = r7
            r2 = r1
            r4 = r1
            r6 = r3
            r0.<init>(r1, r2, r3, r4, r5, r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.friends.model.MutualStruct.<init>():void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ MutualStruct copy$default(MutualStruct mutualStruct, int i, int i2, List list, int i3, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            i = mutualStruct.mutualType;
        }
        if ((i4 & 2) != 0) {
            i2 = mutualStruct.total;
        }
        if ((i4 & 4) != 0) {
            list = mutualStruct.userList;
        }
        if ((i4 & 8) != 0) {
            i3 = mutualStruct.isMutualTagHidden;
        }
        return mutualStruct.copy(i, i2, list, i3);
    }

    public final MutualStruct copy(int i, int i2, List<MutualUser> list, int i3) {
        return new MutualStruct(i, i2, list, i3);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MutualStruct)) {
            return false;
        }
        MutualStruct mutualStruct = (MutualStruct) obj;
        return this.mutualType == mutualStruct.mutualType && this.total == mutualStruct.total && o.LJ(this.userList, mutualStruct.userList) && this.isMutualTagHidden == mutualStruct.isMutualTagHidden;
    }

    public int hashCode() {
        int i = ((this.mutualType * 31) + this.total) * 31;
        List<MutualUser> list = this.userList;
        return ((i + (list == null ? 0 : list.hashCode())) * 31) + this.isMutualTagHidden;
    }

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("MutualStruct(mutualType=");
        LIZ.append(this.mutualType);
        LIZ.append(", total=");
        LIZ.append(this.total);
        LIZ.append(", userList=");
        LIZ.append(this.userList);
        LIZ.append(", isMutualTagHidden=");
        return b0.LIZJ(LIZ, this.isMutualTagHidden, ')', LIZ);
    }

    public final int getMutualType() {
        return this.mutualType;
    }

    public final int getTotal() {
        return this.total;
    }

    public final List<MutualUser> getUserList() {
        return this.userList;
    }

    public final int isMutualTagHidden() {
        return this.isMutualTagHidden;
    }

    public MutualStruct(int i, int i2, List<MutualUser> list, int i3) {
        this.mutualType = i;
        this.total = i2;
        this.userList = list;
        this.isMutualTagHidden = i3;
    }

    public /* synthetic */ MutualStruct(int i, int i2, List list, int i3, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this((i4 & 1) != 0 ? 0 : i, (i4 & 2) != 0 ? 0 : i2, (i4 & 4) != 0 ? null : list, (i4 & 8) != 0 ? 0 : i3);
    }
}
