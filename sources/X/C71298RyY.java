package X;

import com.ss.android.ugc.aweme.ecommerce.base.ordercenter.repository.dto.TradeEntranceInfo;
import kotlin.jvm.internal.o;

/* renamed from: X.RyY, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C71298RyY implements C33Q {
    public final C43I<EnumC71839SHj> LJLIL;
    public final boolean LJLILLLLZI;
    public final TradeEntranceInfo LJLJI;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C71298RyY)) {
            return false;
        }
        C71298RyY c71298RyY = (C71298RyY) obj;
        return o.LJ(this.LJLIL, c71298RyY.LJLIL) && this.LJLILLLLZI == c71298RyY.LJLILLLLZI && o.LJ(this.LJLJI, c71298RyY.LJLJI);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        int hashCode = this.LJLIL.hashCode() * 31;
        boolean z = this.LJLILLLLZI;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        int i2 = (hashCode + i) * 31;
        TradeEntranceInfo tradeEntranceInfo = this.LJLJI;
        return i2 + (tradeEntranceInfo == null ? 0 : tradeEntranceInfo.hashCode());
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("MessageCenterPageState(state=");
        LIZ.append(this.LJLIL);
        LIZ.append(", loadDone=");
        LIZ.append(this.LJLILLLLZI);
        LIZ.append(", orderCenterEntry=");
        LIZ.append(this.LJLJI);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C71298RyY(C43I<? extends EnumC71839SHj> c43i, boolean z, TradeEntranceInfo tradeEntranceInfo) {
        this.LJLIL = c43i;
        this.LJLILLLLZI = z;
        this.LJLJI = tradeEntranceInfo;
    }

    public static C71298RyY LIZ(C71298RyY c71298RyY, C43I state, boolean z, TradeEntranceInfo tradeEntranceInfo, int i) {
        if ((i & 1) != 0) {
            state = c71298RyY.LJLIL;
        }
        if ((i & 2) != 0) {
            z = c71298RyY.LJLILLLLZI;
        }
        if ((i & 4) != 0) {
            tradeEntranceInfo = c71298RyY.LJLJI;
        }
        c71298RyY.getClass();
        o.LJIIIZ(state, "state");
        return new C71298RyY(state, z, tradeEntranceInfo);
    }
}
