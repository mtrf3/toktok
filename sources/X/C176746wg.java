package X;

import android.content.Context;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.zhiliaoapp.musically.R;

/* renamed from: X.6wg, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C176746wg {
    public static final /* synthetic */ int LIZ = 0;

    public static final int LIZ() {
        int i;
        C62822Ol8 c62822Ol8 = C176756wh.LIZ;
        if (((Number) c62822Ol8.getValue()).intValue() != 0) {
            int dimension = ((int) ((EF7.LIZIZ().getResources().getDimension(R.dimen.gq) / C7MY.LIZIZ(80)) + 0.5d)) + 1;
            i = ((Number) c62822Ol8.getValue()).intValue();
            if (i < dimension) {
                i = dimension;
            }
        } else {
            i = 20;
        }
        C71Y.LIZLLL("CommentViewPreloadV2", "getFirstRefreshCommentCount " + i);
        return i;
    }

    public static void LIZIZ(C174366sq c174366sq, Aweme aweme, Context context) {
        if (context == null || aweme == null) {
            return;
        }
        int commentCount = (int) c174366sq.getCommentCount();
        if (commentCount > 5) {
            commentCount = 5;
        }
        int commentCount2 = (int) c174366sq.getCommentCount();
        if (commentCount2 > 1) {
            commentCount2 = 1;
        }
        int commentCount3 = (int) c174366sq.getCommentCount();
        if (commentCount3 > 3) {
            commentCount3 = 3;
        }
        for (int i = 0; i < commentCount; i++) {
            C16970lZ.LJ(R.layout.q4, context);
        }
        if (0 < commentCount2) {
            C16970lZ.LJ(R.layout.q6, context);
        }
        for (int i2 = 0; i2 < commentCount3; i2++) {
            C16970lZ.LJ(R.layout.q7, context);
        }
    }
}
