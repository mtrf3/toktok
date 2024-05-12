package X;

import com.ss.android.ugc.aweme.ad.FeedAdServiceImpl;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import kotlin.jvm.internal.o;

/* renamed from: X.OBv, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C61503OBv {
    public static final /* synthetic */ int LIZ = 0;

    public static void LIZ(EnumC61504OBw label) {
        AwemeRawAd awemeRawAd;
        o.LJIIIZ(label, "label");
        Aweme aweme = OL1.LIZIZ;
        if (aweme == null || (awemeRawAd = aweme.getAwemeRawAd()) == null) {
            return;
        }
        try {
            FeedAdServiceImpl.LJJIJLIJ().LJJIJIIJIL(label.getValue(), awemeRawAd, C113554cx.LJJJLIIL());
        } catch (Throwable unused) {
        }
    }
}
