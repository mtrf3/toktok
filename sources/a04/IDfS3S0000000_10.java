package a04;

import X.C10K;
import X.InterfaceC55004LiK;
import X.NW6;
import X.QXX;
import Y.ACallableS80S0101000_9;
import defpackage.e1;
import java.util.HashMap;
import java.util.List;

/* loaded from: classes11.dex */
public class IDfS3S0000000_10 extends QXX {
    public final int $t;

    @Override // X.QXX
    public final HashMap<String, String> LLIL() {
        switch (this.$t) {
            case 3:
                return LLIL$0(this);
            default:
                return super.LLIL();
        }
    }

    @Override // X.QXX
    public final void LLLIIIL(List<? extends InterfaceC55004LiK> list) {
        switch (this.$t) {
            case 4:
                LLLIIIL$0(this, list);
                return;
            default:
                super.LLLIIIL(list);
                return;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IDfS3S0000000_10(int i) {
        super((Object) null);
        this.$t = i;
        switch (i) {
            case 0:
            case 2:
                return;
            case 1:
            default:
                return;
        }
    }

    public static final HashMap LLIL$0(IDfS3S0000000_10 iDfS3S0000000_10) {
        if (e1.LIZ(31744, "splash_param_optimize_enabled", true, true)) {
            return NW6.LIZ().LJJIIZI();
        }
        return null;
    }

    public static final void LLLIIIL$0(IDfS3S0000000_10 iDfS3S0000000_10, List list) {
        if (list == null || list.isEmpty()) {
            return;
        }
        C10K.LIZJ(new ACallableS80S0101000_9(0, list, 1));
    }
}
