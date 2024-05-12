package com.ss.android.ugc.aweme.compliance.privacy.settings.account.pages.addyours;

import X.AbstractC73672Svk;
import X.C188727au;
import X.C221108m2;
import X.C2U8;
import X.C62822Ol8;
import X.C73318Sq2;
import X.C9VE;
import X.FMX;
import X.SL9;
import X.SLB;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.compliance.privacy.settings.account.api.UserSetSettingApi;
import com.ss.android.ugc.tiktok.tpsc.base.BasePrivacySettingViewModel;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class AddYoursProfileEntryViewModel extends BasePrivacySettingViewModel {
    public final C62822Ol8 LJLJJL = C221108m2.LIZIZ(SLB.LJLIL);

    @Override // androidx.lifecycle.ViewModel
    public final void onCleared() {
        super.onCleared();
        ((C73318Sq2) this.LJLJJL.getValue()).dispose();
    }

    @Override // com.ss.android.ugc.tiktok.tpsc.base.BasePrivacySettingViewModel
    public final AbstractC73672Svk<? extends BaseResponse> jv0(int i) {
        UserSetSettingApi.LIZ.getClass();
        return SL9.LIZ("enable_addyours_on_profile", i);
    }

    @Override // com.ss.android.ugc.tiktok.tpsc.base.BasePrivacySettingViewModel
    public final void iv0(int i, BaseResponse response) {
        String str;
        o.LJIIIZ(response, "response");
        C188727au c188727au = new C188727au();
        c188727au.LJIIIZ("type", "show_on_profile");
        if (i == 1) {
            str = "on";
        } else {
            str = "off";
        }
        c188727au.LJIIIZ("to_status", str);
        FMX.LJIIL("change_add_yours_settings", c188727au.LIZ);
        C2U8.LIZ(new C9VE());
    }
}
