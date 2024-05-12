package Y;

import X.C10I;
import X.C10K;
import X.C40453FuD;
import X.C61599OFn;
import X.C61601OFp;
import X.C61602OFq;
import X.C61604OFs;
import X.C61608OFw;
import X.C76800UCe;
import X.InterfaceC61605OFt;
import X.LEA;
import X.R41;
import android.content.Context;
import android.os.Bundle;
import com.ss.android.ugc.aweme.IAccountUserService;
import com.ss.android.ugc.aweme.brdatagift.api.BaseBemobiResponse;
import com.ss.android.ugc.aweme.compliance.business.serviceimpl.ChildModeServiceImpl;
import com.ss.android.ugc.aweme.profile.model.User;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.internal.o;

/* loaded from: classes11.dex */
public class AgS113S0200000_10 implements C10I {
    public final int $t;
    public Object l0;
    public Object l1;

    @Override // X.C10I
    public final Object then(C10K c10k) {
        switch (this.$t) {
            case 0:
                return then$0(this, c10k);
            case 1:
                return then$1(this, c10k);
            case 2:
                return then$2(this, c10k);
            case 3:
                return then$3(this, c10k);
            case 4:
                return then$4(this, c10k);
            default:
                return null;
        }
    }

    public AgS113S0200000_10(int i) {
        this.$t = i;
        C61608OFw c61608OFw = C61608OFw.LIZLLL;
        C61602OFq c61602OFq = C61601OFp.LJFF;
        this.l0 = c61608OFw;
        this.l1 = c61602OFq;
    }

    public AgS113S0200000_10(long j, int i) {
        this.$t = i;
        C61608OFw c61608OFw = C61608OFw.LIZLLL;
        C61599OFn c61599OFn = C61601OFp.LIZLLL;
        this.l0 = c61608OFw;
        this.l1 = c61599OFn;
    }

    public static final Object then$0(AgS113S0200000_10 agS113S0200000_10, C10K c10k) {
        if (c10k != null) {
            Object LJIIJJI = c10k.LJIIJJI();
            o.LJIIIIZZ(LJIIJJI, "task.result");
            if (((Boolean) LJIIJJI).booleanValue()) {
                ((ChildModeServiceImpl) agS113S0200000_10.l0).LJIIZILJ((Context) agS113S0200000_10.l1);
            }
        }
        return C76800UCe.LIZ;
    }

    public static final Object then$1(AgS113S0200000_10 agS113S0200000_10, C10K c10k) {
        if (c10k != null) {
            Object LJIIJJI = c10k.LJIIJJI();
            o.LJIIIIZZ(LJIIJJI, "task.result");
            if (((Boolean) LJIIJJI).booleanValue()) {
                ((ChildModeServiceImpl) agS113S0200000_10.l0).LJIIZILJ((Context) agS113S0200000_10.l1);
            }
        }
        return C76800UCe.LIZ;
    }

    public static final Object then$2(AgS113S0200000_10 agS113S0200000_10, C10K c10k) {
        int i = ((C61604OFs) c10k.LJIIJJI()).LIZ;
        BaseBemobiResponse baseBemobiResponse = ((C61604OFs) c10k.LJIIJJI()).LIZIZ;
        Exception exc = ((C61604OFs) c10k.LJIIJJI()).LIZJ;
        ((C61608OFw) agS113S0200000_10.l0).LIZJ = false;
        if (i != 200) {
            if (i != 203) {
                if (i != 302) {
                    InterfaceC61605OFt interfaceC61605OFt = (InterfaceC61605OFt) agS113S0200000_10.l1;
                    if (exc == null) {
                        exc = new Exception("unknown");
                    }
                    interfaceC61605OFt.onFailed(exc);
                } else {
                    ((InterfaceC61605OFt) agS113S0200000_10.l1).LIZJ(baseBemobiResponse);
                }
            } else {
                ((InterfaceC61605OFt) agS113S0200000_10.l1).LIZIZ(baseBemobiResponse);
            }
        } else {
            ((InterfaceC61605OFt) agS113S0200000_10.l1).LIZ(baseBemobiResponse);
        }
        return C76800UCe.LIZ;
    }

    public static final Object then$3(AgS113S0200000_10 agS113S0200000_10, C10K c10k) {
        int i = ((C61604OFs) c10k.LJIIJJI()).LIZ;
        BaseBemobiResponse baseBemobiResponse = ((C61604OFs) c10k.LJIIJJI()).LIZIZ;
        Exception exc = ((C61604OFs) c10k.LJIIJJI()).LIZJ;
        String status = baseBemobiResponse.status;
        o.LJIIIZ(status, "status");
        C10K.LIZIZ(new ACallableS7S1101000_1(i, status, exc, 1), C10K.LJI, null);
        ((C61608OFw) agS113S0200000_10.l0).LIZ = false;
        if (i != 200) {
            if (i != 203) {
                InterfaceC61605OFt interfaceC61605OFt = (InterfaceC61605OFt) agS113S0200000_10.l1;
                if (exc == null) {
                    exc = new Exception("unknown");
                }
                interfaceC61605OFt.onFailed(exc);
            } else {
                ((InterfaceC61605OFt) agS113S0200000_10.l1).LIZIZ(baseBemobiResponse);
            }
        } else {
            ((InterfaceC61605OFt) agS113S0200000_10.l1).LIZ(baseBemobiResponse);
        }
        return C76800UCe.LIZ;
    }

    public static final Object then$4(AgS113S0200000_10 agS113S0200000_10, C10K c10k) {
        User curUser = ((IAccountUserService) agS113S0200000_10.l0).getCurUser();
        Iterator it = ((CopyOnWriteArrayList) R41.LIZ).iterator();
        while (it.hasNext()) {
            ((LEA) it.next()).onAccountResult(2, true, 0, curUser);
        }
        Bundle bundle = (Bundle) agS113S0200000_10.l1;
        return C40453FuD.LIZIZ(bundle, null).LJ(new AgS127S0100000_10(bundle, 11), C10K.LJIIIIZZ, null);
    }

    public AgS113S0200000_10(Object obj, Object obj2, int i) {
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
    }
}
