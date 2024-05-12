package X;

import android.os.SystemClock;
import com.ss.android.ugc.aweme.ecommerce.base.pdpv2.vh.desc.ProductDescVideoBrickVH;
import kotlin.jvm.internal.AqS170S0100000_4;

/* renamed from: X.AtP, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C27663AtP implements InterfaceC73050Sli {
    public final /* synthetic */ ProductDescVideoBrickVH LIZ;

    @Override // X.InterfaceC73050Sli
    public final void LIZ() {
        ProductDescVideoBrickVH productDescVideoBrickVH = this.LIZ;
        productDescVideoBrickVH.LJLLL = true;
        if (productDescVideoBrickVH.LJLLJ == 0) {
            productDescVideoBrickVH.LJLLJ = SystemClock.elapsedRealtime();
            InterfaceC71003Rtn interfaceC71003Rtn = (InterfaceC71003Rtn) this.LIZ.LJLJLJ.getValue();
            if (interfaceC71003Rtn != null) {
                C78946Uyc.LJJII(interfaceC71003Rtn, new C70955Rt1(), new AqS170S0100000_4(this.LIZ, 319));
            }
        }
    }

    public C27663AtP(ProductDescVideoBrickVH productDescVideoBrickVH) {
        this.LIZ = productDescVideoBrickVH;
    }
}
