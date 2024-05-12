package X;

import com.ss.android.ugc.aweme.ftc.components.sticker.core.FTCEditStickerViewModel;
import kotlin.jvm.internal.o;

/* loaded from: classes15.dex */
public final class WUN {
    public final /* synthetic */ WUJ LIZ;

    public WUN(WUJ wuj) {
        this.LIZ = wuj;
    }

    public final void LIZ() {
        WUK wuk = this.LIZ.LJLJJLL;
        if (wuk != null) {
            wuk.LIZLLL(false);
            this.LIZ.getEditPreviewApi().U2(true, false, true);
            FTCEditStickerViewModel fTCEditStickerViewModel = this.LIZ.LJLJI;
            if (fTCEditStickerViewModel != null) {
                fTCEditStickerViewModel.A10().setValue(Boolean.TRUE);
                return;
            } else {
                o.LJIJI("stickerViewModel");
                throw null;
            }
        }
        o.LJIJI("volumeHelper");
        throw null;
    }
}
