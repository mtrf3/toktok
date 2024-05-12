package com.ss.android.ugc.aweme.ui.feed.photos;

import X.C203107y6;
import X.C203277yN;
import X.C78963Uyt;
import X.C81Z;
import X.C88S;
import com.ss.android.ugc.aweme.model.PostModeEntranceMechanism;

/* loaded from: classes4.dex */
public final class PostModeFullPageViewModel extends PhotoViewModelV2 {
    public final boolean LLFF;

    @Override // com.ss.android.ugc.aweme.ui.feed.photos.PhotoViewModelV2
    public final void qv0() {
    }

    public PostModeFullPageViewModel() {
        super(new C81Z(true), 2);
        this.LLFF = true;
    }

    @Override // com.ss.android.ugc.aweme.ui.feed.photos.PhotoViewModelV2
    public final boolean nv0() {
        return this.LLFF;
    }

    public final void uv0(PostModeEntranceMechanism postModeEntranceMechanism, boolean z) {
        if (C78963Uyt.LJJII(this.LJLLI)) {
            return;
        }
        if ((C203277yN.LIZ() && postModeEntranceMechanism == PostModeEntranceMechanism.TAP_PHOTO) || !z || ((Boolean) C88S.LIZ.getValue()).booleanValue()) {
            setState(C203107y6.LJLIL);
        } else {
            lv0();
        }
    }
}
