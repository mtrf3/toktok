package X;

import Y.AgS124S0100000_7;
import com.ss.android.ugc.aweme.services.story.IStoryDraftService;
import com.ss.android.ugc.aweme.services.story.SimplePublishModel;
import com.ss.android.ugc.aweme.shortvideo.publish.PublishModel;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class GM0 implements IStoryDraftService {
    public final C62822Ol8 LIZ = C221108m2.LIZIZ(GM1.LJLIL);

    @Override // com.ss.android.ugc.aweme.services.story.IStoryDraftService
    public final void deleteDraft(SimplePublishModel publishModel) {
        o.LJIIIZ(publishModel, "publishModel");
        XKX.LIZLLL((InterfaceC70422pa) this.LIZ.getValue(), null, null, new C41362GLe(publishModel, null), 3);
    }

    @Override // com.ss.android.ugc.aweme.services.story.IStoryDraftService
    public final void getStoryDraftList(InterfaceC88472Yns<? super List<PublishModel>, C76800UCe> onSuccess) {
        o.LJIIIZ(onSuccess, "onSuccess");
        C10K.LIZIZ(GM2.LJLIL, C38995FSd.LIZLLL(), null).LJ(new AgS124S0100000_7((InterfaceC88472Yns) onSuccess, 14), C10K.LJIIIIZZ, null);
    }
}
