package X;

import com.ss.android.ugc.aweme.setting.ui.AdSettingsActivity;

/* loaded from: classes5.dex */
public final class AGZ implements InterfaceC25948AGi {
    public final /* synthetic */ AdSettingsActivity LIZ;

    @Override // X.InterfaceC25948AGi
    public final void LIZ() {
    }

    public AGZ(AdSettingsActivity adSettingsActivity) {
        this.LIZ = adSettingsActivity;
    }

    @Override // X.InterfaceC25948AGi
    public final void LIZIZ(long j, long j2) {
        AdSettingsActivity adSettingsActivity = this.LIZ;
        String str = adSettingsActivity.LJLIL;
        if (str == null) {
            return;
        }
        adSettingsActivity.LJLJJLL.requestCodeGenerate(str, j, j2).enqueue(new AGV(adSettingsActivity, j, j2));
    }
}
