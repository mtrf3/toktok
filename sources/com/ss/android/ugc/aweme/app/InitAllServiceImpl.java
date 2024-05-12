package com.ss.android.ugc.aweme.app;

import X.AbstractC59833Ne1;
import X.C38987FRv;
import X.C58096Mr6;
import X.C85999Xp5;
import X.C87549YXp;
import X.EE1;
import X.F62;
import X.F63;
import X.Z8A;
import Y.ARunnableS1S0001000_6;
import Y.IDRunnableS6S0101000;
import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import com.ss.android.ugc.aweme.app.InitAllServiceImpl;
import com.ss.android.ugc.aweme.app.host.AwemeHostApplication;
import com.ss.android.ugc.aweme.legoImp.task.InstallEventBus;
import com.ss.android.ugc.aweme.legoImp.task.RegisterLifecycle;
import com.ss.android.ugc.aweme.main.MainActivity;

/* loaded from: classes7.dex */
public class InitAllServiceImpl extends AbstractC59833Ne1 {
    public boolean LIZ;

    @Override // com.ss.android.ugc.aweme.app.IInitAllService
    public final void LJIIJJI() {
        C85999Xp5.LJFF(null);
    }

    public static IInitAllService LJIILLIIL() {
        Object LIZ = C58096Mr6.LIZ(IInitAllService.class, false);
        if (LIZ != null) {
            return (IInitAllService) LIZ;
        }
        if (C58096Mr6.LLIILII == null) {
            synchronized (IInitAllService.class) {
                if (C58096Mr6.LLIILII == null) {
                    C58096Mr6.LLIILII = new InitAllServiceImpl();
                }
            }
        }
        return C58096Mr6.LLIILII;
    }

    @Override // com.ss.android.ugc.aweme.app.IInitAllService
    public final InstallEventBus LJIIIIZZ() {
        return new InstallEventBus();
    }

    @Override // com.ss.android.ugc.aweme.app.IInitAllService
    public final EE1 LJIIIZ() {
        return Z8A.LIZIZ.getYoutubeRefreshTask();
    }

    @Override // com.ss.android.ugc.aweme.app.IInitAllService
    public final RegisterLifecycle LJIIL() {
        return new RegisterLifecycle();
    }

    @Override // com.ss.android.ugc.aweme.app.IInitAllService
    public final boolean LIZ() {
        return C38987FRv.LIZLLL().booleanValue();
    }

    @Override // X.AbstractC59833Ne1, com.ss.android.ugc.aweme.app.IInitAllService
    public final void LJIIJ(final AwemeHostApplication awemeHostApplication) {
        if (C38987FRv.LIZLLL().booleanValue()) {
            F62.LIZ(new F63() { // from class: X.EGx
                @Override // X.F63
                public final String LIZ(Intent intent, String str) {
                    InitAllServiceImpl initAllServiceImpl = InitAllServiceImpl.this;
                    if (!initAllServiceImpl.LIZ && intent != null && TextUtils.equals(MainActivity.class.getName(), str) && C38986FRu.LIZ().LIZ()) {
                        initAllServiceImpl.LIZ = true;
                        C36157EGz.LIZJ = true;
                        if (C2NW.LIZ().LJJIIZ() || C34206Dbe.LIZ()) {
                            C36093EEn.LIZ.getClass();
                            EEW eew = EEW.LIZ;
                            if (eew.hasMessages(1205)) {
                                eew.removeMessages(1205);
                            }
                        }
                        if (C2NW.LIZ().LJIILLIIL(DMR.LJLIL)) {
                            C38995FSd.LIZIZ().execute(new ARunnableS1S0001000_6(0, 5));
                        }
                        return C38985FRt.LIZIZ.LJIIIIZZ(intent).getName();
                    }
                    return str;
                }
            });
        } else {
            if (!((Boolean) C87549YXp.LJ.getValue()).booleanValue()) {
                return;
            }
            F62.LIZ(new F63() { // from class: X.FEm
                @Override // X.F63
                public final String LIZ(Intent intent, String str) {
                    boolean z;
                    InitAllServiceImpl initAllServiceImpl = InitAllServiceImpl.this;
                    Context context = awemeHostApplication;
                    if (!initAllServiceImpl.LIZ && intent != null && TextUtils.equals(MainActivity.class.getName(), str)) {
                        initAllServiceImpl.LIZ = true;
                        if (TextUtils.equals(intent.getAction(), "android.intent.action.MAIN") && intent.hasCategory("android.intent.category.LAUNCHER")) {
                            z = true;
                        } else {
                            z = false;
                        }
                        C55511LqV.LIZJ = z;
                        if (z && !C55511LqV.LJIIJ) {
                            C55511LqV.LJIIJ = true;
                            C38995FSd.LIZIZ().execute(new IDRunnableS6S0101000(6, context, 4));
                        }
                    }
                    return str;
                }
            });
        }
    }
}
