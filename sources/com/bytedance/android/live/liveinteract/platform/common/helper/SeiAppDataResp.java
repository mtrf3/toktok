package com.bytedance.android.live.liveinteract.platform.common.helper;

import X.InterfaceC65349Pkn;
import X.X1D;
import defpackage.q;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public final class SeiAppDataResp {

    @InterfaceC65349Pkn("app_data")
    public final String seiAppDataStr;

    /* JADX WARN: Multi-variable type inference failed */
    public SeiAppDataResp() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof SeiAppDataResp) && o.LJ(this.seiAppDataStr, ((SeiAppDataResp) obj).seiAppDataStr);
    }

    public final int hashCode() {
        String str = this.seiAppDataStr;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("SeiAppDataResp(seiAppDataStr=");
        return q.LIZIZ(LIZ, this.seiAppDataStr, ')', LIZ);
    }

    public SeiAppDataResp(String str) {
        this.seiAppDataStr = str;
    }

    public /* synthetic */ SeiAppDataResp(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str);
    }
}
