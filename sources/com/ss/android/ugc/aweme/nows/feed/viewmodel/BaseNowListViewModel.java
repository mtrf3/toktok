package com.ss.android.ugc.aweme.nows.feed.viewmodel;

import X.C194667kU;
import X.C194737kb;
import X.C194887kq;
import X.C195627m2;
import X.C195937mX;
import X.C196367nE;
import X.C221108m2;
import X.C47261Igj;
import X.C62822Ol8;
import X.C78596Usy;
import X.C78949Uyf;
import X.HG3;
import X.InterfaceC208718Hb;
import X.InterfaceC57784Mm4;
import X.RBX;
import com.bytedance.ext_power_list.AssemListViewModel;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.now.UserNowPost;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.o;

/* loaded from: classes4.dex */
public abstract class BaseNowListViewModel<S extends InterfaceC208718Hb<S, ITEM>, ITEM extends InterfaceC57784Mm4, CURSOR> extends AssemListViewModel<S, ITEM, CURSOR> {
    public boolean LJLIL;
    public boolean LJLILLLLZI;
    public long LJLJI;
    public long LJLJJI;
    public int LJLJJL;
    public int LJLJJLL;
    public final C62822Ol8 LJLJL = C221108m2.LIZIZ(C194887kq.LJLIL);
    public final C194667kU LJLJLJ = C78596Usy.LJJIFFI();

    public abstract void hv0(Aweme aweme);

    public final Set<String> iv0() {
        return (Set) this.LJLJL.getValue();
    }

    public final InterfaceC57784Mm4 gv0(int i, Aweme aweme) {
        List<Aweme> nowPosts;
        String str;
        Aweme aweme2;
        o.LJIIIZ(aweme, "<this>");
        hv0(aweme);
        UserNowPost userNowPost = aweme.userNowPost;
        if (userNowPost != null && (nowPosts = userNowPost.getNowPosts()) != null) {
            nowPosts.size();
            UserNowPost userNowPost2 = aweme.userNowPost;
            if (userNowPost2 != null) {
                String curUserId = ((RBX) HG3.LJIILL()).getCurUserId();
                List<Aweme> nowPosts2 = userNowPost2.getNowPosts();
                if (nowPosts2 != null && (aweme2 = (Aweme) ListProtector.get(nowPosts2, 0)) != null) {
                    str = aweme2.getAuthorUid();
                } else {
                    str = null;
                }
                if (o.LJ(str, curUserId) && (this instanceof NowDistributionListViewModel)) {
                    return new C195627m2(aweme, i, false, null, 482);
                }
            }
        }
        return C78949Uyf.LJIILIIL(aweme, null, null, i, null, false, false, false, null, 502);
    }

    public final void jv0(C194737kb c194737kb, List<InterfaceC57784Mm4> list) {
        String aid;
        int i = 0;
        for (Aweme aweme : c194737kb.LJLIL.getData()) {
            int i2 = i + 1;
            if (i >= 0) {
                Aweme aweme2 = aweme;
                if (C195937mX.LJII(aweme2) && (aid = aweme2.getAid()) != null && !iv0().contains(aid)) {
                    C196367nE c196367nE = C196367nE.LIZ;
                    String authorUid = aweme2.getAuthorUid();
                    if (authorUid == null) {
                        authorUid = "";
                    }
                    c196367nE.getClass();
                    C196367nE.LJI(authorUid);
                    ((ArrayList) list).add(gv0(c194737kb.LJLILLLLZI, aweme2));
                    iv0().add(aid);
                    if (c194737kb.LJLILLLLZI == 0) {
                        this.LJLJJL++;
                    } else {
                        this.LJLJJLL++;
                    }
                }
                i = i2;
            } else {
                C47261Igj.LJJJJJ();
                throw null;
            }
        }
    }
}
