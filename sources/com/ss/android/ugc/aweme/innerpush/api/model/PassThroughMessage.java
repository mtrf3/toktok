package com.ss.android.ugc.aweme.innerpush.api.model;

import X.C16880lQ;
import X.C47135Ieh;
import X.InterfaceC65349Pkn;
import X.X1D;
import java.io.Serializable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public final class PassThroughMessage implements Serializable {
    public transient long LJLIL;

    @InterfaceC65349Pkn("message")
    public final String content;

    @InterfaceC65349Pkn("type")
    public final int type;

    /* JADX WARN: Multi-variable type inference failed */
    public PassThroughMessage() {
        this(0, null, 0L, 7, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ PassThroughMessage copy$default(PassThroughMessage passThroughMessage, int i, String str, long j, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = passThroughMessage.type;
        }
        if ((i2 & 2) != 0) {
            str = passThroughMessage.content;
        }
        if ((i2 & 4) != 0) {
            j = passThroughMessage.LJLIL;
        }
        return passThroughMessage.copy(i, str, j);
    }

    public final PassThroughMessage copy(int i, String str, long j) {
        return new PassThroughMessage(i, str, j);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PassThroughMessage)) {
            return false;
        }
        PassThroughMessage passThroughMessage = (PassThroughMessage) obj;
        return this.type == passThroughMessage.type && o.LJ(this.content, passThroughMessage.content) && this.LJLIL == passThroughMessage.LJLIL;
    }

    public int hashCode() {
        int i = this.type * 31;
        String str = this.content;
        return C16880lQ.LLJIJIL(this.LJLIL) + ((i + (str == null ? 0 : str.hashCode())) * 31);
    }

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("PassThroughMessage(type=");
        LIZ.append(this.type);
        LIZ.append(", content=");
        LIZ.append(this.content);
        LIZ.append(", rid=");
        return C47135Ieh.LIZIZ(LIZ, this.LJLIL, ')', LIZ);
    }

    public final String getContent() {
        return this.content;
    }

    public final long getRid() {
        return this.LJLIL;
    }

    public final int getType() {
        return this.type;
    }

    public final void setRid(long j) {
        this.LJLIL = j;
    }

    public PassThroughMessage(int i, String str, long j) {
        this.type = i;
        this.content = str;
        this.LJLIL = j;
    }

    public /* synthetic */ PassThroughMessage(int i, String str, long j, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 0 : i, (i2 & 2) != 0 ? null : str, (i2 & 4) != 0 ? 0L : j);
    }
}
