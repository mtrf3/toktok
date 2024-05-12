package com.ss.android.ugc.aweme.ecommerce.mall.customdot.bean;

import X.InterfaceC65349Pkn;
import X.X1D;
import defpackage.q;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public final class DaParams {

    @InterfaceC65349Pkn("bubble_text_type")
    public final String bubbleTextType;

    @InterfaceC65349Pkn("bubble_type")
    public final String bubbleType;

    /* JADX WARN: Multi-variable type inference failed */
    public DaParams() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ DaParams copy$default(DaParams daParams, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = daParams.bubbleTextType;
        }
        if ((i & 2) != 0) {
            str2 = daParams.bubbleType;
        }
        return daParams.copy(str, str2);
    }

    public final DaParams copy(String str, String str2) {
        return new DaParams(str, str2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DaParams)) {
            return false;
        }
        DaParams daParams = (DaParams) obj;
        return o.LJ(this.bubbleTextType, daParams.bubbleTextType) && o.LJ(this.bubbleType, daParams.bubbleType);
    }

    public int hashCode() {
        String str = this.bubbleTextType;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.bubbleType;
        return hashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("DaParams(bubbleTextType=");
        LIZ.append(this.bubbleTextType);
        LIZ.append(", bubbleType=");
        return q.LIZIZ(LIZ, this.bubbleType, ')', LIZ);
    }

    public final String getBubbleTextType() {
        return this.bubbleTextType;
    }

    public final String getBubbleType() {
        return this.bubbleType;
    }

    public DaParams(String str, String str2) {
        this.bubbleTextType = str;
        this.bubbleType = str2;
    }

    public /* synthetic */ DaParams(String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2);
    }
}
