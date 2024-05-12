package X;

import com.ss.android.ugc.aweme.search.ecommerce.entrance.ECSearchEntranceData;
import kotlin.jvm.internal.o;

/* renamed from: X.JzF, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C50957JzF implements KK7 {
    public final ECSearchEntranceData LJLIL;

    public C50957JzF() {
        this(null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C50957JzF) && o.LJ(this.LJLIL, ((C50957JzF) obj).LJLIL);
    }

    public final int hashCode() {
        ECSearchEntranceData eCSearchEntranceData = this.LJLIL;
        if (eCSearchEntranceData == null) {
            return 0;
        }
        return eCSearchEntranceData.hashCode();
    }

    @Override // X.KK7
    public final boolean isLog() {
        return true;
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("SearchEcommerceAction(entranceData=");
        LIZ.append(this.LJLIL);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    static {
        C17N.LJJJJLI().zp0().LIZIZ(C65352Pkq.LIZ(C50957JzF.class), C50956JzE.LJLIL);
    }

    public C50957JzF(ECSearchEntranceData eCSearchEntranceData) {
        this.LJLIL = eCSearchEntranceData;
    }
}
