package X;

import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.tiktok.tpsc.base.BasePrivacySettingViewModel;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class SLI implements InterfaceC116954iR<BaseResponse> {
    public final /* synthetic */ BasePrivacySettingViewModel LJLIL;
    public final /* synthetic */ int LJLILLLLZI;

    @Override // X.InterfaceC116954iR
    public final void onComplete() {
    }

    @Override // X.InterfaceC116954iR
    public final void onSubscribe(InterfaceC92693kP d) {
        o.LJIIIZ(d, "d");
    }

    @Override // X.InterfaceC116954iR
    public final void onError(Throwable e) {
        o.LJIIIZ(e, "e");
        this.LJLIL.gv0(this.LJLILLLLZI, e);
        BasePrivacySettingViewModel basePrivacySettingViewModel = this.LJLIL;
        Integer num = basePrivacySettingViewModel.LJLILLLLZI;
        if (num != null) {
            num.intValue();
            basePrivacySettingViewModel.LJLJI.postValue(basePrivacySettingViewModel.LJLILLLLZI);
            basePrivacySettingViewModel.LJLILLLLZI = null;
        }
        this.LJLIL.LJLJJI.postValue(Boolean.FALSE);
        this.LJLIL.hv0(e);
    }

    @Override // X.InterfaceC116954iR
    public final void onNext(BaseResponse baseResponse) {
        BaseResponse setting = baseResponse;
        o.LJIIIZ(setting, "setting");
        BasePrivacySettingViewModel basePrivacySettingViewModel = this.LJLIL;
        basePrivacySettingViewModel.LJLILLLLZI = null;
        basePrivacySettingViewModel.LJLJJI.postValue(Boolean.FALSE);
        this.LJLIL.iv0(this.LJLILLLLZI, setting);
    }

    public SLI(BasePrivacySettingViewModel basePrivacySettingViewModel, int i) {
        this.LJLIL = basePrivacySettingViewModel;
        this.LJLILLLLZI = i;
    }
}
