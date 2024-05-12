package X;

import com.ss.android.ugc.aweme.setting.ui.SettingNewVersionFragment;
import com.zhiliaoapp.musically.R;

/* loaded from: classes10.dex */
public final class MDS implements R5X {
    public final /* synthetic */ SettingNewVersionFragment LIZ;

    @Override // X.R5X
    public final void onDialogShow() {
    }

    public MDS(SettingNewVersionFragment settingNewVersionFragment) {
        this.LIZ = settingNewVersionFragment;
    }

    @Override // X.R5X
    public final void onFailure(int i) {
        C26045AKb c26045AKb = new C26045AKb(this.LIZ);
        c26045AKb.LJIIIIZZ(R.string.gj5);
        c26045AKb.LJIIJ();
    }

    @Override // X.R5X
    public final void onSuccess(MLL mll) {
        C26045AKb c26045AKb = new C26045AKb(this.LIZ.mo49getActivity());
        c26045AKb.LJIIIIZZ(R.string.q_8);
        c26045AKb.LJIIJ();
    }
}
