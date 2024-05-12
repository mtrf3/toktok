package X;

import com.ss.android.ugc.aweme.services.now.ICreativeNowPublishService;
import com.ss.android.ugc.aweme.services.now.model.CreativeNowDraft;
import com.ss.android.ugc.aweme.shortvideo.BaseShortVideoContext;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import kotlin.jvm.internal.o;

/* renamed from: X.GLn, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C41371GLn implements ICreativeNowPublishService {
    @Override // com.ss.android.ugc.aweme.services.now.ICreativeNowPublishService
    public final boolean postNowDraft(ActivityC45651qj context, CreativeNowDraft model) {
        o.LJIIIZ(context, "context");
        o.LJIIIZ(model, "model");
        if (!(model.getEditModel() instanceof VideoPublishEditModel)) {
            return false;
        }
        BaseShortVideoContext editModel = model.getEditModel();
        o.LJII(editModel, "null cannot be cast to non-null type com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel");
        GTM.LJFF(GTM.LIZLLL((VideoPublishEditModel) editModel), context);
        return true;
    }
}
