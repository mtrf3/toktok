package X;

import com.ss.android.ugc.aweme.services.LoginMethodService;
import com.ss.android.ugc.aweme.setting.page.security.SecurityAlertsCell;
import com.ss.android.ugc.aweme.setting.page.security.SecurityVerificationCell;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import kotlin.jvm.internal.AqS170S0100000_4;
import kotlin.jvm.internal.o;

/* renamed from: X.9xO, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C253629xO extends AbstractC65781Prl implements InterfaceC88472Yns<C253639xP, C76800UCe> {
    public static final C253629xO LJLIL = new C253629xO();

    public C253629xO() {
        super(1);
    }

    @Override // X.InterfaceC88472Yns
    public final C76800UCe invoke(C253639xP c253639xP) {
        C253639xP appendItems = c253639xP;
        o.LJIIIZ(appendItems, "$this$appendItems");
        ((ArrayList) appendItems.LIZ).add(new AEB("", false, false, false, true, null, null, null, null, null, null, 16350));
        if (!AV1.LJIIJJI()) {
            C253639xP.LIZIZ(appendItems, new C253359wx() { // from class: X.9wz
                {
                    this.LJLIL = R.string.qfd;
                }
            }, SecurityAlertsCell.class, C232369Aa.LJLIL, 8);
            appendItems.LIZ(new C253569xI() { // from class: X.9xL
                {
                    this.LJLIL = R.string.qfe;
                }
            }, C253589xK.LJLIL);
            ((ArrayList) appendItems.LIZ).add(new C253569xI() { // from class: X.9xM
                {
                    this.LJLIL = R.string.bw0;
                }
            });
            C253639xP.LIZIZ(appendItems, new C253569xI() { // from class: X.9xN
                {
                    this.LJLIL = R.string.qfj;
                    if (!C52927Kpv.LIZ()) {
                        this.LJLJI = R.string.rn5;
                    }
                }
            }, SecurityVerificationCell.class, null, 12);
        }
        HG3.LJIIL();
        LoginMethodService LJIIIZ = HG3.LJLJL.LJIIIZ();
        C253699xV c253699xV = new C253699xV() { // from class: X.9xU
            {
                this.LJLIL = R.string.q9g;
            }
        };
        AqS170S0100000_4 aqS170S0100000_4 = new AqS170S0100000_4((InterfaceC253709xW) LJIIIZ, 781);
        AqS170S0100000_4 aqS170S0100000_42 = new AqS170S0100000_4((InterfaceC253709xW) LJIIIZ, 782);
        if (((Boolean) aqS170S0100000_4.invoke(c253699xV)).booleanValue()) {
            aqS170S0100000_42.invoke(c253699xV);
            ((ArrayList) appendItems.LIZ).add(c253699xV);
        }
        appendItems.LIZ(new C253569xI() { // from class: X.9xJ
            {
                this.LJLIL = R.string.qfi;
                this.LJLJI = R.string.qfh;
            }
        }, C7CX.LJLIL);
        ((ArrayList) appendItems.LIZ).add(new AEB("", false, false, true, false, null, null, null, null, null, null, 16366));
        return C76800UCe.LIZ;
    }
}
