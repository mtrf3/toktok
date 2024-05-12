package X;

import android.view.View;
import com.bytedance.tiktok.homepage.mainpagefragment.assem.MainPageBusinessAssem;
import com.ss.android.ugc.aweme.homepage.api.interaction.BaseScrollSwitchStateManager;

/* renamed from: X.LNz, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C54175LNz implements InterfaceC54260LRg {
    public final /* synthetic */ MainPageBusinessAssem LIZ;

    @Override // X.InterfaceC54260LRg
    public final void LIZ() {
        MainPageBusinessAssem mainPageBusinessAssem = this.LIZ;
        View view = mainPageBusinessAssem.LJLJI;
        if (view != null) {
            view.setAlpha(0.5f);
        }
        BaseScrollSwitchStateManager baseScrollSwitchStateManager = (BaseScrollSwitchStateManager) mainPageBusinessAssem.LJLLILLLL.getValue();
        if (baseScrollSwitchStateManager != null) {
            baseScrollSwitchStateManager.tv0(false);
        }
    }

    @Override // X.InterfaceC54260LRg
    public final void LIZIZ() {
        MainPageBusinessAssem mainPageBusinessAssem = this.LIZ;
        View view = mainPageBusinessAssem.LJLJI;
        if (view != null) {
            view.setAlpha(1.0f);
        }
        BaseScrollSwitchStateManager baseScrollSwitchStateManager = (BaseScrollSwitchStateManager) mainPageBusinessAssem.LJLLILLLL.getValue();
        if (baseScrollSwitchStateManager != null) {
            baseScrollSwitchStateManager.tv0(true);
        }
    }

    public C54175LNz(MainPageBusinessAssem mainPageBusinessAssem) {
        this.LIZ = mainPageBusinessAssem;
    }
}
