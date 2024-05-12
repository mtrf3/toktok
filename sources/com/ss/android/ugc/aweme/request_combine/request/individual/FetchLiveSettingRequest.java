package com.ss.android.ugc.aweme.request_combine.request.individual;

import X.AnonymousClass030;
import X.C36292EMe;
import X.EFM;
import X.EFN;
import X.EnumC36092EEm;
import X.EnumC36103EEx;
import android.content.Context;
import com.ss.android.ugc.aweme.live.LiveOuterService;
import java.util.List;

/* loaded from: classes7.dex */
public final class FetchLiveSettingRequest implements EFM {
    @Override // X.EEY
    public final String key() {
        return "FetchLiveSettingRequest";
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
        C36292EMe c36292EMe;
        LiveOuterService.LJJJLL().LJJIJIIJIL();
        if (LiveOuterService.LJJJLL().LJJJJIZL() != null && (c36292EMe = C36292EMe.LIZIZ) != null) {
            c36292EMe.LIZ(context);
        }
    }
}
