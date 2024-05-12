package X;

import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.feed.model.AnchorCommonStruct;
import com.ss.android.ugc.aweme.feed.model.AnchorPanelAction;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.profile.model.User;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.8Wi, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C212688Wi {
    public static final /* synthetic */ int LIZ = 0;

    public static AnchorCommonStruct LIZ(Aweme aweme) {
        List<AnchorCommonStruct> anchors;
        List<AnchorPanelAction> actions;
        AnchorCommonStruct anchorCommonStruct = null;
        if (aweme == null || (anchors = aweme.getAnchors()) == null) {
            return null;
        }
        Iterator<AnchorCommonStruct> it = anchors.iterator();
        loop0: while (true) {
            if (!it.hasNext()) {
                break;
            }
            AnchorCommonStruct next = it.next();
            AnchorCommonStruct anchorCommonStruct2 = next;
            if (anchorCommonStruct2.getType() == 28 && (actions = anchorCommonStruct2.getActions()) != null && !actions.isEmpty()) {
                Iterator<AnchorPanelAction> it2 = actions.iterator();
                while (it2.hasNext()) {
                    if (it2.next().getActionType() == 1) {
                        anchorCommonStruct = next;
                        break loop0;
                    }
                }
            }
        }
        return anchorCommonStruct;
    }

    public static String LIZIZ(Aweme aweme) {
        AnchorCommonStruct LIZ2;
        UrlModel thumbnail;
        List<String> urlList;
        if (aweme != null && (LIZ2 = LIZ(aweme)) != null && (thumbnail = LIZ2.getThumbnail()) != null && (urlList = thumbnail.getUrlList()) != null) {
            return (String) ORZ.LJLLLL(urlList);
        }
        return null;
    }

    public static String LIZJ(Aweme aweme) {
        AnchorCommonStruct LIZ2;
        if (aweme != null && (LIZ2 = LIZ(aweme)) != null) {
            return LIZ2.getId();
        }
        return null;
    }

    public static boolean LIZLLL(Aweme aweme) {
        User author;
        if (aweme == null) {
            return false;
        }
        User author2 = aweme.getAuthor();
        if ((author2 == null || author2.getFriendsStatus() != 1) && ((author = aweme.getAuthor()) == null || author.getFollowStatus() != 2)) {
            return false;
        }
        return true;
    }

    public static void LJ(Aweme aweme, String str) {
        String str2;
        OSZ[] oszArr = new OSZ[4];
        oszArr[0] = new OSZ("enter_from", str);
        oszArr[1] = new OSZ("prop_id", LIZJ(aweme));
        String str3 = null;
        if (aweme != null) {
            str2 = aweme.getAuthorUid();
        } else {
            str2 = null;
        }
        oszArr[2] = new OSZ("from_user_id", str2);
        if (aweme != null) {
            str3 = aweme.getAid();
        }
        oszArr[3] = new OSZ("group_id", str3);
        FMX.LJIIL("effect_prompt_guide_show", C113554cx.LJJL(oszArr));
    }
}
