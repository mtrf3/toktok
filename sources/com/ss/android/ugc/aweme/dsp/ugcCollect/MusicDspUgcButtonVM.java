package com.ss.android.ugc.aweme.dsp.ugcCollect;

import X.C227768wm;
import X.C33Q;
import X.C40883G2t;
import X.C65352Pkq;
import X.C78404Ups;
import X.C84763XOl;
import X.C91477ZvF;
import X.C91479ZvH;
import X.C91608ZxM;
import X.EV6;
import X.HG3;
import X.J9P;
import X.RBX;
import X.XKX;
import Y.IDgS353S0100000_29;
import android.app.Activity;
import android.os.Bundle;
import com.ss.android.ugc.aweme.feed.assem.base.FeedBaseViewModel;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.aweme.music.model.Dsp;
import com.ss.android.ugc.aweme.music.model.Music;
import kotlin.jvm.internal.IDqS1S0010000_29;

/* loaded from: classes22.dex */
public final class MusicDspUgcButtonVM extends FeedBaseViewModel<C91477ZvF> {
    public boolean LJLJLLL;
    public final EV6 LJLL = C78404Ups.LIZIZ(this, C65352Pkq.LIZ(C91479ZvH.class));

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final C33Q defaultState() {
        return new C91477ZvF(null);
    }

    public final void kv0() {
        VideoItemParams gv0;
        Aweme aweme;
        Dsp dsp;
        String fullClipId;
        Music music;
        String l;
        if (this.LJLJLLL || (gv0 = gv0()) == null || (aweme = gv0.getAweme()) == null || (dsp = aweme.getDsp()) == null || (fullClipId = dsp.getFullClipId()) == null || (music = aweme.getMusic()) == null || (l = Long.valueOf(music.getId()).toString()) == null) {
            return;
        }
        if (!((RBX) HG3.LJIILL()).isLogin()) {
            String aid = aweme.getAid();
            Activity LJIIIIZZ = C84763XOl.LJIIIIZZ();
            C40883G2t c40883G2t = new C40883G2t();
            c40883G2t.LIZLLL("group_id", aid);
            c40883G2t.LIZLLL("author_id", aweme.getAuthorUid());
            c40883G2t.LIZLLL("log_pb", C227768wm.LJIIIZ(aid));
            J9P.LIZIZ(LJIIIIZZ, "", "click_favorite_video", (Bundle) c40883G2t.LIZ, new IDgS353S0100000_29(this, 1));
            return;
        }
        setState(new IDqS1S0010000_29(true, 1));
        this.LJLJLLL = true;
        XKX.LIZLLL(getAssemVMScope(), null, null, new C91608ZxM(this, fullClipId, l, null), 3);
    }
}
