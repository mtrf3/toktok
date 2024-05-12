package X;

import com.ss.android.ugc.aweme.commercialize.model.FollowButtonData;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import kotlin.jvm.internal.o;

/* renamed from: X.8Rq, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C211468Rq {
    public static Integer LIZ(Aweme aweme) {
        boolean z;
        FollowButtonData followButtonData;
        if (aweme == null) {
            return null;
        }
        AwemeRawAd awemeRawAd = aweme.getAwemeRawAd();
        if (awemeRawAd != null && (followButtonData = awemeRawAd.getFollowButtonData()) != null) {
            z = o.LJ(followButtonData.getEnable(), Boolean.TRUE);
        } else {
            z = false;
        }
        if (C188587ag.LJ(aweme)) {
            return EnumC211478Rr.SOCIAL.getValue();
        }
        if (!z) {
            return null;
        }
        return EnumC211478Rr.AD.getValue();
    }
}
