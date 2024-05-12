package X;

import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.ss.android.ugc.effectmanager.effect.model.EffectCategoryModel;
import java.util.List;
import kotlin.jvm.internal.AqS178S0100000_12;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class TI6 {
    public static final void LIZ(ShortVideoContext shortVideoContext, List<EffectCategoryModel> origin, boolean z) {
        List LJJIJ;
        o.LJIIIZ(origin, "origin");
        if (C43416H2e.LIZ() && shortVideoContext != null && !shortVideoContext.LJJJI() && !shortVideoContext.isStoryOrPhotoTab && !z) {
            LJJIJ = C61878OQg.INSTANCE;
        } else {
            LJJIJ = C47261Igj.LJJIJ("create");
        }
        ORS.LJJLIL(new AqS178S0100000_12(LJJIJ, (List<com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.Tab>) 716), origin);
    }
}
