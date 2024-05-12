package X;

import com.bytedance.ies.ugc.aweme.commercialize.compliance.advertiser.AdvertiserModel;
import com.bytedance.ies.ugc.aweme.commercialize.compliance.advertiser.AdvertiserVM;
import com.ss.android.ugc.aweme.base.api.BaseResponse;

/* loaded from: classes8.dex */
public final class GIV implements InterfaceC36621EYv<BaseResponse> {
    public final /* synthetic */ AdvertiserModel LJLIL;
    public final /* synthetic */ int LJLILLLLZI;
    public final /* synthetic */ AdvertiserVM LJLJI;

    @Override // X.InterfaceC36621EYv
    public final void LIZJ(InterfaceC37276Ek4<BaseResponse> interfaceC37276Ek4, Throwable th) {
        this.LJLIL.setAdvId("");
        this.LJLJI.LJLJI.setValue(this.LJLIL);
    }

    @Override // X.InterfaceC36621EYv
    public final void LJII(InterfaceC37276Ek4<BaseResponse> interfaceC37276Ek4, C64797Pbt<BaseResponse> c64797Pbt) {
        if (c64797Pbt != null && c64797Pbt.LIZIZ()) {
            this.LJLIL.setAdvStatus(Integer.valueOf(this.LJLILLLLZI));
            this.LJLJI.LJLJI.setValue(this.LJLIL);
        } else {
            this.LJLIL.setAdvId("");
            this.LJLJI.LJLJI.setValue(this.LJLIL);
        }
    }

    public GIV(AdvertiserModel advertiserModel, int i, AdvertiserVM advertiserVM) {
        this.LJLIL = advertiserModel;
        this.LJLILLLLZI = i;
        this.LJLJI = advertiserVM;
    }
}
