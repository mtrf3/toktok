package com.ss.android.ugc.aweme.im.sdk.relations.data.core.helper;

import X.AnonymousClass030;
import X.C3FU;
import X.C3FW;
import X.C48841JEv;
import X.C55247LmF;
import X.C785836o;
import X.C78613UtF;
import X.C80763Ey;
import X.DNL;
import X.EFM;
import X.EFN;
import X.EnumC36092EEm;
import X.EnumC36103EEx;
import X.InterfaceC55251LmJ;
import X.InterfaceC80643Em;
import X.XIA;
import X.XKX;
import android.content.Context;
import com.bytedance.provider.impl.GScope;
import djb.IDaS20S0000000_1;
import java.util.List;
import kotlinx.coroutines.CoroutineExceptionHandler;

/* loaded from: classes2.dex */
public final class FetchMAFListRequest implements EFM {
    @Override // X.EEY
    public final String key() {
        return "FetchMAFListRequest";
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

    @Override // X.EFM
    public final EFN type() {
        if (DNL.LIZ()) {
            return EFN.BOOT_FINISH;
        }
        return EFN.NORMAL;
    }

    @Override // X.EEY
    public final EnumC36092EEm scenesType() {
        return EnumC36092EEm.DEFAULT;
    }

    @Override // X.EFM
    public final void LIZJ(Context context, boolean z) {
        InterfaceC80643Em interfaceC80643Em;
        if (C80763Ey.LIZLLL()) {
            C3FW LIZ = C785836o.LIZ();
            LIZ.getClass();
            InterfaceC55251LmJ LIZLLL = C55247LmF.LIZLLL(GScope.LJLIL, InterfaceC80643Em.class, "source_default_key");
            if (LIZLLL == null || (interfaceC80643Em = (InterfaceC80643Em) LIZLLL.getSource()) == null) {
                return;
            }
            XIA xia = C78613UtF.LIZJ;
            XKX.LIZLLL(C48841JEv.LIZ(xia), xia.plus(new IDaS20S0000000_1(CoroutineExceptionHandler.LJJJJIZL, 17)), null, new C3FU(LIZ, interfaceC80643Em, null), 2);
        }
    }
}
