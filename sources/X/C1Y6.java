package X;

import Y.IDRunnableS3S0100100;
import com.bytedance.android.livesdkapi.host.IHostAppContext;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.1Y6, reason: invalid class name */
/* loaded from: classes.dex */
public final class C1Y6<T> implements InterfaceC64592gB {
    public final /* synthetic */ C19820qA LJLIL;
    public final /* synthetic */ EnumC19760q4 LJLILLLLZI;
    public final /* synthetic */ long LJLJI;

    public C1Y6(C19820qA c19820qA, EnumC19760q4 enumC19760q4, long j) {
        this.LJLIL = c19820qA;
        this.LJLILLLLZI = enumC19760q4;
        this.LJLJI = j;
    }

    @Override // X.InterfaceC64592gB
    public final void accept(Object obj) {
        C19820qA c19820qA = this.LJLIL;
        EnumC19760q4 enumC19760q4 = this.LJLILLLLZI;
        long j = this.LJLJI;
        int i = c19820qA.LIZLLL.get();
        int i2 = C19820qA.LJFF;
        if (i >= i2 || System.currentTimeMillis() - c19820qA.LIZJ.get() < C19820qA.LJI) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("tryShowTipsIfInNeed(). tips interval < ");
            LIZ.append(C19820qA.LJI / 1000);
            LIZ.append("s or tips count this live beyond ");
            LIZ.append(i2);
            C0NB.LJIIL("LowDevicesPerformanceTipsManager", X1D.LIZIZ(LIZ));
            return;
        }
        C19790q7 c19790q7 = c19820qA.LJ;
        synchronized (c19790q7) {
            C19700py.LIZ.getClass();
            List<Boolean> lowBatteryList = C19700py.LJIIJJI;
            o.LJIIIIZZ(lowBatteryList, "lowBatteryList");
            List<Boolean> saveModeList = C19700py.LJIIJ;
            o.LJIIIIZZ(saveModeList, "saveModeList");
            List<OSZ<Float, Boolean>> temperatureAndChargingList = C19700py.LJIIIZ;
            o.LJIIIIZZ(temperatureAndChargingList, "temperatureAndChargingList");
            c19790q7.LIZJ();
            c19790q7.LIZIZ(lowBatteryList);
            c19790q7.LIZLLL(saveModeList);
            c19790q7.LIZ(temperatureAndChargingList);
        }
        int i3 = C19810q9.LIZ[enumC19760q4.ordinal()];
        if (i3 != 1) {
            if (i3 != 2) {
                return;
            }
            boolean isAppForeground = ((IHostAppContext) CN1.LIZ(IHostAppContext.class)).isAppForeground();
            boolean z = c19820qA.LJ.LIZJ;
            boolean z2 = c19820qA.LJ.LIZLLL;
            boolean z3 = c19820qA.LJ.LIZIZ;
            if (C30922CBq.LIZIZ) {
                StringBuilder LIZLLL = C00F.LIZLLL("scene=PERFORMANCE_DATA_UPDATE, isForeground=", isAppForeground, ", canShowHighTemperatureTips=", z3, ", canShowLowBatteryTips=");
                LIZLLL.append(z);
                LIZLLL.append(", canShowSaveModeTips=");
                LIZLLL.append(z2);
                C0NB.LJIIIZ("LowDevicesPerformanceTipsManager", X1D.LIZIZ(LIZLLL));
            }
            if (isAppForeground) {
                return;
            }
            if (z3) {
                c19820qA.LIZ(EnumC18150nT.HIGH_TEMPERATURE_TIP, j, true);
                return;
            } else if (z) {
                c19820qA.LIZ(EnumC18150nT.LOW_BATTERY_TIP, j, true);
                return;
            } else {
                if (!z2) {
                    return;
                }
                c19820qA.LIZ(EnumC18150nT.SAVE_MODE_TIP, j, true);
                return;
            }
        }
        if (C30922CBq.LIZIZ) {
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("scene=GAME_LIVE_ENTER_BACKGROUND, can show low device tips=");
            FT5.LJ(LIZ2, c19820qA.LJ.LIZ, LIZ2, "LowDevicesPerformanceTipsManager");
        }
        if (!c19820qA.LJ.LIZ) {
            return;
        }
        c19820qA.LIZLLL.getAndAdd(1);
        c19820qA.LIZJ.set(System.currentTimeMillis());
        c19820qA.LIZIZ.postDelayed(new IDRunnableS3S0100100(c19820qA, j, 2), 1500L);
    }
}
