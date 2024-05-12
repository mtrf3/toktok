package com.bytedance.android.live.broadcast.mirror.message;

import X.InterfaceC65349Pkn;
import X.X1D;
import com.google.gson.m;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes.dex */
public final class DualDeviceMessageJsonPassThroughModel {

    @InterfaceC65349Pkn("name")
    public String name;

    @InterfaceC65349Pkn("param")
    public m param;

    /* JADX WARN: Multi-variable type inference failed */
    public DualDeviceMessageJsonPassThroughModel() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("name = ");
        LIZ.append(this.name);
        LIZ.append(",param = ");
        LIZ.append(this.param);
        return X1D.LIZIZ(LIZ);
    }

    public DualDeviceMessageJsonPassThroughModel(String str, m mVar) {
        this.name = str;
        this.param = mVar;
    }

    public /* synthetic */ DualDeviceMessageJsonPassThroughModel(String str, m mVar, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : mVar);
    }
}
