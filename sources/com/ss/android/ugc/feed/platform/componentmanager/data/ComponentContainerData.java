package com.ss.android.ugc.feed.platform.componentmanager.data;

import X.InterfaceC65349Pkn;
import X.X1D;
import defpackage.b0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public final class ComponentContainerData {

    @InterfaceC65349Pkn("container_key")
    public String containerKey;

    @InterfaceC65349Pkn("show_limit")
    public int showLimit;

    /* JADX WARN: Multi-variable type inference failed */
    public ComponentContainerData() {
        this(null, 0, 3, 0 == true ? 1 : 0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ComponentContainerData)) {
            return false;
        }
        ComponentContainerData componentContainerData = (ComponentContainerData) obj;
        return o.LJ(this.containerKey, componentContainerData.containerKey) && this.showLimit == componentContainerData.showLimit;
    }

    public final int hashCode() {
        String str = this.containerKey;
        return ((str == null ? 0 : str.hashCode()) * 31) + this.showLimit;
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("ComponentContainerData(containerKey=");
        LIZ.append(this.containerKey);
        LIZ.append(", showLimit=");
        return b0.LIZJ(LIZ, this.showLimit, ')', LIZ);
    }

    public ComponentContainerData(String str, int i) {
        this.containerKey = str;
        this.showLimit = i;
    }

    public /* synthetic */ ComponentContainerData(String str, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? null : str, (i2 & 2) != 0 ? 3 : i);
    }
}
