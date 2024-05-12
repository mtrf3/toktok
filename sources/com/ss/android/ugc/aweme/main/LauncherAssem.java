package com.ss.android.ugc.aweme.main;

import X.ActivityC45651qj;
import X.C141335gf;
import X.C16880lQ;
import X.C212428Vi;
import X.C36093EEn;
import X.C3C4;
import X.C3C5;
import X.C40003Fmx;
import X.C40005Fmz;
import X.C40328FsC;
import X.C55096Ljo;
import X.C55374LoI;
import X.C56662Kg;
import X.C76800UCe;
import X.EE1;
import X.FCO;
import X.InterfaceC40004Fmy;
import android.app.Application;
import android.content.BroadcastReceiver;
import com.bytedance.sysoptimizer.ReceiverRegisterLancet;
import com.ss.android.ugc.aweme.base.BaseMainContainerAssem;
import com.ss.android.ugc.aweme.feed.earphone.IEarphonePlayerControlService;
import com.ss.android.ugc.feed.platform.panel.earphone.EarphonePlayerControl;
import com.zhiliaoapp.musically.R;

/* loaded from: classes7.dex */
public final class LauncherAssem extends BaseMainContainerAssem {
    public BroadcastReceiver LJLIL;
    public InterfaceC40004Fmy LJLILLLLZI;
    public boolean LJLJI;

    @Override // X.C8W0
    public final void onCreate() {
        String LLLZ = C16880lQ.LLLZ("main_act_assem_lifecycle_%s_%s", new Object[]{C16880lQ.LJLLJ(LauncherAssem.class), "onCreate"});
        C56662Kg.LIZ().LIZJ(LLLZ, false);
        super.onCreate();
        ((IPerformanceAbility) C55096Ljo.LIZIZ(C55096Ljo.LJIIZILJ(this), IPerformanceAbility.class)).uf(new C40003Fmx(this));
        if (C40005Fmz.LIZIZ.LIZ()) {
            C36093EEn c36093EEn = C36093EEn.LIZ;
            EE1 LIZIZ = C55374LoI.LIZIZ.LIZIZ();
            c36093EEn.getClass();
            C36093EEn.LJ(LIZIZ);
        }
        C56662Kg.LIZ().LJFF(LLLZ, false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.C8W0
    public final void onDestroy() {
        Application application;
        C3C4 c3c4;
        C76800UCe c76800UCe;
        super.onDestroy();
        if (!FCO.LIZIZ && this.LJLJI) {
            try {
                ActivityC45651qj LIZ = C212428Vi.LIZ(this);
                if (LIZ != null) {
                    BroadcastReceiver broadcastReceiver = this.LJLIL;
                    ReceiverRegisterLancet.loge(broadcastReceiver, false);
                    LIZ.unregisterReceiver(broadcastReceiver);
                    c76800UCe = C76800UCe.LIZ;
                } else {
                    c76800UCe = null;
                }
                C3C5.m7constructorimpl(c76800UCe);
            } catch (Throwable th) {
                C3C5.m7constructorimpl(C141335gf.LIZ(th));
            }
        }
        ActivityC45651qj LIZ2 = C212428Vi.LIZ(this);
        if (LIZ2 != null && (application = LIZ2.getApplication()) != null) {
            try {
                InterfaceC40004Fmy interfaceC40004Fmy = this.LJLILLLLZI;
                if (interfaceC40004Fmy != null) {
                    interfaceC40004Fmy.LIZIZ(application);
                }
                IEarphonePlayerControlService LJII = EarphonePlayerControl.LJII();
                LJII.LIZLLL(application);
                C3C5.m7constructorimpl(LJII);
                c3c4 = LJII;
            } catch (Throwable th2) {
                C3C4 LIZ3 = C141335gf.LIZ(th2);
                C3C5.m7constructorimpl(LIZ3);
                c3c4 = LIZ3;
            }
            C3C5.m6boximpl(c3c4);
        }
    }

    @Override // com.ss.android.ugc.aweme.base.BaseMainContainerAssem, X.InterfaceC55372LoG
    public final void K5(boolean z, boolean z2) {
        ActivityC45651qj LIZ;
        if (z2 && (LIZ = C212428Vi.LIZ(this)) != null && LIZ.getIntent().getBooleanExtra("app_action_restricted", false)) {
            C40328FsC.LIZLLL(LIZ, R.string.gci);
        }
    }
}
