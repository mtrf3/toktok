package X;

import com.ss.android.ugc.aweme.editSticker.model.StickerItemModel;
import com.ss.android.vesdk.VESize;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class GZY {
    public final C41702GYg LIZ;
    public final List<StickerItemModel> LIZIZ;
    public final boolean LIZJ;
    public final VESize LIZLLL;
    public final OSZ<OSZ<Float, Float>, OSZ<Float, Float>> LJ;
    public final long LJFF;

    public GZY() {
        throw null;
    }

    public GZY(C41702GYg c41702GYg, List list, VESize veSize, OSZ canvasRect) {
        o.LJIIIZ(veSize, "veSize");
        o.LJIIIZ(canvasRect, "canvasRect");
        this.LIZ = c41702GYg;
        this.LIZIZ = list;
        this.LIZJ = true;
        this.LIZLLL = veSize;
        this.LJ = canvasRect;
        this.LJFF = 0L;
    }
}
