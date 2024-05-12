package com.ss.android.ugc.aweme.plugin.clienttrigger;

import X.InterfaceC65349Pkn;
import X.V0N;
import X.X1D;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class MatchProperty {

    @InterfaceC65349Pkn("number_match")
    public final NumberMatchProperties numberMatchProperties;

    @InterfaceC65349Pkn("name")
    public final String propertyName;

    @InterfaceC65349Pkn("string_match")
    public final StringMatchProperties stringMatchProperties;

    @InterfaceC65349Pkn("type")
    public final MatchTypeEnum type;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MatchProperty)) {
            return false;
        }
        MatchProperty matchProperty = (MatchProperty) obj;
        return o.LJ(this.propertyName, matchProperty.propertyName) && this.type == matchProperty.type && o.LJ(this.stringMatchProperties, matchProperty.stringMatchProperties) && o.LJ(this.numberMatchProperties, matchProperty.numberMatchProperties);
    }

    public final int hashCode() {
        int hashCode = (this.type.hashCode() + (this.propertyName.hashCode() * 31)) * 31;
        StringMatchProperties stringMatchProperties = this.stringMatchProperties;
        int hashCode2 = (hashCode + (stringMatchProperties == null ? 0 : stringMatchProperties.hashCode())) * 31;
        NumberMatchProperties numberMatchProperties = this.numberMatchProperties;
        return hashCode2 + (numberMatchProperties != null ? numberMatchProperties.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("MatchProperty(propertyName=");
        LIZ.append(this.propertyName);
        LIZ.append(", type=");
        LIZ.append(this.type);
        LIZ.append(", stringMatchProperties=");
        LIZ.append(this.stringMatchProperties);
        LIZ.append(", numberMatchProperties=");
        LIZ.append(this.numberMatchProperties);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    /* loaded from: classes7.dex */
    public enum MatchTypeEnum {
        StringMatch(1),
        NumberMatch(2);

        public final int LJLIL;

        public static MatchTypeEnum valueOf(String str) {
            return (MatchTypeEnum) V0N.LJJJ(MatchTypeEnum.class, str);
        }

        public final int getValue() {
            return this.LJLIL;
        }

        MatchTypeEnum(int i) {
            this.LJLIL = i;
        }
    }

    public MatchProperty(String propertyName, MatchTypeEnum type, StringMatchProperties stringMatchProperties, NumberMatchProperties numberMatchProperties) {
        o.LJIIIZ(propertyName, "propertyName");
        o.LJIIIZ(type, "type");
        this.propertyName = propertyName;
        this.type = type;
        this.stringMatchProperties = stringMatchProperties;
        this.numberMatchProperties = numberMatchProperties;
    }

    public /* synthetic */ MatchProperty(String str, MatchTypeEnum matchTypeEnum, StringMatchProperties stringMatchProperties, NumberMatchProperties numberMatchProperties, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, matchTypeEnum, (i & 4) != 0 ? null : stringMatchProperties, (i & 8) != 0 ? null : numberMatchProperties);
    }
}
