package X;

import com.ss.android.ugc.aweme.base.api.BaseResponse;
import java.util.List;
import org.json.JSONException;

/* renamed from: X.Pqx, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public class C65731Pqx implements InterfaceC65753PrJ<C64797Pbt> {
    public final /* synthetic */ C65730Pqw LIZ;

    public C65731Pqx(C65730Pqw c65730Pqw) {
        this.LIZ = c65730Pqw;
    }

    @Override // X.InterfaceC65753PrJ
    public final void onFailure(Throwable th) {
        this.LIZ.LJIIJJI(th);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC65753PrJ
    public final void onSuccess(C64797Pbt c64797Pbt) {
        C36910EeA c36910EeA;
        String str;
        C64797Pbt c64797Pbt2 = c64797Pbt;
        if (c64797Pbt2.LIZIZ()) {
            T t = c64797Pbt2.LIZIZ;
            if (t instanceof InterfaceC65316PkG) {
                InterfaceC65316PkG interfaceC65316PkG = (InterfaceC65316PkG) t;
                C65218Pig c65218Pig = this.LIZ.LJLJLLL;
                List<EJ6> list = c64797Pbt2.LIZ.LIZLLL;
                c65218Pig.getClass();
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
            if ((t instanceof K4J) && (c36910EeA = c64797Pbt2.LIZ) != null) {
                Object obj = c36910EeA.LJFF;
                if (obj instanceof C64668PZo) {
                    try {
                        ((K4J) t).setRequestInfo((C64668PZo) obj);
                    } catch (JSONException e) {
                        C16880lQ.LLLLIIL(e);
                    }
                }
            }
            if (t instanceof BaseResponse) {
                BaseResponse baseResponse = (BaseResponse) t;
                C36910EeA c36910EeA2 = c64797Pbt2.LIZ;
                if (c36910EeA2 != null) {
                    C78609UtB.LJJJJI(baseResponse.status_code, c36910EeA2.LIZ, baseResponse.toString());
                }
            }
            this.LIZ.LJIIJ(t);
            return;
        }
        this.LIZ.LJIIJJI(new RuntimeException("HttpException"));
    }
}
