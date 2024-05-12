package X;

import android.app.Activity;
import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothManager;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;
import com.bytedance.android.livesdkapi.host.IHostAction;
import defpackage.g0;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.internal.o;

/* renamed from: X.CFq, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C31026CFq {
    public static boolean LIZIZ;
    public static C31027CFr LIZJ;
    public static boolean LIZLLL;
    public static boolean LJ;
    public static boolean LJFF;
    public static boolean LJI;
    public static final C31026CFq LIZ = new C31026CFq();
    public static final CopyOnWriteArrayList<CG0> LJII = new CopyOnWriteArrayList<>();

    public final boolean LIZ() {
        if (!LIZIZ) {
            LJ();
        }
        return LJ;
    }

    public final boolean LIZIZ() {
        if (!LIZIZ) {
            LJ();
        }
        return LJI;
    }

    public static void LJFF() {
        Context LIZLLL2 = C15380j0.LIZLLL();
        if (LIZLLL2 == null) {
            return;
        }
        C0NB.LJIIIZ("HeadsetDetector", "stop");
        if (!LIZIZ) {
            return;
        }
        try {
            C16880lQ.LJJLIIIJL(LIZLLL2, LIZJ);
        } catch (IllegalArgumentException e) {
            C0NB.LJI("HeadsetDetector", e);
        }
        LIZIZ = false;
        LIZJ = null;
        LIZLLL = false;
        LJ = false;
        LJFF = false;
        LJI = false;
        LJII.clear();
    }

    public final void LIZJ() {
        boolean z;
        boolean LIZIZ2 = LIZIZ();
        if (!LIZ()) {
            if (!LIZIZ) {
                LJ();
            }
            if (!LJFF) {
                z = false;
                LJI = z;
                if (!LIZIZ() && !LIZIZ2) {
                    Iterator<CG0> it = LJII.iterator();
                    while (it.hasNext()) {
                        it.next().LIZIZ();
                    }
                    return;
                } else if (LIZIZ() && LIZIZ2) {
                    Iterator<CG0> it2 = LJII.iterator();
                    while (it2.hasNext()) {
                        it2.next().LIZ();
                    }
                    return;
                }
            }
        }
        z = true;
        LJI = z;
        if (!LIZIZ()) {
        }
        if (LIZIZ()) {
        }
    }

    public final void LJ() {
        BluetoothManager bluetoothManager;
        BluetoothAdapter adapter;
        boolean z;
        boolean z2;
        Context LIZLLL2 = C15380j0.LIZLLL();
        if (LIZLLL2 == null) {
            return;
        }
        C0NB.LJIIIZ("HeadsetDetector", "start");
        if (LIZIZ) {
            return;
        }
        boolean z3 = true;
        LIZIZ = true;
        LIZJ = new C31027CFr();
        IntentFilter intentFilter = new IntentFilter();
        if (Build.VERSION.SDK_INT <= 30) {
            if (LIZLLL2.getPackageManager().checkPermission("android.permission.BLUETOOTH", LIZLLL2.getPackageName()) == 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            LIZLLL = z2;
        } else {
            Activity LJIILJJIL = g0.LJIILJJIL(LIZLLL2);
            if (LJIILJJIL != null || (LJIILJJIL = ((IHostAction) CN1.LIZ(IHostAction.class)).getTopActivity()) != null) {
                LIZLLL = C76944UHs.LIZIZ(LJIILJJIL, "android.permission.BLUETOOTH_CONNECT");
            }
        }
        if (LIZLLL) {
            Object LLILL = C16880lQ.LLILL(LIZLLL2, "bluetooth");
            if ((LLILL instanceof BluetoothManager) && (bluetoothManager = (BluetoothManager) LLILL) != null && (adapter = bluetoothManager.getAdapter()) != null) {
                if (2 == adapter.getProfileConnectionState(1) || 1 == adapter.getProfileConnectionState(1)) {
                    z = true;
                } else {
                    z = false;
                }
                LJFF = z;
            }
        }
        intentFilter.addAction("android.bluetooth.headset.profile.action.CONNECTION_STATE_CHANGED");
        intentFilter.addAction("android.intent.action.HEADSET_PLUG");
        Intent LJJLIIIJILLIZJL = C16880lQ.LJJLIIIJILLIZJL(LIZJ, LIZLLL2, intentFilter);
        if (LJJLIIIJILLIZJL != null) {
            if (LJJLIIIJILLIZJL.getIntExtra("state", 0) != 1) {
                z3 = false;
            }
            LJ = z3;
        }
        StringBuilder sb = new StringBuilder("bluetoothPermission = ");
        sb.append(LIZLLL);
        sb.append(" , wireless = ");
        if (!LIZIZ) {
            LJ();
        }
        sb.append(LJFF);
        sb.append(" , wired = ");
        sb.append(LIZ());
        C0NB.LJIIIZ("HeadsetDetector", sb.toString());
        LIZJ();
    }

    public final void LIZLLL(CG0 listener) {
        o.LJIIIZ(listener, "listener");
        CopyOnWriteArrayList<CG0> copyOnWriteArrayList = LJII;
        if (!copyOnWriteArrayList.contains(listener)) {
            if (LIZIZ) {
                if (!LIZ()) {
                    if (!LIZIZ) {
                        LJ();
                    }
                    if (!LJFF) {
                        listener.LIZ();
                    }
                }
                listener.LIZIZ();
            }
            copyOnWriteArrayList.add(listener);
        }
    }
}
