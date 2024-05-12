package com.bytedance.pumbaa.base.settings;

import X.F9E;
import X.InterfaceC65349Pkn;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class TypeInfo extends F9E {

    @InterfaceC65349Pkn("argument_type_names")
    public final List<TypeInfo> argumentTypeNames;

    @InterfaceC65349Pkn("owner_type_name")
    public final String ownerTypeName;

    @InterfaceC65349Pkn("raw_type_name")
    public final String rawTypeName;

    /* JADX WARN: Multi-variable type inference failed */
    public TypeInfo() {
        this(null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 7, 0 == true ? 1 : 0);
    }

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{this.rawTypeName, this.ownerTypeName, this.argumentTypeNames};
    }

    public TypeInfo(String rawTypeName, String str, List<TypeInfo> list) {
        o.LJIIIZ(rawTypeName, "rawTypeName");
        this.rawTypeName = rawTypeName;
        this.ownerTypeName = str;
        this.argumentTypeNames = list;
    }

    public /* synthetic */ TypeInfo(String str, String str2, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : list);
    }
}
