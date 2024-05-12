package X;

import Y.ARunnableS43S0100000_7;
import com.ss.android.ugc.aweme.shortvideo.SafeHandler;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class IDI implements InterfaceC83974WxW {
    public final ARunnableS43S0100000_7 LIZ;
    public final InterfaceC83974WxW LIZIZ;
    public final I3X LIZJ;
    public final SafeHandler LIZLLL;

    @Override // X.InterfaceC83974WxW
    public final void onResult(String[] strArr) {
        this.LIZLLL.removeCallbacks(this.LIZ);
        this.LIZIZ.onResult(strArr);
    }

    public IDI(C44349Har c44349Har, I3X recordControlApi, SafeHandler safeHandler) {
        o.LJIIIZ(recordControlApi, "recordControlApi");
        o.LJIIIZ(safeHandler, "safeHandler");
        this.LIZIZ = c44349Har;
        this.LIZJ = recordControlApi;
        this.LIZLLL = safeHandler;
        ARunnableS43S0100000_7 aRunnableS43S0100000_7 = new ARunnableS43S0100000_7(this, 7);
        this.LIZ = aRunnableS43S0100000_7;
        safeHandler.postDelayed(aRunnableS43S0100000_7, 1000L);
    }
}
