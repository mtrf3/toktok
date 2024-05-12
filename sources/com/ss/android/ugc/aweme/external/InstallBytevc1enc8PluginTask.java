package com.ss.android.ugc.aweme.external;

import X.C0RN;
import X.C141335gf;
import X.C37131Ehj;
import X.C37132Ehk;
import X.C37251Ejf;
import X.C3C5;
import X.C76800UCe;
import X.EE1;
import X.EFK;
import X.EnumC36092EEm;
import X.EnumC36103EEx;
import X.F5Q;
import X.F5R;
import X.H7B;
import X.InterfaceC37265Ejt;
import X.X1D;
import android.content.Context;
import com.bytedance.ies.ugc.aweme.plugin.service.IPluginService;
import com.ss.android.ugc.aweme.plugin.aab.AabPluginServiceImpl;
import java.util.List;

/* loaded from: classes7.dex */
public final class InstallBytevc1enc8PluginTask implements EE1 {
    @Override // X.EEY
    public final String key() {
        return "InstallBytevc1enc8PluginTask";
    }

    @Override // X.EEY
    public final /* synthetic */ boolean meetTrigger() {
        return true;
    }

    @Override // X.EEY
    public final /* synthetic */ String prefix() {
        return "task_";
    }

    @Override // X.EE1
    public final /* synthetic */ boolean serialExecute() {
        return false;
    }

    @Override // X.EEY
    public final /* synthetic */ int targetProcess() {
        return C0RN.LIZ();
    }

    @Override // X.EEY
    public final /* synthetic */ List triggerOtherLegoComponents() {
        return null;
    }

    @Override // X.EEY
    public final /* synthetic */ EnumC36103EEx triggerType() {
        return C0RN.LIZIZ(this);
    }

    @Override // X.EEY
    public final EnumC36092EEm scenesType() {
        return EnumC36092EEm.DEFAULT;
    }

    @Override // X.EE1
    public final EFK type() {
        return EFK.BOOT_FINISH;
    }

    @Override // X.EEY
    public final void run(Context context) {
        Object LIZ;
        if (!InterfaceC37265Ejt.LJIIJJI.isEnableBytevc1enc8Plugin()) {
            return;
        }
        IPluginService LIZLLL = AabPluginServiceImpl.LIZLLL();
        try {
        } catch (Throwable th) {
            LIZ = C141335gf.LIZ(th);
            C3C5.m7constructorimpl(LIZ);
        }
        if (LIZLLL.checkPluginInstalled("com.ss.android.ugc.aweme.df_ve_enc8")) {
            H7B.LIZ("Bytevc1enc8Plugin -> com.ss.android.ugc.aweme.df_ve_enc8 installed");
            return;
        }
        H7B.LIZ("Bytevc1enc8Plugin -> start install com.ss.android.ugc.aweme.df_ve_enc8");
        C37132Ehk c37132Ehk = new C37132Ehk();
        c37132Ehk.LIZIZ = true;
        c37132Ehk.LIZ = "com.ss.android.ugc.aweme.df_ve_enc8";
        F5Q f5q = new F5Q();
        f5q.LIZIZ = false;
        f5q.LIZJ = false;
        f5q.LIZLLL = false;
        f5q.LJIIIIZZ = false;
        c37132Ehk.LJ = new F5R(f5q);
        c37132Ehk.LIZLLL = new C37251Ejf(LIZLLL);
        LIZLLL.LIZ(new C37131Ehj(c37132Ehk));
        LIZ = C76800UCe.LIZ;
        C3C5.m7constructorimpl(LIZ);
        Throwable m10exceptionOrNullimpl = C3C5.m10exceptionOrNullimpl(LIZ);
        if (m10exceptionOrNullimpl != null) {
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("Bytevc1enc8Plugin -> InstallBytevc1enc8PluginTask run failed ");
            LIZ2.append(m10exceptionOrNullimpl.getMessage());
            H7B.LIZJ(X1D.LIZIZ(LIZ2));
        }
    }
}
