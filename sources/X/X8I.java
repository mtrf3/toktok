package X;

import android.os.Bundle;
import com.bytedance.ies.ugc.aweme.network.IRetrofitFactory;
import kotlin.jvm.internal.o;

/* loaded from: classes16.dex */
public final class X8I implements X8J {
    public IRetrofitFactory LIZ;

    @Override // X.X8J
    public final X8P<X8D> LIZ(X8D x8d, X8X x8x, Bundle bundle) {
        if (x8d instanceof X8M) {
            if (this.LIZ != null) {
                X8M x8m = (X8M) x8d;
                IRetrofitFactory iRetrofitFactory = this.LIZ;
                if (iRetrofitFactory != null) {
                    return new X8K(x8m, x8x, bundle, iRetrofitFactory);
                }
                o.LJIIZILJ();
                throw null;
            }
            return new X8C(x8d, x8x, bundle);
        }
        if (x8d instanceof X88) {
            return new X85((X88) x8d, x8x, bundle);
        }
        return new X8C(x8d, x8x, bundle);
    }
}
