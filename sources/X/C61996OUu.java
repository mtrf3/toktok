package X;

import android.content.Context;
import android.os.Build;
import android.os.VibrationEffect;
import android.os.Vibrator;
import kotlin.jvm.internal.o;

/* renamed from: X.OUu, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C61996OUu {
    public final Vibrator LIZ;

    public C61996OUu(Context ctx) {
        o.LJIIIZ(ctx, "ctx");
        this.LIZ = (Vibrator) C16880lQ.LLILL(ctx, "vibrator");
    }

    public final void LIZ(int i) {
        VibrationEffect createOneShot;
        try {
            if (Build.VERSION.SDK_INT >= 26) {
                if (i != 0) {
                    if (i != 1) {
                        if (i != 2) {
                            if (i == 3) {
                                createOneShot = VibrationEffect.createWaveform(new long[]{12, 100, 12, 100, 12}, new int[]{200, 0, 150, 0, 100}, -1);
                            } else {
                                createOneShot = VibrationEffect.createOneShot(12L, 100);
                            }
                        } else {
                            createOneShot = VibrationEffect.createWaveform(new long[]{12, 100, 12}, new int[]{100, 0, 150}, -1);
                        }
                    } else {
                        createOneShot = VibrationEffect.createOneShot(12L, 200);
                    }
                } else {
                    createOneShot = VibrationEffect.createOneShot(12L, 100);
                }
                Vibrator vibrator = this.LIZ;
                if (vibrator != null) {
                    vibrator.vibrate(createOneShot);
                    return;
                }
                return;
            }
            if (i != 0 && i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        return;
                    }
                    long[] jArr = {0, 12, 100, 12, 100, 12};
                    Vibrator vibrator2 = this.LIZ;
                    if (vibrator2 == null) {
                        return;
                    }
                    vibrator2.vibrate(jArr, -1);
                    return;
                }
                long[] jArr2 = {0, 12, 100, 12};
                Vibrator vibrator3 = this.LIZ;
                if (vibrator3 == null) {
                    return;
                }
                vibrator3.vibrate(jArr2, -1);
                return;
            }
            Vibrator vibrator4 = this.LIZ;
            if (vibrator4 == null) {
                return;
            }
            vibrator4.vibrate(12L);
        } catch (Exception unused) {
        }
    }
}
