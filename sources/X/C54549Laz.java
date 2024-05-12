package X;

import android.content.Context;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import kotlin.jvm.internal.o;

/* renamed from: X.Laz, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C54549Laz implements FWB<Object> {
    @Override // X.FWB
    public final void invoke(Object... objArr) {
        try {
            OJY LJIL = C73340SqO.LJIL();
            Context LIZIZ = EF7.LIZIZ();
            Object obj = objArr[0];
            o.LJII(obj, "null cannot be cast to non-null type com.ss.android.ugc.aweme.feed.model.AwemeRawAd");
            Object obj2 = objArr[1];
            o.LJII(obj2, "null cannot be cast to non-null type kotlin.String");
            LJIL.getClass();
            OJY.LJIIJJI(LIZIZ, (AwemeRawAd) obj, (String) obj2);
        } catch (Exception unused) {
        }
    }
}
