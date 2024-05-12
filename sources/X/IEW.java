package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.util.LinkedHashMap;

/* loaded from: classes9.dex */
public final class IEW {
    public static final java.util.Map<Integer, Integer> LIZ = new LinkedHashMap();
    public static int LIZIZ = 1;
    public static int LIZJ = 1;
    public static boolean LIZLLL;
    public static boolean LJ;
    public static boolean LJFF;

    public static int LIZ() {
        Integer num = (Integer) ((LinkedHashMap) LIZ).get(Integer.valueOf(LIZIZ));
        if (num != null) {
            return num.intValue();
        }
        return 0;
    }

    public static boolean LIZIZ(Aweme aweme) {
        AwemeRawAd awemeRawAd;
        java.util.Map<String, CardStruct> cardInfos;
        CardStruct cardStruct;
        boolean z = false;
        if (aweme != null && aweme.isAd() && (awemeRawAd = aweme.getAwemeRawAd()) != null && (cardInfos = awemeRawAd.getCardInfos()) != null && (cardStruct = cardInfos.get("5")) != null && cardStruct.getCardType() == 15) {
            z = true;
        }
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("hasSubVideo: status = ");
        LIZ2.append(z);
        IE0.LIZ(X1D.LIZIZ(LIZ2));
        return z;
    }
}
