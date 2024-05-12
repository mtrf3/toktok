package X;

import com.appsflyer.attribution.AppsFlyerRequestListener;
import kotlin.jvm.internal.o;

/* loaded from: classes12.dex */
public final class Q9B implements AppsFlyerRequestListener {
    public final /* synthetic */ Q9C LIZ;

    @Override // com.appsflyer.attribution.AppsFlyerRequestListener
    public final void onSuccess() {
        Q9C q9c = this.LIZ;
        if (q9c == null) {
            return;
        }
        q9c.onSuccess();
    }

    public Q9B(Q9C q9c) {
        this.LIZ = q9c;
    }

    @Override // com.appsflyer.attribution.AppsFlyerRequestListener
    public final void onError(int i, String p1) {
        o.LJIIIZ(p1, "p1");
        Q9C q9c = this.LIZ;
        if (q9c == null) {
            return;
        }
        q9c.onError(p1);
    }
}
