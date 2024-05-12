package Y;

import X.AbstractC73672Svk;
import X.C47261Igj;
import X.C54859Lfz;
import X.C56745MOv;
import X.C68322mC;
import X.C73433Srt;
import X.C73673Svl;
import X.C76800UCe;
import X.HG3;
import X.InterfaceC54862Lg2;
import X.InterfaceC64592gB;
import X.InterfaceC73573Su9;
import X.InterfaceC86003Zc;
import X.MP1;
import X.MP6;
import X.MQM;
import X.RBX;
import X.X1D;
import com.ss.android.ugc.aweme.service.FriendsTabDbService;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public class IDuS79S0200000_9 implements InterfaceC86003Zc {
    public final int $t;
    public Object l0;
    public Object l1;

    @Override // X.InterfaceC86003Zc
    public final void subscribe(InterfaceC73573Su9<Integer> interfaceC73573Su9) {
        switch (this.$t) {
            case 0:
                subscribe$0(this, interfaceC73573Su9);
                return;
            case 1:
                subscribe$1(this, interfaceC73573Su9);
                return;
            case 2:
                subscribe$2(this, interfaceC73573Su9);
                return;
            case 3:
                subscribe$3(this, interfaceC73573Su9);
                return;
            case 4:
                subscribe$4(this, interfaceC73573Su9);
                return;
            default:
                return;
        }
    }

    public static final void subscribe$0(IDuS79S0200000_9 iDuS79S0200000_9, InterfaceC73573Su9 interfaceC73573Su9) {
        interfaceC73573Su9.onNext(Integer.valueOf(((FriendsTabDbService) iDuS79S0200000_9.l0).LJIIL().LJ((List) iDuS79S0200000_9.l1)));
        interfaceC73573Su9.onComplete();
    }

    public static final void subscribe$1(IDuS79S0200000_9 iDuS79S0200000_9, InterfaceC73573Su9 interfaceC73573Su9) {
        ((FriendsTabDbService) iDuS79S0200000_9.l0).LJIIL().LJIIJJI((List) iDuS79S0200000_9.l1);
        interfaceC73573Su9.onNext(C76800UCe.LIZ);
        interfaceC73573Su9.onComplete();
    }

    public static final void subscribe$2(IDuS79S0200000_9 iDuS79S0200000_9, InterfaceC73573Su9 interfaceC73573Su9) {
        C54859Lfz c54859Lfz;
        InterfaceC54862Lg2 LJIIL = ((FriendsTabDbService) iDuS79S0200000_9.l0).LJIIL();
        String str = ((C54859Lfz) iDuS79S0200000_9.l1).LJLIL;
        String curUserId = ((RBX) HG3.LJIILL()).getCurUserId();
        o.LJIIIIZZ(curUserId, "userService().curUserId");
        Iterator<C54859Lfz> it = LJIIL.LJIIIZ(str, curUserId).iterator();
        while (true) {
            if (it.hasNext()) {
                c54859Lfz = it.next();
                if (c54859Lfz.LJLJJLL == 0) {
                    break;
                }
            } else {
                c54859Lfz = null;
                break;
            }
        }
        C54859Lfz c54859Lfz2 = c54859Lfz;
        if (c54859Lfz2 == null || c54859Lfz2.LJLILLLLZI == 0) {
            ((FriendsTabDbService) iDuS79S0200000_9.l0).LJIIL().LJIIJJI(C47261Igj.LJII((C54859Lfz) iDuS79S0200000_9.l1));
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("insertFriendsFeedReadEntity not read insert ");
            LIZ.append(((C54859Lfz) iDuS79S0200000_9.l1).LJLIL);
            interfaceC73573Su9.onNext(X1D.LIZIZ(LIZ));
        } else {
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("insertFriendsFeedReadEntity read already ");
            LIZ2.append(((C54859Lfz) iDuS79S0200000_9.l1).LJLIL);
            interfaceC73573Su9.onNext(X1D.LIZIZ(LIZ2));
        }
        interfaceC73573Su9.onComplete();
    }

    public static final void subscribe$3(IDuS79S0200000_9 iDuS79S0200000_9, InterfaceC73573Su9 interfaceC73573Su9) {
        C68322mC c68322mC = new C68322mC();
        C73673Svl LJIIIZ = AbstractC73672Svk.LJIIIZ((List) iDuS79S0200000_9.l0);
        MP1 mp1 = (MP1) iDuS79S0200000_9.l1;
        C73433Srt c73433Srt = (C73433Srt) interfaceC73573Su9;
        LJIIIZ.LJJJLL(new AfS58S0200000_9(c68322mC, mp1, 22), new AfS48S0300000_9(c73433Srt, mp1, c68322mC, 0), new MP6(c73433Srt, mp1, c68322mC));
    }

    public static final void subscribe$4(IDuS79S0200000_9 iDuS79S0200000_9, InterfaceC73573Su9 interfaceC73573Su9) {
        C73673Svl LJIIIZ = AbstractC73672Svk.LJIIIZ((List) iDuS79S0200000_9.l0);
        InterfaceC64592gB interfaceC64592gB = MQM.LJLIL;
        C56745MOv c56745MOv = (C56745MOv) iDuS79S0200000_9.l1;
        C73433Srt c73433Srt = (C73433Srt) interfaceC73573Su9;
        LJIIIZ.LJJJLL(interfaceC64592gB, new AfS58S0200000_9(c56745MOv, c73433Srt, 23), new IDaS160S0200000_9(c73433Srt, c56745MOv, 1));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public IDuS79S0200000_9(Object obj, FriendsTabDbService friendsTabDbService, List<String> list) {
        this.$t = list;
        this.l0 = obj;
        this.l1 = friendsTabDbService;
    }
}
