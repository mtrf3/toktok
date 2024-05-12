package X;

import android.content.Context;
import android.view.View;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.now.NowPostInfo;
import com.ss.android.ugc.aweme.nows.service.NowsTabServiceImpl;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.service.INowsTabService;
import com.ss.android.ugc.now.interaction.NowFeedMobHierarchyData;

/* renamed from: X.77e, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C1806677e {
    public C71799SFv LIZ;
    public TuxTextView LIZIZ;
    public TuxTextView LIZJ;
    public View LIZLLL;

    public final void LIZ(C1806477c c1806477c, boolean z) {
        ActivityC45651qj activityC45651qj;
        String str;
        String str2;
        String str3;
        NowPostInfo nowPostInfo;
        User author;
        Context context;
        NowFeedMobHierarchyData nowFeedMobHierarchyData = c1806477c.LJLILLLLZI;
        INowsTabService LJJIIJ = NowsTabServiceImpl.LJJIIJ();
        View view = this.LIZLLL;
        String str4 = null;
        if (view != null && (context = view.getContext()) != null) {
            activityC45651qj = C45804HyK.LJJIFFI(context);
        } else {
            activityC45651qj = null;
        }
        int LJIIJ = LJJIIJ.LJIIJ(activityC45651qj, c1806477c.LJLIL, nowFeedMobHierarchyData, EnumC1806777f.CAPTION, null);
        if (nowFeedMobHierarchyData != null) {
            str = nowFeedMobHierarchyData.getEnterFrom();
        } else {
            str = null;
        }
        Aweme aweme = c1806477c.LJLIL;
        if (aweme != null && (author = aweme.getAuthor()) != null) {
            str2 = author.getUid();
        } else {
            str2 = null;
        }
        Aweme aweme2 = c1806477c.LJLIL;
        if (aweme2 != null && (nowPostInfo = aweme2.nowPostInfo) != null) {
            str4 = nowPostInfo.getNowMediaType();
        }
        if (z) {
            str3 = "click_head";
        } else {
            str3 = "click_text";
        }
        C1794072i.LIZ(LJIIJ, 1, str, str2, str4, str3, "caption");
    }
}
