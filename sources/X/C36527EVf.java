package X;

import android.content.Context;
import android.os.Build;
import com.bytedance.android.bytehook.ByteHook;
import com.bytedance.common.jato.scheduler.SchedulerNativeHolder;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: X.EVf, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C36527EVf {
    public static C36527EVf LIZIZ;
    public final AtomicBoolean LIZ = new AtomicBoolean(false);

    public final void LIZ(int i, Context context) {
        boolean z;
        if (this.LIZ.compareAndSet(false, true) && Build.VERSION.SDK_INT > 22) {
            synchronized (SchedulerNativeHolder.class) {
                if (!SchedulerNativeHolder.LIZ && C48693J9d.LJFF()) {
                    SchedulerNativeHolder.LIZ = true;
                }
                z = SchedulerNativeHolder.LIZ;
            }
            if (z) {
                int i2 = context.getApplicationInfo().targetSdkVersion;
                C0IO c0io = new C0IO();
                C0IN c0in = new C0IN();
                c0in.LIZ = c0io.LIZ;
                c0in.LIZIZ = c0io.LIZIZ;
                ByteHook.init(c0in);
                if (EUT.LIZIZ() || EUT.LIZJ()) {
                    i |= 1088;
                }
                SchedulerNativeHolder.nativeInit(i2, i, context);
            }
        }
    }
}
