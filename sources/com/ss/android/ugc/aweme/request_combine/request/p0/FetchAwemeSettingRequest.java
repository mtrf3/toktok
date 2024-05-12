package com.ss.android.ugc.aweme.request_combine.request.p0;

import X.AnonymousClass030;
import X.EFM;
import X.EFN;
import X.EnumC36092EEm;
import X.EnumC36103EEx;
import android.content.Context;
import com.ss.android.ugc.aweme.settingsrequest.SettingManagerServiceImpl;
import java.util.List;

/* loaded from: classes7.dex */
public final class FetchAwemeSettingRequest implements EFM {
    @Override // X.EEY
    public final String key() {
        return "FetchAwemeSettingRequest";
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
        return EFN.P0;
    }

    @Override // X.EFM
    public final void LIZJ(Context context, boolean z) {
        SettingManagerServiceImpl.LIZJ().LIZIZ(context);
    }
}
