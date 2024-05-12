package X;

import com.ss.android.ugc.aweme.commercialize.model.OmVast;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AqS70S0000000_10;
import kotlin.jvm.internal.o;

/* renamed from: X.NNf, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C59251NNf {
    public static final C59256NNk LIZJ(Aweme aweme) {
        return LIZLLL(aweme, "icon");
    }

    public static final boolean LIZ(Aweme aweme, boolean z) {
        AwemeRawAd awemeRawAd;
        OmVast omVast;
        if (aweme != null && aweme.isAd() && (awemeRawAd = aweme.getAwemeRawAd()) != null && (omVast = awemeRawAd.getOmVast()) != null && omVast.loaded == z) {
            return true;
        }
        return false;
    }

    public static final boolean LIZIZ(int i, Aweme aweme) {
        AwemeRawAd awemeRawAd;
        OmVast omVast;
        if (aweme != null && aweme.isAd() && (awemeRawAd = aweme.getAwemeRawAd()) != null && (omVast = awemeRawAd.getOmVast()) != null && omVast.providerType == i) {
            return true;
        }
        return false;
    }

    public static final C59256NNk LIZLLL(Aweme aweme, String str) {
        InterfaceC1039145z interfaceC1039145z;
        AwemeRawAd awemeRawAd;
        OmVast omVast;
        C59255NNj c59255NNj;
        List<C59259NNn> list;
        Object obj = null;
        if (aweme != null && (awemeRawAd = aweme.getAwemeRawAd()) != null && (omVast = awemeRawAd.getOmVast()) != null && (c59255NNj = omVast.vast) != null && (list = c59255NNj.creativeList) != null) {
            interfaceC1039145z = OJ4.LJJJJJL(ORZ.LJLIIIL(list), new AqS70S0000000_10(1));
        } else {
            interfaceC1039145z = OJA.LIZ;
        }
        Iterator it = interfaceC1039145z.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            if (o.LJ(((C59256NNk) next).program, str)) {
                obj = next;
                break;
            }
        }
        return (C59256NNk) obj;
    }

    public static final boolean LJ(C57127MbT c57127MbT, Aweme aweme) {
        C59256NNk LIZJ;
        java.util.Set<String> set;
        String str;
        if (LIZIZ(3, aweme) && (LIZJ = LIZJ(aweme)) != null && (set = LIZJ.staticResource) != null) {
            Iterator<String> it = set.iterator();
            while (true) {
                if (it.hasNext()) {
                    str = it.next();
                    String it2 = str;
                    o.LJIIIIZZ(it2, "it");
                    if (it2.length() > 0) {
                        break;
                    }
                } else {
                    str = null;
                    break;
                }
            }
            String str2 = str;
            if (str2 != null) {
                W5F LJIIIIZZ = W5U.LJIIIIZZ(str2);
                LJIIIIZZ.LJJIIJ = c57127MbT;
                C16880lQ.LLJJJ(LJIIIIZZ);
                return true;
            }
        }
        return false;
    }
}
