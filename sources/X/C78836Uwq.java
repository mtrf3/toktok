package X;

import com.ss.android.ugc.gamora.recorder.sticker.optionlist.panel.OptionCategoryPanelFragment;
import kotlin.jvm.internal.o;

/* renamed from: X.Uwq, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C78836Uwq extends C0CJ {
    public final /* synthetic */ OptionCategoryPanelFragment LJLIL;

    public C78836Uwq(OptionCategoryPanelFragment optionCategoryPanelFragment) {
        this.LJLIL = optionCategoryPanelFragment;
    }

    @Override // X.C0CJ
    public final void LIZJ(int i) {
        C80261Vej c80261Vej = this.LJLIL.LJLJJI;
        if (c80261Vej != null) {
            C78856UxA tabAt = c80261Vej.getTabAt(i);
            if (tabAt != null) {
                tabAt.LIZIZ();
                return;
            }
            return;
        }
        o.LJIJI("tabLayout");
        throw null;
    }
}
