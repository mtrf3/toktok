package com.ss.android.ugc.tiktok.tpsc.settings.account.adapters.chat.readreceipts;

import X.C71909SKb;
import X.C71976SMq;
import X.InterfaceC92693kP;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.tiktok.tpsc.settings.account.BasePrivacyUserSettingViewModelV3;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class ReadReceiptsViewModel extends BasePrivacyUserSettingViewModelV3 {
    public final String LJLJL;
    public InterfaceC92693kP LJLJLJ;

    public ReadReceiptsViewModel() {
        super("message_read_status");
        this.LJLJL = "privacy_and_safety_settings";
    }

    @Override // com.ss.android.ugc.tiktok.tpsc.settings.account.BasePrivacyUserSettingViewModelV3, androidx.lifecycle.ViewModel
    public final void onCleared() {
        InterfaceC92693kP interfaceC92693kP = this.LJLJLJ;
        if (interfaceC92693kP != null) {
            interfaceC92693kP.dispose();
        }
        super.onCleared();
    }

    @Override // com.ss.android.ugc.tiktok.tpsc.base.BasePrivacySettingViewModel
    public final void iv0(int i, BaseResponse response) {
        o.LJIIIZ(response, "response");
        C71976SMq.LIZJ(i, this.LJLJL, "read_receipt", "user");
        C71909SKb.LIZ.getClass();
        this.LJLJLJ = C71909SKb.LIZJ().LIZ().LIZ();
    }
}
