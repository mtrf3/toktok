package com.ss.android.ugc.aweme.feed.assem.base;

import X.AnonymousClass843;
import X.C3C8;
import X.C47261Igj;
import X.C55096Ljo;
import X.C62814Ol0;
import X.C8XO;
import com.bytedance.assem.arch.reused.ReusedUISlotAssem;
import com.ss.android.ugc.aweme.feed.assem.desc.FeedModeBaseProtocol;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import java.util.LinkedHashMap;

/* loaded from: classes4.dex */
public abstract class FeedBaseAssem<RECEIVER extends C3C8> extends ReusedUISlotAssem<RECEIVER> implements C8XO<VideoItemParams>, FeedModeBaseProtocol {
    public int LLFF;

    @Override // X.C8XO
    public void LLLZIIL() {
    }

    @Override // X.C8XO
    /* renamed from: m4, reason: merged with bridge method [inline-methods] */
    public boolean c2(VideoItemParams videoItemParams) {
        return true;
    }

    @Override // X.C8XO
    /* renamed from: n4, reason: merged with bridge method [inline-methods] */
    public void n3(VideoItemParams videoItemParams) {
    }

    public void unBind() {
    }

    public FeedBaseAssem() {
        new LinkedHashMap();
        this.LLFF = 8;
    }

    @Override // com.ss.android.ugc.aweme.feed.assem.desc.FeedModeBaseProtocol
    public final void s() {
        if (this.LLFF == 0) {
            Y3().setVisibility(0);
        }
    }

    @Override // com.ss.android.ugc.aweme.feed.assem.desc.FeedModeBaseProtocol
    public final void M2() {
        int visibility = Y3().getVisibility();
        this.LLFF = visibility;
        if (visibility == 0) {
            Y3().setVisibility(8);
        }
    }

    @Override // X.C8W0
    public final void onParentSet() {
        super.onParentSet();
        if (AnonymousClass843.LIZIZ()) {
            C62814Ol0.LJJIIJZLJL(C55096Ljo.LJIIZILJ(this), FeedModeBaseProtocol.class, C47261Igj.LJJIJIL(this));
        }
    }
}
