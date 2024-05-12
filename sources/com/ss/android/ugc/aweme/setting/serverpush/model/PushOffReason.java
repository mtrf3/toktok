package com.ss.android.ugc.aweme.setting.serverpush.model;

import X.InterfaceC65349Pkn;
import X.X1D;
import defpackage.q;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class PushOffReason {

    @InterfaceC65349Pkn("reason_category")
    public final int category;

    @InterfaceC65349Pkn("reason_text")
    public final String reason;

    /* JADX WARN: Multi-variable type inference failed */
    public PushOffReason() {
        this(0, null, 3, 0 == true ? 1 : 0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PushOffReason)) {
            return false;
        }
        PushOffReason pushOffReason = (PushOffReason) obj;
        return this.category == pushOffReason.category && o.LJ(this.reason, pushOffReason.reason);
    }

    public final int hashCode() {
        int i = this.category * 31;
        String str = this.reason;
        return i + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("PushOffReason(category=");
        LIZ.append(this.category);
        LIZ.append(", reason=");
        return q.LIZIZ(LIZ, this.reason, ')', LIZ);
    }

    public PushOffReason(int i, String str) {
        this.category = i;
        this.reason = str;
    }

    public /* synthetic */ PushOffReason(int i, String str, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? -1 : i, (i2 & 2) != 0 ? null : str);
    }
}
