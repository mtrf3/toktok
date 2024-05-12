package X;

import Y.ACallableS58S0300000_9;
import android.content.Context;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.ss.android.ugc.aweme.profile.model.FollowStatus;
import java.util.Arrays;
import kotlin.jvm.internal.o;

/* renamed from: X.Me0, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C57284Me0 extends C8BS<FollowStatus> {
    public final /* synthetic */ C57283Mdz LJLIL;

    public C57284Me0(C57283Mdz c57283Mdz) {
        this.LJLIL = c57283Mdz;
    }

    @Override // X.C8BS
    public final boolean checkParams(Object... params) {
        o.LJIIIZ(params, "params");
        if (params.length == 14) {
            return true;
        }
        return false;
    }

    @Override // X.C8BS
    public final boolean sendRequest(Object... params) {
        o.LJIIIZ(params, "params");
        if (!super.sendRequest(Arrays.copyOf(params, params.length))) {
            return false;
        }
        C57283Mdz c57283Mdz = this.LJLIL;
        Object obj = params[0];
        o.LJII(obj, "null cannot be cast to non-null type kotlin.String");
        c57283Mdz.LJLJLLL = (String) obj;
        FGR.LIZIZ().LIZ(this.mHandler, new ACallableS58S0300000_9(params, this.LJLIL, this, 2), 0);
        return true;
    }

    public static void LJIIIZ(Integer num, Aweme aweme, String str, FollowStatus followStatus) {
        if (str == null || num == null) {
            return;
        }
        int i = 1;
        if (num.intValue() != 1) {
            return;
        }
        int i2 = 0;
        if (aweme == null || !C63081OpJ.LJLJL(aweme)) {
            return;
        }
        AwemeRawAd awemeRawAd = null;
        if (o.LJ(str, "feed")) {
            OJY LJIL = C73340SqO.LJIL();
            Context LIZIZ = EF7.LIZIZ();
            LJIL.getClass();
            NN1.LJJIIJZLJL(LIZIZ, aweme, followStatus);
            if (aweme != null) {
                awemeRawAd = aweme.getAwemeRawAd();
            }
            C58655N0h LIZLLL = C58704N2e.LIZLLL("draw_ad", "follow", awemeRawAd);
            if (followStatus != null && followStatus.isCheating()) {
                i2 = 1;
            }
            LIZLLL.LIZIZ(Integer.valueOf(i2), "is_cheated_follow");
            if (followStatus != null) {
                i = followStatus.followStatus;
            }
            LIZLLL.LIZIZ(Integer.valueOf(i), "follow_status");
            LIZLLL.LJII();
            return;
        }
        if (!o.LJ(str, "homepage")) {
            return;
        }
        OJY LJIL2 = C73340SqO.LJIL();
        Context LIZIZ2 = EF7.LIZIZ();
        LJIL2.getClass();
        OJY.LJIIIZ(LIZIZ2, aweme, followStatus);
        if (aweme != null) {
            awemeRawAd = aweme.getAwemeRawAd();
        }
        C58655N0h LIZLLL2 = C58704N2e.LIZLLL("homepage_ad", "follow", awemeRawAd);
        if (followStatus != null && followStatus.isCheating()) {
            i2 = 1;
        }
        LIZLLL2.LIZIZ(Integer.valueOf(i2), "is_cheated_follow");
        if (followStatus != null) {
            i = followStatus.followStatus;
        }
        LIZLLL2.LIZIZ(Integer.valueOf(i), "follow_status");
        LIZLLL2.LJII();
    }
}
