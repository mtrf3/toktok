package X;

import android.content.Context;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;

/* loaded from: classes5.dex */
public final class AK1 implements AK0 {
    public final Context LIZ;
    public final String LIZIZ;
    public final String LIZJ;
    public final String LIZLLL;
    public final String LJ;
    public final String LJFF;
    public final String LJI;
    public final Integer LJII;

    @Override // X.AK0
    public final Integer LIZ() {
        return this.LJII;
    }

    @Override // X.AK0
    public final String LIZIZ() {
        return this.LJI;
    }

    @Override // X.AK0
    public final String LIZJ() {
        return this.LIZLLL;
    }

    @Override // X.AK0
    public final String getAid() {
        return this.LIZIZ;
    }

    @Override // X.AK0
    public final String getCid() {
        return this.LJ;
    }

    @Override // X.AK0
    public final Context getContext() {
        return this.LIZ;
    }

    @Override // X.AK0
    public final String getLogExtra() {
        return this.LJFF;
    }

    @Override // X.AK0
    public final String getRoomId() {
        return this.LIZJ;
    }

    public AK1(Context context, Aweme aweme, String str) {
        String str2;
        String str3;
        String str4;
        String str5;
        AwemeRawAd awemeRawAd;
        AwemeRawAd awemeRawAd2;
        AwemeRawAd awemeRawAd3;
        Long creativeId;
        this.LIZ = context;
        Integer num = null;
        if (aweme != null) {
            str2 = aweme.getAid();
        } else {
            str2 = null;
        }
        this.LIZIZ = str2;
        this.LIZJ = C59406NTe.LJI(aweme);
        if (aweme != null) {
            str3 = aweme.getAuthorUid();
        } else {
            str3 = null;
        }
        this.LIZLLL = str3;
        if (aweme != null && (awemeRawAd3 = aweme.getAwemeRawAd()) != null && (creativeId = awemeRawAd3.getCreativeId()) != null) {
            str4 = String.valueOf(creativeId);
        } else {
            str4 = null;
        }
        this.LJ = str4;
        if (aweme != null && (awemeRawAd2 = aweme.getAwemeRawAd()) != null) {
            str5 = awemeRawAd2.getLogExtra();
        } else {
            str5 = null;
        }
        this.LJFF = str5;
        this.LJI = str;
        if (aweme != null && (awemeRawAd = aweme.getAwemeRawAd()) != null) {
            num = Integer.valueOf(awemeRawAd.getReportAdType());
        }
        this.LJII = num;
    }
}
