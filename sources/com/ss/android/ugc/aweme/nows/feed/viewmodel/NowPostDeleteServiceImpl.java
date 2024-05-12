package com.ss.android.ugc.aweme.nows.feed.viewmodel;

import X.C185117Oh;
import X.C194837kl;
import X.C194927ku;
import X.C195047l6;
import X.C195057l7;
import X.C47261Igj;
import X.C48841JEv;
import X.C57362MfG;
import X.C57700Mki;
import X.C64962gm;
import X.C72085SQv;
import X.C78613UtF;
import X.EnumC199997t5;
import X.EnumC57365MfJ;
import X.EnumC57366MfK;
import X.HG3;
import X.RBX;
import X.XKX;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.now.NowPostInfo;
import com.ss.android.ugc.aweme.now.UserNowPost;
import com.ss.android.ugc.aweme.profile.model.MatchedFriendStruct;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.profile.model.UserNowPackStruct;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes4.dex */
public final class NowPostDeleteServiceImpl implements INowDeleteService {
    public static final /* synthetic */ int LIZIZ = 0;
    public final C64962gm LIZ = C48841JEv.LIZ(C78613UtF.LIZJ);

    @Override // com.ss.android.ugc.aweme.nows.feed.viewmodel.INowDeleteService
    public final void LIZ(String str) {
        XKX.LIZLLL(this.LIZ, null, null, new C194927ku(str, this, null), 3);
    }

    @Override // com.ss.android.ugc.aweme.nows.feed.viewmodel.INowDeleteService
    public final void LIZJ(Aweme aweme) {
        Integer totalCount;
        o.LJIIIZ(aweme, "aweme");
        UserNowPost userNowPost = aweme.userNowPost;
        if (userNowPost != null && (totalCount = userNowPost.getTotalCount()) != null && totalCount.intValue() > 0) {
            return;
        }
        String authorUid = aweme.getAuthorUid();
        o.LJIIIIZZ(authorUid, "aweme.authorUid");
        LIZLLL(authorUid);
    }

    @Override // com.ss.android.ugc.aweme.nows.feed.viewmodel.INowDeleteService
    public final void LIZLLL(String str) {
        if (str.length() == 0) {
            return;
        }
        C185117Oh.LIZJ.LIZ(new C195057l7(str));
        if (!o.LJ(str, ((RBX) HG3.LJIILL()).getCurUserId())) {
            return;
        }
        User user = new User();
        user.setUid(str);
        user.setUserNowPackStruct(new UserNowPackStruct(0, null, 2, null));
        List LJJIJ = C47261Igj.LJJIJ(user);
        C195047l6 mapUser = C195047l6.LJLIL;
        o.LJIIIZ(mapUser, "mapUser");
        C72085SQv.LJ(new C194837kl(LJJIJ, mapUser, false));
    }

    @Override // com.ss.android.ugc.aweme.nows.feed.viewmodel.INowDeleteService
    public final void LIZIZ(Aweme aweme, String str) {
        String str2;
        MatchedFriendStruct matchedFriendStruct;
        String str3;
        String nowMediaType;
        o.LJIIIZ(aweme, "aweme");
        if (aweme.getAuthor() == null) {
            return;
        }
        String authorUid = aweme.getAuthorUid();
        o.LJIIIIZZ(authorUid, "aweme.authorUid");
        LIZLLL(authorUid);
        C57362MfG c57362MfG = new C57362MfG();
        c57362MfG.LJJLIIIIJ = EnumC57365MfJ.DISLIKE;
        c57362MfG.LJJIIZI("homepage_now");
        c57362MfG.LJJLIIIJ = EnumC199997t5.SINGLE;
        c57362MfG.LJJLI = EnumC57366MfK.ITEM;
        c57362MfG.LJJJJI();
        c57362MfG.LJJIIZ(aweme);
        c57362MfG.LJJJJIZL(aweme.getAuthor());
        User author = aweme.getAuthor();
        if (author == null || (str2 = author.getFriendTypeStr()) == null) {
            User author2 = aweme.getAuthor();
            if (author2 != null && (matchedFriendStruct = author2.getMatchedFriendStruct()) != null) {
                str2 = matchedFriendStruct.getRelationType();
            } else {
                str2 = null;
            }
        }
        String str4 = "";
        if (str2 == null) {
            str2 = "";
        }
        c57362MfG.LJJLIIIJLLLLLLLZ = str2;
        User author3 = aweme.getAuthor();
        if (author3 != null) {
            str3 = author3.getAccurateRecType();
        } else {
            str3 = null;
        }
        c57362MfG.LJJJIL(str3);
        NowPostInfo nowPostInfo = aweme.nowPostInfo;
        if (nowPostInfo != null && (nowMediaType = nowPostInfo.getNowMediaType()) != null) {
            str4 = nowMediaType;
        }
        c57362MfG.LJLJJI = str4;
        c57362MfG.LJJJ(str);
        c57362MfG.LJIILIIL();
        XKX.LIZLLL(this.LIZ, null, null, new C57700Mki(aweme, null), 3);
    }
}
