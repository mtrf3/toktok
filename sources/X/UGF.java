package X;

import com.ss.android.ugc.aweme.live.livehostimpl.edit.EmoteEditDialogFragment;
import com.ss.android.ugc.aweme.live.livehostimpl.edit.text.bean.EditTextStickerViewModel;
import kotlin.jvm.internal.o;

/* loaded from: classes14.dex */
public final class UGF implements UHV {
    public final /* synthetic */ EmoteEditDialogFragment LIZ;

    @Override // X.UHV
    public final boolean LIZ() {
        EditTextStickerViewModel editTextStickerViewModel = this.LIZ.LJLLJ;
        if (editTextStickerViewModel != null) {
            return editTextStickerViewModel.LJIIIIZZ();
        }
        o.LJIJI("textStickerViewModel");
        throw null;
    }

    public UGF(EmoteEditDialogFragment emoteEditDialogFragment) {
        this.LIZ = emoteEditDialogFragment;
    }
}