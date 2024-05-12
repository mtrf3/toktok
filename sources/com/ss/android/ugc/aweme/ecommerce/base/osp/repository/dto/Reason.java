package com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto;

import X.InterfaceC65349Pkn;
import X.X1D;
import defpackage.s0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class Reason {

    @InterfaceC65349Pkn("description")
    public final String description;

    @InterfaceC65349Pkn("description_limit")
    public final Integer descriptionLimit;

    @InterfaceC65349Pkn("reason_key")
    public final String reasonKey;

    @InterfaceC65349Pkn("reason_type")
    public final Integer reasonType;

    @InterfaceC65349Pkn("title")
    public final String title;

    /* JADX WARN: Multi-variable type inference failed */
    public Reason() {
        this(null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 31, 0 == true ? 1 : 0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Reason)) {
            return false;
        }
        Reason reason = (Reason) obj;
        return o.LJ(this.reasonType, reason.reasonType) && o.LJ(this.reasonKey, reason.reasonKey) && o.LJ(this.title, reason.title) && o.LJ(this.description, reason.description) && o.LJ(this.descriptionLimit, reason.descriptionLimit);
    }

    public final int hashCode() {
        Integer num = this.reasonType;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        String str = this.reasonKey;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.title;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.description;
        int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Integer num2 = this.descriptionLimit;
        return hashCode4 + (num2 != null ? num2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("Reason(reasonType=");
        LIZ.append(this.reasonType);
        LIZ.append(", reasonKey=");
        LIZ.append(this.reasonKey);
        LIZ.append(", title=");
        LIZ.append(this.title);
        LIZ.append(", description=");
        LIZ.append(this.description);
        LIZ.append(", descriptionLimit=");
        return s0.LIZJ(LIZ, this.descriptionLimit, ')', LIZ);
    }

    public Reason(Integer num, String str, String str2, String str3, Integer num2) {
        this.reasonType = num;
        this.reasonKey = str;
        this.title = str2;
        this.description = str3;
        this.descriptionLimit = num2;
    }

    public /* synthetic */ Reason(Integer num, String str, String str2, String str3, Integer num2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? 1 : num, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : str2, (i & 8) == 0 ? str3 : null, (i & 16) != 0 ? 200 : num2);
    }
}
