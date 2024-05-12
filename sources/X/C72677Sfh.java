package X;

import com.ss.android.ugc.aweme.view.editor.ProfileNaviEditorFragment;
import com.ss.android.ugc.aweme.viewModel.ProfileNaviEditorState;
import com.ss.android.ugc.aweme.viewModel.ProfileNaviEditorViewModel;
import kotlin.jvm.internal.AqS36S0001000_12;
import kotlin.jvm.internal.o;

/* renamed from: X.Sfh, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C72677Sfh implements LHW {
    public final /* synthetic */ ProfileNaviEditorFragment LJLIL;

    @Override // X.InterfaceC54357LUz
    public final void LIZ(C78856UxA tab) {
        o.LJIIIZ(tab, "tab");
    }

    @Override // X.InterfaceC54357LUz
    public final void LIZJ(C78856UxA tab) {
        o.LJIIIZ(tab, "tab");
    }

    public C72677Sfh(ProfileNaviEditorFragment profileNaviEditorFragment) {
        this.LJLIL = profileNaviEditorFragment;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC54357LUz
    public final void LIZIZ(C78856UxA tab) {
        o.LJIIIZ(tab, "tab");
        ProfileNaviEditorViewModel vl = this.LJLIL.vl();
        int i = tab.LJ;
        if (((ProfileNaviEditorState) vl.lv0()).getCurrentTabIndex() != i) {
            vl.setStateImmediate(new AqS36S0001000_12(i, 8));
        }
    }
}
