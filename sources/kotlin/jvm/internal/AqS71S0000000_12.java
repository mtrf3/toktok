package kotlin.jvm.internal;

import X.AbstractC65781Prl;
import X.C73918Szi;
import X.C76800UCe;
import X.InterfaceC88472Yns;
import X.TC9;
import X.TCE;
import X.TCI;
import com.ss.android.ugc.aweme.comment.model.GifEmoji;
import com.ss.android.ugc.aweme.profile.model.User;
import java.util.List;

/* loaded from: classes13.dex */
public class AqS71S0000000_12 extends AbstractC65781Prl implements InterfaceC88472Yns {
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
            case 3:
                return invoke$3(this, obj);
            default:
                return null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS71S0000000_12(int i) {
        super(1);
        this.$t = i;
    }

    public final void invoke$0(C73918Szi<TCI, List<User>, C76800UCe, List<User>> keySyncTo) {
        o.LJIIJ(keySyncTo, "$this$keySyncTo");
        keySyncTo.LIZIZ = new AqS64S0000000_12(this, 0);
        keySyncTo.LIZJ = new IDqS83S0000000_12(this, 0);
    }

    public final void invoke$1(C73918Szi<TCI, List<User>, C76800UCe, List<User>> keySyncTo) {
        o.LJIIJ(keySyncTo, "$this$keySyncTo");
        keySyncTo.LIZIZ = new AqS64S0000000_12(this, 1);
        keySyncTo.LIZJ = new IDqS83S0000000_12(this, 1);
    }

    public final void invoke$2(C73918Szi<TCE, List<User>, C76800UCe, List<User>> keySyncTo) {
        o.LJIIJ(keySyncTo, "$this$keySyncTo");
        keySyncTo.LIZIZ = new AqS64S0000000_12(this, 2);
        keySyncTo.LIZJ = new IDqS83S0000000_12(this, 2);
    }

    public final void invoke$3(C73918Szi<TC9, List<GifEmoji>, String, List<GifEmoji>> keySyncTo) {
        o.LJIIJ(keySyncTo, "$this$keySyncTo");
        keySyncTo.LIZIZ = new AqS64S0000000_12(this, 3);
        keySyncTo.LIZJ = new IDqS83S0000000_12(this, 3);
    }

    public static /* bridge */ /* synthetic */ Object invoke$0(AqS71S0000000_12 aqS71S0000000_12, Object obj) {
        aqS71S0000000_12.invoke$0((C73918Szi) obj);
        return C76800UCe.LIZ;
    }

    public static /* bridge */ /* synthetic */ Object invoke$1(AqS71S0000000_12 aqS71S0000000_12, Object obj) {
        aqS71S0000000_12.invoke$1((C73918Szi) obj);
        return C76800UCe.LIZ;
    }

    public static /* bridge */ /* synthetic */ Object invoke$2(AqS71S0000000_12 aqS71S0000000_12, Object obj) {
        aqS71S0000000_12.invoke$2((C73918Szi) obj);
        return C76800UCe.LIZ;
    }

    public static /* bridge */ /* synthetic */ Object invoke$3(AqS71S0000000_12 aqS71S0000000_12, Object obj) {
        aqS71S0000000_12.invoke$3((C73918Szi) obj);
        return C76800UCe.LIZ;
    }
}
