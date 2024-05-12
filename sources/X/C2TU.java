package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import kotlin.jvm.internal.o;

/* renamed from: X.2TU, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C2TU {
    public static final /* synthetic */ int LIZ = 0;

    public static void LIZ(Aweme aweme, String str) {
        String str2;
        o.LJIIIZ(aweme, "aweme");
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append(str);
        LIZ2.append(" : aid=  ");
        LIZ2.append(aweme.getAid());
        LIZ2.append(", isad= ");
        LIZ2.append(aweme.isAd());
        LIZ2.append(", desc= ");
        LIZ2.append(aweme.getDesc());
        LIZ2.append(", awemeRawAd= ");
        AwemeRawAd awemeRawAd = aweme.getAwemeRawAd();
        if (awemeRawAd != null) {
            StringBuilder LIZ3 = X1D.LIZ();
            LIZ3.append("{ adid = ");
            LIZ3.append(awemeRawAd.getAdId());
            LIZ3.append(", cid = ");
            LIZ3.append(awemeRawAd.getCreativeId());
            LIZ3.append(", title = ");
            LIZ3.append(awemeRawAd.getTitle());
            LIZ3.append(", buttonText = ");
            LIZ3.append(awemeRawAd.getButtonText());
            LIZ3.append(" }");
            str2 = X1D.LIZIZ(LIZ3);
        } else {
            str2 = "";
        }
        LIZ2.append(str2);
        LIZ2.append(", shareUrl = ");
        LIZ2.append(aweme.getShareUrl());
        C36922EeM.LIZLLL(3, "MaskDebugLog", X1D.LIZIZ(LIZ2));
    }
}
