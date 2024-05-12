package X;

import com.ss.android.ugc.aweme.feed.model.AutofillModel;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.feed.model.ad.LandingPageNetworkOptimization;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* renamed from: X.NMc, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C59222NMc implements InterfaceC59138NIw {
    public AwemeRawAd LIZ;
    public String LIZIZ;
    public String LIZJ;
    public String LIZLLL;
    public String LJ;
    public String LJFF;
    public String LJI;
    public boolean LJII;
    public int LJIIIIZZ;
    public String LJIIIZ;
    public String LJIIJ;
    public int LJIIJJI;
    public boolean LJIIL;
    public long LJIILIIL;
    public String LJIILJJIL;
    public String LJIILL;
    public int LJIILLIIL;
    public int LJIIZILJ;
    public String LJIJ;
    public String LJIJI;
    public boolean LJIJJ;
    public boolean LJIJJLI;
    public boolean LJIL;
    public boolean LJJ;
    public boolean LJJI;
    public boolean LJJIFFI;

    public C59222NMc() {
        this(0);
    }

    @Override // X.InterfaceC59138NIw
    public final boolean LJIILIIL() {
        return false;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C59222NMc)) {
            return false;
        }
        C59222NMc c59222NMc = (C59222NMc) obj;
        return o.LJ(this.LIZ, c59222NMc.LIZ) && o.LJ(this.LIZIZ, c59222NMc.LIZIZ) && o.LJ(this.LIZJ, c59222NMc.LIZJ) && o.LJ(this.LIZLLL, c59222NMc.LIZLLL) && o.LJ(this.LJ, c59222NMc.LJ) && o.LJ(this.LJFF, c59222NMc.LJFF) && o.LJ(this.LJI, c59222NMc.LJI) && this.LJII == c59222NMc.LJII && this.LJIIIIZZ == c59222NMc.LJIIIIZZ && o.LJ(this.LJIIIZ, c59222NMc.LJIIIZ) && o.LJ(this.LJIIJ, c59222NMc.LJIIJ) && this.LJIIJJI == c59222NMc.LJIIJJI && this.LJIIL == c59222NMc.LJIIL && this.LJIILIIL == c59222NMc.LJIILIIL && o.LJ(this.LJIILJJIL, c59222NMc.LJIILJJIL) && o.LJ(this.LJIILL, c59222NMc.LJIILL) && this.LJIILLIIL == c59222NMc.LJIILLIIL && this.LJIIZILJ == c59222NMc.LJIIZILJ && o.LJ(this.LJIJ, c59222NMc.LJIJ) && o.LJ(this.LJIJI, c59222NMc.LJIJI) && this.LJIJJ == c59222NMc.LJIJJ && this.LJIJJLI == c59222NMc.LJIJJLI && this.LJIL == c59222NMc.LJIL && this.LJJ == c59222NMc.LJJ && this.LJJI == c59222NMc.LJJI && this.LJJIFFI == c59222NMc.LJJIFFI;
    }

    @Override // X.InterfaceC59138NIw
    public final boolean LIZ() {
        AutofillModel autofillModel;
        AwemeRawAd awemeRawAd = this.LIZ;
        if (awemeRawAd != null && (autofillModel = awemeRawAd.getAutofillModel()) != null) {
            return autofillModel.getEnable();
        }
        return false;
    }

    @Override // X.InterfaceC59138NIw
    public final boolean LIZIZ() {
        if (this.LJIIL && o.LJ(this.LJ, "landing_page")) {
            return true;
        }
        return false;
    }

    @Override // X.InterfaceC59138NIw
    public final String LIZJ() {
        AwemeRawAd awemeRawAd = this.LIZ;
        if (awemeRawAd != null) {
            return awemeRawAd.getChannelName();
        }
        return null;
    }

    @Override // X.InterfaceC59138NIw
    public final String LJ() {
        AwemeRawAd awemeRawAd = this.LIZ;
        if (awemeRawAd == null || awemeRawAd.getSplashInfo() == null) {
            return "feed";
        }
        return "splash";
    }

    @Override // X.InterfaceC59138NIw
    public final long LJFF() {
        Long creativeId;
        AwemeRawAd awemeRawAd = this.LIZ;
        if (awemeRawAd == null || (creativeId = awemeRawAd.getCreativeId()) == null) {
            return 0L;
        }
        return creativeId.longValue();
    }

    @Override // X.InterfaceC59138NIw
    public final int LJIIIZ() {
        LandingPageNetworkOptimization landingPageNetworkOptimization;
        AwemeRawAd awemeRawAd = this.LIZ;
        if (awemeRawAd != null && (landingPageNetworkOptimization = awemeRawAd.getLandingPageNetworkOptimization()) != null) {
            return landingPageNetworkOptimization.getNetworkOptimization();
        }
        return 0;
    }

    @Override // X.InterfaceC59138NIw
    public final int LJIIJ() {
        AwemeRawAd awemeRawAd = this.LIZ;
        if (awemeRawAd != null) {
            return awemeRawAd.getPreloadWeb();
        }
        return 0;
    }

    @Override // X.InterfaceC59138NIw
    public final int LJIIJJI() {
        AwemeRawAd awemeRawAd = this.LIZ;
        if (awemeRawAd != null) {
            return awemeRawAd.getPreloadWebSecondPage();
        }
        return 0;
    }

    @Override // X.InterfaceC59138NIw
    public final String LJIIL() {
        String logExtra;
        AwemeRawAd awemeRawAd = this.LIZ;
        if (awemeRawAd == null || (logExtra = awemeRawAd.getLogExtra()) == null) {
            return "{}";
        }
        return logExtra;
    }

    public final JSONObject LJIILL() {
        int i;
        JSONObject jSONObject = new JSONObject();
        AwemeRawAd awemeRawAd = this.LIZ;
        if (awemeRawAd != null) {
            try {
                jSONObject.put("cid", awemeRawAd.getCreativeIdStr());
                jSONObject.put("ad_type", awemeRawAd.getSystemOrigin());
                jSONObject.put("log_extra", awemeRawAd.getLogExtra());
                jSONObject.put("download_url", awemeRawAd.getDownloadUrl());
                jSONObject.put("package_name", awemeRawAd.getPackageName());
                jSONObject.put("app_name", awemeRawAd.getAppName());
                Long creativeId = awemeRawAd.getCreativeId();
                if (creativeId != null && creativeId.longValue() == 0) {
                    i = 0;
                    jSONObject.put("code", i);
                }
                i = 1;
                jSONObject.put("code", i);
            } catch (Throwable unused) {
            }
        }
        return jSONObject;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int hashCode4;
        int hashCode5;
        int hashCode6;
        int hashCode7;
        int hashCode8;
        AwemeRawAd awemeRawAd = this.LIZ;
        int i = 0;
        if (awemeRawAd == null) {
            hashCode = 0;
        } else {
            hashCode = awemeRawAd.hashCode();
        }
        int i2 = hashCode * 31;
        String str = this.LIZIZ;
        if (str == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str.hashCode();
        }
        int i3 = (i2 + hashCode2) * 31;
        String str2 = this.LIZJ;
        if (str2 == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = str2.hashCode();
        }
        int i4 = (i3 + hashCode3) * 31;
        String str3 = this.LIZLLL;
        if (str3 == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = str3.hashCode();
        }
        int i5 = (i4 + hashCode4) * 31;
        String str4 = this.LJ;
        if (str4 == null) {
            hashCode5 = 0;
        } else {
            hashCode5 = str4.hashCode();
        }
        int i6 = (i5 + hashCode5) * 31;
        String str5 = this.LJFF;
        if (str5 == null) {
            hashCode6 = 0;
        } else {
            hashCode6 = str5.hashCode();
        }
        int i7 = (i6 + hashCode6) * 31;
        String str6 = this.LJI;
        if (str6 == null) {
            hashCode7 = 0;
        } else {
            hashCode7 = str6.hashCode();
        }
        int i8 = (i7 + hashCode7) * 31;
        boolean z = this.LJII;
        int i9 = 1;
        int i10 = z;
        if (z != 0) {
            i10 = 1;
        }
        int i11 = (((i8 + i10) * 31) + this.LJIIIIZZ) * 31;
        String str7 = this.LJIIIZ;
        if (str7 == null) {
            hashCode8 = 0;
        } else {
            hashCode8 = str7.hashCode();
        }
        int LJ = (C79062V1e.LJ(this.LJIIJ, (i11 + hashCode8) * 31, 31) + this.LJIIJJI) * 31;
        boolean z2 = this.LJIIL;
        int i12 = z2;
        if (z2 != 0) {
            i12 = 1;
        }
        int LJ2 = C79062V1e.LJ(this.LJIILJJIL, JBR.LIZJ(this.LJIILIIL, (LJ + i12) * 31, 31), 31);
        String str8 = this.LJIILL;
        if (str8 != null) {
            i = str8.hashCode();
        }
        int LJ3 = C79062V1e.LJ(this.LJIJI, C79062V1e.LJ(this.LJIJ, (((((LJ2 + i) * 31) + this.LJIILLIIL) * 31) + this.LJIIZILJ) * 31, 31), 31);
        boolean z3 = this.LJIJJ;
        int i13 = z3;
        if (z3 != 0) {
            i13 = 1;
        }
        int i14 = (LJ3 + i13) * 31;
        boolean z4 = this.LJIJJLI;
        int i15 = z4;
        if (z4 != 0) {
            i15 = 1;
        }
        int i16 = (i14 + i15) * 31;
        boolean z5 = this.LJIL;
        int i17 = z5;
        if (z5 != 0) {
            i17 = 1;
        }
        int i18 = (i16 + i17) * 31;
        boolean z6 = this.LJJ;
        int i19 = z6;
        if (z6 != 0) {
            i19 = 1;
        }
        int i20 = (i18 + i19) * 31;
        boolean z7 = this.LJJI;
        int i21 = z7;
        if (z7 != 0) {
            i21 = 1;
        }
        int i22 = (i20 + i21) * 31;
        if (!this.LJJIFFI) {
            i9 = 0;
        }
        return i22 + i9;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AdWebModel(awemeRawAd=");
        sb.append(this.LIZ);
        sb.append(", title=");
        sb.append(this.LIZIZ);
        sb.append(", url=");
        sb.append(this.LIZJ);
        sb.append(", commerceEnterFrom=");
        sb.append(this.LIZLLL);
        sb.append(", refer=");
        sb.append(this.LJ);
        sb.append(", awemeId=");
        sb.append(this.LJFF);
        sb.append(", awemeAuthorUid=");
        sb.append(this.LJI);
        sb.append(", forbidJump=");
        sb.append(this.LJII);
        sb.append(", useWebUrl=");
        sb.append(this.LJIIIIZZ);
        sb.append(", requestId=");
        sb.append(this.LJIIIZ);
        sb.append(", sessionId=");
        sb.append(this.LJIIJ);
        sb.append(", isNineScreen=");
        sb.append(this.LJIIJJI);
        sb.append(", isFromJsb=");
        sb.append(this.LJIIL);
        sb.append(", webInitTime=");
        sb.append(this.LJIILIIL);
        sb.append(", extraInfo=");
        sb.append(this.LJIILJJIL);
        sb.append(", currentUrl=");
        sb.append(this.LJIILL);
        sb.append(", firstPage=");
        sb.append(this.LJIILLIIL);
        sb.append(", preloadStatus=");
        sb.append(this.LJIIZILJ);
        sb.append(", hasAdInfoJson=");
        sb.append(this.LJIJ);
        sb.append(", adInfoJson=");
        sb.append(this.LJIJI);
        sb.append(", shouldClearHistory=");
        sb.append(this.LJIJJ);
        sb.append(", hideNavBar=");
        sb.append(this.LJIJJLI);
        sb.append(", hideTitleBar=");
        sb.append(this.LJIL);
        sb.append(", isPreRender=");
        sb.append(this.LJJ);
        sb.append(", cameraGranted=");
        sb.append(this.LJJI);
        sb.append(", fromAdWebPage=");
        return C08880Wm.LIZJ(sb, this.LJJIFFI, ')');
    }

    @Override // X.InterfaceC59138NIw
    public final int LIZLLL() {
        return this.LJIIIIZZ;
    }

    @Override // X.InterfaceC59138NIw
    public final int LJI() {
        return this.LJIILLIIL;
    }

    @Override // X.InterfaceC59138NIw
    public final String LJII() {
        return this.LIZJ;
    }

    @Override // X.InterfaceC59138NIw
    public final int LJIIIIZZ() {
        return this.LJIIZILJ;
    }

    @Override // X.InterfaceC59138NIw
    public final boolean LJIILJJIL() {
        return this.LJIIL;
    }

    public C59222NMc(int i) {
        long currentTimeMillis = System.currentTimeMillis();
        this.LIZ = null;
        this.LIZIZ = null;
        this.LIZJ = null;
        this.LIZLLL = null;
        this.LJ = null;
        this.LJFF = null;
        this.LJI = null;
        this.LJII = false;
        this.LJIIIIZZ = 0;
        this.LJIIIZ = null;
        this.LJIIJ = CardStruct.IStatusCode.DEFAULT;
        this.LJIIJJI = 0;
        this.LJIIL = false;
        this.LJIILIIL = currentTimeMillis;
        this.LJIILJJIL = "";
        this.LJIILL = null;
        this.LJIILLIIL = 1;
        this.LJIIZILJ = -1;
        this.LJIJ = "";
        this.LJIJI = "";
        this.LJIJJ = true;
        this.LJIJJLI = false;
        this.LJIL = false;
        this.LJJ = false;
        this.LJJI = false;
        this.LJJIFFI = false;
    }
}
