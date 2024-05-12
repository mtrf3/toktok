package X;

import android.os.Bundle;
import com.bytedance.ies.ugc.aweme.network.IRetrofitFactory;
import kotlin.jvm.internal.o;

/* loaded from: classes16.dex */
public final class X8K extends X8P<X8M<Object, ?>> {
    public static boolean LJLJLLL;
    public static final C62822Ol8 LJLL = C221108m2.LIZIZ(C58228MtE.LJLIL);
    public final IRetrofitFactory LJLJLJ;

    @Override // X.X8P
    public final Object LIZLLL() {
        return ((X8M) this.LJLJJI).preload(this.LJLJJLL, new X8L(this));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public X8K(X8M<Object, ?> x8m, X8X x8x, Bundle bundle, IRetrofitFactory retrofitFactory) {
        super(x8m, x8x, bundle);
        o.LJIIJ(retrofitFactory, "retrofitFactory");
        this.LJLJLJ = retrofitFactory;
    }
}
