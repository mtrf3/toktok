package X;

import android.os.Looper;
import android.view.Choreographer;
import com.bytedance.android.livesdk.livesetting.performance.LiveWatchDogStopDelayDurationSetting;
import com.bytedance.common.utility.reflect.Reflect;
import java.lang.reflect.Field;

/* renamed from: X.Fwz, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C40625Fwz {
    public static final Object LIZ = new Object();

    public static final void LIZ() {
        boolean z;
        float f;
        C40624Fwy.LIZJ().LJIILIIL = 0L;
        C40624Fwy LIZJ = C40624Fwy.LIZJ();
        LIZJ.getClass();
        if (Looper.myLooper() != C16880lQ.LLJJJJ()) {
            return;
        }
        try {
            try {
                z = ((Boolean) Reflect.on(C16880lQ.LLIIIJ()).field("USE_VSYNC", new Class[0]).get()).booleanValue();
            } catch (Exception e) {
                C16880lQ.LLLLIIL(e);
                return;
            }
        } catch (Exception unused) {
            C40623Fwx c40623Fwx = LIZJ.LIZ;
            if (((Field) c40623Fwx.LJLJL) == null) {
                c40623Fwx.LJLJL = c40623Fwx.LIZJ(Choreographer.class, Boolean.class, "USE_VSYNC");
            }
            Field field = (Field) c40623Fwx.LJLJL;
            if (field == null) {
                return;
            } else {
                z = field.getBoolean(C16880lQ.LLIIIJ());
            }
        }
        if (!z || LIZJ.LJIIIIZZ) {
            return;
        }
        LIZJ.LJIIIIZZ = true;
        if (C40627Fx1.LJLIL < 0) {
            if (C40627Fx1.LIZ() > 0.0f) {
                f = 1000 / C40627Fx1.LIZ();
            } else {
                f = 16.666668f;
            }
            C40627Fx1.LJLIL = (long) Math.ceil(f * 1000000.0f);
        }
        LIZJ.LJIIL = (long) (C40627Fx1.LJLIL * LIZJ.LJIILLIIL);
        LIZJ.LJIIJJI = LIZJ.LJIIL + LIZJ.LJIILL;
        C16880lQ.LLIIIJ().removeFrameCallback(LIZJ.LJIL);
        C16880lQ.LLIIIJ().postFrameCallback(LIZJ.LJIL);
        C40626Fx0 c40626Fx0 = LIZJ.LJIIIZ;
        if (c40626Fx0 != null) {
            try {
                c40626Fx0.LJLILLLLZI = true;
                LIZJ.LJIIIZ.interrupt();
            } catch (Exception e2) {
                C16880lQ.LLLLIIL(e2);
            }
        } else {
            LIZJ.LJIIIZ = new C40626Fx0(LIZJ, LIZJ.LJIILLIIL);
        }
        LIZJ.LJIIIZ.start();
    }

    public static final void LIZIZ() {
        B73.LIZ().removeCallbacksAndMessages(LIZ);
        C40624Fwy.LIZJ().LJFF();
    }

    public static final void LIZJ() {
        C10640bM.LIZIZ(B73.LIZ(), RunnableC40629Fx3.LJLIL, LIZ, LiveWatchDogStopDelayDurationSetting.INSTANCE.getValue());
    }
}
