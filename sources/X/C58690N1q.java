package X;

import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;

/* renamed from: X.N1q, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C58690N1q implements InterfaceC59429NUb {
    public final /* synthetic */ String LIZ = "draw_ad";
    public final /* synthetic */ AwemeRawAd LIZIZ;
    public final /* synthetic */ String LIZJ;
    public final /* synthetic */ String LIZLLL;
    public final /* synthetic */ boolean LJ;

    @Override // X.InterfaceC59429NUb
    public final void LIZ(boolean z) {
        if (z) {
            C58655N0h LIZLLL = C58704N2e.LIZLLL(this.LIZ, "deeplink_success", this.LIZIZ);
            LIZLLL.LIZIZ(this.LIZJ, "app_url");
            LIZLLL.LIZIZ(this.LIZLLL, "enter_from");
            LIZLLL.LJI();
            return;
        }
        C58655N0h LIZLLL2 = C58704N2e.LIZLLL(this.LIZ, "deeplink_failed", this.LIZIZ);
        LIZLLL2.LIZIZ(this.LIZJ, "app_url");
        LIZLLL2.LIZIZ(Integer.valueOf(this.LJ ? 1 : 0), "fail_reason");
        LIZLLL2.LIZIZ(this.LIZLLL, "enter_from");
        LIZLLL2.LJI();
    }

    public C58690N1q(AwemeRawAd awemeRawAd, String str, String str2, boolean z) {
        this.LIZIZ = awemeRawAd;
        this.LIZJ = str;
        this.LIZLLL = str2;
        this.LJ = z;
    }
}
