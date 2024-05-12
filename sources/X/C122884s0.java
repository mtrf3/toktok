package X;

import com.bytedance.android.livesdk.chatroom.model.interact.LinkPlayerInfo;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.4s0, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C122884s0 {
    public final List<LinkPlayerInfo> LIZ;
    public final List<LinkPlayerInfo> LIZIZ;

    public C122884s0() {
        this(null, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C122884s0)) {
            return false;
        }
        C122884s0 c122884s0 = (C122884s0) obj;
        return o.LJ(this.LIZ, c122884s0.LIZ) && o.LJ(this.LIZIZ, c122884s0.LIZIZ);
    }

    public final int hashCode() {
        List<LinkPlayerInfo> list = this.LIZ;
        int hashCode = (list == null ? 0 : list.hashCode()) * 31;
        List<LinkPlayerInfo> list2 = this.LIZIZ;
        return hashCode + (list2 != null ? list2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("NewUserListDataGuestSide(onlineList=");
        LIZ.append(this.LIZ);
        LIZ.append(", waitingList=");
        return C1NE.LIZIZ(LIZ, this.LIZIZ, ')', LIZ);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C122884s0(List<? extends LinkPlayerInfo> list, List<? extends LinkPlayerInfo> list2) {
        this.LIZ = list;
        this.LIZIZ = list2;
    }
}
