package X;

import com.ss.android.ugc.aweme.dsp.playpage.model.DspFeedResponse;
import com.ss.android.ugc.aweme.utils.GsonHolder;
import java.io.FileReader;
import java.util.concurrent.Callable;
import kotlin.jvm.internal.o;

/* renamed from: X.ZrM, reason: case insensitive filesystem */
/* loaded from: classes22.dex */
public final class CallableC91236ZrM<V> implements Callable {
    public final /* synthetic */ boolean LJLIL;

    public CallableC91236ZrM(boolean z) {
        this.LJLIL = z;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        C65385PlN c65385PlN;
        DspFeedResponse dspFeedResponse;
        if (!this.LJLIL) {
            C91237ZrN.LIZJ(0L);
        }
        C65385PlN c65385PlN2 = null;
        try {
            try {
                c65385PlN = new C65385PlN(new FileReader(C91237ZrN.LIZ()));
            } catch (Throwable th) {
                th = th;
                c65385PlN = c65385PlN2;
            }
        } catch (Exception unused) {
        }
        try {
            Object LJIIIIZZ = GsonHolder.LIZLLL().LIZ().LJIIIIZZ(c65385PlN, DspFeedResponse.class);
            o.LJIIIIZZ(LJIIIIZZ, "{\n                reader…class.java)\n            }");
            dspFeedResponse = (DspFeedResponse) LJIIIIZZ;
            C37247Ejb.LIZ.getClass();
            C36871EdX.LIZ(c65385PlN);
        } catch (Exception unused2) {
            c65385PlN2 = c65385PlN;
            dspFeedResponse = new DspFeedResponse();
            C37247Ejb.LIZ.getClass();
            C36871EdX.LIZ(c65385PlN2);
            return dspFeedResponse;
        } catch (Throwable th2) {
            th = th2;
            C37247Ejb.LIZ.getClass();
            C36871EdX.LIZ(c65385PlN);
            throw th;
        }
        return dspFeedResponse;
    }
}
