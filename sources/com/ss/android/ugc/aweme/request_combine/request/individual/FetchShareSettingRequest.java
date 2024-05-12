package com.ss.android.ugc.aweme.request_combine.request.individual;

import X.AnonymousClass030;
import X.C16880lQ;
import X.C2YJ;
import X.C36697Eaj;
import X.C36698Eak;
import X.EFM;
import X.EFN;
import X.EnumC36092EEm;
import X.EnumC36103EEx;
import X.FGR;
import Y.ACallableS109S0100000_6;
import android.content.Context;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class FetchShareSettingRequest implements EFM {
    @Override // X.EEY
    public final String key() {
        return "FetchShareSettingRequest";
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
        if (!C36697Eaj.LIZ.getBoolean("key_has_setting", false)) {
            return EFN.NORMAL;
        }
        try {
            Boolean disableDelayFetchShareSettingRequest = C2YJ.LIZIZ.LIZ.getDisableDelayFetchShareSettingRequest();
            o.LJIIIIZZ(disableDelayFetchShareSettingRequest, "get().disableDelayFetchShareSettingRequest");
            if (disableDelayFetchShareSettingRequest.booleanValue()) {
                return EFN.NORMAL;
            }
        } catch (Exception e) {
            C16880lQ.LLLLIIL(e);
        }
        return EFN.IDLE;
    }

    @Override // X.EEY
    public final EnumC36092EEm scenesType() {
        return EnumC36092EEm.DEFAULT;
    }

    @Override // X.EFM
    public final void LIZJ(Context context, boolean z) {
        C36698Eak LIZIZ = C36698Eak.LIZIZ();
        LIZIZ.getClass();
        FGR.LIZIZ().LIZ(LIZIZ.LJLILLLLZI, new ACallableS109S0100000_6(LIZIZ, 28), 0);
    }
}
