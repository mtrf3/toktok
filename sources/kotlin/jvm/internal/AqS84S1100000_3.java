package kotlin.jvm.internal;

import X.AbstractC65781Prl;
import X.C2061987j;
import X.C2062187l;
import X.C26045AKb;
import X.C76800UCe;
import X.InterfaceC88471Ynr;
import com.ss.android.ugc.aweme.favorites.service.FavoriteServiceImpl;

/* loaded from: classes4.dex */
public class AqS84S1100000_3 extends AbstractC65781Prl implements InterfaceC88471Ynr {
    public final int $t;
    public Object l1;
    public String s0;

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(Object obj, Object obj2) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj, obj2);
            case 1:
                return invoke$1(this, obj, obj2);
            case 2:
                return invoke$2(this, obj, obj2);
            case 3:
                return invoke$3(this, obj, obj2);
            default:
                return null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS84S1100000_3(C2061987j c2061987j, String str, int i) {
        super(2);
        this.$t = i;
        this.l1 = c2061987j;
        this.s0 = str;
    }

    public static final Object invoke$0(AqS84S1100000_3 aqS84S1100000_3, Object obj, Object obj2) {
        o.LJIIIZ(obj, "<anonymous parameter 0>");
        o.LJIIIZ(obj2, "<anonymous parameter 1>");
        if (FavoriteServiceImpl.LJIJJLI().LJI() <= 0) {
            C26045AKb c26045AKb = new C26045AKb(((C2061987j) aqS84S1100000_3.l1).LJLIL);
            c26045AKb.LJIIIZ(aqS84S1100000_3.s0);
            c26045AKb.LJIIJ();
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$1(AqS84S1100000_3 aqS84S1100000_3, Object obj, Object obj2) {
        o.LJIIIZ(obj, "<anonymous parameter 0>");
        o.LJIIIZ(obj2, "<anonymous parameter 1>");
        if (FavoriteServiceImpl.LJIJJLI().LJI() <= 0) {
            C26045AKb c26045AKb = new C26045AKb(((C2061987j) aqS84S1100000_3.l1).LJLIL);
            c26045AKb.LJIIIZ(aqS84S1100000_3.s0);
            c26045AKb.LJIIJ();
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$2(AqS84S1100000_3 aqS84S1100000_3, Object obj, Object obj2) {
        o.LJIIIZ(obj, "<anonymous parameter 0>");
        o.LJIIIZ(obj2, "<anonymous parameter 1>");
        ((C2062187l) aqS84S1100000_3.l1).gd(aqS84S1100000_3.s0);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$3(AqS84S1100000_3 aqS84S1100000_3, Object obj, Object obj2) {
        o.LJIIIZ(obj, "<anonymous parameter 0>");
        o.LJIIIZ(obj2, "<anonymous parameter 1>");
        ((C2062187l) aqS84S1100000_3.l1).gd(aqS84S1100000_3.s0);
        return C76800UCe.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS84S1100000_3(C2062187l c2062187l, String str, int i) {
        super(2);
        this.$t = i;
        this.l1 = c2062187l;
        this.s0 = str;
    }
}
