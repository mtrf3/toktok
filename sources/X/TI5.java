package X;

import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.ss.android.ugc.effectmanager.effect.model.EffectCategoryModel;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class TI5 extends TI8 {
    public final ShortVideoContext LIZJ;

    @Override // X.TI8, X.InterfaceC74429TIz
    public final void LIZJ(List<EffectCategoryModel> origin) {
        o.LJIIIZ(origin, "origin");
        ORS.LJJLIL(TI7.LJLIL, origin);
        super.LIZJ(origin);
        TI6.LIZ(this.LIZJ, origin, true);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TI5(C74385THh configure, ShortVideoContext shortVideoContext) {
        super(configure);
        o.LJIIIZ(configure, "configure");
        this.LIZJ = shortVideoContext;
    }
}
