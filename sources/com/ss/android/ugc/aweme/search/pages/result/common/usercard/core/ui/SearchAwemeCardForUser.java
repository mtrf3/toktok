package com.ss.android.ugc.aweme.search.pages.result.common.usercard.core.ui;

import X.C221108m2;
import X.C47261Igj;
import X.C50420Jqa;
import X.C50452Jr6;
import X.C62822Ol8;
import X.C79146V4k;
import X.JN8;
import X.JNB;
import X.JT6;
import X.JT7;
import X.JTI;
import X.ORZ;
import android.text.TextUtils;
import com.ss.android.ugc.aweme.discover.model.SearchUser;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.live.LiveRoomStruct;
import com.ss.android.ugc.aweme.feed.model.live.TopFrameSummary;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.search.common.model.ContinuousLoadingAwemeList;
import com.ss.android.ugc.aweme.search.ecom.data.Product;
import com.ss.android.ugc.aweme.search.ecom.data.ProductGroup;
import com.ss.android.ugc.aweme.search.pages.result.common.searchvideo.core.ui.SearchAwemeCardViewHolder;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AqS158S0100000_8;
import kotlin.jvm.internal.AqS171S0200000_8;
import kotlin.jvm.internal.AqS190S0100000_8;
import kotlin.jvm.internal.o;

/* loaded from: classes9.dex */
public final class SearchAwemeCardForUser extends SearchAwemeCardViewHolder implements JT7 {
    public SearchUser LJLLILLLL;
    public String LJLLJ;
    public final C62822Ol8 LJLLL;

    @Override // com.ss.android.ugc.aweme.search.pages.result.common.searchvideo.core.ui.SearchAwemeCardViewHolder
    public final int LJIILIIL() {
        return 65458;
    }

    @Override // com.ss.android.ugc.aweme.search.pages.result.common.searchvideo.core.ui.SearchAwemeCardViewHolder
    public final String LJIILLIIL() {
        return "video";
    }

    @Override // com.ss.android.ugc.aweme.search.pages.result.common.searchvideo.core.ui.SearchAwemeCardViewHolder
    public final String LJIJI() {
        return "hot_user";
    }

    @Override // com.ss.android.ugc.aweme.search.pages.result.common.searchvideo.core.ui.SearchAwemeCardViewHolder
    public final int LJIILJJIL() {
        ProductGroup productGroup;
        List<Product> list;
        SearchUser searchUser = this.LJLLILLLL;
        if (searchUser == null || (productGroup = searchUser.productGroup) == null || (list = productGroup.productList) == null || !(!list.isEmpty())) {
            return 0;
        }
        return 1;
    }

    @Override // com.ss.android.ugc.aweme.search.pages.result.common.searchvideo.core.ui.SearchAwemeCardViewHolder
    public final String LJIJ() {
        String str;
        User user;
        SearchUser searchUser = this.LJLLILLLL;
        if (searchUser != null && (user = searchUser.user) != null) {
            str = user.getUid();
        } else {
            str = null;
        }
        return String.valueOf(str);
    }

    @Override // X.JT7
    public final List<Aweme> getAwemeList() {
        List<Aweme> list;
        SearchUser searchUser = this.LJLLILLLL;
        if (searchUser == null || (list = searchUser.awemeCards) == null) {
            return null;
        }
        if (!C50452Jr6.LIZ()) {
            ArrayList arrayList = new ArrayList();
            for (Aweme aweme : list) {
                if (!aweme.isLive()) {
                    arrayList.add(aweme);
                }
            }
            list = arrayList;
        }
        return ORZ.LLJILJILJ(list);
    }

    @Override // X.JT7
    public final int LJFF() {
        List<Aweme> list;
        if (C50452Jr6.LIZ()) {
            return 10;
        }
        SearchUser searchUser = this.LJLLILLLL;
        int i = 0;
        if (searchUser != null && (list = searchUser.awemeCards) != null && !list.isEmpty()) {
            Iterator<Aweme> it = list.iterator();
            while (it.hasNext()) {
                if (it.next().isLive() && (i = i + 1) < 0) {
                    C47261Igj.LJJJJIZL();
                    throw null;
                }
            }
        }
        return 10 - i;
    }

    @Override // X.JT7
    public final List<Aweme> LJI() {
        SearchUser searchUser;
        List<Aweme> list;
        if (C50452Jr6.LIZ() || (searchUser = this.LJLLILLLL) == null || (list = searchUser.awemeCards) == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (Aweme aweme : list) {
            if (aweme.isLive()) {
                arrayList.add(aweme);
            }
        }
        return ORZ.LLJILJILJ(arrayList);
    }

    @Override // X.JT7
    public final Object LJJIII() {
        return this.LJLLILLLL;
    }

    public SearchAwemeCardForUser(JTI jti) {
        super(jti);
        this.LJLLJ = "";
        this.LJLLL = C221108m2.LIZIZ(new AqS158S0100000_8(this, 265));
    }

    @Override // X.JT7
    public final boolean LIZ(Aweme awemeScrollTo) {
        o.LJIIIZ(awemeScrollTo, "awemeScrollTo");
        List<Aweme> awemeList = getAwemeList();
        if (awemeList != null) {
            Iterator<Aweme> it = awemeList.iterator();
            while (it.hasNext()) {
                if (TextUtils.equals(it.next().getAid(), awemeScrollTo.getAid())) {
                    return true;
                }
            }
            return false;
        }
        return false;
    }

    @Override // com.ss.android.ugc.aweme.search.pages.result.common.searchvideo.core.ui.SearchAwemeCardViewHolder
    public final void LJJII(Aweme awemeScrollTo) {
        List<Aweme> list;
        List LIZLLL;
        o.LJIIIZ(awemeScrollTo, "awemeScrollTo");
        JT6 jt6 = (JT6) this.LJLLL.getValue();
        if (jt6 != null) {
            AqS190S0100000_8 aqS190S0100000_8 = new AqS190S0100000_8(this, 37);
            ContinuousLoadingAwemeList LIZJ = jt6.LIZJ();
            if (LIZJ != null && (list = LIZJ.awemeList) != null) {
                if (jt6.LIZ.LIZ(awemeScrollTo)) {
                    LIZLLL = null;
                } else {
                    LIZLLL = jt6.LIZLLL(awemeScrollTo, list);
                }
                aqS190S0100000_8.invoke(awemeScrollTo, LIZLLL);
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.search.pages.result.common.searchvideo.core.ui.SearchAwemeCardViewHolder
    public final JN8 LJJ(Aweme aweme, Integer num) {
        String str;
        String str2;
        String str3;
        TopFrameSummary topFrameSummary;
        String num2;
        User user;
        User user2;
        JN8 LJJ = super.LJJ(aweme, num);
        SearchUser searchUser = this.LJLLILLLL;
        String str4 = null;
        if (searchUser != null && (user2 = searchUser.user) != null) {
            str = user2.getUniqueId();
        } else {
            str = null;
        }
        LJJ.LJIIZILJ("user_name", String.valueOf(str));
        SearchUser searchUser2 = this.LJLLILLLL;
        if (searchUser2 != null && (user = searchUser2.user) != null) {
            str2 = C79146V4k.LJJIJIL(user);
        } else {
            str2 = null;
        }
        LJJ.LJIJ("user_tag", str2);
        LJJ.LJIIZILJ("user_list", this.LJLILLLLZI.LJIIZILJ);
        if (aweme != null && aweme.isLive() && C50452Jr6.LIZ()) {
            User author = aweme.getAuthor();
            if (author != null) {
                str3 = author.getRoomTitle();
            } else {
                str3 = null;
            }
            LJJ.LIZLLL("aladdin_words", str3);
            LiveRoomStruct newLiveRoomData = aweme.getNewLiveRoomData();
            if (newLiveRoomData != null) {
                str4 = Integer.valueOf(newLiveRoomData.user_count).toString();
            }
            String str5 = "";
            if (str4 == null) {
                str4 = "";
            }
            LiveRoomStruct newLiveRoomData2 = aweme.getNewLiveRoomData();
            if (newLiveRoomData2 != null && (topFrameSummary = newLiveRoomData2.topFrameSummary) != null && topFrameSummary.getId() != 0) {
                LiveRoomStruct newLiveRoomData3 = aweme.getNewLiveRoomData();
                if (newLiveRoomData3 != null && (num2 = Integer.valueOf(newLiveRoomData3.total_user).toString()) != null) {
                    str5 = num2;
                }
                str4 = str5;
            }
            LJJ.LJIIZILJ("realtime_watch_user", str4);
        }
        return LJJ;
    }

    @Override // com.ss.android.ugc.aweme.search.pages.result.common.searchvideo.core.ui.SearchAwemeCardViewHolder
    public final void LJJI(C50420Jqa event, Aweme aweme) {
        o.LJIIIZ(event, "event");
        JT6 jt6 = (JT6) this.LJLLL.getValue();
        if (jt6 != null) {
            jt6.LJFF(event, aweme, new AqS171S0200000_8(this, event, 2));
        } else {
            super.LJJI(event, aweme);
        }
    }

    public static final /* synthetic */ void LJJIIJ(SearchAwemeCardForUser searchAwemeCardForUser, C50420Jqa c50420Jqa, Aweme aweme) {
        super.LJJI(c50420Jqa, aweme);
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0097, code lost:
    
        if (r1 == true) goto L58;
     */
    @Override // com.ss.android.ugc.aweme.search.pages.result.common.searchvideo.core.ui.SearchAwemeCardViewHolder
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJIJJ(com.ss.android.ugc.aweme.feed.model.Aweme r9, android.view.View r10, java.util.List<? extends com.ss.android.ugc.aweme.feed.model.Aweme> r11) {
        /*
            r8 = this;
            java.lang.String r0 = "aweme"
            kotlin.jvm.internal.o.LJIIIZ(r9, r0)
            java.lang.String r0 = "view"
            kotlin.jvm.internal.o.LJIIIZ(r10, r0)
            java.lang.String r0 = "awemeList"
            kotlin.jvm.internal.o.LJIIIZ(r11, r0)
            X.Ol8 r0 = r8.LJLLL
            java.lang.Object r4 = r0.getValue()
            X.JT6 r4 = (X.JT6) r4
            if (r4 == 0) goto La3
            X.JQA r7 = X.JY2.LIZ(r10)
            java.lang.String r1 = r8.LJIJ()
            int r0 = r7.LJIIL
            r6 = 0
            X.C49503Jbn.LIZ(r10, r1, r0, r6)
            android.os.Bundle r5 = r8.LJIIL(r10, r9)
            java.lang.String r1 = "relation_enter_from"
            java.lang.String r0 = "general_search"
            r5.putString(r1, r0)
            java.lang.String r1 = "rfevent_previous_page"
            java.lang.String r0 = r8.LJLLJ
            r5.putString(r1, r0)
            com.ss.android.ugc.aweme.discover.model.SearchUser r0 = r8.LJLLILLLL
            if (r0 == 0) goto L4d
            com.ss.android.ugc.aweme.profile.model.User r0 = r0.user
            if (r0 == 0) goto L4d
            com.ss.android.ugc.aweme.profile.model.MatchedFriendStruct r0 = r0.getMatchedFriendStruct()
            if (r0 == 0) goto L4d
            java.lang.String r1 = r0.getRecType()
            if (r1 != 0) goto L59
        L4d:
            com.ss.android.ugc.aweme.discover.model.SearchUser r0 = r8.LJLLILLLL
            if (r0 == 0) goto La1
            com.ss.android.ugc.aweme.profile.model.User r0 = r0.user
            if (r0 == 0) goto La1
            java.lang.String r1 = r0.getRecType()
        L59:
            java.lang.String r0 = "rec_type"
            r5.putString(r0, r1)
            X.MfJ r0 = X.EnumC57365MfJ.FOLLOW
            java.lang.String r1 = r0.getType()
            java.lang.String r0 = "action_type"
            r5.putString(r0, r1)
            android.content.Context r3 = r10.getContext()
            java.lang.String r0 = "view.context"
            kotlin.jvm.internal.o.LJIIIIZZ(r3, r0)
            X.JRz r2 = new X.JRz
            r2.<init>()
            java.lang.String r0 = r7.LJ
            r2.LIZ = r0
            r0 = 4
            r2.LIZIZ = r0
            com.ss.android.ugc.aweme.discover.model.SearchUser r0 = r8.LJLLILLLL
            if (r0 == 0) goto L8a
            com.ss.android.ugc.aweme.profile.model.User r0 = r0.user
            if (r0 == 0) goto L8a
            java.lang.String r6 = r0.getUid()
        L8a:
            r2.LIZJ = r6
            X.JJG r0 = r8.LJIIJJI()
            X.JIw r0 = r0.LJLJJL
            if (r0 == 0) goto L9f
            boolean r1 = r0.LIZIZ
            r0 = 1
            if (r1 != r0) goto L9f
        L99:
            r2.LJI = r0
            r4.LJ(r3, r5, r2, r10)
        L9e:
            return
        L9f:
            r0 = 0
            goto L99
        La1:
            r1 = r6
            goto L59
        La3:
            super.LJIJJ(r9, r10, r11)
            goto L9e
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.search.pages.result.common.usercard.core.ui.SearchAwemeCardForUser.LJIJJ(com.ss.android.ugc.aweme.feed.model.Aweme, android.view.View, java.util.List):void");
    }

    @Override // com.ss.android.ugc.aweme.search.pages.result.common.searchvideo.core.ui.SearchAwemeCardViewHolder
    public final JNB LJIL(Aweme aweme, Integer num, String str) {
        String str2;
        String str3;
        String str4;
        TopFrameSummary topFrameSummary;
        String num2;
        User user;
        User user2;
        JNB LJIL = super.LJIL(aweme, num, str);
        SearchUser searchUser = this.LJLLILLLL;
        String str5 = null;
        if (searchUser != null && (user2 = searchUser.user) != null) {
            str2 = user2.getUniqueId();
        } else {
            str2 = null;
        }
        LJIL.LJIIZILJ("user_name", String.valueOf(str2));
        SearchUser searchUser2 = this.LJLLILLLL;
        if (searchUser2 != null && (user = searchUser2.user) != null) {
            str3 = C79146V4k.LJJIJIL(user);
        } else {
            str3 = null;
        }
        LJIL.LJIJ("user_tag", str3);
        LJIL.LJIIZILJ("user_list", this.LJLILLLLZI.LJIIZILJ);
        LJIL.LJJIIJ(Integer.valueOf(LJIILJJIL()));
        if (aweme != null && aweme.isLive() && C50452Jr6.LIZ()) {
            User author = aweme.getAuthor();
            if (author != null) {
                str4 = author.getRoomTitle();
            } else {
                str4 = null;
            }
            LJIL.LIZLLL("aladdin_words", str4);
            LiveRoomStruct newLiveRoomData = aweme.getNewLiveRoomData();
            if (newLiveRoomData != null) {
                str5 = Integer.valueOf(newLiveRoomData.user_count).toString();
            }
            String str6 = "";
            if (str5 == null) {
                str5 = "";
            }
            LiveRoomStruct newLiveRoomData2 = aweme.getNewLiveRoomData();
            if (newLiveRoomData2 != null && (topFrameSummary = newLiveRoomData2.topFrameSummary) != null && topFrameSummary.getId() != 0) {
                LiveRoomStruct newLiveRoomData3 = aweme.getNewLiveRoomData();
                if (newLiveRoomData3 != null && (num2 = Integer.valueOf(newLiveRoomData3.total_user).toString()) != null) {
                    str6 = num2;
                }
                str5 = str6;
            }
            LJIL.LJIIZILJ("realtime_watch_user", str5);
        }
        return LJIL;
    }
}
