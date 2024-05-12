package X;

import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import kotlin.jvm.internal.o;

/* renamed from: X.N4r, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C58769N4r implements N93 {
    public final /* synthetic */ String LIZ;
    public final /* synthetic */ AwemeRawAd LIZIZ;

    public C58769N4r(AwemeRawAd awemeRawAd, String str) {
        this.LIZ = str;
        this.LIZIZ = awemeRawAd;
    }

    @Override // X.N93
    public final void LIZ(long j, String trackUrl, String status) {
        o.LJIIIZ(trackUrl, "trackUrl");
        o.LJIIIZ(status, "status");
        String str = this.LIZ;
        AwemeRawAd awemeRawAd = this.LIZIZ;
        if (str == null) {
            return;
        }
        C58764N4m LIZIZ = C58766N4o.LIZIZ(j, trackUrl, status);
        LIZIZ.LJFF = "track_url";
        LIZIZ.LIZ = "track_ad";
        LIZIZ.LJ.LIZ("track_label", str);
        LIZIZ.LJ(awemeRawAd);
        LIZIZ.LJIIIZ();
    }
}
