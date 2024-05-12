package X;

import android.content.Context;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.profile.model.User;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class ATU {
    public static ATB LIZ(Fragment fragment, Context context, Aweme aweme, String enterFrom) {
        int i;
        String str;
        boolean z;
        boolean z2;
        o.LJIIIZ(context, "context");
        o.LJIIIZ(enterFrom, "enterFrom");
        C62435Oet c62435Oet = new C62435Oet(aweme, enterFrom, null, null, context, fragment);
        Bundle bundle = c62435Oet.LJLJLJ.extras;
        if (C80S.LJIIIIZZ(aweme)) {
            i = 3;
        } else if (C80S.LIZJ(aweme)) {
            i = 2;
        } else {
            User author = aweme.getAuthor();
            if (author != null && author.isSecret()) {
                i = 1;
            } else {
                i = -1;
            }
        }
        bundle.putInt("share_im_limit_tip_type", i);
        Bundle bundle2 = c62435Oet.LJLJLJ.extras;
        User author2 = aweme.getAuthor();
        if (author2 != null) {
            str = author2.getUniqueId();
        } else {
            str = null;
        }
        bundle2.putString("author_user_name", str);
        Bundle bundle3 = c62435Oet.LJLJLJ.extras;
        if (aweme.getAwemeType() == 0) {
            z = true;
        } else {
            z = false;
        }
        bundle3.putBoolean("is_video_only", z);
        c62435Oet.LJLJLJ.extras.putBoolean("is_ad", aweme.isAd());
        C115674gN.LIZ.getClass();
        boolean LIZIZ = C78966Uyw.LJJIJ().LIZIZ();
        if (AnonymousClass922.LIZ(aweme) || LIZIZ || !((RBX) HG3.LJIILL()).isLogin()) {
            z2 = false;
        } else {
            z2 = true;
        }
        return new ATB(context, new ATE(z2, null, null, null, null, 62), c62435Oet, 0.5f);
    }
}
