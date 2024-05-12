package X;

import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;

/* renamed from: X.N4s, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C58770N4s implements N96 {
    public final /* synthetic */ AwemeRawAd LIZ;
    public final /* synthetic */ String LIZIZ;
    public final /* synthetic */ long LIZJ;

    public C58770N4s(String str, long j, AwemeRawAd awemeRawAd) {
        this.LIZ = awemeRawAd;
        this.LIZIZ = str;
        this.LIZJ = j;
    }

    @Override // X.N96
    public final void LIZ(int i, Exception exc, boolean z) {
        String str;
        if (!z) {
            C58764N4m LIZ = C58766N4o.LIZ();
            LIZ.LJ(this.LIZ);
            LIZ.LIZ = "draw_ad";
            LIZ.LIZIZ = "load_failed";
            OSZ[] oszArr = new OSZ[3];
            oszArr[0] = new OSZ("error_message", "vast_click_tracker_bad_response");
            oszArr[1] = new OSZ("error_code", Integer.valueOf(i));
            String str2 = null;
            if (exc != null) {
                str = exc.getMessage();
            } else {
                str = null;
            }
            oszArr[2] = new OSZ("error_detail", str);
            LIZ.LIZ(C113554cx.LJJL(oszArr));
            LIZ.LJIIIIZZ();
            C58655N0h LIZLLL = C58704N2e.LIZLLL("draw_ad", "load_failed", this.LIZ);
            LIZLLL.LIZJ("debug", "ad_event_type");
            LIZLLL.LIZIZ("vast_click_tracker_bad_response", "error_message");
            LIZLLL.LIZIZ(Integer.valueOf(i), "error_code");
            if (exc != null) {
                str2 = exc.getMessage();
            }
            LIZLLL.LIZIZ(str2, "error_detail");
            LIZLLL.LJII();
        }
        String str3 = this.LIZIZ;
        String valueOf = String.valueOf(i);
        long j = this.LIZJ;
        AwemeRawAd awemeRawAd = this.LIZ;
        C58764N4m LIZIZ = C58766N4o.LIZIZ(j, str3, valueOf);
        LIZIZ.LJFF = "track_url";
        LIZIZ.LIZ = "track_ad";
        LIZIZ.LJ.LIZ("track_label", "click");
        LIZIZ.LJ(awemeRawAd);
        LIZIZ.LJIIIZ();
    }
}
