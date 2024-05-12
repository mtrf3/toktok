package com.bytedance.helios.network.pipeline;

import X.F9E;
import X.InterfaceC65349Pkn;
import com.bytedance.helios.network.api.service.ReplaceConfig;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes12.dex */
public final class OperationConfig extends F9E {
    public static final /* synthetic */ int LJLIL = 0;

    @InterfaceC65349Pkn("add")
    public Map<String, String> add;

    @InterfaceC65349Pkn("remove")
    public List<String> remove;

    @InterfaceC65349Pkn("replace")
    public Map<String, ReplaceConfig> replace;

    /* JADX WARN: Multi-variable type inference failed */
    public OperationConfig() {
        this(null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 7, 0 == true ? 1 : 0);
    }

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{this.add, this.replace, this.remove};
    }

    public final void L(OperationConfig operationConfig) {
        if (operationConfig != null) {
            this.add.putAll(operationConfig.add);
            this.replace.putAll(operationConfig.replace);
            this.remove.addAll(operationConfig.remove);
        }
    }

    public OperationConfig(Map<String, String> add, Map<String, ReplaceConfig> replace, List<String> remove) {
        o.LJIIIZ(add, "add");
        o.LJIIIZ(replace, "replace");
        o.LJIIIZ(remove, "remove");
        this.add = add;
        this.replace = replace;
        this.remove = remove;
    }

    public /* synthetic */ OperationConfig(Map map, Map map2, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? new LinkedHashMap() : map, (i & 2) != 0 ? new LinkedHashMap() : map2, (i & 4) != 0 ? new ArrayList() : list);
    }
}
