package com.bytedance.pitaya.inner.api.bean;

import X.C7OB;
import com.bytedance.pitaya.api.bean.PTYClass;
import com.bytedance.pitaya.jniwrapper.ReflectionCall;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes30.dex */
public final class TaskData implements ReflectionCall {
    public C7OB dataFetcher;
    public final List<PTYClass> pyBufferList;
    public final String strParams;

    public final double[] fetchExtraAsNumber(String[] keys, double d) {
        o.LJIIJ(keys, "keys");
        return null;
    }

    public final String[] fetchExtraAsString(String[] keys, String str) {
        o.LJIIJ(keys, "keys");
        o.LJIIJ(str, "default");
        return null;
    }

    public final C7OB getDataFetcher() {
        return null;
    }

    public final boolean hasDataFetcher() {
        return false;
    }

    public final void setDataFetcher(C7OB c7ob) {
    }

    public final List<PTYClass> getPyBufferList$pitaya_i18nTocRelease() {
        return this.pyBufferList;
    }

    public final String getStrParams$pitaya_i18nTocRelease() {
        return this.strParams;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public TaskData(String str, List<? extends PTYClass> list) {
        this.strParams = str;
        this.pyBufferList = list;
    }

    public /* synthetic */ TaskData(String str, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? null : list);
    }
}
