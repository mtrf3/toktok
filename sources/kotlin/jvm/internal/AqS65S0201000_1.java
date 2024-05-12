package kotlin.jvm.internal;

import X.AbstractC65781Prl;
import X.C101783z4;
import X.C70922qO;
import X.C71042qa;
import X.C71052qb;
import X.C71082qe;
import X.C76800UCe;
import X.C779434c;
import X.EnumC101803z6;
import X.InterfaceC65784Pro;
import X.InterfaceC71012qX;
import X.InterfaceC92953kp;
import X.X1D;
import com.byted.cast.common.source.ServiceInfo;
import com.ss.android.ugc.aweme.im.sdk.chat.feature.reply.feature.feed.DetailFeedKeyboardDialogFragment;
import java.util.ArrayList;
import java.util.List;
import org.greenrobot.eventbus.EventBus;

/* loaded from: classes2.dex */
public class AqS65S0201000_1 extends AbstractC65781Prl implements InterfaceC65784Pro {
    public final int $t;
    public int i2;
    public Object l0;
    public Object l1;

    @Override // X.InterfaceC65784Pro
    public final Object invoke() {
        switch (this.$t) {
            case 0:
                return invoke$0(this);
            case 1:
                return invoke$1(this);
            case 2:
                return invoke$2(this);
            case 3:
                return invoke$3(this);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AqS65S0201000_1 aqS65S0201000_1) {
        InterfaceC71012qX interfaceC71012qX;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("onBrowse ----------->code: ");
        LIZ.append(aqS65S0201000_1.i2);
        C70922qO.LIZ("CastingManager", X1D.LIZIZ(LIZ));
        int i = aqS65S0201000_1.i2;
        if (i == 1) {
            InterfaceC71012qX interfaceC71012qX2 = ((C71052qb) aqS65S0201000_1.l0).LJ;
            if (interfaceC71012qX2 != null) {
                List list = (List) aqS65S0201000_1.l1;
                if (list == null) {
                    list = new ArrayList();
                }
                interfaceC71012qX2.LIZJ(1, ((C71052qb) aqS65S0201000_1.l0).LJIIIIZZ, list);
            }
        } else if (i == 4 || i == -1 || i == 6) {
            InterfaceC71012qX interfaceC71012qX3 = ((C71052qb) aqS65S0201000_1.l0).LJ;
            if (interfaceC71012qX3 != null) {
                interfaceC71012qX3.LIZJ(3, ((C71052qb) aqS65S0201000_1.l0).LJIIIIZZ, new ArrayList());
            }
        } else if (i == 2 && (interfaceC71012qX = ((C71052qb) aqS65S0201000_1.l0).LJ) != null) {
            List list2 = (List) aqS65S0201000_1.l1;
            if (list2 == null) {
                list2 = new ArrayList();
            }
            interfaceC71012qX.LIZJ(2, ((C71052qb) aqS65S0201000_1.l0).LJIIIIZZ, list2);
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$1(AqS65S0201000_1 aqS65S0201000_1) {
        C779434c c779434c;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("setServerListener onConnect serviceId: ");
        LIZ.append(aqS65S0201000_1.i2);
        C70922qO.LIZ("CastingManager", X1D.LIZIZ(LIZ));
        C71052qb c71052qb = (C71052qb) aqS65S0201000_1.l0;
        InterfaceC71012qX interfaceC71012qX = c71052qb.LJ;
        if (interfaceC71012qX != null) {
            interfaceC71012qX.LIZLLL((ServiceInfo) aqS65S0201000_1.l1, c71052qb.LJIIIIZZ);
        }
        EventBus LIZJ = EventBus.LIZJ();
        C71082qe c71082qe = C71042qa.LIZIZ;
        if (c71082qe != null) {
            c779434c = c71082qe.LIZIZ;
        } else {
            c779434c = null;
        }
        LIZJ.LJIILJJIL(c779434c);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$2(AqS65S0201000_1 aqS65S0201000_1) {
        ((C101783z4) aqS65S0201000_1.l0).LIZIZ((EnumC101803z6) aqS65S0201000_1.l1, aqS65S0201000_1.i2);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$3(AqS65S0201000_1 aqS65S0201000_1) {
        ((DetailFeedKeyboardDialogFragment) aqS65S0201000_1.l0).vl(aqS65S0201000_1.i2);
        InterfaceC92953kp interfaceC92953kp = ((DetailFeedKeyboardDialogFragment) aqS65S0201000_1.l0).LJLLLL;
        if (interfaceC92953kp != null) {
            interfaceC92953kp.n2((CharSequence) aqS65S0201000_1.l1, false);
        }
        return C76800UCe.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS65S0201000_1(int i, C71052qb c71052qb, ServiceInfo serviceInfo, int i2) {
        super(0);
        this.$t = i2;
        this.i2 = i;
        this.l0 = c71052qb;
        this.l1 = serviceInfo;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AqS65S0201000_1(int i, int i2, C71052qb c71052qb, List<ServiceInfo> list) {
        super(0);
        this.$t = list;
        this.i2 = i;
        this.l0 = i2;
        this.l1 = c71052qb;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS65S0201000_1(C101783z4 c101783z4, EnumC101803z6 enumC101803z6, int i, int i2) {
        super(0);
        this.$t = i2;
        this.l0 = c101783z4;
        this.l1 = enumC101803z6;
        this.i2 = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS65S0201000_1(DetailFeedKeyboardDialogFragment detailFeedKeyboardDialogFragment, int i, CharSequence charSequence, int i2) {
        super(0);
        this.$t = i2;
        this.l0 = detailFeedKeyboardDialogFragment;
        this.i2 = i;
        this.l1 = charSequence;
    }
}
