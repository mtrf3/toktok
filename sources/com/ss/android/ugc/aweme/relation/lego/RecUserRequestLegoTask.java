package com.ss.android.ugc.aweme.relation.lego;

import X.AnonymousClass030;
import X.C3Y9;
import X.C3YA;
import X.C48841JEv;
import X.C55247LmF;
import X.C57135Mbb;
import X.C57737MlJ;
import X.C60741Nsf;
import X.C68322mC;
import X.C73318Sq2;
import X.C73421Srh;
import X.C73542Ste;
import X.C78613UtF;
import X.C78646Utm;
import X.C78999UzT;
import X.C794739z;
import X.C83693Qf;
import X.C84763XOl;
import X.C86581XyT;
import X.EFM;
import X.EFN;
import X.EnumC36092EEm;
import X.EnumC36103EEx;
import X.InterfaceC55251LmJ;
import X.InterfaceC80643Em;
import X.T2R;
import X.XIA;
import X.XKX;
import android.content.Context;
import android.os.SystemClock;
import com.bytedance.provider.impl.GScope;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import djb.IDaS20S0000000_1;
import java.util.List;
import kotlinx.coroutines.CoroutineExceptionHandler;

/* loaded from: classes2.dex */
public final class RecUserRequestLegoTask implements EFM {
    public final boolean LJLIL;

    @Override // X.EEY
    public final String key() {
        return "RecUserRequestLegoTask";
    }

    @Override // X.EEY
    public final /* synthetic */ boolean meetTrigger() {
        return true;
    }

    @Override // X.EEY
    public final /* synthetic */ String prefix() {
        return "request_";
    }

    @Override // X.EEY
    public final /* synthetic */ void run(Context context) {
    }

    @Override // X.EEY
    public final int targetProcess() {
        return 1;
    }

    @Override // X.EEY
    public final /* synthetic */ List triggerOtherLegoComponents() {
        return null;
    }

    @Override // X.EEY
    public final /* synthetic */ EnumC36103EEx triggerType() {
        return AnonymousClass030.LIZIZ(this);
    }

    @Override // X.EEY
    public final EnumC36092EEm scenesType() {
        return EnumC36092EEm.DEFAULT;
    }

    @Override // X.EFM
    public final EFN type() {
        return EFN.BOOT_FINISH;
    }

    public RecUserRequestLegoTask(boolean z) {
        this.LJLIL = z;
        C78646Utm.LIZ.getClass();
        C57737MlJ.LIZIZ = SystemClock.uptimeMillis();
        C57737MlJ.LIZJ = -1L;
        C73318Sq2 c73318Sq2 = C57737MlJ.LJ;
        c73318Sq2.LIZLLL();
        C78999UzT.LJFF(C73542Ste.LJIIIIZZ(new C73421Srh(C84763XOl.LJI()), null, null, C3Y9.LJLIL, 3), c73318Sq2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v3, types: [X.XyT, T, X.3En] */
    @Override // X.EFM
    public final void LIZJ(Context context, boolean z) {
        T t;
        C68322mC c68322mC = new C68322mC();
        GScope gScope = GScope.LJLIL;
        InterfaceC55251LmJ LIZLLL = C55247LmF.LIZLLL(gScope, InterfaceC80643Em.class, "source_default_key");
        if (LIZLLL != null) {
            t = LIZLLL.getSource();
        } else {
            t = 0;
        }
        c68322mC.element = t;
        if (t == 0) {
            ?? c86581XyT = new C86581XyT(null);
            c68322mC.element = c86581XyT;
            C55247LmF.LIZIZ(gScope, c86581XyT, InterfaceC80643Em.class, "source_default_key");
            ((C86581XyT) c68322mC.element).LJLIL.clear();
        }
        if (C83693Qf.LIZ && this.LJLIL) {
            C60741Nsf LJIIJJI = T2R.LJIIJJI();
            XIA xia = C78613UtF.LIZJ;
            XKX.LIZLLL(C48841JEv.LIZ(LJIIJJI.plus(xia)), xia.plus(new IDaS20S0000000_1(CoroutineExceptionHandler.LJJJJIZL, 2)), null, new C794739z(c68322mC, null), 2);
        }
        ((C3YA) ServiceManager.get().getService(C3YA.class)).LIZIZ();
        C57135Mbb.LIZIZ.LJ();
    }
}
