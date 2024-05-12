package X;

import com.ss.android.ugc.aweme.compliance.privacy.settings.video.base.BaseVideoPrivacySettingViewModel;

/* renamed from: X.SOv, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C72033SOv implements InterfaceC71919SKl {
    public final /* synthetic */ AbstractC72031SOt<BaseVideoPrivacySettingViewModel> LIZ;

    @Override // X.InterfaceC71919SKl
    public final boolean isEnabled() {
        if (SN3.LIZJ(this.LIZ.LJLLI).LIZ && this.LIZ.LLFZ()) {
            return true;
        }
        return false;
    }

    @Override // X.InterfaceC71919SKl
    public final boolean isVisible() {
        if (SN3.LIZJ(this.LIZ.LJLLI).LIZIZ && this.LIZ.LLIFFJFJJ()) {
            return true;
        }
        return false;
    }

    public C72033SOv(AbstractC72031SOt<BaseVideoPrivacySettingViewModel> abstractC72031SOt) {
        this.LIZ = abstractC72031SOt;
    }
}
