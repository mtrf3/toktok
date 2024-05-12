package X;

import android.graphics.drawable.Animatable;
import android.view.View;

/* loaded from: classes13.dex */
public final class S5L extends AbstractC72439Sbr {
    public final /* synthetic */ S5M LJLIL;
    public final /* synthetic */ long LJLILLLLZI;

    public S5L(S5M s5m, long j) {
        this.LJLIL = s5m;
        this.LJLILLLLZI = j;
    }

    @Override // X.InterfaceC70769Rq1
    public final void s2(android.net.Uri uri, View view, Throwable th) {
        C188727au c188727au = new C188727au();
        c188727au.LJIIIZ(WM7.SCENE_SERVICE, "AdPlp");
        c188727au.LJIIIZ("pid", this.LJLIL.LJLIL.getProductId());
        FMX.LJIIL("product_tile_product_load_fail", c188727au.LIZ);
    }

    @Override // X.InterfaceC70769Rq1
    public final void U0(android.net.Uri uri, View view, C2047581v c2047581v, Animatable animatable) {
        this.LJLIL.LJLJJL.LIZ();
        C188727au c188727au = new C188727au();
        c188727au.LJIIIZ(WM7.SCENE_SERVICE, "AdPlp");
        c188727au.LJIIIZ("pid", this.LJLIL.LJLIL.getProductId());
        c188727au.LJ(System.currentTimeMillis() - this.LJLILLLLZI, "loadtime");
        c188727au.LJIIIZ("source", "memory");
        FMX.LJIIL("product_tile_product_load_success", c188727au.LIZ);
    }
}
