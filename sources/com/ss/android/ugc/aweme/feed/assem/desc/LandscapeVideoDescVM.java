package com.ss.android.ugc.aweme.feed.assem.desc;

import X.AnonymousClass842;
import X.AnonymousClass851;
import X.C188727au;
import X.C208088Eq;
import X.C221108m2;
import X.C33Q;
import X.C43I;
import X.C62822Ol8;
import X.C65352Pkq;
import X.C76800UCe;
import X.C79004UzY;
import X.C85H;
import X.C85Y;
import X.C87O;
import X.FMX;
import X.InterfaceC74236TBo;
import X.TBV;
import android.content.Context;
import com.ss.android.ugc.aweme.feed.assem.base.FeedBaseViewModel;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import java.util.Map;
import kotlin.jvm.internal.o;

/* loaded from: classes4.dex */
public final class LandscapeVideoDescVM extends FeedBaseViewModel<AnonymousClass851> {
    public static final /* synthetic */ InterfaceC74236TBo<Object>[] LJZI;
    public int LJLLI;
    public boolean LJLLJ;
    public int LJLLL;
    public final boolean LJLLLLLL;
    public final boolean LJLZ;
    public final int LJZ;
    public final C87O LJLJLLL = new C87O(C85Y.LJLIL);
    public final C62822Ol8 LJLL = C221108m2.LIZIZ(C85H.LJLIL);
    public String LJLLILLLL = "click_hide";
    public String LJLLLL = "";

    static {
        TBV tbv = new TBV(LandscapeVideoDescVM.class, "context", "getContext()Landroid/content/Context;", 0);
        C65352Pkq.LIZ.getClass();
        LJZI = new InterfaceC74236TBo[]{tbv};
    }

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final C33Q defaultState() {
        return new AnonymousClass851(null, null);
    }

    public LandscapeVideoDescVM() {
        int i;
        boolean LIZ = C208088Eq.LIZ();
        this.LJLLLLLL = LIZ;
        this.LJLZ = LIZ;
        if (LIZ) {
            i = 6;
        } else {
            i = 7;
        }
        this.LJZ = i;
    }

    public final boolean kv0() {
        VideoItemParams gv0;
        Aweme aweme;
        String contentDesc;
        if (!AnonymousClass842.LIZ() || (gv0 = gv0()) == null || (aweme = gv0.getAweme()) == null || (contentDesc = aweme.getContentDesc()) == null || contentDesc.length() == 0) {
            return false;
        }
        return true;
    }

    @Override // com.ss.android.ugc.aweme.feed.assem.base.FeedBaseViewModel
    public final AnonymousClass851 iv0(AnonymousClass851 state, VideoItemParams item) {
        o.LJIIIZ(state, "state");
        o.LJIIIZ(item, "item");
        this.LJLLJ = false;
        return new AnonymousClass851(new C43I(C76800UCe.LIZ), null);
    }

    public final void lv0(String str, Map<String, String> extraParams) {
        String str2;
        String str3;
        int i;
        Aweme aweme;
        String desc;
        Aweme aweme2;
        String authorUid;
        Aweme aweme3;
        o.LJIIIZ(extraParams, "extraParams");
        C188727au c188727au = new C188727au();
        VideoItemParams gv0 = gv0();
        Aweme aweme4 = null;
        if (gv0 != null) {
            str2 = gv0.mEventType;
        } else {
            str2 = null;
        }
        String str4 = "";
        if (str2 == null) {
            str2 = "";
        }
        c188727au.LJIIIZ("enter_from", str2);
        VideoItemParams gv02 = gv0();
        if (gv02 == null || (aweme3 = gv02.getAweme()) == null || (str3 = aweme3.getAid()) == null) {
            str3 = "";
        }
        c188727au.LJIIIZ("group_id", str3);
        VideoItemParams gv03 = gv0();
        if (gv03 != null && (aweme2 = gv03.getAweme()) != null && (authorUid = aweme2.getAuthorUid()) != null) {
            str4 = authorUid;
        }
        c188727au.LJIIIZ("author_id", str4);
        c188727au.LJIIIZ("action_type", str);
        int i2 = 0;
        Context context = (Context) this.LJLJLLL.LIZ(LJZI[0]);
        if (context != null) {
            VideoItemParams gv04 = gv0();
            if (gv04 != null) {
                aweme4 = gv04.getAweme();
            }
            i = C79004UzY.LJJJIL(context, aweme4);
        } else {
            i = 1;
        }
        c188727au.LIZLLL(i, "is_landscape_screen");
        c188727au.LIZLLL(this.LJLLLL.length(), "title_without_hashtag_length");
        VideoItemParams gv05 = gv0();
        if (gv05 != null && (aweme = gv05.getAweme()) != null && (desc = aweme.getDesc()) != null) {
            i2 = desc.length();
        }
        c188727au.LIZLLL(i2, "title_length");
        c188727au.LIZLLL(this.LJLLL, "spread_line_cnt");
        c188727au.LJIIIIZZ(extraParams);
        FMX.LJIIL("video_title", c188727au.LIZ);
    }
}
