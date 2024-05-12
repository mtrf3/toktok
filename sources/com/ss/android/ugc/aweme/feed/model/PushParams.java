package com.ss.android.ugc.aweme.feed.model;

import X.InterfaceC65349Pkn;
import X.X1D;
import defpackage.q;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public final class PushParams {

    @InterfaceC65349Pkn("push_id")
    public final String pushId;

    @InterfaceC65349Pkn("push_type")
    public final String pushType;

    /* JADX WARN: Multi-variable type inference failed */
    public PushParams() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ PushParams copy$default(PushParams pushParams, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = pushParams.pushId;
        }
        if ((i & 2) != 0) {
            str2 = pushParams.pushType;
        }
        return pushParams.copy(str, str2);
    }

    public final PushParams copy(String str, String str2) {
        return new PushParams(str, str2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PushParams)) {
            return false;
        }
        PushParams pushParams = (PushParams) obj;
        return o.LJ(this.pushId, pushParams.pushId) && o.LJ(this.pushType, pushParams.pushType);
    }

    public int hashCode() {
        String str = this.pushId;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.pushType;
        return hashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("PushParams(pushId=");
        LIZ.append(this.pushId);
        LIZ.append(", pushType=");
        return q.LIZIZ(LIZ, this.pushType, ')', LIZ);
    }

    public PushParams(String str, String str2) {
        this.pushId = str;
        this.pushType = str2;
    }

    public /* synthetic */ PushParams(String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2);
    }
}
