package X;

import android.view.View;
import com.ss.android.ugc.aweme.bullet.business.AdWebStatBusiness;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import kotlin.jvm.internal.o;

/* renamed from: X.NPc, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C59300NPc implements VN1 {
    public final /* synthetic */ AdWebStatBusiness LIZ;

    public C59300NPc(AdWebStatBusiness adWebStatBusiness) {
        this.LIZ = adWebStatBusiness;
    }

    @Override // X.VN1
    public final void LIZ(long j) {
        this.LIZ.LJII = j;
    }

    @Override // X.VN1
    public final void LIZIZ(int i, View view) {
        String str;
        String str2;
        NP1 np1;
        AdWebStatBusiness adWebStatBusiness = this.LIZ;
        C59299NPb c59299NPb = adWebStatBusiness.LIZIZ;
        String LJFF = adWebStatBusiness.LJFF();
        C59472NVs c59472NVs = this.LIZ.LIZ.LIZIZ;
        if ((c59472NVs instanceof NP1) && (np1 = (NP1) c59472NVs) != null) {
            str = np1.LJII();
        } else {
            str = "";
        }
        AdWebStatBusiness adWebStatBusiness2 = this.LIZ;
        long j = adWebStatBusiness2.LJII;
        int LJII = adWebStatBusiness2.LJII();
        boolean z = c59299NPb.LIZJ;
        String str3 = CardStruct.IStatusCode.DEFAULT;
        if (z || !c59299NPb.LIZLLL || c59299NPb.LJ) {
            str2 = CardStruct.IStatusCode.DEFAULT;
        } else {
            str2 = "1";
        }
        if (c59299NPb.LJ) {
            str3 = "2";
        } else if (c59299NPb.LIZIZ > 0) {
            str3 = str2;
        }
        o.LJI(LJFF);
        C58655N0h LJ = C58704N2e.LJ("ad_wap_stat", "landing_page_blank", LJFF, str, null);
        LJ.LIZIZ(str3, "loading_status");
        int i2 = 1;
        if (c59299NPb.LJIIIZ && c59299NPb.LJIIJ != 1) {
            i2 = 0;
        }
        LJ.LIZIZ(Integer.valueOf(i2), "first_page");
        LJ.LIZIZ(0, "ix_to_externalurl");
        LJ.LIZIZ(Integer.valueOf(i), "is_blank");
        LJ.LIZIZ(Long.valueOf(j), "cost_time");
        LJ.LIZIZ(Integer.valueOf(LJII), "landing_page_style");
        LJ.LJI();
    }
}
