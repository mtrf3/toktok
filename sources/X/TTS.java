package X;

import com.bytedance.android.livesdk.chatroom.model.multiguestv3.BizJoinChannelParams;
import kotlin.jvm.internal.o;

/* loaded from: classes14.dex */
public final class TTS {
    public final BizJoinChannelParams LIZ;

    public TTS() {
        this(null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof TTS) && o.LJ(this.LIZ, ((TTS) obj).LIZ);
    }

    public final int hashCode() {
        BizJoinChannelParams bizJoinChannelParams = this.LIZ;
        if (bizJoinChannelParams == null) {
            return 0;
        }
        return bizJoinChannelParams.hashCode();
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("JoinChannelParam(bizJoinChannelParams=");
        LIZ.append(this.LIZ);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    public TTS(BizJoinChannelParams bizJoinChannelParams) {
        this.LIZ = bizJoinChannelParams;
    }
}
