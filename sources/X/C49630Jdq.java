package X;

import android.content.Context;
import com.ss.android.ugc.aweme.im.sdk.common.controller.providedservices.IMService;
import com.ss.android.ugc.aweme.im.service.model.IMUser;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.search.pages.result.common.usercard.core.ui.SearchUserViewHolder;
import kotlin.jvm.internal.o;

/* renamed from: X.Jdq, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C49630Jdq implements InterfaceC51703KQx {
    public final /* synthetic */ SearchUserViewHolder LIZ;

    public C49630Jdq(SearchUserViewHolder searchUserViewHolder) {
        this.LIZ = searchUserViewHolder;
    }

    @Override // X.InterfaceC51703KQx
    public final boolean LIZ() {
        String str;
        SearchUserViewHolder searchUserViewHolder = this.LIZ;
        User user = searchUserViewHolder.LLFF;
        if (user == null) {
            return false;
        }
        searchUserViewHolder.i0(C49420JaS.LIZ(user), null);
        if (user.getFollowStatus() == 1) {
            str = "follow_cancel";
        } else {
            str = "follow";
        }
        C225318sp.LJ(user, str, this.LIZ.getEnterFrom(), this.LIZ.a0(), null, null, null);
        Context context = this.LIZ.getContext();
        String enterFrom = this.LIZ.getEnterFrom();
        SearchUserViewHolder searchUserViewHolder2 = this.LIZ;
        User user2 = searchUserViewHolder2.LLFF;
        C239319aJ c239319aJ = searchUserViewHolder2.LJLLI;
        if (c239319aJ != null) {
            boolean shouldShowMessageText = c239319aJ.getShouldShowMessageText();
            String str2 = this.LIZ.LJLJL().LJII;
            String g0 = this.LIZ.g0();
            String str3 = this.LIZ.LJLJL().LIZJ;
            HH1.LIZ(str2, "searchId", g0, "searchResultId", str3, "searchType");
            if (user2 == null || !shouldShowMessageText || user2.getFollowStatus() != 2) {
                return false;
            }
            IMUser fromUser = IMUser.fromUser(user2);
            if (fromUser != null) {
                InterfaceC98813uH imChatService = IMService.createIIMServicebyMonsterPlugin(false).getImChatService();
                C98593tv c98593tv = new C98593tv(context, fromUser);
                c98593tv.setEnterFromForMob(enterFrom);
                c98593tv.setEnterMethodForMob("button");
                c98593tv.setSearchId(str2);
                c98593tv.setSearchResultId(g0);
                c98593tv.setSearchType(str3);
                c98593tv.setSearchScene(1);
                imChatService.LJFF(c98593tv);
            }
            return true;
        }
        o.LJIJI("followButton");
        throw null;
    }
}
