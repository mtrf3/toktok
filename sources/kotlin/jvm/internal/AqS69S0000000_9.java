package kotlin.jvm.internal;

import X.AbstractC65781Prl;
import X.C53779L8t;
import X.C53780L8u;
import X.C53781L8v;
import X.C73921Szl;
import X.C76800UCe;
import X.InterfaceC88472Yns;
import com.ss.android.ugc.aweme.profile.model.User;
import java.util.List;

/* loaded from: classes10.dex */
public class AqS69S0000000_9 extends AbstractC65781Prl implements InterfaceC88472Yns {
    public final int $t;

    @Override // X.InterfaceC88472Yns
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj);
            case 1:
                return invoke$1(this, obj);
            case 2:
                return invoke$2(this, obj);
            default:
                return null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS69S0000000_9(int i) {
        super(1);
        this.$t = i;
    }

    public final void invoke$0(C73921Szl<? extends Object, User, ? extends Object, List<User>> predicatedSyncTo) {
        o.LJIIJ(predicatedSyncTo, "$this$predicatedSyncTo");
        C53779L8t block = C53779L8t.INSTANCE;
        o.LJIIJ(block, "block");
        predicatedSyncTo.LIZIZ = block;
        predicatedSyncTo.LIZJ = new AqS62S0000000_9(this, 0);
    }

    public final void invoke$1(C73921Szl<? extends Object, User, ? extends Object, List<User>> predicatedSyncTo) {
        o.LJIIJ(predicatedSyncTo, "$this$predicatedSyncTo");
        C53780L8u block = C53780L8u.INSTANCE;
        o.LJIIJ(block, "block");
        predicatedSyncTo.LIZIZ = block;
        predicatedSyncTo.LIZJ = new AqS62S0000000_9(this, 1);
    }

    public final void invoke$2(C73921Szl<? extends Object, User, ? extends Object, List<User>> predicatedSyncTo) {
        o.LJIIJ(predicatedSyncTo, "$this$predicatedSyncTo");
        C53781L8v block = C53781L8v.INSTANCE;
        o.LJIIJ(block, "block");
        predicatedSyncTo.LIZIZ = block;
        predicatedSyncTo.LIZJ = new AqS62S0000000_9(this, 2);
    }

    public static /* bridge */ /* synthetic */ Object invoke$0(AqS69S0000000_9 aqS69S0000000_9, Object obj) {
        aqS69S0000000_9.invoke$0((C73921Szl) obj);
        return C76800UCe.LIZ;
    }

    public static /* bridge */ /* synthetic */ Object invoke$1(AqS69S0000000_9 aqS69S0000000_9, Object obj) {
        aqS69S0000000_9.invoke$1((C73921Szl) obj);
        return C76800UCe.LIZ;
    }

    public static /* bridge */ /* synthetic */ Object invoke$2(AqS69S0000000_9 aqS69S0000000_9, Object obj) {
        aqS69S0000000_9.invoke$2((C73921Szl) obj);
        return C76800UCe.LIZ;
    }
}
