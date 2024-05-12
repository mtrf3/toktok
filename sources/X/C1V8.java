package X;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;
import com.google.android.play.core.assetpacks.c1;
import com.google.android.play.core.assetpacks.q0;
import com.google.android.play.core.assetpacks.y;

/* renamed from: X.1V8, reason: invalid class name */
/* loaded from: classes.dex */
public final class C1V8 implements InterfaceC153055zZ {
    public static C1V8 LJLJJL;
    public final Object LJLIL;
    public final Object LJLILLLLZI;
    public final Object LJLJI;
    public final Object LJLJJI;

    public /* synthetic */ C1V8(InterfaceC153055zZ interfaceC153055zZ, C40632Fx6 c40632Fx6, InterfaceC153055zZ interfaceC153055zZ2, InterfaceC153055zZ interfaceC153055zZ3) {
        this.LJLIL = interfaceC153055zZ;
        this.LJLILLLLZI = c40632Fx6;
        this.LJLJI = interfaceC153055zZ2;
        this.LJLJJI = interfaceC153055zZ3;
    }

    @Override // X.InterfaceC153055zZ
    public final /* bridge */ /* synthetic */ Object a() {
        Object a = ((InterfaceC153055zZ) this.LJLIL).a();
        InterfaceC38408F5o LIZIZ = C40666Fxe.LIZIZ((InterfaceC153055zZ) this.LJLILLLLZI);
        return new c1((y) a, (q0) ((InterfaceC153055zZ) this.LJLJI).a(), LIZIZ, C40666Fxe.LIZIZ((InterfaceC153055zZ) this.LJLJJI));
    }

    public /* synthetic */ C1V8(Context context, final InterfaceC23750wV interfaceC23750wV) {
        final Context LLLLL = C16880lQ.LLLLL(context);
        this.LJLIL = new C1V6<Boolean>(LLLLL, interfaceC23750wV) { // from class: X.1mv
            static {
                C0VW.LIZIZ("BatteryChrgTracker");
            }

            @Override // X.AbstractC16850lN
            public final Object LIZ() {
                int intExtra;
                Intent LJJLIIIJILLIZJL = C16880lQ.LJJLIIIJILLIZJL(null, this.LIZIZ, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
                if (LJJLIIIJILLIZJL == null) {
                    C0VW.LIZ().getClass();
                    return null;
                }
                boolean z = false;
                if (Build.VERSION.SDK_INT < 23 ? LJJLIIIJILLIZJL.getIntExtra("plugged", 0) != 0 : !((intExtra = LJJLIIIJILLIZJL.getIntExtra("status", -1)) != 2 && intExtra != 5)) {
                    z = true;
                }
                return Boolean.valueOf(z);
            }

            @Override // X.C1V6
            public final IntentFilter LJFF() {
                IntentFilter intentFilter = new IntentFilter();
                if (Build.VERSION.SDK_INT >= 23) {
                    intentFilter.addAction("android.os.action.CHARGING");
                    intentFilter.addAction("android.os.action.DISCHARGING");
                } else {
                    intentFilter.addAction("android.intent.action.ACTION_POWER_CONNECTED");
                    intentFilter.addAction("android.intent.action.ACTION_POWER_DISCONNECTED");
                }
                return intentFilter;
            }

            @Override // X.C1V6
            public final void LJI(Intent intent) {
                String action = intent.getAction();
                if (action == null) {
                    return;
                }
                C0VW LIZ = C0VW.LIZ();
                C16880lQ.LLLZ("Received %s", new Object[]{action});
                LIZ.getClass();
                switch (action.hashCode()) {
                    case -1886648615:
                        if (!action.equals("android.intent.action.ACTION_POWER_DISCONNECTED")) {
                            return;
                        }
                        LIZJ(Boolean.FALSE);
                        return;
                    case -54942926:
                        if (!action.equals("android.os.action.DISCHARGING")) {
                            return;
                        }
                        LIZJ(Boolean.FALSE);
                        return;
                    case 948344062:
                        if (!action.equals("android.os.action.CHARGING")) {
                            return;
                        }
                        LIZJ(Boolean.TRUE);
                        return;
                    case 1019184907:
                        if (!action.equals("android.intent.action.ACTION_POWER_CONNECTED")) {
                            return;
                        }
                        LIZJ(Boolean.TRUE);
                        return;
                    default:
                        return;
                }
            }
        };
        this.LJLILLLLZI = new C1V6<Boolean>(LLLLL, interfaceC23750wV) { // from class: X.1mw
            static {
                C0VW.LIZIZ("BatteryNotLowTracker");
            }

            @Override // X.AbstractC16850lN
            public final Object LIZ() {
                Intent LJJLIIIJILLIZJL = C16880lQ.LJJLIIIJILLIZJL(null, this.LIZIZ, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
                if (LJJLIIIJILLIZJL == null) {
                    C0VW.LIZ().getClass();
                    return null;
                }
                float intExtra = LJJLIIIJILLIZJL.getIntExtra("level", -1) / LJJLIIIJILLIZJL.getIntExtra("scale", -1);
                boolean z = true;
                if (LJJLIIIJILLIZJL.getIntExtra("status", -1) != 1 && intExtra <= 0.15f) {
                    z = false;
                }
                return Boolean.valueOf(z);
            }

            @Override // X.C1V6
            public final IntentFilter LJFF() {
                IntentFilter intentFilter = new IntentFilter();
                intentFilter.addAction("android.intent.action.BATTERY_OKAY");
                intentFilter.addAction("android.intent.action.BATTERY_LOW");
                return intentFilter;
            }

            @Override // X.C1V6
            public final void LJI(Intent intent) {
                if (intent.getAction() == null) {
                    return;
                }
                C0VW LIZ = C0VW.LIZ();
                C16880lQ.LLLZ("Received %s", new Object[]{intent.getAction()});
                LIZ.getClass();
                String action = intent.getAction();
                action.getClass();
                if (!action.equals("android.intent.action.BATTERY_OKAY")) {
                    if (!action.equals("android.intent.action.BATTERY_LOW")) {
                        return;
                    }
                    LIZJ(Boolean.FALSE);
                    return;
                }
                LIZJ(Boolean.TRUE);
            }
        };
        this.LJLJI = new C1V7(LLLLL, interfaceC23750wV);
        this.LJLJJI = new C1V6<Boolean>(LLLLL, interfaceC23750wV) { // from class: X.1mx
            static {
                C0VW.LIZIZ("StorageNotLowTracker");
            }

            @Override // X.AbstractC16850lN
            public final Object LIZ() {
                Intent LJJLIIIJILLIZJL = C16880lQ.LJJLIIIJILLIZJL(null, this.LIZIZ, LJFF());
                if (LJJLIIIJILLIZJL == null || LJJLIIIJILLIZJL.getAction() == null) {
                    return Boolean.TRUE;
                }
                String action = LJJLIIIJILLIZJL.getAction();
                action.getClass();
                if (!action.equals("android.intent.action.DEVICE_STORAGE_LOW")) {
                    if (!action.equals("android.intent.action.DEVICE_STORAGE_OK")) {
                        return null;
                    }
                    return Boolean.TRUE;
                }
                return Boolean.FALSE;
            }

            @Override // X.C1V6
            public final IntentFilter LJFF() {
                IntentFilter intentFilter = new IntentFilter();
                intentFilter.addAction("android.intent.action.DEVICE_STORAGE_OK");
                intentFilter.addAction("android.intent.action.DEVICE_STORAGE_LOW");
                return intentFilter;
            }

            @Override // X.C1V6
            public final void LJI(Intent intent) {
                if (intent.getAction() == null) {
                    return;
                }
                C0VW LIZ = C0VW.LIZ();
                C16880lQ.LLLZ("Received %s", new Object[]{intent.getAction()});
                LIZ.getClass();
                String action = intent.getAction();
                action.getClass();
                if (!action.equals("android.intent.action.DEVICE_STORAGE_LOW")) {
                    if (!action.equals("android.intent.action.DEVICE_STORAGE_OK")) {
                        return;
                    }
                    LIZJ(Boolean.TRUE);
                    return;
                }
                LIZJ(Boolean.FALSE);
            }
        };
    }

    public static synchronized C1V8 LIZ(Context context, InterfaceC23750wV interfaceC23750wV) {
        C1V8 c1v8;
        synchronized (C1V8.class) {
            if (LJLJJL == null) {
                LJLJJL = new C1V8(context, interfaceC23750wV);
            }
            c1v8 = LJLJJL;
        }
        return c1v8;
    }
}
