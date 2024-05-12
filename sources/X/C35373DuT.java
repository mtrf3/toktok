package X;

import com.bytedance.android.live.liveinteract.multilive.model.ListByTypeResponse;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.DuT, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C35373DuT {
    public final List<ListByTypeResponse.ReservedUser> LIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C35373DuT) && o.LJ(this.LIZ, ((C35373DuT) obj).LIZ);
    }

    public final int hashCode() {
        List<ListByTypeResponse.ReservedUser> list = this.LIZ;
        if (list == null) {
            return 0;
        }
        return list.hashCode();
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("MultiGuestV3ReservationListInfo(reservationList=");
        return C1NE.LIZIZ(LIZ, this.LIZ, ')', LIZ);
    }

    public C35373DuT(List<ListByTypeResponse.ReservedUser> list) {
        this.LIZ = list;
    }
}
