package X;

import android.content.Context;
import android.os.Build;
import android.os.VibrationEffect;
import android.os.Vibrator;
import kotlin.jvm.internal.o;

/* renamed from: X.OUt, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C61995OUt {
    public final Vibrator LIZ;

    public final void LIZ() {
        if (Build.VERSION.SDK_INT >= 29) {
            VibrationEffect createPredefined = VibrationEffect.createPredefined(0);
            o.LJIIIIZZ(createPredefined, "createPredefined(effectId)");
            Vibrator vibrator = this.LIZ;
            if (vibrator != null) {
                vibrator.vibrate(createPredefined);
            }
        }
    }

    public C61995OUt(Context ctx) {
        o.LJIIIZ(ctx, "ctx");
        Object LLILL = C16880lQ.LLILL(ctx, "vibrator");
        o.LJII(LLILL, "null cannot be cast to non-null type android.os.Vibrator");
        this.LIZ = (Vibrator) LLILL;
    }

    public final void LIZIZ(int i, int i2) {
        try {
            if (Build.VERSION.SDK_INT >= 26) {
                VibrationEffect createOneShot = VibrationEffect.createOneShot(i, i2);
                Vibrator vibrator = this.LIZ;
                if (vibrator != null) {
                    vibrator.vibrate(createOneShot);
                }
            } else {
                Vibrator vibrator2 = this.LIZ;
                if (vibrator2 != null) {
                    vibrator2.vibrate(i);
                }
            }
        } catch (Exception unused) {
        }
    }
}
