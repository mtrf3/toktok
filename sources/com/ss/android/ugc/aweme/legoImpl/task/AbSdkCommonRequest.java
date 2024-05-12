package com.ss.android.ugc.aweme.legoImpl.task;

import X.AnonymousClass030;
import X.C2YJ;
import X.C38686FGg;
import X.EFM;
import X.EFN;
import X.EnumC36092EEm;
import X.EnumC36103EEx;
import android.content.Context;
import java.util.List;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* loaded from: classes7.dex */
public final class AbSdkCommonRequest implements EFM {
    @Override // X.EEY
    public final String key() {
        return "AbSdkCommonRequest";
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
        try {
            Boolean disableDelayAbSdkRequest = C2YJ.LIZIZ.LIZ.getDisableDelayAbSdkRequest();
            o.LJIIIIZZ(disableDelayAbSdkRequest, "get().disableDelayAbSdkRequest");
            if (disableDelayAbSdkRequest.booleanValue()) {
                C38686FGg.LIZ();
                JSONObject jSONObject = C38686FGg.LIZIZ.LIZJ;
                if (jSONObject != null && jSONObject.length() > 0) {
                    return EFN.IDLE;
                }
                return EFN.NORMAL;
            }
        } catch (Exception unused) {
        }
        return EFN.IDLE;
    }

    @Override // X.EEY
    public final EnumC36092EEm scenesType() {
        return EnumC36092EEm.DEFAULT;
    }

    @Override // X.EFM
    public final void LIZJ(Context context, boolean z) {
        if (C38686FGg.LJ) {
            C38686FGg.LIZLLL();
        }
    }
}
