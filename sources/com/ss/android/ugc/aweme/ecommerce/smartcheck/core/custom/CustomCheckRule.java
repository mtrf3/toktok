package com.ss.android.ugc.aweme.ecommerce.smartcheck.core.custom;

import X.C1NE;
import X.X1D;
import com.ss.android.ugc.aweme.ecommerce.smartcheck.api.ICustomChecker;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class CustomCheckRule {
    public final ICustomChecker checker;
    public final String mainKey;
    public final List<String> moreKeys;

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ CustomCheckRule copy$default(CustomCheckRule customCheckRule, String str, ICustomChecker iCustomChecker, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            str = customCheckRule.mainKey;
        }
        if ((i & 2) != 0) {
            iCustomChecker = customCheckRule.checker;
        }
        if ((i & 4) != 0) {
            list = customCheckRule.moreKeys;
        }
        return customCheckRule.copy(str, iCustomChecker, list);
    }

    public final CustomCheckRule copy(String mainKey, ICustomChecker checker, List<String> list) {
        o.LJIIIZ(mainKey, "mainKey");
        o.LJIIIZ(checker, "checker");
        return new CustomCheckRule(mainKey, checker, list);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CustomCheckRule)) {
            return false;
        }
        CustomCheckRule customCheckRule = (CustomCheckRule) obj;
        return o.LJ(this.mainKey, customCheckRule.mainKey) && o.LJ(this.checker, customCheckRule.checker) && o.LJ(this.moreKeys, customCheckRule.moreKeys);
    }

    public int hashCode() {
        int hashCode = (this.checker.hashCode() + (this.mainKey.hashCode() * 31)) * 31;
        List<String> list = this.moreKeys;
        return hashCode + (list == null ? 0 : list.hashCode());
    }

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("CustomCheckRule(mainKey=");
        LIZ.append(this.mainKey);
        LIZ.append(", checker=");
        LIZ.append(this.checker);
        LIZ.append(", moreKeys=");
        return C1NE.LIZIZ(LIZ, this.moreKeys, ')', LIZ);
    }

    public final ICustomChecker getChecker() {
        return this.checker;
    }

    public final String getMainKey() {
        return this.mainKey;
    }

    public final List<String> getMoreKeys() {
        return this.moreKeys;
    }

    public CustomCheckRule(String mainKey, ICustomChecker checker, List<String> list) {
        o.LJIIIZ(mainKey, "mainKey");
        o.LJIIIZ(checker, "checker");
        this.mainKey = mainKey;
        this.checker = checker;
        this.moreKeys = list;
    }

    public /* synthetic */ CustomCheckRule(String str, ICustomChecker iCustomChecker, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, iCustomChecker, (i & 4) != 0 ? null : list);
    }
}
