package X;

import Y.IDdS377S0100000_4;
import com.ss.android.ugc.aweme.setting.ui.AdSettingsActivity;

/* loaded from: classes5.dex */
public final class AGY implements InterfaceC25948AGi {
    public final /* synthetic */ AdSettingsActivity LIZ;

    @Override // X.InterfaceC25948AGi
    public final void LIZ() {
        this.LIZ.LLFII();
    }

    public AGY(AdSettingsActivity adSettingsActivity) {
        this.LIZ = adSettingsActivity;
    }

    @Override // X.InterfaceC25948AGi
    public final void LIZIZ(long j, long j2) {
        AdSettingsActivity adSettingsActivity = this.LIZ;
        String str = adSettingsActivity.LJLIL;
        if (str == null) {
            return;
        }
        adSettingsActivity.LJLJJLL.requestCodeExtend(str, j2).enqueue(new IDdS377S0100000_4(adSettingsActivity, 3));
    }
}
