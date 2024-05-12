package com.ss.android.ugc.aweme.feed.assem.photosensitivevideomask;

import X.C33Q;
import X.C8JX;
import com.ss.android.ugc.aweme.feed.assem.base.FeedBaseViewModel;
import kotlin.jvm.internal.AqS169S0100000_3;
import yq4.a;

/* loaded from: classes4.dex */
public final class PhotosensitiveVideoMaskVM extends FeedBaseViewModel<C8JX> {
    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final C33Q defaultState() {
        return new C8JX(0);
    }

    public final void kv0() {
        if (a.LJFF().LJJIJIIJI() == 1) {
            setState(new AqS169S0100000_3(this, 209));
        } else {
            setState(new AqS169S0100000_3(this, 210));
        }
    }
}
