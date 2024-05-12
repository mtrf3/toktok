package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;

/* renamed from: X.2hh, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C65532hh {
    public static final void LIZ(C188727au c188727au, Aweme aweme, String str) {
        if (aweme == null) {
            return;
        }
        c188727au.LJIIIZ("enter_from", str);
        c188727au.LJIIIZ("group_id", aweme.getAid());
        c188727au.LJI("user_id", ((RBX) HG3.LJIILL()).getCurUserId());
    }
}
