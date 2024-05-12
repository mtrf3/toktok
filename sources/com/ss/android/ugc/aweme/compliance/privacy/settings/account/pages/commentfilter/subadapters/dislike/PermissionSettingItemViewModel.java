package com.ss.android.ugc.aweme.compliance.privacy.settings.account.pages.commentfilter.subadapters.dislike;

import X.AbstractC73672Svk;
import X.C38333F2r;
import X.SKL;
import X.SL9;
import android.text.TextUtils;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.compliance.privacy.settings.account.api.UserSetSettingApi;
import com.ss.android.ugc.tiktok.tpsc.base.BasePrivacySettingViewModel;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class PermissionSettingItemViewModel extends BasePrivacySettingViewModel {
    public final String LJLJJL;

    public PermissionSettingItemViewModel(String str) {
        this.LJLJJL = str;
    }

    @Override // com.ss.android.ugc.tiktok.tpsc.base.BasePrivacySettingViewModel
    public final void hv0(Throwable throwable) {
        String errorMessage;
        o.LJIIIZ(throwable, "throwable");
        if (throwable instanceof C38333F2r) {
            errorMessage = ((C38333F2r) throwable).getErrorMsg();
        } else {
            errorMessage = "";
        }
        if (!TextUtils.isEmpty(errorMessage)) {
            SKL kv0 = kv0();
            if (kv0 != null) {
                o.LJIIIIZZ(errorMessage, "errorMessage");
                kv0.LIZIZ(errorMessage);
                return;
            }
            return;
        }
        SKL kv02 = kv0();
        if (kv02 == null) {
            return;
        }
        kv02.LIZ(R.string.djz);
    }

    @Override // com.ss.android.ugc.tiktok.tpsc.base.BasePrivacySettingViewModel
    public final AbstractC73672Svk<BaseResponse> jv0(int i) {
        SL9 sl9 = UserSetSettingApi.LIZ;
        String str = this.LJLJJL;
        sl9.getClass();
        return SL9.LIZ(str, i);
    }

    @Override // com.ss.android.ugc.tiktok.tpsc.base.BasePrivacySettingViewModel
    public final void iv0(int i, BaseResponse response) {
        o.LJIIIZ(response, "response");
        SKL kv0 = kv0();
        if (kv0 != null) {
            kv0.LIZ(R.string.dk0);
        }
    }
}
