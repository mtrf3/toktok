package com.ss.android.ugc.aweme.requesttask.idle;

import X.AV1;
import X.AnonymousClass030;
import X.C36319ENf;
import X.C38759FJb;
import X.C38760FJc;
import X.C38766FJi;
import X.C78609UtB;
import X.EFM;
import X.EFN;
import X.ENZ;
import X.EnumC36092EEm;
import X.EnumC36103EEx;
import X.InterfaceC38761FJd;
import X.RBW;
import Y.ARunnableS25S0200000_6;
import android.content.Context;
import java.util.List;

/* loaded from: classes7.dex */
public final class InitBDRegionDataRequest implements EFM {
    @Override // X.EEY
    public final String key() {
        return "InitBDRegionDataRequest";
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
    public final /* synthetic */ int targetProcess() {
        return AnonymousClass030.LIZ();
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
        return EFN.IDLE;
    }

    @Override // X.EFM
    public final void LIZJ(Context context, boolean z) {
        InterfaceC38761FJd interfaceC38761FJd;
        if (!z) {
            return;
        }
        C38760FJc c38760FJc = new C38760FJc();
        c38760FJc.LIZ = "api-va.tiktokv.com";
        if (RBW.LJLLI.LJI()) {
            AV1.LJIILLIIL();
        }
        c38760FJc.LIZIZ = ENZ.LIZ;
        c38760FJc.LIZJ = C36319ENf.LIZ;
        C38759FJb c38759FJb = new C38759FJb(c38760FJc);
        C78609UtB.LJLJI = c38759FJb;
        C78609UtB.LJLJJI = c38759FJb.LIZ;
        ARunnableS25S0200000_6 aRunnableS25S0200000_6 = new ARunnableS25S0200000_6(context, 52);
        C38759FJb c38759FJb2 = C78609UtB.LJLJI;
        if (c38759FJb2 == null || (interfaceC38761FJd = c38759FJb2.LIZJ) == null) {
            C38766FJi.LIZ.submit(aRunnableS25S0200000_6);
        } else {
            interfaceC38761FJd.execute(aRunnableS25S0200000_6);
        }
    }
}
