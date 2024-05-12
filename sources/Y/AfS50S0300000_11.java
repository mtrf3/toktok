package Y;

import X.ActivityC45651qj;
import X.C68972R5c;
import X.C68985R5p;
import X.C69040R7s;
import X.EnumC69113RAn;
import X.EnumC69116RAq;
import X.InterfaceC64592gB;
import X.InterfaceC69056R8i;
import X.QTX;
import X.QXB;
import X.R40;
import X.R6R;
import X.R7Z;
import androidx.fragment.app.Fragment;
import com.ss.android.account.share.data.model.AccountShareInfo;
import com.ss.android.ugc.aweme.services.interceptor.ConditionalBindLoginParam;
import java.util.HashMap;
import kotlin.jvm.internal.o;

/* loaded from: classes12.dex */
public class AfS50S0300000_11 implements InterfaceC64592gB {
    public final int $t;
    public Object l0;
    public Object l1;
    public Object l2;

    @Override // X.InterfaceC64592gB
    public final void accept(Object obj) {
        switch (this.$t) {
            case 0:
                accept$0(this, obj);
                return;
            case 1:
                accept$1(this, obj);
                return;
            case 2:
                accept$2(this, obj);
                return;
            default:
                return;
        }
    }

    public static final void accept$0(AfS50S0300000_11 afS50S0300000_11, Object obj) {
        R6R r6r = (R6R) obj;
        C68972R5c.LJIIIZ(((ConditionalBindLoginParam) afS50S0300000_11.l0).isRegister(), "phone", ((InterfaceC69056R8i) afS50S0300000_11.l1).q9(), r6r.LJIIIZ, null);
        ActivityC45651qj mo49getActivity = ((Fragment) afS50S0300000_11.l2).mo49getActivity();
        if (mo49getActivity != null) {
            QTX qtx = r6r.LJIIIZ;
            o.LJIIIIZZ(qtx, "it.userInfo");
            C68985R5p.LIZ(mo49getActivity, qtx, null, false);
        }
    }

    public static final void accept$1(AfS50S0300000_11 afS50S0300000_11, Object obj) {
        boolean z;
        R40 r40 = (R40) obj;
        EnumC69116RAq enumC69116RAq = (EnumC69116RAq) afS50S0300000_11.l0;
        EnumC69116RAq enumC69116RAq2 = EnumC69116RAq.SIGN_UP;
        if (enumC69116RAq == enumC69116RAq2) {
            z = true;
        } else {
            z = false;
        }
        C68972R5c.LJIIIZ(z, "sms_verification", ((InterfaceC69056R8i) afS50S0300000_11.l1).q9(), ((R7Z) r40.LJIIIZ).LJFF, null);
        Fragment fragment = (Fragment) afS50S0300000_11.l2;
        InterfaceC69056R8i interfaceC69056R8i = (InterfaceC69056R8i) afS50S0300000_11.l1;
        EnumC69113RAn LJLLLL = interfaceC69056R8i.LJLLLL();
        QTX qtx = ((R7Z) r40.LJIIIZ).LJFF;
        o.LJIIIIZZ(qtx, "it.mobileObj.mUserInfo");
        C68985R5p.LIZIZ(fragment, interfaceC69056R8i, enumC69116RAq2, LJLLLL, qtx);
        if (C69040R7s.LIZIZ()) {
            C69040R7s.LIZ = null;
        }
    }

    public static final void accept$2(AfS50S0300000_11 afS50S0300000_11, Object obj) {
        QXB qxb = (QXB) afS50S0300000_11.l0;
        AccountShareInfo accountShareInfo = (AccountShareInfo) afS50S0300000_11.l1;
        HashMap hashMap = (HashMap) afS50S0300000_11.l2;
        qxb.getClass();
        QXB.LIZLLL(accountShareInfo, hashMap);
    }

    public AfS50S0300000_11(Object obj, Object obj2, Object obj3, int i) {
        this.$t = i;
        this.l0 = obj3;
        this.l1 = obj2;
        this.l2 = obj;
    }
}
