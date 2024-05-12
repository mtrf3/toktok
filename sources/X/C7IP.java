package X;

import com.ss.android.ugc.aweme.feed.model.upvote.UpvoteStruct;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.7IP, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C7IP {
    public static boolean LIZ(List upvoteList) {
        o.LJIIIZ(upvoteList, "upvoteList");
        if (!upvoteList.isEmpty()) {
            Iterator it = upvoteList.iterator();
            while (it.hasNext()) {
                if (AV1.LJIJ(((UpvoteStruct) it.next()).getUser())) {
                    return true;
                }
            }
        }
        return false;
    }
}
