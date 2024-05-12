package com.ss.android.ugc.tiktok.tpsc.settings.account;

import X.AbstractC73672Svk;
import X.C72041SPd;
import X.C72045SPh;
import X.C79723Ay;
import X.QD3;
import androidx.lifecycle.MutableLiveData;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.tiktok.tpsc.base.BasePrivacySettingViewModel;
import com.ss.android.ugc.tiktok.tpsc.model.PrivacyUserSettingsV2;
import kotlin.jvm.internal.o;
import org.greenrobot.eventbus.EventBus;

/* loaded from: classes13.dex */
public abstract class BasePrivacyUserSettingViewModelV3 extends BasePrivacySettingViewModel {
    public final String LJLJJL;
    public Integer LJLJJLL;

    @Override // androidx.lifecycle.ViewModel
    public void onCleared() {
        EventBus.LIZJ().LJIJ(this);
    }

    public BasePrivacyUserSettingViewModelV3(String str) {
        Integer num;
        this.LJLJJL = str;
        EventBus.LIZJ().LJIILJJIL(this);
        MutableLiveData<Integer> mutableLiveData = this.LJLJI;
        C72041SPd.LIZ.getClass();
        PrivacyUserSettingsV2 LJI = C72041SPd.LJI();
        if (LJI != null) {
            num = LJI.M(str);
        } else {
            num = null;
        }
        mutableLiveData.setValue(num);
        C72045SPh.LIZ(false);
    }

    @Override // com.ss.android.ugc.tiktok.tpsc.base.BasePrivacySettingViewModel
    public final AbstractC73672Svk<BaseResponse> jv0(int i) {
        C72041SPd c72041SPd = C72041SPd.LIZ;
        String str = this.LJLJJL;
        c72041SPd.getClass();
        return C72041SPd.LJII(i, 0, str);
    }

    @Override // com.ss.android.ugc.tiktok.tpsc.base.BasePrivacySettingViewModel
    public final void lv0(int i) {
        this.LJLJJLL = this.LJLJI.getValue();
        super.lv0(i);
    }

    @QD3
    public final void onPrivacyUserSettingsChange(C79723Ay event) {
        o.LJIIIZ(event, "event");
        this.LJLJI.postValue(event.LJLIL.M(this.LJLJJL));
    }
}
