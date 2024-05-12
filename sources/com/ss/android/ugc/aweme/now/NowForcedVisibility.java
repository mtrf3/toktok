package com.ss.android.ugc.aweme.now;

import X.InterfaceC65349Pkn;
import X.X1D;
import defpackage.q;
import java.io.Serializable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes4.dex */
public final class NowForcedVisibility implements Serializable {

    @InterfaceC65349Pkn("message")
    public String message;

    @InterfaceC65349Pkn("state")
    public int state;

    /* JADX WARN: Multi-variable type inference failed */
    public NowForcedVisibility() {
        this(0, null, 3, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ NowForcedVisibility copy$default(NowForcedVisibility nowForcedVisibility, int i, String str, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = nowForcedVisibility.state;
        }
        if ((i2 & 2) != 0) {
            str = nowForcedVisibility.message;
        }
        return nowForcedVisibility.copy(i, str);
    }

    public final NowForcedVisibility copy(int i, String str) {
        return new NowForcedVisibility(i, str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof NowForcedVisibility)) {
            return false;
        }
        NowForcedVisibility nowForcedVisibility = (NowForcedVisibility) obj;
        return this.state == nowForcedVisibility.state && o.LJ(this.message, nowForcedVisibility.message);
    }

    public int hashCode() {
        int i = this.state * 31;
        String str = this.message;
        return i + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("NowForcedVisibility(state=");
        LIZ.append(this.state);
        LIZ.append(", message=");
        return q.LIZIZ(LIZ, this.message, ')', LIZ);
    }

    public final String getMessage() {
        return this.message;
    }

    public final int getState() {
        return this.state;
    }

    public NowForcedVisibility(int i, String str) {
        this.state = i;
        this.message = str;
    }

    public /* synthetic */ NowForcedVisibility(int i, String str, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 0 : i, (i2 & 2) != 0 ? "" : str);
    }
}
