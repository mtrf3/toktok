package X;

import Y.ACallableS109S0100000_6;
import Y.IDxS307S0100000_6;
import com.bytedance.ies.ugc.aweme.network.IRetrofitFactory;
import com.bytedance.ies.ugc.aweme.network.RetrofitFactory;
import com.ss.android.ugc.aweme.plugin.realtimefeedbackexperiment.RealtimeFeedbackInterceptor;
import com.ss.android.ugc.aweme.util.CountDownTimer;
import java.util.ArrayList;

/* loaded from: classes7.dex */
public final class E6P implements JC4 {
    public final /* synthetic */ RealtimeFeedbackInterceptor LJLIL;

    @Override // X.JC4
    public final void onStart() {
    }

    @Override // X.JC4
    public final void LIZ() {
        CountDownTimer countDownTimer = this.LJLIL.LIZJ;
        if (countDownTimer != null) {
            countDownTimer.cancel();
        }
        this.LJLIL.LIZJ = null;
        if (!r1.LIZIZ.isEmpty()) {
            C10K.LIZJ(new ACallableS109S0100000_6(this.LJLIL, 4));
        }
    }

    public E6P(RealtimeFeedbackInterceptor realtimeFeedbackInterceptor) {
        this.LJLIL = realtimeFeedbackInterceptor;
    }

    @Override // X.JC4
    public final void LJIILIIL(long j) {
        if (j >= 5000) {
            return;
        }
        ArrayList arrayList = new ArrayList(this.LJLIL.LIZIZ);
        this.LJLIL.LIZIZ.clear();
        IRetrofitFactory LIZLLL = RetrofitFactory.LIZLLL();
        String str = EFJ.LIZJ;
        RealtimeFeedbackInterceptor.RealtimeApi realtimeApi = (RealtimeFeedbackInterceptor.RealtimeApi) C770830u.LIZJ(str, "API_URL_PREFIX_SI", LIZLLL, str).LIZ.LIZ(RealtimeFeedbackInterceptor.RealtimeApi.class);
        try {
            this.LJLIL.getClass();
            realtimeApi.uploadRealtimeFeedback(RealtimeFeedbackInterceptor.LIZIZ(arrayList)).LJJL(T16.LIZ()).LJJLIIIJ(1L).LIZ(new IDxS307S0100000_6(this.LJLIL, 4));
        } catch (Exception unused) {
        }
    }
}
