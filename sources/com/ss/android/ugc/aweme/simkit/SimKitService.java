package com.ss.android.ugc.aweme.simkit;

import X.C13870gZ;
import X.C16880lQ;
import X.C1B8;
import X.C1DG;
import X.C39187FZn;
import X.C39188FZo;
import X.C46790IXy;
import X.C46809IYr;
import X.C46816IYy;
import X.C46956Ibo;
import X.C46957Ibp;
import X.C46981IcD;
import X.C46982IcE;
import X.C46983IcF;
import X.C46985IcH;
import X.C46986IcI;
import X.C46987IcJ;
import X.C46988IcK;
import X.C47147Iet;
import X.C47489IkP;
import X.C47492IkS;
import X.C49606JdS;
import X.C73030SlO;
import X.C77123UOp;
import X.C78598Ut0;
import X.IWO;
import X.IXB;
import X.IZ1;
import X.IZ8;
import X.IZA;
import X.InterfaceC46732IVs;
import X.InterfaceC46878IaY;
import X.InterfaceC46926IbK;
import X.InterfaceC46972Ic4;
import X.Q0C;
import Y.ARunnableS10S0101000_6;
import android.app.Application;
import android.hardware.SensorManager;
import com.bytedance.bpea.basics.Cert;
import com.google.gson.internal.b;
import com.ss.android.ugc.aweme.simkit.api.IDimensionBitrateCurveConfig;
import com.ss.android.ugc.aweme.speedpredictor.api.ISpeedCalculator;
import com.ss.android.ugc.aweme.speedpredictor.api.ISpeedCalculatorConfig;
import com.ss.android.ugc.aweme.speedpredictor.api.ISpeedPredictorService;
import com.ss.android.ugc.playerkit.injector.InjectedConfigManager;
import com.ss.android.ugc.playerkit.radar.SimRadar;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.o;

/* loaded from: classes9.dex */
public class SimKitService implements InterfaceC46878IaY {
    public static C78598Ut0 LJI;
    public ISimKitConfig LIZ;
    public final b LIZIZ;
    public final C46790IXy LIZJ;
    public InterfaceC46972Ic4 LIZLLL;
    public ISpeedCalculator LJ;
    public int LJFF;

    @Override // X.InterfaceC46943Ibb
    public final synchronized ISpeedCalculator LJI() {
        ISimKitConfig config = C1DG.LIZ().getConfig();
        ISpeedCalculatorConfig speedCalculatorConfig = config.getSpeedCalculatorConfig();
        if (speedCalculatorConfig != null && speedCalculatorConfig.getCalculatorType() != 1) {
            Object value = IZ8.LJJIJIIJIL.getValue();
            o.LJIIIIZZ(value, "<get-enableStrategyCenterRunningCheck>(...)");
            if (((Boolean) value).booleanValue() && LJIIJJI(config) != this.LJFF) {
                this.LJ = null;
            }
        }
        if (this.LJ == null) {
            LJIIL(config);
        }
        return this.LJ;
    }

    @Override // X.InterfaceC46943Ibb
    public final void LJIIIIZZ() {
    }

    @Override // X.InterfaceC46943Ibb
    public final C46816IYy LIZ() {
        return new C46816IYy(new IZ1());
    }

    @Override // X.InterfaceC46878IaY
    public final InterfaceC46926IbK LIZIZ() {
        if (this.LIZLLL == null) {
            IDimensionBitrateCurveConfig dimensionBitrateCurveConfig = C1DG.LIZ().getConfig().getDimensionBitrateCurveConfig();
            if (dimensionBitrateCurveConfig != null && dimensionBitrateCurveConfig.enable()) {
                this.LIZLLL = new C46956Ibo();
            } else {
                this.LIZLLL = new C46957Ibp();
            }
        }
        return this.LIZLLL.create();
    }

    @Override // X.InterfaceC46943Ibb
    public final void LIZLLL() {
        SimRadar.traceGroup("SimKitBGInit").LIZ("bg-init").LIZJ();
        if (this.LIZ == null) {
            this.LIZ = (ISimKitConfig) InjectedConfigManager.getConfig(ISimKitConfig.class);
        }
        IWO.LIZ().LIZIZ(new C46809IYr(this));
        if (!this.LIZ.getSimPlayerExperiment().enableLazyInitMdl()) {
            InterfaceC46732IVs LIZ = C13870gZ.LIZ();
            LIZ.getClass();
            IZA.LIZIZ(new C46985IcH("TASK_PRELOAD_MANAGER_SERVICE_INIT", new ARunnableS10S0101000_6(4, LIZ, 8)));
        }
        C46986IcI.LIZ = new C1B8();
        if (this.LIZ.getSimPlayerExperiment().PlayeAbEnableCustomizeThreadPoolExp() == 1) {
            IWO.LIZ().LJIIIIZZ(C46982IcE.LIZLLL);
        }
        IXB.LIZ = this.LIZ.getAppConfig().isDebug();
        this.LIZ.getAppConfig().isDebug();
        SimRadar.traceGroup("SimKitBGInit").LIZ("bg-init").end();
    }

    @Override // X.InterfaceC46943Ibb
    public final C73030SlO LJII() {
        return new C73030SlO();
    }

    @Override // X.InterfaceC46943Ibb
    public final ISimKitConfig getConfig() {
        ISimKitConfig iSimKitConfig = this.LIZ;
        if (iSimKitConfig == null) {
            return (ISimKitConfig) InjectedConfigManager.getConfig(ISimKitConfig.class);
        }
        return iSimKitConfig;
    }

    public SimKitService() {
        new AtomicBoolean(false);
        this.LIZJ = new C46790IXy();
        this.LIZIZ = new b();
        LJI = new C78598Ut0();
    }

    @Override // X.InterfaceC46943Ibb
    public final int LIZJ() {
        return LJI().LIZJ();
    }

    @Override // X.InterfaceC46943Ibb
    public final b LJ() {
        return this.LIZIZ;
    }

    @Override // X.InterfaceC46943Ibb
    public final C46790IXy LJFF() {
        return this.LIZJ;
    }

    @Override // X.InterfaceC46943Ibb
    public final C78598Ut0 LJIIIZ() {
        return LJI;
    }

    @Override // X.InterfaceC46943Ibb
    public final C46988IcK LJIIJ() {
        return C46987IcJ.LIZ;
    }

    public static int LJIIJJI(ISimKitConfig iSimKitConfig) {
        ISpeedCalculatorConfig speedCalculatorConfig = iSimKitConfig.getSpeedCalculatorConfig();
        if (speedCalculatorConfig == null) {
            return 1;
        }
        int calculatorType = speedCalculatorConfig.getCalculatorType();
        if (calculatorType != 1) {
            Object value = IZ8.LJJIJIIJIL.getValue();
            o.LJIIIIZZ(value, "<get-enableStrategyCenterRunningCheck>(...)");
            if (((Boolean) value).booleanValue() && !C47147Iet.LIZ.LJII()) {
                return 1;
            }
        }
        return calculatorType;
    }

    public final void LJIIL(ISimKitConfig iSimKitConfig) {
        int LJIIJJI;
        ISpeedPredictorService LIZ;
        ISpeedCalculatorConfig speedCalculatorConfig = iSimKitConfig.getSpeedCalculatorConfig();
        if (speedCalculatorConfig != null && (LIZ = C49606JdS.LIZ((LJIIJJI = LJIIJJI(iSimKitConfig)))) != null) {
            ISpeedCalculator build = LIZ.build();
            this.LJ = build;
            if (build != null) {
                build.LJFF(speedCalculatorConfig);
                this.LJFF = LJIIJJI;
            }
        }
        if (this.LJ == null) {
            C47492IkS c47492IkS = new C47492IkS();
            this.LJ = c47492IkS;
            c47492IkS.LJFF(new C47489IkP());
            this.LJFF = 1;
        }
        C77123UOp.LJLJJL = this.LJ;
    }

    @Override // X.InterfaceC46943Ibb
    public final void setAutoAudioFocus(boolean z) {
        getConfig().getPlayerGlobalConfig().setAutoAudioFocus(z);
    }

    @Override // X.InterfaceC46943Ibb
    public final void updateAppState(boolean z) {
        C46981IcD.LIZLLL = z;
        if (z) {
            C46981IcD.LIZ = false;
            Application application = C46982IcE.LIZ;
            if (application != null) {
                try {
                    Object LLILL = C16880lQ.LLILL(application, "sensor");
                    if (LLILL != null) {
                        C39187FZn c39187FZn = C39188FZo.LIZ;
                        C46983IcF c46983IcF = C46981IcD.LIZIZ;
                        Cert LJ = C46982IcE.LJ(false);
                        c39187FZn.getClass();
                        C39187FZn.LIZLLL((SensorManager) LLILL, c46983IcF, LJ);
                    } else {
                        throw new NullPointerException("null cannot be cast to non-null type android.hardware.SensorManager");
                    }
                } catch (Q0C e) {
                    IXB.LIZ(e.getMessage());
                }
            }
        } else {
            C46981IcD.LIZJ();
        }
        C13870gZ.LIZ().updateAppState(z);
    }
}
