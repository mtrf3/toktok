package X;

import android.content.Context;
import android.content.IntentFilter;
import android.os.Build;
import android.os.Looper;
import com.ss.android.ugc.bytex.pthread.base.proxy.PthreadThread;
import com.ss.ttvideoengine.utils.TTVideoEngineLog;
import java.lang.ref.WeakReference;

/* renamed from: X.Ir9, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public class C47907Ir9 extends PthreadThread {
    public final WeakReference<Context> LJLIL;
    public final WeakReference<C47906Ir8> LJLILLLLZI;

    public final void LIZLLL() {
        Context context;
        if (Looper.myLooper() == null) {
            Looper.prepare();
        }
        int LJIILIIL = C77117UOj.LJIILIIL();
        if (LJIILIIL == 1 || LJIILIIL == 2 || LJIILIIL == 3) {
            C47906Ir8.LIZLLL().LJI = true;
            C05L.LJFF("is wifi sensitive mode:", LJIILIIL, "TTNetWorkListener");
        }
        C47906Ir8 LIZLLL = C47906Ir8.LIZLLL();
        Context context2 = this.LJLIL.get();
        LIZLLL.getClass();
        try {
            TTVideoEngineLog.d("TTNetWorkListener", "enter start listen");
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
            intentFilter.addAction("android.net.wifi.RSSI_CHANGED");
            C16880lQ.LJJLIIIJILLIZJL(LIZLLL, context2, intentFilter);
            LIZLLL.LJIIIIZZ(C47906Ir8.LJ(context2));
            if (LIZLLL.LIZ == 0) {
                LIZLLL.LIZIZ = LIZLLL.LJFF(context2, null);
            }
            C47908IrA c47908IrA = new C47908IrA(context2, LIZLLL);
            LIZLLL.LJFF = c47908IrA;
            if (!LIZLLL.LJI && c47908IrA.LIZ != null) {
                if (Build.VERSION.SDK_INT >= 23) {
                    try {
                        TTVideoEngineLog.d("TTNetWorkListener", "start listen signal strength");
                        c47908IrA.LIZ(context2, c47908IrA, 256);
                    } catch (Exception unused) {
                        C78253UnR.LIZLLL("TTNetWorkListener", "listen signal strength failed");
                    }
                }
                c47908IrA.LIZ(context2, c47908IrA, 64);
            }
            LIZLLL.LJ = 1;
        } catch (Exception e) {
            TTVideoEngineLog.d(e);
            TTVideoEngineLog.d("TTNetWorkListener", "start listen network state failed");
        }
        Looper.loop();
        C47906Ir8 c47906Ir8 = this.LJLILLLLZI.get();
        if (c47906Ir8 == null || (context = this.LJLIL.get()) == null || c47906Ir8.LJFF == null) {
            return;
        }
        try {
            C16880lQ.LJJLIIIJL(context, c47906Ir8);
            C47908IrA c47908IrA2 = c47906Ir8.LJFF;
            if (c47908IrA2.LIZ == null) {
                return;
            }
            c47908IrA2.LIZ(context, c47908IrA2, 0);
        } catch (Exception unused2) {
            C78253UnR.LIZLLL("TTNetWorkListener", "Receiver has been unregistered!");
        }
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

    public C47907Ir9(Context context, C47906Ir8 c47906Ir8) {
        super("TTNetWorkListener$MyThread");
        this.LJLIL = new WeakReference<>(context);
        this.LJLILLLLZI = new WeakReference<>(c47906Ir8);
    }
}
