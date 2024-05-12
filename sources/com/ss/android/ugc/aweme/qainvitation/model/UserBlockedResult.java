package com.ss.android.ugc.aweme.qainvitation.model;

import X.InterfaceC65349Pkn;
import X.X1D;
import defpackage.s0;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public final class UserBlockedResult {

    @InterfaceC65349Pkn("block_type")
    public Integer blockType;

    @InterfaceC65349Pkn("mention_type")
    public final Integer mentionType;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UserBlockedResult)) {
            return false;
        }
        UserBlockedResult userBlockedResult = (UserBlockedResult) obj;
        return o.LJ(this.blockType, userBlockedResult.blockType) && o.LJ(this.mentionType, userBlockedResult.mentionType);
    }

    public final int hashCode() {
        Integer num = this.blockType;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        Integer num2 = this.mentionType;
        return hashCode + (num2 != null ? num2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("UserBlockedResult(blockType=");
        LIZ.append(this.blockType);
        LIZ.append(", mentionType=");
        return s0.LIZJ(LIZ, this.mentionType, ')', LIZ);
    }

    public UserBlockedResult(Integer num, Integer num2) {
        this.blockType = num;
        this.mentionType = num2;
    }
}
