package com.bytedance.helios.api.consumer;

import X.F9E;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes12.dex */
public final class OperateHistory extends F9E {
    public String operator;
    public List<OperatePairs> pairs;
    public String target;

    /* JADX WARN: Multi-variable type inference failed */
    public OperateHistory() {
        this(null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 7, 0 == true ? 1 : 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ OperateHistory copy$default(OperateHistory operateHistory, String str, String str2, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            str = operateHistory.operator;
        }
        if ((i & 2) != 0) {
            str2 = operateHistory.target;
        }
        if ((i & 4) != 0) {
            list = operateHistory.pairs;
        }
        return operateHistory.copy(str, str2, list);
    }

    public final OperateHistory copy(String operator, String target, List<OperatePairs> list) {
        o.LJIIIZ(operator, "operator");
        o.LJIIIZ(target, "target");
        return new OperateHistory(operator, target, list);
    }

    @Override // X.F9E
    public Object[] getObjects() {
        return new Object[]{this.operator, this.target, this.pairs};
    }

    public final String getOperator() {
        return this.operator;
    }

    public final List<OperatePairs> getPairs() {
        return this.pairs;
    }

    public final String getTarget() {
        return this.target;
    }

    public final void setOperator(String str) {
        o.LJIIIZ(str, "<set-?>");
        this.operator = str;
    }

    public final void setPairs(List<OperatePairs> list) {
        this.pairs = list;
    }

    public final void setTarget(String str) {
        o.LJIIIZ(str, "<set-?>");
        this.target = str;
    }

    public OperateHistory(String operator, String target, List<OperatePairs> list) {
        o.LJIIIZ(operator, "operator");
        o.LJIIIZ(target, "target");
        this.operator = operator;
        this.target = target;
        this.pairs = list;
    }

    public /* synthetic */ OperateHistory(String str, String str2, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? null : list);
    }
}
