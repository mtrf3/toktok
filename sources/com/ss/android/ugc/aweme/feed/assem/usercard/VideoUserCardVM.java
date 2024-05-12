package com.ss.android.ugc.aweme.feed.assem.usercard;

import X.AA2;
import X.AA3;
import X.AA5;
import X.C33Q;
import X.C57461Mgr;
import X.C57778Mly;
import X.C57819Mmd;
import X.C78666Uu6;
import X.C78668Uu8;
import X.EnumC25783A9z;
import android.os.SystemClock;
import com.ss.android.ugc.aweme.feed.assem.base.FeedBaseViewModel;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import kotlin.jvm.internal.o;

/* loaded from: classes14.dex */
public final class VideoUserCardVM extends FeedBaseViewModel<C78668Uu8> {
    public static final /* synthetic */ int LJLLLL = 0;
    public boolean LJLJLLL;
    public int LJLLILLLL;
    public boolean LJLLL;
    public long LJLL = -1;
    public int LJLLI = -1;
    public long LJLLJ = -1;

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final C33Q defaultState() {
        return new C78668Uu8(0);
    }

    public final void kv0(C57778Mly c57778Mly) {
        String str;
        Aweme aweme;
        String authorUid;
        if (c57778Mly.LIZLLL() && !this.LJLLL) {
            this.LJLLL = true;
            long uptimeMillis = SystemClock.uptimeMillis() - this.LJLLJ;
            VideoItemParams gv0 = gv0();
            if (gv0 != null) {
                str = gv0.mEventType;
            } else {
                str = null;
            }
            String str2 = "";
            if (str == null) {
                str = "";
            }
            C57819Mmd c57819Mmd = new C57819Mmd(str, "related_pop_up", null, null, false, null, 8188);
            VideoItemParams gv02 = gv0();
            if (gv02 != null && (aweme = gv02.getAweme()) != null && (authorUid = aweme.getAuthorUid()) != null) {
                str2 = authorUid;
            }
            new C57461Mgr(c57819Mmd, "item", str2, uptimeMillis, c57778Mly.LIZ(), c57778Mly.LIZ(), 1).LIZLLL(null);
        }
    }

    @Override // com.ss.android.ugc.aweme.feed.assem.base.FeedBaseViewModel
    public final C78668Uu8 iv0(C78668Uu8 c78668Uu8, VideoItemParams item) {
        C78668Uu8 state = c78668Uu8;
        o.LJIIIZ(state, "state");
        o.LJIIIZ(item, "item");
        this.LJLLI = -1;
        this.LJLL = -1L;
        return C78668Uu8.LIZ(state, false, false, null, null, true, false, false, 78);
    }

    public final void lv0(boolean z, AA5 aa5) {
        String str;
        AA5 aa52 = aa5;
        VideoItemParams gv0 = gv0();
        if (gv0 == null || (str = gv0.mEventType) == null) {
            str = "";
        }
        if (z) {
            this.LJLL = SystemClock.uptimeMillis();
            new AA2(str, EnumC25783A9z.RELATED, null, null).LIZLLL(null);
            return;
        }
        long uptimeMillis = SystemClock.uptimeMillis() - this.LJLL;
        EnumC25783A9z enumC25783A9z = EnumC25783A9z.RELATED;
        if (aa52 == null) {
            aa52 = AA5.AUTO;
        }
        new AA3(str, uptimeMillis, aa52, enumC25783A9z, null, 16).LIZLLL(null);
    }

    public final boolean mv0(C57778Mly c57778Mly, boolean z, boolean z2) {
        if (c57778Mly.LIZLLL() && !c57778Mly.LIZJ() && z && z2) {
            this.LJLLI = c57778Mly.LIZ();
            setStateImmediate(C78666Uu6.LJLIL);
            lv0(true, null);
            return true;
        }
        return false;
    }
}
