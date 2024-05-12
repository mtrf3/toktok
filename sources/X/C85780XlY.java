package X;

import com.ss.android.ugc.aweme.IBindService;
import com.ss.android.ugc.aweme.setting.I18nSettingManageMyAccountActivity;
import com.ss.android.ugc.aweme.setting.api.UnbindValidateResponse;

/* renamed from: X.XlY, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C85780XlY implements C10I<UnbindValidateResponse, Object> {
    public final /* synthetic */ DialogC254019y1 LIZ;
    public final /* synthetic */ boolean LIZIZ;
    public final /* synthetic */ I18nSettingManageMyAccountActivity LIZJ;

    @Override // X.C10I
    public final Object then(C10K<UnbindValidateResponse> c10k) {
        IMX imx;
        this.LIZ.dismiss();
        if (!C82544WaS.LJ(c10k) || c10k.LJIIJJI().data == null) {
            this.LIZJ.LLJILJILJ();
            this.LIZJ.LLIL(false, EnumC85784Xlc.UNLINK, IMX.UNKNOWN);
            return null;
        }
        UnbindValidateResponse.Data data = c10k.LJIIJJI().data;
        int i = data.errorCode;
        I18nSettingManageMyAccountActivity i18nSettingManageMyAccountActivity = this.LIZJ;
        EnumC85784Xlc enumC85784Xlc = EnumC85784Xlc.UNLINK;
        i18nSettingManageMyAccountActivity.getClass();
        if (i != 0) {
            if (i != 2031) {
                if (i != 2050) {
                    imx = IMX.UNKNOWN;
                } else {
                    imx = IMX.DIGITAL_3;
                }
            } else {
                imx = IMX.DIGITAL_2;
            }
        } else {
            imx = IMX.DIGITAL_1;
        }
        i18nSettingManageMyAccountActivity.LLIL(false, enumC85784Xlc, imx);
        if (i == 0) {
            this.LIZJ.LJLJI = true;
            IBindService LJFF = HG3.LJFF();
            I18nSettingManageMyAccountActivity i18nSettingManageMyAccountActivity2 = this.LIZJ;
            LJFF.unbindEmail(i18nSettingManageMyAccountActivity2, this.LIZIZ, data.extraEligibleLoginMethod, i18nSettingManageMyAccountActivity2.LLIIIZ);
            return null;
        }
        I18nSettingManageMyAccountActivity i18nSettingManageMyAccountActivity3 = this.LIZJ;
        i18nSettingManageMyAccountActivity3.showToast(i18nSettingManageMyAccountActivity3.LLIIIZ(data.errorCode, false));
        return null;
    }

    public C85780XlY(I18nSettingManageMyAccountActivity i18nSettingManageMyAccountActivity, DialogC254019y1 dialogC254019y1, boolean z) {
        this.LIZJ = i18nSettingManageMyAccountActivity;
        this.LIZ = dialogC254019y1;
        this.LIZIZ = z;
    }
}
