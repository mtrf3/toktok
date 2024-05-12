package Y;

import X.C10I;
import X.C10K;
import X.C249159qB;
import X.C36910EeA;
import X.C64668PZo;
import X.C64797Pbt;
import X.C65219Pih;
import X.C66947QPf;
import X.C67035QSp;
import X.C67714Qhq;
import X.C76800UCe;
import X.C78609UtB;
import X.C82544WaS;
import X.EJ6;
import X.InterfaceC65316PkG;
import X.K4J;
import X.X1D;
import androidx.lifecycle.LiveData;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.legoImp.task.WebSocketTask;
import com.ss.android.ugc.aweme.profile.edit.YoutubePresenter;
import com.ss.android.ugc.aweme.setting.page.diskmanager.DiskManagerPage;
import com.ss.android.ugc.aweme.setting.page.diskmanager.DiskViewModel;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.jvm.internal.o;

/* loaded from: classes12.dex */
public class AgS128S0100000_11 implements C10I {
    public final int $t;
    public Object l0;

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
            case 5:
                return then$5(this, c10k);
            default:
                return null;
        }
    }

    public AgS128S0100000_11(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final Object then$0(AgS128S0100000_11 agS128S0100000_11, C10K c10k) {
        ((WebSocketTask) agS128S0100000_11.l0).LIZLLL();
        return null;
    }

    public static final Object then$1(AgS128S0100000_11 agS128S0100000_11, C10K c10k) {
        if (!C82544WaS.LJ(c10k) || !((Boolean) c10k.LJIIJJI()).booleanValue()) {
            YoutubePresenter.onError$default((YoutubePresenter) agS128S0100000_11.l0, new Exception(c10k.LJIIJ()), null, "send_token_to_sever", null, 10, null);
        }
        return C76800UCe.LIZ;
    }

    public static final Object then$2(AgS128S0100000_11 agS128S0100000_11, C10K it) {
        LiveData liveData;
        o.LJIIIIZZ(it, "it");
        DiskViewModel Dl = ((DiskManagerPage) agS128S0100000_11.l0).Dl();
        if (Dl != null && (liveData = Dl.LJLJJI) != null) {
            liveData.setValue(it.LJIIJJI());
        }
        return C76800UCe.LIZ;
    }

    public static final Object then$3(AgS128S0100000_11 agS128S0100000_11, C10K c10k) {
        C67035QSp.LJ((C66947QPf) agS128S0100000_11.l0);
        return C76800UCe.LIZ;
    }

    public static final Object then$4(AgS128S0100000_11 agS128S0100000_11, C10K c10k) {
        C67714Qhq c67714Qhq = (C67714Qhq) agS128S0100000_11.l0;
        c67714Qhq.getClass();
        if (!C82544WaS.LJ(c10k) || !((Boolean) c10k.LJIIJJI()).booleanValue()) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("Bolts result error: ");
            LIZ.append(C249159qB.LIZ(c10k.LJIIJ()));
            c67714Qhq.LIZ(c67714Qhq.LJLJJI, X1D.LIZIZ(LIZ), false, c67714Qhq.LJLJJL);
            return null;
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final Object then$5(AgS128S0100000_11 agS128S0100000_11, C10K c10k) {
        String str;
        C36910EeA c36910EeA;
        if (!c10k.LJIIL()) {
            if (!c10k.LJIILJJIL()) {
                C64797Pbt c64797Pbt = (C64797Pbt) c10k.LJIIJJI();
                T t = ((C64797Pbt) c10k.LJIIJJI()).LIZIZ;
                if (t instanceof BaseResponse) {
                    BaseResponse baseResponse = (BaseResponse) t;
                    C36910EeA c36910EeA2 = c64797Pbt.LIZ;
                    if (c36910EeA2 != null) {
                        C78609UtB.LJJJJI(baseResponse.status_code, c36910EeA2.LIZ, baseResponse.toString());
                    }
                }
                if ((t instanceof K4J) && (c36910EeA = c64797Pbt.LIZ) != null) {
                    Object obj = c36910EeA.LJFF;
                    if (obj instanceof C64668PZo) {
                        ((K4J) t).setRequestInfo((C64668PZo) obj);
                    }
                }
                if (t instanceof InterfaceC65316PkG) {
                    InterfaceC65316PkG interfaceC65316PkG = (InterfaceC65316PkG) t;
                    C65219Pih c65219Pih = (C65219Pih) agS128S0100000_11.l0;
                    List<EJ6> list = c64797Pbt.LIZ.LIZLLL;
                    c65219Pih.getClass();
                    if (list != null) {
                        for (EJ6 ej6 : list) {
                            if ("X-TT-LOGID".equalsIgnoreCase(ej6.LIZ)) {
                                str = ej6.LIZIZ;
                                break;
                            }
                        }
                    }
                    str = null;
                    interfaceC65316PkG.setRequestId(str);
                }
                return t;
            }
            throw c10k.LJIIJ();
        }
        throw new CancellationException();
    }
}
