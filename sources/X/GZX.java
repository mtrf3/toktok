package X;

import com.ss.android.ugc.aweme.editSticker.model.StickerItemModel;
import com.ss.android.vesdk.VESize;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class GZX {
    public final VESize LIZ;
    public final OSZ<OSZ<Float, Float>, OSZ<Float, Float>> LIZIZ;
    public final StickerItemModel LIZJ;
    public final C41723GZb LIZLLL;

    public GZX(VESize veSize, OSZ<OSZ<Float, Float>, OSZ<Float, Float>> canvasRect, StickerItemModel stickerItemModel, C41723GZb c41723GZb) {
        o.LJIIIZ(veSize, "veSize");
        o.LJIIIZ(canvasRect, "canvasRect");
        this.LIZ = veSize;
        this.LIZIZ = canvasRect;
        this.LIZJ = stickerItemModel;
        this.LIZLLL = c41723GZb;
    }
}
