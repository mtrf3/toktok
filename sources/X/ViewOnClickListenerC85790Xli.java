package X;

import android.os.Bundle;
import android.view.View;
import com.ss.android.ugc.aweme.setting.I18nSettingManageMyAccountActivity;
import com.ss.android.ugc.aweme.setting.ui.SettingNewVersionFragment;
import com.ss.android.ugc.trill.setting.PushSettingActivity;
import com.ss.n_project.opensdk_tt.ui.WebAuthActivity;
import kotlin.jvm.internal.o;

/* renamed from: X.Xli, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final /* synthetic */ class ViewOnClickListenerC85790Xli implements View.OnClickListener {
    public final /* synthetic */ int LJLIL;
    public final /* synthetic */ Object LJLILLLLZI;

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.LJLIL) {
            case 0:
                I18nSettingManageMyAccountActivity i18nSettingManageMyAccountActivity = (I18nSettingManageMyAccountActivity) this.LJLILLLLZI;
                i18nSettingManageMyAccountActivity.getClass();
                FMX.onEventV3("manage_account_password_click");
                i18nSettingManageMyAccountActivity.LJLJI = true;
                Bundle bundle = new Bundle();
                bundle.putBoolean("have_set_password", i18nSettingManageMyAccountActivity.LJLILLLLZI);
                bundle.putString("purpose", "security");
                HG3.LJIIL();
                HG3.LJLJL.LJII().changePassword(i18nSettingManageMyAccountActivity, i18nSettingManageMyAccountActivity.LLIIIZ, "password_click", bundle, null);
                return;
            case 1:
                ((SettingNewVersionFragment) this.LJLILLLLZI).lambda$initUnits$70(view);
                return;
            case 2:
                PushSettingActivity pushSettingActivity = (PushSettingActivity) this.LJLILLLLZI;
                ((C38337F2v) pushSettingActivity.LJLIL.LIZ()).LIZ(2, ((C25848ACm) pushSettingActivity.LJLJJL.LJLIL).LJZI);
                return;
            default:
                WebAuthActivity this$0 = (WebAuthActivity) this.LJLILLLLZI;
                o.LJIIIZ(this$0, "this$0");
                if (!this$0.LLII()) {
                    this$0.finish();
                    return;
                }
                return;
        }
    }

    public /* synthetic */ ViewOnClickListenerC85790Xli(int i, Object obj) {
        this.LJLIL = i;
        this.LJLILLLLZI = obj;
    }
}
