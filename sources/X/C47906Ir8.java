package X;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.wifi.WifiManager;
import com.bytedance.android.livesdk.livesetting.linkmic.LiveAudienceLinkmicLowestAgeSetting;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import com.ss.ttvideoengine.utils.TTVideoEngineLog;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/* renamed from: X.Ir8, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C47906Ir8 extends BroadcastReceiver {
    public static C47906Ir8 LJIIIIZZ;
    public int LIZ = 1000;
    public int LIZIZ = 10;
    public final Lock LIZJ = new ReentrantLock();
    public final ArrayList<WeakReference<InterfaceC47584Ilw>> LIZLLL = new ArrayList<>();
    public int LJ = 0;
    public C47908IrA LJFF = null;
    public boolean LJI = false;
    public boolean LJII;

    public static int LIZJ(int i) {
        if (i == 20) {
            return 4;
        }
        switch (i) {
            case 1:
            case 2:
            case 7:
            case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY /* 11 */:
            case LiveAudienceLinkmicLowestAgeSetting.DEFAULT /* 16 */:
                return 2;
            case 3:
            case 4:
            case 5:
            case 6:
            case 8:
            case 9:
            case 10:
            case 12:
            case 14:
            case 15:
            case 17:
                return 3;
            case ABRConfig.ABR_STARTUP_MAX_BITRATE /* 13 */:
                return 1;
            default:
                return 6;
        }
    }

    public static synchronized C47906Ir8 LIZLLL() {
        C47906Ir8 c47906Ir8;
        synchronized (C47906Ir8.class) {
            if (LJIIIIZZ == null) {
                LJIIIIZZ = new C47906Ir8();
            }
            c47906Ir8 = LJIIIIZZ;
        }
        return c47906Ir8;
    }

    public static int LJ(Context context) {
        NetworkInfo.State state;
        if (context == null) {
            return 1000;
        }
        ConnectivityManager connectivityManager = (ConnectivityManager) C16880lQ.LLILL(context, "connectivity");
        if (connectivityManager == null) {
            TTVideoEngineLog.d("TTNetWorkListener", "disconnect");
            return -1;
        }
        try {
            NetworkInfo LJJLI = C16880lQ.LJJLI(connectivityManager);
            if (LJJLI == null || !LJJLI.isAvailable()) {
                TTVideoEngineLog.d("TTNetWorkListener", "disconnect 1");
                return -1;
            }
            NetworkInfo LLLZIL = C16880lQ.LLLZIL(connectivityManager, 1);
            if (LLLZIL != null && (state = LLLZIL.getState()) != null && (state == NetworkInfo.State.CONNECTED || state == NetworkInfo.State.CONNECTING)) {
                TTVideoEngineLog.d("TTNetWorkListener", "wifi");
                return 0;
            }
            NetworkInfo LLLZIL2 = C16880lQ.LLLZIL(connectivityManager, 0);
            if (LLLZIL2 != null) {
                NetworkInfo.State state2 = LLLZIL2.getState();
                int subtype = LJJLI.getSubtype();
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("state: ");
                LIZ.append(state2);
                LIZ.append(", subtype: ");
                LIZ.append(subtype);
                TTVideoEngineLog.d("TTNetWorkListener", X1D.LIZIZ(LIZ));
                if (state2 != null && (state2 == NetworkInfo.State.CONNECTED || state2 == NetworkInfo.State.CONNECTING)) {
                    return LIZJ(subtype);
                }
            }
            return 1000;
        } catch (Exception e) {
            C78253UnR.LIZLLL("TTNetWorkListener", e.toString());
            return 1000;
        }
    }

    public final void LIZ(int i) {
        if (i != this.LIZIZ) {
            ((ReentrantLock) this.LIZJ).lock();
            int i2 = this.LIZIZ;
            this.LIZIZ = i;
            if (!this.LJII) {
                StringBuilder LJ = C7MY.LJ("strength changed, from: ", i2, " to: ");
                LJ.append(this.LIZIZ);
                LJ.append(" callback list size: ");
                LJ.append(this.LIZLLL.size());
                C78253UnR.LJI("TTNetWorkListener", X1D.LIZIZ(LJ));
            }
            Iterator<WeakReference<InterfaceC47584Ilw>> it = this.LIZLLL.iterator();
            while (it.hasNext()) {
                InterfaceC47584Ilw interfaceC47584Ilw = it.next().get();
                if (interfaceC47584Ilw == null) {
                    it.remove();
                } else {
                    interfaceC47584Ilw.LIZ(1, i2, this.LIZIZ);
                }
            }
            ((ReentrantLock) this.LIZJ).unlock();
        }
    }

    public final synchronized void LJI(Context context) {
        if (this.LJ != 0) {
            return;
        }
        this.LJ = 1;
        this.LJII = C77117UOj.LJIJI(C47149Iev.LIZ.LJIIIZ, 128L);
        new C47907Ir9(context, this).start();
    }

    public final void LJII(WeakReference<InterfaceC47584Ilw> weakReference) {
        if (weakReference == null) {
            return;
        }
        ((ReentrantLock) this.LIZJ).lock();
        this.LIZLLL.add(weakReference);
        ((ReentrantLock) this.LIZJ).unlock();
    }

    public final void LJIIIIZZ(int i) {
        if (i != this.LIZ) {
            ((ReentrantLock) this.LIZJ).lock();
            int i2 = this.LIZ;
            this.LIZ = i;
            if (!this.LJII) {
                StringBuilder LJ = C7MY.LJ("access changed, from: ", i2, " to: ");
                LJ.append(this.LIZ);
                LJ.append(" callback list size: ");
                LJ.append(this.LIZLLL.size());
                TTVideoEngineLog.d("TTNetWorkListener", X1D.LIZIZ(LJ));
            }
            Iterator<WeakReference<InterfaceC47584Ilw>> it = this.LIZLLL.iterator();
            while (it.hasNext()) {
                InterfaceC47584Ilw interfaceC47584Ilw = it.next().get();
                if (interfaceC47584Ilw == null) {
                    it.remove();
                } else {
                    interfaceC47584Ilw.LIZ(0, i2, this.LIZ);
                }
            }
            ((ReentrantLock) this.LIZJ).unlock();
        }
    }

    public final void LIZIZ(Context context, Intent intent) {
        if (isInitialStickyBroadcast() || intent == null) {
            return;
        }
        if ("android.net.wifi.RSSI_CHANGED".equals(intent.getAction()) && this.LIZ == 0) {
            if (!C77117UOj.LJIJI(C47149Iev.LIZ.LJIIIZ, 32L)) {
                LIZ(LJFF(context, intent));
                return;
            }
            return;
        }
        if (!"android.net.conn.CONNECTIVITY_CHANGE".equals(intent.getAction())) {
            return;
        }
        boolean LJIJI = C77117UOj.LJIJI(C47149Iev.LIZ.LJIIIZ, 128L);
        this.LJII = LJIJI;
        if (LJIJI) {
            int i = -1;
            int intExtra = intent.getIntExtra("networkType", -1);
            NetworkInfo networkInfo = (NetworkInfo) intent.getParcelableExtra("networkInfo");
            if (networkInfo == null || networkInfo.isConnected()) {
                if (intExtra == 0) {
                    if (networkInfo != null) {
                        i = LIZJ(networkInfo.getSubtype());
                    }
                    i = 1000;
                } else {
                    if (intExtra == 1) {
                        i = 0;
                    }
                    i = 1000;
                }
            }
            LJIIIIZZ(i);
            return;
        }
        LJIIIIZZ(LJ(context));
    }

    public final int LJFF(Context context, Intent intent) {
        int i;
        if (context == null) {
            return 10;
        }
        try {
            if (((ConnectivityManager) C16880lQ.LLILL(context, "connectivity")) == null) {
                return 10;
            }
            if (intent != null) {
                i = intent.getIntExtra("newRssi", -70);
            } else {
                if (!this.LJI) {
                    try {
                        i = C47975IsF.LIZIZ((WifiManager) C16880lQ.LLILL(C16880lQ.LLLLL(context), "wifi")).intValue();
                    } catch (Throwable unused) {
                    }
                }
                i = -1;
            }
            int calculateSignalLevel = WifiManager.calculateSignalLevel(i, 4);
            if (!this.LJII) {
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("wifi dbm:");
                LIZ.append(i);
                LIZ.append(", level:");
                LIZ.append(calculateSignalLevel);
                TTVideoEngineLog.d("TTNetWorkListener", X1D.LIZIZ(LIZ));
            }
            return calculateSignalLevel + 1;
        } catch (Exception e) {
            C78253UnR.LIZLLL("TTNetWorkListener", e.toString());
            return 10;
        }
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if (!C84763XOl.LJIIJJI && intent != null) {
            if (!((ArrayList) C38413F5t.LIZ).contains(intent.getAction()) && C38413F5t.LIZ("onBroadcastReceiverReceive")) {
                C35532Dx2.LIZIZ();
            }
        }
        if (!"android.net.conn.CONNECTIVITY_CHANGE".equals(intent.getAction())) {
            LIZIZ(context, intent);
        } else {
            C38523F9z.LIZ();
            LIZIZ(context, intent);
        }
    }
}
