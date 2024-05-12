package com.ss.android.ugc.aweme.net.mutli.network;

import X.AV1;
import X.AnonymousClass998;
import X.C16880lQ;
import X.C19N;
import X.C221108m2;
import X.C35351Du7;
import X.C48684J8u;
import X.C58096Mr6;
import X.C62822Ol8;
import X.C64693PaD;
import X.C64752PbA;
import X.C84763XOl;
import X.EnumC48682J8s;
import X.HG3;
import X.IEN;
import X.InterfaceC48686J8w;
import X.J92;
import X.RBX;
import Y.AfS60S0100000_8;
import com.bytedance.ttnet.TTNetInit;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.network.channel.ISpeedModeService;
import com.ss.android.ugc.aweme.service.IFeedDebugService;
import com.ss.android.ugc.aweme.setting.page.datasave.SpeedModeSettingImpl;
import com.ss.mediakit.net.AVMDLMultiNetwork;
import kotlin.jvm.internal.AqS158S0100000_8;
import kotlin.jvm.internal.o;

/* loaded from: classes9.dex */
public final class SpeedModeServiceImpl implements ISpeedModeService {
    public volatile boolean LIZIZ;
    public int LIZ = -1;
    public final C62822Ol8 LIZJ = C221108m2.LIZIZ(new AqS158S0100000_8(this, 94));

    public static ISpeedModeService LJII() {
        Object LIZ = C58096Mr6.LIZ(ISpeedModeService.class, false);
        if (LIZ != null) {
            return (ISpeedModeService) LIZ;
        }
        if (C58096Mr6.k3 == null) {
            synchronized (ISpeedModeService.class) {
                if (C58096Mr6.k3 == null) {
                    C58096Mr6.k3 = new SpeedModeServiceImpl();
                }
            }
        }
        return C58096Mr6.k3;
    }

    public static boolean LJIIIIZZ() {
        if (C19N.LJ("speed_mode_global_switch", true) && !((Boolean) C35351Du7.LIZ.getValue()).booleanValue()) {
            return true;
        }
        return false;
    }

    @Override // com.ss.android.ugc.aweme.network.channel.ISpeedModeService
    public final boolean LIZJ() {
        if (this.LIZ == 6) {
            return true;
        }
        return false;
    }

    @Override // com.ss.android.ugc.aweme.network.channel.ISpeedModeService
    public final boolean LJFF() {
        boolean z = !((Boolean) C35351Du7.LIZ.getValue()).booleanValue();
        if (((RBX) HG3.LJIILL()).isLogin() && !AV1.LJIILLIIL() && z) {
            return true;
        }
        return false;
    }

    @Override // com.ss.android.ugc.aweme.network.channel.ISpeedModeService
    public final void LJI() {
        InterfaceC48686J8w interfaceC48686J8w;
        if (LJIIIIZZ() && (interfaceC48686J8w = (InterfaceC48686J8w) this.LIZJ.getValue()) != null) {
            interfaceC48686J8w.LIZIZ();
        }
    }

    @Override // com.ss.android.ugc.aweme.network.channel.ISpeedModeService
    public final void LIZIZ(boolean z) {
        try {
        } catch (Exception e) {
            C16880lQ.LLLLIIL(e);
        }
        if (C64752PbA.LIZ()) {
            if (C64693PaD.LJIILIIL(TTNetInit.getTTNetDepend().getContext()) != null) {
                C64693PaD.LJIILLIIL(z);
            }
            if (z && !this.LIZIZ) {
                ISpeedModeService LJII = LJII();
                this.LIZIZ = true;
                C84763XOl.LJI().LJJJJZI(new AfS60S0100000_8(LJII, 4));
                return;
            }
            return;
        }
        throw new UnsupportedOperationException("Cronet is not enabled");
    }

    @Override // com.ss.android.ugc.aweme.network.channel.ISpeedModeService
    public final void LIZ(int i, int i2) {
        if (!LJIIIIZZ()) {
            return;
        }
        InterfaceC48686J8w interfaceC48686J8w = (InterfaceC48686J8w) this.LIZJ.getValue();
        if (interfaceC48686J8w != null) {
            interfaceC48686J8w.LIZ(i2);
        }
        if (i2 == 5) {
            if (i != 5 && !C84763XOl.LJIIJJI && ((RBX) HG3.LJIILL()).isLogin() && !AV1.LJIILLIIL()) {
                EnumC48682J8s LJ = SpeedModeSettingImpl.LJFF().LJ();
                if (LJ == EnumC48682J8s.NONE) {
                    SpeedModeSettingImpl.LJFF().LIZJ(new C48684J8u(this));
                } else if (LJ == EnumC48682J8s.ALLOW) {
                    LIZIZ(true);
                }
            }
        } else if (i2 == -1 && i == 5) {
            LIZIZ(false);
        }
        if (i2 == 6) {
            if (((Boolean) C35351Du7.LIZIZ.getValue()).booleanValue()) {
                AVMDLMultiNetwork.switchToCellularNetwork();
            }
            SpeedModeSettingImpl.LJFF().LIZ();
            IEN.LIZIZ.LIZ.reportNetworkLevel("to_cellular_tans_data");
        } else {
            SpeedModeSettingImpl.LJFF().LIZLLL();
        }
        if (i == 6) {
            AVMDLMultiNetwork.switchToDefaultNetwork();
        }
        this.LIZ = i2;
        IFeedDebugService iFeedDebugService = (IFeedDebugService) ServiceManager.get().getService(IFeedDebugService.class);
        if (iFeedDebugService != null) {
            iFeedDebugService.LJII();
        }
    }

    @Override // com.ss.android.ugc.aweme.network.channel.ISpeedModeService
    public final void LIZLLL(AnonymousClass998 status, String str) {
        InterfaceC48686J8w interfaceC48686J8w;
        o.LJIIIZ(status, "status");
        if (LJIIIIZZ() && (interfaceC48686J8w = (InterfaceC48686J8w) this.LIZJ.getValue()) != null) {
            interfaceC48686J8w.LIZJ(status);
        }
    }

    @Override // com.ss.android.ugc.aweme.network.channel.ISpeedModeService
    public final void LJ(J92 freezeType, String str) {
        InterfaceC48686J8w interfaceC48686J8w;
        o.LJIIIZ(freezeType, "freezeType");
        if (LJIIIIZZ() && (interfaceC48686J8w = (InterfaceC48686J8w) this.LIZJ.getValue()) != null) {
            interfaceC48686J8w.LIZLLL(freezeType);
        }
    }
}
