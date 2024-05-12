package X;

import android.text.TextUtils;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import kotlin.jvm.internal.o;

/* renamed from: X.N4p, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C58767N4p implements N93 {
    public final /* synthetic */ Aweme LIZ;

    public C58767N4p(Aweme aweme) {
        this.LIZ = aweme;
    }

    @Override // X.N93
    public final void LIZ(long j, String trackUrl, String status) {
        String LIZ;
        o.LJIIIZ(trackUrl, "trackUrl");
        o.LJIIIZ(status, "status");
        C58764N4m LIZIZ = C58766N4o.LIZIZ(j, trackUrl, status);
        LIZIZ.LIZIZ = "track_url";
        LIZIZ.LIZ = "track_ad";
        LIZIZ.LJ.LIZ("track_label", "show");
        LIZIZ.LJ(this.LIZ.getAwemeRawAd());
        LIZIZ.LJIIIIZZ();
        C58655N0h LIZLLL = C58704N2e.LIZLLL("track_ad", "track_url", this.LIZ.getAwemeRawAd());
        LIZLLL.LIZJ("show", "track_label");
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
    }
}
