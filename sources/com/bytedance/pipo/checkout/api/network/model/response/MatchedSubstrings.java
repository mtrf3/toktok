package com.bytedance.pipo.checkout.api.network.model.response;

import X.InterfaceC65349Pkn;
import X.X1D;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes20.dex */
public final class MatchedSubstrings {

    @InterfaceC65349Pkn("length")
    public final Integer length;

    @InterfaceC65349Pkn("offset")
    public final Integer offset;

    /* JADX WARN: Multi-variable type inference failed */
    public MatchedSubstrings() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ MatchedSubstrings copy$default(MatchedSubstrings matchedSubstrings, Integer num, Integer num2, int i, Object obj) {
        if ((i & 1) != 0) {
            num = matchedSubstrings.offset;
        }
        if ((i & 2) != 0) {
            num2 = matchedSubstrings.length;
        }
        return matchedSubstrings.copy(num, num2);
    }

    public final MatchedSubstrings copy(Integer num, Integer num2) {
        return new MatchedSubstrings(num, num2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MatchedSubstrings)) {
            return false;
        }
        MatchedSubstrings matchedSubstrings = (MatchedSubstrings) obj;
        return o.LJ(this.offset, matchedSubstrings.offset) && o.LJ(this.length, matchedSubstrings.length);
    }

    public int hashCode() {
        Integer num = this.offset;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        Integer num2 = this.length;
        return hashCode + (num2 != null ? num2.hashCode() : 0);
    }

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("MatchedSubstrings(offset=");
        LIZ.append(this.offset);
        LIZ.append(", length=");
        LIZ.append(this.length);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    public final Integer getLength() {
        return this.length;
    }

    public final Integer getOffset() {
        return this.offset;
    }

    public MatchedSubstrings(Integer num, Integer num2) {
        this.offset = num;
        this.length = num2;
    }

    public /* synthetic */ MatchedSubstrings(Integer num, Integer num2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : num, (i & 2) != 0 ? null : num2);
    }
}
