package X;

import com.ss.android.ugc.aweme.shortvideo.BaseShortVideoContext;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.publish.PublishModel;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class GV2 extends GUX implements InterfaceC41602GUk {
    public boolean LJLIL;
    public final C41616GUy LJLILLLLZI;
    public final /* synthetic */ GUQ LJLJI;

    public GV2(GUQ guq) {
        this.LJLJI = guq;
        C41616GUy c41616GUy = new C41616GUy(guq, this);
        this.LJLILLLLZI = c41616GUy;
        C41877Gc5.LIZ.LIZLLL(c41616GUy);
    }

    @Override // X.GUX
    public final void onProgress(int i, Object obj) {
        if (this.LJLJI.LJLJJL.LIZ.publishType == 0 && !this.LJLIL && C41877Gc5.LIZ.LIZIZ()) {
            BaseShortVideoContext baseShortVideoContext = this.LJLJI.LJLJJL.LIZ.editModel;
            if (baseShortVideoContext instanceof VideoPublishEditModel) {
                VideoPublishEditModel videoPublishEditModel = (VideoPublishEditModel) baseShortVideoContext;
                videoPublishEditModel.isOpenForegroundPublish = false;
                videoPublishEditModel.isBackgroundPublish = true;
            }
            this.LJLIL = true;
        }
    }

    @Override // X.GUX
    public final void onFinish(AbstractC41479GPr result, Object obj, PublishModel publishModel) {
        o.LJIIIZ(result, "result");
        C41877Gc5.LIZ.LJ(this.LJLILLLLZI);
    }
}
