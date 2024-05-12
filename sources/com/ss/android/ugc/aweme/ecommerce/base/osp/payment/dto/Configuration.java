package com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto;

import X.InterfaceC65349Pkn;
import X.X1D;
import defpackage.q;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class Configuration {

    @InterfaceC65349Pkn("input_type")
    public final Integer inputType;

    @InterfaceC65349Pkn("line_break")
    public final Boolean lineBreak;

    @InterfaceC65349Pkn("max_length")
    public final Integer maxLength;

    @InterfaceC65349Pkn("prefix")
    public final String prefix;

    /* JADX WARN: Multi-variable type inference failed */
    public Configuration() {
        this(null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 15, 0 == true ? 1 : 0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Configuration)) {
            return false;
        }
        Configuration configuration = (Configuration) obj;
        return o.LJ(this.maxLength, configuration.maxLength) && o.LJ(this.inputType, configuration.inputType) && o.LJ(this.lineBreak, configuration.lineBreak) && o.LJ(this.prefix, configuration.prefix);
    }

    public final int hashCode() {
        Integer num = this.maxLength;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        Integer num2 = this.inputType;
        int hashCode2 = (hashCode + (num2 == null ? 0 : num2.hashCode())) * 31;
        Boolean bool = this.lineBreak;
        int hashCode3 = (hashCode2 + (bool == null ? 0 : bool.hashCode())) * 31;
        String str = this.prefix;
        return hashCode3 + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("Configuration(maxLength=");
        LIZ.append(this.maxLength);
        LIZ.append(", inputType=");
        LIZ.append(this.inputType);
        LIZ.append(", lineBreak=");
        LIZ.append(this.lineBreak);
        LIZ.append(", prefix=");
        return q.LIZIZ(LIZ, this.prefix, ')', LIZ);
    }

    public Configuration(Integer num, Integer num2, Boolean bool, String str) {
        this.maxLength = num;
        this.inputType = num2;
        this.lineBreak = bool;
        this.prefix = str;
    }

    public /* synthetic */ Configuration(Integer num, Integer num2, Boolean bool, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : num, (i & 2) != 0 ? null : num2, (i & 4) != 0 ? Boolean.FALSE : bool, (i & 8) != 0 ? null : str);
    }
}
