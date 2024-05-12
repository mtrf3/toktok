package Y;

import X.C10I;
import X.C10K;
import X.C38350F3i;
import X.C73992T2e;
import X.C76800UCe;
import X.C81808W8u;
import X.InterfaceC82923WgZ;
import X.W5O;
import X.W6J;
import X.W6U;
import com.ss.android.ugc.aweme.pns.universalpopup.api.model.UniversalPopupAction;
import com.ss.android.ugc.aweme.pns.universalpopup.core.ui.UniversalPopupViewModel;
import java.util.HashMap;
import java.util.Map;
import kotlin.jvm.internal.o;

/* loaded from: classes15.dex */
public class AgS77S0300000_14 implements C10I {
    public final int $t;
    public Object l0;
    public Object l1;
    public Object l2;

    @Override // X.C10I
    public final Object then(C10K c10k) {
        switch (this.$t) {
            case 0:
                return then$0(this, c10k);
            case 1:
                return then$1(this, c10k);
            case 2:
                return then$2(this, c10k);
            default:
                return null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x00b2, code lost:
    
        if (X.C76800UCe.LIZ == null) goto L29;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object then$0(Y.AgS77S0300000_14 r6, X.C10K r7) {
        /*
            Method dump skipped, instructions count: 258
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.AgS77S0300000_14.then$0(Y.AgS77S0300000_14, X.10K):java.lang.Object");
    }

    public static final Object then$1(AgS77S0300000_14 agS77S0300000_14, C10K c10k) {
        Integer LJJIL;
        int intValue;
        UniversalPopupViewModel this$0 = (UniversalPopupViewModel) agS77S0300000_14.l0;
        UniversalPopupAction action = (UniversalPopupAction) agS77S0300000_14.l1;
        Map<String, String> extra = (Map) agS77S0300000_14.l2;
        o.LJIIIZ(this$0, "this$0");
        o.LJIIIZ(action, "$action");
        o.LJIIIZ(extra, "$extra");
        if (c10k.LJIILJJIL()) {
            C73992T2e c73992T2e = this$0.LJLJJI;
            String message = c10k.LJIIJ().getMessage();
            if (message == null || (LJJIL = C38350F3i.LJJIL(message)) == null) {
                intValue = -1;
            } else {
                intValue = LJJIL.intValue();
            }
            c73992T2e.getClass();
            C73992T2e.LIZ(intValue, "/policy/notice/approve/");
            return null;
        }
        this$0.LJLJJI.getClass();
        C73992T2e.LIZ(0, "/policy/notice/approve/");
        for (String str : action.getCustomizedActions()) {
            InterfaceC82923WgZ interfaceC82923WgZ = this$0.LJLJJL;
            if (interfaceC82923WgZ != null) {
                interfaceC82923WgZ.LIZIZ(str, extra);
            }
        }
        return C76800UCe.LIZ;
    }

    public static final Object then$2(AgS77S0300000_14 agS77S0300000_14, C10K c10k) {
        C81808W8u c81808W8u;
        if (!c10k.LJIIL() && !c10k.LJIILJJIL() && ((Boolean) c10k.LJIIJJI()).booleanValue()) {
            return C10K.LJIIIZ(Boolean.TRUE);
        }
        HashMap<String, C81808W8u> hashMap = ((W6J) agS77S0300000_14.l2).LJII;
        if (hashMap == null || hashMap.isEmpty() || (c81808W8u = ((W6J) agS77S0300000_14.l2).LJII.get(((W5O) agS77S0300000_14.l0).LJIJ)) == null) {
            return C10K.LJIIIZ(Boolean.FALSE);
        }
        return c81808W8u.LIZIZ((W6U) agS77S0300000_14.l1);
    }

    public AgS77S0300000_14(Object obj, Object obj2, Object obj3, int i) {
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
        this.l2 = obj3;
    }
}
