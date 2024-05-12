package com.ss.android.ugc.aweme.ecommerce.core.engine.module;

import X.InterfaceC65349Pkn;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class ModuleId {

    @InterfaceC65349Pkn("id")
    public final String id;

    /* JADX WARN: Multi-variable type inference failed */
    public ModuleId() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public ModuleId(String id) {
        o.LJIIIZ(id, "id");
        this.id = id;
    }

    public /* synthetic */ ModuleId(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str);
    }
}
