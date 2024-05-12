package X;

import Y.ARunnableS24S0200000_5;
import android.os.Handler;
import com.bytedance.android.livesdk.livesetting.broadcast.HandlerThreadOptSetting;
import com.bytedance.android.livesdk.livesetting.gift.LiveGiftEffectMessagePreloadTimeoutSetting;
import java.util.concurrent.RunnableScheduledFuture;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.o;

/* renamed from: X.Cna, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C32398Cna extends AbstractC32397CnZ {
    public final Handler LIZIZ;

    public C32398Cna(AbstractC32397CnZ abstractC32397CnZ, Handler handler) {
        super(abstractC32397CnZ);
        this.LIZIZ = handler;
    }

    @Override // X.AbstractC32397CnZ
    public final void LIZ(AbstractC32415Cnr abstractC32415Cnr, C32399Cnb c32399Cnb) {
        RunnableScheduledFuture<?> runnableScheduledFuture;
        ARunnableS24S0200000_5 aRunnableS24S0200000_5 = new ARunnableS24S0200000_5(c32399Cnb, abstractC32415Cnr, 35);
        if (HandlerThreadOptSetting.INSTANCE.enable()) {
            if (c32399Cnb != null) {
                TimeUnit unit = TimeUnit.MILLISECONDS;
                o.LJIIIZ(unit, "unit");
                ScheduledFuture<?> schedule = C39202Fa2.LIZJ().schedule(aRunnableS24S0200000_5, LiveGiftEffectMessagePreloadTimeoutSetting.INSTANCE.getValue() * 1000, unit);
                if (schedule instanceof RunnableScheduledFuture) {
                    runnableScheduledFuture = (RunnableScheduledFuture) schedule;
                } else {
                    runnableScheduledFuture = null;
                }
                c32399Cnb.LJI = runnableScheduledFuture;
            }
            AbstractC32397CnZ abstractC32397CnZ = this.LIZ;
            if (abstractC32397CnZ != null) {
                abstractC32397CnZ.LIZ(new C32403Cnf(abstractC32415Cnr, null), c32399Cnb);
                return;
            }
            return;
        }
        if (c32399Cnb != null) {
            c32399Cnb.LJFF = aRunnableS24S0200000_5;
        }
        Handler handler = this.LIZIZ;
        if (handler != null) {
            handler.postDelayed(aRunnableS24S0200000_5, LiveGiftEffectMessagePreloadTimeoutSetting.INSTANCE.getValue() * 1000);
        }
        AbstractC32397CnZ abstractC32397CnZ2 = this.LIZ;
        if (abstractC32397CnZ2 == null) {
            return;
        }
        abstractC32397CnZ2.LIZ(new C32403Cnf(abstractC32415Cnr, this.LIZIZ), c32399Cnb);
    }
}
