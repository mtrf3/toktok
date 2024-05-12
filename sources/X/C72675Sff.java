package X;

import com.ss.android.ugc.aweme.view.editor.ProfileNaviEditorFragment;
import com.ss.android.ugc.aweme.viewModel.ProfileNaviEditorState;
import com.ss.android.ugc.aweme.viewModel.ProfileNaviEditorViewModel;
import kotlin.jvm.internal.AqS5S1001000_12;
import kotlin.jvm.internal.o;

/* renamed from: X.Sff, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C72675Sff implements InterfaceC72697Sg1 {
    public final /* synthetic */ ProfileNaviEditorFragment LIZ;

    public C72675Sff(ProfileNaviEditorFragment profileNaviEditorFragment) {
        this.LIZ = profileNaviEditorFragment;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC72697Sg1
    public final void LIZ(C72588SeG slider, int i) {
        o.LJIIIZ(slider, "slider");
        ProfileNaviEditorViewModel vl = this.LIZ.vl();
        String key = slider.LIZ;
        vl.getClass();
        o.LJIIIZ(key, "key");
        C72685Sfp editCategory = ((ProfileNaviEditorState) vl.lv0()).getEditCategory();
        if (editCategory != null) {
            editCategory.LIZIZ.put(key, Integer.valueOf(i));
            vl.setStateImmediate(new AqS5S1001000_12(key, i, 1));
        }
    }
}
