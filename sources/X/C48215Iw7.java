package X;

import android.content.Context;
import android.content.Intent;
import java.util.ArrayDeque;
import java.util.Queue;

/* renamed from: X.Iw7, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C48215Iw7 {
    public static C48215Iw7 LJ;
    public String LIZ;
    public Boolean LIZIZ;
    public Boolean LIZJ;
    public final Queue<Intent> LIZLLL = new ArrayDeque();

    public static synchronized C48215Iw7 LIZ() {
        C48215Iw7 c48215Iw7;
        synchronized (C48215Iw7.class) {
            if (LJ == null) {
                LJ = new C48215Iw7();
            }
            c48215Iw7 = LJ;
        }
        return c48215Iw7;
    }

    public final boolean LIZIZ(Context context) {
        boolean z;
        if (this.LIZJ == null) {
            if (context.checkCallingOrSelfPermission("android.permission.ACCESS_NETWORK_STATE") == 0) {
                z = true;
            } else {
                z = false;
            }
            this.LIZJ = Boolean.valueOf(z);
        }
        this.LIZIZ.booleanValue();
        return this.LIZJ.booleanValue();
    }

    public final boolean LIZJ(Context context) {
        boolean z;
        if (this.LIZIZ == null) {
            if (context.checkCallingOrSelfPermission("android.permission.WAKE_LOCK") == 0) {
                z = true;
            } else {
                z = false;
            }
            this.LIZIZ = Boolean.valueOf(z);
        }
        this.LIZIZ.booleanValue();
        return this.LIZIZ.booleanValue();
    }
}
