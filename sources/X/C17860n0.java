package X;

import android.content.Context;

/* renamed from: X.0n0, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C17860n0 {
    public static C17860n0 LIZIZ;
    public final com.amazon.device.messaging.ADM LIZ;

    public final boolean LIZIZ() {
        return this.LIZ.isSupported();
    }

    public final void LIZJ() {
        this.LIZ.startRegister();
    }

    public final void LIZLLL() {
        this.LIZ.startUnregister();
    }

    public C17860n0(Context context) {
        this.LIZ = new com.amazon.device.messaging.ADM(context);
    }

    public static C17860n0 LIZ(Context context) {
        if (LIZIZ == null) {
            synchronized (C17860n0.class) {
                if (LIZIZ == null) {
                    LIZIZ = new C17860n0(context);
                }
            }
        }
        return LIZIZ;
    }
}
