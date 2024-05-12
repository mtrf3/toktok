package com.ss.android.ugc.aweme.feed.landscape.cell.assem.comment;

import X.AnonymousClass391;
import X.C208088Eq;
import X.C26338AVi;
import X.C32151Nz;
import X.C7MY;
import X.O6R;
import android.view.View;
import com.ss.android.ugc.aweme.feed.assem.videocomment.VideoCommentAssem;
import com.zhiliaoapp.musically.R;
import defpackage.g0;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.o;

/* loaded from: classes4.dex */
public final class LandscapeVideoCommentAssem extends VideoCommentAssem {
    @Override // com.ss.android.ugc.aweme.feed.assem.videocomment.VideoCommentAssem
    public final void B4() {
    }

    public LandscapeVideoCommentAssem() {
        new LinkedHashMap();
    }

    @Override // com.ss.android.ugc.aweme.feed.assem.videocomment.VideoCommentAssem, com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final int W3() {
        if (C208088Eq.LIZIZ()) {
            return R.layout.bh7;
        }
        if (C208088Eq.LIZJ()) {
            return R.layout.bhe;
        }
        return R.layout.bhm;
    }

    @Override // com.ss.android.ugc.aweme.feed.assem.videocomment.VideoCommentAssem, com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent, com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(View view) {
        o.LJIIIZ(view, "view");
        super.onViewCreated(view);
        if (C208088Eq.LIZIZ()) {
            g0.LJJIJIIJI(C7MY.LIZIZ(30), O6R.LJJIIZ(C32151Nz.LJIIZILJ(30)), r4());
            q4().setTuxFont(72);
            C26338AVi.LJI(q4(), null, AnonymousClass391.LIZJ(4), null, null, false, 29);
        }
    }

    @Override // com.ss.android.ugc.aweme.feed.assem.videocomment.VideoCommentAssem
    public final void A4(int i, String text) {
        o.LJIIIZ(text, "text");
        super.A4(i, text);
        if (C208088Eq.LIZJ()) {
            q4().setVisibility(0);
        }
        if (C208088Eq.LIZLLL() && i == 4) {
            q4().setVisibility(8);
        }
    }
}
