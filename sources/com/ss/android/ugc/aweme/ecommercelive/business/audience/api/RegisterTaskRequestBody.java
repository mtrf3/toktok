package com.ss.android.ugc.aweme.ecommercelive.business.audience.api;

import X.C79062V1e;
import X.InterfaceC65349Pkn;
import X.X1D;
import defpackage.q;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public final class RegisterTaskRequestBody {

    @InterfaceC65349Pkn("room_id")
    public final String roomId;

    @InterfaceC65349Pkn("task_id")
    public final String taskId;

    @InterfaceC65349Pkn("user_id")
    public final String userId;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RegisterTaskRequestBody)) {
            return false;
        }
        RegisterTaskRequestBody registerTaskRequestBody = (RegisterTaskRequestBody) obj;
        return o.LJ(this.roomId, registerTaskRequestBody.roomId) && o.LJ(this.userId, registerTaskRequestBody.userId) && o.LJ(this.taskId, registerTaskRequestBody.taskId);
    }

    public final int hashCode() {
        int hashCode;
        int LJ = C79062V1e.LJ(this.userId, this.roomId.hashCode() * 31, 31);
        String str = this.taskId;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        return LJ + hashCode;
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("RegisterTaskRequestBody(roomId=");
        LIZ.append(this.roomId);
        LIZ.append(", userId=");
        LIZ.append(this.userId);
        LIZ.append(", taskId=");
        return q.LIZIZ(LIZ, this.taskId, ')', LIZ);
    }

    public RegisterTaskRequestBody(String roomId, String userId, String str) {
        o.LJIIIZ(roomId, "roomId");
        o.LJIIIZ(userId, "userId");
        this.roomId = roomId;
        this.userId = userId;
        this.taskId = str;
    }

    public /* synthetic */ RegisterTaskRequestBody(String str, String str2, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, (i & 4) != 0 ? null : str3);
    }
}
