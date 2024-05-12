package X;

import com.ss.android.ugc.tiktok.tpsc.base.BasePrivacySettingViewModel;

/* loaded from: classes13.dex */
public final class SN2 implements InterfaceC71919SKl {
    public final /* synthetic */ SN1<BasePrivacySettingViewModel> LIZ;
    public final /* synthetic */ boolean LIZIZ;

    @Override // X.InterfaceC71919SKl
    public final boolean isEnabled() {
        if (SN3.LIZJ(this.LIZ.LLII()).LIZ && (!this.LIZIZ || !C78966Uyw.LJJIJL())) {
            return true;
        }
        return false;
    }

    @Override // X.InterfaceC71919SKl
    public final boolean isVisible() {
        return SN3.LIZJ(this.LIZ.LLII()).LIZIZ;
    }

    public SN2(SN1<BasePrivacySettingViewModel> sn1, boolean z) {
        this.LIZ = sn1;
        this.LIZIZ = z;
    }
}
