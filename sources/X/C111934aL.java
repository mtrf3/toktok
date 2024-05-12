package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.upvote.UpvoteList;
import com.ss.android.ugc.aweme.feed.model.upvote.UpvoteStruct;
import com.ss.android.ugc.aweme.profile.model.User;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.4aL, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C111934aL {
    public static final /* synthetic */ int LIZ = 0;

    public static void LIZ(Aweme aweme, String str) {
        List<UpvoteStruct> upvotes;
        String uid;
        String uid2;
        String aid = aweme.getAid();
        o.LJIIIIZZ(aid, "aweme.aid");
        UpvoteList LIZ2 = C7H2.LIZ(aid);
        if (LIZ2 != null && (upvotes = LIZ2.getUpvotes()) != null) {
            ArrayList arrayList = new ArrayList();
            Iterator<UpvoteStruct> it = upvotes.iterator();
            while (it.hasNext()) {
                User user = it.next().getUser();
                if (user != null && (uid2 = user.getUid()) != null) {
                    arrayList.add(uid2);
                }
            }
            String LLD = ORZ.LLD(arrayList, null, null, null, null, 63);
            if (LLD == null || LLD.length() == 0) {
                return;
            }
            OSZ[] oszArr = new OSZ[4];
            oszArr[0] = new OSZ(str, "enter_from");
            String aid2 = aweme.getAid();
            String str2 = "";
            if (aid2 == null) {
                aid2 = "";
            }
            oszArr[1] = new OSZ(aid2, "group_id");
            User author = aweme.getAuthor();
            if (author != null && (uid = author.getUid()) != null) {
                str2 = uid;
            }
            oszArr[2] = new OSZ(str2, "author_id");
            oszArr[3] = new OSZ(LLD, "repost_uid_str");
            FMX.LJIILL("leave_repost_video", oszArr);
        }
    }
}
