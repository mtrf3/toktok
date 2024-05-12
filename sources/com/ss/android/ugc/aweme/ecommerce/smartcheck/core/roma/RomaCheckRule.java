package com.ss.android.ugc.aweme.ecommerce.smartcheck.core.roma;

import X.C1NE;
import X.InterfaceC65349Pkn;
import X.X1D;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class RomaCheckRule {

    @InterfaceC65349Pkn("mainKey")
    public final String mainKey;

    @InterfaceC65349Pkn("moreKeys")
    public final List<String> moreKeys;

    @InterfaceC65349Pkn("patternId")
    public final int patternId;

    /* JADX WARN: Multi-variable type inference failed */
    public RomaCheckRule() {
        this(null, 0, 0 == true ? 1 : 0, 7, 0 == true ? 1 : 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ RomaCheckRule copy$default(RomaCheckRule romaCheckRule, String str, int i, List list, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = romaCheckRule.mainKey;
        }
        if ((i2 & 2) != 0) {
            i = romaCheckRule.patternId;
        }
        if ((i2 & 4) != 0) {
            list = romaCheckRule.moreKeys;
        }
        return romaCheckRule.copy(str, i, list);
    }

    public final RomaCheckRule copy(String mainKey, int i, List<String> list) {
        o.LJIIIZ(mainKey, "mainKey");
        return new RomaCheckRule(mainKey, i, list);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RomaCheckRule)) {
            return false;
        }
        RomaCheckRule romaCheckRule = (RomaCheckRule) obj;
        return o.LJ(this.mainKey, romaCheckRule.mainKey) && this.patternId == romaCheckRule.patternId && o.LJ(this.moreKeys, romaCheckRule.moreKeys);
    }

    public int hashCode() {
        int hashCode = ((this.mainKey.hashCode() * 31) + this.patternId) * 31;
        List<String> list = this.moreKeys;
        return hashCode + (list == null ? 0 : list.hashCode());
    }

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("RomaCheckRule(mainKey=");
        LIZ.append(this.mainKey);
        LIZ.append(", patternId=");
        LIZ.append(this.patternId);
        LIZ.append(", moreKeys=");
        return C1NE.LIZIZ(LIZ, this.moreKeys, ')', LIZ);
    }

    public final String getMainKey() {
        return this.mainKey;
    }

    public final List<String> getMoreKeys() {
        return this.moreKeys;
    }

    public final int getPatternId() {
        return this.patternId;
    }

    public RomaCheckRule(String mainKey, int i, List<String> list) {
        o.LJIIIZ(mainKey, "mainKey");
        this.mainKey = mainKey;
        this.patternId = i;
        this.moreKeys = list;
    }

    public /* synthetic */ RomaCheckRule(String str, int i, List list, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? "" : str, (i2 & 2) != 0 ? 0 : i, (i2 & 4) != 0 ? null : list);
    }
}
