package X;

import Y.ARunnableS48S0100000_12;
import com.ss.android.ugc.aweme.ecommerce.core.router.EcomSchemaFallbackInterceptor;

/* renamed from: X.RrK, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C70850RrK implements F67 {
    public final /* synthetic */ EcomSchemaFallbackInterceptor LJLIL;

    public C70850RrK(EcomSchemaFallbackInterceptor ecomSchemaFallbackInterceptor) {
        this.LJLIL = ecomSchemaFallbackInterceptor;
    }

    @Override // X.F67
    public final void onChanged() {
        C38995FSd.LIZJ().execute(new ARunnableS48S0100000_12(this.LJLIL, 78));
    }
}
