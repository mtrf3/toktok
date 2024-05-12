package com.ss.android.ugc.aweme.plugin.clienttrigger;

import X.F9E;
import X.InterfaceC65349Pkn;
import X.V0N;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class StringMatchProperties extends F9E {

    @InterfaceC65349Pkn("match_type")
    public final StringMatchType matchType;

    @InterfaceC65349Pkn("value")
    public final String value;

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{this.value, this.matchType};
    }

    /* loaded from: classes7.dex */
    public enum StringMatchType {
        Equals(0),
        GreaterThan(1),
        GreatThanOrEquals(2),
        LessThan(3),
        LessThanOrEquals(4),
        Contains(5),
        ContainedIn(6);

        public final int LJLIL;

        public static StringMatchType valueOf(String str) {
            return (StringMatchType) V0N.LJJJ(StringMatchType.class, str);
        }

        public final int getValue() {
            return this.LJLIL;
        }

        StringMatchType(int i) {
            this.LJLIL = i;
        }
    }

    public StringMatchProperties(String value, StringMatchType matchType) {
        o.LJIIIZ(value, "value");
        o.LJIIIZ(matchType, "matchType");
        this.value = value;
        this.matchType = matchType;
    }
}
