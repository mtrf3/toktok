package X;

import Y.ARunnableS3S1101000_11;
import Y.IDCListenerS163S0100000_11;
import android.app.Activity;
import android.os.Handler;
import com.bytedance.retrofit2.client.Request;
import com.ss.android.ugc.aweme.sec.SecApiImpl;
import com.zhiliaoapp.musically.R;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: X.PtV, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C65889PtV extends AbstractC65440PmG {
    public final AtomicBoolean LIZJ;

    public C65889PtV(C65437PmD c65437PmD) {
        super(c65437PmD);
        this.LIZJ = new AtomicBoolean(false);
    }

    @Override // X.AbstractC65440PmG
    public final C65442PmI LIZ(C65441PmH c65441PmH, Request request, C64797Pbt<?> c64797Pbt) {
        C65436PmC c65436PmC = c65441PmH.LIZ;
        if (c65436PmC != null && ((c65436PmC.LIZ == 3070 || c65436PmC.LIZ == 3071 || c65436PmC.LIZ == 3072) && this.LIZJ.compareAndSet(false, true))) {
            new Handler(C16880lQ.LLJJJJ()).post(new ARunnableS3S1101000_11(c65441PmH.LIZ.LIZ, this, request.getUrl(), 5));
            return new C65442PmI(true, false);
        }
        return AbstractC65440PmG.LIZIZ;
    }

    public final void LIZJ(int i, Activity activity, String str) {
        switch (i) {
            case 3070:
            case 3072:
                SecApiImpl.LIZ().popCaptcha(activity, i, new C65890PtW(this, str));
                return;
            case 3071:
                C62905OmT c62905OmT = new C62905OmT(activity);
                if (((RBX) HG3.LJIILL()).isLogin()) {
                    c62905OmT.LJ(R.string.hwg);
                    c62905OmT.LIZ(R.string.hwf);
                    c62905OmT.LJIIJ(R.string.ehr, new IDCListenerS163S0100000_11(this, 3));
                } else {
                    c62905OmT.LIZ(R.string.dra);
                    c62905OmT.LJII(R.string.cel, new IDCListenerS163S0100000_11(this, 4));
                    c62905OmT.LJIIJ(R.string.dny, new DialogInterfaceOnClickListenerC65894Pta(activity, this, str));
                }
                c62905OmT.LJII = false;
                C279017q.LIZLLL(c62905OmT);
                return;
            default:
                return;
        }
    }
}
