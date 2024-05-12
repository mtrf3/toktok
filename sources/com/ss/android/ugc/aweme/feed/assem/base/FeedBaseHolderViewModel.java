package com.ss.android.ugc.aweme.feed.assem.base;

import X.C33Q;
import X.C53324KwK;
import X.C54838Lfe;
import X.C8YE;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import defpackage.e1;
import java.util.List;
import kotlin.jvm.internal.AqS134S0200000_3;
import kotlin.jvm.internal.o;

/* loaded from: classes4.dex */
public abstract class FeedBaseHolderViewModel<S extends C33Q> extends AssemViewModel<S> implements C8YE<S, VideoItemParams> {
    public boolean LJLIL = true;
    public final boolean LJLILLLLZI = true;

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public boolean isHolderVM() {
        return this.LJLILLLLZI;
    }

    public final void gv0(VideoItemParams item) {
        o.LJIIIZ(item, "item");
        if (e1.LIZ(31744, "unify_assem_holder_viewmodel", true, false) || !C53324KwK.LIZ() || C54838Lfe.LJIIZILJ(item.getAweme())) {
            return;
        }
        if (this.LJLIL) {
            this.LJLIL = false;
        } else {
            setState(new AqS134S0200000_3((FeedBaseHolderViewModel) this, item, (VideoItemParams) 80));
        }
    }

    @Override // X.C8YE
    public final Object b50(C33Q state, Object item) {
        o.LJIIIZ(state, "state");
        o.LJIIIZ(item, "item");
        return item;
    }

    @Override // X.C8YE
    public final C33Q HU(C33Q state, VideoItemParams videoItemParams, List list) {
        VideoItemParams item = videoItemParams;
        o.LJIIIZ(state, "state");
        o.LJIIIZ(item, "item");
        if (!e1.LIZ(31744, "unify_assem_holder_viewmodel", true, false) || C54838Lfe.LJIIZILJ(item.getAweme())) {
            return state;
        }
        return defaultState();
    }
}
