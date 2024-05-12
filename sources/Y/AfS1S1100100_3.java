package Y;

import X.C7H0;
import X.C7H1;
import X.C7H2;
import X.InterfaceC64592gB;
import X.OSZ;
import com.ss.android.ugc.aweme.comment.viewmodel.CommentListViewModel;
import com.ss.android.ugc.aweme.feed.model.upvote.UpvoteList;
import com.ss.android.ugc.aweme.upvote.model.UpvoteListResponse;

/* loaded from: classes4.dex */
public class AfS1S1100100_3 implements InterfaceC64592gB {
    public final int $t;
    public long j2;
    public Object l1;
    public String s0;

    @Override // X.InterfaceC64592gB
    public final void accept(Object obj) {
        switch (this.$t) {
            case 0:
                accept$0(this, obj);
                return;
            case 1:
                accept$1(this, obj);
                return;
            case 2:
                accept$2(this, obj);
                return;
            default:
                return;
        }
    }

    public static final void accept$0(AfS1S1100100_3 afS1S1100100_3, Object obj) {
        if (afS1S1100100_3.j2 == 0) {
            ((CommentListViewModel) afS1S1100100_3.l1).jv0(new OSZ(afS1S1100100_3.s0, obj), "REFRESH_COMMENT_LIST_SUCCESS");
        } else {
            ((CommentListViewModel) afS1S1100100_3.l1).jv0(new OSZ(afS1S1100100_3.s0, obj), "LOAD_MORE_COMMENT_LIST_SUCCESS");
        }
    }

    public static final void accept$1(AfS1S1100100_3 afS1S1100100_3, Object obj) {
        if (afS1S1100100_3.j2 == 0) {
            ((CommentListViewModel) afS1S1100100_3.l1).jv0(afS1S1100100_3.s0, "REFRESH_COMMENT_LIST_FAIL");
        } else {
            ((CommentListViewModel) afS1S1100100_3.l1).jv0(afS1S1100100_3.s0, "LOAD_MORE_COMMENT_LIST_FAIL");
        }
    }

    public static final void accept$2(AfS1S1100100_3 afS1S1100100_3, Object obj) {
        boolean z;
        UpvoteList upvoteList;
        UpvoteListResponse upvoteListResponse = (UpvoteListResponse) obj;
        if (afS1S1100100_3.j2 == 0) {
            z = true;
        } else {
            z = false;
        }
        C7H1.LJIIIIZZ(afS1S1100100_3.s0, upvoteListResponse.upvoteList, z, 20);
        if (z) {
            upvoteList = C7H2.LIZ(afS1S1100100_3.s0);
            if (upvoteList == null) {
                upvoteList = upvoteListResponse.upvoteList;
            }
        } else {
            upvoteList = upvoteListResponse.upvoteList;
        }
        C7H0 c7h0 = (C7H0) afS1S1100100_3.l1;
        if (c7h0 != null) {
            c7h0.LIZIZ(upvoteList);
        }
    }

    public AfS1S1100100_3(long j, Object obj, String str, int i) {
        this.$t = i;
        this.j2 = j;
        this.l1 = obj;
        this.s0 = str;
    }
}
