package X;

import android.os.Bundle;
import com.ss.android.ugc.aweme.framework.services.IStickerService;
import com.ss.android.ugc.effectmanager.effect.model.Effect;

/* loaded from: classes8.dex */
public final class IDF implements TGR {
    public final /* synthetic */ C46245ICz LJLIL;

    public IDF(C46245ICz c46245ICz) {
        this.LJLIL = c46245ICz;
    }

    @Override // X.TGR
    public final void LIZ(T4Q t4q) {
        boolean z;
        C46245ICz c46245ICz = this.LJLIL;
        Effect effect = t4q.LIZ;
        c46245ICz.LJZL = effect;
        IStickerService.FaceSticker LJJL = C78897Uxp.LJJL(effect);
        if (LJJL != null) {
            Bundle bundle = t4q.LJ;
            if (bundle != null) {
                z = bundle.getBoolean("is_video_used_sticker");
            } else {
                z = false;
            }
            LJJL.isVideoUsedSticker = z;
        }
    }

    @Override // X.TGR
    public final void LIZIZ(T4R t4r) {
        this.LJLIL.LJZL = null;
    }
}
