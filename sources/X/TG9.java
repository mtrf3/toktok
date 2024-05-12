package X;

import com.ss.android.ugc.aweme.sticker.view.internal.main.AbstractStickerView;
import com.ss.android.ugc.aweme.sticker.view.internal.main.StickerViewImpl;
import com.ss.android.ugc.effectmanager.effect.model.Effect;

/* loaded from: classes13.dex */
public final class TG9 implements TGR {
    public final /* synthetic */ AbstractStickerView LJLIL;

    public TG9(StickerViewImpl stickerViewImpl) {
        this.LJLIL = stickerViewImpl;
    }

    @Override // X.TGR
    public final void LIZ(T4Q t4q) {
        boolean z;
        C74371TGt c74371TGt = this.LJLIL.LJLLI;
        if (c74371TGt != null) {
            Effect effect = t4q.LIZ;
            if (effect != null && effect.getTypes() != null && effect.getTypes().contains("AR")) {
                z = true;
            } else {
                z = false;
            }
            c74371TGt.LIZ(!z);
        }
        this.LJLIL.LLIIIILZ.LIZ(t4q);
    }

    @Override // X.TGR
    public final void LIZIZ(T4R t4r) {
        C74371TGt c74371TGt = this.LJLIL.LJLLI;
        if (c74371TGt != null) {
            c74371TGt.LIZ(true);
        }
        this.LJLIL.LLIIIILZ.LIZIZ(t4r);
    }
}
