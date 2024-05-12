package Y;

import X.C69084R9k;
import X.InterfaceC64592gB;
import X.InterfaceC69056R8i;
import X.R40;
import X.R9Y;
import androidx.fragment.app.Fragment;
import com.ss.android.ugc.aweme.account.login.v2.network.SetPasswordMobHelper;
import kotlin.jvm.internal.AqS8S2300000_11;
import kotlin.jvm.internal.o;
import yq4.a;

/* loaded from: classes12.dex */
public class AfS3S2200000_11 implements InterfaceC64592gB {
    public final int $t;
    public Object l2;
    public Object l3;
    public String s0;
    public String s1;

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

    public static final void accept$0(AfS3S2200000_11 afS3S2200000_11, Object obj) {
        Throwable th = (Throwable) obj;
        SetPasswordMobHelper setPasswordMobHelper = (SetPasswordMobHelper) afS3S2200000_11.l2;
        String str = afS3S2200000_11.s0;
        String LJJLIIIJJI = ((InterfaceC69056R8i) afS3S2200000_11.l3).q9().LJJLIIIJJI();
        String LJJLIIIJLLLLLLLZ = ((InterfaceC69056R8i) afS3S2200000_11.l3).q9().LJJLIIIJLLLLLLLZ();
        String LLZZ = ((InterfaceC69056R8i) afS3S2200000_11.l3).q9().LLZZ();
        o.LJII(th, "null cannot be cast to non-null type com.ss.android.ugc.aweme.account.login.v2.network.NetworkException");
        setPasswordMobHelper.LIZ(true, str, LJJLIIIJJI, LJJLIIIJLLLLLLLZ, LLZZ, ((C69084R9k) th).getErrorCode(), ((InterfaceC69056R8i) afS3S2200000_11.l3).q9(), afS3S2200000_11.s1);
    }

    public static final void accept$1(AfS3S2200000_11 afS3S2200000_11, Object obj) {
        R40 r40 = (R40) obj;
        AqS8S2300000_11 aqS8S2300000_11 = new AqS8S2300000_11(afS3S2200000_11.s0, (String) afS3S2200000_11.l2, (Fragment) afS3S2200000_11.s1, (String) r40, (R40<R9Y>) afS3S2200000_11.l3, (InterfaceC69056R8i) 0);
        if (((R9Y) r40.LJIIIZ).LJI.LJIIJJI) {
            a.LJI().LJIILLIIL(new ARunnableS46S0100000_10((Object) aqS8S2300000_11, 33), true);
        } else {
            aqS8S2300000_11.invoke();
        }
    }

    public static final void accept$2(AfS3S2200000_11 afS3S2200000_11, Object obj) {
        ((SetPasswordMobHelper) afS3S2200000_11.l2).LIZ(true, afS3S2200000_11.s0, ((InterfaceC69056R8i) afS3S2200000_11.l3).q9().LJJLIIIJJI(), ((InterfaceC69056R8i) afS3S2200000_11.l3).q9().LJJLIIIJLLLLLLLZ(), ((InterfaceC69056R8i) afS3S2200000_11.l3).q9().LLZZ(), 0, ((InterfaceC69056R8i) afS3S2200000_11.l3).q9(), afS3S2200000_11.s1);
    }

    public AfS3S2200000_11(Object obj, Object obj2, String str, String str2, int i) {
        this.$t = i;
        this.s0 = str;
        this.l2 = obj;
        this.s1 = str2;
        this.l3 = obj2;
    }
}
