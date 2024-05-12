package com.ss.android.ugc.aweme.plugin.clienttrigger;

import X.F9E;
import X.InterfaceC65349Pkn;
import X.V0N;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class NumberMatchProperties extends F9E {

    @InterfaceC65349Pkn("match_type")
    public final DoubleMatchType matchType;

    @InterfaceC65349Pkn("value")
    public final double value;

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{Double.valueOf(this.value), this.matchType};
    }

    /* loaded from: classes7.dex */
    public enum DoubleMatchType {
        Equals(0),
        GreaterThan(1),
        GreatThanOrEquals(2),
        LessThan(3),
        LessThanOrEquals(4);

        public final int LJLIL;

        public static DoubleMatchType valueOf(String str) {
            return (DoubleMatchType) V0N.LJJJ(DoubleMatchType.class, str);
        }

        public final int getValue() {
            return this.LJLIL;
        }

        DoubleMatchType(int i) {
            this.LJLIL = i;
        }
    }

    public NumberMatchProperties(double d, DoubleMatchType matchType) {
        o.LJIIIZ(matchType, "matchType");
        this.value = d;
        this.matchType = matchType;
    }
}
