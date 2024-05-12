package X;

import Y.ARunnableS33S0200000_14;
import android.os.Handler;
import android.os.Looper;
import com.lynx.react.bridge.Callback;
import com.lynx.tasm.behavior.PaintingContext;

/* loaded from: classes15.dex */
public final class VOK implements Callback {
    public final /* synthetic */ long LIZ;
    public final /* synthetic */ int LIZIZ;
    public final /* synthetic */ PaintingContext LIZJ;

    @Override // com.lynx.react.bridge.Callback
    public final void invoke(Object... objArr) {
        ARunnableS33S0200000_14 aRunnableS33S0200000_14 = new ARunnableS33S0200000_14(this, objArr, 21);
        if (Looper.myLooper() == C16880lQ.LLJJJJ()) {
            aRunnableS33S0200000_14.run();
        } else {
            new Handler(C16880lQ.LLJJJJ()).post(aRunnableS33S0200000_14);
        }
    }

    public VOK(PaintingContext paintingContext, long j, int i) {
        this.LIZJ = paintingContext;
        this.LIZ = j;
        this.LIZIZ = i;
    }
}
