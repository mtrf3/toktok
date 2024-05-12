package X;

import android.text.TextUtils;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import kotlin.jvm.internal.o;

/* renamed from: X.N4q, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C58768N4q implements N93 {
    public final /* synthetic */ ViewOnClickListenerC58846N7q LIZ;

    public C58768N4q(ViewOnClickListenerC58846N7q viewOnClickListenerC58846N7q) {
        this.LIZ = viewOnClickListenerC58846N7q;
    }

    @Override // X.N93
    public final void LIZ(long j, String trackUrl, String status) {
        String LIZ;
        o.LJIIIZ(trackUrl, "trackUrl");
        o.LJIIIZ(status, "status");
        C58764N4m LIZIZ = C58766N4o.LIZIZ(j, trackUrl, status);
        LIZIZ.LIZIZ = "track_url";
        LIZIZ.LIZ = "track_ad";
        LIZIZ.LJ.LIZ("track_label", "click");
        Aweme aweme = this.LIZ.LJLILLLLZI;
        if (aweme != null) {
            LIZIZ.LJ(aweme.getAwemeRawAd());
            LIZIZ.LJIIIIZZ();
            Aweme aweme2 = this.LIZ.LJLILLLLZI;
            if (aweme2 != null) {
                C58655N0h LIZLLL = C58704N2e.LIZLLL("track_ad", "track_url", aweme2.getAwemeRawAd());
                LIZLLL.LIZJ("click", "track_label");
                LIZLLL.LIZJ("10", "ad_event_priority");
                LIZLLL.LIZJ("monitor", "ad_event_type");
                LIZLLL.LIZJ(trackUrl, "track_url_list");
                LIZLLL.LIZJ(status, "track_status");
                LIZLLL.LIZJ(Long.valueOf(j), "ts");
                LIZLLL.LIZJ("10", "ad_event_priority");
                LIZ = FLE.LIZ("other");
                if (!TextUtils.isEmpty(LIZ)) {
                    LIZLLL.LIZJ(LIZ, "user_agent");
                }
                LIZLLL.LJII();
                return;
            }
            o.LJIJI("aweme");
            throw null;
        }
        o.LJIJI("aweme");
        throw null;
    }
}
