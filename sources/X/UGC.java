package X;

import com.ss.android.ugc.aweme.live.livehostimpl.edit.EmoteEditDialogFragment;
import com.ss.android.ugc.aweme.live.livehostimpl.edit.text.bean.EditTextStickerViewModel;
import kotlin.jvm.internal.o;

/* loaded from: classes14.dex */
public final class UGC implements InterfaceC87213YKr {
    public final /* synthetic */ EmoteEditDialogFragment LIZ;
    public final /* synthetic */ YKR LIZIZ;

    @Override // X.InterfaceC87213YKr
    public final boolean LIZ() {
        EmoteEditDialogFragment emoteEditDialogFragment = this.LIZ;
        YKR ykr = this.LIZIZ;
        EditTextStickerViewModel editTextStickerViewModel = emoteEditDialogFragment.LJLLJ;
        if (editTextStickerViewModel != null) {
            editTextStickerViewModel.o().LJII(Boolean.FALSE);
            emoteEditDialogFragment.LJLLILLLL = ykr;
            emoteEditDialogFragment.Hl(ykr);
            return true;
        }
        o.LJIJI("textStickerViewModel");
        throw null;
    }

    public UGC(EmoteEditDialogFragment emoteEditDialogFragment, YKR ykr) {
        this.LIZ = emoteEditDialogFragment;
        this.LIZIZ = ykr;
    }
}
