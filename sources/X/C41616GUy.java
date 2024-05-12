package X;

import com.ss.android.ugc.aweme.shortvideo.BaseShortVideoContext;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;

/* renamed from: X.GUy, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C41616GUy extends C163356b5 {
    public final /* synthetic */ GUQ LJLIL;
    public final /* synthetic */ GV2 LJLILLLLZI;

    @Override // X.C163356b5, X.InterfaceC42472Glg
    public final void onAppBackground() {
        if (this.LJLIL.LJLJJL.LIZ.publishType != 0) {
            return;
        }
        BaseShortVideoContext baseShortVideoContext = this.LJLILLLLZI.LJLJI.LJLJJL.LIZ.editModel;
        if (baseShortVideoContext instanceof VideoPublishEditModel) {
            VideoPublishEditModel videoPublishEditModel = (VideoPublishEditModel) baseShortVideoContext;
            videoPublishEditModel.isOpenForegroundPublish = false;
            videoPublishEditModel.isBackgroundPublish = true;
        }
    }

    public C41616GUy(GUQ guq, GV2 gv2) {
        this.LJLIL = guq;
        this.LJLILLLLZI = gv2;
    }
}
