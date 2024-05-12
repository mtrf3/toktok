package X;

import android.content.Context;
import com.ss.android.ugc.bytex.pthread.base.proxy.PthreadThread;
import com.ss.android.vesdk.runtime.VERuntime;

/* renamed from: X.P4v, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C63869P4v extends PthreadThread {
    public final /* synthetic */ VERuntime LJLIL;

    public final void LIZLLL() {
        try {
            Context context = this.LJLIL.mContext;
            if (!C39700Fi4.LIZ) {
                synchronized (C39700Fi4.class) {
                    if (!C39700Fi4.LIZ) {
                        C39700Fi4.LIZ(C16880lQ.LLLLL(context));
                        C39700Fi4.LIZ = true;
                    }
                }
            }
        } catch (Exception unused) {
        }
        C63870P4w c63870P4w = new C63870P4w();
        c63870P4w.LIZJ("iesve_vesdk_init_finish_result", "success");
        c63870P4w.LIZJ("iesve_vesdk_init_finish_reason", "null");
        C63867P4t.LIZLLL("iesve_vesdk_init_finish", c63870P4w);
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        boolean LIZ;
        try {
            LIZLLL();
        } finally {
            if (LIZ) {
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C63869P4v(VERuntime vERuntime) {
        super("e/VERuntime$5");
        this.LJLIL = vERuntime;
    }
}
