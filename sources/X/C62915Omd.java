package X;

import Y.IDxS132S0200000_10;
import Y.IDxS309S0100000_10;
import com.ss.android.ugc.aweme.compliance.business.settings.ComplianceApi;
import com.ss.android.ugc.aweme.framework.services.IUserService;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.services.BaseUserService;
import yq4.a;

/* renamed from: X.Omd, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C62915Omd {
    public final C62822Ol8 LIZ;

    public C62915Omd() {
        C62822Ol8 LIZIZ = C221108m2.LIZIZ(C62917Omf.LJLIL);
        this.LIZ = LIZIZ;
        if (!((Boolean) DOI.LIZLLL.getValue()).booleanValue()) {
            LIZIZ.getValue().toString();
        }
    }

    public final void LIZ(InterfaceC62926Omo interfaceC62926Omo, int i) {
        User currentUser;
        if (UTU.LIZIZ(UTU.LIZ)) {
            return;
        }
        ComplianceApi complianceApi = (ComplianceApi) this.LIZ.getValue();
        int LJIILJJIL = a.LJIILL().LJIILJJIL();
        int i2 = 0;
        IUserService createIUserServicebyMonsterPlugin = BaseUserService.createIUserServicebyMonsterPlugin(false);
        if (createIUserServicebyMonsterPlugin != null && (currentUser = createIUserServicebyMonsterPlugin.getCurrentUser()) != null) {
            i2 = currentUser.getUserMode();
        }
        complianceApi.getComplianceSetting(LJIILJJIL, i2, i).LJJL(T16.LIZ()).LJJJ(C73969T1h.LIZIZ()).LIZ(new IDxS132S0200000_10(interfaceC62926Omo, this, 0));
    }

    public final void LIZIZ(String str, String str2, InterfaceC62930Oms interfaceC62930Oms) {
        ((ComplianceApi) this.LIZ.getValue()).setComplianceSettings(str, str2).LJJL(T16.LIZ()).LJJJ(C73969T1h.LIZIZ()).LIZ(new IDxS309S0100000_10(interfaceC62930Oms, 1));
    }
}
