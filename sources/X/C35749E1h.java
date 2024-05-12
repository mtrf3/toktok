package X;

import com.bytedance.android.livesdk.chatroom.model.multiguestv3.BizJoinDirectParams;
import kotlin.jvm.internal.o;

/* renamed from: X.E1h, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C35749E1h {
    public final BizJoinDirectParams LIZ;

    public C35749E1h() {
        this(null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C35749E1h) && o.LJ(this.LIZ, ((C35749E1h) obj).LIZ);
    }

    public final int hashCode() {
        BizJoinDirectParams bizJoinDirectParams = this.LIZ;
        if (bizJoinDirectParams == null) {
            return 0;
        }
        return bizJoinDirectParams.hashCode();
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("DirectJoinParam(bizJoinDirectParams=");
        LIZ.append(this.LIZ);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    public C35749E1h(BizJoinDirectParams bizJoinDirectParams) {
        this.LIZ = bizJoinDirectParams;
    }
}
