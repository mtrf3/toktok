package X;

import com.bytedance.android.livesdk.chatroom.model.multiguestv3.BizCreateChannelParams;
import kotlin.jvm.internal.o;

/* renamed from: X.U4x, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C76611U4x {
    public final int LIZ;
    public final String LIZIZ;
    public final BizCreateChannelParams LIZJ;
    public final Long LIZLLL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C76611U4x)) {
            return false;
        }
        C76611U4x c76611U4x = (C76611U4x) obj;
        return this.LIZ == c76611U4x.LIZ && o.LJ(this.LIZIZ, c76611U4x.LIZIZ) && o.LJ(this.LIZJ, c76611U4x.LIZJ) && o.LJ(this.LIZLLL, c76611U4x.LIZLLL);
    }

    public final int hashCode() {
        int i = this.LIZ * 31;
        String str = this.LIZIZ;
        int hashCode = (i + (str == null ? 0 : str.hashCode())) * 31;
        BizCreateChannelParams bizCreateChannelParams = this.LIZJ;
        int hashCode2 = (hashCode + (bizCreateChannelParams == null ? 0 : bizCreateChannelParams.hashCode())) * 31;
        Long l = this.LIZLLL;
        return hashCode2 + (l != null ? l.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("CreateChannelParam(maxPosition=");
        LIZ.append(this.LIZ);
        LIZ.append(", layoutId=");
        LIZ.append(this.LIZIZ);
        LIZ.append(", bizCreateChannelParams=");
        LIZ.append(this.LIZJ);
        LIZ.append(", liveRoomMode=");
        return JBR.LJ(LIZ, this.LIZLLL, ')', LIZ);
    }

    public C76611U4x(int i, String str, BizCreateChannelParams bizCreateChannelParams, Long l) {
        this.LIZ = i;
        this.LIZIZ = str;
        this.LIZJ = bizCreateChannelParams;
        this.LIZLLL = l;
    }
}
