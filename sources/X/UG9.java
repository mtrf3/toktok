package X;

import com.ss.android.ugc.aweme.live.livehostimpl.edit.SpotlightImageEditDialogFragment;
import com.ss.android.ugc.aweme.live.livehostimpl.edit.text.bean.EditTextStickerViewModel;
import kotlin.jvm.internal.o;

/* loaded from: classes14.dex */
public final class UG9 implements InterfaceC87213YKr {
    public final /* synthetic */ SpotlightImageEditDialogFragment LIZ;
    public final /* synthetic */ YKR LIZIZ;

    @Override // X.InterfaceC87213YKr
    public final boolean LIZ() {
        SpotlightImageEditDialogFragment spotlightImageEditDialogFragment = this.LIZ;
        YKR ykr = this.LIZIZ;
        EditTextStickerViewModel editTextStickerViewModel = spotlightImageEditDialogFragment.LJLLJ;
        if (editTextStickerViewModel != null) {
            editTextStickerViewModel.o().LJII(Boolean.FALSE);
            spotlightImageEditDialogFragment.LJLLILLLL = ykr;
            spotlightImageEditDialogFragment.Il(ykr);
            return true;
        }
        o.LJIJI("textStickerViewModel");
        throw null;
    }

    public UG9(SpotlightImageEditDialogFragment spotlightImageEditDialogFragment, YKR ykr) {
        this.LIZ = spotlightImageEditDialogFragment;
        this.LIZIZ = ykr;
    }
}
