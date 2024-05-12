package com.bytedance.helios.api.consumer;

import X.EnumC66158Pxq;
import X.X1D;
import android.util.Pair;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes12.dex */
public final class ControlExtra {
    public Set<EnumC66158Pxq> checkModes;
    public final transient Map<String, Object> extra;
    public Pair<Boolean, Object> interceptResult;
    public boolean isFromSysCalls;
    public transient Object[] parameters;
    public transient Object result;
    public String returnType;
    public Set<Object> ruleModels;
    public transient Object thisOrClass;

    /* JADX WARN: Multi-variable type inference failed */
    public ControlExtra() {
        this(null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, false, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 511, 0 == true ? 1 : 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ControlExtra copy$default(ControlExtra controlExtra, Object[] objArr, String str, Pair pair, Set set, boolean z, Object obj, Object obj2, Map map, Set set2, int i, Object obj3) {
        if ((i & 1) != 0) {
            objArr = controlExtra.parameters;
        }
        if ((i & 2) != 0) {
            str = controlExtra.returnType;
        }
        if ((i & 4) != 0) {
            pair = controlExtra.interceptResult;
        }
        if ((i & 8) != 0) {
            set = controlExtra.ruleModels;
        }
        if ((i & 16) != 0) {
            z = controlExtra.isFromSysCalls;
        }
        if ((i & 32) != 0) {
            obj = controlExtra.result;
        }
        if ((i & 64) != 0) {
            obj2 = controlExtra.thisOrClass;
        }
        if ((i & 128) != 0) {
            map = controlExtra.extra;
        }
        if ((i & 256) != 0) {
            set2 = controlExtra.checkModes;
        }
        return controlExtra.copy(objArr, str, pair, set, z, obj, obj2, map, set2);
    }

    public final ControlExtra copy(Object[] objArr, String str, Pair<Boolean, Object> interceptResult, Set<Object> ruleModels, boolean z, Object obj, Object obj2, Map<String, Object> extra, Set<EnumC66158Pxq> checkModes) {
        o.LJIIIZ(interceptResult, "interceptResult");
        o.LJIIIZ(ruleModels, "ruleModels");
        o.LJIIIZ(extra, "extra");
        o.LJIIIZ(checkModes, "checkModes");
        return new ControlExtra(objArr, str, interceptResult, ruleModels, z, obj, obj2, extra, checkModes);
    }

    public final ControlExtra copyBase() {
        return copy$default(this, null, null, new Pair(Boolean.FALSE, null), new LinkedHashSet(), false, null, null, null, null, 499, null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ControlExtra)) {
            return false;
        }
        ControlExtra controlExtra = (ControlExtra) obj;
        return o.LJ(this.parameters, controlExtra.parameters) && o.LJ(this.returnType, controlExtra.returnType) && o.LJ(this.interceptResult, controlExtra.interceptResult) && o.LJ(this.ruleModels, controlExtra.ruleModels) && this.isFromSysCalls == controlExtra.isFromSysCalls && o.LJ(this.result, controlExtra.result) && o.LJ(this.thisOrClass, controlExtra.thisOrClass) && o.LJ(this.extra, controlExtra.extra) && o.LJ(this.checkModes, controlExtra.checkModes);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        Object[] objArr = this.parameters;
        int hashCode = (objArr != null ? Arrays.hashCode(objArr) : 0) * 31;
        String str = this.returnType;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        Pair<Boolean, Object> pair = this.interceptResult;
        int hashCode3 = (hashCode2 + (pair != null ? pair.hashCode() : 0)) * 31;
        Set<Object> set = this.ruleModels;
        int hashCode4 = (hashCode3 + (set != null ? set.hashCode() : 0)) * 31;
        boolean z = this.isFromSysCalls;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        int i2 = (hashCode4 + i) * 31;
        Object obj = this.result;
        int hashCode5 = (i2 + (obj != null ? obj.hashCode() : 0)) * 31;
        Object obj2 = this.thisOrClass;
        int hashCode6 = (hashCode5 + (obj2 != null ? obj2.hashCode() : 0)) * 31;
        Map<String, Object> map = this.extra;
        int hashCode7 = (hashCode6 + (map != null ? map.hashCode() : 0)) * 31;
        Set<EnumC66158Pxq> set2 = this.checkModes;
        return hashCode7 + (set2 != null ? set2.hashCode() : 0);
    }

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("ControlExtra(parameters=");
        LIZ.append(Arrays.toString(this.parameters));
        LIZ.append(", returnType=");
        LIZ.append(this.returnType);
        LIZ.append(", interceptResult=");
        LIZ.append(this.interceptResult);
        LIZ.append(", ruleModels=");
        LIZ.append(this.ruleModels);
        LIZ.append(", isFromSysCalls=");
        LIZ.append(this.isFromSysCalls);
        LIZ.append(", result=");
        LIZ.append(this.result);
        LIZ.append(", thisOrClass=");
        LIZ.append(this.thisOrClass);
        LIZ.append(", extra=");
        LIZ.append(this.extra);
        LIZ.append(", checkModes=");
        LIZ.append(this.checkModes);
        LIZ.append(")");
        return X1D.LIZIZ(LIZ);
    }

    public final Set<EnumC66158Pxq> getCheckModes() {
        return this.checkModes;
    }

    public final Map<String, Object> getExtra() {
        return this.extra;
    }

    public final Pair<Boolean, Object> getInterceptResult() {
        return this.interceptResult;
    }

    public final Object[] getParameters() {
        return this.parameters;
    }

    public final Object getResult() {
        return this.result;
    }

    public final String getReturnType() {
        return this.returnType;
    }

    public final Set<Object> getRuleModels() {
        return this.ruleModels;
    }

    public final Object getThisOrClass() {
        return this.thisOrClass;
    }

    public final boolean isFromSysCalls() {
        return this.isFromSysCalls;
    }

    public final void setCheckModes(Set<EnumC66158Pxq> set) {
        o.LJIIIZ(set, "<set-?>");
        this.checkModes = set;
    }

    public final void setFromSysCalls(boolean z) {
        this.isFromSysCalls = z;
    }

    public final void setInterceptResult(Pair<Boolean, Object> pair) {
        o.LJIIIZ(pair, "<set-?>");
        this.interceptResult = pair;
    }

    public final void setParameters(Object[] objArr) {
        this.parameters = objArr;
    }

    public final void setResult(Object obj) {
        this.result = obj;
    }

    public final void setReturnType(String str) {
        this.returnType = str;
    }

    public final void setRuleModels(Set<Object> set) {
        o.LJIIIZ(set, "<set-?>");
        this.ruleModels = set;
    }

    public final void setThisOrClass(Object obj) {
        this.thisOrClass = obj;
    }

    public ControlExtra(Object[] objArr, String str, Pair<Boolean, Object> interceptResult, Set<Object> ruleModels, boolean z, Object obj, Object obj2, Map<String, Object> extra, Set<EnumC66158Pxq> checkModes) {
        o.LJIIIZ(interceptResult, "interceptResult");
        o.LJIIIZ(ruleModels, "ruleModels");
        o.LJIIIZ(extra, "extra");
        o.LJIIIZ(checkModes, "checkModes");
        this.parameters = objArr;
        this.returnType = str;
        this.interceptResult = interceptResult;
        this.ruleModels = ruleModels;
        this.isFromSysCalls = z;
        this.result = obj;
        this.thisOrClass = obj2;
        this.extra = extra;
        this.checkModes = checkModes;
    }

    public /* synthetic */ ControlExtra(Object[] objArr, String str, Pair pair, Set set, boolean z, Object obj, Object obj2, Map map, Set set2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : objArr, (i & 2) != 0 ? null : str, (i & 4) != 0 ? new Pair(Boolean.FALSE, null) : pair, (i & 8) != 0 ? new LinkedHashSet() : set, (i & 16) != 0 ? false : z, (i & 32) != 0 ? null : obj, (i & 64) == 0 ? obj2 : null, (i & 128) != 0 ? new LinkedHashMap() : map, (i & 256) != 0 ? new LinkedHashSet() : set2);
    }
}
