package X;

import Y.IDeS359S0100000_15;
import android.os.Bundle;
import androidx.lifecycle.Observer;
import com.ss.android.ugc.aweme.account.login.auth.I18nSignUpActivity;
import com.ss.android.ugc.aweme.account.login.model.BaseLoginMethod;
import com.ss.android.ugc.aweme.services.MandatoryLoginService;
import java.util.List;

/* loaded from: classes12.dex */
public final class R5Z<T> implements Observer {
    public final /* synthetic */ I18nSignUpActivity LJLIL;

    public R5Z(I18nSignUpActivity i18nSignUpActivity) {
        this.LJLIL = i18nSignUpActivity;
    }

    @Override // androidx.lifecycle.Observer
    public final void onChanged(Object obj) {
        Bundle bundle;
        String str;
        if (obj == EnumC68524Quu.NOT_READY) {
            return;
        }
        C68517Qun c68517Qun = C68517Qun.LIZ;
        C68517Qun.LIZLLL.removeObservers(this.LJLIL);
        List<BaseLoginMethod> LJ = c68517Qun.LJ(R41.LIZIZ.LJFF().allUidList());
        if (LJ.isEmpty()) {
            this.LJLIL.LLIIJLIL();
            return;
        }
        Bundle LJJLIIIIJ = C16880lQ.LJJLIIIIJ(this.LJLIL.getIntent(), "sign_up_data");
        if (LJJLIIIIJ != null) {
            bundle = new Bundle(LJJLIIIIJ);
        } else {
            bundle = new Bundle();
        }
        if (bundle.getBoolean("show_login_page_first", MandatoryLoginService.createIMandatoryLoginServicebyMonsterPlugin(false).shouldShowLoginTabFirst())) {
            str = "click_login";
        } else {
            str = "click_sign_up";
        }
        if (c68517Qun.LJIIIZ() && !c68517Qun.LJII()) {
            bundle.putString("enter_method", "reinstall");
        }
        bundle.putString("enter_type", str);
        I18nSignUpActivity i18nSignUpActivity = this.LJLIL;
        R5I.LIZ(i18nSignUpActivity, bundle, LJ, new IDeS359S0100000_15(i18nSignUpActivity, 7));
        C1DH.LJJIJIIJI(RunnableC68970R5a.LJLIL);
    }
}
