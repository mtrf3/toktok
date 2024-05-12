package X;

import android.content.Context;
import android.content.res.Resources;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.profile.model.User;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.2z9, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C76352z9 {
    public static final /* synthetic */ int LIZ = 0;

    public static void LIZ(VPK a11yUtils, Context context, Aweme aweme) {
        User author;
        int i;
        o.LJIIIZ(a11yUtils, "a11yUtils");
        if (context == null || aweme == null || (author = aweme.getAuthor()) == null) {
            return;
        }
        String nickname = author.getNickname();
        if (!aweme.isPhotoMode() || !C8SG.LIZIZ.LJJIFFI()) {
            return;
        }
        Resources resources = context.getResources();
        if (aweme.getImageInfos() != null) {
            i = aweme.getImageInfos().size();
        } else {
            i = 3;
        }
        String quantityString = resources.getQuantityString(R.plurals.y, i, nickname);
        o.LJIIIIZZ(quantityString, "context.resources.getQua…3, creator,\n            )");
        VPK.LIZ(context, quantityString, 100L, true);
    }
}
