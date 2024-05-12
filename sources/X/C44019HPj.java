package X;

import Y.AObjectS30S0000000_7;
import Y.AObjectS40S0201000_7;
import com.ss.android.ugc.aweme.setting.ui.SettingNewVersionFragment;
import com.zhiliaoapp.musically.R;

/* renamed from: X.HPj, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C44019HPj implements R5X {
    public final /* synthetic */ SettingNewVersionFragment LIZ;

    @Override // X.R5X
    public final void onDialogShow() {
        C188727au c188727au = new C188727au();
        c188727au.LJIIIZ("enter_from", "settings_privacy");
        c188727au.LJIIIZ("format", "pop_window");
        FMX.LJIIL("account_management_page_show", c188727au.LIZ);
    }

    public C44019HPj(SettingNewVersionFragment settingNewVersionFragment) {
        this.LIZ = settingNewVersionFragment;
    }

    @Override // X.R5X
    public final void onFailure(int i) {
        if (i == 1) {
            C26045AKb c26045AKb = new C26045AKb(this.LIZ);
            c26045AKb.LJIIIIZZ(R.string.q_6);
            c26045AKb.LJIIJ();
            C188727au c188727au = new C188727au();
            c188727au.LJIIIZ("enter_from", "settings_privacy");
            c188727au.LJIIIZ("format", "toast");
            FMX.LJIIL("account_management_page_show", c188727au.LIZ);
            return;
        }
        if (i == 2) {
            return;
        }
        C26045AKb c26045AKb2 = new C26045AKb(this.LIZ);
        c26045AKb2.LJIIIIZZ(R.string.gj5);
        c26045AKb2.LJIIJ();
    }

    @Override // X.R5X
    public final void onSuccess(MLL mll) {
        C26227ARb c26227ARb = new C26227ARb(this.LIZ.getContext());
        ARI ari = new ARI(this.LIZ.getContext());
        ari.LJI(R.string.q05, new AObjectS40S0201000_7(0, this, mll, 1));
        ari.LJIIIIZZ(R.string.cg_, new AObjectS30S0000000_7(0));
        String string = this.LIZ.getString(R.string.q_4);
        if (EOO.LIZ() && mll != null && !mll.LIZJ.isEmpty()) {
            string = this.LIZ.getString(R.string.jh0, mll.LIZJ);
        }
        c26227ARb.LJFF(string);
        c26227ARb.LIZ(R.string.q_3);
        c26227ARb.LJIIL = ari;
        c26227ARb.LJI().LIZLLL();
        FMX.onEventV3("remove_account_window_pop_up");
    }
}
