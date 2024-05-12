package X;

import android.content.Context;
import com.ss.android.ugc.aweme.commercialize.model.AdDislikeInfo;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;

/* loaded from: classes11.dex */
public final class NFX implements InterfaceC59967NgB {
    public final Context LIZ;
    public final String LIZIZ;
    public final String LIZJ;
    public final String LIZLLL;
    public final String LJ;
    public final String LJFF;
    public final AdDislikeInfo LJI;
    public final /* synthetic */ InterfaceC65784Pro<C76800UCe> LJII;

    @Override // X.InterfaceC59967NgB
    public final InterfaceC42995Gu7 LIZ() {
        return new NFY(this.LJII);
    }

    @Override // X.InterfaceC59966NgA
    public final Context LIZIZ() {
        return this.LIZ;
    }

    @Override // X.InterfaceC59967NgB
    public final AdDislikeInfo LIZJ() {
        return this.LJI;
    }

    @Override // X.InterfaceC59966NgA
    public final String LIZLLL() {
        return this.LIZJ;
    }

    @Override // X.InterfaceC59966NgA
    public final String LJIJI() {
        return this.LJ;
    }

    @Override // X.InterfaceC59966NgA
    public final String getAid() {
        return this.LIZIZ;
    }

    @Override // X.InterfaceC59966NgA
    public final String getLogExtra() {
        return this.LJFF;
    }

    @Override // X.InterfaceC59966NgA
    public final String getRoomId() {
        return this.LIZLLL;
    }

    public NFX(Context context, Aweme aweme, InterfaceC65784Pro interfaceC65784Pro) {
        String str;
        Long l;
        String str2;
        String str3;
        AwemeRawAd awemeRawAd;
        AwemeRawAd awemeRawAd2;
        AwemeRawAd awemeRawAd3;
        AwemeRawAd awemeRawAd4;
        this.LJII = interfaceC65784Pro;
        this.LIZ = context;
        AdDislikeInfo adDislikeInfo = null;
        if (aweme != null) {
            str = aweme.getAid();
        } else {
            str = null;
        }
        this.LIZIZ = str;
        if (aweme != null && (awemeRawAd4 = aweme.getAwemeRawAd()) != null) {
            l = awemeRawAd4.getAdId();
        } else {
            l = null;
        }
        this.LIZJ = String.valueOf(l);
        this.LIZLLL = C59406NTe.LJI(aweme);
        if (aweme != null && (awemeRawAd3 = aweme.getAwemeRawAd()) != null) {
            str2 = awemeRawAd3.getCreativeIdStr();
        } else {
            str2 = null;
        }
        this.LJ = str2;
        if (aweme != null && (awemeRawAd2 = aweme.getAwemeRawAd()) != null) {
            str3 = awemeRawAd2.getLogExtra();
        } else {
            str3 = null;
        }
        this.LJFF = str3;
        if (aweme != null && (awemeRawAd = aweme.getAwemeRawAd()) != null) {
            adDislikeInfo = awemeRawAd.getDislikeInfo();
        }
        this.LJI = adDislikeInfo;
    }
}
