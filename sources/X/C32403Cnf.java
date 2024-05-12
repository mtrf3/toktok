package X;

import Y.ARunnableS24S0200000_5;
import android.os.Handler;
import com.bytedance.android.livesdk.livesetting.broadcast.HandlerThreadOptSetting;
import com.ss.android.ugc.bytex.pthread.base.proxy.PThreadScheduledThreadPoolExecutor;
import java.util.concurrent.RunnableScheduledFuture;

/* renamed from: X.Cnf, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C32403Cnf extends AbstractC32415Cnr {
    public final Handler LIZIZ;

    @Override // X.AbstractC32415Cnr
    public final void LIZ(C32399Cnb c32399Cnb) {
        Handler handler;
        PThreadScheduledThreadPoolExecutor pThreadScheduledThreadPoolExecutor;
        if (HandlerThreadOptSetting.INSTANCE.enable()) {
            if (c32399Cnb != null) {
                RunnableScheduledFuture<?> runnableScheduledFuture = c32399Cnb.LJI;
                if (runnableScheduledFuture != null && (pThreadScheduledThreadPoolExecutor = C39202Fa2.LJFF) != null) {
                    pThreadScheduledThreadPoolExecutor.remove(runnableScheduledFuture);
                }
                c32399Cnb.LJIIIIZZ = false;
            }
        } else if (c32399Cnb != null) {
            ARunnableS24S0200000_5 aRunnableS24S0200000_5 = c32399Cnb.LJFF;
            if (aRunnableS24S0200000_5 != null && (handler = this.LIZIZ) != null) {
                handler.removeCallbacks(aRunnableS24S0200000_5);
            }
            c32399Cnb.LJIIIIZZ = false;
        }
        AbstractC32415Cnr abstractC32415Cnr = this.LIZ;
        if (abstractC32415Cnr != null) {
            abstractC32415Cnr.LIZ(c32399Cnb);
        }
    }

    public C32403Cnf(AbstractC32415Cnr abstractC32415Cnr, Handler handler) {
        super(abstractC32415Cnr);
        this.LIZIZ = handler;
    }
}
