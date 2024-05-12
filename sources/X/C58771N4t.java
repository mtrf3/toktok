package X;

import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;

/* renamed from: X.N4t, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C58771N4t implements N96 {
    public final /* synthetic */ AwemeRawAd LIZ;

    public C58771N4t(AwemeRawAd awemeRawAd) {
        this.LIZ = awemeRawAd;
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
            oszArr[0] = new OSZ("error_message", "vast_clickthru_bad_response");
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
            LIZLLL.LIZIZ("vast_clickthru_bad_response", "error_message");
            LIZLLL.LIZIZ(Integer.valueOf(i), "error_code");
            if (exc != null) {
                str2 = exc.getMessage();
            }
            LIZLLL.LIZIZ(str2, "error_detail");
            LIZLLL.LJII();
        }
    }
}
