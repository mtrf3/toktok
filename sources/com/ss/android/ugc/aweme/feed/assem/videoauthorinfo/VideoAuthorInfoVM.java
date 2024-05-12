package com.ss.android.ugc.aweme.feed.assem.videoauthorinfo;

import X.C00F;
import X.C16880lQ;
import X.C188727au;
import X.C2049682q;
import X.C2304092m;
import X.C30581Hy;
import X.C33Q;
import X.C54838Lfe;
import X.C56331M8x;
import X.C57105Mb7;
import X.C65352Pkq;
import X.C77123UOp;
import X.C86036Xpg;
import X.C86D;
import X.C86G;
import X.C87O;
import X.FKM;
import X.FMX;
import X.InterfaceC74236TBo;
import X.OSZ;
import X.TBV;
import X.X1D;
import android.text.TextUtils;
import com.ss.android.ugc.aweme.app.host.AwemeHostApplication;
import com.ss.android.ugc.aweme.feed.assem.base.FeedBaseViewModel;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeStatistics;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.aweme.profile.model.User;
import com.zhiliaoapp.musically.R;
import defpackage.e1;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes4.dex */
public final class VideoAuthorInfoVM extends FeedBaseViewModel<C86D> {
    public static final /* synthetic */ InterfaceC74236TBo<Object>[] LJLLI;
    public final HashMap<String, List<String>> LJLJLLL = new HashMap<>();
    public final C87O LJLL = new C87O(C86G.LJLIL);

    static {
        TBV tbv = new TBV(VideoAuthorInfoVM.class, "context", "getContext()Landroid/content/Context;", 0);
        C65352Pkq.LIZ.getClass();
        LJLLI = new InterfaceC74236TBo[]{tbv};
    }

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final C33Q defaultState() {
        return new C86D(0);
    }

    @Override // com.ss.android.ugc.aweme.feed.assem.base.FeedBaseViewModel
    public final C86D iv0(C86D state, VideoItemParams item) {
        int i;
        OSZ osz;
        boolean z;
        String postTime;
        String LJJIIJ;
        User author;
        o.LJIIIZ(state, "state");
        o.LJIIIZ(item, "item");
        String LJ = C56331M8x.LJ(item.getAweme(), item.mEventType);
        if (C56331M8x.LJFF(item.getAweme())) {
            i = 0;
        } else {
            i = 4;
        }
        Aweme aweme = item.getAweme();
        String str = item.mEventType;
        String str2 = null;
        if (aweme == null || (author = aweme.getAuthor()) == null || (TextUtils.isEmpty(C56331M8x.LJ(aweme, str)) && C2049682q.LIZ(aweme))) {
            osz = null;
        } else {
            osz = new OSZ(author.getCustomVerify(), author.getEnterpriseVerifyReason());
        }
        Aweme aweme2 = item.getAweme();
        String str3 = item.mEventType;
        if (aweme2 != null && !aweme2.isPaidContent && ((aweme2.getAuthor() != null && !TextUtils.isEmpty(C56331M8x.LJ(aweme2, str3))) || !C2049682q.LIZ(aweme2))) {
            if (C00F.LIZ(31744, 0, "show_play_count", true) == 2) {
                AwemeStatistics statistics = aweme2.getStatistics();
                if (statistics != null && (LJJIIJ = C77123UOp.LJJIIJ(statistics.getPlayCount())) != null && LJJIIJ.length() != 0 && !aweme2.isAd() && !aweme2.isDelete()) {
                    StringBuilder LIZ = X1D.LIZ();
                    LIZ.append("· ");
                    AwemeHostApplication LIZ2 = FKM.LIZ();
                    o.LJI(LIZ2);
                    String string = LIZ2.getString(R.string.ck_);
                    o.LJIIIIZZ(string, "application!!.getString(…ing.challenge_view_count)");
                    String LLLZ = C16880lQ.LLLZ(string, Arrays.copyOf(new Object[]{LJJIIJ}, 1));
                    o.LJIIIIZZ(LLLZ, "format(format, *args)");
                    LIZ.append(LLLZ);
                    str2 = X1D.LIZIZ(LIZ);
                }
            } else {
                if (C2304092m.LIZ() && C54838Lfe.LJJI(aweme2)) {
                    z = true;
                } else {
                    z = false;
                }
                if (((!C30581Hy.LJIL(str3) && !C30581Hy.LJIJJLI(str3) && !TextUtils.equals(str3, "homepage_topic_stem") && (!C30581Hy.LJIJJ(str3) || !aweme2.isAd())) || z) && aweme2.getCreateTime() > 0 && !aweme2.isScheduleVideo()) {
                    if (e1.LIZ(31744, "standardize_timestamp", true, false)) {
                        postTime = C86036Xpg.LIZIZ(aweme2.getCreateTime() * 1000);
                    } else {
                        postTime = C57105Mb7.LJFF(aweme2.getCreateTime() * 1000, FKM.LIZ());
                    }
                    if (!TextUtils.isEmpty(postTime)) {
                        o.LJIIIIZZ(postTime, "postTime");
                        StringBuilder LIZ3 = X1D.LIZ();
                        LIZ3.append("· ");
                        LIZ3.append(postTime);
                        str2 = X1D.LIZIZ(LIZ3);
                    }
                }
            }
        }
        return new C86D(i, LJ, str2, osz);
    }

    public final void kv0(Aweme aweme, String anchorType) {
        o.LJIIIZ(anchorType, "anchorType");
        if (!FMX.LIZJ("tag_anchor_show")) {
            return;
        }
        C188727au c188727au = new C188727au();
        c188727au.LJIIIZ("enter_from", this.LJLJI);
        String aid = aweme.getAid();
        String str = "";
        if (aid == null) {
            aid = "";
        }
        c188727au.LJIIIZ("group_id", aid);
        String authorUid = aweme.getAuthorUid();
        if (authorUid != null) {
            str = authorUid;
        }
        c188727au.LJIIIZ("author_id", str);
        c188727au.LJIIIZ("anchor_type", anchorType);
        FMX.LJIIL("tag_anchor_show", c188727au.LIZ);
    }
}
