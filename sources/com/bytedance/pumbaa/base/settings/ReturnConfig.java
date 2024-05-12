package com.bytedance.pumbaa.base.settings;

import X.F9E;
import X.InterfaceC65349Pkn;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes12.dex */
public final class ReturnConfig extends F9E {

    @InterfaceC65349Pkn("default_result")
    public final Object defaultResult;

    @InterfaceC65349Pkn("default_value")
    public final String defaultValue;

    @InterfaceC65349Pkn("type_info")
    public final TypeInfo typeInfo;

    /* JADX WARN: Multi-variable type inference failed */
    public ReturnConfig() {
        this(null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 7, 0 == true ? 1 : 0);
    }

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{this.defaultValue, this.typeInfo, this.defaultResult};
    }

    public ReturnConfig(String str, TypeInfo typeInfo, Object obj) {
        this.defaultValue = str;
        this.typeInfo = typeInfo;
        this.defaultResult = obj;
    }

    public /* synthetic */ ReturnConfig(String str, TypeInfo typeInfo, Object obj, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : typeInfo, (i & 4) != 0 ? null : obj);
    }
}
