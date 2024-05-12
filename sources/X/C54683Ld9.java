package X;

import android.content.Context;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;

/* renamed from: X.Ld9, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C54683Ld9 implements FWB<Object> {
    @Override // X.FWB
    public final void invoke(Object... objArr) {
        AwemeRawAd awemeRawAd;
        try {
            Object obj = objArr[0];
            String str = null;
            if (obj instanceof AwemeRawAd) {
                awemeRawAd = (AwemeRawAd) obj;
            } else {
                awemeRawAd = null;
            }
            Object obj2 = objArr[1];
            if (obj2 instanceof String) {
                str = (String) obj2;
            }
            if (awemeRawAd != null && str != null) {
                OJY LJIL = C73340SqO.LJIL();
                Context LIZIZ = EF7.LIZIZ();
                LJIL.getClass();
                OJY.LJIIJJI(LIZIZ, awemeRawAd, str);
            }
        } catch (Exception unused) {
        }
    }
}
