package X;

import com.bytedance.tiktok.homepage.mainpagefragment.dialog.FissionPopupWindowHelp;
import com.ss.android.ugc.aweme.global.config.settings.pojo.UgAwemeActivitySetting;

/* renamed from: X.LRb, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C54255LRb implements InterfaceC54202LPa {
    public final /* synthetic */ FissionPopupWindowHelp LIZ;

    public C54255LRb(FissionPopupWindowHelp fissionPopupWindowHelp) {
        this.LIZ = fissionPopupWindowHelp;
    }

    @Override // X.InterfaceC54202LPa
    public final void LIZ(UgAwemeActivitySetting ugAwemeActivitySetting) {
        FissionPopupWindowHelp fissionPopupWindowHelp = this.LIZ;
        fissionPopupWindowHelp.LJLIL = ugAwemeActivitySetting;
        if (ugAwemeActivitySetting != null && fissionPopupWindowHelp.LJLLILLLL) {
            fissionPopupWindowHelp.LIZIZ();
        }
    }
}
