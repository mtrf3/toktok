package X;

import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.zhiliaoapp.musically.R;

/* renamed from: X.J8e, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C48668J8e<TTaskResult, TContinuationResult> implements C10I {
    public final /* synthetic */ ViewOnClickListenerC48667J8d LIZ;
    public final /* synthetic */ int LIZIZ;
    public final /* synthetic */ boolean LIZJ;

    public C48668J8e(ViewOnClickListenerC48667J8d viewOnClickListenerC48667J8d, int i, boolean z) {
        this.LIZ = viewOnClickListenerC48667J8d;
        this.LIZIZ = i;
        this.LIZJ = z;
    }

    @Override // X.C10I
    public final Object then(C10K<BaseResponse> c10k) {
        String str;
        if (c10k.LJIIL() || c10k.LJIILJJIL()) {
            ViewOnClickListenerC48667J8d viewOnClickListenerC48667J8d = this.LIZ;
            viewOnClickListenerC48667J8d.LJIIL();
            C5S1 c5s1 = new C5S1(viewOnClickListenerC48667J8d.LJLJL);
            c5s1.LIZJ(R.string.g5w);
            c5s1.LJ();
            return null;
        }
        if (!c10k.LJIILIIL()) {
            return null;
        }
        try {
            C235779Nd.LIZ.LIZJ().LIZLLL(Integer.valueOf(this.LIZIZ));
            if (this.LIZJ) {
                str = "data_saver_on";
            } else {
                str = "data_saver_off";
            }
            FMX.onEventV3(str);
            return null;
        } catch (Exception e) {
            C16880lQ.LLLLIIL(e);
            ViewOnClickListenerC48667J8d viewOnClickListenerC48667J8d2 = this.LIZ;
            viewOnClickListenerC48667J8d2.LJIIL();
            C5S1 c5s12 = new C5S1(viewOnClickListenerC48667J8d2.LJLJL);
            c5s12.LIZJ(R.string.g5w);
            c5s12.LJ();
            return null;
        }
    }
}
