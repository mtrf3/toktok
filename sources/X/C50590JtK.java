package X;

import androidx.lifecycle.LifecycleOwner;
import com.google.gson.m;
import com.ss.android.ugc.aweme.search.model.SearchResultParam;

/* renamed from: X.JtK, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C50590JtK {
    public static final /* synthetic */ int LIZ = 0;

    public static String LIZ(ActivityC45651qj activityC45651qj, SearchResultParam searchResultParam) {
        String str;
        String str2;
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        m mVar = new m();
        String str3 = null;
        boolean z5 = false;
        if (!(activityC45651qj instanceof LifecycleOwner)) {
            str = "";
            str2 = "";
            z = false;
            z2 = false;
            z3 = false;
        } else {
            C50652JuK.Companion.getClass();
            C50650JuI LJII = C50651JuJ.LJII(activityC45651qj);
            if (LJII == null) {
                if (searchResultParam != null) {
                    str = searchResultParam.getGroupId();
                } else {
                    str = null;
                }
                if (str == null) {
                    str = "";
                }
                if (searchResultParam != null && searchResultParam.isFeedLiked()) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (searchResultParam != null && searchResultParam.isFeedCommentClicked()) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (searchResultParam != null && searchResultParam.isFeedForwardClicked()) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (searchResultParam != null && searchResultParam.isFeedCollected()) {
                    z5 = true;
                }
            } else {
                str = LJII.getSearchVideoModel().getGroupId();
                if (str == null) {
                    str = "";
                }
                Boolean isFeedLiked = LJII.getSearchVideoModel().isFeedLiked();
                if (isFeedLiked != null) {
                    z4 = isFeedLiked.booleanValue();
                } else {
                    z4 = false;
                }
                Boolean isFeedCommentClicked = LJII.getSearchVideoModel().isFeedCommentClicked();
                if (isFeedCommentClicked != null) {
                    z2 = isFeedCommentClicked.booleanValue();
                } else {
                    z2 = false;
                }
                Boolean isFeedForwardClicked = LJII.getSearchVideoModel().isFeedForwardClicked();
                if (isFeedForwardClicked != null) {
                    z3 = isFeedForwardClicked.booleanValue();
                } else {
                    z3 = false;
                }
                Boolean isFeedCollected = LJII.getSearchVideoModel().isFeedCollected();
                if (isFeedCollected != null) {
                    z5 = isFeedCollected.booleanValue();
                }
            }
            if (searchResultParam != null) {
                str2 = searchResultParam.getEntrySearchSource(Boolean.TRUE);
            } else {
                str2 = null;
            }
            if (str2 == null) {
                str2 = "";
            }
            z = z5;
            z5 = z4;
        }
        m mVar2 = new m();
        mVar2.LJJIIZ("last_feed_group_id", str);
        mVar2.LJJIII(Boolean.valueOf(z5), "last_feed_like_status");
        mVar2.LJJIII(Boolean.valueOf(z2), "last_feed_click_comment");
        mVar2.LJJIII(Boolean.valueOf(z3), "last_feed_click_forward");
        mVar2.LJJIII(Boolean.valueOf(z), "last_feed_favorite_status");
        mVar2.LJJIIZ("entry_search_source", str2);
        if (searchResultParam != null) {
            str3 = searchResultParam.getIsSarRecall();
        }
        if (C78857UxB.LJJJIL(str3)) {
            mVar2.LJJIIZ("is_sar_recall", "1");
        }
        mVar.LJJII("last_feed_context", mVar2);
        try {
            return mVar.toString();
        } catch (Throwable unused) {
            return "";
        }
    }
}
