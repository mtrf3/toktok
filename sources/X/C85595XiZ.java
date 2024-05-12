package X;

import com.ss.android.ugc.aweme.setting.ui.SettingNewVersionFragment;
import com.zhiliaoapp.musically.R;

/* renamed from: X.XiZ, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C85595XiZ implements R5X {
    public final /* synthetic */ SettingNewVersionFragment LIZ;

    @Override // X.R5X
    public final void onDialogShow() {
    }

    public C85595XiZ(SettingNewVersionFragment settingNewVersionFragment) {
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
