package X;

import android.view.View;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.following.ui.assem.RelationSearchCell;
import com.ss.android.ugc.aweme.profile.model.MatchedFriendStruct;
import com.ss.android.ugc.aweme.profile.model.User;
import kotlin.jvm.internal.o;

/* renamed from: X.MmP, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C57805MmP implements InterfaceC19530ph {
    public final /* synthetic */ RelationSearchCell<ITEM> LIZ;

    public C57805MmP(RelationSearchCell<ITEM> relationSearchCell) {
        this.LIZ = relationSearchCell;
    }

    @Override // X.InterfaceC19530ph
    public final void LIZ(View view, String itemID) {
        int i;
        String str;
        String str2;
        o.LJIIIZ(itemID, "itemID");
        C57807MmR c57807MmR = (C57807MmR) this.LIZ.getItem();
        User user = null;
        if (c57807MmR != null) {
            user = c57807MmR.LJLIL;
        }
        C57807MmR c57807MmR2 = (C57807MmR) this.LIZ.getItem();
        if (c57807MmR2 != null) {
            i = c57807MmR2.LJLILLLLZI;
        } else {
            i = 0;
        }
        if (user != null) {
            RelationSearchCell<ITEM> relationSearchCell = this.LIZ;
            String enterFrom = relationSearchCell.getEnterFrom();
            C188727au LIZLLL = KNV.LIZLLL(enterFrom, "enterFrom");
            LIZLLL.LJIIIZ("enter_from", enterFrom);
            LIZLLL.LJIIIZ("to_user_id", user.getUid());
            int followStatus = user.getFollowStatus();
            if (followStatus != 1) {
                if (followStatus != 2) {
                    str = "";
                } else {
                    str = "mutual";
                }
            } else {
                str = "single";
            }
            LIZLLL.LJIIIZ("follow_status", str);
            LIZLLL.LJIIIZ("rank", String.valueOf(i));
            MatchedFriendStruct matchedFriendStruct = user.getMatchedFriendStruct();
            if (matchedFriendStruct != null && matchedFriendStruct.getRecType() != null) {
                str2 = "1";
            } else {
                str2 = CardStruct.IStatusCode.DEFAULT;
            }
            LIZLLL.LJIIIZ("has_label", str2);
            FMX.LJIIL("fans_following_page_search_result_show", LIZLLL.LIZ);
            relationSearchCell.L(EnumC57365MfJ.SHOW, user);
        }
    }
}
