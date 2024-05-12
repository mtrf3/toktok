package X;

import Y.IDxS307S0100000_6;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;
import android.view.Display;
import android.view.WindowManager;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.internal.o;

/* renamed from: X.PQm, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C64432PQm {
    public static volatile C64432PQm LIZLLL;
    public static final CopyOnWriteArrayList<InterfaceC64435PQp> LJ = new CopyOnWriteArrayList<>();
    public boolean LIZ;
    public int LIZIZ;
    public int LIZJ;

    public static C64432PQm LIZIZ() {
        if (LIZLLL == null) {
            synchronized (C64432PQm.class) {
                if (LIZLLL == null) {
                    LIZLLL = new C64432PQm();
                }
            }
        }
        return LIZLLL;
    }

    public final void LIZ() {
        this.LIZIZ = C00F.LIZ(31744, 3, "enable_power_mode", true);
        this.LIZJ = C00F.LIZ(31744, 0, "enable_power_mode_always_on", true);
        if (this.LIZIZ != 0) {
            LJFF(C40010Fn4.LIZJ());
            C64433PQn LIZ = C64433PQn.LIZ();
            LIZ.getClass();
            try {
                if (LIZ.LIZ != null && LIZ.LIZIZ == null) {
                    LIZ.LIZIZ = new C64430PQk(LIZ);
                    Intent LJJLIIIJILLIZJL = C16880lQ.LJJLIIIJILLIZJL(LIZ.LIZIZ, LIZ.LIZ, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
                    if (LJJLIIIJILLIZJL != null) {
                        LIZ.LIZJ(LJJLIIIJILLIZJL);
                    }
                }
            } catch (Throwable unused) {
            }
            if (!C84763XOl.LJIIJJI) {
                LIZIZ().LIZLLL();
            }
            C84763XOl.LJI().LJJJJZI(new InterfaceC64592gB() { // from class: X.PQl
                @Override // X.InterfaceC64592gB
                public final void accept(Object obj) {
                    if (!((Boolean) obj).booleanValue()) {
                        C64432PQm.LIZIZ().LIZLLL();
                    }
                }
            });
            FEX LIZIZ = FEX.LIZIZ();
            LIZIZ.getClass();
            if (C00F.LIZ(31744, 0, "power_mode_gecko_block_type", true) == 1) {
                C84763XOl.LJI().LIZ(new IDxS307S0100000_6(LIZIZ, 6));
            }
            LJFF(FEX.LIZIZ());
            synchronized (C64441PQv.LIZ) {
                if (Build.VERSION.SDK_INT >= 23) {
                    if (C64443PQx.LIZ()) {
                        if (!C64441PQv.LIZJ) {
                            try {
                                C64441PQv.LIZJ = true;
                                Object LLILL = C16880lQ.LLILL((Context) C64441PQv.LJI.getValue(), "window");
                                o.LJII(LLILL, "null cannot be cast to non-null type android.view.WindowManager");
                                Display defaultDisplay = ((WindowManager) LLILL).getDefaultDisplay();
                                if (defaultDisplay != null) {
                                    Display.Mode mode = defaultDisplay.getMode();
                                    Display.Mode[] displayModes = defaultDisplay.getSupportedModes();
                                    o.LJIIIIZZ(displayModes, "displayModes");
                                    boolean z = false;
                                    for (Display.Mode mode2 : displayModes) {
                                        int refreshRate = (int) mode2.getRefreshRate();
                                        if (refreshRate >= 60) {
                                            if (refreshRate == 60 && mode2.getRefreshRate() < mode.getRefreshRate() && mode.getModeId() != mode2.getModeId()) {
                                                C64441PQv.LJ = mode2.getModeId();
                                            }
                                        } else {
                                            z = true;
                                        }
                                    }
                                    if (!z) {
                                        if (C64441PQv.LJ > 0) {
                                            ExecutorC142245i8.LJLILLLLZI.LIZ(10000L, RunnableC64436PQq.LJLIL);
                                        }
                                    }
                                }
                            } catch (Throwable unused2) {
                            }
                        }
                    }
                }
            }
        }
    }

    public final boolean LIZJ() {
        if (this.LIZ || this.LIZJ == 1) {
            return true;
        }
        return false;
    }

    public final void LIZLLL() {
        if (this.LIZIZ != 0) {
            C64433PQn LIZ = C64433PQn.LIZ();
            if (LIZ.LIZLLL || LIZ.LIZJ > 31.0f) {
                synchronized (C64432PQm.class) {
                    if (this.LIZ) {
                        this.LIZ = false;
                        Iterator<InterfaceC64435PQp> it = LJ.iterator();
                        while (it.hasNext()) {
                            it.next().LIZ(0);
                        }
                        return;
                    }
                    return;
                }
            }
            C64433PQn LIZ2 = C64433PQn.LIZ();
            if (!LIZ2.LIZLLL && LIZ2.LIZJ < 30.0f) {
                LJ();
            }
        }
    }

    public final void LJ() {
        synchronized (C64432PQm.class) {
            if (this.LIZ) {
                return;
            }
            this.LIZ = true;
            Iterator<InterfaceC64435PQp> it = LJ.iterator();
            while (it.hasNext()) {
                it.next().LIZ(2);
            }
        }
    }

    public static void LJFF(InterfaceC64435PQp interfaceC64435PQp) {
        if (interfaceC64435PQp == null) {
            return;
        }
        CopyOnWriteArrayList<InterfaceC64435PQp> copyOnWriteArrayList = LJ;
        if (!copyOnWriteArrayList.contains(interfaceC64435PQp)) {
            copyOnWriteArrayList.add(interfaceC64435PQp);
        }
    }
}
