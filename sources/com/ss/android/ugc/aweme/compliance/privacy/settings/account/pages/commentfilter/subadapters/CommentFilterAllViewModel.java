package com.ss.android.ugc.aweme.compliance.privacy.settings.account.pages.commentfilter.subadapters;

import X.AbstractC73672Svk;
import X.C247839o3;
import X.C38333F2r;
import X.C63024OoO;
import X.C71945SLl;
import X.SKL;
import X.SL9;
import X.X1D;
import android.text.TextUtils;
import androidx.lifecycle.MutableLiveData;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.compliance.privacy.settings.account.api.UserSetSettingApi;
import com.ss.android.ugc.tiktok.tpsc.base.BasePrivacySettingViewModel;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class CommentFilterAllViewModel extends BasePrivacySettingViewModel {
    public CommentFilterAllViewModel() {
        MutableLiveData<Integer> mutableLiveData = this.LJLJI;
        C247839o3 c247839o3 = C63024OoO.LIZ;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("author_review_all_comments_");
        LIZ.append(C71945SLl.LIZIZ());
        Boolean LIZ2 = c247839o3.LIZ(Boolean.FALSE, X1D.LIZIZ(LIZ));
        o.LJIIIIZZ(LIZ2, "storage.get(FILTER_ALL_C…MENTS + \"_\" + uid, false)");
        mutableLiveData.setValue(Integer.valueOf(LIZ2.booleanValue() ? 1 : 0));
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
        UserSetSettingApi.LIZ.getClass();
        return SL9.LIZ("author_review_all_comments", i);
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
