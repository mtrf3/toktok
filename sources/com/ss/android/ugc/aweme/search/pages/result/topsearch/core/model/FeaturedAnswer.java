package com.ss.android.ugc.aweme.search.pages.result.topsearch.core.model;

import X.InterfaceC65349Pkn;
import X.X1D;
import defpackage.s0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public final class FeaturedAnswer {

    @InterfaceC65349Pkn("desc")
    public final String desc;

    @InterfaceC65349Pkn("display_type")
    public final Integer displayType;

    /* JADX WARN: Multi-variable type inference failed */
    public FeaturedAnswer() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FeaturedAnswer)) {
            return false;
        }
        FeaturedAnswer featuredAnswer = (FeaturedAnswer) obj;
        return o.LJ(this.desc, featuredAnswer.desc) && o.LJ(this.displayType, featuredAnswer.displayType);
    }

    public final int hashCode() {
        String str = this.desc;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        Integer num = this.displayType;
        return hashCode + (num != null ? num.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("FeaturedAnswer(desc=");
        LIZ.append(this.desc);
        LIZ.append(", displayType=");
        return s0.LIZJ(LIZ, this.displayType, ')', LIZ);
    }

    public FeaturedAnswer(String str, Integer num) {
        this.desc = str;
        this.displayType = num;
    }

    public /* synthetic */ FeaturedAnswer(String str, Integer num, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : num);
    }
}
