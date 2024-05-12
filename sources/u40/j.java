package u40;

import X.AbstractC81613W1h;
import X.C04650Gf;
import X.C0GQ;
import X.C0GY;
import X.C29721Eq;
import X.C81614W1i;
import X.InterfaceC04760Gq;
import android.util.JsonReader;
import java.io.StringReader;
import java.util.concurrent.Callable;

/* loaded from: classes15.dex */
public class j extends AbstractC81613W1h {
    /* JADX WARN: Type inference failed for: r1v0, types: [X.0Gq, X.1Eq] */
    @Override // X.AbstractC81613W1h
    public final C29721Eq LIZ(final String str, C81614W1i c81614W1i) {
        try {
            ?? r1 = new InterfaceC04760Gq<C0GY>(c81614W1i) { // from class: X.1Eq
                public final C0GX LIZ;

                {
                    this.LIZ = c81614W1i;
                }

                @Override // X.InterfaceC04760Gq
                public final void onResult(C0GY c0gy) {
                    this.LIZ.LIZ(c0gy);
                }
            };
            C04650Gf.LIZ(null, new Callable<C0GQ<C0GY>>() { // from class: X.0Gk
                public final /* synthetic */ String LJLILLLLZI = null;

                @Override // java.util.concurrent.Callable
                public final C0GQ<C0GY> call() {
                    String str2 = str;
                    return C04650Gf.LJIIIIZZ(new JsonReader(new StringReader(str2)), this.LJLILLLLZI);
                }
            }).LIZIZ(r1);
            return r1;
        } catch (Exception unused) {
            return null;
        }
    }
}
