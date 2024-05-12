package com.ss.android.ugc.aweme.compliance.privacy.sdk.ui.qa;

import X.C188727au;
import X.FMX;
import X.ING;
import androidx.lifecycle.MediatorLiveData;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.tiktok.tpsc.settings.account.BasePrivacyUserSettingViewModelV3;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class QAInviteViewModel extends BasePrivacyUserSettingViewModelV3 {
    public final MediatorLiveData<ING> LJLJL;
    public final MediatorLiveData LJLJLJ;
    public boolean LJLJLLL;

    public QAInviteViewModel() {
        super("qna_invite");
        MediatorLiveData<ING> mediatorLiveData = new MediatorLiveData<>();
        this.LJLJL = mediatorLiveData;
        this.LJLJLJ = mediatorLiveData;
    }

    @Override // com.ss.android.ugc.tiktok.tpsc.base.BasePrivacySettingViewModel
    public final void iv0(int i, BaseResponse response) {
        String str;
        o.LJIIIZ(response, "response");
        if (this.LJLJLLL) {
            C188727au c188727au = new C188727au();
            c188727au.LJIIIZ("type", "invite");
            if (i != 3) {
                if (i != 4) {
                    if (i != 5) {
                        str = "everyone";
                    } else {
                        str = "no_one";
                    }
                } else {
                    str = "friends";
                }
            } else {
                str = "following";
            }
            c188727au.LJIIIZ("to_status", str);
            FMX.LJIIL("change_add_yours_settings", c188727au.LIZ);
        }
    }
}
